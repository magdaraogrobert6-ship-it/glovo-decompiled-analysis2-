package o;

import android.content.Context;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.zzw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class setApproachNode {
    public static final ContentScaleKt RemoteActionCompatParcelizer;
    public static getHasMoreContent serializer;
    public final String IconCompatParcelizer;
    public final zzw MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final zzw MediaSessionCompatQueueItem;
    public final HashMap ParcelableVolumeInfo = new HashMap();
    public final AndroidViewConfigurationApi34 RatingCompat;
    public final getAlignmentLinesannotations read;
    public final String write;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        RemoteActionCompatParcelizer = new ContentScaleKt(2, objArr);
    }

    public setApproachNode(Context context, AndroidViewConfigurationApi34 androidViewConfigurationApi34, getAlignmentLinesannotations getalignmentlinesannotations) {
        new HashMap();
        this.IconCompatParcelizer = context.getPackageName();
        this.write = getHandwritingGestureLineMargin.write(context);
        this.RatingCompat = androidViewConfigurationApi34;
        this.read = getalignmentlinesannotations;
        setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = "vision-common";
        openUri openuri = openUri.read();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(5, this);
        openuri.getClass();
        this.MediaBrowserCompatMediaItem = openUri.IconCompatParcelizer(modernAsyncTask$1);
        openUri openuri2 = openUri.read();
        androidViewConfigurationApi34.getClass();
        getRootui getrootui = new getRootui(androidViewConfigurationApi34, 2);
        openuri2.getClass();
        this.MediaSessionCompatQueueItem = openUri.IconCompatParcelizer(getrootui);
        ContentScaleKt contentScaleKt = RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = contentScaleKt.containsKey("vision-common") ? DynamiteModule.zza(context, (String) contentScaleKt.get("vision-common"), false) : -1;
    }
}
