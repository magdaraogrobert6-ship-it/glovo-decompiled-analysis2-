package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class rethrowWithComposeStackTrace extends GeneratedMessageLite {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final rethrowWithComposeStackTrace DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private String configName_ = "";
    private LayoutNodeCompanionErrorMeasurePolicy1 entry_ = getDetachedFromParentLookaheadPassui.serializer;

    static {
        rethrowWithComposeStackTrace rethrowwithcomposestacktrace = new rethrowWithComposeStackTrace();
        DEFAULT_INSTANCE = rethrowwithcomposestacktrace;
        GeneratedMessageLite.RemoteActionCompatParcelizer(rethrowWithComposeStackTrace.class, rethrowwithcomposestacktrace);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (setCanMultiMeasureui.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new rethrowWithComposeStackTrace();
            case 2:
                return new isVirtualLookaheadRootui(4);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", markLayoutPendingui.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (rethrowWithComposeStackTrace.class) {
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
