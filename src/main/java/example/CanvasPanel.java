package example;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class CanvasPanel extends JPanel {
    @Setter
    private CanvasListener listener = null;

    public CanvasPanel() {
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);

        // 캔버스에 마우스 상호작용 시, 실행할 "스윙의 이벤트 리스너"
        var mouseAdapter = new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (listener == null) return;
//                listener.onClick();
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                if (listener == null) return;
//                listener.onPress();
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                if (listener == null) return;
//                listener.onRelease();
//            }
//
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                if (listener == null) return;
//                listener.onDrag();
//            }
        };

        addMouseListener(mouseAdapter);
        addMouseMotionListener(mouseAdapter);
    }
}
