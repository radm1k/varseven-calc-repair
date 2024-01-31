package varseven_calc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import varseven_calc.Oboi;


public class SimpleGUI extends JFrame {
	
    private Oboi oboi = new Oboi();
    private MinVata minvata = new MinVata();
    private CeilingInsulation сeilingInsulation = new CeilingInsulation();
    private Setka setka = new Setka();
    private SuspendedCeilings suspendedCeilings = new SuspendedCeilings();
    private StrippingPaint strippingPaint = new StrippingPaint();
    
    
    private static final long serialVersionUID = 1L;
    
    

    public  SimpleGUI() {
    	

        super("Калькулятор ремонта. Отделочные работы.");
        

        
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(10, 1, 10, 10));
 
     
       

        
    }
    
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double costContainer = 0.0;
            String message = "Результат расчета:\n\n";
            
            
            double rooms = 0.0;
            if (!input.getText().isEmpty()) {
                rooms = Double.parseDouble(input.getText());
            }
            if (rooms > 3) {
                // если больше 3 комнат, то скидочка на 1000 руб
            	costContainer -= 1000;
                message += "Вам скидка на 1000 рублей \n";
            }
            
            //если выбрана квартира
            if (radio1.isSelected()) {
            	costContainer += 1000;
                message += "Тип объекта: Квартира\n";
            } else {
            	//если выбран дом
            	costContainer += 1500;
                message += "Тип объекта: Дом\n";
            }

            if (!input2.getText().isEmpty()) { // проверили есть ли данные по обоям
        
            oboi.setMetr(Double.parseDouble(input2.getText())); // записали значение метров в обои из интрфейса
            oboi.generation(); // посчитали стоимость на основе введенных данных
            double cost = oboi.getCost();
            costContainer += cost;
            message += "Оклеивание обоями / флизелиновой бумагой: " + cost + " руб.\n";
            }
            
            
            if (!input3.getText().isEmpty()) { 
                
            minvata.setMetr(Double.parseDouble(input3.getText())); 
            minvata.generation();
            double cost = minvata.getCost();
            costContainer += cost;
            message += "Укладка мин.ваты на металлический каркас: " + cost + " руб.\n";
            }
            
            if (!input4.getText().isEmpty()) { 
                
            сeilingInsulation.setMetr(Double.parseDouble(input4.getText())); 
            сeilingInsulation.generation();
            double cost = сeilingInsulation.getCost();
            costContainer += cost;
            message += "Утепление потолка: " + cost + " руб. \n";
            }
            
            
            if (!input5.getText().isEmpty()) { 
                
            setka.setMetr(Double.parseDouble(input5.getText())); 
            setka.generation();
            double cost = setka.getCost();
            costContainer += cost;
            message += "Армирующая сетка: " + cost + " руб.\n";
            }
                      
            
            if (!input6.getText().isEmpty()) { 
                
            suspendedCeilings.setMetr(Double.parseDouble(input6.getText())); 
            suspendedCeilings.generation();
            double cost = suspendedCeilings.getCost();
            costContainer += cost;
            message += "Натяжные потолки (материал + работа): " + cost + " руб.\n";
            }
            
            if (!input7.getText().isEmpty()) { 
                
            strippingPaint.setMetr(Double.parseDouble(input7.getText())); 
            strippingPaint.generation();
            double cost = strippingPaint.getCost();
            costContainer += cost;
            message += "Зачистка от краски: " + cost + " руб.\n";
            }
            
            
           
            
            // доп.услуга Дизайн-проект
            if (check.isSelected()) {
            	costContainer += 10000;
                message += "Выбрана доп. услуга - Дизайн-проект (+10 000 руб.) \n";
            } else {
                message += "Без доп. услуг\n";
            }

            message += "Стоимость ремонта: " + costContainer + " руб.";
            

            JOptionPane.showMessageDialog(null, message, "Результат", JOptionPane.PLAIN_MESSAGE);

        }


        
    }
}