package o;

import androidx.room.RoomDatabase$closeBarrier$1;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMagentacp {
    public final RoomDatabase$closeBarrier$1 serializer;
    public final AtomicInteger write = new AtomicInteger(0);
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);

    public final void read() {
        synchronized (this) {
            this.write.decrementAndGet();
            if (this.write.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final boolean write() {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer.get()) {
                return false;
            }
            this.write.incrementAndGet();
            return true;
        }
    }

    public accessgetMagentacp(RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        this.serializer = roomDatabase$closeBarrier$1;
    }
}
