package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnAttachui extends GeneratedMessageLite {
    private static final getOnAttachui DEFAULT_INSTANCE;
    private static volatile getAlignmentLinesOwnerui PARSER;

    public static getOnAttachui IconCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    static {
        getOnAttachui getonattachui = new getOnAttachui();
        DEFAULT_INSTANCE = getonattachui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getOnAttachui.class, getonattachui);
    }

    public static getOnAttachui IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getOnAttachui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getOnDetachui.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getOnAttachui();
            case 2:
                return new isVirtualLookaheadRootui(1);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getOnAttachui.class) {
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
            default:
                getAlignmentLinesMap.write();
            case 7:
                return null;
        }
    }
}
