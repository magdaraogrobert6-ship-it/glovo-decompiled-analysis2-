package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getCameraXConfig extends getTitleTextView {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write = 0;

    public getCameraXConfig(getInflatedId getinflatedid, setNavigationIcon setnavigationicon) {
        super(getinflatedid);
        this.RemoteActionCompatParcelizer = new java.lang.ref.WeakReference(setnavigationicon);
        RemoteActionCompatParcelizer(new AuthPromptErrorException(1, this));
    }

    @Override // o.getTitleTextView, java.lang.AutoCloseable
    public void close() {
        if (this.write != 0) {
            super.close();
        } else {
            if (((AtomicBoolean) this.RemoteActionCompatParcelizer).getAndSet(true)) {
                return;
            }
            super.close();
        }
    }

    public getCameraXConfig(getInflatedId getinflatedid) {
        super(getinflatedid);
        this.RemoteActionCompatParcelizer = new AtomicBoolean(false);
    }
}
