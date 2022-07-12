package MockPracties;
public class BookInfoRecord {
	public static void main(String[] args) {
		System.out.println("******************");
		System.out.println("bookes in library");
		System.out.println("******************");

		BookInfoRecord bif=new BookInfoRecord();
		bif.bookinfo("A Secular Agenda", "S.S.Kohali", 300, 680, 'A');
		System.out.println("-------------------");
		bif.bookinfo("Arthashastra", "Kautilya", 500, 560, 'B');
		System.out.println("-------------------");
		bif.bookinfo("Ashtadhyayi", "panini", 670, 899, 'c');
}
public void bookinfo(String bookname,String authername,int bookprice,float bookpages,char catSeries)
{
	System.out.println("Book Name       :"+bookname);
	System.out.println("Author Name     :"+authername);
	System.out.println("price of Book   :"+bookprice);
	System.out.println("Pages in book   :"+bookpages);
	System.out.println("catloges series :"+catSeries);
}
}
