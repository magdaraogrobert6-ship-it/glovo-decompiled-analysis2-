package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TokenRefreshAuthenticator extends provideRequest implements logError {
    public final byte[] write;
    public static final ProvidernetworkModule12 read = new ProvidernetworkModule12(TokenRefreshAuthenticator.class, 1);
    public static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public final byte[] serializer() {
        byte[] bArr = this.write;
        if (bArr[0] == 0) {
            return accessbootstrapIfNeeded.serializer(bArr, 1, bArr.length);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return this;
    }

    public static TokenRefreshAuthenticator write(Object obj) {
        if (obj == null || (obj instanceof TokenRefreshAuthenticator)) {
            return (TokenRefreshAuthenticator) obj;
        }
        if (obj instanceof logErrordefault) {
            provideRequest providerequestRatingCompat = ((logErrordefault) obj).RatingCompat();
            if (providerequestRatingCompat instanceof TokenRefreshAuthenticator) {
                return (TokenRefreshAuthenticator) providerequestRatingCompat;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (TokenRefreshAuthenticator) read.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), "failed to construct BIT STRING from byte[]: ");
                return null;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // o.logError
    public final InputStream RemoteActionCompatParcelizer() {
        byte[] bArr = this.write;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        byte[] bArr = this.write;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        byte b = bArr[0];
        int length = bArr.length;
        int i2 = length - 1;
        byte b2 = (byte) ((255 << (b & 255)) & bArr[i2]);
        if (bArr != null) {
            i = length;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i2];
            }
        }
        return (i * 257) ^ b2;
    }

    public final byte[] read() {
        byte[] bArr = this.write;
        if (bArr.length == 1) {
            return ASN1OctetString.write;
        }
        byte b = bArr[0];
        byte[] bArrSerializer = accessbootstrapIfNeeded.serializer(bArr, 1, bArr.length);
        int length = bArrSerializer.length - 1;
        bArrSerializer[length] = (byte) (((byte) (255 << (b & 255))) & bArrSerializer[length]);
        return bArrSerializer;
    }

    @Override // o.logError
    public final int IconCompatParcelizer() {
        return this.write[0] & 255;
    }

    @Override // o.provideRequest
    public provideRequest MediaSessionCompatQueueItem() {
        byte b = 0;
        return new PersistableChatConfigurationCompanion(this.write, b, b);
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        return new PersistableChatConfigurationCompanion(this.write, 1, (byte) 0);
    }

    public TokenRefreshAuthenticator(byte[] bArr, int i) {
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'data' cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("zero length data with non-zero pad bits");
            throw null;
        }
        if (i > 7 || i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.write = bArr2;
    }

    public static TokenRefreshAuthenticator write(byte[] bArr) {
        String str;
        int length = bArr.length;
        int i = 1;
        if (length >= 1) {
            byte b = 0;
            int i2 = bArr[0] & 255;
            if (i2 > 0) {
                if (i2 > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b2 = bArr[length - 1];
                    if (b2 != ((byte) ((255 << i2) & b2))) {
                        return new PersistableChatConfigurationCompanion(bArr, b, b);
                    }
                }
            }
            return new PersistableChatConfigurationCompanion(bArr, i, b);
        }
        str = "truncated BIT STRING detected";
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
        return null;
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (!(providerequest instanceof TokenRefreshAuthenticator)) {
            return false;
        }
        byte[] bArr = ((TokenRefreshAuthenticator) providerequest).write;
        byte[] bArr2 = this.write;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    public final String toString() {
        try {
            byte[] bArrMediaMetadataCompat = MediaMetadataCompat();
            StringBuffer stringBuffer = new StringBuffer((bArrMediaMetadataCompat.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != bArrMediaMetadataCompat.length; i++) {
                byte b = bArrMediaMetadataCompat[i];
                char[] cArr = RemoteActionCompatParcelizer;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Internal error encoding BitString: ", (Object) e.getMessage(), (Exception) e);
            return null;
        }
    }

    public TokenRefreshAuthenticator(byte[] bArr) {
        this.write = bArr;
    }
}
