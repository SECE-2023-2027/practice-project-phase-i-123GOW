package Recipemaintain;

public class Ingredient {
    private String name; // Ingredient name (e.g., "Sugar", "Flour")
    private double quantity; // Quantity of the ingredient
    private String unit; // Unit of measurement (e.g., "cups", "grams", "tablespoons")

    // Constructor to initialize the ingredient object
    public Ingredient(String name, String quantity2, String unit) {
        this.name = name;
        this.quantity = quantity2;
        this.unit = unit;
    }

    // Getter for the name of the ingredient
    public String getName() {
        return name;
    }

    // Setter for the name of the ingredient
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the quantity of the ingredient
    public double getQuantity() {
        return quantity;
    }

    // Setter for the quantity of the ingredient
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    // Getter for the unit of measurement
    public String getUnit() {
        return unit;
    }

    // Setter for the unit of measurement
    public void setUnit(String unit) {
        this.unit = unit;
    }

    // Method to display the ingredient details
    public void displayIngredient() {
        System.out.println("Ingredient: " + name);
        System.out.println("Quantity: " + quantity + " " + unit);
    }

    // Optional: Override the toString() method for better string representation
    @Override
    public String toString() {
        return "Ingredient: " + name + " (" + quantity + " " + unit + ")";
    }

    // Optional: Method to compare two ingredients (e.g., for equality based on name)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ingredient other = (Ingredient) obj;
        return name.equalsIgnoreCase(other.name);
    }

    // Optional: HashCode for equality checks (useful if stored in collections like HashSet)
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
