package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

class CanvasPanel extends JPanel {
    private MouseAdapter mouseAdapter;

    public CanvasPanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
    }
}
