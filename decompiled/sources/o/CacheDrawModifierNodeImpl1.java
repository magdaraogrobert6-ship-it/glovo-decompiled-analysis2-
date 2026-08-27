package o;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$Action;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CacheDrawModifierNodeImpl1 {
    public Object IconCompatParcelizer;
    public final Object MediaMetadataCompat;
    public Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public boolean read;
    public final Object serializer;
    public boolean write;

    public NotificationCompat$Action IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.IconCompatParcelizer;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new NotificationCompat$Action((androidx.core.graphics.drawable.IconCompat) this.RemoteActionCompatParcelizer, (CharSequence) this.MediaMetadataCompat, (PendingIntent) this.serializer, (Bundle) this.RatingCompat, arrayList2.isEmpty() ? null : (invalidateNodes[]) arrayList2.toArray(new invalidateNodes[arrayList2.size()]), this.read, this.write);
    }

    public CacheDrawModifierNodeImpl1(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.read = false;
        this.write = false;
        this.serializer = new Object();
        this.RatingCompat = new getOuterActionMenuPresenter(1);
        this.RemoteActionCompatParcelizer = camera2CameraControlImpl;
        this.MediaMetadataCompat = previewFreezeAfterHighSpeedRecordingQuirk;
    }

    public CacheDrawModifierNodeImpl1(boolean z, boolean z2, String str, String str2, List list, String str3, List list2) {
        this.read = z;
        this.write = z2;
        this.RemoteActionCompatParcelizer = str;
        this.MediaMetadataCompat = str2;
        this.RatingCompat = list;
        this.serializer = str3;
        this.IconCompatParcelizer = list2;
    }

    public CacheDrawModifierNodeImpl1(androidx.core.graphics.drawable.IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.read = true;
        this.write = true;
        this.RemoteActionCompatParcelizer = iconCompat;
        this.MediaMetadataCompat = getEnterdhqQ8s.serializer(charSequence);
        this.serializer = pendingIntent;
        this.RatingCompat = bundle;
        this.IconCompatParcelizer = null;
        this.read = true;
        this.write = true;
    }
}
