import java.io.*;
import java.util.*;

class UserMainCode {
    public int getCodeThroughStrings(String input1) {
        // Step 1: Split the string into words based on spaces
        // We use trim() to remove leading/trailing spaces and \\s+ for multiple spaces
        String[] words = input1.trim().split("\\s+");
        
        int totalLength = 0;
        
        // Step 2: Sum the lengths of all words
        for (String word : words) {
            totalLength += word.length();
        }
        
        // Step 3: Reduce the totalLength to a single digit (Digital Root)
        // Logic: if sum is 24 -> 2+4 = 6.
        if (totalLength == 0) return 0;
        
        int result = totalLength % 9;
        if (result == 0) {
            return 9;
        } else {
            return result;
        }
    }
}