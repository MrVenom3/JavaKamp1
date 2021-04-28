
public class Main {
	

		public static void main(String[] args) {

			TVSeries TVSeries1 = new TVSeries(1, "A Dizisi", "Polisiye", 2001, 7.1);
			TVSeries TVSeries2 = new TVSeries(2, "B Dizisi", "Bilim-Kurgu", 2005, 8.2);
			TVSeries TVSeries3 = new TVSeries(3, "C Dizisi", "Aksiyon", 2019, 7.4);

			TVSeries[] tvseries = { TVSeries1, TVSeries2, TVSeries3 };
			
				
			for (TVSeries TVSeries : tvseries) {
				System.out.println(TVSeries.name);
			}
			
			Category category1 = new Category(1, "Polisiye");
			
			Category category2 = new Category(2,"Bilim-Kurgu");
			
			Category category3 = new Category(3,"Aksiyon");
			
			Category[] categories = {category1 , category2 , category3};
			
			CategoryControl categoryControl = new CategoryControl();
			
			
			
			for (Category category : categories) {
				 categoryControl.showCategories(category);
			}
			
			TVSeriesManager tvseriesManager = new TVSeriesManager();
			
			tvseriesManager.add(new TVSeries(1,"D Dizisi ","Polisiye , Gerilim",2000,8));
			tvseriesManager.showInfo(TVSeries2);
			
			categoryControl.add(new Category(4, "Gençlik"));
		}
		
	}


