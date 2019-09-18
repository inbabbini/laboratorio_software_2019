package laboratorio14;
import laboratorio14.Strategist.*;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot14 extends JuniorRobot
{
	// Strategies
	//private IStrategy strategy = new TestStrategy();
	//private IStrategy strategy = new TurretStrategy();
	//private IStrategy strategy = new BlackMambaStrategy();
	//private IStrategy strategy = new PowerFireStrategy();
	
	//AggresiveStrategist strategist;
	ConservativeStrategist strategist;
	
	public LaboRobot14() {
		strategist = strategist.GetInstance();
	}
	
	@Override
	public void run()
	{
		strategist.GetStrategy(this).paint(this);
		strategist.GetStrategy(this).run(this);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot()
	{
		strategist.GetStrategy(this).onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet()
	{
		strategist.GetStrategy(this).onHitByBullet(this);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall()
	{
		strategist.GetStrategy(this).onHitWall(this);
	}	
}