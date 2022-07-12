![image](https://user-images.githubusercontent.com/56172886/178429048-a0918c9b-1425-49b0-9285-a7765934a6b5.png)

![image](https://user-images.githubusercontent.com/56172886/178429256-732bdb57-2a0a-4652-a8ca-ded7d2d55eb0.png)		// Write code here...
		
		// Write code here...
    String smaller="";
		String longer="";
		String userId="";
		
		if(input1.length() == input2.length())
		{
			if((input1.toLowerCase()).compareTo(input2.toLowerCase()) < 0)
			{
				smaller = input1;
				longer = input2;
			}
			else
			{
				smaller = input2;
				longer = input1;
			}
		}
		else
		{
			longer = (input1.length()>input2.length()) ? input1 : input2;
			smaller = (input1.length()<input2.length()) ? input1 : input2;
		}

		int slen = smaller.length();
		String pin = String.valueOf(input3);

		userId = smaller.charAt(slen-1)+longer+ (pin.charAt(input4-1))+ (pin.charAt(pin.length()-input4));
		return switchCase(userId);
	}

	public String switchCase(String str)
	{
		String nstr="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				nstr += (Character.toLowerCase(ch));
			else if(Character.isLowerCase(ch))
				nstr += (Character.toUpperCase(ch));
			else
				nstr += ch;
		}

		return nstr;
	}
}

		// Write code here...
		String smaller="";
		String longer="";
		String userId="";
		
		if(input1.length() == input2.length())
		{
			if((input1.toLowerCase()).compareTo(input2.toLowerCase()) < 0)
			{
				smaller = input1;
				longer = input2;
			}
			else
			{
				smaller = input2;
				longer = input1;
			}
		}
		else
		{
			longer = (input1.length()>input2.length()) ? input1 : input2;
			smaller = (input1.length()<input2.length()) ? input1 : input2;
		}

		int slen = smaller.length();
		String pin = String.valueOf(input3);

		userId = smaller.charAt(slen-1)+longer+ (pin.charAt(input4-1))+ (pin.charAt(pin.length()-input4));
		return switchCase(userId);
	}

	public String switchCase(String str)
	{
		String nstr="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				nstr += (Character.toLowerCase(ch));
			else if(Character.isLowerCase(ch))
				nstr += (Character.toUpperCase(ch));
			else
				nstr += ch;
		}

		return nstr;
	}
}
