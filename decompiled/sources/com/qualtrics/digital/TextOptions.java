package com.qualtrics.digital;

/* JADX INFO: loaded from: classes4.dex */
abstract class TextOptions {
    String Alignment;
    boolean Bold;
    String Color;
    String Size;
    String Text;

    public abstract int getTextSize();

    public int getAlignment() {
        String str = this.Alignment;
        str.getClass();
        if (str.equals("left")) {
            return 2;
        }
        return !str.equals("right") ? 4 : 3;
    }
}
