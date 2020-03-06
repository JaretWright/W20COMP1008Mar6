public abstract class Pet {
    private String name;

    public Pet(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
        if (!name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("name cannot be empty");
    }

    /**
     * This is an abstract method.  It does not have a method body.  Because
     * there is an abstract method, the whole class has to become abstract
     * @return
     */
    public abstract String speak();
}
