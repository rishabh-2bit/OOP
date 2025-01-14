package Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatingCharInString {
    static char nonRepeatingChar(String s) {
        //brute method

        // int n = s.length();
        // for (int i = 0; i < n; ++i) {
        //     boolean first = false;
        //     for (int j = 0; j < n; ++j) {
        //         if (i != j && s.charAt(i) == s.charAt(j)) {
        //             first = true;
        //             break;
        //         }
        //     }
        //     if (first == false)
        //         return s.charAt(i);
        // }

        // return 'n';

        //Using lambda and stream

        Optional<Character> firstNonRepeatingChar = s.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap<Character, Integer>::new, (map, c) -> map.put(c, map.getOrDefault(c, 0) + 1), Map::putAll)
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();
        return firstNonRepeatingChar.get();
    }

    public static void main(String[] s){
        String st = "swiss";
        System.out.println(nonRepeatingChar(st));
    }
    
}
// https://api.artic.edu/api/v1/artworks

// https://api.artic.edu/api/v1/artworks

// https://api.artic.edu/api/v1/artworks

// https://finalspaceapi.com/api/v0/episode/
