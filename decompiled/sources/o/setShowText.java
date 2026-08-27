package o;

/* JADX INFO: loaded from: classes.dex */
public final class setShowText {
    public final setTextOff write;

    public final int hashCode() {
        return this.write.read.hashCode();
    }

    public final String toString() {
        return this.write.read.toString();
    }

    public setShowText(setTextOff settextoff) {
        this.write = settextoff;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setShowText)) {
            return false;
        }
        return this.write.equals(((setShowText) obj).write);
    }
}
