package liza;


import java.util.Stack;

public class Demos {
    public void fib(int n){
        int a = 1;
        int b = 1;
        int temp;
        for(int i=0;i<n;i++){
            System.out.print(a+b+", ");
            temp = a;
            a = b;
            b = temp + b;
        }
    }

    private void recFib(int a, int b, int n){
        if(b>n){
            return;
        }
        System.out.print(a+b+", ");
        int temp = a;
        a = b;
        b = temp + b;
        recFib(a,b,n);
    }

    protected int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }



    //public void checkBracketsExtended(String exp){
    public void checkBrackets(String exp){
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();
        if(exp.charAt(0) == '}'){
            System.out.println("false first");
            return;
        }
        for(int i=0;i<exp.length();i++){
            if(stackR.size()>stackL.size()){
                System.out.println("false left side");
                return;
            }
            if(exp.charAt(i)=='{'){
                stackL.push('{');
            }
            if(exp.charAt(i)=='}'){
                stackR.push('}');
            }
        }
        if(stackL.size()==stackR.size()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void isPallindrom(String str){
        int strLen = str.length();
        //int middle = strLen/2;
        int leftIndex=0;
        int rightIndex=strLen-1;
        while(leftIndex<rightIndex){
            if(str.charAt(rightIndex)==str.charAt(leftIndex)){
                leftIndex++;
                rightIndex--;
            } else {
                System.out.println("is not palindrom");
                return;
            }
        }
        System.out.println("is palindrom");
    }

    void FizzBuz(){

    }

    void LinkedListCircle(){

    }

    public void matrix(int n){
        double[][] matrix = new double[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = Math.random();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" , ");
            }
            System.out.print("\n");
        }
    }
}
