package AliAndSaeed;

import java.util.Random;

public class Config {
	public float turnPrecautionDistance=45;
	public float maxSpeedTurn=160;
	public float maxSpeedStraightRoad=173;
	public float turnSpeedConstant = (float)1.35;
	public float brakeConst = (float) 1.5;
	public float accConst = (float) 1.5;
	
	Random rand = new Random();
	
	//0:20280
	
	float[] bRCarray = new float [] { (float)1.00, (float)1.10, (float)1.20, (float)1.30, (float)1.40, (float)1.50, (float)1.60, (float)1.70, (float)1.80, (float)1.90, (float)2.00 };
	float[] aCCarray = new float [] { (float)1.00, (float)1.10, (float)1.20, (float)1.30, (float)1.40, (float)1.50, (float)1.60, (float)1.70, (float)1.80, (float)1.90, (float)2.00, (float)2.10 };
	float[] tPDarray = new float [] { 25, 30, 35, 40, 45, 50, 55, 60 }; //8
	float[] mSTarray = new float [] { 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180 };//13
	float[] mSSRarray = new float [] { 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 210, 220 };//15
	float[] tSCarray = new float [] { (float) 1.0, (float) 1.05, (float) 1.10, (float) 1.15, (float) 1.20, (float) 1.30,
			(float) 1.35, (float) 1.40, (float) 1.45, (float) 1.50, (float) 1.60, (float) 1.70, (float) 1.80 }; // 13
	
	public void SetNextIteration(int i)
	{
		int index_tPDarray =  i % tPDarray.length;
		
		int index_mSTarray =  i % mSTarray.length;
		
		int index_mSSRarray =  i % mSSRarray.length;
		
		int index_tSCarray = i % tSCarray.length;
		
		//int index_bRCarray = i % bRCarray.length;
		
		//int index_aCCarray = i % aCCarray.length;
		
		if(i >= (tPDarray.length*mSTarray.length*mSSRarray.length*tSCarray.length) || i == -1)  //bRCarray.length*aCCarray.length
		{	
			System.out.println("Out of tray... invalid input... Setting manual inputs... \n\ti="+i);
			
			turnPrecautionDistance=45;
			maxSpeedTurn=160;
			maxSpeedStraightRoad=173;
			turnSpeedConstant = (float)1.35;
			brakeConst = (float) 1.5;
			accConst = (float) 1.5;
			
			
			//printConfig();
		}
		else
		{	
			//System.out.println("\ti="+i);
			turnPrecautionDistance=  tPDarray[index_tPDarray];
			maxSpeedTurn=            mSTarray[index_mSTarray];
			maxSpeedStraightRoad=    mSSRarray[index_mSSRarray];
			turnSpeedConstant =      tSCarray[index_tSCarray];	
			//brakeConst =			 bRCarray[index_bRCarray];
			//accConst = 				 aCCarray[index_aCCarray];
			
			//printConfig();
		}
	}
	
	public void printConfig()
	{
		//System.out.println("Current Settings:");
		System.out.println("\tTurn Precaution Distance: \t\t"+turnPrecautionDistance);
		System.out.println("\tMax Speed on Turn: \t\t\t"+maxSpeedTurn);
		System.out.println("\tMax Speed on Straight Road: \t\t"+maxSpeedStraightRoad);
		System.out.println("\tTurn Speed Constant Multiplier: \t"+turnSpeedConstant);
		//System.out.println("\tBrake Constant Multiplier: \t\t"+brakeConst);
		//System.out.println("\tAcceleration Constant Multiplier: \t"+accConst);
		
	}

	public int randInt(int min, int max) {

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}

/*
static String[] arrayA = new String [] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
static String[] arrayB = new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
static String[] arrayC = new String [] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }; 


static void next(int i)
{
	int indexA = ( i / (arrayB.length*arrayC.length)) % arrayA.length;
	int indexB = ( i / (arrayC.length)) % arrayB.length;
	int indexC = i % arrayC.length;
	
	if(i >= (arrayA.length*arrayB.length*arrayC.length))
		System.out.println("Out of tray");
	//else
		//System.out.println(arrayA[indexA]+"-"+arrayB[indexB]+"-"+arrayC[indexC]+"-");
}

*/