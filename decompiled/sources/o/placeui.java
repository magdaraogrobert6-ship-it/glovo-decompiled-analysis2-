package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class placeui extends GeneratedMessageLite {
    private static final placeui DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private requestLookaheadRelayoutui params_;
    private int version_;

    public static void IconCompatParcelizer(placeui placeuiVar) {
        placeuiVar.version_ = 0;
    }

    public final int serializer() {
        return this.version_;
    }

    static {
        placeui placeuiVar = new placeui();
        DEFAULT_INSTANCE = placeuiVar;
        GeneratedMessageLite.RemoteActionCompatParcelizer(placeui.class, placeuiVar);
    }

    public static placeui IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (placeui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static requestRelayoutui write() {
        return (requestRelayoutui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (requestLookaheadRemeasureui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new placeui();
            case 2:
                return new requestRelayoutui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (placeui.class) {
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

    public static void write(placeui placeuiVar, requestLookaheadRelayoutui requestlookaheadrelayoutui) {
        placeuiVar.getClass();
        requestlookaheadrelayoutui.getClass();
        placeuiVar.params_ = requestlookaheadrelayoutui;
    }

    public final requestLookaheadRelayoutui IconCompatParcelizer() {
        requestLookaheadRelayoutui requestlookaheadrelayoutui = this.params_;
        return requestlookaheadrelayoutui == null ? requestLookaheadRelayoutui.write() : requestlookaheadrelayoutui;
    }
}
