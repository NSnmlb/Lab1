package 实验一;

public class calcShortestPath {
	public static String calcShortestPath(String word1, String word2)
    {
    	int v1,v2,i,j,q=0,min;
    	for (v1=0;v1<k;v1++)
    	{
    		if (word1.equals(word_list[v1]))
    			break;
    	}
    	for (v2=0;v2<k;v2++)
    	{
    		if (word2.equals(word_list[v2]))
    			break;
    	}
    	int pre[],fina[],dist[],path[];
    	pre=new int[99]; //用来记录最短路径所经过的顶点
    	fina=new int[99];//用来标志已选和未选的标志位
    	dist=new int[99];//路径上从顶点到下一个顶点的权重
    	path=new int[99];
    	for (j=0;j<k;j++)
    	{
    		dist[j]=Linjie[v1][j];
    		if (Linjie[v1][j]==0)
    			pre[j]=-1;
    		else 
    			pre[j]=v1;
    		fina[j]=0;//初始化
    	}
    	for (i=0;i<k;i++)
    	{
    		min=99;
    		for (j=0;j<k;j++)//找到最小值的顶点
    		{	
    			if ((fina[j]==0)&&(min>dist[j]))
    			{
    				min=dist[j];
    				q=j;
    			}  
    		}
    		if(min==99) //找不到顶点
    			break;
    		fina[q]=1; //标志为已选
    		for (j=0;j<k;j++)//更新最短路径
    		{
    			if ((fina[j]==0)&&(dist[j]>dist[q]+Linjie[q][j]))
    			{
    				dist[j]=dist[q]+Linjie[q][j];
    				pre[j]=q;
    			}
    					
    		}
    	}
    	if (pre[v2]==-1)
    	{
    		String a="不可达";
    		return a;		
    	}
    	j=v2;
    	i=0;
    	while(j!=v1)
    	{
    		path[i]=j;
    		j=pre[j];
    		i++;
    		
    	}
    	//System.out.println(word_list[path[i-1]]);
    	String str4="";
    	if (word2.equals(word_list[path[i-1]]))
    	{
    		str4=word1+" -> "+word2;
    	}
    	else
    	{   
    		str4=word1;
    		for (q=i-1;q>0;q--)
    		{
    			str4=str4+" -> "+word_list[path[q]];
    		}
    		str4=str4+" -> "+word2;
    	}
		return str4;
    }
}
