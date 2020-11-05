import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Combinations{
    private static Combinations instance = null;
    BorderLayout fLayout;
    Factorial fact = new Factorial();

    private Combinations(){}

    public static Combinations getInstance(){
        if(instance==null)
            instance = new Combinations();
        return instance;
    }

    public void solve(double arr2[], double rData){
        //BRUCE FORCE
        double n = arr2.length;
        double rF = fact.getFactorial(rData);
        double nF = fact.getFactorial(n);
        double nr = n - rData;
        double rd = nF / rF;
        double result = rd/(fact.getFactorial(nr));
        JOptionPane.showMessageDialog(null,"Combinations = "+result+"!"); 
    
    }

    public void solveWithoutRecursive(double arr2[], double rData){
        //BRUCE FORCE
        double n = arr2.length;
        double rF = fact.getFactorialWithoutRecursive(rData);
        double nF = fact.getFactorialWithoutRecursive(n);
        double nr = n - rData;
        double rd = nF / rF;
        double result = rd/(fact.getFactorialWithoutRecursive(nr));
        JOptionPane.showMessageDialog(null,"Combinations without recursion= "+result+"!"); 
    
    }

    public void menu(){

        double worseCase[] = {1, 2, 3, 4, 5,72,54,156,3623,632,72,77,2,
            34,43,4,23,1, 2, 3, 4, 5,72,54,156,3623,632,72,77234,43,4,23,45,
        23,6,1,4634,634,634,63,3245324,534,5324,632,6325,6324,623,723,3,4632,
        45,134,5324,534,5,324,534,53,45,345,34,534,5,345,34,51,5134,5,145,1,33,543,5345,
        43,2423,432,432,4,324,1223131,1,33,3,3,1,3}; 
        double averageCase[] = {2,4,6,18,15,25,13,25,14,15};
        double bestCase[] ={1,2,3,4,5};
        double rWorseCase = 30;
        double rAvegareCase = 3; 
        double rBestCase = 5; 
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(53,51,54));
        UI.put("Panel.background",new ColorUIResource(53,51,54));
        UI.put("Button.background", new ColorUIResource(41,208,253));
        UI.put(".foreground", new ColorUIResource(255,255,255));
        UI.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
        solve(worseCase, rWorseCase);
        solve(averageCase, rAvegareCase);
        solve(bestCase, rBestCase);      
        solveWithoutRecursive(worseCase,rWorseCase);
        solveWithoutRecursive(bestCase,rBestCase);
        solveWithoutRecursive(averageCase,rAvegareCase);

    }

}   