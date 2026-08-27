package o;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class getRenderEffect extends androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1 {
    public final LinkedHashMap MediaDescriptionCompat;
    public final ReentrantLock MediaSessionCompatQueueItem;
    public final LinkedHashMap RatingCompat;

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, o.getCompositingStrategyNrFUSI, o.getCameraDistance
    public final void read(snapTo snapto) {
        LinkedHashMap linkedHashMap = this.RatingCompat;
        LinkedHashMap linkedHashMap2 = this.MediaDescriptionCompat;
        ReentrantLock reentrantLock = this.MediaSessionCompatQueueItem;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(snapto);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            getRotationY getrotationy = (getRotationY) linkedHashMap.get(context);
            if (getrotationy == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = getrotationy.read;
            reentrantLock2.lock();
            try {
                getrotationy.RemoteActionCompatParcelizer.remove(snapto);
                reentrantLock2.unlock();
                linkedHashMap2.remove(snapto);
                if (getrotationy.RemoteActionCompatParcelizer.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.read.removeWindowLayoutInfoListener(getrotationy);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1, o.getCompositingStrategyNrFUSI, o.getCameraDistance
    public final void registerLayoutChangeCallback(Context context, setSupportButtonTintList setsupportbuttontintlist, snapTo snapto) {
        LinkedHashMap linkedHashMap = this.RatingCompat;
        context.getClass();
        ReentrantLock reentrantLock = this.MediaSessionCompatQueueItem;
        reentrantLock.lock();
        try {
            getRotationY getrotationy = (getRotationY) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.MediaDescriptionCompat;
            if (getrotationy != null) {
                getrotationy.serializer(snapto);
                linkedHashMap2.put(snapto, context);
            } else {
                getRotationY getrotationy2 = new getRotationY(context);
                linkedHashMap.put(context, getrotationy2);
                linkedHashMap2.put(snapto, context);
                getrotationy2.serializer(snapto);
                this.read.addWindowLayoutInfoListener(context, getrotationy2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public getRenderEffect(WindowLayoutComponent windowLayoutComponent, maxAoSsdG0 maxaossdg0) {
        super(windowLayoutComponent, maxaossdg0);
        this.MediaSessionCompatQueueItem = new ReentrantLock();
        this.RatingCompat = new LinkedHashMap();
        this.MediaDescriptionCompat = new LinkedHashMap();
    }
}
