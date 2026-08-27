package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoCompanion extends getHostAppUserAgent {
    public ASN1OctetString IconCompatParcelizer;
    public accessgetDeviceUtilsp RemoteActionCompatParcelizer;
    public TokenRefreshAuthenticator read;
    public WebViewPreloadingTypeCompanion serializer;
    public provideMoshi write;

    public final provideRequest serializer() {
        return provideRequest.RemoteActionCompatParcelizer(this.IconCompatParcelizer.IconCompatParcelizer);
    }

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader(5);
        extracttokenfromheader.write(this.RemoteActionCompatParcelizer);
        extracttokenfromheader.write(this.serializer);
        extracttokenfromheader.write(this.IconCompatParcelizer);
        provideMoshi providemoshi = this.write;
        if (providemoshi != null) {
            extracttokenfromheader.write(new getBackendNamecustomerchat_release(false, 0, (logErrordefault) providemoshi, 2));
        }
        TokenRefreshAuthenticator tokenRefreshAuthenticator = this.read;
        if (tokenRefreshAuthenticator != null) {
            extracttokenfromheader.write(new getBackendNamecustomerchat_release(false, 1, (logErrordefault) tokenRefreshAuthenticator, 2));
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public static UserInfoCompanion write(Object obj) {
        if (obj instanceof UserInfoCompanion) {
            return (UserInfoCompanion) obj;
        }
        if (obj != null) {
            ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(obj);
            UserInfoCompanion userInfoCompanion = new UserInfoCompanion();
            Enumeration enumerationRemoteActionCompatParcelizer = providernetworkModule1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            accessgetDeviceUtilsp accessgetdeviceutilspRemoteActionCompatParcelizer = accessgetDeviceUtilsp.RemoteActionCompatParcelizer(enumerationRemoteActionCompatParcelizer.nextElement());
            userInfoCompanion.RemoteActionCompatParcelizer = accessgetdeviceutilspRemoteActionCompatParcelizer;
            int i = accessgetdeviceutilspRemoteActionCompatParcelizer.read();
            if (i >= 0 && i <= 1) {
                userInfoCompanion.serializer = WebViewPreloadingTypeCompanion.serializer(enumerationRemoteActionCompatParcelizer.nextElement());
                userInfoCompanion.IconCompatParcelizer = ASN1OctetString.serializer(enumerationRemoteActionCompatParcelizer.nextElement());
                int i2 = -1;
                while (enumerationRemoteActionCompatParcelizer.hasMoreElements()) {
                    getBackendNamecustomerchat_release getbackendnamecustomerchat_release = (getBackendNamecustomerchat_release) enumerationRemoteActionCompatParcelizer.nextElement();
                    int i3 = getbackendnamecustomerchat_release.read;
                    if (i3 <= i2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid optional field in private key info");
                        return null;
                    }
                    if (i3 == 0) {
                        userInfoCompanion.write = (provideMoshi) provideMoshi.write.getContextInstance(getbackendnamecustomerchat_release, false);
                    } else {
                        if (i3 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown optional field in private key info");
                            return null;
                        }
                        if (i < 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("'publicKey' requires version v2(1) or later");
                            return null;
                        }
                        userInfoCompanion.read = (TokenRefreshAuthenticator) TokenRefreshAuthenticator.read.getContextInstance(getbackendnamecustomerchat_release, false);
                    }
                    i2 = i3;
                }
                return userInfoCompanion;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid version for private key info");
        }
        return null;
    }

    public UserInfoCompanion(WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion, getHostAppUserAgent gethostappuseragent, provideMoshi providemoshi, byte[] bArr) {
        this.RemoteActionCompatParcelizer = new accessgetDeviceUtilsp(bArr != null ? FwFClient.IconCompatParcelizer : FwFClient.RemoteActionCompatParcelizer);
        this.serializer = webViewPreloadingTypeCompanion;
        this.IconCompatParcelizer = new UrlBuilderKt(gethostappuseragent.RatingCompat().MediaBrowserCompatMediaItem(), 0);
        this.write = providemoshi;
        this.read = bArr == null ? null : new PersistableChatConfigurationCompanion(bArr, 0);
    }

    public UserInfoCompanion(WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion, provideRequest providerequest, provideMoshi providemoshi) {
        this(webViewPreloadingTypeCompanion, providerequest, providemoshi, null);
    }

    public UserInfoCompanion() {
    }
}
