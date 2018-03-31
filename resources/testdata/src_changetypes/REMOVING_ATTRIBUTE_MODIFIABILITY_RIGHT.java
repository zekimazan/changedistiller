package test;

public class Test {
	
	public class Cinema {
		
		private String[] movieNames;
		private int[] saloonNumbers;
		private int capacity;
		private int saloonCap;
	
		public Cinema(int cap)
		{
			movieNames = new String[cap];
			saloonNumbers = new int[cap];
			this.capacity = cap;
		}
		
		public void fillSaloon() {
			for(int i = 0; i < this.capacity;i++)
				saloonNumbers[i] = i+1;
		}
		public void setMovie(int saloon,String movieName)
		{
			this.movieNames[saloon] = movieName;
		}
		public String getMovieName(int saloon)
		{
			if(movieNames[saloon] != null)
				return movieNames[saloon];
			else
				return "Empty";
		}
	}
}
