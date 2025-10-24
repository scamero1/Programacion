import javax.swing.JOptionPane;
public class Base {
    
    public static void main(String [] args) {
        
        JOptionPane.showMessageDialog(
                null,
                "Bienvenido a Java!",
                "Mensaje de bienvenida",0
                
                );
        JOptionPane.showMessageDialog(
                null, 
                "vas a apredenr nuevas cosas aca");
        
        String nombre = JOptionPane.showInputDialog(null, 
                "Ingrese su nombre", "Datos de la persona",
                JOptionPane.QUESTION_MESSAGE);
        
        Object seleccion = JOptionPane.showInputDialog(null, 
                "Ingrese su sexo", "Datos de la persona",
                JOptionPane.QUESTION_MESSAGE, null, new Object[]
                        {"Femenino","Masculino"}, "Femenino");
        
        int r=JOptionPane.showConfirmDialog(null, 
                "¿Estas seguro de eliminar el registro?", "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);
            }
}