![image](https://user-images.githubusercontent.com/56172886/178419956-c3e7a8c4-432b-4cd2-b1a6-399a8816bb22.png)

		int sum=input1;
		for(int i=input1-1, j=0;i>0;i--, j++)
		{
			if((input2-1) == j%2)
				sum -= i;
			else
				sum += i;
		}

		return sum;
