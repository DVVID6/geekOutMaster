package myProject;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private Header headerProject;
    private JLabel mano, textoPuntaje, textoPuntajeTotal, textoRonda;
    private JButton lanzar, ayuda, salir, creditos, botonExplicacion, continuarReiniciar;
    private JPanel panelDadosActivos, panelDadosUtilizados, panelDadosInactivos, panelPuntaje, panelRonda;
    private ImageIcon imageMano, imageExplicacion, imageDado;

    /**
     * Constructor de la clase GUI
     */
    public GUI() {
        initGUI();

        //Configuración por defecto del JFrame
        this.setTitle("Geek Out Masters");
        this.setUndecorated(true);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Este método se utiliza para configurar la configuración predeterminada de JComponent,
     * crear objetos de escucha y control utilizados para la clase GUI
     */
    private void initGUI() {
        //Configurar el diseño del contenedor JFrame
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();


        //Configurar JComponents

        /**
         * Creacion del titulo
         */
        headerProject = new Header("Geek Out! Masters", Color.BLACK);

        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 3;
        constraints.fill = GridBagConstraints.CENTER;
        this.add(headerProject, constraints);

        /**
         * Creacion de boton "Ayuda"
         */
        ayuda = new JButton(" help ");
        //ayuda.addActionListener(escucha);
        ayuda.setBackground(Color.green);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        this.add(ayuda, constraints);

        /**
         * Creacion de boton "Créditos"
         */
        creditos = new JButton(" Créditos ");
        //creditos.addActionListener(escucha);
        creditos.setBackground(Color.yellow);
        constraints.gridx=2;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.CENTER;
        constraints.anchor=GridBagConstraints.LINE_START;
        this.add(creditos,constraints);
    }
}



