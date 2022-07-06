    ![Image](https://user-images.githubusercontent.com/56172886/177608828-fc3bab03-7fdb-4a55-a22d-6ca74d5e71ac.png)

    
    //Write code here...
		int[] arr = new int[input2];
		arr[input2-1]=input1[input2-1];
		int sum=arr[input2-1];
		
		for(int i=input2-2;i>=0;i--)
		{
			arr[i] = input1[i]-arr[i+1];
			sum += arr[i];
		}

		Result obj = new Result(arr[0], sum);
        return obj;
