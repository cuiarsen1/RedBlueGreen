import java.util.ArrayList;
import java.util.Random;

public class GameSimulator {

	public static void main(String[] args) {
		
		int threeDrawnCount = 0;
		int fiveDrawnCount = 0;
		
		for (int j = 0; j < 10; j += 1)
		{
			Random random = new Random();
			
			ArrayList<String> list = new ArrayList<String>();
			
			// 0 = Red, 1 = Blue, 2 = Green
			
			for (int i = 0; i < 5; i += 1)
			{
				list.add("R");
			}
			
			for (int i = 0; i < 5; i += 1)
			{
				list.add("B");
			}
			
			for (int i = 0; i < 5; i += 1)
			{
				list.add("G");
			}
			
			int drawNum = 0;
			
			int drawRoll = random.nextInt(15);
			
			if (drawRoll <= 9 && drawRoll >= 0)
				drawNum = 3;
			else if (drawRoll <= 14 && drawRoll >= 10)
				drawNum = 5;
			
			if (drawNum == 3)
				threeDrawnCount += 1;
			else if (drawNum == 5)
				fiveDrawnCount += 1;
			
			String s = "";
			
			int drawAvailable = 15;
			
			for (int i = 0; i < drawNum; i += 1)
			{
				int drawIndex = random.nextInt(drawAvailable);
				String drawnCard = list.get(drawIndex);
				
				list.remove(drawIndex);
				
				s += drawnCard + " ";
				
				drawAvailable -= 1;
			}
			
			System.out.println(s);
		}
		
		System.out.println("Number of times 3 cards drawn: " + threeDrawnCount);
		System.out.println("Number of times 5 cards drawn: " + fiveDrawnCount);
		
	}

}
