package o;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class RetrofitBuilderKtDefaultRetrofitBuilder2 extends ASN1OctetString {
    public final ASN1OctetString[] read;
    public final int serializer;

    @Override // o.provideRequest
    public final boolean R_() {
        return true;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) throws IOException {
        userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(36, z);
        userAgentHeaderInterceptorKt.write(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        ASN1OctetString[] aSN1OctetStringArr = this.read;
        if (aSN1OctetStringArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.IconCompatParcelizer;
                if (i >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i, this.serializer);
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(4, true);
                userAgentHeaderInterceptorKt.RemoteActionCompatParcelizer(iMin);
                userAgentHeaderInterceptorKt.IconCompatParcelizer(bArr, i, iMin);
                i += iMin;
            }
        } else {
            userAgentHeaderInterceptorKt.serializer(aSN1OctetStringArr);
        }
        userAgentHeaderInterceptorKt.write(0);
        userAgentHeaderInterceptorKt.write(0);
    }

    public RetrofitBuilderKtDefaultRetrofitBuilder2(byte[] bArr, ASN1OctetString[] aSN1OctetStringArr) {
        super(bArr);
        this.read = aSN1OctetStringArr;
        this.serializer = 1000;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        int iRemoteActionCompatParcelizer = z ? 4 : 3;
        ASN1OctetString[] aSN1OctetStringArr = this.read;
        if (aSN1OctetStringArr != null) {
            for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
                iRemoteActionCompatParcelizer += aSN1OctetString.RemoteActionCompatParcelizer(true);
            }
            return iRemoteActionCompatParcelizer;
        }
        byte[] bArr = this.IconCompatParcelizer;
        int length = bArr.length;
        int i = this.serializer;
        int i2 = length / i;
        int iWrite = (UserAgentHeaderInterceptorKt.write(i, true) * i2) + iRemoteActionCompatParcelizer;
        int length2 = bArr.length - (i2 * i);
        return length2 > 0 ? UserAgentHeaderInterceptorKt.write(length2, true) + iWrite : iWrite;
    }

    public static byte[] serializer(ASN1OctetString[] aSN1OctetStringArr) {
        int length = aSN1OctetStringArr.length;
        if (length == 0) {
            return ASN1OctetString.write;
        }
        if (length == 1) {
            return aSN1OctetStringArr[0].IconCompatParcelizer;
        }
        int length2 = 0;
        for (ASN1OctetString aSN1OctetString : aSN1OctetStringArr) {
            length2 += aSN1OctetString.IconCompatParcelizer.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (ASN1OctetString aSN1OctetString2 : aSN1OctetStringArr) {
            byte[] bArr2 = aSN1OctetString2.IconCompatParcelizer;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }
}
