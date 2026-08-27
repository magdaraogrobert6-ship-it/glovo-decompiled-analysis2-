package o;

/* JADX INFO: loaded from: classes.dex */
public interface UncheckedColordefault extends AutoCloseable {
    void IconCompatParcelizer(int i);

    void IconCompatParcelizer(int i, String str);

    void IconCompatParcelizer(int i, byte[] bArr);

    boolean IconCompatParcelizer();

    boolean MediaSessionCompatQueueItem(int i);

    int RemoteActionCompatParcelizer();

    String RemoteActionCompatParcelizer(int i);

    void RemoteActionCompatParcelizer(int i, long j);

    String read(int i);

    void read();

    long serializer(int i);

    default boolean serializer() {
        return serializer(0) != 0;
    }

    void write();

    byte[] write(int i);
}
