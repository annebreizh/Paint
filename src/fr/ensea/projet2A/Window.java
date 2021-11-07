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
      //  contentPanel.add(m,"North");
       // m.setLayout(new GridLayout(1,2));


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

        JButton jaune = new JButton("jaune");
        jaune.setBackground(Color.yellow);
        colorPanel.add(jaune);

        JButton rouge = new JButton("rouge");
        rouge.setBackground(Color.red);
        colorPanel.add(rouge);

        JButton bleu = new JButton("bleu");
        bleu.setBackground(Color.blue);
        colorPanel.add(bleu);

        JButton vert = new JButton("vert");
        vert.setBackground(Color.green);
        colorPanel.add(vert);

        JButton rose = new JButton("rose");
        rose.setBackground(Color.pink);
        colorPanel.add(rose);
        rose.addActionListener(this);

        //boutons pour les figures
        JButton rectangle = new JButton("rectangle");
        //rectangle.setBackground();
        figurePanel.add(rectangle);
        figurePanel.add(rectangle);
        rectangle.addActionListener(this);

        JButton carre = new JButton("carre");
        //carre.setBackground();
        figurePanel.add(carre);
        figurePanel.add(carre);
        carre.addActionListener(this);

        JButton ellipse = new JButton("ellipse");
        //ellipse.setBackground();
        figurePanel.add(ellipse);
        figurePanel.add(ellipse);
        ellipse.addActionListener(this);

        JButton cercle = new JButton("cercle");
        //cercle.setBackground();
        figurePanel.add(cercle);
        figurePanel.add(cercle);
        cercle.addActionListener(this);

        //JButton OkButton= new JButton("Que viva ENSEA !");
        //contentPanel.add(OkButton);
        //OkButton.addActionListener(this);

        this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd=e.getActionCommand();
        switch (cmd)
        {
            case "rose" :
                System.out.println("Rose has been clicked !");
                break;
        }
    }

    JOptionPane info = new JOptionPane();
}

