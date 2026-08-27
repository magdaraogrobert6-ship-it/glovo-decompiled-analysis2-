package org.bouncycastle.asn1;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import o.DeliveryInfoCompanion;
import o.ProvidernetworkModule1;
import o.TokenRefreshAuthenticator;
import o.UserAgentHeaderInterceptorKt;
import o.accessgetDeviceUtilsp;
import o.extractTokenFromHeader;
import o.getBackendNamecustomerchat_release;
import o.getHostAppUserAgent;
import o.getNetworkModule;
import o.logErrordefault;
import o.provideRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class DLExternal extends provideRequest {
    public int IconCompatParcelizer;
    public accessgetDeviceUtilsp MediaMetadataCompat;
    public provideRequest RemoteActionCompatParcelizer;
    public getNetworkModule read;
    public provideRequest serializer;
    public final /* synthetic */ int write = 1;

    public DLExternal(ProvidernetworkModule1 providernetworkModule1) {
        int i;
        provideRequest providerequestRatingCompat;
        provideRequest providerequestIconCompatParcelizer = IconCompatParcelizer(providernetworkModule1, 0);
        if (providerequestIconCompatParcelizer instanceof getNetworkModule) {
            this.read = (getNetworkModule) providerequestIconCompatParcelizer;
            providerequestIconCompatParcelizer = IconCompatParcelizer(providernetworkModule1, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (providerequestIconCompatParcelizer instanceof accessgetDeviceUtilsp) {
            this.MediaMetadataCompat = (accessgetDeviceUtilsp) providerequestIconCompatParcelizer;
            i++;
            providerequestIconCompatParcelizer = IconCompatParcelizer(providernetworkModule1, i);
        }
        if (!(providerequestIconCompatParcelizer instanceof getBackendNamecustomerchat_release)) {
            this.RemoteActionCompatParcelizer = providerequestIconCompatParcelizer;
            i++;
            providerequestIconCompatParcelizer = IconCompatParcelizer(providernetworkModule1, i);
        }
        if (providernetworkModule1.write() != i + 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("input sequence too large");
            throw null;
        }
        if (!(providerequestIconCompatParcelizer instanceof getBackendNamecustomerchat_release)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        getBackendNamecustomerchat_release getbackendnamecustomerchat_release = (getBackendNamecustomerchat_release) providerequestIconCompatParcelizer;
        int i2 = getbackendnamecustomerchat_release.read;
        if (i2 < 0 || i2 > 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "invalid encoding value: "));
            throw null;
        }
        this.IconCompatParcelizer = i2;
        ASN1Util.read(getbackendnamecustomerchat_release);
        if (i2 != 0) {
            if (i2 == 1) {
                providerequestRatingCompat = (ASN1OctetString) ASN1OctetString.RemoteActionCompatParcelizer.getContextInstance(getbackendnamecustomerchat_release, false);
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid tag: ".concat(ASN1Util.serializer(getbackendnamecustomerchat_release.RemoteActionCompatParcelizer, i2)));
                    throw null;
                }
                providerequestRatingCompat = (TokenRefreshAuthenticator) TokenRefreshAuthenticator.read.getContextInstance(getbackendnamecustomerchat_release, false);
            }
        } else {
            if (!getbackendnamecustomerchat_release.RemoteActionCompatParcelizer()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("object implicit - explicit expected.");
                throw null;
            }
            logErrordefault logerrordefault = getbackendnamecustomerchat_release.serializer;
            providerequestRatingCompat = (logerrordefault instanceof getHostAppUserAgent ? (getHostAppUserAgent) logerrordefault : logerrordefault.RatingCompat()).RatingCompat();
        }
        this.serializer = providerequestRatingCompat;
    }

    @Override // o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return true;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(40, z);
        RemoteActionCompatParcelizer().read(userAgentHeaderInterceptorKt, false);
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        DLExternal dLExternal;
        getNetworkModule getnetworkmodule;
        getNetworkModule getnetworkmodule2;
        if (this == providerequest) {
            return true;
        }
        if (!(providerequest instanceof DLExternal) || ((getnetworkmodule = this.read) != (getnetworkmodule2 = (dLExternal = (DLExternal) providerequest).read) && (getnetworkmodule == null || getnetworkmodule2 == null || !getnetworkmodule.equals(getnetworkmodule2)))) {
            return false;
        }
        accessgetDeviceUtilsp accessgetdeviceutilsp = this.MediaMetadataCompat;
        accessgetDeviceUtilsp accessgetdeviceutilsp2 = dLExternal.MediaMetadataCompat;
        if (accessgetdeviceutilsp != accessgetdeviceutilsp2 && (accessgetdeviceutilsp == null || accessgetdeviceutilsp2 == null || !accessgetdeviceutilsp.equals(accessgetdeviceutilsp2))) {
            return false;
        }
        provideRequest providerequest2 = this.RemoteActionCompatParcelizer;
        provideRequest providerequest3 = dLExternal.RemoteActionCompatParcelizer;
        return (providerequest2 == providerequest3 || !(providerequest2 == null || providerequest3 == null || !providerequest2.equals(providerequest3))) && this.IconCompatParcelizer == dLExternal.IconCompatParcelizer && this.serializer.write(dLExternal.serializer);
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(z);
    }

    public static provideRequest IconCompatParcelizer(ProvidernetworkModule1 providernetworkModule1, int i) {
        if (providernetworkModule1.write() > i) {
            return providernetworkModule1.IconCompatParcelizer(i).RatingCompat();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("too few objects in input sequence");
        return null;
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        getNetworkModule getnetworkmodule = this.read;
        int iHashCode = getnetworkmodule == null ? 0 : getnetworkmodule.hashCode();
        accessgetDeviceUtilsp accessgetdeviceutilsp = this.MediaMetadataCompat;
        int iHashCode2 = accessgetdeviceutilsp == null ? 0 : accessgetdeviceutilsp.hashCode();
        provideRequest providerequest = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ iHashCode2) ^ (providerequest != null ? providerequest.hashCode() : 0)) ^ this.IconCompatParcelizer) ^ this.serializer.hashCode();
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        if (this.write == 1) {
            return this;
        }
        getNetworkModule getnetworkmodule = this.read;
        accessgetDeviceUtilsp accessgetdeviceutilsp = this.MediaMetadataCompat;
        provideRequest providerequest = this.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        provideRequest providerequest2 = this.serializer;
        DLExternal dLExternal = new DLExternal();
        dLExternal.read = getnetworkmodule;
        dLExternal.MediaMetadataCompat = accessgetdeviceutilsp;
        dLExternal.RemoteActionCompatParcelizer = providerequest;
        if (i < 0 || i > 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "invalid encoding value: "));
        } else {
            dLExternal.IconCompatParcelizer = i;
            if (i == 1 ? ASN1OctetString.class.isInstance(providerequest2) : !(i == 2 && !TokenRefreshAuthenticator.class.isInstance(providerequest2))) {
                dLExternal.serializer = providerequest2;
                return dLExternal;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("unexpected object: ".concat(providerequest2.getClass().getName()));
        }
        return null;
    }

    public final ProvidernetworkModule1 RemoteActionCompatParcelizer() {
        if (this.write != 0) {
            extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader(4);
            getNetworkModule getnetworkmodule = this.read;
            if (getnetworkmodule != null) {
                extracttokenfromheader.write(getnetworkmodule);
            }
            accessgetDeviceUtilsp accessgetdeviceutilsp = this.MediaMetadataCompat;
            if (accessgetdeviceutilsp != null) {
                extracttokenfromheader.write(accessgetdeviceutilsp);
            }
            provideRequest providerequest = this.RemoteActionCompatParcelizer;
            if (providerequest != null) {
                extracttokenfromheader.write(providerequest.toDERObject());
            }
            int i = this.IconCompatParcelizer;
            extracttokenfromheader.write(new getBackendNamecustomerchat_release(i == 0, i, this.serializer, 2));
            DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
            deliveryInfoCompanion.serializer = -1;
            return deliveryInfoCompanion;
        }
        extractTokenFromHeader extracttokenfromheader2 = new extractTokenFromHeader(4);
        getNetworkModule getnetworkmodule2 = this.read;
        if (getnetworkmodule2 != null) {
            extracttokenfromheader2.write(getnetworkmodule2);
        }
        accessgetDeviceUtilsp accessgetdeviceutilsp2 = this.MediaMetadataCompat;
        if (accessgetdeviceutilsp2 != null) {
            extracttokenfromheader2.write(accessgetdeviceutilsp2);
        }
        provideRequest providerequest2 = this.RemoteActionCompatParcelizer;
        if (providerequest2 != null) {
            extracttokenfromheader2.write(providerequest2.MediaSessionCompatQueueItem());
        }
        int i2 = this.IconCompatParcelizer;
        extracttokenfromheader2.write(new getBackendNamecustomerchat_release(i2 == 0, i2, this.serializer, 0));
        DeliveryInfoCompanion deliveryInfoCompanion2 = new DeliveryInfoCompanion(extracttokenfromheader2, 0);
        deliveryInfoCompanion2.serializer = -1;
        return deliveryInfoCompanion2;
    }

    public /* synthetic */ DLExternal() {
    }
}
