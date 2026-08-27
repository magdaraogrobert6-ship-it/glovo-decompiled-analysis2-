package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getHoldouts implements CustomerChatModulestartChat2 {
    public final int IconCompatParcelizer;
    public final CustomerChatModulestartChat2 RemoteActionCompatParcelizer;

    @Override // o.CustomerChatModulestartChat2
    public int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public byte[] read(int i, byte[] bArr, byte[] bArr2) {
        long j = i;
        int i2 = this.IconCompatParcelizer;
        byte[] bArrWrite = hsvJlNiLsgdefault.write(i2, j);
        int length = bArrWrite.length;
        CustomerChatModulestartChat2 customerChatModulestartChat2 = this.RemoteActionCompatParcelizer;
        customerChatModulestartChat2.IconCompatParcelizer(bArrWrite, 0, length);
        customerChatModulestartChat2.IconCompatParcelizer(bArr, 0, bArr.length);
        customerChatModulestartChat2.IconCompatParcelizer(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i2];
        if (customerChatModulestartChat2 instanceof getFinancial) {
            ((getFinancial) customerChatModulestartChat2).serializer(bArr3, 0, i2);
            return bArr3;
        }
        customerChatModulestartChat2.serializer(0, bArr3);
        return bArr3;
    }

    public byte[] read(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length != this.IconCompatParcelizer) {
            str = "wrong key length";
        } else {
            if (bArr2.length == 32) {
                return read(3, bArr, bArr2);
            }
            str = "wrong address length";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
        return null;
    }

    @Override // o.CustomerChatModulestartChat2
    public void RemoteActionCompatParcelizer(byte b) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(b);
    }

    @Override // o.CustomerChatModulestartChat2
    public int serializer(int i, byte[] bArr) {
        CustomerChatModulestartChat2 customerChatModulestartChat2 = this.RemoteActionCompatParcelizer;
        byte[] bArr2 = new byte[customerChatModulestartChat2.RemoteActionCompatParcelizer()];
        customerChatModulestartChat2.serializer(0, bArr2);
        int i2 = this.IconCompatParcelizer;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // o.CustomerChatModulestartChat2
    public String serializer() {
        return this.RemoteActionCompatParcelizer.serializer() + "/" + (this.IconCompatParcelizer * 8);
    }

    public getHoldouts(int i, getNetworkModule getnetworkmodule) {
        if (getnetworkmodule == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("digest == null");
            throw null;
        }
        this.RemoteActionCompatParcelizer = getFeature.RemoteActionCompatParcelizer(getnetworkmodule);
        this.IconCompatParcelizer = i;
    }

    @Override // o.CustomerChatModulestartChat2
    public void IconCompatParcelizer(byte[] bArr, int i, int i2) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(bArr, i, i2);
    }

    public getHoldouts(int i, CustomerChatModulestartChat2 customerChatModulestartChat2) {
        this.RemoteActionCompatParcelizer = customerChatModulestartChat2;
        this.IconCompatParcelizer = i;
    }
}
