![Screenshot 2022-07-07 015405](https://user-images.githubusercontent.com/56172886/177636617-614ea820-0522-43a5-8254-b0dd330b3235.png)
    
    
    	// Write code here...
		/*BigDecimal inp1 = new BigDecimal(input1);
		BigDecimal inp2 = new BigDecimal(input2);

		return String.valueOf(inp1.add(inp2));*/

		int len1 = input1.length();
		int len2 = input2.length();
		int lesser = (len1<len2?len1:len2);
		int greater = (len1>len2?len1:len2);
		int sum=0;
		int carry=0;
		String add = "";
		String greatValue = len1>len2?input1:input2;

		for(int i=0;i<greater;i++)
		{
			if(i<lesser)
			{
				sum = Character.getNumericValue(input1.charAt(len1-i-1)) + Character.getNumericValue(input2.charAt(len2-i-1)) + carry;
				
			}
			else
			{
				sum = Character.getNumericValue(greatValue.charAt(greater-i-1)) + carry;
				
			}
			if(sum/10 != 0)
			{
				carry = sum/10;
				sum = sum%10;
			}
			else
			{
				carry = 0;
			}
			add = sum + add;
		}

		return add;
