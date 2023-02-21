public class Palindrom {
    public static boolean ispalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
    public static boolean ispalindrome2(String str){
        String reverese="";
        for(int i=str.length()-1;i>=0;i--){
            reverese+=str.charAt(i);
        }
        if(str.equals(reverese)){
            return true;
        } else{
            return false;
        }

    }
    public static void main(String[]args){

        System.out.println(ispalindrome("asa"));
    }
}
