package o;

/* JADX INFO: loaded from: classes2.dex */
public final class onAttachedToWindow {
    public final String read;

    public final String write() {
        return this.read;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public onAttachedToWindow(String str) {
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onAttachedToWindow)) {
            return false;
        }
        String str = ((onAttachedToWindow) obj).read;
        String str2 = this.read;
        return str2.hashCode() == str.hashCode() && str2.equals(str);
    }
}
