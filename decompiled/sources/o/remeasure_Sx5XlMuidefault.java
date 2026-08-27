package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasure_Sx5XlMuidefault extends GeneratedMessageLite {
    private static final remeasure_Sx5XlMuidefault DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private int keySize_;
    private recreateUnfoldedChildrenIfDirty params_;

    public final int IconCompatParcelizer() {
        return this.keySize_;
    }

    static {
        remeasure_Sx5XlMuidefault remeasure_sx5xlmuidefault = new remeasure_Sx5XlMuidefault();
        DEFAULT_INSTANCE = remeasure_sx5xlmuidefault;
        GeneratedMessageLite.RemoteActionCompatParcelizer(remeasure_Sx5XlMuidefault.class, remeasure_sx5xlmuidefault);
    }

    public static void IconCompatParcelizer(remeasure_Sx5XlMuidefault remeasure_sx5xlmuidefault) {
        remeasure_sx5xlmuidefault.keySize_ = 32;
    }

    public static requestLookaheadRemeasureuidefault RemoteActionCompatParcelizer() {
        return (requestLookaheadRemeasureuidefault) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static remeasure_Sx5XlMuidefault serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (remeasure_Sx5XlMuidefault) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (onDensityOrLayoutDirectionChanged.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new remeasure_Sx5XlMuidefault();
            case 2:
                return new requestLookaheadRemeasureuidefault(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (remeasure_Sx5XlMuidefault.class) {
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

    public static void RemoteActionCompatParcelizer(remeasure_Sx5XlMuidefault remeasure_sx5xlmuidefault, recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty) {
        remeasure_sx5xlmuidefault.getClass();
        remeasure_sx5xlmuidefault.params_ = recreateunfoldedchildrenifdirty;
    }

    public final recreateUnfoldedChildrenIfDirty serializer() {
        recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty = this.params_;
        return recreateunfoldedchildrenifdirty == null ? recreateUnfoldedChildrenIfDirty.IconCompatParcelizer() : recreateunfoldedchildrenifdirty;
    }
}
