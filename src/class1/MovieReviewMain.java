package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview().movieReview("신과함께", "노잼");
        MovieReview movieReview1 = new MovieReview().movieReview("공공의적", "유잼");

        MovieReview[] movieReviews = {movieReview, movieReview1};

        for (MovieReview m : movieReviews) {
            System.out.printf("영화 제목 = %s 영화 리뷰 = %s \n", m.getTitle(), m.getReview());
        }
    }
}
