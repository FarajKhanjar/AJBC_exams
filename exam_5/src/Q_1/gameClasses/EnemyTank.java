package Q_1.gameClasses;

public class EnemyTank implements Enemy
{

	@Override
	public void turnEnemyRight() 
	{
		System.out.println("The Tank turned right");
		
	}

	@Override
	public void turnEnemyLeft() 
	{
		System.out.println("The Tank turned left");
		
	}

	@Override
	public void driveEnemyForward() 
	{
		System.out.println("The Tank driving forward");
		
	}

	@Override
	public void driveEnemyBackward() 
	{
		System.out.println("The Tank driving backward");
		
	}

	@Override
	public void fireEnemyAWeapon() 
	{
		System.out.println("The Tank is fire a weapon!!");
		
	}

}
