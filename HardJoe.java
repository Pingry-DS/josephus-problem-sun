import java.util.ArrayList;
public class HardJoe {

  public static void main(String[] args) 
  {
		int num = Integer.parseInt(args[0]);
		ArrayList<Integer> arr = new ArrayList<Integer>(num);
		
		for(int i = 1; i <= num; i++)
		{
			arr.add(i);
		}
		
		int victim = num/2;
		arr.remove(victim);
		
		
		while(arr.size() > 1)
		{
			if(victim < arr.size())
			{
				if(arr.size()%2 == 0)
				{
					victim++;
					if(victim < arr.size())
						arr.remove(victim);
					else
					{
						victim = 0;
						arr.remove(victim);
					}
				}
				else
					arr.remove(victim);
			}
			
			else
				victim = 0;
				

		}
		int survivor = arr.get(0);
		System.out.println("Person #" + survivor + " survived." );
		
		
		
  }

}
