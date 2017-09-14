package examen;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Dylan Josel Vaca Méndez
 * @version 1.0
 */
public class exa extends JFrame implements ActionListener{
    JLabel tit;
    JTextField num;
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, np, conv, c;
    String cad = "", res = "";
    float pes, dls;
    
    /**
     *
     */
    public exa(){
        //creación del frame principal
        setLayout(null);
        setBounds(50, 50, 350, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
               
        //creación del label del fram
        tit = new JLabel("Convertidor");
        tit.setBounds(10, 10, 100, 20);
        add(tit);
        
        //creación del campo de texto
        num = new JTextField();
        num.setBounds(105, 10, 150, 20);
        add(num);
        
        //creación de los botones
        //1
        n1 = new JButton("1");
        n1.setBounds(10, 40, 50, 50);
        n1.addActionListener(this);
        add(n1);
        
        //2
        n2 = new JButton("2");
        n2.setBounds(70, 40, 50, 50);
        n2.addActionListener(this);
        add(n2);
        
        //3
        n3 = new JButton("3");
        n3.setBounds(130, 40, 50, 50);
        n3.addActionListener(this);
        add(n3);
        
        //4
        n4 = new JButton("4");
        n4.setBounds(10, 100, 50, 50);
        n4.addActionListener(this);
        add(n4);
        
        //5
        n5 = new JButton("5");
        n5.setBounds(70, 100, 50, 50);
        n5.addActionListener(this);
        add(n5);
        
        //6
        n6 = new JButton("6");
        n6.setBounds(130, 100, 50, 50);
        n6.addActionListener(this);
        add(n6);
        
        //7
        n7 = new JButton("7");
        n7.setBounds(10, 160, 50, 50);
        n7.addActionListener(this);
        add(n7);
        
        //8
        n8 = new JButton("8");
        n8.setBounds(70, 160, 50, 50);
        n8.addActionListener(this);
        add(n8);
        
        //9
        n9 = new JButton("9");
        n9.setBounds(130, 160, 50, 50);
        n9.addActionListener(this);
        add(n9);
        
        //0
        n0 = new JButton("0");
        n0.setBounds(10, 220, 50, 50);
        n0.addActionListener(this);
        add(n0);
        
        //p
        np = new JButton(".");
        np.setBounds(70, 220, 50, 50);
        np.addActionListener(this);
        add(np);
        
        //conv
        conv = new JButton("Convertir");
        conv.setBounds(190, 40, 100, 30);
        conv.addActionListener(this);
        add(conv);
        
        //c
        c = new JButton("Limpiar");
        c.setBounds(190, 75, 100, 30);
        c.addActionListener(this);
        add(c);
        
        setVisible(true);
    }
    
    /**
     * @param e trae el origen de las acciones
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //pone los numeros seleccionados en ael campo de texto y en una cadena
        if(e.getSource() == n1){
            cad = cad + "1";
            num.setText(cad);
        } else
        if(e.getSource() == n2){
            cad = cad + "2";
            num.setText(cad);
        } else
        if(e.getSource() == n3){
            cad = cad + "3";
            num.setText(cad);
        } else
        if(e.getSource() == n4){
            cad = cad + "4";
            num.setText(cad);
        } else
        if(e.getSource() == n5){
            cad = cad + "5";
            num.setText(cad);
        } else
        if(e.getSource() == n6){
            cad = cad + "6";
            num.setText(cad);
        } else
        if(e.getSource() == n7){
            cad = cad + "7";
            num.setText(cad);
        } else
        if(e.getSource() == n8){
            cad = cad + "8";
            num.setText(cad);
        } else
        if(e.getSource() == n9){
            cad = cad + "9";
            num.setText(cad);
        } else
        if(e.getSource() == n0){
            cad = cad + "0";
            num.setText(cad);
        } else
        if(e.getSource() == np){
            cad = cad + ".";
            num.setText(cad);
        }
        
        //limpia el textfield
        if(e.getSource() == c){
            num.setText("");
            cad = "";
        }
        
        //realiza las conversiones de pesos a dolares
        if(e.getSource() == conv){
            pes = Float.parseFloat(cad);
            dls = pes / 17;
            System.out.println(dls);
            res = String.valueOf(dls);
            num.setText(res);
            cad = "";
        }
    }
    
}
