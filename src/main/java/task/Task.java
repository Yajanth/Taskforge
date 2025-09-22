package task;

import java.time.LocalDateTime;

public class Task {
	
	private  int ID;
	private  int projectId;
	private String title;
	private TaskStatus Status;
	private Priotity priority;
	private int AssigneID;
	private  LocalDateTime createdAt = LocalDateTime.now();
	private  LocalDateTime updateAt;
	private  LocalDateTime dueDate;


	
	
}
