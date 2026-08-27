package o;

import io.sentry.util.UrlUtils;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class generateEotf implements eotfFunclambda0 {
    public final getEotfFuncui_graphics IconCompatParcelizer;
    public final Class MediaBrowserCompatMediaItem;
    public final Map MediaDescriptionCompat;
    public final eotfFunclambda0 MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final Class RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final int serializer;
    public int write;

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        if (this.write == 0) {
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            this.write = iHashCode;
            int iHashCode2 = this.MediaMetadataCompat.hashCode();
            int i = ((((iHashCode2 + (iHashCode * 31)) * 31) + this.MediaSessionCompatQueueItem) * 31) + this.serializer;
            this.write = i;
            int iHashCode3 = this.MediaDescriptionCompat.hashCode() + (i * 31);
            this.write = iHashCode3;
            int iHashCode4 = this.RatingCompat.hashCode() + (iHashCode3 * 31);
            this.write = iHashCode4;
            int iHashCode5 = this.MediaBrowserCompatMediaItem.hashCode() + (iHashCode4 * 31);
            this.write = iHashCode5;
            this.write = this.IconCompatParcelizer.write.hashCode() + (iHashCode5 * 31);
        }
        return this.write;
    }

    public final String toString() {
        return "EngineKey{model=" + this.RemoteActionCompatParcelizer + ", width=" + this.MediaSessionCompatQueueItem + ", height=" + this.serializer + ", resourceClass=" + this.RatingCompat + ", transcodeClass=" + this.MediaBrowserCompatMediaItem + ", signature=" + this.MediaMetadataCompat + ", hashCode=" + this.write + ", transformations=" + this.MediaDescriptionCompat + ", options=" + this.IconCompatParcelizer + '}';
    }

    public generateEotf(Object obj, eotfFunclambda0 eotffunclambda0, int i, int i2, Map map, Class cls, Class cls2, getEotfFuncui_graphics geteotffuncui_graphics) {
        UrlUtils.serializer(obj, "Argument must not be null");
        this.RemoteActionCompatParcelizer = obj;
        UrlUtils.serializer(eotffunclambda0, "Signature must not be null");
        this.MediaMetadataCompat = eotffunclambda0;
        this.MediaSessionCompatQueueItem = i;
        this.serializer = i2;
        UrlUtils.serializer(map, "Argument must not be null");
        this.MediaDescriptionCompat = map;
        UrlUtils.serializer(cls, "Resource class must not be null");
        this.RatingCompat = cls;
        UrlUtils.serializer(cls2, "Transcode class must not be null");
        this.MediaBrowserCompatMediaItem = cls2;
        UrlUtils.serializer(geteotffuncui_graphics, "Argument must not be null");
        this.IconCompatParcelizer = geteotffuncui_graphics;
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (!(obj instanceof generateEotf)) {
            return false;
        }
        generateEotf generateeotf = (generateEotf) obj;
        return this.RemoteActionCompatParcelizer.equals(generateeotf.RemoteActionCompatParcelizer) && this.MediaMetadataCompat.equals(generateeotf.MediaMetadataCompat) && this.serializer == generateeotf.serializer && this.MediaSessionCompatQueueItem == generateeotf.MediaSessionCompatQueueItem && this.MediaDescriptionCompat.equals(generateeotf.MediaDescriptionCompat) && this.RatingCompat.equals(generateeotf.RatingCompat) && this.MediaBrowserCompatMediaItem.equals(generateeotf.MediaBrowserCompatMediaItem) && this.IconCompatParcelizer.equals(generateeotf.IconCompatParcelizer);
    }
}
