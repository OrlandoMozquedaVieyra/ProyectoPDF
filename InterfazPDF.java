import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class visualpdf extends JFrame {

    llamaalpdf pdf = new llamaalpdf();
    private JTextField textField_Titulo;
    private JTextField textField_Autor;
    private JTextField textField_Asunto;
    private JTextField textField_Clave;
    private JTextArea textArea_Texto;

    public visualpdf() {
        initialize();
    }

    private void initialize() {

        setTitle("Sistema de de textos para pdf");
        setBounds(100, 100, 537, 458);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel Textote = new JPanel();
        Textote.setBounds(0, 0, 521, 419);
        getContentPane().add(Textote);
        Textote.setLayout(null);

        textField_Titulo = new JTextField();
        textField_Titulo.setBounds(152, 30, 209, 20);
        Textote.add(textField_Titulo);
        textField_Titulo.setColumns(10);

        textField_Autor = new JTextField();
        textField_Autor.setBounds(152, 89, 209, 20);
        Textote.add(textField_Autor);
        textField_Autor.setColumns(10);

        textField_Asunto = new JTextField();
        textField_Asunto.setBounds(152, 146, 209, 20);
        Textote.add(textField_Asunto);
        textField_Asunto.setColumns(10);

        JLabel labelTitulo = new JLabel("Titulo");
        labelTitulo.setBounds(27, 29, 89, 23);
        Textote.add(labelTitulo);

        JLabel labelAutor = new JLabel("Autor");
        labelAutor.setBounds(27, 88, 89, 23);
        Textote.add(labelAutor);

        JLabel labelAsunto = new JLabel("Asunto");
        labelAsunto.setBounds(27, 145, 89, 23);
        Textote.add(labelAsunto);

        JLabel labelPalaCla = new JLabel("Palabra Clave");
        labelPalaCla.setBounds(10, 213, 132, 23);
        Textote.add(labelPalaCla);

        textField_Clave = new JTextField();
        textField_Clave.setBounds(152, 214, 209, 20);
        Textote.add(textField_Clave);
        textField_Clave.setColumns(10);

        JButton btncrearPdf = new JButton("Crear PDF");
        btncrearPdf.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent arg0) {

 pdf.crear_PDF(textField_Titulo.getText(),textField_Autor.getText(),textField_Asunto.getText(),textField_Clave.getText(),textArea_Texto.getText());

            }
        });
        btncrearPdf.setBounds(394, 108, 117, 23);
        Textote.add(btncrearPdf);

        textArea_Texto = new JTextArea();
        textArea_Texto.setBounds(83, 262, 344, 146);
        Textote.add(textArea_Texto);
    }

    public static void main(String[] args) {
        visualpdf traer = new visualpdf();
        traer.setVisible(true);

    }
}
