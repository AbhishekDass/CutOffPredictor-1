/*Class Model of all the branches available with their individual capacity*/
public class Branches 
{
	static StudentModel A7[]; static int sizeA7;
	static StudentModel AA[]; static int sizeAA;
	static StudentModel A3[]; static int sizeA3;
	static StudentModel A8[]; static int sizeA8;
	static StudentModel A1[]; static int sizeA1;
	static StudentModel A4[]; static int sizeA4;
	
	static double A7CutOff;
	static double AACutOff;
	static double A3CutOff;
	static double A8CutOff;
	static double A4CutOff;
	static double A1CutOff;
	
	/*Indices of Branches*/
	/*
	 * A7-0
	 * AA-1
	 * A3-2
	 * A8-3
	 * A4-4
	 * A1-5
	 */
	
	/*Creates Branches array based on their capacity*/
	public Branches(int capacity[])
	{
		A7 = new StudentModel[capacity[0]]; sizeA7 = 0;
		AA = new StudentModel[capacity[1]]; sizeAA = 0;
		A3 = new StudentModel[capacity[2]]; sizeA3 = 0;
		A8 = new StudentModel[capacity[3]]; sizeA8 = 0;
		A4 = new StudentModel[capacity[4]]; sizeA4 = 0;
		A1 = new StudentModel[capacity[5]]; sizeA1 = 0;
		
	}
	
	/*Returns the queried branch array (the list of students)*/
	public static StudentModel[] getBranch(String branchName)
	{
		if(branchName.equals("A7"))
			return A7;
		else if(branchName.equals("AA"))
			return AA;
		else if(branchName.equals("A3"))
			return A3;
		else if(branchName.equals("A8"))
			return A8;
		else if(branchName.equals("A4"))
			return A4;
		else if(branchName.equals("A1"))
			return A1;
		
		else
			return null;
	}
	
	/*Returns the number of filled seats of queried branch*/
	public static int getSizeOfBranch(String branchName)
	{
		if(branchName.equals("A7"))
			return sizeA7;
		else if(branchName.equals("AA"))
			return sizeAA;
		else if(branchName.equals("A3"))
			return sizeA3;
		else if(branchName.equals("A8"))
			return sizeA8;
		else if(branchName.equals("A4"))
			return sizeA4;
		else if(branchName.equals("A1"))
			return sizeA1;
		
		else
			return -1;
	}
	
	/*Increments size of the required branch*/
	{
	public static void incrementSizeOfBranch(String branchName) 
		if(branchName.equals("A7"))
			 sizeA7++;
		else if(branchName.equals("AA"))
			 sizeAA++;
		else if(branchName.equals("A3"))
			 sizeA3++;
		else if(branchName.equals("A8"))
			 sizeA8++;
		else if(branchName.equals("A4"))
			 sizeA4++;
		else if(branchName.equals("A1"))
			 sizeA1++;
		
	}
	
	/*Returns true iff all branches are full*/
	public static boolean allBranchesFull()
	{
		if((sizeA7 == A7.length) && (sizeAA == AA.length) && (sizeA3 == A3.length) && (sizeA8 == A8.length) && (sizeA4 == A4.length) && (sizeA1 == A1.length) )
			return true;
		else
			return false;
	}
	
	/*Adds the student to given branch array.*/
	public static void add(StudentModel student, String branchName)
	{
		getBranch(branchName)[getSizeOfBranch(branchName)] = student;
		incrementSizeOfBranch(branchName);
		student.allocate();
	}

  /*This prints the list of students who are allocated a branch.*/
	public static void printAllocatedStudents()
	{
		System.out.println("Printing allocation list...");
		System.out.println("Students allocated in A7 are "+ sizeA7);
		for(int i=0;i<sizeA7;i++)
		{
			System.out.println(A7[i].studentMailID +" : "+A7[i].cgpa);
		}
		System.out.println();
		
		System.out.println("Students allocated in AA are "+ sizeAA);
		for(int i=0;i<sizeAA;i++)
		{
			System.out.println(AA[i].studentMailID +" : "+AA[i].cgpa);
		}
		
		System.out.println();
		System.out.println("Students allocated in A3 are "+ sizeA3);
		for(int i=0;i<sizeA3;i++)
		{
			System.out.println(A3[i].studentMailID +" : "+A3[i].cgpa);
		}
	
		System.out.println();
		System.out.println("Students allocated in A8 are "+ sizeA8);
		for(int i=0;i<sizeA8;i++)
		{
			System.out.println(A8[i].studentMailID +" : "+A8[i].cgpa);
		}
		System.out.println();

		System.out.println("Students allocated in A4 are "+ sizeA4);
		for(int i=0;i<sizeA4;i++)
		{
			System.out.println(A4[i].studentMailID +" : "+A4[i].cgpa);
		}
		
		System.out.println();

		System.out.println("Students allocated in A1 are "+ sizeA1);
		for(int i=0;i<sizeA1;i++)
		{
			System.out.println(A1[i].studentMailID +" : "+A1[i].cgpa);
		}
	
	}
	
	public static void showCutOff()
	{
		A7CutOff = A7[sizeA7-1].cgpa;
		AACutOff = AA[sizeAA-1].cgpa;
		A3CutOff = A3[sizeA3-1].cgpa;
		A8CutOff = A8[sizeA8-1].cgpa;
		A4CutOff = A4[sizeA4-1].cgpa;
		A1CutOff = A1[sizeA1-1].cgpa;
		
		System.out.println("***RESULTS FOR CUT OFF***");
		System.out.println("A7 : "+A7CutOff);
		System.out.println("AA : "+AACutOff);
		System.out.println("A3 : "+A3CutOff);
		System.out.println("A8 : "+A8CutOff);
		System.out.println("A4 : "+A4CutOff);
		System.out.println("A1 : "+A1CutOff);
	
	}
}
