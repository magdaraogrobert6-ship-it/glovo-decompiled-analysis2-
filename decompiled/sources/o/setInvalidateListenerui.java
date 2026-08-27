package o;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class setInvalidateListenerui {
    public static volatile setInvalidateListenerui RemoteActionCompatParcelizer;
    public static final accessgetVcp serializer = new accessgetVcp(8);
    public final Handler MediaSessionCompatQueueItem = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList read = new CopyOnWriteArrayList();
    public final LinkedHashMap RatingCompat = new LinkedHashMap();
    public final Map IconCompatParcelizer = Collections.synchronizedMap(new WeakHashMap());
    public final AtomicBoolean write = new AtomicBoolean(false);

    public final void IconCompatParcelizer(Window window) {
        accessgetLockcp accessgetlockcp;
        Map map = this.IconCompatParcelizer;
        map.getClass();
        synchronized (map) {
            accessgetlockcp = (accessgetLockcp) this.IconCompatParcelizer.remove(window);
        }
        if (accessgetlockcp == null) {
            return;
        }
        setNativeColor4WTKRHQ setnativecolor4wtkrhq = accessgetlockcp.RemoteActionCompatParcelizer;
        if (setnativecolor4wtkrhq.RemoteActionCompatParcelizer) {
            setNativeShader setnativeshader = setnativecolor4wtkrhq.write;
            setnativeshader.PlaybackStateCompatCustomAction.getDecorView().post(new LifecycleUtils$$ExternalSyntheticLambda4(false, setnativeshader));
            setnativecolor4wtkrhq.RemoteActionCompatParcelizer = false;
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write.set(z);
        Map map = this.IconCompatParcelizer;
        map.getClass();
        synchronized (map) {
            Iterator it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                setNativeColor4WTKRHQ setnativecolor4wtkrhq = ((accessgetLockcp) it.next()).RemoteActionCompatParcelizer;
                if (z != setnativecolor4wtkrhq.RemoteActionCompatParcelizer) {
                    setNativeShader setnativeshader = setnativecolor4wtkrhq.write;
                    setnativeshader.PlaybackStateCompatCustomAction.getDecorView().post(new LifecycleUtils$$ExternalSyntheticLambda4(z, setnativeshader));
                    setnativecolor4wtkrhq.RemoteActionCompatParcelizer = z;
                }
            }
        }
    }

    public final void serializer(Window window) {
        boolean zContainsKey;
        Map map = this.IconCompatParcelizer;
        map.getClass();
        synchronized (map) {
            zContainsKey = this.IconCompatParcelizer.containsKey(window);
        }
        if (zContainsKey) {
            return;
        }
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            write(window);
        } else {
            this.MediaSessionCompatQueueItem.post(new setPivotY(this, window, 1));
        }
    }

    public final void write(Window window) {
        boolean zContainsKey;
        Map map = this.IconCompatParcelizer;
        map.getClass();
        synchronized (map) {
            zContainsKey = this.IconCompatParcelizer.containsKey(window);
        }
        if (zContainsKey) {
            return;
        }
        try {
            JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3 = new JankStatsFrameTracker$$ExternalSyntheticLambda3(this, 0, window);
            window.getClass();
            setNativeColor4WTKRHQ setnativecolor4wtkrhq = new setNativeColor4WTKRHQ(window, jankStatsFrameTracker$$ExternalSyntheticLambda3);
            boolean z = this.write.get();
            if (z != setnativecolor4wtkrhq.RemoteActionCompatParcelizer) {
                setNativeShader setnativeshader = setnativecolor4wtkrhq.write;
                setnativeshader.PlaybackStateCompatCustomAction.getDecorView().post(new LifecycleUtils$$ExternalSyntheticLambda4(z, setnativeshader));
                setnativecolor4wtkrhq.RemoteActionCompatParcelizer = z;
            }
            Map map2 = this.IconCompatParcelizer;
            map2.getClass();
            synchronized (map2) {
                Map map3 = this.IconCompatParcelizer;
                map3.getClass();
                map3.put(window, new accessgetLockcp(setnativecolor4wtkrhq));
            }
        } catch (IllegalStateException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "Failed to attach JankStats to window", new Object[0]);
        }
    }

    public setInvalidateListenerui() {
        random_delegatelambda0 random_delegatelambda0Var = new random_delegatelambda0() { // from class: o.setPivotX
            @Override // o.random_delegatelambda0
            public final void serializer(View view, boolean z) {
                view.getClass();
                Window windowWrite = getRequestCode.write(view);
                if (windowWrite == null) {
                    return;
                }
                setInvalidateListenerui setinvalidatelistenerui = this.RemoteActionCompatParcelizer;
                if (z) {
                    setinvalidatelistenerui.serializer(windowWrite);
                    return;
                }
                Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    setinvalidatelistenerui.IconCompatParcelizer(windowWrite);
                } else {
                    setinvalidatelistenerui.MediaSessionCompatQueueItem.post(new setPivotY(setinvalidatelistenerui, windowWrite, 0));
                }
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = r8lambdaAefA9MLvnBCqdyzSHKyzHz6CMWE.serializer;
        ((r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).write.add(random_delegatelambda0Var);
        Iterator it = onContentCardDismissed.PlaybackStateCompat(((r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            Window windowWrite = getRequestCode.write((View) it.next());
            if (windowWrite != null) {
                serializer(windowWrite);
            }
        }
    }
}
