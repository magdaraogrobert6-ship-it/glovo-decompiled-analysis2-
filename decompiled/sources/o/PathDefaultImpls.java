package o;

/* JADX INFO: loaded from: classes.dex */
public final class PathDefaultImpls {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String toString() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public PathDefaultImpls(String str, String str2, String str3, String str4, String str5) {
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.serializer = str4;
        this.read = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PathDefaultImpls) && ((PathDefaultImpls) obj).write.equals(this.write);
    }
}
