import java.util.Scanner;
public class FakeBianary
	{

		public static void main(String[] args)
			{
				boolean playing = true;
				
				while(playing)
				{
					Scanner answer = new Scanner(System.in);
					System.out.println("Give me a number to put into bianary code");
					int result = answer.nextInt();
					System.out.println(fakeBianary(result));

				}
				
			}
		
		public static String fakeBianary(int x)
			{
				String number = Integer.toString(x);
				String [] numbers = number.split("");
				
				String [] returnArray = new String[numbers.length];
				
				for(int i = 0; i < numbers.length; i ++)
				{
					switch(numbers[i])
					{
					case "0":
					case "1":
					case "2":
					case "3":
					case "4":
							{
								returnArray[i] = Integer.toString(0);
								break;
							}
					default:
							{
								returnArray[i] = Integer.toString(1);
								break;
							}
						
					}
					
				}
				
				String result = String.join("", returnArray);
				return result;
			}

	}
