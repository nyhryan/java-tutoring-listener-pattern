package example;

import javax.swing.*;
import java.awt.*;

class ExampleFrame extends JFrame {
    public ExampleFrame() {
        super("Listener Example");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        var eventButtonPanel = new EventButtonPanel(); // 리스너 객체를 들고 있다.
        var canvasPanel = new CanvasPanel();           // 리스너 객체를 참고(사용)한다.

        // 캔버스의 변화를 듣고있는 리스너를 캔버스에 등록한다.
        // 캔버스는 자신에게 변화가 발생하면, 듣고있는 리스너에게 알려준다!
//        canvasPanel.setListener(eventButtonPanel.getListener());

        JPanel contentPane = new JPanel();
        contentPane.add(eventButtonPanel, BorderLayout.NORTH);
        contentPane.add(canvasPanel, BorderLayout.CENTER);
        setContentPane(contentPane);

        setVisible(false);
    }

    public static void launch() {
        SwingUtilities.invokeLater(() -> new ExampleFrame().setVisible(true));
    }
}
