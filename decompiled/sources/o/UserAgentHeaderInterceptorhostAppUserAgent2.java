package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class UserAgentHeaderInterceptorhostAppUserAgent2 extends provideRequest {
    public final PushNotificationParserObj serializer;

    @Override // o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(7, z);
        userAgentHeaderInterceptorKt.read(false, 25, this.serializer.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public final provideRequest toDERObject() {
        return this;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return this.serializer.RemoteActionCompatParcelizer(z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return ~accessbootstrapIfNeeded.read(this.serializer.IconCompatParcelizer);
    }

    public UserAgentHeaderInterceptorhostAppUserAgent2(PushNotificationParserObj pushNotificationParserObj) {
        this.serializer = pushNotificationParserObj;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof UserAgentHeaderInterceptorhostAppUserAgent2) {
            return this.serializer.serializer(((UserAgentHeaderInterceptorhostAppUserAgent2) providerequest).serializer);
        }
        return false;
    }
}
