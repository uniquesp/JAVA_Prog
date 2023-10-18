//Random no
import java.util.*;
import java.util.Random;
class randomGenrator
{
	public static void main(String[] args)
	{
		
		/*List<Integer> numberList = new ArrayList<>();
			for(int i=11; i<=99; i++){
				numberList.add(i);    
			}
		Collections.shuffle(numberList);
			for(int j=0; j<50; j++){
				System.out.println(numberList.get(j));
			}*/	
		
		
		
		Set<Integer> s = new HashSet<Integer>();
		Random rand = new Random();
		while (s.size() < 50) 
		{
			int num = rand.nextInt(89) + 10;// range between 10 and 99.
			s.add(num);
			System.out.println(num);
		}
		
		/*int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }*/
		
		/*Random rand = new Random();
        int value = rand.nextInt(89) + 10;
        for(int i=1; i<=50; i++)
        {
            System.out.println(rand.nextInt(value));
		}*/
	}
}
		