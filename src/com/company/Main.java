package com.company;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(11);

        hashTable.insert(new Obj(55));
        hashTable.insert(new Obj(24));
        hashTable.insert(new Obj(19));
        hashTable.insert(new Obj(37));
        hashTable.insert(new Obj(55));
        hashTable.insert(new Obj(94));
        hashTable.insert(new Obj(77));
        hashTable.insert(new Obj(36));

        hashTable.show();
    }
}