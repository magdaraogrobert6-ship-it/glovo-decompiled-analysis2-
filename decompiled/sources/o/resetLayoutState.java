package o;

import android.content.Context;
import android.os.SystemClock;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.zzw;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class resetLayoutState {
    public static getFillWidth IconCompatParcelizer;
    public static final ContentScaleKt RemoteActionCompatParcelizer;
    public final AndroidViewConfigurationApi34 MediaBrowserCompatMediaItem;
    public final zzw MediaDescriptionCompat;
    public final zzw MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final int RatingCompat;
    public final String read;
    public final String serializer;
    public final markActiveNodesAsReused write;
    public final HashMap PlaybackStateCompatCustomAction = new HashMap();
    public final HashMap MediaSessionCompatResultReceiverWrapper = new HashMap();

    public final boolean IconCompatParcelizer(accessgetRootp accessgetrootp, long j) {
        HashMap map = this.PlaybackStateCompatCustomAction;
        return map.get(accessgetrootp) == null || j - ((Long) map.get(accessgetrootp)).longValue() > 30000;
    }

    public final String read() {
        zzw zzwVar = this.MediaDescriptionCompat;
        return zzwVar.isSuccessful() ? (String) zzwVar.getResult() : accessgetSemicoloncp.read.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
    }

    public static long write(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        RemoteActionCompatParcelizer = new ContentScaleKt(0, objArr);
    }

    public final void IconCompatParcelizer(getOutOfFrameExecutor getoutofframeexecutor, accessgetRootp accessgetrootp) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (IconCompatParcelizer(accessgetrootp, jElapsedRealtime)) {
            this.PlaybackStateCompatCustomAction.put(accessgetrootp, Long.valueOf(jElapsedRealtime));
            getScaledHandwritingGestureLineMargin.INSTANCE.execute(new ImageVectorCacheImageVectorEntry((Object) this, (Object) getoutofframeexecutor.serializer(), (Enum) accessgetrootp, read(), 6));
        }
    }

    public resetLayoutState(Context context, AndroidViewConfigurationApi34 androidViewConfigurationApi34, markActiveNodesAsReused markactivenodesasreused, String str) {
        this.read = context.getPackageName();
        this.serializer = getHandwritingGestureLineMargin.write(context);
        this.MediaBrowserCompatMediaItem = androidViewConfigurationApi34;
        this.write = markactivenodesasreused;
        precompose.read();
        this.MediaSessionCompatQueueItem = str;
        openUri openuri = openUri.read();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(6, this);
        openuri.getClass();
        this.MediaDescriptionCompat = openUri.IconCompatParcelizer(modernAsyncTask$1);
        openUri openuri2 = openUri.read();
        androidViewConfigurationApi34.getClass();
        getRootui getrootui = new getRootui(androidViewConfigurationApi34, 3);
        openuri2.getClass();
        this.MediaMetadataCompat = openUri.IconCompatParcelizer(getrootui);
        ContentScaleKt contentScaleKt = RemoteActionCompatParcelizer;
        this.RatingCompat = contentScaleKt.containsKey(str) ? DynamiteModule.zza(context, (String) contentScaleKt.get(str), false) : -1;
    }
}
