public class File1 {
    public static void main(String[] args) {

        System.out.println("Hello from java - calulater");
        

        int n1=50,n2=2;

        char ch='/';

        if(ch=='+'){
            System.out.println(n1 + "+" + n2 +'=' + n1+n2);
        }
        if(ch=='-'){
            System.out.println(n1 + "-" + n2 +'=' + (n1-n2));
        }
        if(ch=='*'){
            System.out.println(n1 + "*" + n2 +'=' + n1*n2);
        }
        if(ch=='/'){
            System.out.println(n1 + "/" + n2 +'=' + n1/n2);
        }
    }
}