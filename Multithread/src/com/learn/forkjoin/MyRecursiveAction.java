package com.learn.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
	private static final long serialVersionUID = 1L;
	private long workload = 0;
	
	public MyRecursiveAction(long workload) {
		super();
		this.workload = workload;
	}

	@Override
	protected void compute() {
		
		if(this.workload > 16){
			System.out.println("Splitting Workload : "+this.workload );
			List<MyRecursiveAction> subTasks = new ArrayList<>();
			subTasks.addAll(createTask());
			
			for(MyRecursiveAction task:subTasks){
				task.fork();
			}
			
		}
		else{
			System.out.println("This task i am handling on my own with workload : " + this.workload);
		}
		
		
	}

	private List<MyRecursiveAction> createTask() {
		List<MyRecursiveAction> subTasks = new ArrayList<>();
		MyRecursiveAction t1 = new MyRecursiveAction(this.workload/2);
		subTasks.add(t1);
		MyRecursiveAction t2 =  new MyRecursiveAction(this.workload/2);;
		subTasks.add(t2);
		return subTasks;
	}

}
