package com.hcl.library.Model;

import java.util.*;

public class Member {
    private int id;
    private String name;
    private String email;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Member(int id, String name, String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        this.id = id;
        this.name = name;
        this.email = email;
    }


    // Getters
    public int getId() { return id; }

    public String getEmail() {
        return email;
    }

    public String getName() { return name; }



    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public List<LibraryItem> getBorrowedItems()
    {
        return Collections.unmodifiableList(new ArrayList<>(borrowedItems));
    }

    public void addItem(LibraryItem item)
    { borrowedItems.add(item);
    }
    public void removeItem(LibraryItem item)
    {
        borrowedItems.remove(item);
    }

    @Override
    public String toString() {
        return "Member[" + id + ", " + name + ", " + email +
                ", borrowed=" + borrowedItems.size() + "]";
    }
}