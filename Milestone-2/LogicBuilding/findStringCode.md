    		![Screenshot 2022-07-07 002831](https://user-images.githubusercontent.com/56172886/177623354-8d20ec5d-ef9d-408f-a803-0df1a05e0307.png)

		
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
