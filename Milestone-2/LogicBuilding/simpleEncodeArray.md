![Screenshot 2022-07-06 225706](https://user-images.githubusercontent.com/56172886/177609132-b7421855-2a57-4805-9f66-a378fdaeaccb.png)

    
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
