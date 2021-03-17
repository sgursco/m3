package piscininha;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piscininha extends JFrame implements ActionListener{

    JLabel lbllarg, lblprof, lblcomp, lblval; 
    JTextField txtlarg, txtprof, txtcomp, txtval;
    JButton btncalcular, btnlimpar, btnsair;

    public static void main(String[] args) {
        JFrame aba = new Piscininha();
        aba.setUndecorated(true);
        aba.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        aba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aba.setVisible(true);
    }
    Piscininha()
    {
        setTitle("Calcular área da piscina");
        setBounds(250, 90, 350,90);
        getContentPane().setBackground(new Color(176,224,230));
        getContentPane().setLayout(new GridLayout(5,2));
        
        lbllarg = new JLabel("largura:");
        lbllarg.setForeground(Color.black);
        lbllargura.setFont(new Font("",Font.BOLD,12));
        
        lblprof = new JLabel("profundidade:");
        lblprof.setForeground(Color.black);
        lblprof.setFont(new Font("",Font.BOLD,12));

        lblcomp = new JLabel("comprimento:");
        lblcomp.setForeground(Color.black);
        lblcomp.setFont(new Font("",Font.BOLD,12));

        lblval = new JLabel("resultado:");
        lblval.setForeground(Color.black);
        lblval.setFont(new Font("",Font.BOLD,12));

        btncalcular = new JButton("CALCULAR");
        btncalcular.addActionListener(this);

        btnlimpar = new JButton("LIMPAR");
        btnlimpar.addActionListener(this);

        btnsair = new JButton("SAIR");
        btnsair.addActionListener(this);

        txtlarg = new JTextField();
        txtprof = new JTextField();
        txtcomp = new JTextField();
        txtval = new JTextField();
        txtval.setEditable(false);

        getContentPane().add(lbllarg);               
        getContentPane().add(txtlarg);

        getContentPane().add(lblprof);          
        getContentPane().add(txtprof);

        getContentPane().add(lblcomp);           
        getContentPane().add(txtcomp);

        getContentPane().add(lblval);                 
        getContentPane().add(txtval);

        getContentPane().add(btncalcular);              
        getContentPane().add(btnlimpar);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnlimpar)
        {
            txtlarg.setText("");
            txtprof.setText("");
            txtcomp.setText("");
            txtval.setText("");
            return;
        }
        double largura=0,profundidade=0,comprimento=0,area=0;
        try
        {
            largura = Double.parseDouble(txtlarg.getText());
            profundidade = Double.parseDouble(txtprof.getText());
            comprimento = Double.parseDouble(txtcomp.getText());
        }
        catch(NumberFormatException error)
        {
            txtval.setText("Apenas Numeros");
            return;
        }
        
        if(e.getSource() == btncalcular)
        {
            area = (largura*profundidade*comprimento)*30;
            txtval.setText("" + area);
        }
    }
}