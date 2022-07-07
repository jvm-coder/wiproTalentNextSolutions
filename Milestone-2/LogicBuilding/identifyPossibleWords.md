![Screenshot 2022-07-07 225226](https://user-images.githubusercontent.com/56172886/177833169-64575578-1ac3-4b0d-980a-90a43f35a939.png)

    
    // Write code here...
		String output="";
		input1 = input1.toUpperCase();
		input2 = input2.toUpperCase();
		String arr[] = input2.split(":");
		int ind = input1.indexOf('_');
		for(String str : arr)
		{
			if(input1.length() == str.length() && input1.replace('_', str.charAt(ind)).equals(str))
			{
				output += str+":";
			}
		}

		if(output.length() != 0)
			return output.substring(0,output.length()-1);
		else
			return "ERROR-009";
