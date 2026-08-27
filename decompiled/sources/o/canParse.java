package o;

/* JADX INFO: loaded from: classes4.dex */
public final class canParse extends authenticate {
    @Override // o.provideRequest
    public final provideRequest MediaSessionCompatQueueItem() {
        return this;
    }

    @Override // o.authenticate, o.provideRequest
    public final provideRequest toDERObject() {
        return this;
    }

    @Override // o.authenticate, o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 24, read());
    }

    public final byte[] read() {
        byte[] bArr = this.IconCompatParcelizer;
        if (bArr[bArr.length - 1] == 90) {
            if (!IconCompatParcelizer(10) || !IconCompatParcelizer(11)) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                int i = evaluateFeaturefwf_client_releasedefault.RemoteActionCompatParcelizer;
                byte[] bArr3 = new byte[5];
                for (int i2 = 0; i2 != 5; i2++) {
                    bArr3[i2] = (byte) "0000Z".charAt(i2);
                }
                System.arraycopy(bArr3, 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!IconCompatParcelizer(12) || !IconCompatParcelizer(13)) {
                byte[] bArr4 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr4, 0, bArr.length - 1);
                int i3 = evaluateFeaturefwf_client_releasedefault.RemoteActionCompatParcelizer;
                byte[] bArr5 = new byte[3];
                for (int i4 = 0; i4 != 3; i4++) {
                    bArr5[i4] = (byte) "00Z".charAt(i4);
                }
                System.arraycopy(bArr5, 0, bArr4, bArr.length - 1, 3);
                return bArr4;
            }
            for (int i5 = 0; i5 != bArr.length; i5++) {
                if (bArr[i5] == 46 && i5 == 14) {
                    int length = bArr.length - 2;
                    while (length > 0 && bArr[length] == 48) {
                        length--;
                    }
                    if (bArr[length] == 46) {
                        byte[] bArr6 = new byte[length + 1];
                        System.arraycopy(bArr, 0, bArr6, 0, length);
                        bArr6[length] = 90;
                        return bArr6;
                    }
                    byte[] bArr7 = new byte[length + 2];
                    int i6 = length + 1;
                    System.arraycopy(bArr, 0, bArr7, 0, i6);
                    bArr7[i6] = 90;
                    return bArr7;
                }
            }
        }
        return bArr;
    }

    @Override // o.authenticate, o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(read().length, z);
    }

    public canParse(byte[] bArr) {
        super(bArr);
    }
}
