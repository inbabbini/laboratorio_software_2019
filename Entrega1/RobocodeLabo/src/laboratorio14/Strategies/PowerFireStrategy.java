package laboratorio14.Strategies;
import robocode.JuniorRobot;

public class PowerFireStrategy implements IStrategy
{
	@Override
	public void paint(JuniorRobot robot)
    {
        robot.setColors(JuniorRobot.black, JuniorRobot.red, JuniorRobot.black, JuniorRobot.red, JuniorRobot.red);
    }
	
    @Override
    public void run(JuniorRobot robot)
    {
        robot.turnAheadLeft(100, 45);
        robot.turnGunRight(360);
        robot.back(75);
        robot.turnGunRight(360);
    }

    @Override
    public void onScannedRobot(JuniorRobot robot)
    {
        System.out.println("onScannedRobot");
		if (robot.scannedDistance != -1) {
	    	System.out.println(robot.scannedDistance);
	    	int distance = robot.scannedDistance;
	    	robot.turnGunTo(robot.scannedAngle);
			if (distance < 50) {
		    	System.out.println("200");
		    	robot.fire(4);
	    	}else if (distance < 100) {
		    	System.out.println("400");
		    	robot.fire(3);
	    	} else if (distance < 200) {
		    	System.out.println("600");
	    		robot.fire(2);
	    	}  else if (distance < 350) {
		    	System.out.println("800");
	    		robot.fire(1);
	    	} else {
	    		robot.fire(0.5);
	    	}
	    	robot.ahead(20);
		}
    }

    @Override
    public void onHitByBullet(JuniorRobot robot)
    {
        System.out.println("onHitByBullet");
    	robot.turnRight(45);
    	robot.ahead(300);
    }

    @Override
    public void onHitWall(JuniorRobot robot)
    {
        System.out.println("onHitWall");
        robot.turnRight(180);
    	robot.ahead(100);
    }
}
