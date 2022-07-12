package pattern_program;

public class Trangal1 {

	public static void main(String[] args) {
    //*
	//**
	//***
	//****
		int star=1;
		for(int i=1;i<=4;i++) //row  1, 2 3
		{
			for(int j=1;j<=star;j++)// star=1 , star=2 , star=3 ,star=4
			{
				System.out.print("*");   //*  ,**,  ***, ****
			}
			System.out.println();
			star++;          // star =2  ,3 ,4 
		}

	}

}
