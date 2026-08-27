package o;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class setLayoutState {
    public final AtomicInteger RemoteActionCompatParcelizer;
    public final AtomicInteger serializer;

    public setLayoutState(int i) {
        if (i != 1) {
            this.RemoteActionCompatParcelizer = new AtomicInteger();
            this.serializer = new AtomicInteger();
        } else {
            this.RemoteActionCompatParcelizer = new AtomicInteger(0);
            this.serializer = new AtomicInteger(0);
        }
    }
}
