package ProductManagement;

public class Rating {
    int rating;
    String username;

    public Rating(int rating, String username) {
        this.rating = rating;
        this.username = username;
    }

    public int getRating() { return this.rating; }
    public String getUsername() { return this.username; }

    public void setRating(int rating) { this.rating = rating; }

    public void printDetails() {
        System.out.println(this.rating+"/5 by "+this.username);
    }
}
