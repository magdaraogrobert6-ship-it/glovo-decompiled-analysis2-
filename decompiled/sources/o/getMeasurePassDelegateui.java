package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasurePassDelegateui extends GeneratedMessageLite {
    private static final getMeasurePassDelegateui DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    public static void serializer(getMeasurePassDelegateui getmeasurepassdelegateui, int i) {
        getmeasurepassdelegateui.keySize_ = i;
    }

    public final int serializer() {
        return this.keySize_;
    }

    static {
        getMeasurePassDelegateui getmeasurepassdelegateui = new getMeasurePassDelegateui();
        DEFAULT_INSTANCE = getmeasurepassdelegateui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getMeasurePassDelegateui.class, getmeasurepassdelegateui);
    }

    public static getMeasurePassDelegateui IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getMeasurePassDelegateui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static getMDrawScopeui RemoteActionCompatParcelizer() {
        return (getMDrawScopeui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getLookaheadRootui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getMeasurePassDelegateui();
            case 2:
                return new getMDrawScopeui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getMeasurePassDelegateui.class) {
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
