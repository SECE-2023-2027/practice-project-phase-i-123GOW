
package Recipemaintain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeApp {
    
    // Method to display a menu to the user
    private static void displayMenu() {
        System.out.println("Welcome to the Recipe Management System");
        System.out.println("1. Create a new recipe");
        System.out.println("2. Add ingredient to a recipe");
        System.out.println("3. Add review to a recipe");
        System.out.println("4. View recipe details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // List to store recipes
        List<Recipe> recipeList = new ArrayList<>();
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1: // Create a new recipe
                    System.out.print("Enter recipe name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter recipe description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter recipe category: ");
                    String category = scanner.nextLine();
                    
                    Recipe newRecipe = new Recipe(name, description, category);
                    recipeList.add(newRecipe);
                    System.out.println("Recipe created successfully!");
                    break;

                case 2: // Add ingredient to a recipe
                    System.out.print("Enter recipe name to add ingredient: ");
                    String recipeName = scanner.nextLine();
                    Recipe recipe = null;
                    for (Recipe r : recipeList) {
                        if (r.getName().equalsIgnoreCase(recipeName)) {
                            recipe = r;
                            break;
                        }
                    }

                    if (recipe != null) {
                        System.out.print("Enter ingredient name: ");
                        String ingredientName = scanner.nextLine();
                        System.out.print("Enter ingredient quantity: ");
                        String quantity = scanner.nextLine();
                        System.out.print("Enter ingredient unit: ");
                        String unit = scanner.nextLine();

                        Ingredient ingredient = new Ingredient(ingredientName, quantity, unit);
                        recipe.addIngredient(ingredient);
                        System.out.println("Ingredient added to recipe!");
                    } else {
                        System.out.println("Recipe not found.");
                    }
                    break;

                case 3: // Add review to a recipe
                    System.out.print("Enter recipe name to add review: ");
                    recipeName = scanner.nextLine();
                    recipe = null;
                    for (Recipe r : recipeList) {
                        if (r.getName().equalsIgnoreCase(recipeName)) {
                            recipe = r;
                            break;
                        }
                    }

                    if (recipe != null) {
                        System.out.print("Enter rating (1-5): ");
                        int rating = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter review comment: ");
                        String comment = scanner.nextLine();
                        System.out.print("Enter your username: ");
                        String userName = scanner.nextLine();

                        RecipeReview review = new RecipeReview(rating, comment, userName);
                        recipe.addReview(review);
                        System.out.println("Review added!");
                    } else {
                        System.out.println("Recipe not found.");
                    }
                    break;

                case 4: // View recipe details
                    System.out.print("Enter recipe name to view details: ");
                    recipeName = scanner.nextLine();
                    recipe = null;
                    for (Recipe r : recipeList) {
                        if (r.getName().equalsIgnoreCase(recipeName)) {
                            recipe = r;
                            break;
                        }
                    }

                    if (recipe != null) {
                        recipe.displayRecipeDetails();
                    } else {
                        System.out.println("Recipe not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the application...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
