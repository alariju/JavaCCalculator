/**
 *
 * @author Albin
 */
 
//Clase MCalculator
//Hereda de JFRAME pues es una ventana
public class MCalculator extends javax.swing.JFrame {
    
    //Atributos
    //OPU y OPD manejan los numeros de las operaciones
    //OP es un tipo de bandera, en la cual, según sea el valor
    //que tenga, se ejecutará determinada operación
    //Calc es una instancia de la clase Calculator, necesaria
    //para ejecutar las operaciones.
    int OPU, OPD, OP;
    Calculator Calc;
    
    //Constructor de la clase
    //Los atributos int se les asigna 0
    //Se crea una instancia de Calculator
    public MCalculator() {
        OPU = OPD = OP = 0;
        Calc = new Calculator();
        //initComponents es generado por NetBeans, para
        //crear los diferentes componentes de interfaz
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        lblNumbers = new javax.swing.JLabel();
        pnlNumbers = new javax.swing.JPanel();
        btnNine = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        pnlOps = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnEqu = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        lblNumbers.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblNumbers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlNumbers.setBackground(new java.awt.Color(102, 102, 102));
        btnNine.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        btnEight.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        btnSeven.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        btnSix.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        btnFive.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        btnFour.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        btnThree.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        btnTwo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        btnOne.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        btnZero.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout pnlNumbersLayout = new javax.swing.GroupLayout(pnlNumbers);
        pnlNumbers.setLayout(pnlNumbersLayout);
        pnlNumbersLayout.setHorizontalGroup(
            pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNumbersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumbersLayout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumbersLayout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumbersLayout.createSequentialGroup()
                        .addGroup(pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlNumbersLayout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlNumbersLayout.setVerticalGroup(
            pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNumbersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNumbersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlOps.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnClear.setText("CL");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnSub.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        btnMul.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMul.setText("x");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        btnDiv.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        btnEqu.setBackground(new java.awt.Color(0, 153, 51));
        btnEqu.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnEqu.setText("=");
        btnEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout pnlOpsLayout = new javax.swing.GroupLayout(pnlOps);
        pnlOps.setLayout(pnlOpsLayout);
        pnlOpsLayout.setHorizontalGroup(
            pnlOpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpsLayout.setVerticalGroup(
            pnlOpsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpsLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlOps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>                        

    //Eventos de botones
    
    //Evento cuando se presiona el botón 0
    //Se agrega un 0 al final del string del label de números
    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(!lblNumbers.getText().equals("")){
            lblNumbers.setText(lblNumbers.getText()+"0");   
        }
    }                                       

    //Evento cuando se presiona el botón 1
    //Se agrega un 1 al final del string del label de números
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"1");
    }                                      

    //Evento cuando se presiona el botón 2
    //Se agrega un 2 al final del string del label de números
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"2");
    }                                      

    //Evento cuando se presiona el botón 3
    //Se agrega un 3 al final del string del label de números
    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"3");
    }                                        

    //Evento cuando se presiona el botón 4
    //Se agrega un 4 al final del string del label de números
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"4");
    }                                       

    //Evento cuando se presiona el botón 5
    //Se agrega un 5 al final del string del label de números
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"5");
    }                                       

    //Evento cuando se presiona el botón 6
    //Se agrega un 6 al final del string del label de números
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"6");
    }                                      

    //Evento cuando se presiona el botón 7
    //Se agrega un 7 al final del string del label de números
    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"7");
    }                                        

    //Evento cuando se presiona el botón 8
    //Se agrega un 8 al final del string del label de números
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"8");
    }                                        

    //Evento cuando se presiona el botón 9
    //Se agrega un 9 al final del string del label de números
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        lblNumbers.setText(lblNumbers.getText()+"9");
    }                                       

    //Evento cuando se presiona el botón CL
    //Pone en 0 las variables de operadores.
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        OPU = OPD = 0;
        OP = 0;
        lblNumbers.setText("");
    }                                        

    //Evento cuando se presiona el botón +
    //Iguala OPU al numero que se encuentra actualmente en el label
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        OPU = Integer.parseInt(lblNumbers.getText());
        lblNumbers.setText("");
        OP = 1;
    }                                      

    //Evento cuando se presiona el botón -
    //Iguala OPU al numero que se encuentra actualmente en el label
    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        OPU = Integer.parseInt(lblNumbers.getText());
        lblNumbers.setText("");
        OP = 2;
    }                                      
    //Evento cuando se presiona el botón *
    //Iguala OPU al numero que se encuentra actualmente en el label
    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        OPU = Integer.parseInt(lblNumbers.getText());
        lblNumbers.setText("");
        OP = 3;
    }                                      

    //Evento cuando se presiona el botón /
    //Iguala OPU al numero que se encuentra actualmente en el label
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        OPU = Integer.parseInt(lblNumbers.getText());
        lblNumbers.setText("");
        OP = 4;
    }                                      

    //Evento cuando se presiona el botón =
    //Ejecuta la operación según se haya indicado en la operación
    //presionada
    //Hace una llamada a un método de la clase Calculator
    //mediante la instancia Calc
    private void btnEquActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        OPD = Integer.parseInt(lblNumbers.getText());
        lblNumbers.setText("");
        int Resp;
        switch(OP){
            case 1:
                Resp = Calc.ADDNUMBERS(OPU, OPD);
                lblNumbers.setText(String.valueOf(Resp));
                break;
            case 2:
                Resp = Calc.SUBNUMBERS(OPU, OPD);
                lblNumbers.setText(String.valueOf(Resp));
                break;
            case 3:
                Resp = Calc.MULNUMBERS(OPU, OPD);
                lblNumbers.setText(String.valueOf(Resp));
                break;
            case 4:
                Resp = Calc.DIVNUMBERS(OPU, OPD);
                lblNumbers.setText(String.valueOf(Resp));
                break;
        }
    }                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqu;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblNumbers;
    private javax.swing.JPanel pnlNumbers;
    private javax.swing.JPanel pnlOps;
    // End of variables declaration                   
}
