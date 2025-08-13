import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CursorPositionExample extends JFrame {

    private JTextArea textArea;

    public CursorPositionExample() {
        super("Posicionar Cursor en Texto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        textArea = new JTextArea(5, 20);
        textArea.setText("Este es un ejemplo de texto.");
        add(new JScrollPane(textArea));

        JButton moveCursorButton = new JButton("Mover cursor");
        moveCursorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setCaretPosition(textArea.getText().indexOf('e')); // Mover cursor a la primera 'e'
            }
        });
        add(moveCursorButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CursorPositionExample();
    }
}
