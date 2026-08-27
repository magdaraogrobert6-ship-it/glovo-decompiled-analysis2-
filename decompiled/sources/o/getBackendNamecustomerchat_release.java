package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1Util;

/* JADX INFO: loaded from: classes4.dex */
public final class getBackendNamecustomerchat_release extends provideRequest implements PhoneCallType {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final logErrordefault serializer;
    public final /* synthetic */ int write;

    public final boolean RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        return i == 1 || i == 3;
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return this;
    }

    public static getBackendNamecustomerchat_release IconCompatParcelizer(logErrordefault logerrordefault) {
        if (logerrordefault == null || (logerrordefault instanceof getBackendNamecustomerchat_release)) {
            return (getBackendNamecustomerchat_release) logerrordefault;
        }
        provideRequest providerequestRatingCompat = logerrordefault.RatingCompat();
        if (providerequestRatingCompat instanceof getBackendNamecustomerchat_release) {
            return (getBackendNamecustomerchat_release) providerequestRatingCompat;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown object in getInstance: ".concat(logerrordefault.getClass().getName()));
        return null;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        int i = this.write;
        int i2 = this.read;
        int i3 = this.RemoteActionCompatParcelizer;
        logErrordefault logerrordefault = this.serializer;
        if (i == 0) {
            provideRequest providerequestMediaSessionCompatQueueItem = logerrordefault.RatingCompat().MediaSessionCompatQueueItem();
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (z) {
                if (zRemoteActionCompatParcelizer || providerequestMediaSessionCompatQueueItem.R_()) {
                    i3 |= 32;
                }
                userAgentHeaderInterceptorKt.serializer(i3, i2);
            }
            if (zRemoteActionCompatParcelizer) {
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(providerequestMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(true));
            }
            providerequestMediaSessionCompatQueueItem.read(userAgentHeaderInterceptorKt.IconCompatParcelizer(), zRemoteActionCompatParcelizer);
            return;
        }
        if (i != 1) {
            provideRequest dERObject = logerrordefault.RatingCompat().toDERObject();
            boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            if (z) {
                if (zRemoteActionCompatParcelizer2 || dERObject.R_()) {
                    i3 |= 32;
                }
                userAgentHeaderInterceptorKt.serializer(i3, i2);
            }
            if (zRemoteActionCompatParcelizer2) {
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(dERObject.RemoteActionCompatParcelizer(true));
            }
            dERObject.read(userAgentHeaderInterceptorKt.read(), zRemoteActionCompatParcelizer2);
            return;
        }
        provideRequest providerequestRatingCompat = logerrordefault.RatingCompat();
        boolean zRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
        if (z) {
            if (zRemoteActionCompatParcelizer3 || providerequestRatingCompat.R_()) {
                i3 |= 32;
            }
            userAgentHeaderInterceptorKt.serializer(i3, i2);
        }
        if (!zRemoteActionCompatParcelizer3) {
            providerequestRatingCompat.read(userAgentHeaderInterceptorKt, false);
            return;
        }
        userAgentHeaderInterceptorKt.write(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        providerequestRatingCompat.read(userAgentHeaderInterceptorKt, true);
        userAgentHeaderInterceptorKt.write(0);
        userAgentHeaderInterceptorKt.write(0);
    }

    public final String toString() {
        return ASN1Util.serializer(this.RemoteActionCompatParcelizer, this.read) + this.serializer;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        int i = this.write;
        int i2 = this.read;
        logErrordefault logerrordefault = this.serializer;
        if (i == 0) {
            provideRequest providerequestMediaSessionCompatQueueItem = logerrordefault.RatingCompat().MediaSessionCompatQueueItem();
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer = providerequestMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(zRemoteActionCompatParcelizer);
            if (zRemoteActionCompatParcelizer) {
                iRemoteActionCompatParcelizer += UserAgentHeaderInterceptorKt.read(iRemoteActionCompatParcelizer);
            }
            return iRemoteActionCompatParcelizer + (z ? UserAgentHeaderInterceptorKt.serializer(i2) : 0);
        }
        if (i != 1) {
            provideRequest dERObject = logerrordefault.RatingCompat().toDERObject();
            boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = dERObject.RemoteActionCompatParcelizer(zRemoteActionCompatParcelizer2);
            if (zRemoteActionCompatParcelizer2) {
                iRemoteActionCompatParcelizer2 += UserAgentHeaderInterceptorKt.read(iRemoteActionCompatParcelizer2);
            }
            return iRemoteActionCompatParcelizer2 + (z ? UserAgentHeaderInterceptorKt.serializer(i2) : 0);
        }
        provideRequest providerequestRatingCompat = logerrordefault.RatingCompat();
        boolean zRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = providerequestRatingCompat.RemoteActionCompatParcelizer(zRemoteActionCompatParcelizer3);
        if (zRemoteActionCompatParcelizer3) {
            iRemoteActionCompatParcelizer3 += 3;
        }
        return iRemoteActionCompatParcelizer3 + (z ? UserAgentHeaderInterceptorKt.serializer(i2) : 0);
    }

    @Override // o.provideRequest
    public final boolean R_() {
        int i = this.write;
        logErrordefault logerrordefault = this.serializer;
        if (i == 0) {
            return RemoteActionCompatParcelizer() || logerrordefault.RatingCompat().MediaSessionCompatQueueItem().R_();
        }
        if (i != 1) {
            return RemoteActionCompatParcelizer() || logerrordefault.RatingCompat().toDERObject().R_();
        }
        return RemoteActionCompatParcelizer() || logerrordefault.RatingCompat().R_();
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        return (((i * 7919) ^ this.read) ^ (RemoteActionCompatParcelizer() ? 15 : 240)) ^ this.serializer.RatingCompat().hashCode();
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (!(providerequest instanceof getBackendNamecustomerchat_release)) {
            return false;
        }
        getBackendNamecustomerchat_release getbackendnamecustomerchat_release = (getBackendNamecustomerchat_release) providerequest;
        if (this.read != getbackendnamecustomerchat_release.read || this.RemoteActionCompatParcelizer != getbackendnamecustomerchat_release.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.IconCompatParcelizer != getbackendnamecustomerchat_release.IconCompatParcelizer && RemoteActionCompatParcelizer() != getbackendnamecustomerchat_release.RemoteActionCompatParcelizer()) {
            return false;
        }
        provideRequest providerequestRatingCompat = this.serializer.RatingCompat();
        provideRequest providerequestRatingCompat2 = getbackendnamecustomerchat_release.serializer.RatingCompat();
        if (providerequestRatingCompat == providerequestRatingCompat2) {
            return true;
        }
        if (RemoteActionCompatParcelizer()) {
            return providerequestRatingCompat.serializer(providerequestRatingCompat2);
        }
        try {
            return Arrays.equals(MediaMetadataCompat(), getbackendnamecustomerchat_release.MediaMetadataCompat());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // o.provideRequest
    public provideRequest MediaSessionCompatQueueItem() {
        int i = this.write;
        if (i == 0 || i == 2) {
            return this;
        }
        return new getBackendNamecustomerchat_release(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.serializer, 0);
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        if (this.write == 2) {
            return this;
        }
        return new getBackendNamecustomerchat_release(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, this.serializer, 2);
    }

    public getBackendNamecustomerchat_release(int i, int i2, int i3, logErrordefault logerrordefault) {
        if (logerrordefault == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "invalid tag class: "));
            throw null;
        }
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
        this.serializer = logerrordefault;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getBackendNamecustomerchat_release(int i, int i2, int i3, logErrordefault logerrordefault, int i4) {
        this(i, i2, i3, logerrordefault);
        this.write = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getBackendNamecustomerchat_release(boolean z, int i, logErrordefault logerrordefault, int i2) {
        this(z ? 1 : 2, androidx.compose.ui.graphics.Fields.SpotShadowColor, i, logerrordefault);
        this.write = i2;
    }
}
