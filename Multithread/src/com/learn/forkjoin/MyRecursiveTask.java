package com.learn.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long> {

	private static final long serialVersionUID = -3949366590322496834L;
	private long workload = 0;

	public MyRecursiveTask(long workload) {
		this.workload = workload;
	}

	@Override
	protected Long compute() {

		if (workload > 16) {
			List<MyRecursiveTask> tasks = new ArrayList<>();
			tasks.addAll(createSubTasks());
			System.out.println("Workload is "+this.workload + " therefore splitting...");
			for (MyRecursiveTask task : tasks) {
				task.fork();
			}

			long result = 0;

			for (MyRecursiveTask task : tasks) {
				result += task.join();
			}

			return result;

		} else {
			System.out.println("Thread "+ Thread.currentThread().getName()+" independently handling with workload :: "+ this.workload);
			return workload * 3;
		}

	}

	private List<MyRecursiveTask> createSubTasks() {
		List<MyRecursiveTask> task = new ArrayList<>();
		task.add(new MyRecursiveTask(this.workload / 2));
		task.add(new MyRecursiveTask(this.workload / 2));
		return task;
	}
}