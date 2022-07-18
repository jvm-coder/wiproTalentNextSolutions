![Screenshot 2022-07-07 002831](https://user-images.githubusercontent.com/56172886/177623488-e39fdeeb-5cc9-45a3-8553-a92c2a33ebd2.png)
		
		int sum=0;
		String sumStr="";
		input1 = input1.toUpperCase();
	    	String[] arr = input1.split(" ");
		for(String word : arr)
		{
			int len=word.length();
			for(int i=0;i<len/2;i++)
			{
				sum += Math.abs(((int)word.charAt(i)-64) - ((int)word.charAt(len-i-1)-64));
			}
			if(len%2 != 0)
			{
				sum += (int)word.charAt(len/2)-64;
			}
			sumStr += (sum);
			sum=0;
		}

		return Integer.valueOf(sumStr);
