![image](https://user-images.githubusercontent.com/56172886/177596942-b2a4c93a-dcb5-4e9e-a6da-1637d3cc8a36.png)
    
    
    int sum=0;
		String num = Integer.toString(input1);
		int len = num.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				sum += (int) Integer.parseInt(String.valueOf(num.charAt(j)));
			}
		}

		return sum;
