package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.mapbox.common.HttpHeaders;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import o.displayInAppMessagelambda1;
import o.getAmbientShadowColor0d7_KjU;
import o.getCompositingStrategyNrFUSI;
import o.halfToFloat;
import o.instance_delegatelambda0;
import o.maxAoSsdG0;
import o.setSupportButtonTintList;
import o.snapTo;

/* JADX INFO: loaded from: classes.dex */
public class ExtensionWindowBackendApi1 extends getCompositingStrategyNrFUSI {
    public final WindowLayoutComponent read;
    public final maxAoSsdG0 serializer;
    public final ReentrantLock write = new ReentrantLock();
    public final LinkedHashMap IconCompatParcelizer = new LinkedHashMap();
    public final LinkedHashMap MediaMetadataCompat = new LinkedHashMap();
    public final LinkedHashMap RemoteActionCompatParcelizer = new LinkedHashMap();

    @Override // o.getCompositingStrategyNrFUSI, o.getCameraDistance
    public void read(snapTo snapto) {
        LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
        LinkedHashMap linkedHashMap2 = this.MediaMetadataCompat;
        ReentrantLock reentrantLock = this.write;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(snapto);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.read;
            ReentrantLock reentrantLock2 = multicastConsumer.serializer;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(snapto);
                reentrantLock2.unlock();
                linkedHashMap2.remove(snapto);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    halfToFloat halftofloat = (halfToFloat) this.RemoteActionCompatParcelizer.remove(multicastConsumer);
                    if (halftofloat != null) {
                        halftofloat.write.invoke(halftofloat.read, halftofloat.IconCompatParcelizer);
                    }
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

    @Override // o.getCompositingStrategyNrFUSI, o.getCameraDistance
    public void registerLayoutChangeCallback(Context context, setSupportButtonTintList setsupportbuttontintlist, snapTo snapto) {
        LinkedHashMap linkedHashMap = this.IconCompatParcelizer;
        context.getClass();
        ReentrantLock reentrantLock = this.write;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.MediaMetadataCompat;
            if (multicastConsumer != null) {
                multicastConsumer.read(snapto);
                linkedHashMap2.put(snapto, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(snapto, context);
                multicastConsumer2.read(snapto);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(instance_delegatelambda0.write));
                } else {
                    this.RemoteActionCompatParcelizer.put(multicastConsumer2, this.serializer.RemoteActionCompatParcelizer(this.read, displayInAppMessagelambda1.serializer(WindowLayoutInfo.class), (Activity) context, new getAmbientShadowColor0d7_KjU(1, 0, MulticastConsumer.class, multicastConsumer2, HttpHeaders.ACCEPT, "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V")));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public ExtensionWindowBackendApi1(WindowLayoutComponent windowLayoutComponent, maxAoSsdG0 maxaossdg0) {
        this.read = windowLayoutComponent;
        this.serializer = maxaossdg0;
    }
}
