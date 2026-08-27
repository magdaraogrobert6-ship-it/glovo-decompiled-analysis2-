package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getNodesui extends GeneratedMessageLite {
    private static final getNodesui DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    public final int RemoteActionCompatParcelizer() {
        return this.keySize_;
    }

    static {
        getNodesui getnodesui = new getNodesui();
        DEFAULT_INSTANCE = getnodesui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getNodesui.class, getnodesui);
    }

    public static void serializer(getNodesui getnodesui) {
        getnodesui.keySize_ = 64;
    }

    public static getNeedsOnGloballyPositionedDispatchui write() {
        return (getNeedsOnGloballyPositionedDispatchui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getNodesui write(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getNodesui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getMeasuredByParentui.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getNodesui();
            case 2:
                return new getNeedsOnGloballyPositionedDispatchui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getNodesui.class) {
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
