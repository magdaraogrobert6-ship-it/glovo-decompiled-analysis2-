package o;

import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.net.zza;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetCursorBasedcp implements Closeable, accessclearShadowCache {
    public static final toZui_graphics read = new toZui_graphics("MobileVisionBase", "");
    public final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    public final Executor MediaBrowserCompatMediaItem;
    public final AndroidUiFrameClockwithFrameNanos2callback1 serializer;
    public final getOwner write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_DESTROY)
    public void close() {
        synchronized (this) {
            boolean z = true;
            if (this.IconCompatParcelizer.getAndSet(true)) {
                return;
            }
            this.write.IconCompatParcelizer();
            AndroidUiFrameClockwithFrameNanos2callback1 androidUiFrameClockwithFrameNanos2callback1 = this.serializer;
            Executor executor = this.MediaBrowserCompatMediaItem;
            if (((AtomicInteger) androidUiFrameClockwithFrameNanos2callback1.RemoteActionCompatParcelizer).get() <= 0) {
                z = false;
            }
            accessgetSystemNavigationDowncp.IconCompatParcelizer(z);
            ((DiskLruCache$Editor) androidUiFrameClockwithFrameNanos2callback1.write).write(new zza(androidUiFrameClockwithFrameNanos2callback1, 28, new ParentDataModifierDefaultImpls()), executor);
        }
    }

    public final zzw serializer(setRequestedFrameRate setrequestedframerate) {
        synchronized (this) {
            if (this.IconCompatParcelizer.get()) {
                Object[] objArr = {new MlKitException("This detector is already closed!", 14)};
                return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
            }
            if (setrequestedframerate.read >= 32 && setrequestedframerate.IconCompatParcelizer >= 32) {
                return this.serializer.serializer(this.MediaBrowserCompatMediaItem, new Api35Impl(this, setrequestedframerate), this.write.RemoteActionCompatParcelizer);
            }
            Object[] objArr2 = {new MlKitException("InputImage width and height should be at least 32!", 3)};
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
        }
    }

    public accessgetCursorBasedcp(AndroidUiFrameClockwithFrameNanos2callback1 androidUiFrameClockwithFrameNanos2callback1, Executor executor) {
        this.serializer = androidUiFrameClockwithFrameNanos2callback1;
        getOwner getowner = new getOwner();
        this.write = getowner;
        this.MediaBrowserCompatMediaItem = executor;
        ((AtomicInteger) androidUiFrameClockwithFrameNanos2callback1.RemoteActionCompatParcelizer).incrementAndGet();
        androidUiFrameClockwithFrameNanos2callback1.serializer(executor, new Callable() { // from class: o.getCursorBased4UtRPd4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                toZui_graphics tozui_graphics = accessgetCursorBasedcp.read;
                return null;
            }
        }, getowner.RemoteActionCompatParcelizer).addOnFailureListener(new OnFailureListener() { // from class: o.setView
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                accessgetCursorBasedcp.read.RemoteActionCompatParcelizer("MobileVisionBase", "Error preloading model resource", exc);
            }
        });
    }
}
