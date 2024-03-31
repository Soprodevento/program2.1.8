public class Main {
    public static void main(String[] args) {
            Robot robot = new Robot(0, 0, Direction.UP);
            robot.moveRobot(robot, -3, 0);
            System.out.println("Конечная позиция " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
        }

    }

