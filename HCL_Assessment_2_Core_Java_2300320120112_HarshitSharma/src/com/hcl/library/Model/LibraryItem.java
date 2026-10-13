package com.hcl.library.Model;
import java.time.Year;

public abstract class LibraryItem implements Borrowable, Comparable<LibraryItem> {
    private static int nextId = 1001;

    private final int id;
    private String title;
    private int year;
    private boolean available = true;


    // Constructor for the abstract class we have made.
    public LibraryItem(String title, int year) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Wmpty title not allowed");
        }
        if (year < 1900 || year > Year.now().getValue()) {
            throw new IllegalArgumentException("This is not allowed");
        }
        this.id = nextId++;
        this.title = title;
        this.year = year;
    }
// Getters
    public int getId()
    { return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getTitle()
    { return title;
    }
    public int getYear()
    { return year;
    }
    @Override public boolean isAvailable() {
        return available;
    }

    public static void setNextId(int nextId) {
        LibraryItem.nextId = nextId;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    @Override public void borrow()
    {
        available = false;
    }
    @Override public void giveBack()
    {
        available = true;
    }

    public abstract double lateFee(int daysLate);

    @Override
    public int compareTo(LibraryItem other) {
        return title.compareToIgnoreCase(other.title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof LibraryItem)) return false;
        LibraryItem other = (LibraryItem) obj;
        return id == other.id;
    }

    @Override public int hashCode() { return Integer.hashCode(id); }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + id + ", " + title + ", " +
                year + ", " + (available ? "Available" : "Issued") + "]";
    }
}