package mypracties_pattern;

public class Trangal2 {

	public static void main(String[] args) {
      //*****                  //check no of star in first row =5
	  //****
	  //***
	  //**
	  //*
		int star=5;          
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		star--;
	}
	}

}
