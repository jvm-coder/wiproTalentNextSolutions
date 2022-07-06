HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int maxKey=0;
		int maxVal=0;

		for(int num : input1)
		{
			while(num>0)
			{
				int rem = num%10;
				if(mp.containsKey(rem))
				{
					mp.put(rem, mp.get(rem)+1);
				}
				else
				{
					mp.put(rem, 1);
				}
				num /= 10;
			}
		}

		for(Map.Entry ele : mp.entrySet())
		{
			if((int)ele.getValue() > maxVal)
				maxVal = (int) ele.getValue();
		}

		for(Map.Entry ele : mp.entrySet())
		{
			if((int)ele.getValue() == maxVal)
				if((int) ele.getKey() > maxKey)
					maxKey = (int) ele.getKey();
		}

		return maxKey;
