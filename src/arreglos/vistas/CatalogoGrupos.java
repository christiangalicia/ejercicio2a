/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.vistas;

import arreglos.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author christian
 */
public class CatalogoGrupos extends javax.swing.JInternalFrame {
    Carrera tics;
    /**
     * Creates new form catProfesores
     */
    public CatalogoGrupos(Carrera tics) {
        initComponents();
        this.tics=tics;
        this.cargarGrupos();
        
    }
    public void cargarGrupos(){
        
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("No Alumnos");
        listaGrupos.removeAllItems();
        Grupo[] grupos= this.tics.obtenerGrupos();
        for (int i = 0; i < grupos.length; i++) {
            if(grupos[i] !=null){
                Object[] grupo = new Object[2];
                grupo[0]= grupos[i].getNombre();
                grupo[1]= grupos[i].noAlumnos();
                tabla.addRow(grupo);
                listaGrupos.addItem(grupos[i].getNombre());
            }
        }
        tablaGrupo.setModel(tabla);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGrupo = new javax.swing.JTable();
        listaGrupos = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        getContentPane().setLayout(null);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(170, 30, 79, 25);

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 80, 16);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(20, 30, 120, 22);

        tablaGrupo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaGrupo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 452, 140);

        getContentPane().add(listaGrupos);
        listaGrupos.setBounds(340, 10, 120, 22);

        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        getContentPane().add(txtFecha);
        txtFecha.setBounds(200, 90, 140, 22);

        setBounds(0, 0, 498, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        try {
            int noAlumnos = 0;
            String nombre = txtNombre.getText();
            tics.crearNuevoGrupo(noAlumnos, nombre);
            
            txtNombre.setText("");
            this.cargarGrupos();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Date fecha = sdf.parse(txtFecha.getText());
            System.out.println(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(CatalogoGrupos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> listaGrupos;
    private javax.swing.JTable tablaGrupo;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
