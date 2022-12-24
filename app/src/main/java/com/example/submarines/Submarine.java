package com.example.submarines;

public class Submarine
{
    private int sub_length;
    private boolean is_rotated;

    public Submarine(int sub_length, boolean is_rotated)
    {
        this.sub_length=sub_length;
        this.is_rotated=is_rotated;
    }

    public int getSub_length() {
        return sub_length;
    }

    public void setSub_length(int sub_length) {
        this.sub_length = sub_length;
    }

    public boolean isIs_rotated() {
        return is_rotated;
    }

    public void setIs_rotated(boolean is_rotated) {
        this.is_rotated = is_rotated;
    }

    @Override
    public String toString() {
        return "Submarine:" + "\n" +
                "sub_length: " + sub_length + "\n" +
                "is_rotated: " + is_rotated;
    }
}
