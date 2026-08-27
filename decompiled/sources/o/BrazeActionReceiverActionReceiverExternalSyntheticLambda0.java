package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeActionReceiverActionReceiverExternalSyntheticLambda0 {
    private final ArrayList IconCompatParcelizer = new ArrayList();

    public final performWork IconCompatParcelizer() {
        synchronized (this) {
            if (this.IconCompatParcelizer.isEmpty()) {
                return null;
            }
            return (performWork) this.IconCompatParcelizer.get(0);
        }
    }

    public final performWork RemoteActionCompatParcelizer() {
        synchronized (this) {
            if (this.IconCompatParcelizer.isEmpty()) {
                return null;
            }
            return (performWork) this.IconCompatParcelizer.remove(0);
        }
    }

    public final int read() {
        int size;
        synchronized (this) {
            size = this.IconCompatParcelizer.size();
        }
        return size;
    }

    public final void write(performWork performwork) {
        synchronized (this) {
            this.IconCompatParcelizer.add(performwork);
        }
    }

    public final void write() {
        synchronized (this) {
            this.IconCompatParcelizer.clear();
        }
    }
}
