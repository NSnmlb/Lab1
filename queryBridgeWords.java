package สตั้าป;

public class queryBridgeWords {
	 public static String queryBridgeWords(String word1, String word2)
		{
		    int i=0,flag=0,j=0,bridge;
		    String mystring1;
		    String word3 =new String();
		    word3 = word1.toLowerCase();
		    String word4 = word2.toLowerCase();
		    //System.out.println(word3);
			fina1=new int[99];
			for(int b=0;b<99;b++)
				fina1[b]=-3;
		    for (i=0;i<k;i++)
		    {
		    	
		       if (word3.equals(word_list[i]))
		    	{
		    	   
		    		for (j=0;j<k;j++)
		    		{
		    			if (word4.equals(word_list[j]))
		    			{
		    				flag=1;
		    				break;
		    			
		    			}
		    		}
		    	break;
		    	}
		    	
		    		
		    }
		  
		    if (flag==0)
		    {
		      return "No word1 or word2 in the graph!";
		    }
		    else
		    {   
		    	bridge=0;
		    	int v1,v2;
		    	int pre[],dist[];
		    	pre=new int[99];
		    	dist=new int[99];
		        for (v1=0;v1<k;v1++)
		    		{
		    			if(Linjie[i][v1]!=99)
		    			{
		    				if (v1==j)
		    				   continue;
		    			    pre[v1]=i;
		    				
		    			}
		    			else 
		    				pre[v1]=-1;
		    		}
		        for (v2=0;v2<k;v2++)
	    		{
	    			if(Linjie[v2][j]!=99)
	    			{
	    				if (v2==i)
	    				   continue;
	    				dist[v2]=j;
	    				
	    			}
	    			else 
	    				dist[v2]=-2;
	    		}
		        
		        mystring1 = "The bridge words from "+word1+" to "+word2+" is ";
		    	for(int l=0;l<k;l++)
		    	{ 
		    		for (int m=0;m<k;m++)
		    		{
		    			if((i==pre[l])&&(dist[m]==j)&&(l==m))
		    			{	
		    				mystring1=mystring1+word_list[l]+" ";
		    			    fina1[bridge++]=l;
		    			}
		    			
		    		}
		    	}
		    	//System.out.println(bridge);
		        if (fina1[0]==-3)
		        {
		        	return "No bridge words from "+word1+" to "+word2+"!" ;
		            
		        } 
		    }
		    return mystring1;
		}
}
