import javax.swing.JOptionPane; 
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource; 
import javax.swing.JComponent;

public class Choose{   
    
    public void selection(){ 
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(53,51,54));
        UI.put("Panel.background",new ColorUIResource(53,51,54));
        UI.put("Button.background", new ColorUIResource(41,208,253));
        UI.put(".foreground", new ColorUIResource(255,255,255));  
        UI.put("OptionPane.messageForeground",new ColorUIResource(255,255,255));
        int inputValue = Integer.parseInt( JOptionPane.showInputDialog(null,
        "1 = Combinations \n2 = Permutation"));
        if(inputValue == 1){
            Combinations cb = Combinations.getInstance();  
            cb.menu(); 
        }else if(inputValue == 2){
            Permutation pt = Permutation.getInstance();
            pt.menu();  
        }else
            JOptionPane.showMessageDialog(null,"Error");    
        
    }

}