package o;

import com.deliveryhero.fwf_http.ConstantKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class parseUseWebViewFromQueryBundle {
    public static final List IconCompatParcelizer = Collections.unmodifiableList(Arrays.asList(ConstantKt.CONTENT_TYPE_HEADER, "Content-Length", "Accept"));
    public List MediaBrowserCompatMediaItem;
    public List MediaDescriptionCompat;
    public List MediaMetadataCompat;
    public List MediaSessionCompatQueueItem;
    public formatQueryBundleForLog MediaSessionCompatResultReceiverWrapper;
    public dismisslambda0 MediaSessionCompatToken;
    public io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 ParcelableVolumeInfo;
    public Double PlaybackStateCompat;
    public long PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public Double r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public CopyOnWriteArraySet r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public long read;
    public int serializer;
    public CopyOnWriteArraySet write;

    public final List IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    public final Double RatingCompat() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public final Double RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompat;
    }

    public final void RemoteActionCompatParcelizer(Double d) {
        if (RegexKt.write(d, true)) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    public final List read() {
        return this.MediaSessionCompatQueueItem;
    }

    public final void read(boolean z) {
        this.RatingCompat = z;
    }

    public final List serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void serializer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final List write() {
        return this.MediaMetadataCompat;
    }

    public final void write(Double d) {
        if (RegexKt.write(d, true)) {
            this.PlaybackStateCompat = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    public final void IconCompatParcelizer(ArrayList arrayList) {
        this.MediaMetadataCompat = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void read(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(IconCompatParcelizer);
        linkedHashSet.addAll(arrayList);
        this.MediaBrowserCompatMediaItem = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void serializer(ArrayList arrayList) {
        this.MediaSessionCompatQueueItem = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void write(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(IconCompatParcelizer);
        linkedHashSet.addAll(arrayList);
        this.MediaDescriptionCompat = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }
}
