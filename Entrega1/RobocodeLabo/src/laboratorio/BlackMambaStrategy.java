package laboratorio;
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
    	if(robot.scannedDistance < 0)
    	{
    		robot.turnAheadLeft(50,45);
    		robot.turnAheadRight(50,45);    		
    	} else {
    		robot.turnRight(5 * turnDirection);
    	}
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
    	if (robot.scannedBearing >= 0) {
			turnDirection = 1;
		} else {
			turnDirection = -1;
		}

		robot.turnRight(robot.scannedBearing);
		robot.ahead(robot.scannedDistance + 5);
		this.customFire(robot);
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
    	robot.turnBackLeft(10, 45);
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
        robot.turnBackRight(50, 45);
    }
    
    private void customFire(JuniorRobot robot)
    {
    	if (robot.scannedDistance != -1) {
	    	int distance = robot.scannedDistance;
	    	robot.turnGunTo(robot.scannedAngle);
			if (distance < 50) {
		    	robot.fire(4);
	    	}else if (distance < 100) {
		    	robot.fire(3);
	    	} else if (distance < 200) {
	    		robot.fire(2);
	    	}  else if (distance < 350) {
	    		robot.fire(1);
	    	} 
		}
    }
}
