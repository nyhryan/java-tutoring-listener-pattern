package example;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;
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

    // 캔버스에서 신호를 보내면, 여기서 처리합니다
    // ex) 캔버스에서 마우스 press를 알림 = onPress() 호출: onPressBtn의 색상 변경!
    @Getter
    private final CanvasListener listener = new CanvasListener() {
//        @Override
//        public void onClick() {
//            onClickBtn.setBackground(getRandomColor());
//        }
//
//        @Override
//        public void onPress() {
//            onPressBtn.setBackground(getRandomColor());
//        }
//
//        @Override
//        public void onRelease() {
//            onReleaseBtn.setBackground(getRandomColor());
//        }
//
//        @Override
//        public void onDrag() {
//            onDragBtn.setBackground(getRandomColor());
//        }
    };

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
