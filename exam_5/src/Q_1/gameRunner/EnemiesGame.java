package Q_1.gameRunner;

import Q_1.gameClasses.BadHelicopter;
import Q_1.gameClasses.Enemy;
import Q_1.gameClasses.EnemyTank;
import Q_1.gameClasses.HelicopterAdapterEnemy;

public class EnemiesGame 
{
	protected void run()
	{
		BadHelicopter myBadHelicopter = new BadHelicopter();
		
		Enemy myTank = new EnemyTank();
		Enemy badHelicopterAdapter = new HelicopterAdapterEnemy(myBadHelicopter);
		
		System.out.println("========[Tank Enemy]==========\n");
		myTank.turnEnemyRight();
		myTank.turnEnemyLeft();
		myTank.driveEnemyForward();
		myTank.driveEnemyBackward();
		myTank.fireEnemyAWeapon();
		
		System.out.println("\n========['Adapter' Bad Helicopter Enemy]==========\n");
		
		badHelicopterAdapter.turnEnemyRight();
		badHelicopterAdapter.turnEnemyLeft();
		badHelicopterAdapter.driveEnemyForward();
		badHelicopterAdapter.driveEnemyBackward();
		badHelicopterAdapter.fireEnemyAWeapon();
		
	}
}