package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class rescheduleRemeasureOrRelayoutui extends GeneratedMessageLite {
    private static final rescheduleRemeasureOrRelayoutui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private int version_;

    public static void RemoteActionCompatParcelizer(rescheduleRemeasureOrRelayoutui rescheduleremeasureorrelayoutui) {
        rescheduleremeasureorrelayoutui.version_ = 0;
    }

    public final int IconCompatParcelizer() {
        return this.version_;
    }

    public final setOnAttachui write() {
        return this.keyValue_;
    }

    static {
        rescheduleRemeasureOrRelayoutui rescheduleremeasureorrelayoutui = new rescheduleRemeasureOrRelayoutui();
        DEFAULT_INSTANCE = rescheduleremeasureorrelayoutui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(rescheduleRemeasureOrRelayoutui.class, rescheduleremeasureorrelayoutui);
    }

    public static rescheduleRemeasureOrRelayoutui RemoteActionCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (rescheduleRemeasureOrRelayoutui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static setAddedToRectListui serializer() {
        return (setAddedToRectListui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (resetSubtreeIntrinsicsUsageui.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new rescheduleRemeasureOrRelayoutui();
            case 2:
                return new setAddedToRectListui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (rescheduleRemeasureOrRelayoutui.class) {
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

    public static void RemoteActionCompatParcelizer(rescheduleRemeasureOrRelayoutui rescheduleremeasureorrelayoutui, setOnDetachui setondetachui) {
        rescheduleremeasureorrelayoutui.getClass();
        rescheduleremeasureorrelayoutui.keyValue_ = setondetachui;
    }
}
