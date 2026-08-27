package o;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class clearData {
    private boolean read;
    private final LinkedBlockingQueue<readIntlambda0> serializer = new LinkedBlockingQueue<>();

    public final boolean read() {
        return this.read;
    }

    public final readIntlambda0 write() {
        return this.serializer.poll();
    }

    public final void write(readIntlambda0 readintlambda0) {
        this.serializer.add(readintlambda0);
    }

    public final void RemoteActionCompatParcelizer(List list) {
        this.serializer.removeAll(list);
    }

    public final void read(boolean z) {
        this.read = z;
    }
}
