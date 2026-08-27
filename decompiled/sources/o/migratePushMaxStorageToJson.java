package o;

/* JADX INFO: loaded from: classes4.dex */
public class migratePushMaxStorageToJson {
    private boolean read = false;
    private boolean RemoteActionCompatParcelizer = false;
    private boolean serializer = false;

    public final void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    public final void serializer() {
        this.read = true;
    }

    public final void write() {
        this.serializer = true;
    }
}
