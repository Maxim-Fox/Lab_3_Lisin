package move;

public class TestMove {
    MovablePoint movablePoint;
    public void setUp() {
        movablePoint = new MovablePoint(1, 2, 9, 11);
    }
    public void forMoveMethodsTest() {
        movablePoint.moveRight();
        movablePoint.moveLeft();
        movablePoint.moveUp();
        movablePoint.moveDown();
    }
}
