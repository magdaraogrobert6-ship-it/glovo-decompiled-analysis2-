package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class removeAtui extends GeneratedMessageLite {
    private static final removeAtui DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private String keyUri_ = "";

    public static removeAtui write() {
        return DEFAULT_INSTANCE;
    }

    public final String IconCompatParcelizer() {
        return this.keyUri_;
    }

    static {
        removeAtui removeatui = new removeAtui();
        DEFAULT_INSTANCE = removeatui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(removeAtui.class, removeatui);
    }

    public static removeAtui read(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (removeAtui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (remeasure_Sx5XlMui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new removeAtui();
            case 2:
                return new isVirtualLookaheadRootui(2);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (removeAtui.class) {
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
}
