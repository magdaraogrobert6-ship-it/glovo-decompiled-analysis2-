package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class provideRequest extends getHostAppUserAgent {
    public provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    public abstract boolean R_();

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        return this;
    }

    public abstract int RemoteActionCompatParcelizer(boolean z);

    @Override // o.getHostAppUserAgent
    public abstract int hashCode();

    public abstract void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z);

    public abstract boolean serializer(provideRequest providerequest);

    public provideRequest toDERObject() {
        return this;
    }

    @Override // o.getHostAppUserAgent
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof logErrordefault) && serializer(((logErrordefault) obj).RatingCompat());
    }

    public static provideRequest RemoteActionCompatParcelizer(byte[] bArr) throws IOException {
        tryRefreshToken tryrefreshtoken = new tryRefreshToken(new ByteArrayInputStream(bArr), bArr.length, false);
        try {
            provideRequest providerequestSerializer = tryrefreshtoken.serializer();
            if (tryrefreshtoken.available() == 0) {
                return providerequestSerializer;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("cannot recognise object in stream");
            return null;
        }
    }

    public final boolean write(provideRequest providerequest) {
        return this == providerequest || serializer(providerequest);
    }
}
