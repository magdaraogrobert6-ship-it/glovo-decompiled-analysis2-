package o;

/* JADX INFO: loaded from: classes.dex */
public final class takeFocusaToIllA {
    public static final byte[] read = new byte[1792];
    public final int IconCompatParcelizer;
    public char RemoteActionCompatParcelizer;
    public int serializer;
    public final CharSequence write;

    static {
        for (int i = 0; i < 1792; i++) {
            read[i] = Character.getDirectionality(i);
        }
    }

    public takeFocusaToIllA(CharSequence charSequence) {
        this.write = charSequence;
        this.IconCompatParcelizer = charSequence.length();
    }

    public final byte RemoteActionCompatParcelizer() {
        int i = this.serializer;
        CharSequence charSequence = this.write;
        char cCharAt = charSequence.charAt(i - 1);
        this.RemoteActionCompatParcelizer = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i2 = this.serializer;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            this.serializer -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.serializer = i2 - 1;
        char c = this.RemoteActionCompatParcelizer;
        return c < 1792 ? read[c] : Character.getDirectionality(c);
    }
}
