package edu.atria.B94java.arrays;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
				Student arr[]=new Student[5];
				arr[0]=new Student(11,"vaishnavi");
				arr[1]=new Student(12,"ishu");
				arr[2]=new Student(13,"fruity");
				arr[3]=new Student(14,"varsha");
				arr[4]=new Student(15,"bujjulu");
				for(Student s:arr) {
					System.out.println("age of the student is:"+s.getAge()+ " ");
					System.out.println("the name of the student is:"+s.getName());
				}
				

			}

		

	}


