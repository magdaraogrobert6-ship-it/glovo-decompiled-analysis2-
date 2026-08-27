package o;

import coil3.Extras$Key;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class swapDiagonal extends AbstractC0205subList {
    public static swapDiagonal read(HitTestResultSubList hitTestResultSubList, Extras$Key extras$Key, Integer num) throws GeneralSecurityException {
        setNextChildPlaceOrderui setnextchildplaceorderui = (setNextChildPlaceOrderui) extras$Key.IconCompatParcelizer;
        HitTestResultSubList hitTestResultSubList2 = HitTestResultSubList.RatingCompat;
        if (hitTestResultSubList != hitTestResultSubList2 && num == null) {
            getAlignmentLinesMap.read("For given Variant ", hitTestResultSubList, " the value of idRequirement must be non-null");
            return null;
        }
        if (hitTestResultSubList == hitTestResultSubList2 && num != null) {
            getAlignmentLinesMap.write("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (setnextchildplaceorderui.RemoteActionCompatParcelizer.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + setnextchildplaceorderui.RemoteActionCompatParcelizer.length);
        }
        if (hitTestResultSubList == hitTestResultSubList2) {
            setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
        } else if (hitTestResultSubList == HitTestResultSubList.write) {
            setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (hitTestResultSubList != HitTestResultSubList.PlaybackStateCompatCustomAction) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(hitTestResultSubList, "Unknown Variant: ");
                return null;
            }
            setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new swapDiagonal();
    }
}
