package Recipemaintain;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private String description;
    private String category;
    private List<Ingredient> ingredients;
    private List<RecipeReview> reviews;

    // Constructor
    public Recipe(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.ingredients = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<RecipeReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<RecipeReview> reviews) {
        this.reviews = reviews;
    }

    // Method to add an ingredient to the recipe
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // Method to add a review for the recipe
    public void addReview(RecipeReview review) {
        reviews.add(review);
    }

    // Method to display the recipe details
    public void displayRecipeDetails() {
        System.out.println("Recipe: " + name);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("\nIngredients:");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName() + " - " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }

        System.out.println("\nReviews:");
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            for (RecipeReview review : reviews) {
                System.out.println("Rating: " + review.getRating() + " stars");
                System.out.println("Comment: " + review.getComment());
                System.out.println("Reviewed by: " + review.getUserName());
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public String toString() {
        return name + " (" + category + ")";
    }
}
