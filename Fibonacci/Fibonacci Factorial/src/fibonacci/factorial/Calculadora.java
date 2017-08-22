
package fibonacci.factorial;

/**
 *
 * @author Sosa Estrada María Fernanda, Vega Corona Yazmin María
 * @date 18/08/17
 */
class Calculadora {
    int num1, num2;
    int factorial, fibonacci;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    String NumeroFi()
    {
        
        int fibo1,fibo2,i;
        
        fibo1=1;
        fibo2=1; 

        for(i=2;i<=num1 ;i++){
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
             System.out.println(fibonacci);
        }
             return fibo2+"";
    
    }

    String NumeroFa() {

        double factorial = 1;
        
        while (num2 != 0) {
            factorial = factorial * num2;
            num2--;
            System.out.println(factorial);
        }
        return factorial + "";
        
    }
}
