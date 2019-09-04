package laboratorio14;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot14 extends JuniorRobot
{
	//private IStrategy strategy = new TestStrategy();
	//private IStrategy strategy = new TurretStrategy();
	private IStrategy strategy = new BlackMambaStrategy();
	//private IStrategy strategy = new PowerFireStrategy();
	
	@Override
	public void run()
	{
		this.strategy.paint(this);
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