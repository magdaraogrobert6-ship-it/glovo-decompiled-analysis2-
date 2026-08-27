package o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class DeliveryInfoCompanion extends ProvidernetworkModule1 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int serializer;

    @Override // o.ProvidernetworkModule1, o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    public int MediaSessionCompatResultReceiverWrapper() {
        if (this.serializer < 0) {
            int length = this.RemoteActionCompatParcelizer.length;
            int iRemoteActionCompatParcelizer = 0;
            for (int i = 0; i < length; i++) {
                iRemoteActionCompatParcelizer += this.RemoteActionCompatParcelizer[i].RatingCompat().MediaSessionCompatQueueItem().RemoteActionCompatParcelizer(true);
            }
            this.serializer = iRemoteActionCompatParcelizer;
        }
        return this.serializer;
    }

    public int PlaybackStateCompat() {
        if (this.serializer < 0) {
            int length = this.RemoteActionCompatParcelizer.length;
            int iRemoteActionCompatParcelizer = 0;
            for (int i = 0; i < length; i++) {
                iRemoteActionCompatParcelizer += this.RemoteActionCompatParcelizer[i].RatingCompat().toDERObject().RemoteActionCompatParcelizer(true);
            }
            this.serializer = iRemoteActionCompatParcelizer;
        }
        return this.serializer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryInfoCompanion(extractTokenFromHeader extracttokenfromheader, int i) {
        super(extracttokenfromheader);
        this.IconCompatParcelizer = i;
        if (i != 1) {
        } else {
            super(extracttokenfromheader);
            this.serializer = -1;
        }
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return this.IconCompatParcelizer != 0 ? UserAgentHeaderInterceptorKt.write(PlaybackStateCompat(), z) : UserAgentHeaderInterceptorKt.write(MediaSessionCompatResultReceiverWrapper(), z);
    }

    @Override // o.ProvidernetworkModule1, o.provideRequest
    public provideRequest toDERObject() {
        return this.IconCompatParcelizer != 1 ? super.toDERObject() : this;
    }

    @Override // o.ProvidernetworkModule1
    public final ASN1OctetString MediaSessionCompatToken() {
        return this.IconCompatParcelizer != 0 ? new UrlBuilderKt(RetrofitBuilderKtDefaultRetrofitBuilder2.serializer(serializer()), 0) : new UrlBuilderKt(RetrofitBuilderKtDefaultRetrofitBuilder2.serializer(serializer()), 0);
    }

    @Override // o.ProvidernetworkModule1
    public final provideMoshi PlaybackStateCompatCustomAction() {
        return this.IconCompatParcelizer != 0 ? new ChatConfigurationDataStoreHelperImpl(this.RemoteActionCompatParcelizer) : new ChatConfigurationDataStoreHelperImpl(this.RemoteActionCompatParcelizer);
    }

    @Override // o.ProvidernetworkModule1
    public final TokenRefreshAuthenticator MediaDescriptionCompat() {
        return this.IconCompatParcelizer != 0 ? new PersistableChatConfigurationCompanion(getCallAdapter.read(read()), 1, (byte) 0) : new PersistableChatConfigurationCompanion(getCallAdapter.read(read()), 0, (byte) 0);
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        int i = 0;
        if (this.IconCompatParcelizer != 0) {
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(48, z);
            buildHelpCenterRegionServiceUrl buildhelpcenterregionserviceurl = userAgentHeaderInterceptorKt.read();
            int length = this.RemoteActionCompatParcelizer.length;
            if (this.serializer >= 0 || length > 16) {
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(PlaybackStateCompat());
                while (i < length) {
                    this.RemoteActionCompatParcelizer[i].RatingCompat().toDERObject().read(buildhelpcenterregionserviceurl, true);
                    i++;
                }
                return;
            }
            provideRequest[] providerequestArr = new provideRequest[length];
            int iRemoteActionCompatParcelizer = 0;
            for (int i2 = 0; i2 < length; i2++) {
                provideRequest dERObject = this.RemoteActionCompatParcelizer[i2].RatingCompat().toDERObject();
                providerequestArr[i2] = dERObject;
                iRemoteActionCompatParcelizer += dERObject.RemoteActionCompatParcelizer(true);
            }
            this.serializer = iRemoteActionCompatParcelizer;
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
            while (i < length) {
                providerequestArr[i].read(buildhelpcenterregionserviceurl, true);
                i++;
            }
            return;
        }
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(48, z);
        CustomerChatViewModel customerChatViewModelIconCompatParcelizer = userAgentHeaderInterceptorKt.IconCompatParcelizer();
        int length2 = this.RemoteActionCompatParcelizer.length;
        if (this.serializer >= 0 || length2 > 16) {
            userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper());
            while (i < length2) {
                customerChatViewModelIconCompatParcelizer.read(this.RemoteActionCompatParcelizer[i].RatingCompat());
                i++;
            }
            return;
        }
        provideRequest[] providerequestArr2 = new provideRequest[length2];
        int iRemoteActionCompatParcelizer2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            provideRequest providerequestMediaSessionCompatQueueItem = this.RemoteActionCompatParcelizer[i3].RatingCompat().MediaSessionCompatQueueItem();
            providerequestArr2[i3] = providerequestMediaSessionCompatQueueItem;
            iRemoteActionCompatParcelizer2 += providerequestMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(true);
        }
        this.serializer = iRemoteActionCompatParcelizer2;
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2);
        while (i < length2) {
            customerChatViewModelIconCompatParcelizer.read(providerequestArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryInfoCompanion(logErrordefault logerrordefault, int i) {
        super(logerrordefault);
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryInfoCompanion(extractTokenFromHeader extracttokenfromheader, boolean z) {
        super(extracttokenfromheader);
        this.IconCompatParcelizer = 1;
    }

    public DeliveryInfoCompanion(logErrordefault[] logerrordefaultArr, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = logerrordefaultArr;
    }
}
