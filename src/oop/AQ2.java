package oop;

public class AQ2 {
    public static void main(String[] args) {
        Movie m1=new Movie("3 idiot","xyz","5 Star");
        Movie m2=new Movie("kgf","abc");
        Movie m3=new Movie("rrr","xyz","4 Star");
        Movie m4=new Movie("pushpa","pqr");
        Movie m5=new Movie("abcd","mno","1 Star");
        Movie[] movies=new Movie[5];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;
        movies[4]=m5;

        Movie[] res=get5StarMovies(movies);
        for (Movie m : res){
            if (m==null){
                return;
            }
            System.out.println(m.title+" ");
        }



    }

    private static Movie[] get5StarMovies(Movie[] movies) {
        Movie[] res = new Movie[movies.length];
        int i=0;
        for (Movie m : movies){
            if (m.rating=="5 Star"){
                res[i]=m;
                i++;
            }
        }
        return res;
    }
}
class Movie{
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 Star";
    }
}