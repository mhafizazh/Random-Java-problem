public class EvenNumberIncrease {
    public static void main(String[]args){
        for (int i = 1; i <= 100; i++){
            if (i % 2 ==  0) //if I have 0 modulus it's mean even number
                continue;
            System.out.println(i+1);
        }
    }
}
