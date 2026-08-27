package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: classes2.dex */
public final class InteroperableComposeUiNode {
    public static final IntrinsicsPolicy RemoteActionCompatParcelizer = IntrinsicsPolicy.ALGORITHM_NOT_FIPS;
    public final InternalCoreApi read;
    public final InternalCoreApi serializer;
    public final /* synthetic */ int write;

    public InteroperableComposeUiNode(byte[] bArr, int i) throws GeneralSecurityException {
        this.write = i;
        if (!RemoteActionCompatParcelizer.isCompatible()) {
            getAlignmentLinesMap.write("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.read = RemoteActionCompatParcelizer(1, bArr);
        this.serializer = RemoteActionCompatParcelizer(0, bArr);
    }

    public static byte[] IconCompatParcelizer(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public final void RemoteActionCompatParcelizer(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        InternalCoreApi internalCoreApi = this.read;
        internalCoreApi.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given ByteBuffer output is too small");
            return;
        }
        internalCoreApi.serializer(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.serializer.IconCompatParcelizer(0, bArr).get(bArr4);
        byte[] bArr5 = sortDiagonals.read(bArr4, IconCompatParcelizer(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArr5);
    }

    public final InternalCoreApi RemoteActionCompatParcelizer(int i, byte[] bArr) {
        return this.write != 0 ? new InternalCoreApi(bArr, i, 1) : new InternalCoreApi(bArr, i, 0);
    }

    public final byte[] write(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.serializer.IconCompatParcelizer(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(sortDiagonals.read(bArr4, IconCompatParcelizer(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            InternalCoreApi internalCoreApi = this.read;
            internalCoreApi.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            internalCoreApi.serializer(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }
}
