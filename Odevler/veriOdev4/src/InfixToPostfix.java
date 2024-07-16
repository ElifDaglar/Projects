public class InfixToPostfix {
    private String input;
    public String postfix;
    private LinkStack theStack;

    public InfixToPostfix(String in) {
        input = in;
        theStack = new LinkStack();
        postfix = "";
    }

    private boolean processPriority(char c, char t) {
        int op1Weight = getOperatorWeight(c);
        int op2Weight = getOperatorWeight(t);

        if ((c == '*' || c == '/') && (t == '+' || t == '-' || t == '('))
            return true;
        else if ((t == '*' || t == '/') && (c == '+' || c == '-' || c == '('))
            return false;

        return op1Weight >= op2Weight;
    }
    private int getOperatorWeight(char op) { //Burada operatör önceliklerini kıyasladım.
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public void convertToPostfix() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch; // postfix e ekledim.
            } else if (ch == '(') {
                theStack.push(ch);  //ekleme
            } else if (ch == ')') {
                while (!theStack.isEmpty() && theStack.peek() != '(') { //stack boş değilken ve stack in tepe elemanı ( den faklıysa
                    postfix += theStack.pop();
                }
                theStack.pop(); // '(' karakterini çıkar
            } else { // Operatörler
                while (!theStack.isEmpty() && theStack.peek() != '(' && processPriority(theStack.peek(), ch)) {
                    postfix += theStack.pop();
                }
                theStack.push(ch);
            }
        }

        while (!theStack.isEmpty()) { //yığın boşalana kadar çalışır.
            postfix += theStack.pop();
        }
    }
}
