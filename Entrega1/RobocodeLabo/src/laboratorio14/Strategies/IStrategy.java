package laboratorio14.Strategies;
import robocode.*;

public interface IStrategy
{
	public void paint(JuniorRobot robot);
	
    public void run(JuniorRobot robot);

    public void onScannedRobot(JuniorRobot robot);

    public void onHitByBullet(JuniorRobot robot);

    public void onHitWall(JuniorRobot robot);
}
