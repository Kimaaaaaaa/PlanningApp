import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PlanningApp extends JFrame implements ActionListener, MouseListener{

    public int x = 4;
    public int y= 3;

    //JButton
    private JButton [] tabButtonCouleur;
    private JButton [] tabButtonPlanning;

    private JButton btnNew;
    private JButton btnSave;
    private JButton btnCopy;
    private JButton btnMoveBack;

    private JButton btnMoveForward;
    private JButton btnSquare;
    private JButton btnRectangle;
    private JButton btnCircle;

    private JButton btnDiamond;
    private JButton btnEraser;
    private JButton btnFilling;
    private JButton btnPen;
    

    //JPanel
    private JPanel panelHaut;
    private JPanel panelCouleur;
    private JPanel panelBas;
    private JPanel panelPlanning;

    private JPanel panelTb1;
    private JPanel panelTb2;
    private JPanel panelTb3;
    private JPanel panelHautDroit;

    //Toolbar
    private JToolBar tb1;
    private JToolBar tb2;
    private JToolBar tb3;

    //Color

    private Color lastSelectedColor;

    //Label
    private JLabel[] tabJLabel;



    public PlanningApp(){

        this.setLayout(new GridLayout(4, 1));
        this.setTitle("Palette de couleur");
        this.setSize(1920, 1080);
        

        this.panelCouleur = new JPanel(new GridLayout(x, y));
        this.panelBas = new JPanel(new GridLayout(22, 6)); //On passe sur des demies heures.
        this.panelHaut = new JPanel(new GridLayout(1, 2));
        this.panelHautDroit = new JPanel(new GridLayout(3, 1));
        this.panelBas.setBackground(Color.LIGHT_GRAY);

        //Jlabel

        this.tabJLabel = new JLabel[5];

        //tabButtonPlanning

        this.tabButtonPlanning = new JButton[6 * 22];

        //color 

        this.lastSelectedColor = null;


        //ToolBar
        this.panelTb1 = new JPanel(new GridLayout(1, 4));
        this.panelTb2 = new JPanel(new GridLayout(1, 4));
        this.panelTb3 = new JPanel(new GridLayout(1, 4));
        this.tb1 = new JToolBar();
        this.tb2 = new JToolBar();
        this.tb3 = new JToolBar();


        /* Button ToolBar 1*/

        //Button New 

 

        ImageIcon imgNew = new ImageIcon("icons/new.png");
        Image resizedImageNew= imgNew.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconNew = new ImageIcon(resizedImageNew);
        this.btnNew = new JButton(resizedIconNew);                       
        this.btnNew.setToolTipText( "New File (CTRL+N)" );
        this.btnNew.addActionListener( this::btnNewListener );
        this.btnNew.setBorderPainted(false);


        //Button Save
        ImageIcon imgSave = new ImageIcon("icons/save.png");
        Image resizedImageSave= imgSave.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconSave = new ImageIcon(resizedImageSave);
        this.btnSave = new JButton(resizedIconSave);                   
        this.btnSave.setToolTipText( "Save (CTRL+S)" );
        this.btnSave.addActionListener( this::btnNewListener );
        this.btnSave.setBorderPainted(false);


        //Move back
        ImageIcon imgInferiorTo = new ImageIcon("icons/inferiorTo.png");
        Image resizedImageInferiorTo = imgInferiorTo.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconInferiorTo = new ImageIcon(resizedImageInferiorTo); 
        this.btnMoveBack = new JButton(resizedIconInferiorTo); 
        this.btnMoveBack.setToolTipText( "(CTRL+Z)" );
        this.btnMoveBack.addActionListener( this::btnNewListener );
        this.btnMoveBack.setBorderPainted(false);

        //Move Forward

        ImageIcon imgSuperiorTo = new ImageIcon("icons/superiorTo.png");
        Image resizedImageSuperiorTo = imgSuperiorTo.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconSuperiorTo = new ImageIcon(resizedImageSuperiorTo); 
        this.btnMoveForward = new JButton(resizedIconSuperiorTo);                       
        this.btnMoveForward.setToolTipText( "(CTRL+Y)" );
        this.btnMoveForward.addActionListener( this::btnNewListener );
        this.btnMoveForward.setBorderPainted(false);

        /* Button ToolBar 2*/

        //Button Rectangle

        ImageIcon imgRectangle = new ImageIcon("icons/rectangle.png");
        Image resizedImageRectangle = imgRectangle.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconRectangle = new ImageIcon(resizedImageRectangle); 
        this.btnRectangle = new JButton(resizedIconRectangle);                       
        this.btnRectangle.setToolTipText( "Draw Rectangle" );
        this.btnRectangle.addActionListener( this::btnNewListener );
        this.btnRectangle.setBorderPainted(false);
    
        //Button Square 
    
        ImageIcon imgSquare = new ImageIcon("icons/square.png");
        Image resizedImageSquare = imgSquare.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconSquare = new ImageIcon(resizedImageSquare); 
        this.btnSquare = new JButton(resizedIconSquare);     
        this.btnSquare.setToolTipText( "Draw Square" );          
        this.btnSquare.addActionListener( this::btnNewListener );
        this.btnSquare.setBorderPainted(false);

        
        //Button Cricle
        
        ImageIcon imgCircle = new ImageIcon("icons/cercle.png");
        Image resizedImageCircle = imgCircle.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconCircle = new ImageIcon(resizedImageCircle); 
        this.btnCircle = new JButton(resizedIconCircle);     
        this.btnCircle.setToolTipText( "Draw Circle" );    
        this.btnCircle.addActionListener( this::btnNewListener );
        this.btnCircle.setBorderPainted(false);

        //Button Copy
        ImageIcon imgCopy = new ImageIcon("icons/copy.png");
        Image resizedImageCopy = imgCopy.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconCopy = new ImageIcon(resizedImageCopy); 
        this.btnCopy = new JButton(resizedIconCopy);     
        this.btnCopy.setToolTipText( "CTRL C (Copy)" );    
        this.btnCopy.addActionListener( this::btnNewListener );
        this.btnCopy.setBorderPainted(false);

        /* Button ToolBar 3*/

        /*private JButton btnDiamond;
        private JButton btnEraser;
        private JButton btnFilling;
        private JButton btnPen;
        */

        //Button Diamond 

        ImageIcon imgDiamond = new ImageIcon("icons/diamond.png");
        Image resizedImageDiamond = imgDiamond.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconDiamond = new ImageIcon(resizedImageDiamond); 
        this.btnDiamond = new JButton(resizedIconDiamond);     
        this.btnDiamond.setToolTipText( "Draw Diamond" );
        this.btnDiamond.addActionListener( this::btnNewListener );
        this.btnDiamond.setBorderPainted(false);
        

        //Button eraser

        ImageIcon imgEraser = new ImageIcon("icons/eraser.png");
        Image resizedImageEraser = imgEraser.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconEraser = new ImageIcon(resizedImageEraser); 
        this.btnEraser = new JButton(resizedIconEraser);     
        this.btnEraser.setToolTipText( "Draw Eraser" );
        this.btnEraser.addActionListener( this::btnNewListener );
        this.btnEraser.setBorderPainted(false);

        //Button btnFilling
        ImageIcon imgFilling = new ImageIcon("icons/filling.png");            
        Image resizedImageFilling = imgFilling.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconFilling = new ImageIcon(resizedImageFilling); 
        this.btnFilling = new JButton(resizedIconFilling);     
        this.btnFilling.setToolTipText( "Filling" );
        this.btnFilling.addActionListener( this::btnNewListener );
        this.btnFilling.setBorderPainted(false);
        

        //Button btnPen

        ImageIcon imgPen = new ImageIcon("icons/pen.png");            
        Image resizedImagePen = imgPen.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        ImageIcon resizedIconPen = new ImageIcon(resizedImagePen); 
        this.btnPen = new JButton(resizedIconPen);     
        this.btnPen.setToolTipText( "Pen" );
        this.btnPen.addActionListener( this::btnNewListener );
        this.btnPen.setBorderPainted(false);


        //ajout des boutons sur TB1
        addSpace(tb1);
        this.tb1.add( btnNew );
        addSpace(tb1);
        this.tb1.add( btnSave );
        addSpace(tb1);
        this.tb1.add(btnMoveBack);
        addSpace(tb1);
        this.tb1.add(btnMoveForward);
        addSpace(tb1);

        //ajout des boutons sur TB2

        addSpace(tb2);
        this.tb2.add( btnRectangle );
        addSpace(tb2);
        this.tb2.add( btnSquare );
        addSpace(tb2);
        this.tb2.add(btnCircle);
        addSpace(tb2);
        this.tb2.add(btnDiamond);
        addSpace(tb2);

        //ajout des boutons sur TB3

        addSpace(tb3);
        this.tb3.add( btnCopy );
        addSpace(tb3);
        this.tb3.add( btnEraser );
        addSpace(tb3);
        this.tb3.add(btnFilling);
        addSpace(tb3);
        this.tb3.add(btnPen);
        addSpace(tb3);


        //ajout des bouttons au listener

        this.btnNew.addActionListener(this);  
        this.btnSave.addActionListener(this);
        this.btnCopy.addActionListener(this);
        this.btnMoveBack.addActionListener(this);
        this.btnMoveForward.addActionListener(this);
        this.btnSquare.addActionListener(this);
        this.btnRectangle.addActionListener(this);
        this.btnCircle.addActionListener(this);
        this.btnDiamond.addActionListener(this);
        this.btnEraser.addActionListener(this);
        this.btnFilling.addActionListener(this);
        this.btnPen.addActionListener(this);
        

        //Mouse
        addMouseListener(this);
        
        this.tabButtonCouleur = new JButton[x*y];
        Color [] tabColor = {Color.RED, Color.BLUE, Color.GREEN, Color.PINK, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.DARK_GRAY}; 

        for(int i = 0; i < x*y; i++)
        {   
            JButton button = new JButton("");
            button.setBackground(tabColor[i]);
            this.tabButtonCouleur[i] = button;
            tabButtonCouleur[i].addActionListener(this);  
            this.panelCouleur.add(button);
        }

        this.tabButtonPlanning = new JButton[5*22];
        this.tabJLabel = new JLabel[5];


        this.tabJLabel[0] = new JLabel("                          Lundi");
        this.tabJLabel[0].setFont(new Font("Serif", Font.BOLD, 20));
        this.tabJLabel[1] = new JLabel("                          Mardi");
        this.tabJLabel[1].setFont(new Font("Serif", Font.BOLD, 20));
        this.tabJLabel[2] = new JLabel("                          Mercredi");
        this.tabJLabel[2].setFont(new Font("Serif", Font.BOLD, 20));
        this.tabJLabel[3] = new JLabel("                          Jeudi");
        this.tabJLabel[3].setFont(new Font("Serif", Font.BOLD, 20));
        this.tabJLabel[4] = new JLabel("                          Vendredi");
        this.tabJLabel[4].setFont(new Font("Serif", Font.BOLD, 20));

        this.panelBas.add(this.tabJLabel[0]);
        this.panelBas.add(this.tabJLabel[1]);
        this.panelBas.add(this.tabJLabel[2]);
        this.panelBas.add(this.tabJLabel[3]);
        this.panelBas.add(this.tabJLabel[4]);
        

        for(int i = 0; i < 110; i++)
        {
            /*if(i == 5 || i == 11 || i == 17|| i == 23 || i ==29 || i == 35 || i == 41 || i == 47 || i== 53 || i == 59 || i == 65|| i == 71 || i ==77|| 
               i == 83 || i ==90 || i == 96 || i == 102 || i == 108)
               {
                 switch(i)
                 {  
                    case 5 : {
                        this.panelBas.add(new JLabel("8h30"));
                    }
                    case 11 : {
                        this.panelBas.add(new JLabel("9h00"));
                    }

                    case 17 : {
                        this.panelBas.add(new JLabel("9h30"));
                    }

                    case 23 : {
                        this.panelBas.add(new JLabel("10h00"));
                    }

                    case 29 : {
                        this.panelBas.add(new JLabel("10h30"));
                    }
                
                    case 35 : {
                        this.panelBas.add(new JLabel("11h00"));
                    }

                    case 41 : {
                        this.panelBas.add(new JLabel("11h30"));
                    }

                    case 47 : {
                        this.panelBas.add(new JLabel("12h00"));
                    }

                    case 53 : {
                        this.panelBas.add(new JLabel("12h30"));
                    }

                    
                    case 59 : {
                        this.panelBas.add(new JLabel("14h00"));
                    }
                    
                    case 65 : {
                        this.panelBas.add(new JLabel("14h30"));
                    }

                    
                    case 71 : {
                        this.panelBas.add(new JLabel("15h00"));
                    }

                    
                    case 77 : {
                        this.panelBas.add(new JLabel("15h30"));
                    }

                    
                    case 83 : {
                        this.panelBas.add(new JLabel("16h00"));
                    }

                    
                    case 90 : {
                        this.panelBas.add(new JLabel("16h30"));
                    }

                    
                    case 96 : {
                        this.panelBas.add(new JLabel("17h00"));
                    }

                    
                    case 102 : {
                        this.panelBas.add(new JLabel("17h30"));
                    }

                    
                    case 108 : {
                        this.panelBas.add(new JLabel("18h00"));
                    }

                    
  


                 }
               }
               if(i == 109)
               {
                break;
               }
               */
                        
            this.tabButtonPlanning[i] = new JButton("");
            this.panelBas.add(this.tabButtonPlanning[i]);
            this.tabButtonPlanning[i].addActionListener(this);
        

        }
        
        
        
        

    

        /*for(int i = 6; i < 6 * 22; i++)
        {

        }
        */

        this.panelHaut.add(this.panelCouleur);
        this.panelTb1.add(this.tb1);
        this.panelTb2.add(this.tb2);
        this.panelTb3.add(this.tb3);
        this.panelHautDroit.add(this.panelTb1);
        this.panelHautDroit.add(this.panelTb2);
        this.panelHautDroit.add(this.panelTb3);
        this.panelHaut.setBounds(0, 0, 1685, 80);
        this.panelBas.setBounds(0, 81, 1685, 1000);
        //this.panelTb1.setLayout(null);
        //Ajouter les éléments du panel Haut droit ici


        this.panelHaut.add(this.panelHautDroit);
        this.add(this.panelHaut);
        this.add(this.panelBas);
        this.setLayout(null);
        this.setVisible(true);



    }

    //addSpace

    private static void addSpace(JToolBar toolbar) {
        JPanel spacePanel = new JPanel();
        toolbar.add(spacePanel);
    }

    //event
    public void reset()
    {
        for(int i = 0; i < 110; i++)
        {
            System.out.println("bonjour");
            
            this.tabButtonPlanning[i].setText(" ");
            this.tabButtonPlanning[i].setBackground(Color.WHITE);
            
        }
    }


    public void actionPerformed(ActionEvent e)
    {
        for(int i = 0; i < 12; i++)
        {
            if(e.getSource() == this.tabButtonCouleur[i])
            {
                this.lastSelectedColor = this.tabButtonCouleur[i].getBackground();
                System.out.println("Couleur selectionné : " + lastSelectedColor);
            }
        }

        for(int i = 0; i < 110; i++)
        if(e.getSource() == this.tabButtonPlanning[i])
        {
            this.tabButtonPlanning[i].setBackground(this.lastSelectedColor);
        }

        if(e.getSource() == this.btnNew)
        {
            reset();
        }

        
    }

    public static void main(String [] args)
    {
        new PlanningApp(); 
    }

    private void btnNewListener( ActionEvent event ) {
        JOptionPane.showMessageDialog( this, "Button clicked !" );
    }

    public void mouseClicked(MouseEvent e)
    {

        
    }
    public void mouseEntered(MouseEvent e)
    {

    }
    public void mouseExited(MouseEvent e)
    {

    }
    public void mousePressed(MouseEvent e)
    {

    }
    public void mouseReleased(MouseEvent e)
    {

    }





}
