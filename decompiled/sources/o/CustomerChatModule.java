package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerChatModule extends getHostAppUserAgent {
    public WebViewPreloadingTypeCompanion RemoteActionCompatParcelizer;
    public TokenRefreshAuthenticator serializer;

    public final provideRequest write() {
        return provideRequest.RemoteActionCompatParcelizer(this.serializer.serializer());
    }

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader(2);
        extracttokenfromheader.write(this.RemoteActionCompatParcelizer);
        extracttokenfromheader.write(this.serializer);
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public static CustomerChatModule read(Object obj) {
        if (obj instanceof CustomerChatModule) {
            return (CustomerChatModule) obj;
        }
        if (obj == null) {
            return null;
        }
        ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(obj);
        CustomerChatModule customerChatModule = new CustomerChatModule();
        if (providernetworkModule1RemoteActionCompatParcelizer.write() != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(providernetworkModule1RemoteActionCompatParcelizer.write(), "Bad sequence size: ");
            return null;
        }
        Enumeration enumerationRemoteActionCompatParcelizer = providernetworkModule1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        customerChatModule.RemoteActionCompatParcelizer = WebViewPreloadingTypeCompanion.serializer(enumerationRemoteActionCompatParcelizer.nextElement());
        customerChatModule.serializer = TokenRefreshAuthenticator.write(enumerationRemoteActionCompatParcelizer.nextElement());
        return customerChatModule;
    }

    public CustomerChatModule(WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion, getHostAppUserAgent gethostappuseragent) {
        this.serializer = new PersistableChatConfigurationCompanion(gethostappuseragent.RatingCompat().MediaBrowserCompatMediaItem(), 0);
        this.RemoteActionCompatParcelizer = webViewPreloadingTypeCompanion;
    }

    public CustomerChatModule(WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion, byte[] bArr) {
        this.serializer = new PersistableChatConfigurationCompanion(bArr, 0);
        this.RemoteActionCompatParcelizer = webViewPreloadingTypeCompanion;
    }

    public CustomerChatModule() {
    }
}
