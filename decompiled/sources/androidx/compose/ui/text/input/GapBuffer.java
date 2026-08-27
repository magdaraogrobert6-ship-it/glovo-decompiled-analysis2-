package androidx.compose.ui.text.input;

/* JADX INFO: loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final char get(int i) {
        int i2 = this.gapStart;
        char[] cArr = this.buffer;
        if (i < i2) {
            return cArr[i];
        }
        return cArr[(i - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public String toString() {
        return "";
    }

    public GapBuffer(char[] cArr, int i, int i2) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    public final void append(StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        sb.append(cArr, i, this.capacity - i);
    }

    private final void delete(int i, int i2) {
        int i3 = this.gapStart;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.buffer;
            int i5 = this.gapEnd;
            cArr.getClass();
            System.arraycopy(cArr, i2, cArr, i5 - i4, i4);
            this.gapStart = i;
            this.gapEnd -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.gapEnd = i2 + gapLength();
            this.gapStart = i;
            return;
        }
        int iGapLength = gapLength();
        int iGapLength2 = gapLength();
        int i6 = this.gapEnd;
        int i7 = (i + iGapLength) - i6;
        char[] cArr2 = this.buffer;
        int i8 = this.gapStart;
        cArr2.getClass();
        System.arraycopy(cArr2, i6, cArr2, i8, i7);
        this.gapStart += i7;
        this.gapEnd = i2 + iGapLength2;
    }

    private final void makeSureAvailableSpace(int i) {
        if (i <= gapLength()) {
            return;
        }
        int iGapLength = gapLength();
        int i2 = this.capacity;
        do {
            i2 *= 2;
        } while (i2 - this.capacity < i - iGapLength);
        char[] cArr = new char[i2];
        char[] cArr2 = this.buffer;
        int i3 = this.gapStart;
        cArr2.getClass();
        System.arraycopy(cArr2, 0, cArr, 0, i3);
        int i4 = this.capacity;
        int i5 = this.gapEnd;
        int i6 = i4 - i5;
        int i7 = i2 - i6;
        char[] cArr3 = this.buffer;
        cArr3.getClass();
        System.arraycopy(cArr3, i5, cArr, i7, (i6 + i5) - i5);
        this.buffer = cArr;
        this.capacity = i2;
        this.gapEnd = i7;
    }

    public final void replace(int i, int i2, String str) {
        makeSureAvailableSpace(str.length() - (i2 - i));
        delete(i, i2);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart = str.length() + this.gapStart;
    }
}
