package Q_1.gameClasses;

public class HelicopterAdapterEnemy implements Enemy 
{
	BadHelicopter badHelicopter;

	//Constructor
	public HelicopterAdapterEnemy(BadHelicopter badHelicopter) 
	{
		this.badHelicopter = badHelicopter;
	}

	@Override
	public void turnEnemyRight() 
	{
		badHelicopter.yawHelicopterRight();	
	}

	@Override
	public void turnEnemyLeft() 
	{
		badHelicopter.yawHelicopterLeft();	
	}

	@Override
	public void driveEnemyForward() 
	{
		badHelicopter.flyHelicopterUp();	
	}

	@Override
	public void driveEnemyBackward() 
	{
		badHelicopter.flyHelicopterDown();	
	}

	@Override
	public void fireEnemyAWeapon() 
	{
		badHelicopter.launchAmissile();	
	}

}