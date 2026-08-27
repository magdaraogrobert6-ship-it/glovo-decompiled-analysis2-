package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewPreloadingTypeCompanion extends getHostAppUserAgent {
    public getNetworkModule IconCompatParcelizer;
    public logErrordefault serializer;

    public WebViewPreloadingTypeCompanion(getNetworkModule getnetworkmodule, getHostAppUserAgent gethostappuseragent) {
        this.IconCompatParcelizer = getnetworkmodule;
        this.serializer = gethostappuseragent;
    }

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader(2);
        extracttokenfromheader.write(this.IconCompatParcelizer);
        logErrordefault logerrordefault = this.serializer;
        if (logerrordefault != null) {
            extracttokenfromheader.write(logerrordefault);
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public static WebViewPreloadingTypeCompanion serializer(Object obj) {
        getNetworkModule getnetworkmodule;
        if (obj instanceof WebViewPreloadingTypeCompanion) {
            return (WebViewPreloadingTypeCompanion) obj;
        }
        if (obj != null) {
            ProvidernetworkModule1 providernetworkModule1RemoteActionCompatParcelizer = ProvidernetworkModule1.RemoteActionCompatParcelizer(obj);
            WebViewPreloadingTypeCompanion webViewPreloadingTypeCompanion = new WebViewPreloadingTypeCompanion();
            if (providernetworkModule1RemoteActionCompatParcelizer.write() >= 1 && providernetworkModule1RemoteActionCompatParcelizer.write() <= 2) {
                logErrordefault logerrordefaultIconCompatParcelizer = providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(0);
                ConcurrentHashMap concurrentHashMap = getNetworkModule.RemoteActionCompatParcelizer;
                if (logerrordefaultIconCompatParcelizer == null || (logerrordefaultIconCompatParcelizer instanceof getNetworkModule)) {
                    getnetworkmodule = (getNetworkModule) logerrordefaultIconCompatParcelizer;
                } else {
                    provideRequest providerequestRatingCompat = logerrordefaultIconCompatParcelizer.RatingCompat();
                    if (!(providerequestRatingCompat instanceof getNetworkModule)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal object in getInstance: ".concat(logerrordefaultIconCompatParcelizer.getClass().getName()));
                        return null;
                    }
                    getnetworkmodule = (getNetworkModule) providerequestRatingCompat;
                }
                webViewPreloadingTypeCompanion.IconCompatParcelizer = getnetworkmodule;
                if (providernetworkModule1RemoteActionCompatParcelizer.write() == 2) {
                    webViewPreloadingTypeCompanion.serializer = providernetworkModule1RemoteActionCompatParcelizer.IconCompatParcelizer(1);
                    return webViewPreloadingTypeCompanion;
                }
                webViewPreloadingTypeCompanion.serializer = null;
                return webViewPreloadingTypeCompanion;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(providernetworkModule1RemoteActionCompatParcelizer.write(), "Bad sequence size: ");
        }
        return null;
    }

    public WebViewPreloadingTypeCompanion(getNetworkModule getnetworkmodule) {
        this.IconCompatParcelizer = getnetworkmodule;
    }

    public WebViewPreloadingTypeCompanion() {
    }
}
