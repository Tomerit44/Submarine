package com.example.submarines;

public class Locsq
{
    private boolean is_submar;
    private boolean is_hit;

    public Locsq(boolean is_submar, boolean is_hit)
    {
        this.is_submar=is_submar;
        this.is_hit=is_hit;
    }

    public boolean isIs_submar() {
        return is_submar;
    }

    public void setIs_submar(boolean is_submar) {
        this.is_submar = is_submar;
    }

    public boolean isIs_hit() {
        return is_hit;
    }

    public void setIs_hit(boolean is_hit) {
        this.is_hit = is_hit;
    }

    @Override
    public String toString() {
        return "Locsq: " +"\n" +
                "is_submar: " + is_submar +"\n" +
                "is_hit: " + is_hit;
    }
}
