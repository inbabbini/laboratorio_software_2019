package laboratorio14.Strategist;

import laboratorio14.Strategies.IStrategy;
import robocode.JuniorRobot;

public class AggresiveStrategist extends AbstractStrategist {
	
	
	private AggresiveStrategist()
	{
		super();
	}
	
	public static AbstractStrategist GetInstance()
	{
		if (instance == null)
		{
			instance = new AggresiveStrategist();
		}
		
		return (AggresiveStrategist)instance;
	}

	@Override
	public Boolean ShouldChangeStrategyFor(JuniorRobot robot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStrategy GetStrategy(JuniorRobot robot) {
		// TODO Auto-generated method stub
		return null;
	}

}
