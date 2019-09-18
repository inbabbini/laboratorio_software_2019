package laboratorio14.Strategies;

import robocode.JuniorRobot;

public class EscapeStrategy implements IStrategy {

	@Override
	public void paint(JuniorRobot robot) {
		robot.setColors(JuniorRobot.white, JuniorRobot.white, JuniorRobot.white, JuniorRobot.white, JuniorRobot.white);
	}

	@Override
	public void run(JuniorRobot robot) {
		robot.turnAheadLeft(200,45);
	}

	@Override
	public void onScannedRobot(JuniorRobot robot) {
		robot.turnAheadRight(300,90);

	}

	@Override
	public void onHitByBullet(JuniorRobot robot) {
		robot.turnAheadRight(500,90);

	}

	@Override
	public void onHitWall(JuniorRobot robot) {
    	robot.back(150);
        robot.turnBackRight(10, 90);
	}

}
