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
    
    private JLabel Title = new JLabel("Укажите площадь поверхности в кв. м");
    private JTextField inputempty = new JTextField("", 1);
    private JButton button = new JButton("Рассчитать");
    private JTextField input = new JTextField("", 1);
    private JLabel label = new JLabel("Количество комнат:");
    private JLabel label2 = new JLabel("Оклеивание обоями / флизелиновой бумагой (прим.):");
    private JTextField input2 = new JTextField("", 5);
    private JLabel label3 = new JLabel("Укладка мин.ваты на металлический каркас:");
    private JTextField input3 = new JTextField("", 5);
    private JLabel label4 = new JLabel("Утепление потолка:");
    private JTextField input4 = new JTextField("", 5);
    private JLabel label5 = new JLabel("Армирующая сетка:");
    private JTextField input5 = new JTextField("", 5);
    private JLabel label6 = new JLabel("Натяжные потолки (материал + работа):");
    private JTextField input6 = new JTextField("", 5);
    private JLabel label7 = new JLabel("Зачистка от краски:");
    private JTextField input7 = new JTextField("", 5);
    private JRadioButton radio1 = new JRadioButton("Квартира");
    private JRadioButton radio2 = new JRadioButton("Дом");
    private JCheckBox check = new JCheckBox("Нужен Дизайн-проект помещения", false);

    public  SimpleGUI() {
    	

        super("Калькулятор ремонта. Отделочные работы.");
        this.setBounds(300, 100, 900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(10, 1, 10, 10));
 
     // Получаем текущий шрифт JLabel
        Font currentFont = Title.getFont();

        // Создаем новый шрифт с большим размером
        Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), currentFont.getSize() + 5);

        // Устанавливаем новый шрифт в JLabel
        Title.setFont(newFont);
        // паддинги для инпутов и тд
        inputempty.setOpaque(false);
        inputempty.setFocusable(false);
        inputempty.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input7.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        input6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        radio1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        radio2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        check.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        container.add(Title);
        container.add(inputempty);
        container.add(label);
        container.add(input);
        container.add(label2);
        container.add(input2);
        container.add(label3);
        container.add(input3);
        container.add(label4);
        container.add(input4);
        container.add(label5);
        container.add(input5);
        container.add(label6);
        container.add(input6);
        container.add(label7);
        container.add(input7);
    
        
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        container.add(button);

        button.addActionListener(new ButtonEventListener());

        // проверкф ввода только цифр
        input.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });

        input2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        input3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        input4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        input5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        input6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
        input7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                    e.consume();
                }
            }
        });
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