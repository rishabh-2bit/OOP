/*
 * Features to Implement:
 * Data Partitioning: Use consistent hashing to distribute data across multiple
 * cache nodes.
 * Fault Tolerance: Ensure data redistribution when a node fails without losing
 * information.
 * Read and Write Operations: Provide APIs for put(key, value) and get(key)
 * operations.
 * Concurrency: Ensure thread-safe operations for the cache.
 * Scalability: Allow dynamic addition and removal of nodes without affecting
 * performance.
 * Constraints:
 * Implement the solution in a single Java class.
 * Avoid using third-party libraries for consistent hashing.
 * Deliverables:
 * A working Java implementation of the distributed cache.
 * An explanation of design decisions, including trade-offs.
 */
package DistributedSystem;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class DistributedCacheSystem {

    private final TreeMap<Integer, String> nodeRing = new TreeMap<>();
    private final Map<String, Map<String, String>> nodeData = new ConcurrentHashMap<>();
    private final int VIRTUAL_NODE_COUNT = 3;

    // Add a node to the distributed cache
    public synchronized void addNode(String nodeName) {
        for (int i = 0; i < VIRTUAL_NODE_COUNT; i++) {
            int hash = hash(nodeName + i);
            System.out.println(hash);
            nodeRing.put(hash, nodeName);
        }
        nodeData.put(nodeName, new ConcurrentHashMap<>());
        redistributeData();
    }

    // Remove a node from the distributed cache
    public synchronized void removeNode(String nodeName) {
        for (int i = 0; i < VIRTUAL_NODE_COUNT; i++) {
            int hash = hash(nodeName + i);
            System.out.println(hash);
            nodeRing.remove(hash);
        }
        Map<String, String> removedNodeData = nodeData.remove(nodeName);
        if (removedNodeData != null) {
            for (Map.Entry<String, String> entry : removedNodeData.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    // Put a key-value pair in the cache
    public void put(String key, String value) {
        String node = getNode(key);
        nodeData.get(node).put(key, value);
    }

    // Get a value by key from the cache
    public String get(String key) {
        String node = getNode(key);
        return nodeData.get(node).get(key);
    }

    // Hash function (consistent hashing without third-party libraries)
    private int hash(String key) {
        return key.hashCode() & 0x7fffffff; // Non-negative hash
    }

    // Find the node responsible for a given key
    private String getNode(String key) {
        int hash = hash(key);
        Map.Entry<Integer, String> entry = nodeRing.ceilingEntry(hash);
        if (entry == null) {
            entry = nodeRing.firstEntry();
        }
        return entry.getValue();
    }

    // Redistribute data during node addition or removal
    private void redistributeData() {
        Map<String, Map<String, String>> newNodeData = new ConcurrentHashMap<>();
        for (String node : nodeData.keySet()) {
            newNodeData.put(node, new ConcurrentHashMap<>());
        }

        for (Map<String, String> data : nodeData.values()) {
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String node = getNode(key);
                newNodeData.get(node).put(key, value);
            }
        }
        nodeData.clear();
        nodeData.putAll(newNodeData);
    }

    public static void main(String[] args) {
        DistributedCacheSystem cache = new DistributedCacheSystem();

        cache.addNode("Node1");
        cache.addNode("Node2");
        cache.addNode("Node3");

        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");

        System.out.println("Get key1: " + cache.get("key1"));
        System.out.println("Get key2: " + cache.get("key2"));
        System.out.println("Get key3: " + cache.get("key3"));

        cache.removeNode("Node2");
        System.out.println("After removing Node2, Get key1: " + cache.get("key1"));
        System.out.println("After removing Node2, Get key2: " + cache.get("key2"));
        System.out.println("After removing Node2, Get key3: " + cache.get("key3"));
    }
}

// public class VisionApiExample {

// public static void main(String[] args) throws Exception {

// // Path to the image file (use an absolute path or a relative one)

// String imagePath = "path/to/your/image.jpg";

// GOOGLE_APPLICATION_CREDENTIALS environment variable to the path of your service account key

// GOOGLE_APPLICATION_CREDENTIALS="path/to/your/service-account-file.json"

// // Call the Vision API to analyze the image

// analyzeImage(imagePath);

// }

// public static void analyzeImage(String imagePath) throws IOException {

// // Initialize ImageAnnotatorClient

// try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {

// // Read the image file into a byte array

// ByteString imgBytes = ByteString.readFrom(new FileInputStream(imagePath));

// // Build the image object

// Image img = Image.newBuilder().setContent(imgBytes).build();



// // Build the request with the desired feature (LABEL_DETECTION)

// Feature feature = Feature.newBuilder().setType(Feature.Type.LABEL_DETECTION).build();

// AnnotateImageRequest request = AnnotateImageRequest.newBuilder()

// .addFeatures(feature)

// .setImage(img)

// .build();

// // Send the request to the Vision API

// List<AnnotateImageResponse> responses = vision.batchAnnotateImages(List.of(request)).getResponsesList();

// // Handle the response

// for (AnnotateImageResponse response : responses) {

// if (response.hasError()) {

// System.out.printf("Error: %s%n", response.getError().getMessage());

// return;

// }

// // Print out the detected labels

// for (EntityAnnotation annotation : response.getLabelAnnotationsList()) {

// System.out.printf("Label: %s (Confidence: %.2f)%n", annotation.getDescription(