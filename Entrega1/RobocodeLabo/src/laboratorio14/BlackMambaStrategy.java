package laboratorio14;
import robocode.JuniorRobot;

public class BlackMambaStrategy implements IStrategy
{
	private int turnDirection = 1;
	
    public void paint(JuniorRobot robot)
    {
        robot.setColors(JuniorRobot.black, JuniorRobot.white, JuniorRobot.black, JuniorRobot.white, JuniorRobot.red);
    }

    @Override
    public void run(JuniorRobot robot)
    {
    		robot.turnAheadLeft(100,90);
    		robot.turnGunLeft(180);
    		robot.turnAheadRight(100,90);
    		robot.turnGunLeft(180);
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
    	while (robot.scannedDistance > -1)
    	{
    		this.customFire(robot);
    		if (robot.scannedBearing >= 0) {
    			turnDirection = 1;
    		} else {
    			turnDirection = -1;
    		}
    		this.customFire(robot);    		
    	}
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
    	robot.back(150);
    	robot.turnBackLeft(10, 90 * turnDirection - robot.hitByBulletBearing);
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
    	robot.back(150);
        robot.turnBackRight(10, 90 * turnDirection);
    }
    
    private void customFire(JuniorRobot robot)
    {
    	if (robot.scannedDistance != -1) {
	    	int distance = robot.scannedDistance;
	    	robot.turnGunTo(robot.scannedAngle);
			if (distance < 50) {
		    	robot.fire(4);
	    	} else if (distance < 100) {
		    	robot.fire(3);
	    	} else if (distance < 200) {
	    		robot.fire(2);
	    	}  else if (distance < 350) {
	    		robot.fire(1);
	    	} else {
	    		robot.fire(0.5);
	    	}
		}
    }
}
