package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    public static final AnimatedVisibilityKt IconCompatParcelizer;
    public static final AnimatedVisibilityKt MediaBrowserCompatMediaItem;
    public static final HashSet MediaMetadataCompat;
    public static final List MediaSessionCompatQueueItem;
    public static final AnimatedVisibilityKt RatingCompat;
    public static final AnimatedVisibilityKt RemoteActionCompatParcelizer;
    public static final AnimatedVisibilityKt read;
    public static final AnimatedVisibilityKt serializer;
    public static final AnimatedVisibilityKt write;
    public final int MediaDescriptionCompat;
    public final int MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final List PlaybackStateCompatCustomAction;

    public AnimatedVisibilityKt(String str, int i, int i2, List list) {
        this.MediaSessionCompatResultReceiverWrapper = i;
        this.MediaDescriptionCompat = i2;
        this.MediaSessionCompatToken = str;
        if (list != null) {
            this.PlaybackStateCompatCustomAction = list;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null typicalSizes");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedVisibilityKt)) {
            return false;
        }
        AnimatedVisibilityKt animatedVisibilityKt = (AnimatedVisibilityKt) obj;
        return this.MediaSessionCompatResultReceiverWrapper == animatedVisibilityKt.MediaSessionCompatResultReceiverWrapper && this.MediaDescriptionCompat == animatedVisibilityKt.MediaDescriptionCompat && this.MediaSessionCompatToken.equals(animatedVisibilityKt.MediaSessionCompatToken) && this.PlaybackStateCompatCustomAction.equals(animatedVisibilityKt.PlaybackStateCompatCustomAction);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConstantQuality{value=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper);
        sb.append(", highSpeedValue=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", name=");
        sb.append(this.MediaSessionCompatToken);
        sb.append(", typicalSizes=");
        return MediaSessionCompatQueueItem.read(sb, this.PlaybackStateCompatCustomAction, "}");
    }

    static {
        AnimatedVisibilityKt animatedVisibilityKt = new AnimatedVisibilityKt("SD", 4, 2002, Collections.unmodifiableList(Arrays.asList(new android.util.Size(720, 480), new android.util.Size(640, 480))));
        MediaBrowserCompatMediaItem = animatedVisibilityKt;
        AnimatedVisibilityKt animatedVisibilityKt2 = new AnimatedVisibilityKt("HD", 5, 2003, Collections.singletonList(new android.util.Size(1280, 720)));
        RemoteActionCompatParcelizer = animatedVisibilityKt2;
        AnimatedVisibilityKt animatedVisibilityKt3 = new AnimatedVisibilityKt("FHD", 6, 2004, Collections.singletonList(new android.util.Size(1920, 1080)));
        read = animatedVisibilityKt3;
        AnimatedVisibilityKt animatedVisibilityKt4 = new AnimatedVisibilityKt("UHD", 8, 2005, Collections.singletonList(new android.util.Size(3840, 2160)));
        RatingCompat = animatedVisibilityKt4;
        List list = Collections.EMPTY_LIST;
        AnimatedVisibilityKt animatedVisibilityKt5 = new AnimatedVisibilityKt("LOWEST", 0, 2000, list);
        IconCompatParcelizer = animatedVisibilityKt5;
        AnimatedVisibilityKt animatedVisibilityKt6 = new AnimatedVisibilityKt("HIGHEST", 1, 2001, list);
        serializer = animatedVisibilityKt6;
        write = new AnimatedVisibilityKt("NONE", -1, -1, list);
        MediaMetadataCompat = new HashSet(Arrays.asList(animatedVisibilityKt5, animatedVisibilityKt6, animatedVisibilityKt, animatedVisibilityKt2, animatedVisibilityKt3, animatedVisibilityKt4));
        MediaSessionCompatQueueItem = Arrays.asList(animatedVisibilityKt4, animatedVisibilityKt3, animatedVisibilityKt2, animatedVisibilityKt);
    }

    public final int RemoteActionCompatParcelizer(int i) {
        if (i == 1) {
            return this.MediaSessionCompatResultReceiverWrapper;
        }
        if (i == 2) {
            return this.MediaDescriptionCompat;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) c8$$ExternalSyntheticOutline0.m(i, "Unknown quality source: "));
        return 0;
    }

    public final int hashCode() {
        int i = this.MediaSessionCompatResultReceiverWrapper;
        int i2 = this.MediaDescriptionCompat;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ this.MediaSessionCompatToken.hashCode()) * 1000003) ^ this.PlaybackStateCompatCustomAction.hashCode();
    }
}
