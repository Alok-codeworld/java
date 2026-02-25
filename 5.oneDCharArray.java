package arry;

class oneDCharArray {

    public static void main(String[] args) {
        char[] letters;            // Declaration
        letters = new char[5];     // Allocation (5 elements)

        // char[] letters = new char[5];      // Declaring and Initializing at same time.

        // char[] letters = {'J', 'a', 'v', 'a', '!'};  // Declaring and Assigning values at same time.


        // Assigning values
        letters[0] = 'J';
        letters[1] = 'a';
        letters[2] = 'v';
        letters[3] = 'a';
        letters[4] = '!';

        System.out.println("Accessing Through Index:");
        System.out.println(letters[2]);  // Output: v
        System.out.println("=====================");


        System.out.println("Accessing Through For-Loop:");
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Element at index " + i + " is " + letters[i]);
        }
        System.out.println("=====================");


        System.out.println("Accessing Through Enhanced For-Loop:");
        for (char ch : letters) {
            System.out.println(ch);
        }
        System.out.println("=====================");


        System.out.println("Accessing Array of char values (vowels):");
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        for (char v : vowels) {
            System.out.println(v);
        }
        System.out.println("=====================");


        /*System.out.println(" ====== Converting String to Char Array =======");
        String name = "Java";
        char[] chars = name.toCharArray();

        
        for(int i=0;i<chars.length; i++){
            System.out.println("Element at index " + i + " is " + letters[i]);
        }

        //  Accessing Using Enchanced For Loop
        for (char c : chars) {
            System.out.println(c);
        }
        System.out.println("=====================");


        System.out.println("======== Changing Values in Char Array ========");
        vowels[1] = 'E'; // Change 'e' → 'E'

        System.out.println("Updated Vowels Array:");
        for (char v : vowels) {
            System.out.println(v);
        }*/
    }
}
    
    
