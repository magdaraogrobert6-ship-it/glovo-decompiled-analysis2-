package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasPositionalLayerTransformationsInOffsetFromRootui extends GeneratedMessageLite {
    private static final getHasPositionalLayerTransformationsInOffsetFromRootui DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    public static void write(getHasPositionalLayerTransformationsInOffsetFromRootui gethaspositionallayertransformationsinoffsetfromrootui, int i) {
        gethaspositionallayertransformationsinoffsetfromrootui.keySize_ = i;
    }

    public final int write() {
        return this.keySize_;
    }

    static {
        getHasPositionalLayerTransformationsInOffsetFromRootui gethaspositionallayertransformationsinoffsetfromrootui = new getHasPositionalLayerTransformationsInOffsetFromRootui();
        DEFAULT_INSTANCE = gethaspositionallayertransformationsinoffsetfromrootui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getHasPositionalLayerTransformationsInOffsetFromRootui.class, gethaspositionallayertransformationsinoffsetfromrootui);
    }

    public static getLayoutStateui IconCompatParcelizer() {
        return (getLayoutStateui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getHasPositionalLayerTransformationsInOffsetFromRootui serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getHasPositionalLayerTransformationsInOffsetFromRootui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getLayoutDelegateui.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getHasPositionalLayerTransformationsInOffsetFromRootui();
            case 2:
                return new getLayoutStateui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getHasPositionalLayerTransformationsInOffsetFromRootui.class) {
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
