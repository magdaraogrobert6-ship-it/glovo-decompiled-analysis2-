package o;

import android.content.Context;
import android.os.SystemClock;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class toMotionEventScoped4ec7I {
    public static final ContentScaleKt read;
    public static MatrixPositionCalculator serializer;
    public final String IconCompatParcelizer;
    public final zzw MediaBrowserCompatMediaItem;
    public final AndroidViewConfigurationApi34 MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final HashMap PlaybackStateCompat = new HashMap();
    public final HashMap PlaybackStateCompatCustomAction = new HashMap();
    public final zzw RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final PointerInteropUtils_androidKt write;

    public final boolean serializer(PointerInteropFilterpointerInputFilter1dispatchToView2 pointerInteropFilterpointerInputFilter1dispatchToView2, long j) {
        HashMap map = this.PlaybackStateCompat;
        return map.get(pointerInteropFilterpointerInputFilter1dispatchToView2) == null || j - ((Long) map.get(pointerInteropFilterpointerInputFilter1dispatchToView2)).longValue() > 30000;
    }

    public final String write() {
        zzw zzwVar = this.MediaBrowserCompatMediaItem;
        if (zzwVar.isSuccessful()) {
            return (String) zzwVar.getResult();
        }
        return accessgetSemicoloncp.read.IconCompatParcelizer(this.MediaMetadataCompat);
    }

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        read = new ContentScaleKt(1, objArr);
    }

    public final void read(accessgetErasercp accessgeterasercp, PointerInteropFilterpointerInputFilter1dispatchToView2 pointerInteropFilterpointerInputFilter1dispatchToView2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (serializer(pointerInteropFilterpointerInputFilter1dispatchToView2, jElapsedRealtime)) {
            this.PlaybackStateCompat.put(pointerInteropFilterpointerInputFilter1dispatchToView2, Long.valueOf(jElapsedRealtime));
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) this, (Object) accessgeterasercp.IconCompatParcelizer(), (Enum) pointerInteropFilterpointerInputFilter1dispatchToView2, write(), 4));
        }
    }

    public toMotionEventScoped4ec7I(Context context, AndroidViewConfigurationApi34 androidViewConfigurationApi34, PointerInteropUtils_androidKt pointerInteropUtils_androidKt, String str) {
        this.RemoteActionCompatParcelizer = context.getPackageName();
        this.IconCompatParcelizer = getHandwritingGestureLineMargin.write(context);
        this.MediaDescriptionCompat = androidViewConfigurationApi34;
        this.write = pointerInteropUtils_androidKt;
        toMotionEventScopeubNVwUQ.IconCompatParcelizer();
        this.MediaMetadataCompat = str;
        openUri openuri = openUri.read();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(4, this);
        openuri.getClass();
        this.MediaBrowserCompatMediaItem = openUri.IconCompatParcelizer(modernAsyncTask$1);
        openUri openuri2 = openUri.read();
        Objects.requireNonNull(androidViewConfigurationApi34);
        getRootui getrootui = new getRootui(androidViewConfigurationApi34, 1);
        openuri2.getClass();
        this.RatingCompat = openUri.IconCompatParcelizer(getrootui);
        ContentScaleKt contentScaleKt = read;
        this.MediaSessionCompatQueueItem = contentScaleKt.containsKey(str) ? DynamiteModule.zza(context, (String) contentScaleKt.get(str), false) : -1;
    }

    public static long IconCompatParcelizer(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }
}
