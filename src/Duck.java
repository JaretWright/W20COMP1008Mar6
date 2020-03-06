public class Duck extends Pet {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "quack quack";
    }
}
