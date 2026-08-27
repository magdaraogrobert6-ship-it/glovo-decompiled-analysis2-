package o;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class getRotationY implements FocusOwnerImplmodifier1, androidx.window.reflection.Consumer2 {
    public component160d7_KjU IconCompatParcelizer;
    public final LinkedHashSet RemoteActionCompatParcelizer;
    public final ReentrantLock read;
    public final Context write;

    @Override // o.FocusOwnerImplmodifier1
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.read;
        reentrantLock.lock();
        try {
            component160d7_KjU component160d7_kjuIconCompatParcelizer = getRotationZ.IconCompatParcelizer(this.write, windowLayoutInfo);
            this.IconCompatParcelizer = component160d7_kjuIconCompatParcelizer;
            Iterator it = this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((FocusOwnerImplmodifier1) it.next()).accept(component160d7_kjuIconCompatParcelizer);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void serializer(snapTo snapto) {
        ReentrantLock reentrantLock = this.read;
        reentrantLock.lock();
        try {
            component160d7_KjU component160d7_kju = this.IconCompatParcelizer;
            if (component160d7_kju != null) {
                snapto.accept(component160d7_kju);
            }
            this.RemoteActionCompatParcelizer.add(snapto);
        } finally {
            reentrantLock.unlock();
        }
    }

    public getRotationY(Context context) {
        context.getClass();
        this.write = context;
        this.read = new ReentrantLock();
        this.RemoteActionCompatParcelizer = new LinkedHashSet();
    }
}
