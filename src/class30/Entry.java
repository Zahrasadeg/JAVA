package class30;

public class Entry {
    int key;
    String value;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }
    public int getKey() {
        return key;
    }
    String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
