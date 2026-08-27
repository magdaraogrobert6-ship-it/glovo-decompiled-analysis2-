package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hitTestChildqzLsGqo {
    public static final hasSameValuesAs IconCompatParcelizer;
    public static final getModifierBoundsPaint read;
    public static final Invalidation serializer;
    public static final LayoutModifierNodeCoordinatorCompanion write;

    public static HitTestResultSubList write(requestRemeasureui requestremeasureui) throws GeneralSecurityException {
        int i = getInnerBoundsPaint.read[requestremeasureui.ordinal()];
        if (i == 1) {
            return HitTestResultSubList.MediaBrowserCompatMediaItem;
        }
        if (i == 2 || i == 3) {
            return HitTestResultSubList.serializer;
        }
        if (i == 4) {
            return HitTestResultSubList.MediaMetadataCompat;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + requestremeasureui.getNumber());
    }

    static {
        setNextChildPlaceOrderui setnextchildplaceorderuiIconCompatParcelizer = invalidateMeasurement.IconCompatParcelizer("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        write = new LayoutModifierNodeCoordinatorCompanion(calculateAlignmentLine.class);
        read = new getModifierBoundsPaint(setnextchildplaceorderuiIconCompatParcelizer);
        IconCompatParcelizer = new hasSameValuesAs(ensureLookaheadDelegateCreated.class);
        serializer = new Invalidation(setnextchildplaceorderuiIconCompatParcelizer, new getAlignmentLinesMap(9));
    }
}
