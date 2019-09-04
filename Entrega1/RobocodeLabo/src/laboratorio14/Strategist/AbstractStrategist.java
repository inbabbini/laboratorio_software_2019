package laboratorio14.Strategist;

import laboratorio14.Strategies.IStrategy;
import robocode.JuniorRobot;

public abstract class AbstractStrategist {
	
	static protected AbstractStrategist instance;
	
	public abstract AbstractStrategist GetInstance();
	
	public abstract IStrategy GetStrategy(JuniorRobot robot);
	
}
