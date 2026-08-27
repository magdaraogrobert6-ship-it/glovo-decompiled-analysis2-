package o;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlBuilderKt extends ASN1OctetString {
    public UrlBuilderKt(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 4, this.IconCompatParcelizer);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, o.provideRequest
    public final provideRequest toDERObject() {
        return this;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.IconCompatParcelizer.length, z);
    }

    public UrlBuilderKt(byte[] bArr, int i) {
        super(bArr);
    }
}
