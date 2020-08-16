/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplica;

/**
 *
 * @author WINDOWS 10 PRO
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Multiplica extends JFrame {
    private JPanel p1,p2,p3,p4;
    private JLabel bSalir;
    private JLabel bMinimizar;
    private JLabel lTitulo;
    JButton bMultiplicar,bInsercionDirecta,bQuicksort,bSeleccionDirecta;
    JLabel lResultado,lX,lY;
    JTextField tX,tY;
    int xx;
    int xy;
    public Multiplica(){
        this.setSize(420, 685);
        this.setLocationRelativeTo((Component)null);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setLayout(new BoxLayout(this.getContentPane(), 1));
        this.paneles();
        this.pack();
        this.setVisible(true);
    }
    public void paneles(){
        this.p1 = new JPanel();
        this.p1.setBackground(new Color(50, 50, 50));
        this.p1.setSize(620, 40);
        this.p1.setLayout(new BoxLayout(this.p1, 2));
        this.p1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        this.p1.setPreferredSize(new Dimension(620, 40));
        this.p1.setMinimumSize(new Dimension(620, 40));
        this.p1.setMaximumSize(new Dimension(620, 40));
        this.panelSup();
        this.add(this.p1);



        this.p3 = new JPanel();
        this.p3.setBackground(new Color(81, 82, 82));
        this.p3.setSize(420, 400);
        this.p3.setLayout(null);
        this.p3.setPreferredSize(new Dimension(620, 120));
        this.p3.setMinimumSize(new Dimension(620, 120));
        this.p3.setMaximumSize(new Dimension(620, 120));
        panelCentral();
        this.add(this.p3);


        this.p2 = new JPanel();
        this.p2.setBackground(new Color(81, 82, 82));
        this.p2.setSize(420, 200);
        this.p2.setLayout(null);
        this.p2.setPreferredSize(new Dimension(620, 100));
        this.p2.setMinimumSize(new Dimension(620, 100));
        this.p2.setMaximumSize(new Dimension(620, 100));
        this.panelBotones();
        this.add(this.p2);

    }
    public void panelSup() {
        this.bSalir = new JLabel();
        this.bSalir.setSize(29, 30);
        this.bSalir.setLocation(385, 5);
        this.bSalir.setIcon(new ImageIcon("src/imagenes/salir.png"));
        this.p1.add(this.bSalir);
        this.bMinimizar = new JLabel();
        this.bMinimizar.setSize(29, 30);
        this.bMinimizar.setLocation(351, 5);
        this.bMinimizar.setIcon(new ImageIcon("src/imagenes/minim.png"));
        this.p1.add(this.bMinimizar);
        this.bMinimizar.setVisible(true);
        this.bSalir.setVisible(true);
        this.lTitulo = new JLabel("Multiplicador de numeros enteros                                      ");
        this.lTitulo.setSize(300, 30);
        this.p1.add(this.lTitulo);
        this.lTitulo.setVisible(true);
        this.lTitulo.setFont(new Font("Gotham", 0, 18));
        this.lTitulo.setForeground(new Color(161, 162, 163));
        this.bSalir.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            public void mousePressed(MouseEvent e) {
                Multiplica.this.bSalir.setIcon(new ImageIcon("src/imagenes/salirPressed.png"));
            }

            public void mouseReleased(MouseEvent e) {
                Multiplica.this.bSalir.setIcon(new ImageIcon("src/imagenes/salir.png"));
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
                Multiplica.this.bSalir.setIcon(new ImageIcon("src/imagenes/salir.png"));
            }
        });
        this.bMinimizar.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                Multiplica.this.setExtendedState(1);
            }

            public void mousePressed(MouseEvent e) {
                Multiplica.this.bMinimizar.setIcon(new ImageIcon("src/imagenes/minimPressed.png"));
            }

            public void mouseReleased(MouseEvent e) {
                Multiplica.this.bMinimizar.setIcon(new ImageIcon("src/imagenes/minim.png"));
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
                Multiplica.this.bMinimizar.setIcon(new ImageIcon("src/imagenes/minim.png"));
            }
        });
        this.p1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                Multiplica.this.xx = e.getX();
                Multiplica.this.xy = e.getY();
            }
        });
        this.p1.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                Multiplica.this.setLocation(x - Multiplica.this.xx, y - Multiplica.this.xy);
            }
        });
    }

    public void panelCentral(){

        lX = new JLabel("Ingrese primer numero");
        tX = new JTextField();
        this.lX.setBounds(90, 30, 300, 24);
        this.tX.setBounds(360, 30, 170, 24);
        this.lX.setFont(new Font("Gotham", 0, 18));
        this.tX.setFont(new Font("Gotham", 0, 20));
        this.lX.setForeground(new Color(161, 162, 163));

        lY = new JLabel("Ingrese primer numero");
        tY = new JTextField();
        this.lY.setBounds(90, 70, 300, 24);
        this.tY.setBounds(360, 70, 170, 24);
        this.lY.setFont(new Font("Gotham", 0, 18));
        this.tY.setFont(new Font("Gotham", 0, 20));
        this.lY.setForeground(new Color(161, 162, 163));

       this.p3.add(tX);
        this.p3.add(lX);
        this.p3.add(tY);
        this.p3.add(lY);

    }
    public void panelBotones(){
        //Ordenar burbuja, Ordenar Inserción directa, Ordenar Quicksort, Ordenar Seleccion directa
        lResultado = new JLabel(" ");
        bMultiplicar = new JButton("Multiplicar");
        this.lResultado.setBounds(360, 20, 300, 24);
        this.bMultiplicar.setBounds(100, 20, 170, 24);
        this.lResultado.setFont(new Font("Gotham", 0, 18));
        this.bMultiplicar.setFont(new Font("Gotham", 0, 20));
        this.lResultado.setForeground(new Color(161, 162, 163));
        this.bMultiplicar.setForeground(new Color(161, 162, 163));
        this.bMultiplicar.setBackground(new Color(51, 51, 51));
        this.bMultiplicar.setForeground(new Color(223, 224, 224));
        this.bMultiplicar.setFocusable(true);
        this.bMultiplicar.setBorder(BorderFactory.createLineBorder(new Color(73, 73, 73)));

        this.p2.add(bMultiplicar);
        this.p2.add(lResultado);
        bMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lResultado.setText(String.valueOf(multiplicaDos(Integer.parseInt(tX.getText()), Integer.parseInt(tY.getText()))));
            }
        });
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Multiplica m1 = new Multiplica();

        int x = 12345, y = 56789;
        System.out.println(x + " * " + y);
        int ans = multiplicaDos(x,y);
        System.out.println("Rpta: " + ans);

    }

    static int multiplicaDos(int x, int y){

        String xs = "" + x;
        String ys = "" + y;
        int n = Math.max(xs.length() , ys.length());

        if (n < 2){
            return x * y;
        }
        else{
            int s = n / 2;
            
            int xi = x / (int)Math.pow(10, s);
            int xd = x % (int)Math.pow(10, s);

            int yi = y / (int)Math.pow(10, s);
            int yd = y % (int)Math.pow(10, s);

            int r = multiplicaDos(xi+xd, yi+yd);
            int p = multiplicaDos(xi, yi);
            int q = multiplicaDos(xd, yd);
            
            return p*(int)Math.pow(10, 2*s) + (r-p-q)*(int)Math.pow(10, s) + q; 
        }
        
    }
    
}
