package o;

/* JADX INFO: loaded from: classes.dex */
public final class toString {
    public final Object RemoteActionCompatParcelizer;

    public toString(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[Result: <");
        sb.append("Value: " + this.RemoteActionCompatParcelizer);
        sb.append(">]");
        return sb.toString();
    }
}
