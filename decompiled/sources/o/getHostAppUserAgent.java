package o;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getHostAppUserAgent implements logErrordefault, metricProvider {
    @Override // o.logErrordefault
    public abstract provideRequest RatingCompat();

    public final byte[] MediaBrowserCompatMediaItem() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new buildHelpCenterRegionServiceUrl(byteArrayOutputStream).read(RatingCompat());
        return byteArrayOutputStream.toByteArray();
    }

    @Override // o.metricProvider
    public final byte[] MediaMetadataCompat() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        RatingCompat().read(new UserAgentHeaderInterceptorKt(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof logErrordefault) {
            return RatingCompat().write(((logErrordefault) obj).RatingCompat());
        }
        return false;
    }

    public int hashCode() {
        return RatingCompat().hashCode();
    }
}
