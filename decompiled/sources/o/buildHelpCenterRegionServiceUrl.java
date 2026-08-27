package o;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class buildHelpCenterRegionServiceUrl extends CustomerChatViewModel {
    @Override // o.UserAgentHeaderInterceptorKt
    public final buildHelpCenterRegionServiceUrl read() {
        return this;
    }

    @Override // o.CustomerChatViewModel, o.UserAgentHeaderInterceptorKt
    public final void read(provideRequest providerequest) {
        providerequest.toDERObject().read(this, true);
    }

    @Override // o.CustomerChatViewModel, o.UserAgentHeaderInterceptorKt
    public final void RemoteActionCompatParcelizer(logErrordefault[] logerrordefaultArr) {
        for (logErrordefault logerrordefault : logerrordefaultArr) {
            logerrordefault.RatingCompat().toDERObject().read(this, true);
        }
    }

    @Override // o.CustomerChatViewModel, o.UserAgentHeaderInterceptorKt
    public final void serializer(provideRequest[] providerequestArr) {
        for (provideRequest providerequest : providerequestArr) {
            providerequest.toDERObject().read(this, true);
        }
    }

    public buildHelpCenterRegionServiceUrl(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
    }
}
