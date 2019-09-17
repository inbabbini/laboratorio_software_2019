package laboratorio14.Strategist;
import java.util.Collection;
import laboratorio14.Strategies.IStrategy;
import robocode.JuniorRobot;

public abstract class AbstractStrategist {
	
	static protected AbstractStrategist instance;
	
	static protected Collection<IStrategy> strategies;
	
	public static AbstractStrategist GetInstance() throws Exception { throw new Exception("Not Implemented!"); };
	
	public abstract Boolean ShouldChangeStrategyFor(JuniorRobot robot);
	
	public abstract IStrategy GetStrategy(JuniorRobot robot);
}
