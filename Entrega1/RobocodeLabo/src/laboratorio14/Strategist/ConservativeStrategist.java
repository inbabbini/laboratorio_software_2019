package laboratorio14.Strategist;

import laboratorio14.Strategies.*;
import robocode.JuniorRobot;

public class ConservativeStrategist extends AbstractStrategist {

	BlackMambaStrategy blackMambaStrategy;
	EscapeStrategy escapeStrategy;
	
	ConservativeStrategist()
	{
		blackMambaStrategy = new BlackMambaStrategy();
		escapeStrategy = new EscapeStrategy();
	}
	
	public static ConservativeStrategist GetInstance()
	{
		if (instance == null)
		{
			instance = new ConservativeStrategist();
		}
		
		return (ConservativeStrategist)instance;
	}

	@Override
	public IStrategy GetStrategy(JuniorRobot robot) {
		if (robot.energy < 20) return escapeStrategy;
		else return blackMambaStrategy;
	}

}
