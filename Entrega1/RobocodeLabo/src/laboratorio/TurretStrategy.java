package laboratorio;
import robocode.JuniorRobot;

public class TurretStrategy implements IStrategy
{
	@Override
	public void paint(JuniorRobot robot)
    {
        robot.setColors(JuniorRobot.black, JuniorRobot.white, JuniorRobot.black, JuniorRobot.white, JuniorRobot.red);
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
