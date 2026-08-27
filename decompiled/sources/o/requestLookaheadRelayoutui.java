package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class requestLookaheadRelayoutui extends GeneratedMessageLite {
    private static final requestLookaheadRelayoutui DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private isPlacedInLookahead dekTemplate_;
    private String kekUri_ = "";

    public static requestLookaheadRelayoutui write() {
        return DEFAULT_INSTANCE;
    }

    public final String IconCompatParcelizer() {
        return this.kekUri_;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.dekTemplate_ != null;
    }

    static {
        requestLookaheadRelayoutui requestlookaheadrelayoutui = new requestLookaheadRelayoutui();
        DEFAULT_INSTANCE = requestlookaheadrelayoutui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(requestLookaheadRelayoutui.class, requestlookaheadrelayoutui);
    }

    public static requestLookaheadRelayoutui serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (requestLookaheadRelayoutui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (replaceui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new requestLookaheadRelayoutui();
            case 2:
                return new isVirtualLookaheadRootui(3);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (requestLookaheadRelayoutui.class) {
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

    public final isPlacedInLookahead serializer() {
        isPlacedInLookahead isplacedinlookahead = this.dekTemplate_;
        return isplacedinlookahead == null ? isPlacedInLookahead.RemoteActionCompatParcelizer() : isplacedinlookahead;
    }
}
