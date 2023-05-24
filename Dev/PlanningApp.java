import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PlanningApp extends JFrame implements ActionListener, MouseListener{

    public int x = 4;
    public int y= 3;

    //JButton
    private JButton [] tabButton;

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
    private JPanel panelTb1;
    private JPanel panelTb2;
    private JPanel panelTb3;
    private JPanel panelMouse;
    private JPanel panelHautDroit;

    //JLabel
    private JLabel lblPos;

    //Toolbar
    private JToolBar tb1;
    private JToolBar tb2;
    private JToolBar tb3;



    public PlanningApp(){

        this.setLayout(new GridLayout(3, 1));
        this.setTitle("Palette de couleur");
        this.setSize(1920, 1080);
        

        this.panelCouleur = new JPanel(new GridLayout(x, y));
        this.panelBas = new JPanel(new GridLayout(11, 22)); //On passe sur des demies heures.
        this.panelHaut = new JPanel(new GridLayout(1, 2));
        this.panelHautDroit = new JPanel(new GridLayout(3, 1));


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
        this.btnMoveForward.setToolTipText( "(CTRL+Z)" );
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



        

        //Mouse
        this.panelMouse = new JPanel(new FlowLayout());
        this.lblPos = new JLabel("Pos x :    , Pos y:     ");
        addMouseListener(this);
        
        this.tabButton = new JButton[x*y];
        Color [] tabColor = {Color.RED, Color.BLUE, Color.GREEN, Color.PINK, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.GRAY, Color.BLACK, Color.WHITE, Color.LIGHT_GRAY, Color.DARK_GRAY}; 

        for(int i = 0; i < x*y; i++)
        {   
            JButton button = new JButton("");
            button.setBackground(tabColor[i]);
            this.tabButton[i] = button;
            tabButton[i].addActionListener(this);  
            this.panelCouleur.add(button);
        }

        this.panelHaut.add(this.panelCouleur);
        this.panelTb1.add(this.tb1);
        this.panelTb2.add(this.tb2);
        this.panelTb3.add(this.tb3);
        this.panelHautDroit.add(this.panelTb1);
        this.panelHautDroit.add(this.panelTb2);
        this.panelHautDroit.add(this.panelTb3);
        this.panelHaut.setBounds(0, 0, 1685, 80);
        this.panelBas.setBounds(0, 81, 1685, 800);
        this.lblPos.setBounds(0, 882, 200, 200);
        //this.panelTb1.setLayout(null);
        //Ajouter les éléments du panel Haut droit ici


        this.panelHaut.add(this.panelHautDroit);
        this.add(this.panelHaut);
        this.add(this.panelBas);
        this.add(this.lblPos);
        this.setLayout(null);
        this.setVisible(true);



    }

    //addSpace

    private static void addSpace(JToolBar toolbar) {
        JPanel spacePanel = new JPanel();
        toolbar.add(spacePanel);
    }

    //event

    public void actionPerformed(ActionEvent e)
    {
        for(int i = 0; i < 12; i++)
        {
            if(e.getSource() == this.tabButton[i])
            {
                majBackground(this.tabButton[i].getBackground());
            }
        }
    }

    public void majBackground(Color c)
    {
        this.panelBas.setBackground(c);
    }
    public static void main(String [] args)
    {
        new PlanningApp(); 
    }

    private void btnNewListener( ActionEvent event ) {
        JOptionPane.showMessageDialog( this, "Button clicked !" );
    }
    //mouse listener

    public void newFrame(int x, int y)
    {
        this.lblPos.setText("Pos x : " + x + "Pos y : " + y);
        this.add(this.lblPos);
    }

    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Validé !");
        newFrame(e.getX(), e.getY());

        
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
