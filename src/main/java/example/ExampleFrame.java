package example;

import javax.swing.*;
import java.awt.*;

class ExampleFrame extends JFrame {
    public ExampleFrame() {
        super("Listener Example");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 1. 버튼 패널을 먼저 만든다. = 마우스 어댑터가 먼저 생성된다.
        var eventButtonPanel = new EventButtonPanel();

        // 2. 캔버스 패널을 만든다. 이때, 위에서 생긴 마우스 어댑터를 가지고와서 등록한다.
        var canvasPanel = new CanvasPanel();
        canvasPanel.addMouseListener(eventButtonPanel.getMouseAdapter());
        canvasPanel.addMouseMotionListener(eventButtonPanel.getMouseAdapter());

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
