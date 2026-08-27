package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProvidernetworkModule1 extends provideRequest implements Iterable {
    public static final ProvidernetworkModule12 write = new ProvidernetworkModule12(ProvidernetworkModule1.class, 6);
    public logErrordefault[] RemoteActionCompatParcelizer;

    public abstract TokenRefreshAuthenticator MediaDescriptionCompat();

    public abstract ASN1OctetString MediaSessionCompatToken();

    public abstract provideMoshi PlaybackStateCompatCustomAction();

    @Override // o.provideRequest
    public final boolean R_() {
        return true;
    }

    public static ProvidernetworkModule1 RemoteActionCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof ProvidernetworkModule1)) {
            return (ProvidernetworkModule1) obj;
        }
        if (obj instanceof logErrordefault) {
            provideRequest providerequestRatingCompat = ((logErrordefault) obj).RatingCompat();
            if (providerequestRatingCompat instanceof ProvidernetworkModule1) {
                return (ProvidernetworkModule1) providerequestRatingCompat;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ProvidernetworkModule1) write.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), "failed to construct sequence from byte[]: ");
                return null;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unknown object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    public logErrordefault IconCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer[i];
    }

    @Override // o.provideRequest
    public provideRequest MediaSessionCompatQueueItem() {
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(this.RemoteActionCompatParcelizer, 0);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public Enumeration RemoteActionCompatParcelizer() {
        return new ProvidernetworkModule11(this);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public int hashCode() {
        int length = this.RemoteActionCompatParcelizer.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.RemoteActionCompatParcelizer[length].RatingCompat().hashCode();
        }
    }

    public Iterator iterator() {
        return new CommonDomainCompanion(0, this.RemoteActionCompatParcelizer);
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(this.RemoteActionCompatParcelizer, 1);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }

    public int write() {
        return this.RemoteActionCompatParcelizer.length;
    }

    public final TokenRefreshAuthenticator[] read() {
        int iWrite = write();
        TokenRefreshAuthenticator[] tokenRefreshAuthenticatorArr = new TokenRefreshAuthenticator[iWrite];
        for (int i = 0; i < iWrite; i++) {
            tokenRefreshAuthenticatorArr[i] = TokenRefreshAuthenticator.write(this.RemoteActionCompatParcelizer[i]);
        }
        return tokenRefreshAuthenticatorArr;
    }

    public final ASN1OctetString[] serializer() {
        int iWrite = write();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[iWrite];
        for (int i = 0; i < iWrite; i++) {
            aSN1OctetStringArr[i] = ASN1OctetString.serializer(this.RemoteActionCompatParcelizer[i]);
        }
        return aSN1OctetStringArr;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof ProvidernetworkModule1) {
            ProvidernetworkModule1 providernetworkModule1 = (ProvidernetworkModule1) providerequest;
            int iWrite = write();
            if (providernetworkModule1.write() == iWrite) {
                for (int i = 0; i < iWrite; i++) {
                    provideRequest providerequestRatingCompat = this.RemoteActionCompatParcelizer[i].RatingCompat();
                    provideRequest providerequestRatingCompat2 = providernetworkModule1.RemoteActionCompatParcelizer[i].RatingCompat();
                    if (providerequestRatingCompat == providerequestRatingCompat2 || providerequestRatingCompat.serializer(providerequestRatingCompat2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int iWrite = write();
        if (iWrite == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.RemoteActionCompatParcelizer[i]);
            i++;
            if (i >= iWrite) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public ProvidernetworkModule1(logErrordefault logerrordefault) {
        if (logerrordefault != null) {
            this.RemoteActionCompatParcelizer = new logErrordefault[]{logerrordefault};
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'element' cannot be null");
            throw null;
        }
    }

    public ProvidernetworkModule1() {
        this.RemoteActionCompatParcelizer = extractTokenFromHeader.read;
    }

    public ProvidernetworkModule1(extractTokenFromHeader extracttokenfromheader) {
        if (extracttokenfromheader != null) {
            this.RemoteActionCompatParcelizer = extracttokenfromheader.IconCompatParcelizer();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'elementVector' cannot be null");
            throw null;
        }
    }
}
