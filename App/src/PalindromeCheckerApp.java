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

        scanner.close();
    }
}