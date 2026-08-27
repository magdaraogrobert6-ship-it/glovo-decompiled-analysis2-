package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class provideMoshi extends provideRequest implements Iterable {
    public static final ProvidernetworkModule12 write = new ProvidernetworkModule12(provideMoshi.class, 0);
    public final logErrordefault[] RemoteActionCompatParcelizer;
    public logErrordefault[] read;

    public static boolean IconCompatParcelizer(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[iMin] & 255) <= (bArr2[iMin] & 255);
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return true;
    }

    @Override // o.provideRequest
    public provideRequest MediaSessionCompatQueueItem() {
        ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl = new ChatConfigurationDataStoreHelperImpl(this.RemoteActionCompatParcelizer, this.read);
        chatConfigurationDataStoreHelperImpl.IconCompatParcelizer = -1;
        return chatConfigurationDataStoreHelperImpl;
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        logErrordefault[] logerrordefaultArr = this.RemoteActionCompatParcelizer;
        int length = logerrordefaultArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += logerrordefaultArr[length].RatingCompat().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        logErrordefault[] logerrordefaultArr = this.RemoteActionCompatParcelizer;
        return new CommonDomainCompanion(0, logerrordefaultArr.length < 1 ? extractTokenFromHeader.read : (logErrordefault[]) logerrordefaultArr.clone());
    }

    public final String toString() {
        logErrordefault[] logerrordefaultArr = this.RemoteActionCompatParcelizer;
        int length = logerrordefaultArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(logerrordefaultArr[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public static byte[] serializer(logErrordefault logerrordefault) {
        try {
            return logerrordefault.RatingCompat().MediaBrowserCompatMediaItem();
        } catch (IOException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cannot encode object added to SET");
            return null;
        }
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        int i;
        boolean z = true;
        if (this.read == null) {
            logErrordefault[] logerrordefaultArr = (logErrordefault[]) this.RemoteActionCompatParcelizer.clone();
            this.read = logerrordefaultArr;
            int length = logerrordefaultArr.length;
            if (length >= 2) {
                logErrordefault logerrordefault = logerrordefaultArr[0];
                logErrordefault logerrordefault2 = logerrordefaultArr[1];
                byte[] bArrSerializer = serializer(logerrordefault);
                byte[] bArrSerializer2 = serializer(logerrordefault2);
                if (IconCompatParcelizer(bArrSerializer2, bArrSerializer)) {
                    logerrordefault2 = logerrordefault;
                    logerrordefault = logerrordefault2;
                } else {
                    bArrSerializer2 = bArrSerializer;
                    bArrSerializer = bArrSerializer2;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    logErrordefault logerrordefault3 = logerrordefaultArr[i2];
                    byte[] bArrSerializer3 = serializer(logerrordefault3);
                    if (IconCompatParcelizer(bArrSerializer, bArrSerializer3)) {
                        logerrordefaultArr[i2 - 2] = logerrordefault;
                        logerrordefault = logerrordefault2;
                        bArrSerializer2 = bArrSerializer;
                        logerrordefault2 = logerrordefault3;
                        bArrSerializer = bArrSerializer3;
                    } else if (IconCompatParcelizer(bArrSerializer2, bArrSerializer3)) {
                        logerrordefaultArr[i2 - 2] = logerrordefault;
                        logerrordefault = logerrordefault3;
                        bArrSerializer2 = bArrSerializer3;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i = i3 - 1;
                            if (i <= 0) {
                                break;
                            }
                            logErrordefault logerrordefault4 = logerrordefaultArr[i3 - 2];
                            if (IconCompatParcelizer(serializer(logerrordefault4), bArrSerializer3)) {
                                break;
                            }
                            logerrordefaultArr[i] = logerrordefault4;
                            i3 = i;
                        }
                        logerrordefaultArr[i] = logerrordefault3;
                    }
                }
                logerrordefaultArr[length - 2] = logerrordefault;
                logerrordefaultArr[length - 1] = logerrordefault2;
            }
        }
        ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl = new ChatConfigurationDataStoreHelperImpl(z, this.read);
        chatConfigurationDataStoreHelperImpl.IconCompatParcelizer = -1;
        return chatConfigurationDataStoreHelperImpl;
    }

    public provideMoshi(extractTokenFromHeader extracttokenfromheader) {
        if (extracttokenfromheader == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'elementVector' cannot be null");
            throw null;
        }
        logErrordefault[] logerrordefaultArrIconCompatParcelizer = extracttokenfromheader.IconCompatParcelizer();
        this.RemoteActionCompatParcelizer = logerrordefaultArrIconCompatParcelizer;
        this.read = logerrordefaultArrIconCompatParcelizer.length < 2 ? logerrordefaultArrIconCompatParcelizer : null;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof provideMoshi) {
            provideMoshi providemoshi = (provideMoshi) providerequest;
            int length = this.RemoteActionCompatParcelizer.length;
            if (providemoshi.RemoteActionCompatParcelizer.length == length) {
                ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl = (ChatConfigurationDataStoreHelperImpl) toDERObject();
                ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl2 = (ChatConfigurationDataStoreHelperImpl) providemoshi.toDERObject();
                for (int i = 0; i < length; i++) {
                    provideRequest providerequestRatingCompat = chatConfigurationDataStoreHelperImpl.RemoteActionCompatParcelizer[i].RatingCompat();
                    provideRequest providerequestRatingCompat2 = chatConfigurationDataStoreHelperImpl2.RemoteActionCompatParcelizer[i].RatingCompat();
                    if (providerequestRatingCompat == providerequestRatingCompat2 || providerequestRatingCompat.serializer(providerequestRatingCompat2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public provideMoshi() {
        logErrordefault[] logerrordefaultArr = extractTokenFromHeader.read;
        this.RemoteActionCompatParcelizer = logerrordefaultArr;
        this.read = logerrordefaultArr;
    }

    public provideMoshi(boolean z, logErrordefault[] logerrordefaultArr) {
        this.RemoteActionCompatParcelizer = logerrordefaultArr;
        if (!z && logerrordefaultArr.length >= 2) {
            logerrordefaultArr = null;
        }
        this.read = logerrordefaultArr;
    }

    public provideMoshi(logErrordefault[] logerrordefaultArr, logErrordefault[] logerrordefaultArr2) {
        this.RemoteActionCompatParcelizer = logerrordefaultArr;
        this.read = logerrordefaultArr2;
    }
}
