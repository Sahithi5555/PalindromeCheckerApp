public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 - Check Palindrome Number
        int number = 121;
        int originalNumber = number;
        int reverseNumber = 0;

        while(number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }

        if(originalNumber == reverseNumber) {
            System.out.println("UC1: Number is Palindrome");
        } else {
            System.out.println("UC1: Number is Not Palindrome");
        }


        // UC2 - Hardcoded String Palindrome
        String text = "madam";
        String reversedText = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
        }

        if(text.equals(reversedText)) {
            System.out.println("UC2: String is Palindrome");
        } else {
            System.out.println("UC2: String is Not Palindrome");
        }


        // UC3 - Reverse String and Check Palindrome
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        String reversedInput = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reversedInput = reversedInput + input.charAt(i);
        }

        if(input.equals(reversedInput)) {
            System.out.println("UC3: Input String is Palindrome");
        } else {
            System.out.println("UC3: Input String is Not Palindrome");
        }
// ---------------- UC4 ----------------
        // Character array two-pointer palindrome check

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4: String is palindrome using char array");
        } else {
            System.out.println("UC4: String is not palindrome using char array");
        }

        // ---------------- UC5 ----------------
// Stack-Based Palindrome Checker

        System.out.println("UC5: Stack Based Palindrome Check");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversedStack = "";

        while (!stack.isEmpty()) {
            reversedStack = reversedStack + stack.pop();
        }

        if (input.equals(reversedStack)) {
            System.out.println("UC5: String is palindrome using stack");
        } else {
            System.out.println("UC5: String is not palindrome using stack");
        }

        // ---------------- UC6 ----------------
// Queue + Stack Based Palindrome Check

        System.out.println("UC6: Queue + Stack Palindrome Check");

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack2 = new Stack<>();

// insert characters into queue and stack
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
            stack2.push(input.charAt(i));
        }

        boolean isPalindromeQS = true;

// compare dequeue vs pop
        while (!queue.isEmpty()) {

            if (queue.remove() != stack2.pop()) {
                isPalindromeQS = false;
                break;
            }
        }

        if (isPalindromeQS) {
            System.out.println("UC6: String is palindrome using Queue and Stack");
        } else {
            System.out.println("UC6: String is not palindrome using Queue and Stack");
        }

        scanner.close();
    }
}