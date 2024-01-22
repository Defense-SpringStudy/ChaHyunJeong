package class1;

public class MovieReviewMain {

    String title;
    String review;

    public static void main(String[] args) {

        MovieReviewMain movie1 = new MovieReviewMain();
        MovieReviewMain movie2 = new MovieReviewMain();

        movie1.title = "앨리멘탈";
        movie1.review = "good";
        movie2.title = "신과함께";
        movie2.review = "worst";

        System.out.println(movie1.title+movie1.review);
        System.out.println(movie2.title+movie2.review);

        //배열로 풀기
        MovieReviewMain[] movies = new MovieReviewMain[2];

        movies[0] = movie1;
        movies[1] = movie2;

        for (int i =0; i<movies.length;i++){
            System.out.println(movies[i].review + movies[i].title);
        }
    }
}
