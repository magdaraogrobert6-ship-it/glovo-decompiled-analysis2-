package o;

import coil3.Extras$Key;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerNodeCoordinatorLookaheadDelegateImpl extends AbstractC0205subList {
    public static InnerNodeCoordinatorLookaheadDelegateImpl RemoteActionCompatParcelizer(HitTestResultSubList hitTestResultSubList, Extras$Key extras$Key, Integer num) throws GeneralSecurityException {
        setNextChildPlaceOrderui setnextchildplaceorderui = (setNextChildPlaceOrderui) extras$Key.IconCompatParcelizer;
        HitTestResultSubList hitTestResultSubList2 = HitTestResultSubList.MediaDescriptionCompat;
        if (hitTestResultSubList != hitTestResultSubList2 && num == null) {
            getAlignmentLinesMap.read("For given Variant ", hitTestResultSubList, " the value of idRequirement must be non-null");
            return null;
        }
        if (hitTestResultSubList == hitTestResultSubList2 && num != null) {
            getAlignmentLinesMap.write("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (setnextchildplaceorderui.RemoteActionCompatParcelizer.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + setnextchildplaceorderui.RemoteActionCompatParcelizer.length);
        }
        if (hitTestResultSubList == hitTestResultSubList2) {
            setNextChildPlaceOrderui.IconCompatParcelizer(new byte[0]);
        } else if (hitTestResultSubList == HitTestResultSubList.IconCompatParcelizer) {
            setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (hitTestResultSubList != HitTestResultSubList.MediaSessionCompatResultReceiverWrapper) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(hitTestResultSubList, "Unknown Variant: ");
                return null;
            }
            setNextChildPlaceOrderui.IconCompatParcelizer(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new InnerNodeCoordinatorLookaheadDelegateImpl();
    }
}
