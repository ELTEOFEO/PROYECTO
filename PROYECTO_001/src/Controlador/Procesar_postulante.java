package Controlador;

import javax.swing.JCheckBox;

public class Procesar_postulante {
    private JCheckBox[] checkboxes;
    String dato;

    public Procesar_postulante(JCheckBox... checkboxes) {
        this.checkboxes = checkboxes;
    }

    public void preparar_opciones(JCheckBox selectedCheckbox) {
        
        for (JCheckBox checkbox : checkboxes) {
            if (checkbox != selectedCheckbox) {
                checkbox.setSelected(false);
            }
        }
        
    }


}



