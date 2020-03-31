import java.util.Scanner;

public class main 
{

	public static void main(String[]args) 
	{
				
		Scanner kbd = new Scanner(System.in);
	
		char[] alphabet = {'0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String input = "";
		String message = "";
		int checkSum = 0; 
		
			System.out.println("Enter the input to be encoded: ");
			input = kbd.next();
			input = input.toUpperCase();
	
		
		
		
			for (int i = 0; i < input.length(); i++ ) 
			{
				char codeLetter = input.charAt(i);
				checkSum += (int)codeLetter; 
				
					for(int j = 1; j <= 26; j++) 
						{
							if(codeLetter == alphabet[j])
								{
									message +="" + j + "-";
								}				
						}
			
			}
			
			System.out.println("Your encoded message is: " + message);
			System.out.println("The sum of the message is: " + checkSum);
		
	}

}
