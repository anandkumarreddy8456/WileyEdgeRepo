package day7_practise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
public class Forkclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//class Fib{
//	int number1;
//	
//	Fib(int num){
//		
//	}
//	public static void main(String []args) {
//		
//	}
//	public int Fiba(int num) {
//		if(num<=1) {
//			return 1;
//		}else {
//			Fib n1=new Fib(num-1);
//			Fib n2=new Fib(num-2);
//			n1.solve();
//			n2.solve();
//			return n1.number1+n2.number1;
//		}
//	}
//	public void solve() {
//		number1=number1-1;
//	}
//}

//class Fiba extends RecursiveTask<Integer>{
//	 int num ;
//	public Fiba(int num) {
//		this.num=num;
//	}
//	@Override
//	protected Integer compute() {
//		if(num<=1) {
//			return num;
//		}
//		Fiba f1=new Fiba(num-1);//sub-task 01
//		f1.fork();
//		Fiba f2=new Fiba(num-2);// sub-task 02
//		f2.fork();
//		return f2.join()+f1.join();// join 
//	}
//	
//	
//}


class NewTask extends RecursiveAction
{
	private long Load = 0;
	
	public NewTask(long Load) { this.Load = Load; }

	protected void compute()
	{
		// fork tasks into smaller subtasks
		List<NewTask> subtasks = new ArrayList<NewTask>();
		subtasks.addAll(createSubtasks());
		
		for (RecursiveAction subtask : subtasks) {
			subtask.fork();
		}
	}
	
	// function to create and add subtasks
	private List<NewTask> createSubtasks()
	{
		// create subtasks
		List<NewTask> subtasks = new ArrayList<NewTask>();
		NewTask subtask1 = new NewTask(this.Load / 2);
		NewTask subtask2 = new NewTask(this.Load / 2);
		NewTask subtask3 = new NewTask(this.Load / 2);
		
		// to add the subtasks
		subtasks.add(subtask1);
		subtasks.add(subtask2);
		subtasks.add(subtask3);
		
		return subtasks;
	}
}
 class JavaForkJoingetActivethreadcountExample1 {
	public static void main(final String[] arguments)
		throws InterruptedException
	{
		// get no. of available core available
		int proc = Runtime.getRuntime().availableProcessors();
		
		System.out.println("Number of available core in the processor is: "
			+ proc);
			
		// get no. of threads active
		ForkJoinPool Pool = ForkJoinPool.commonPool();
		
		System.out.println("Number of active thread before invoking: "
			+ Pool.getActiveThreadCount());
			
		NewTask t = new NewTask(400);
		
		Pool.invoke(t);
		
		System.out.println("Number of active thread after invoking: "
			+ Pool.getActiveThreadCount());
		System.out.println("Common Pool Size is: "
						+ Pool.getPoolSize());
	}
}
