package laboratorio14.Strategist;

import laboratorio14.Strategies.*;
import robocode.JuniorRobot;

public class AggresiveStrategist extends AbstractStrategist {
	
	PowerFireStrategy powerFireStrategy;
	TurretStrategy turretStrategy;
	
	AggresiveStrategist()
	{
		powerFireStrategy = new PowerFireStrategy();
		turretStrategy = new TurretStrategy();
	}
	
	public static AggresiveStrategist GetInstance()
	{
		if (instance == null)
		{
			instance = new AggresiveStrategist();
		}
		
		return (AggresiveStrategist)instance;
	}

	@Override
	public IStrategy GetStrategy(JuniorRobot robot) {
		if (robot.energy < 20) return turretStrategy;
		else return powerFireStrategy;
	}

}
