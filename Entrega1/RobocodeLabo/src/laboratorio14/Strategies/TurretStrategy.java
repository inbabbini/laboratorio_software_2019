package laboratorio14.Strategies;
import robocode.JuniorRobot;

public class TurretStrategy implements IStrategy
{
	@Override
	public void paint(JuniorRobot robot)
    {
        robot.setColors(JuniorRobot.red, JuniorRobot.white, JuniorRobot.black, JuniorRobot.white, JuniorRobot.red);
    }
	
    @Override
    public void run(JuniorRobot robot)
    {
        robot.turnGunRight(5);
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
    	while(robot.scannedDistance > -1)
    	{
    		robot.turnGunTo(robot.scannedAngle);
    		robot.fire();
    		//robot.turnGunLeft(1);
    		//robot.turnGunRight(1);
    	}
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
        robot.back(100);
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
        robot.ahead(100);
    }
}
