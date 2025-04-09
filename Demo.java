//creating a class calculator
class Calculator{
    int a;//creating properties of class
    public int add(int n1,int n2){//behavaiour of the class adding
        int r = n1+n2;
        return r;   
    }
}
public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        System.out.println(result);
    }
    
}
