package example;

// 캔버스의 변화를 듣고 있는 객체의 인터페이스.
// 캔버스에 click이 발생했을 시 (when canvas on click, ...)
// 해당하는 이벤트를 처리할 코드를 직접 구현한다.
public interface CanvasListener {
    default void onClick() {}
    default void onPress() {}
    default void onRelease() {}
    default void onDrag() {}
}
