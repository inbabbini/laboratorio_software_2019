package laboratorio;
import robocode.JuniorRobot;

public class TurretStrategy implements IStrategy
{
    @Override
    public void run(JuniorRobot robot)
    {
        robot.turnGunRight(5);
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
    	while(robot.scannedDistance > 0)
    	{
    		robot.fire();    		
    	}
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
        robot.doNothing();
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
        robot.doNothing();
    }
}
