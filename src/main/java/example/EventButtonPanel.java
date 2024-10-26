package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

class EventButtonPanel extends JPanel {
    private static class CustomButton extends JButton {
        public CustomButton() {
            super(" ");
            setEnabled(false);
            setPreferredSize(new Dimension(50, 50));
        }
    }

    private final CustomButton onClickBtn = new CustomButton();
    private final CustomButton onPressBtn = new CustomButton();
    private final CustomButton onReleaseBtn = new CustomButton();
    private final CustomButton onDragBtn = new CustomButton();

    private final static Random rand = new Random();

    private static Color getRandomColor() {
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }

    private MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            onClickBtn.setBackground(getRandomColor());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            onPressBtn.setBackground(getRandomColor());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            onReleaseBtn.setBackground(getRandomColor());
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            onDragBtn.setBackground(getRandomColor());
        }
    };

    public MouseAdapter getMouseAdapter() {
        return mouseAdapter;
    }

    public EventButtonPanel() {
        setLayout(new FlowLayout());

        add(new JLabel("OnClick"));
        add(onClickBtn);
        add(new JLabel("OnPress"));
        add(onPressBtn);
        add(new JLabel("OnRelease"));
        add(onReleaseBtn);
        add(new JLabel("OnDrag"));
        add(onDragBtn);
    }
}
