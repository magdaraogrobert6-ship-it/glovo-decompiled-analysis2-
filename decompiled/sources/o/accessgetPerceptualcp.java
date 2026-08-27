package o;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetPerceptualcp extends ContextWrapper {
    public static final Oklab read;
    public final FlingCancellationException IconCompatParcelizer;
    public final accessgetRelativecp MediaBrowserCompatMediaItem;
    public final scale0AR0LA0default MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final ImageKt MediaSessionCompatQueueItem;
    public final area RatingCompat;
    public final List RemoteActionCompatParcelizer;
    public scaleFgt4K4Qdefault serializer;
    public final getF write;

    static {
        Oklab oklab = new Oklab();
        oklab.IconCompatParcelizer = scaleRg1IO4c.read;
        read = oklab;
    }

    public final com.bumptech.glide.Registry RemoteActionCompatParcelizer() {
        return (com.bumptech.glide.Registry) this.MediaDescriptionCompat.B_();
    }

    public accessgetPerceptualcp(Context context, getF getf, accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac, FlingCancellationException flingCancellationException, ImageKt imageKt, List list, area areaVar, accessgetRelativecp accessgetrelativecp) {
        super(context.getApplicationContext());
        this.write = getf;
        this.IconCompatParcelizer = flingCancellationException;
        this.RemoteActionCompatParcelizer = list;
        this.MediaSessionCompatQueueItem = imageKt;
        this.RatingCompat = areaVar;
        this.MediaBrowserCompatMediaItem = accessgetrelativecp;
        this.MediaMetadataCompat = 4;
        this.MediaDescriptionCompat = new scale0AR0LA0default(accessgetapparenttorealoffsetnoccac);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
