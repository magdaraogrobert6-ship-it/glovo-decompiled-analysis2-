package org.bouncycastle.asn1;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.socket.parser.IOParser$Decoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import o.MediaSessionCompatQueueItem;
import o.Provider;
import o.ProvidernetworkModule12;
import o.UrlBuilderKt;
import o.accessbootstrapIfNeeded;
import o.evaluateFeaturefwf_client_releasedefault;
import o.logErrordefault;
import o.provideRequest;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import org.bouncycastle.util.encoders.EncoderException;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ASN1OctetString extends provideRequest implements Provider {
    public static final ProvidernetworkModule12 RemoteActionCompatParcelizer = new ProvidernetworkModule12(ASN1OctetString.class, 5);
    public static final byte[] write = new byte[0];
    public final byte[] IconCompatParcelizer;

    @Override // o.PhoneCallType
    public final provideRequest write() {
        return this;
    }

    public static ASN1OctetString serializer(Object obj) {
        if (obj == null || (obj instanceof ASN1OctetString)) {
            return (ASN1OctetString) obj;
        }
        if (obj instanceof logErrordefault) {
            provideRequest providerequestRatingCompat = ((logErrordefault) obj).RatingCompat();
            if (providerequestRatingCompat instanceof ASN1OctetString) {
                return (ASN1OctetString) providerequestRatingCompat;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1OctetString) RemoteActionCompatParcelizer.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(e.getMessage(), "failed to construct OCTET STRING from byte[]: ");
                return null;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("illegal object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // o.provideRequest
    public provideRequest MediaSessionCompatQueueItem() {
        return new UrlBuilderKt(this.IconCompatParcelizer, 0);
    }

    @Override // o.Provider
    public final InputStream RemoteActionCompatParcelizer() {
        return new ByteArrayInputStream(this.IconCompatParcelizer);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.IconCompatParcelizer);
    }

    @Override // o.provideRequest
    public provideRequest toDERObject() {
        return new UrlBuilderKt(this.IconCompatParcelizer, 0);
    }

    public final String toString() {
        IOParser$Decoder iOParser$Decoder = Hex.read;
        byte[] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            IOParser$Decoder iOParser$Decoder2 = Hex.read;
            iOParser$Decoder2.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i = 0;
                while (length > 0) {
                    int iMin = Math.min(36, length);
                    int i2 = i + iMin;
                    int i3 = 0;
                    while (i < i2) {
                        byte b = bArr[i];
                        byte[] bArr3 = (byte[]) iOParser$Decoder2.RemoteActionCompatParcelizer;
                        bArr2[i3] = bArr3[(b & 255) >>> 4];
                        bArr2[i3 + 1] = bArr3[b & 15];
                        i++;
                        i3 += 2;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i3);
                    length -= iMin;
                    i = i2;
                }
            }
            return "#".concat(evaluateFeaturefwf_client_releasedefault.read(byteArrayOutputStream.toByteArray()));
        } catch (Exception e) {
            EncoderException encoderException = new EncoderException(MediaSessionCompatQueueItem.read(e, new StringBuilder("exception encoding Hex string: ")));
            encoderException.write = e;
            throw encoderException;
        }
    }

    public ASN1OctetString(byte[] bArr) {
        if (bArr != null) {
            this.IconCompatParcelizer = bArr;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("'string' cannot be null");
            throw null;
        }
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (providerequest instanceof ASN1OctetString) {
            return Arrays.equals(this.IconCompatParcelizer, ((ASN1OctetString) providerequest).IconCompatParcelizer);
        }
        return false;
    }
}
