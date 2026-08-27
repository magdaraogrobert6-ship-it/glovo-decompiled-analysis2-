package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ChatConfigurationDataStoreHelperImpl extends provideMoshi {
    public int IconCompatParcelizer;
    public final /* synthetic */ int serializer = 0;

    public ChatConfigurationDataStoreHelperImpl(logErrordefault[] logerrordefaultArr) {
        super(false, logerrordefaultArr);
        this.IconCompatParcelizer = -1;
    }

    @Override // o.provideMoshi, o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    public int read() {
        if (this.IconCompatParcelizer < 0) {
            int iRemoteActionCompatParcelizer = 0;
            for (logErrordefault logerrordefault : this.RemoteActionCompatParcelizer) {
                iRemoteActionCompatParcelizer += logerrordefault.RatingCompat().toDERObject().RemoteActionCompatParcelizer(true);
            }
            this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        }
        return this.IconCompatParcelizer;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        int i = this.serializer;
        logErrordefault[] logerrordefaultArr = this.RemoteActionCompatParcelizer;
        int i2 = 0;
        if (i != 0) {
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(49, z);
            buildHelpCenterRegionServiceUrl buildhelpcenterregionserviceurl = userAgentHeaderInterceptorKt.read();
            int length = logerrordefaultArr.length;
            if (this.IconCompatParcelizer >= 0 || length > 16) {
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(read());
                while (i2 < length) {
                    logerrordefaultArr[i2].RatingCompat().toDERObject().read(buildhelpcenterregionserviceurl, true);
                    i2++;
                }
                return;
            }
            provideRequest[] providerequestArr = new provideRequest[length];
            int iRemoteActionCompatParcelizer = 0;
            for (int i3 = 0; i3 < length; i3++) {
                provideRequest dERObject = logerrordefaultArr[i3].RatingCompat().toDERObject();
                providerequestArr[i3] = dERObject;
                iRemoteActionCompatParcelizer += dERObject.RemoteActionCompatParcelizer(true);
            }
            this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
            while (i2 < length) {
                providerequestArr[i2].read(buildhelpcenterregionserviceurl, true);
                i2++;
            }
            return;
        }
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(49, z);
        CustomerChatViewModel customerChatViewModelIconCompatParcelizer = userAgentHeaderInterceptorKt.IconCompatParcelizer();
        int length2 = logerrordefaultArr.length;
        if (this.IconCompatParcelizer >= 0 || length2 > 16) {
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(write());
            while (i2 < length2) {
                customerChatViewModelIconCompatParcelizer.read(logerrordefaultArr[i2].RatingCompat());
                i2++;
            }
            return;
        }
        provideRequest[] providerequestArr2 = new provideRequest[length2];
        int iRemoteActionCompatParcelizer2 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            provideRequest providerequestMediaSessionCompatQueueItem = logerrordefaultArr[i4].RatingCompat().MediaSessionCompatQueueItem();
            providerequestArr2[i4] = providerequestMediaSessionCompatQueueItem;
            iRemoteActionCompatParcelizer2 += providerequestMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(true);
        }
        this.IconCompatParcelizer = iRemoteActionCompatParcelizer2;
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2);
        while (i2 < length2) {
            customerChatViewModelIconCompatParcelizer.read(providerequestArr2[i2]);
            i2++;
        }
    }

    public int write() {
        if (this.IconCompatParcelizer < 0) {
            int iRemoteActionCompatParcelizer = 0;
            for (logErrordefault logerrordefault : this.RemoteActionCompatParcelizer) {
                iRemoteActionCompatParcelizer += logerrordefault.RatingCompat().MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(true);
            }
            this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
        }
        return this.IconCompatParcelizer;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return this.serializer != 0 ? UserAgentHeaderInterceptorKt.write(read(), z) : UserAgentHeaderInterceptorKt.write(write(), z);
    }

    @Override // o.provideMoshi, o.provideRequest
    public provideRequest toDERObject() {
        if (this.serializer != 1) {
            return super.toDERObject();
        }
        return this.read != null ? this : super.toDERObject();
    }

    public /* synthetic */ ChatConfigurationDataStoreHelperImpl(extractTokenFromHeader extracttokenfromheader) {
        super(extracttokenfromheader);
    }

    public /* synthetic */ ChatConfigurationDataStoreHelperImpl(boolean z, logErrordefault[] logerrordefaultArr) {
        super(z, logerrordefaultArr);
    }

    public /* synthetic */ ChatConfigurationDataStoreHelperImpl() {
    }

    public /* synthetic */ ChatConfigurationDataStoreHelperImpl(logErrordefault[] logerrordefaultArr, logErrordefault[] logerrordefaultArr2) {
        super(logerrordefaultArr, logerrordefaultArr2);
    }
}
