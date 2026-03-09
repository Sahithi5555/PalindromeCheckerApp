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

        // ---------------- UC7 ----------------
// Deque-Based Optimized Palindrome Checker

        System.out.println("UC7: Deque Based Palindrome Check");

        Deque<Character> deque = new LinkedList<>();

// insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindromeDeque = true;

// compare front and rear
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindromeDeque = false;
                break;
            }
        }

        if (isPalindromeDeque) {
            System.out.println("UC7: String is palindrome using Deque");
        } else {
            System.out.println("UC7: String is not palindrome using Deque");
        }

        // ---------------- UC8 ----------------
// Linked List Based Palindrome Checker

        System.out.println("UC8: Linked List Palindrome Check");

        LinkedList<Character> list = new LinkedList<>();

// convert string to linked list
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }

        int startLL = 0;
        int endLL = list.size() - 1;
        boolean isPalindromeLL = true;

// compare start and end nodes
        while (startLL < endLL) {

            if (!list.get(startLL).equals(list.get(endLL))) {
                isPalindromeLL = false;
                break;
            }

            startLL++;
            endLL--;
        }

        if (isPalindromeLL) {
            System.out.println("UC8: String is palindrome using Linked List");
        } else {
            System.out.println("UC8: String is not palindrome using Linked List");
        }

        // ---------------- UC9 ----------------
// Recursive Palindrome Checker

        System.out.println("UC9: Recursive Palindrome Check");

        boolean resultRecursion = isPalindromeRecursive(input, 0, input.length() - 1);

        if (resultRecursion) {
            System.out.println("UC9: String is palindrome using recursion");
        } else {
            System.out.println("UC9: String is not palindrome using recursion");
        }
        // ---------------- UC10 ----------------
// Case-Insensitive & Space-Ignored Palindrome

        System.out.println("UC10: Case-Insensitive & Space-Ignored Palindrome");

// normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversedNormalized = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversedNormalized = reversedNormalized + normalized.charAt(i);
        }

        if (normalized.equals(reversedNormalized)) {
            System.out.println("UC10: String is palindrome ignoring spaces and case");
        } else {
            System.out.println("UC10: String is not palindrome ignoring spaces and case");
        }

        // ---------------- UC11 ----------------
// Object-Oriented Palindrome Service

        System.out.println("UC11: Object-Oriented Palindrome Service");

        PalindromeService service = new PalindromeService();

        if (service.checkPalindrome(input)) {
            System.out.println("UC11: String is palindrome using OOP service");
        } else {
            System.out.println("UC11: String is not palindrome using OOP service");
        }

        // ---------------- UC12 ----------------
// Strategy Pattern for Palindrome Algorithms

        System.out.println("UC12: Strategy Pattern Palindrome Check");

        PalindromeStrategy strategy = new StackStrategy();   // choose algorithm

        if (strategy.check(input)) {
            System.out.println("UC12: String is palindrome using Strategy Pattern");
        } else {
            System.out.println("UC12: String is not palindrome using Strategy Pattern");
        }
// ---------------- UC13 ----------------
// Performance Comparison of Palindrome Algorithms

        System.out.println("UC13: Performance Comparison");

        long startTime = System.nanoTime();

        boolean stackResult = new StackStrategy().check(input);

        long endTime = System.nanoTime();

        long stackTime = endTime - startTime;

        startTime = System.nanoTime();

        boolean dequeResult = new DequeStrategy().check(input);

        endTime = System.nanoTime();

        long dequeTime = endTime - startTime;

        System.out.println("Stack Strategy Result: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Strategy Result: " + dequeResult + " | Time: " + dequeTime + " ns");

        scanner.close();
    }
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
class PalindromeService {

    public boolean checkPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }
}
interface PalindromeStrategy {
    boolean check(String str);
}
class StackStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return str.equals(reversed);
    }
}
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
