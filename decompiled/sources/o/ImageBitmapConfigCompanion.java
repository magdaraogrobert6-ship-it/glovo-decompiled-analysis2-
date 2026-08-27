package o;

import android.text.TextUtils;
import bo.app.a5$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ImageBitmapConfigCompanion {
    public static final String RemoteActionCompatParcelizer = setRotationX.IconCompatParcelizer("WorkContinuationImpl");
    public final ArrayList IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final androidx.work.impl.WorkManagerImpl MediaMetadataCompat;
    public getClipannotations RatingCompat;
    public final accesssetColorFilterjd read;
    public boolean serializer;
    public final ArrayList write = new ArrayList();

    public static HashSet serializer(ImageBitmapConfigCompanion imageBitmapConfigCompanion) {
        HashSet hashSet = new HashSet();
        imageBitmapConfigCompanion.getClass();
        return hashSet;
    }

    public ImageBitmapConfigCompanion(androidx.work.impl.WorkManagerImpl workManagerImpl, String str, accesssetColorFilterjd accesssetcolorfilterjd, List list, int i) {
        this.MediaMetadataCompat = workManagerImpl;
        this.MediaBrowserCompatMediaItem = str;
        this.read = accesssetcolorfilterjd;
        this.MediaDescriptionCompat = list;
        this.IconCompatParcelizer = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (accesssetcolorfilterjd == accesssetColorFilterjd.REPLACE && ((setRotationY) list.get(i2)).IconCompatParcelizer.ResultReceiver != Long.MAX_VALUE) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((setRotationY) list.get(i2)).RemoteActionCompatParcelizer.toString();
            string.getClass();
            this.IconCompatParcelizer.add(string);
            this.write.add(string);
        }
    }

    public final getClipannotations write() {
        if (this.serializer) {
            setRotationX.read().IconCompatParcelizer(RemoteActionCompatParcelizer, "Already enqueued work ids (" + TextUtils.join(", ", this.IconCompatParcelizer) + ")");
        } else {
            androidx.work.impl.WorkManagerImpl workManagerImpl = this.MediaMetadataCompat;
            this.RatingCompat = setNativeShader.RemoteActionCompatParcelizer(workManagerImpl.write.PlaybackStateCompatCustomAction, "EnqueueRunnable_" + this.read.name(), workManagerImpl.MediaSessionCompatToken.RemoteActionCompatParcelizer, new a5$$ExternalSyntheticLambda0(14, this));
        }
        return this.RatingCompat;
    }
}
