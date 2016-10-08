import java.util.*;
public class test {
	int res_sum=0;
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		int array[]={1,5,10,20,30,15,28,30};
		c2 c= new c2();
		Integer num2=new Integer(0);
		c.check(array,list,num2);
		//int num2=100;
		c.print(list,num2);
	}
}
class c2
{
	 void print(ArrayList<Integer> res, Integer pos)
	{
		System.out.println("The position is "+pos+"\n"+res.toString());
	}
	 void check(int[] array,ArrayList<Integer> list,Integer pos)
	{
		 pos=new Integer(40);
		 return;
		/*if(pos>=array.length)
			return;
		list.add(array[pos.intValue()]);
		if(pos.intValue()==array.length-1)
		{
			print(list,pos);
			return;
		}

		/*if(array[pos]>array[pos+1])
		{
			System.out.println("before removing last element   ");
			pos=new Integer(pos+1);
			print(list,pos);
			check(array,list,pos+1);
			System.out.println("after removing last element   ");
			list.remove(list.size()-1);	
			//pos=pos.intValue()+1;
			
			print(list,pos);
		}
		else
		{
			pos=new Integer(pos+1);
			check(array,list,pos);
		//}*/

	}

}
