package laboratorio14;
import robocode.JuniorRobot;

public class TestStrategy implements IStrategy
{
	@Override
	public void paint(JuniorRobot robot)
    {
        robot.setColors(JuniorRobot.black, JuniorRobot.white, JuniorRobot.black, JuniorRobot.white, JuniorRobot.red);
    }
	
    @Override
    public void run(JuniorRobot robot)
    {
        robot.ahead(100);
        robot.turnGunRight(360);
        robot.back(100);
        robot.turnGunRight(360);
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
        robot.fire(1);
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
        robot.back(10);
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
        robot.back(20);
    }
}
