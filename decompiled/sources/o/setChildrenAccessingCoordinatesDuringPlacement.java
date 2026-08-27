package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class setChildrenAccessingCoordinatesDuringPlacement implements findBestHitDistancefn2tFes {
    public final isHitInMinimumTouchTargetBetter RemoteActionCompatParcelizer;
    public final int read;
    public final getWidthui serializer;

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        getWidthui getwidthui = this.serializer;
        getwidthui.getClass();
        int length = bArr.length;
        int i = getwidthui.read;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(c8$$ExternalSyntheticOutline0.m(i2, "plaintext length can not exceed "));
        }
        byte[] bArr3 = new byte[bArr.length + i];
        byte[] bArrIconCompatParcelizer = setLookaheadCoordinatesAccessedDuringModifierPlacement.IconCompatParcelizer(i);
        System.arraycopy(bArrIconCompatParcelizer, 0, bArr3, 0, i);
        getwidthui.RemoteActionCompatParcelizer(bArr, 0, bArr.length, bArr3, getwidthui.read, bArrIconCompatParcelizer, true);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr3, this.RemoteActionCompatParcelizer.read(coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    public setChildrenAccessingCoordinatesDuringPlacement(getWidthui getwidthui, isHitInMinimumTouchTargetBetter ishitinminimumtouchtargetbetter, int i) {
        this.serializer = getwidthui;
        this.RemoteActionCompatParcelizer = ishitinminimumtouchtargetbetter;
        this.read = i;
    }

    @Override // o.findBestHitDistancefn2tFes
    public final byte[] serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.read;
        if (length < i) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.RemoteActionCompatParcelizer.serializer(bArrCopyOfRange2, coil3.ExtrasKt.RemoteActionCompatParcelizer(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        getWidthui getwidthui = this.serializer;
        getwidthui.getClass();
        int length2 = bArrCopyOfRange.length;
        int i2 = getwidthui.read;
        if (length2 < i2) {
            getAlignmentLinesMap.write("ciphertext too short");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArrCopyOfRange, 0, bArr3, 0, i2);
        int length3 = bArrCopyOfRange.length;
        int i3 = getwidthui.read;
        byte[] bArr4 = new byte[length3 - i3];
        getwidthui.RemoteActionCompatParcelizer(bArrCopyOfRange, i3, bArrCopyOfRange.length - i3, bArr4, 0, bArr3, false);
        return bArr4;
    }
}
