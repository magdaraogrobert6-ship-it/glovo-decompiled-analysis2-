package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import o.FocusOwnerImplmodifier1;
import o.component160d7_KjU;
import o.getRotationZ;
import o.snapTo;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastConsumer implements FocusOwnerImplmodifier1 {
    public component160d7_KjU IconCompatParcelizer;
    public final LinkedHashSet read;
    public final ReentrantLock serializer;
    public final Context write;

    public final void read(snapTo snapto) {
        ReentrantLock reentrantLock = this.serializer;
        reentrantLock.lock();
        try {
            component160d7_KjU component160d7_kju = this.IconCompatParcelizer;
            if (component160d7_kju != null) {
                snapto.accept(component160d7_kju);
            }
            this.read.add(snapto);
        } finally {
            reentrantLock.unlock();
        }
    }

    public MulticastConsumer(Context context) {
        context.getClass();
        this.write = context;
        this.serializer = new ReentrantLock();
        this.read = new LinkedHashSet();
    }

    @Override // o.FocusOwnerImplmodifier1
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.serializer;
        reentrantLock.lock();
        try {
            component160d7_KjU component160d7_kjuIconCompatParcelizer = getRotationZ.IconCompatParcelizer(this.write, windowLayoutInfo);
            this.IconCompatParcelizer = component160d7_kjuIconCompatParcelizer;
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                ((FocusOwnerImplmodifier1) it.next()).accept(component160d7_kjuIconCompatParcelizer);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
