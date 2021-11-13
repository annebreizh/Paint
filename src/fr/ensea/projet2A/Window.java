package fr.ensea.projet2A;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Window extends JFrame implements ActionListener {

    public Window(String Title, int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;
        JPanel SouthPanel = new JPanel();
        JPanel drawPanel = new JPanel();
        JPanel colorPanel = new JPanel();
        JPanel figurePanel = new JPanel();



        contentPanel.add(SouthPanel,"South");
        contentPanel.add(drawPanel);
        SouthPanel.add(colorPanel);
        SouthPanel.add(figurePanel);


        SouthPanel.setLayout(new GridLayout(1,2));
        colorPanel.setLayout(new GridLayout(2,6));
        figurePanel.setLayout(new GridLayout(2,2));



        JMenuBar m= new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenu menu2= new JMenu("A propos ");

        JMenuItem New = new JMenuItem("New") ;
        JMenuItem open = new JMenuItem("Open") ;
        JMenuItem save = new JMenuItem("Save") ;
        JMenuItem quit = new JMenuItem("Quit") ;

        menu1.add(New);
        menu1.add(open);
        menu1.add(save);
        menu1.add(quit);

        m.add(menu1);
        m.add(menu2);

        this.setJMenuBar(m);

        //boutons pour les couleurs
        JButton noir = new JButton("noir");
        noir.setBackground(Color.black);
        colorPanel.add(noir);
        noir.addActionListener(this);


        JButton jaune = new JButton("jaune");
        jaune.setBackground(Color.yellow);
        colorPanel.add(jaune);
        jaune.addActionListener(this);


        JButton rouge = new JButton("rouge");
        rouge.setBackground(Color.red);
        colorPanel.add(rouge);
        rouge.addActionListener(this);


        JButton bleu = new JButton("bleu");
        bleu.setBackground(Color.blue);
        colorPanel.add(bleu);
        bleu.addActionListener(this);


        JButton vert = new JButton("vert");
        vert.setBackground(Color.green);
        colorPanel.add(vert);
        vert.addActionListener(this);


        JButton rose = new JButton("rose");
        rose.setBackground(Color.pink);
        colorPanel.add(rose);
        rose.addActionListener(this);

        JButton cyan = new JButton("cyan");
        cyan.setBackground(Color.CYAN);
        colorPanel.add(cyan);
        cyan.addActionListener(this);

        JButton magenta = new JButton("magenta");
        magenta.setBackground(Color.magenta);
        colorPanel.add(magenta);
        magenta.addActionListener(this);

        //boutons pour les figures
        JButton rectangle = new JButton("rectangle");
        rectangle.setBackground(Color.white);
        figurePanel.add(rectangle);
        figurePanel.add(rectangle);
        rectangle.addActionListener(this);

        JButton carre = new JButton("carre");
        carre.setBackground(Color.white);
        figurePanel.add(carre);
        figurePanel.add(carre);
        carre.addActionListener(this);

        JButton ellipse = new JButton("ellipse");
        ellipse.setBackground(Color.white);
        figurePanel.add(ellipse);
        figurePanel.add(ellipse);
        ellipse.addActionListener(this);

        JButton cercle = new JButton("cercle");
        cercle.setBackground(Color.white);
        figurePanel.add(cercle);
        figurePanel.add(cercle);
        cercle.addActionListener(this);

        this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        switch (cmd) {
            case "noir" :
                System.out.println("Noir has been clicked !");
                break;

            case "jaune" :
                System.out.println("Jaune has been clicked !");
                break;

            case "rouge" :
                System.out.println("Rouge has been clicked !");
                break;

            case "bleu" :
                System.out.println("Bleu has been clicked !");
                break;

            case "vert" :
                System.out.println("Vert has been clicked !");
                break;

            case "rose" :
                System.out.println("Rose has been clicked !");
                break;

            case "cyan" :
                System.out.println("Cyan has been clicked !");
                break;

            case "magenta" :
                System.out.println("Magenta has been clicked !");
                break;

            case "rectangle" :
                System.out.println("Rectangle has been clicked !");
                break;

            case "carre" :
                System.out.println("Carre has been clicked !");
                break;

            case "ellipse" :
                System.out.println("Ellipse has been clicked !");
                break;

            case "cercle" :
                System.out.println("Cercle has been clicked !");
                break;
        }

    }

    //JOptionPane info = new JOptionPane();
}

