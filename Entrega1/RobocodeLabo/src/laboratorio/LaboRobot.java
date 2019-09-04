package laboratorio;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot extends JuniorRobot
{
	//private IStrategy strategy = new TestStrategy();
	private IStrategy strategy = new TurretStrategy();

	@Override
	public void run()
	{
		setColors(black, white, black, white, red);
		this.strategy.run(this);
		
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot()
	{
		
		this.strategy.onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet()
	{
		this.strategy.onHitByBullet(this);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall()
	{
		this.strategy.onHitWall(this);
	}	
}