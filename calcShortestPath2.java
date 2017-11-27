package 实验一;

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
				mystring=mystring+calcShortestPath(word,word_list[j])+"\r"+"权值为:\r"+dist[i][j]+"\r";
				
			}   
		}
		mystring=mystring+"其余顶点不可达";
	return mystring;
    }
}
