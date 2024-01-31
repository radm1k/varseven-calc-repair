package varseven_calc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import varseven_calc.Oboi;


public class SimpleGUI extends JFrame {
	
 
    
    
    private static final long serialVersionUID = 1L;

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
        this.setBounds(500, 200, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(9, 1, 10, 10));
 
        // паддинги для инпутов и тд
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
            

        }


        
    }
}