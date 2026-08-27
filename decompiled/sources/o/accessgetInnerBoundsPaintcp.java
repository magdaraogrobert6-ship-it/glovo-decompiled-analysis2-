package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetInnerBoundsPaintcp {
    public static final LayoutModifierNodeCoordinatorCompanion IconCompatParcelizer;
    public static final Invalidation read;
    public static final hasSameValuesAs serializer;
    public static final getModifierBoundsPaint write;

    public static accessDistanceAndFlags serializer(requestRemeasureui requestremeasureui) throws GeneralSecurityException {
        int i = getTail.read[requestremeasureui.ordinal()];
        if (i == 1) {
            return accessDistanceAndFlags.read;
        }
        if (i == 2 || i == 3) {
            return accessDistanceAndFlags.IconCompatParcelizer;
        }
        if (i == 4) {
            return accessDistanceAndFlags.RemoteActionCompatParcelizer;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + requestremeasureui.getNumber());
    }

    static {
        setNextChildPlaceOrderui setnextchildplaceorderuiIconCompatParcelizer = invalidateMeasurement.IconCompatParcelizer("type.googleapis.com/google.crypto.tink.AesGcmKey");
        IconCompatParcelizer = new LayoutModifierNodeCoordinatorCompanion(DistanceAndFlagsdefault.class);
        write = new getModifierBoundsPaint(setnextchildplaceorderuiIconCompatParcelizer);
        serializer = new hasSameValuesAs(onAfterPlaceAt.class);
        read = new Invalidation(setnextchildplaceorderuiIconCompatParcelizer, new getAlignmentLinesMap(8));
    }
}
