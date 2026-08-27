package o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetVonKriescp extends getColors {
    public final PointF MediaDescriptionCompat;
    public final PointF MediaMetadataCompat;
    public final getTransformui_graphics MediaSessionCompatQueueItem;
    public final getTransformui_graphics ParcelableVolumeInfo;

    public accessgetVonKriescp(getTransformui_graphics gettransformui_graphics, getTransformui_graphics gettransformui_graphics2) {
        super(Collections.EMPTY_LIST);
        this.MediaDescriptionCompat = new PointF();
        this.MediaMetadataCompat = new PointF();
        this.MediaSessionCompatQueueItem = gettransformui_graphics;
        this.ParcelableVolumeInfo = gettransformui_graphics2;
        read(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.getColors
    public final Object IconCompatParcelizer() {
        PointF pointF = this.MediaDescriptionCompat;
        float f = pointF.x;
        PointF pointF2 = this.MediaMetadataCompat;
        pointF2.set(f, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // o.getColors
    public final void read(float f) {
        getTransformui_graphics gettransformui_graphics = this.MediaSessionCompatQueueItem;
        gettransformui_graphics.read(f);
        getTransformui_graphics gettransformui_graphics2 = this.ParcelableVolumeInfo;
        gettransformui_graphics2.read(f);
        this.MediaDescriptionCompat.set(((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue(), ((Float) gettransformui_graphics2.IconCompatParcelizer()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.RatingCompat;
            if (i >= arrayList.size()) {
                return;
            }
            ((encodeColorList) arrayList.get(i)).serializer();
            i++;
        }
    }

    @Override // o.getColors
    public final Object RemoteActionCompatParcelizer(Lab lab, float f) {
        PointF pointF = this.MediaDescriptionCompat;
        float f2 = pointF.x;
        PointF pointF2 = this.MediaMetadataCompat;
        pointF2.set(f2, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }
}
