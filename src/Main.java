public class Main {
    public static void main(String[] args) {
        LambdaAssign1 output =(int n1, int n2) -> Math.max(n1,n2);
        System.out.println(output.max(72,88));
    }
}
