![image](https://user-images.githubusercontent.com/56172886/178326987-02915448-a8c9-4784-8c68-31c84ecbba3d.png)
		
    // Write code here...
		int gap1 = input2-input1;
		int gap2 = input3-input2;
		int val=input3;

		if(input4 == 1)
			return input1;
		if(input4 == 2)
			return input2;
		if(input4 == 3)
			return input3;
			
		for(int i=0;i<input4-3;i++)
		{
			if(i%2 ==0)
				val += gap1;
			else
				val += gap2;

		}	

		return val;
