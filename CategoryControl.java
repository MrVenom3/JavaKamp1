
public class CategoryControl {
public void add(Category category) {
		
		System.out.printf("Listeye Yeni Kategori Eklendi : %s ",category.name);
	}
	
	public void showCategories(Category category) {
	
		
		System.out.println("//////////////");
		System.out.println("Kategory ID : "
		+ category.id +
		"\n"+"Kategori Ýsmi : "+
		category.name);
	}
}

