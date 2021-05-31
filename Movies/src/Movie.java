public class Movie {
    private String title;
    private String studio;
    private String rating;
    Movie(String title,String studio,String rating) {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio) {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }
    public static Movie[] getPG(Movie[] movies) {
        Movie[] movieRatingPG=new Movie[5];
        int itr,itr1=0;
        for(itr=0;itr<movies.length;itr++)
        {
            if(movies[itr].rating.toUpperCase().contains("PG"))
            {
                movieRatingPG[itr1++]=movies[itr];
            }
        }
        return movieRatingPG;
    }
    public static void main(String[] args) {
        Movie[] movies = new Movie[5];
        Movie[] movieRatingPG;
        boolean flag=false;
        movies[0]=new Movie("Casino Royale","Eon Productions","PG-13");
        movies[1]=new Movie("Baahubali","Raj Productions","U-15");
        movies[2]=new Movie("Harry Potter and the prosoner of Azkabaan","Warner Bros","pg-10");
        movies[3]=new Movie("Harry Potter and the Philosopher stone","Warner Bros","UA-11");
        movies[4]=new Movie("Harry Potter and the Half Blood Prince","Warner Bros");
        movieRatingPG=getPG(movies);
        for (Movie movie : movieRatingPG) {
            if (movie != null) {
                System.out.println("Title: "+movie.title + "\t" +"Studio: "+ movie.studio + " \t"+"Rating: " + movie.rating + "\n");
                flag=true;
            }
        }
        if(!flag)
        {
            System.out.println("No movies with rating PG");
        }
    }
}
