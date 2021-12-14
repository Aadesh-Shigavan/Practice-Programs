public class ReverseString {
    
    public static void main(String[] args) {
        
        String str = "Aadesh";
        String rev = "";
        char ch;

        for(int i = 0; i < str.length(); i++){

            ch = str.charAt(i);
            rev = ch + rev;
        }

        System.out.println(rev);
    }

}
