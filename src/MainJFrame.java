/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jjhon
 */
import Constantes.Constantes;
import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.OutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainJFrame extends javax.swing.JFrame {

    SerialPort serialPort1;
    OutputStream outputStream1;
    String dataBuffer = "";

    public MainJFrame() {
        initComponents();

        configuracionInicial();

        cargarProtocolos();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCombo_comPort = new javax.swing.JComboBox<>();
        jCombo_baudRate = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCombo_dataBits = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCombo_stopBits = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCombo_parityBits = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar_comStatus = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_close = new javax.swing.JButton();
        jButton_open = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_incomingData = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxPer = new javax.swing.JComboBox<>();
        jButton_send = new javax.swing.JButton();
        jTextField_dataToSend = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboProtocols = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Serial Communication");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("COM PORT SETTINGS"));

        jLabel1.setText("COM PORT");

        jCombo_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCombo_comPortPopupMenuWillBecomeVisible(evt);
            }
        });

        jCombo_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200", "5760" }));

        jLabel2.setText("BAUD RATE");

        jCombo_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8" }));

        jLabel3.setText("DATA BITS");

        jCombo_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2", " " }));

        jLabel4.setText("STOP BITS");

        jCombo_parityBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Even", "Odd", "Mark", "Space" }));

        jLabel5.setText("COM STATUS");

        jLabel6.setText("PARITY BITS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCombo_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCombo_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCombo_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCombo_stopBits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jCombo_parityBits, 0, 120, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCombo_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCombo_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCombo_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_close.setText("CLOSE");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        jButton_open.setText("OPEN");
        jButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTextArea_incomingData.setEditable(false);
        jTextArea_incomingData.setColumns(20);
        jTextArea_incomingData.setRows(5);
        jScrollPane1.setViewportView(jTextArea_incomingData);

        jLabel7.setText("PERSISTENTE");

        jComboBoxPer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        jComboBoxPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPerActionPerformed(evt);
            }
        });

        jButton_send.setText("SEND");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        jTextField_dataToSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dataToSendActionPerformed(evt);
            }
        });

        jLabel8.setText("PROTOCOL");

        jComboProtocols.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboProtocols.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboProtocolsItemStateChanged(evt);
            }
        });
        jComboProtocols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProtocolsActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tx menu");

        jMenu4.setText("jMenu4");
        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Rx menu");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxPer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboProtocols, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboProtocols, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        cerrarConexion();
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openActionPerformed
        try {
            SerialPort[] porLisPorts = SerialPort.getCommPorts();
            serialPort1 = porLisPorts[jCombo_comPort.getSelectedIndex()];
            serialPort1.setBaudRate(Integer.parseInt(jCombo_baudRate.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(jCombo_dataBits.getSelectedItem().toString()));
            serialPort1.setNumStopBits(Integer.parseInt(jCombo_stopBits.getSelectedItem().toString()));
            serialPort1.setParity(jCombo_parityBits.getSelectedIndex());
            serialPort1.openPort();

            if (serialPort1.isOpen()) {
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " --EXITOSO");
                jCombo_comPort.setEnabled(false);
                jProgressBar_comStatus.setValue(100);
                jButton_open.setEnabled(false);
                jButton_close.setEnabled(true);
                jButton_send.setEnabled(true);

                Serial_EventBasedReading(serialPort1);

            } else {
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " --FALLO");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "ELIGE COM", "ERROR", ERROR_MESSAGE);
        } catch (HeadlessException | NumberFormatException b) {
            JOptionPane.showMessageDialog(this, b, "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_openActionPerformed

    private void jCombo_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCombo_comPortPopupMenuWillBecomeVisible
        jCombo_comPort.removeAllItems();
        SerialPort[] portLists = SerialPort.getCommPorts();
        for (SerialPort port : portLists) {
            jCombo_comPort.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_jCombo_comPortPopupMenuWillBecomeVisible

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        try {
            sendMessage();
        } catch (InterruptedException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_sendActionPerformed

    private void sendMessage() throws InterruptedException{
        outputStream1 = serialPort1.getOutputStream();
        String dataTosen = jTextField_dataToSend.getText();
        try{
        if(jComboBoxPer.getSelectedItem().toString().equals("SI")){
            sendPersistenceSend(dataTosen);
        }else{
            outputStream1.write(dataTosen.getBytes());
        }
          } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void sendPersistenceSend(String dataTosend) throws InterruptedException{
        while (true) {      
            try {
                System.out.println("Aqui");
                outputStream1.write(dataTosend.getBytes());
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            Thread.sleep(2000);
        }
    }
    
    private void Serial_EventBasedReading(SerialPort activePort) {
        activePort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return SerialPort.LISTENING_EVENT_DATA_RECEIVED;
            }

            @Override
            public void serialEvent(SerialPortEvent event) {
                byte[] newData = event.getReceivedData();
                for (int i = 0; i < newData.length; i++) {
                    dataBuffer += (char) newData[i];
                }
                procesarRespuesta(dataBuffer);
            }
        });

    }
    private void jTextField_dataToSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dataToSendActionPerformed

    }//GEN-LAST:event_jTextField_dataToSendActionPerformed

    private void jComboProtocolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProtocolsActionPerformed
        cargarConfiguracionProtocolo();
    }//GEN-LAST:event_jComboProtocolsActionPerformed

    private void jComboProtocolsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboProtocolsItemStateChanged

    }//GEN-LAST:event_jComboProtocolsItemStateChanged

    private void jComboBoxPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPerActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_send;
    private javax.swing.JComboBox<String> jComboBoxPer;
    private javax.swing.JComboBox<String> jComboProtocols;
    private javax.swing.JComboBox<String> jCombo_baudRate;
    private javax.swing.JComboBox<String> jCombo_comPort;
    private javax.swing.JComboBox<String> jCombo_dataBits;
    private javax.swing.JComboBox<String> jCombo_parityBits;
    private javax.swing.JComboBox<String> jCombo_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar_comStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_incomingData;
    private javax.swing.JTextField jTextField_dataToSend;
    // End of variables declaration//GEN-END:variables

    public void procesarRespuesta(String respuesta) {
        System.out.println("Respuesta "+respuesta);
        switch (respuesta) {
            case Constantes.RESPUESTA_BLUE_SKY:
                jTextArea_incomingData.append("Conexion establecida Blue Sky\n");
                dataBuffer = "";
                break;
            case Constantes.RESPUESTA_GILBARCO:
               
                jTextArea_incomingData.append("Conexion establecida Gilbarco\n");
                dataBuffer = "";
                break;
            case Constantes.RESPUESTA_WAYNE:
                jTextArea_incomingData.append("Conexion establecida Wayne\n");
                dataBuffer = "";
                break;
            default:
                System.out.println("Opcion no configurada");
                dataBuffer = "";
                break;
        }
    }

    public void configuracionInicial() {
        jCombo_baudRate.setSelectedItem("9600");
        jCombo_dataBits.setSelectedItem("8");
        jCombo_stopBits.setSelectedItem("1");
        jCombo_parityBits.setSelectedItem("NO_PARITY");
        jComboBoxPer.setSelectedItem("None");

        jCombo_comPort.setEnabled(true);
        jProgressBar_comStatus.setValue(0);
        jButton_open.setEnabled(true);
        jButton_close.setEnabled(false);
        jButton_send.setEnabled(false);
    }

    public void cerrarConexion() {
        if (serialPort1 != null && serialPort1.isOpen()) {
            serialPort1.closePort();
            jCombo_comPort.setEnabled(true);
            jProgressBar_comStatus.setValue(0);
            jButton_open.setEnabled(true);
            jButton_close.setEnabled(false);
            jButton_send.setEnabled(false);
        }
    }

    public void cargarProtocolos() {
        ArrayList<String> protocolos = Constantes.obtenerProtocolos();
        for (String protocolo : protocolos) {
            jComboProtocols.addItem(protocolo);
        }
    }

    public void cargarConfiguracionProtocolo() {
        if (!jComboProtocols.getSelectedItem().equals("")) {
            configuracionProtocolos(jComboProtocols.getSelectedItem().toString());
            cerrarConexion();
        }
    }

    public void configuracionProtocolos(String protocolo) {
        switch (protocolo) {
            case Constantes.GILBARCO:
                jCombo_baudRate.setSelectedItem("57600");
                jCombo_dataBits.setSelectedItem("8");
                jCombo_stopBits.setSelectedItem("1");
                jCombo_parityBits.setSelectedItem("Even");
                jTextField_dataToSend.setText("Pregunta 1");
                break;
            case Constantes.WAYNE:
                jCombo_baudRate.setSelectedItem("9600");
                jCombo_dataBits.setSelectedItem("8");
                jCombo_stopBits.setSelectedItem("1");
                jCombo_parityBits.setSelectedItem("Odd");
                jTextField_dataToSend.setText("Pregunta 2");
                break;
            case Constantes.BLUE_SKY:
                jCombo_baudRate.setSelectedItem("9600");
                jCombo_dataBits.setSelectedItem("8");
                jCombo_stopBits.setSelectedItem("1");
                jCombo_parityBits.setSelectedItem("None");
                jTextField_dataToSend.setText("Pregunta 3");
                break;
            default:
                configuracionInicial();
                break;
        }
    }

}
