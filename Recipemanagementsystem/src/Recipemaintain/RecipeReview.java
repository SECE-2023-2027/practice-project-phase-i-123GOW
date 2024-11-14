
package Recipemaintain;

public class RecipeReview {
    private int rating;      // Rating out of 5
    private String comment;  // Review comment
    private String userName; // Reviewer's username

    // Constructor
    public RecipeReview(int rating, String comment, String userName) {
        this.rating = rating;
        this.comment = comment;
        this.userName = userName;
    }

    // Getters and Setters
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Method to display the review details
    public void displayReviewDetails() {
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Comment: " + comment);
        System.out.println("Reviewed by: " + userName);
    }

    @Override
    public String toString() {
        return "Review by " + userName + ": " + rating + " stars";
    }
}
