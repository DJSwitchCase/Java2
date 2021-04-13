package Adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
    Adapter add = new Adapter();
    add.saveObject();
    add.deleteObject();
    add.loadObject();
    add.updateObject();
    }
}
