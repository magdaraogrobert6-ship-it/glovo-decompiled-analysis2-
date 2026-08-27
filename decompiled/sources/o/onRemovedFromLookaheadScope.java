package o;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class onRemovedFromLookaheadScope implements findBestHitDistancefn2tFes {
    public final InteroperableComposeUiNode serializer;
    public final /* synthetic */ int write;

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.write;
        InteroperableComposeUiNode interoperableComposeUiNode = this.serializer;
        if (i != 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
            byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(24);
            byteBufferAllocate.put(bArrIconCompatParcelizer);
            interoperableComposeUiNode.RemoteActionCompatParcelizer(byteBufferAllocate, bArrIconCompatParcelizer, bArr, bArr2);
            return byteBufferAllocate.array();
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrIconCompatParcelizer2 = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(12);
        byteBufferAllocate2.put(bArrIconCompatParcelizer2);
        interoperableComposeUiNode.RemoteActionCompatParcelizer(byteBufferAllocate2, bArrIconCompatParcelizer2, bArr, bArr2);
        return byteBufferAllocate2.array();
    }

    public onRemovedFromLookaheadScope(byte[] bArr, int i) {
        this.write = i;
        if (i != 1) {
            this.serializer = new InteroperableComposeUiNode(bArr, 0);
        } else {
            this.serializer = new InteroperableComposeUiNode(bArr, 1);
        }
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.write;
        InteroperableComposeUiNode interoperableComposeUiNode = this.serializer;
        if (i != 0) {
            if (bArr.length >= 40) {
                return interoperableComposeUiNode.write(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
            }
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        if (bArr.length >= 28) {
            return interoperableComposeUiNode.write(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        getAlignmentLinesMap.write("ciphertext too short");
        return null;
    }
}
