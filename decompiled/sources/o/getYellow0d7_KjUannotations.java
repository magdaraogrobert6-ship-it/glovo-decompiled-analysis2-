package o;

/* JADX INFO: loaded from: classes.dex */
public final class getYellow0d7_KjUannotations implements Comparable {
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        getYellow0d7_KjUannotations getyellow0d7_kjuannotations = (getYellow0d7_KjUannotations) obj;
        getyellow0d7_kjuannotations.getClass();
        int i = this.RemoteActionCompatParcelizer - getyellow0d7_kjuannotations.RemoteActionCompatParcelizer;
        return i == 0 ? this.read - getyellow0d7_kjuannotations.read : i;
    }

    public getYellow0d7_KjUannotations(int i, String str, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.serializer = str;
        this.write = str2;
    }
}
