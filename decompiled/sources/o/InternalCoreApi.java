package o;

import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalCoreApi {
    public final int[] IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final int write;

    public final int serializer() {
        return this.RemoteActionCompatParcelizer != 0 ? 24 : 12;
    }

    public final void serializer(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != serializer()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + serializer());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer byteBufferIconCompatParcelizer = IconCompatParcelizer(this.write + i2, bArr);
            if (i2 == i) {
                coil3.ExtrasKt.IconCompatParcelizer(byteBuffer, byteBuffer2, byteBufferIconCompatParcelizer, iRemaining % 64);
            } else {
                coil3.ExtrasKt.IconCompatParcelizer(byteBuffer, byteBuffer2, byteBufferIconCompatParcelizer, 64);
            }
        }
    }

    public InternalCoreApi(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.RemoteActionCompatParcelizer = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.IconCompatParcelizer = pushRange.write(bArr);
        this.write = i;
    }

    public final ByteBuffer IconCompatParcelizer(int i, byte[] bArr) {
        int[] iArr;
        int[] iArrWrite = pushRange.write(bArr);
        int i2 = this.RemoteActionCompatParcelizer;
        int[] iArr2 = this.IconCompatParcelizer;
        if (i2 != 0) {
            if (iArrWrite.length == 6) {
                iArr = new int[16];
                int[] iArr3 = new int[16];
                int[] iArr4 = pushRange.write;
                System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
                System.arraycopy(iArr2, 0, iArr3, iArr4.length, 8);
                iArr3[12] = iArrWrite[0];
                iArr3[13] = iArrWrite[1];
                iArr3[14] = iArrWrite[2];
                iArr3[15] = iArrWrite[3];
                pushRange.write(iArr3);
                iArr3[4] = iArr3[12];
                iArr3[5] = iArr3[13];
                iArr3[6] = iArr3[14];
                iArr3[7] = iArr3[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr3, 8);
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                System.arraycopy(iArrCopyOf, 0, iArr, iArr4.length, 8);
                iArr[12] = i;
                iArr[13] = 0;
                iArr[14] = iArrWrite[4];
                iArr[15] = iArrWrite[5];
            } else {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArrWrite.length * 32)});
                iArr = null;
            }
        } else if (iArrWrite.length == 3) {
            iArr = new int[16];
            int[] iArr5 = pushRange.write;
            System.arraycopy(iArr5, 0, iArr, 0, iArr5.length);
            System.arraycopy(iArr2, 0, iArr, iArr5.length, 8);
            iArr[12] = i;
            System.arraycopy(iArrWrite, 0, iArr, 13, iArrWrite.length);
        } else {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArrWrite.length * 32)});
            iArr = null;
        }
        int[] iArr6 = (int[]) iArr.clone();
        pushRange.write(iArr6);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = iArr[i3] + iArr6[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }
}
