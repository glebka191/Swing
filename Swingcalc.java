Небольшая реализация счетчиков за коммуналку //

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame
{
    public Calculator(){
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jbutton = new JButton("Горячая вода");
        JButton jbutton2 = new JButton("Холодная вода");
        JButton jbutton3 = new JButton("Электричество");
        jPanel.add(jbutton);
        jPanel.add(jbutton2);
        jPanel.add(jbutton3);
        jbutton.setActionCommand("Вывожу значение");
        JTextField text = new JTextField(5);//поле ввода
        jPanel.add(text);
        JLabel textout = new JLabel("вывод сообщения");
        jPanel.add(textout);

        jbutton.addActionListener(new ActionListener(){        //обработчик событий кнопки
            public void actionPerformed(ActionEvent e){
                double n;
                n = Double.parseDouble(text.getText());
                //ввод
                double a = n*198.19;
                textout.setText(Double.toString(a) + "  Тариф 198.19");
                //вывод сообщения
            }
        });

        jbutton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double n;
                n = Double.parseDouble(text.getText());
                double b = n*40.48;
                textout.setText(Double.toString(b)+ "  Тариф 40.48");

            }
        });

        jbutton3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double n;
                n = Double.parseDouble(text.getText());
                double c = n*4.65;
                textout.setText(Double.toString(c)+ "  Тариф 4.65");

            }
        });


    }
    static  JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(650, 300, 800, 100);
        return  jFrame;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}



//хол 40,48
//гор вода 198,19
//электричество 4,65
