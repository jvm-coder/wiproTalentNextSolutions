![image](https://user-images.githubusercontent.com/56172886/178421967-36f7aead-809a-4001-95ce-54188ef3967c.png)

		// Write code here...
		int sum=0;
		for(int i=0;i<input1.length;i++)
			if(!(isPrime(i)))
				sum += input1[i];

		return sum;
	}

	public boolean isPrime(int num)
	{
		if(num<2)
			return false;

		for(int i=2;i<=(int)Math.sqrt(num);i++)
			if(num%i == 0)
				return false;
			
		return true;
