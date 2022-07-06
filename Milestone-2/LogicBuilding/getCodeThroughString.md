![Screenshot 2022-07-07 004939](https://user-images.githubusercontent.com/56172886/177626441-9a4b17f4-ed12-46a3-bda3-4872def23632.png)

    
    		// Write code here...
		int pin=0;
		String[] arr = input1.split(" ");

		for(String str : arr)
			pin += str.length();

		while(true)
		{
			int temp=pin;
			pin=0;
			while(temp>0)
			{
				pin += temp%10;
				temp /= 10;
			}
			if(pin/10 == 0)
				break;
		}
		
		return pin;
