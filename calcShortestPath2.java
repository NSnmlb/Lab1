package ʵ��һ;

public class calcShortestPath2 {
	public static String calcShortestPath2(String word)
    {
    	int i,j,q;
    	int pre[],dist[][];
    	pre=new int[99];
    	dist=new int[99][99];
    	for (i=0;i<k;i++)
    	{
    		for (j=0;j<k;j++)
    		{
    			dist[i][j]=Linjie[i][j];
    			if (dist[i][j]!=99)
    			{
    				pre[j]=i;
    			}
    			else 
    				pre[j]=-1;
    		}
    	}
    	for(q=0;q<k;q++)
    	{
    		for (i=0;i<k;i++)
	    	{
	    		for (j=0;j<k;j++)
	    		{
	    			if((i!=j)&&(dist[i][j]>dist[i][q]+dist[q][j]))
	    			{
	    				dist[i][j] = dist[i][q] + dist[q][j];
	                    if(dist[i][j] != 99)
	                    {
	                        pre[j] = q;
	                        pre[q] = i;
	                    }
	                    else
	                        pre[j] = -1;
	    			}
	    			
	    		}
	    	}
    		
    	}
    	String  mystring=""; 
    	for (i=0;i<k;i++)
	    {
    		if (word.equals(word_list[i]))
    			break;
    	}
		for(j=0;j<k;j++)
		{
			if (dist[i][j]==99)
				continue;
			else if (i!=j)
			{	
				mystring=mystring+calcShortestPath(word,word_list[j])+"\r"+"ȨֵΪ:\r"+dist[i][j]+"\r";
				
			}   
		}
		mystring=mystring+"���ඥ�㲻�ɴ�";
	return mystring;
    }
}
