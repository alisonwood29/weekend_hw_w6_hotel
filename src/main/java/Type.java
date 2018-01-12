public enum Type {
    SINGLE(1),
    DOUBLE(2),
    KING(2),
    TWIN(2),
    STUDIO(5);

    private final int capacity;

    Type(int capacity){
        this.capacity = capacity;
    }


    public int getCapacity() {
        return this.capacity;
    }
}
