package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class setLookaheadLayoutPendingui implements isHitInMinimumTouchTargetBetter {
    public final int IconCompatParcelizer;
    public final invalidateSubtreedefault RemoteActionCompatParcelizer;

    @Override // o.isHitInMinimumTouchTargetBetter
    public final byte[] read(byte[] bArr) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer, bArr);
    }

    public setLookaheadLayoutPendingui(invalidateSubtreedefault invalidatesubtreedefault, int i) throws InvalidAlgorithmParameterException {
        this.RemoteActionCompatParcelizer = invalidatesubtreedefault;
        this.IconCompatParcelizer = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        invalidatesubtreedefault.IconCompatParcelizer(i, new byte[0]);
    }

    @Override // o.isHitInMinimumTouchTargetBetter
    public final void serializer(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(read(bArr2), bArr)) {
            return;
        }
        getAlignmentLinesMap.write("invalid MAC");
    }
}
