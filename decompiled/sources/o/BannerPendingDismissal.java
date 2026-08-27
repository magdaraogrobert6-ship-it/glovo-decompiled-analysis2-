package o;

/* JADX INFO: loaded from: classes3.dex */
public class BannerPendingDismissal {
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean serializer;

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean read() {
        return this.read;
    }

    public final boolean write() {
        return this.serializer;
    }

    public BannerPendingDismissal(String str, String str2, boolean z, boolean z2) {
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = z;
        this.read = z2;
    }
}
