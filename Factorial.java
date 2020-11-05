public class Factorial{
    public Factorial(){}
    
    public double getFactorial(double n){
        return (n==0)? 1 : n*getFactorial(n-1);

    }
    public double getFactorialWithoutRecursive(double n){
        double temp = 1;
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else{
            for(int i=1; i<=n; i++)
                temp *=i;
        }
        return temp; 
    }   
}