package o;

/* JADX INFO: loaded from: classes.dex */
public interface onRelease {
    void RemoteActionCompatParcelizer(int i, Object obj, getBirthDateFull getbirthdatefull, int i2);

    int serializer();

    int serializer(Object obj);

    default Object serializer(int i) {
        return null;
    }

    Object write(int i);
}
