package oopOdev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"c# geliştirici kursu","Engin demiroğ", 0  );
		
		Course course2 = new Course(2, "java geliştirici kursu", "Engin demiroğ", 32);

		
		
		Course[] courses = new Course[] {course1 ,course2 };
		
		for (Course course : courses) {
			
			 System.out.println(course.name + ": tamamlandı");
		}
		
		System.out.println("-----------------");
		
	
		Instructr instructr1 = new Instructr(3,"Engin Demiroğ");
		
		Instructr[] instructrs = new Instructr[] {instructr1};
		
		
		for (Instructr instructr : instructrs) {
			
            System.out.println("Eğitmeni: " + instructr.name);			  
		}
		
		
		System.out.println("-----------------");
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.nextLesson(course1);
		courseManager.previousLesson(course2);
		
		
	}
	
	
	

}
