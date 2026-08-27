package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class markMeasurePendingui extends GeneratedMessageLite {
    private static final markMeasurePendingui DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private removeAtui params_;
    private int version_;

    public static void RemoteActionCompatParcelizer(markMeasurePendingui markmeasurependingui) {
        markmeasurependingui.version_ = 0;
    }

    public final int write() {
        return this.version_;
    }

    static {
        markMeasurePendingui markmeasurependingui = new markMeasurePendingui();
        DEFAULT_INSTANCE = markmeasurependingui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(markMeasurePendingui.class, markmeasurependingui);
    }

    public static markMeasurePendingui IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (markMeasurePendingui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static onZSortedChildrenInvalidatedui IconCompatParcelizer() {
        return (onZSortedChildrenInvalidatedui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (removeAllui.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new markMeasurePendingui();
            case 2:
                return new onZSortedChildrenInvalidatedui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (markMeasurePendingui.class) {
                    getzcomparatorui = PARSER;
                    if (getzcomparatorui == null) {
                        getzcomparatorui = new getZComparatorui();
                        PARSER = getzcomparatorui;
                    }
                    break;
                }
                return getzcomparatorui;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public static void read(markMeasurePendingui markmeasurependingui, removeAtui removeatui) {
        markmeasurependingui.getClass();
        removeatui.getClass();
        markmeasurependingui.params_ = removeatui;
    }

    public final removeAtui RemoteActionCompatParcelizer() {
        removeAtui removeatui = this.params_;
        return removeatui == null ? removeAtui.write() : removeatui;
    }
}
