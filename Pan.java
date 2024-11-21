import java.util.*;

class Pan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input to check weather it is pangram or not");
        String input = scanner.nextLine();
        if(isPangram(input)){
            System.out.println(input+"is a pangram string");
        }
        else
        {
            System.out.println(input+"is not a pangram string");
        }
    }
    public static boolean isPangram(String str) {
        int left = 0,right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}