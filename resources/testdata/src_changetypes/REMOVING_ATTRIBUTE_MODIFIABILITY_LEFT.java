package test;

public class Test {
	
	public class Cinema {
		
		public String[] movieNames;
		public int[] saloonNumbers;
		public int capacity;
		public int saloonCap;
	
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
		
		public class cinemaCafe {
			public String[] loot;
			public int capacity;
			
			public cinemaCafe(int cap)
			{
				this.loot = new String[cap];
				this.capacity = cap;
			}
		}
	}
}
