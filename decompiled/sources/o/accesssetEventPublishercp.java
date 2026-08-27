package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetEventPublishercp {
    private final String IconCompatParcelizer;
    private final long MediaBrowserCompatMediaItem;
    private final int MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final int RatingCompat;
    private final long RemoteActionCompatParcelizer;
    private final int read;
    private final long serializer;
    private final boolean write;

    public final boolean MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public static int read(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            return (bArrDigest[3] & 255) | ((bArrDigest[0] & 255) << 24) | ((bArrDigest[1] & 255) << 16) | ((bArrDigest[2] & 255) << 8);
        } catch (NoSuchAlgorithmException unused) {
            return new Random().nextInt();
        }
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i = this.read;
        long j = this.serializer;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.RemoteActionCompatParcelizer;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        boolean z = this.write;
        long j3 = this.MediaBrowserCompatMediaItem;
        int i4 = (int) (j3 ^ (j3 >>> 32));
        int i5 = this.MediaDescriptionCompat;
        return (((((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + (z ? 1 : 0)) * 31) + i4) * 31) + i5) * 31) + this.RatingCompat) * 31) + (this.MediaMetadataCompat ? 1 : 0);
    }

    public accesssetEventPublishercp(publishExceptionlambda0 publishexceptionlambda0) {
        this.IconCompatParcelizer = publishexceptionlambda0.serializer;
        this.read = read(publishexceptionlambda0.serializer);
        this.serializer = publishexceptionlambda0.write == null ? 0L : publishexceptionlambda0.write.longValue();
        this.MediaBrowserCompatMediaItem = publishexceptionlambda0.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = publishexceptionlambda0.MediaBrowserCompatMediaItem;
        this.RatingCompat = publishexceptionlambda0.MediaMetadataCompat;
        this.RemoteActionCompatParcelizer = publishexceptionlambda0.IconCompatParcelizer != null ? publishexceptionlambda0.IconCompatParcelizer.longValue() : 0L;
        this.write = publishexceptionlambda0.read;
        this.MediaMetadataCompat = publishexceptionlambda0.RatingCompat;
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    public final String MediaMetadataCompat() {
        return this.IconCompatParcelizer;
    }

    public final int RatingCompat() {
        return this.RatingCompat;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long serializer() {
        return this.serializer;
    }

    public final long write() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accesssetEventPublishercp.class != obj.getClass()) {
            return false;
        }
        accesssetEventPublishercp accessseteventpublishercp = (accesssetEventPublishercp) obj;
        if (this.read == accessseteventpublishercp.read && this.serializer == accessseteventpublishercp.serializer && this.RemoteActionCompatParcelizer == accessseteventpublishercp.RemoteActionCompatParcelizer && this.write == accessseteventpublishercp.write && this.MediaBrowserCompatMediaItem == accessseteventpublishercp.MediaBrowserCompatMediaItem && this.MediaDescriptionCompat == accessseteventpublishercp.MediaDescriptionCompat && this.RatingCompat == accessseteventpublishercp.RatingCompat && this.MediaMetadataCompat == accessseteventpublishercp.MediaMetadataCompat) {
            return this.IconCompatParcelizer.equals(accessseteventpublishercp.IconCompatParcelizer);
        }
        return false;
    }

    public final int IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }
}
