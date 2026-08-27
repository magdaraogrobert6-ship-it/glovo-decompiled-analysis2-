package o;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class CustomerChatViewModel extends UserAgentHeaderInterceptorKt {
    @Override // o.UserAgentHeaderInterceptorKt
    public final CustomerChatViewModel IconCompatParcelizer() {
        return this;
    }

    @Override // o.UserAgentHeaderInterceptorKt
    public void read(provideRequest providerequest) {
        providerequest.MediaSessionCompatQueueItem().read(this, true);
    }

    @Override // o.UserAgentHeaderInterceptorKt
    public void RemoteActionCompatParcelizer(logErrordefault[] logerrordefaultArr) {
        for (logErrordefault logerrordefault : logerrordefaultArr) {
            logerrordefault.RatingCompat().MediaSessionCompatQueueItem().read(this, true);
        }
    }

    @Override // o.UserAgentHeaderInterceptorKt
    public void serializer(provideRequest[] providerequestArr) {
        for (provideRequest providerequest : providerequestArr) {
            providerequest.MediaSessionCompatQueueItem().read(this, true);
        }
    }

    public CustomerChatViewModel(ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
    }
}
