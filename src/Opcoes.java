/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heric
 */
public class Opcoes extends javax.swing.JFrame {
	
	public static int dificuldade = 2;
	
    /**
     * Creates new form Opcoes
     */
    public Opcoes() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        dificuldadeLabel = new javax.swing.JLabel();
        easyButton = new javax.swing.JButton();
        mediumButton = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        statusDificuldadeLabel = new javax.swing.JLabel();
        dificuldadeLabel1 = new javax.swing.JLabel();
        comumButton = new javax.swing.JButton();
        kittyButton = new javax.swing.JButton();
        starButton = new javax.swing.JButton();
        statusSnakeLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Op��es");
        setBackground(new java.awt.Color(255, 102, 153));
        setFocusableWindowState(false);
        

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeLogo (1).png"))); // NOI18N

        dificuldadeLabel.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        dificuldadeLabel.setText("Sele��o de dificuldade:");

        easyButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        easyButton.setText("F�cil");
        easyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                easyButtonActionPerformed(evt);
            }
        });

        mediumButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        mediumButton.setText("M�dio");
        mediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumButtonActionPerformed(evt);
            }
        });

        hardButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        hardButton.setText("Dif�cil");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardButtonActionPerformed(evt);
            }
        });

        statusDificuldadeLabel.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N

        dificuldadeLabel1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        dificuldadeLabel1.setText("Sele��o de snake:");

        comumButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        comumButton.setText("Comum");
        comumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comumButtonActionPerformed(evt);
            }
        });

        kittyButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        kittyButton.setText("Kitty");
        kittyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kittyButtonActionPerformed(evt);
            }
        });

        starButton.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        starButton.setText("Star");
        starButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starButtonActionPerformed(evt);
            }
        });

        statusSnakeLabel.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N

        returnButton.setFont(new java.awt.Font("Unispace", 1, 14)); // NOI18N
        returnButton.setText("Voltar");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dificuldadeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusSnakeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(kittyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(starButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dificuldadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusDificuldadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(57, 57, 57)
                            .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(logoLabel)))
                .addGap(258, 258, 258))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(logoLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusDificuldadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(easyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dificuldadeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusSnakeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kittyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        
        if(dificuldade == 1) {
        	statusDificuldadeLabel.setText("F�cil");
        }
        
        if(dificuldade == 2) {
        	statusDificuldadeLabel.setText("M�dio");
        }
        
        if(dificuldade == 3) {
        	statusDificuldadeLabel.setText("Dif�cil");
        }
        
        pack();
    }// </editor-fold>                        

    private void easyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dificuldade = 1;
        statusDificuldadeLabel.setText("F�cil");
    }                                          

    private void mediumButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        dificuldade = 2;
        statusDificuldadeLabel.setText("M�dio");
    }                                            

    private void hardButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dificuldade = 3;
        statusDificuldadeLabel.setText("Dif�cil");
    }                                          

    private void comumButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    
    	statusSnakeLabel.setText("Comum");
    }                                           

    private void kittyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	
    	statusSnakeLabel.setText("Kitty");
    }                                           

    private void starButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	
    	statusSnakeLabel.setText("Star");
    }                                          

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {        
    	new Menu();
    	dispose();
    }                                            

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton comumButton;
    private javax.swing.JLabel dificuldadeLabel;
    private javax.swing.JLabel dificuldadeLabel1;
    private javax.swing.JButton easyButton;
    private javax.swing.JButton hardButton;
    private javax.swing.JButton kittyButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton mediumButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton starButton;
    private javax.swing.JLabel statusDificuldadeLabel;
    private javax.swing.JLabel statusSnakeLabel;
    // End of variables declaration                   
}
