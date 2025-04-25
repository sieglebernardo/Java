/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num1field = new javax.swing.JTextField();
        num2field = new javax.swing.JTextField();
        soma = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        Divisao = new javax.swing.JButton();
        resto = new javax.swing.JButton();
        radicalizar = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        senoField = new javax.swing.JButton();
        tangenteField = new javax.swing.JButton();
        cossenoField = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor 1:");

        jLabel2.setText("Valor 2:");

        num1field.setBackground(new java.awt.Color(204, 255, 255));
        num1field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1fieldActionPerformed(evt);
            }
        });

        num2field.setBackground(new java.awt.Color(204, 255, 255));
        num2field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2fieldActionPerformed(evt);
            }
        });

        soma.setBackground(new java.awt.Color(204, 204, 255));
        soma.setText("Somar");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(204, 204, 255));
        subtracao.setText("Subtrair");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(204, 204, 255));
        multiplicacao.setText("Multiplicar");
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        Divisao.setBackground(new java.awt.Color(204, 204, 255));
        Divisao.setText("Dividir");
        Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaoActionPerformed(evt);
            }
        });

        resto.setBackground(new java.awt.Color(204, 204, 255));
        resto.setText("Resto");
        resto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoActionPerformed(evt);
            }
        });

        radicalizar.setBackground(new java.awt.Color(204, 204, 255));
        radicalizar.setText("Radicalizar");
        radicalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radicalizarActionPerformed(evt);
            }
        });

        potencia.setBackground(new java.awt.Color(204, 204, 255));
        potencia.setText("Potencialização (X2)");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        senoField.setBackground(new java.awt.Color(204, 204, 255));
        senoField.setText("Seno");
        senoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senoFieldActionPerformed(evt);
            }
        });

        tangenteField.setBackground(new java.awt.Color(204, 204, 255));
        tangenteField.setText("Tangente");
        tangenteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tangenteFieldActionPerformed(evt);
            }
        });

        cossenoField.setBackground(new java.awt.Color(204, 204, 255));
        cossenoField.setText("Cosseno");
        cossenoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cossenoFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 255, 51));
        jLabel3.setText("RESULTADO");

        Resultado.setBackground(new java.awt.Color(51, 255, 0));
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        limpar.setBackground(new java.awt.Color(255, 255, 153));
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(255, 0, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limpar)
                        .addGap(29, 29, 29)
                        .addComponent(sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num1field, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(num2field, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soma)
                            .addComponent(resto)
                            .addComponent(senoField))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subtracao)
                                .addGap(33, 33, 33)
                                .addComponent(multiplicacao)
                                .addGap(31, 31, 31)
                                .addComponent(Divisao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radicalizar)
                                    .addComponent(cossenoField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tangenteField)
                                    .addComponent(potencia))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(num1field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soma)
                            .addComponent(subtracao)
                            .addComponent(multiplicacao)
                            .addComponent(Divisao))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(num2field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resto)
                            .addComponent(radicalizar)
                            .addComponent(potencia))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senoField)
                    .addComponent(tangenteField)
                    .addComponent(cossenoField)
                    .addComponent(jLabel3)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar)
                    .addComponent(sair))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void num1fieldActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void num2fieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        float num1 = Float.parseFloat(num1field.getText());
        float num2 = Float.parseFloat(num2field.getText());
        float soma = num1 + num2;
        Resultado.setText(Float.toString(soma));
    }                                    

    private void restoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        float num1 = Float.parseFloat(num1field.getText());
        float num2 = Float.parseFloat(num2field.getText());
        float resto = num1 % num2;
        Resultado.setText(Float.toString(resto));
    }                                     

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        float num1 = Float.parseFloat(num1field.getText());
        float rad = num1 * num1;
        Resultado.setText(Float.toString(rad));
    }                                        

    private void tangenteFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        float num1 = Float.parseFloat(num1field.getText());
        
        float radiano = (float) Math.toRadians(num1);
        float tangente = (float) Math.tan(radiano);
        
        Resultado.setText(Double.toString(tangente));
    }                                             

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        float num1 = Float.parseFloat(num1field.getText());
        float num2 = Float.parseFloat(num2field.getText());
        float subtracao = num1 - num2;
        Resultado.setText(Float.toString(subtracao));
    }                                         

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        float num1 = Float.parseFloat(num1field.getText());
        float num2 = Float.parseFloat(num2field.getText());
        float multiplicacao = num1 * num2;
        Resultado.setText(Float.toString(multiplicacao));
    }                                             

    private void DivisaoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        float num1 = Float.parseFloat(num1field.getText());
        float num2 = Float.parseFloat(num2field.getText());
        float divisao = num1 / num2;
        Resultado.setText(Float.toString(divisao));
    }                                       

    private void radicalizarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        float num1 = Float.parseFloat(num1field.getText());
        double rad = Math.sqrt(num1);
        Resultado.setText(Double.toString(rad));
    }                                           

    private void senoFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double num1 = Float.parseFloat(num1field.getText());
        
        float radiano = (float) Math.toRadians(num1);
        float seno = (float) Math.sin(radiano);
        
        Resultado.setText(Float.toString(seno));
    }                                         

    private void cossenoFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        float num1 = Float.parseFloat(num1field.getText());
        
        float radiano = (float) Math.toRadians(num1);
        float cosseno = (float) Math.cos(radiano);
        
        Resultado.setText(Double.toString(cosseno));
    }                                            

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {                                       
        num1field.setText("");
        num2field.setText("");
        Resultado.setText("");
    }                                      

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Divisao;
    private javax.swing.JTextField Resultado;
    private javax.swing.JTextField TextValor1;
    private javax.swing.JTextField TextValor10;
    private javax.swing.JTextField TextValor2;
    private javax.swing.JTextField TextValor3;
    private javax.swing.JTextField TextValor4;
    private javax.swing.JTextField TextValor5;
    private javax.swing.JTextField TextValor6;
    private javax.swing.JTextField TextValor7;
    private javax.swing.JTextField TextValor8;
    private javax.swing.JTextField TextValor9;
    private javax.swing.JButton cossenoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JTextField num1field;
    private javax.swing.JTextField num2field;
    private javax.swing.JButton potencia;
    private javax.swing.JButton radicalizar;
    private javax.swing.JButton resto;
    private javax.swing.JButton sair;
    private javax.swing.JButton senoField;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton tangenteField;
    // End of variables declaration                   
}
