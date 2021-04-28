
public class TVSeriesManager {
	public void add(TVSeries tvseries) {

		System.out.printf("Listeye Eklenen Dizi: %s \n", tvseries.name);
		
	}

	public void showInfo(TVSeries tvseries) {
		System.out.println("///////////////////");
		System.out.println("Film ID : " +  tvseries.id + "\n" + "Dizi ismi : " +  tvseries.name + "\n" + "Dizi Türü: "+  tvseries.type + "\n" + "Çýkýþ tarihi : " +  tvseries.year + "\n" + "IMDB Puaný : " +  tvseries.imdb);

	}
}
