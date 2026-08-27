package o;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdatH7eJ6arfN_8GL3LXu9dc2bQ8 {
    private final int IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public r8lambdatH7eJ6arfN_8GL3LXu9dc2bQ8() {
        Instant instantNow = Instant.now();
        this.RemoteActionCompatParcelizer = instantNow.toEpochMilli();
        this.IconCompatParcelizer = instantNow.getNano();
    }
}
