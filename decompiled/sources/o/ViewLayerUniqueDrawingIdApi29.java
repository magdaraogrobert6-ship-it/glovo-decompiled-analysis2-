package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewLayerUniqueDrawingIdApi29 extends setShouldUseDispatchDrawui {
    public Exception IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public volatile boolean serializer;
    public boolean write;
    public final Object read = new Object();
    public ArrayList MediaMetadataCompat = new ArrayList();

    @Override // o.setShouldUseDispatchDrawui
    public final Object IconCompatParcelizer() {
        Object obj;
        synchronized (this.read) {
            Exception exc = this.IconCompatParcelizer;
            if (exc != null) {
                throw new RuntimeException(exc);
            }
            obj = this.RemoteActionCompatParcelizer;
        }
        return obj;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.read) {
            Iterator it = this.MediaMetadataCompat.iterator();
            while (it.hasNext()) {
                try {
                    ((resetClipBounds) it.next()).serializer(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.MediaMetadataCompat = null;
        }
    }

    @Override // o.setShouldUseDispatchDrawui
    public final Exception read() {
        Exception exc;
        synchronized (this.read) {
            exc = this.IconCompatParcelizer;
        }
        return exc;
    }

    @Override // o.setShouldUseDispatchDrawui
    public final ViewLayerUniqueDrawingIdApi29 read(getOutlineProvider getoutlineprovider) {
        read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, getoutlineprovider));
        return this;
    }

    public final void read(resetClipBounds resetclipbounds) {
        boolean z;
        synchronized (this.read) {
            synchronized (this.read) {
                z = this.write;
            }
            if (!z) {
                this.MediaMetadataCompat.add(resetclipbounds);
            }
        }
        if (z) {
            resetclipbounds.serializer(this);
        }
    }

    @Override // o.setShouldUseDispatchDrawui
    public final boolean serializer() {
        boolean z;
        synchronized (this.read) {
            z = this.write && !this.serializer && this.IconCompatParcelizer == null;
        }
        return z;
    }

    @Override // o.setShouldUseDispatchDrawui
    public final ViewLayerUniqueDrawingIdApi29 write(getContainer getcontainer) {
        read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, getcontainer));
        return this;
    }

    public final void write() {
        synchronized (this.read) {
            if (!this.write) {
                this.write = true;
                this.serializer = true;
                this.read.notifyAll();
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void serializer(Exception exc) {
        synchronized (this.read) {
            if (!this.write) {
                this.write = true;
                this.IconCompatParcelizer = exc;
                this.read.notifyAll();
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read(Object obj) {
        synchronized (this.read) {
            if (!this.write) {
                this.write = true;
                this.RemoteActionCompatParcelizer = obj;
                this.read.notifyAll();
                RemoteActionCompatParcelizer();
            }
        }
    }
}
