package class1.ex;

public class MovieReview {
    private String title;
    private String review;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public MovieReview movieReview(String title, String review) {
        setTitle(title);
        setReview(review);
        return this;
    }
}
