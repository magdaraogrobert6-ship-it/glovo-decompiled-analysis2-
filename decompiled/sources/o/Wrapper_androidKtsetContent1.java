package o;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Wrapper_androidKtsetContent1 {
    public volatile String MediaBrowserCompatMediaItem;
    public r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY RatingCompat;
    public static final Object write = new Object();
    public static final Wrapper_androidKtsetContent1 RemoteActionCompatParcelizer = new Wrapper_androidKtsetContent1();
    public int MediaSessionCompatQueueItem = -1;
    public int read = -1;
    public int IconCompatParcelizer = -1;
    public final ArrayBlockingQueue serializer = new ArrayBlockingQueue(androidx.compose.ui.graphics.Fields.RotationX);
    public final isLazyCollection PlaybackStateCompat = new isLazyCollection(this);
    public boolean MediaDescriptionCompat = false;
    public boolean MediaMetadataCompat = false;

    public static void serializer(Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1, Wrapper_androidKtsetContent1 wrapper_androidKtsetContent2) {
        ArrayBlockingQueue arrayBlockingQueue = wrapper_androidKtsetContent2.serializer;
        Wrapper_androidKt wrapper_androidKt = (Wrapper_androidKt) arrayBlockingQueue.poll(60L, TimeUnit.SECONDS);
        r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy = wrapper_androidKtsetContent1.RatingCompat;
        if (r8lambdacyuxafptvn7drfel1dgtevxcy != null) {
            if (wrapper_androidKt != null) {
                r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer(wrapper_androidKt);
                return;
            }
            r8lambdacyuxafptvn7drfel1dgtevxcy.serializer();
            wrapper_androidKtsetContent1.RatingCompat.IconCompatParcelizer((Wrapper_androidKt) arrayBlockingQueue.take());
        }
    }
}
