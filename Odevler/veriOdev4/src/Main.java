import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        while(true){
            System.out.print("Infix Notsayonunda Bir Formul Giriniz:");
            input=getString();
            if (input.equals(""))
                break;
            InfixToPostfix thePostfix=new InfixToPostfix(input);
            thePostfix.convertToPostfix();
            System.out.println("Postfix Notasyonu: "+thePostfix.postfix);
        }
    }
    public static String getString(){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        return s;
    }
}