package fr.ensea.projet2A;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener {
    private final Drawing drawPanel = new Drawing();

    public Window(String Title, int x, int y) {
        super(Title);
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();
        JPanel SouthPanel = new JPanel();
        JPanel colorPanel = new JPanel();
        JPanel figurePanel = new JPanel();


        contentPanel.add(SouthPanel, "South");
        contentPanel.add(drawPanel);
        SouthPanel.add(colorPanel);
        SouthPanel.add(figurePanel);


        SouthPanel.setLayout(new GridLayout(1, 2));
        colorPanel.setLayout(new GridLayout(2, 6));
        figurePanel.setLayout(new GridLayout(2, 2));


        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("A propos ");

        JMenuItem New = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");

        JMenuItem credits = new JMenuItem("Crédits");
        credits.addActionListener(this);

        menu1.add(New);
        menu1.add(open);
        menu1.add(save);
        menu1.add(quit);

        menu2.add(credits);

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
        JButton rectangle = new JButton("Rectangle");
        rectangle.setBackground(Color.white);
        figurePanel.add(rectangle);
        figurePanel.add(rectangle);
        rectangle.addActionListener(this);

        JButton carre = new JButton("Carre");
        carre.setBackground(Color.white);
        figurePanel.add(carre);
        figurePanel.add(carre);
        carre.addActionListener(this);

        JButton ellipse = new JButton("Ellipse");
        ellipse.setBackground(Color.white);
        figurePanel.add(ellipse);
        figurePanel.add(ellipse);
        ellipse.addActionListener(this);

        JButton cercle = new JButton("Cercle");
        cercle.setBackground(Color.white);
        figurePanel.add(cercle);
        figurePanel.add(cercle);
        cercle.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "noir" -> {
                System.out.println("Noir has been clicked !");
                drawPanel.setC(Color.black);
            }
            case "jaune" -> {
                System.out.println("Jaune has been clicked !");
                drawPanel.setC(Color.yellow);
            }
            case "rouge" -> {
                System.out.println("Rouge has been clicked !");
                drawPanel.setC(Color.red);
            }
            case "bleu" -> {
                System.out.println("Bleu has been clicked !");
                drawPanel.setC(Color.blue);
            }
            case "vert" -> {
                System.out.println("Vert has been clicked !");
                drawPanel.setC(Color.green);
            }
            case "rose" -> {
                System.out.println("Rose has been clicked !");
                drawPanel.setC(Color.pink);
            }
            case "cyan" -> {
                System.out.println("Cyan has been clicked !");
                drawPanel.setC(Color.cyan);
            }
            case "magenta" -> {
                System.out.println("Magenta has been clicked !");
                drawPanel.setC(Color.magenta);
            }
            case "Rectangle" -> {
                System.out.println("Rectangle has been clicked !");
                drawPanel.setNameFigure("Rectangle");
            }
            case "Carre" -> {
                System.out.println("Carre has been clicked !");
                drawPanel.setNameFigure("Carre");
            }
            case "Ellipse" -> {
                System.out.println("Ellipse has been clicked !");
                drawPanel.setNameFigure("Ellipse");
            }
            case "Cercle" -> {
                System.out.println("Cercle has been clicked !");
                drawPanel.setNameFigure("Cercle");
            }
            case "Crédits" -> {
                System.out.println("Crédits has been clicked !");
                JOptionPane info = new JOptionPane("Info");
                JOptionPane.showInternalMessageDialog(info, "Auteur : Anne Couapel", "information", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    @Override
    public String toString() {
        return "Window{" +
                "drawPanel=" + drawPanel +
                '}';
    }
}

