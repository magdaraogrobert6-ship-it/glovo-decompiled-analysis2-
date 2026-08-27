package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class previousIndex {
    public static final hasSameValuesAs IconCompatParcelizer;
    public static final getModifierBoundsPaint RemoteActionCompatParcelizer;
    public static final Invalidation read;
    public static final LayoutModifierNodeCoordinatorCompanion write;

    public static HitTestResultSubList IconCompatParcelizer(requestRemeasureui requestremeasureui) throws GeneralSecurityException {
        int i = InnerNodeCoordinator.RemoteActionCompatParcelizer[requestremeasureui.ordinal()];
        if (i == 1) {
            return HitTestResultSubList.MediaSessionCompatQueueItem;
        }
        if (i == 2 || i == 3) {
            return HitTestResultSubList.RemoteActionCompatParcelizer;
        }
        if (i == 4) {
            return HitTestResultSubList.read;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + requestremeasureui.getNumber());
    }

    static {
        setNextChildPlaceOrderui setnextchildplaceorderuiIconCompatParcelizer = invalidateMeasurement.IconCompatParcelizer("type.googleapis.com/google.crypto.tink.AesEaxKey");
        write = new LayoutModifierNodeCoordinatorCompanion(HitTestResultKt.class);
        RemoteActionCompatParcelizer = new getModifierBoundsPaint(setnextchildplaceorderuiIconCompatParcelizer);
        IconCompatParcelizer = new hasSameValuesAs(setIndex.class);
        read = new Invalidation(setnextchildplaceorderuiIconCompatParcelizer, new getAlignmentLinesMap(7));
    }
}
