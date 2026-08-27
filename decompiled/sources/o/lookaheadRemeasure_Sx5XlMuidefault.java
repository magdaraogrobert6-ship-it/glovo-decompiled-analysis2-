package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class lookaheadRemeasure_Sx5XlMuidefault extends GeneratedMessageLite {
    private static final lookaheadRemeasure_Sx5XlMuidefault DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private recreateUnfoldedChildrenIfDirty params_;
    private int version_;

    public static void RemoteActionCompatParcelizer(lookaheadRemeasure_Sx5XlMuidefault lookaheadremeasure_sx5xlmuidefault) {
        lookaheadremeasure_sx5xlmuidefault.version_ = 0;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.version_;
    }

    public final setOnAttachui write() {
        return this.keyValue_;
    }

    static {
        lookaheadRemeasure_Sx5XlMuidefault lookaheadremeasure_sx5xlmuidefault = new lookaheadRemeasure_Sx5XlMuidefault();
        DEFAULT_INSTANCE = lookaheadremeasure_sx5xlmuidefault;
        GeneratedMessageLite.RemoteActionCompatParcelizer(lookaheadRemeasure_Sx5XlMuidefault.class, lookaheadremeasure_sx5xlmuidefault);
    }

    public static lookaheadRemeasure_Sx5XlMuidefault IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (lookaheadRemeasure_Sx5XlMuidefault) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static requestLookaheadRelayoutuidefault read() {
        return (requestLookaheadRelayoutuidefault) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (invalidateDrawForSubtreedefault.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new lookaheadRemeasure_Sx5XlMuidefault();
            case 2:
                return new requestLookaheadRelayoutuidefault();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (lookaheadRemeasure_Sx5XlMuidefault.class) {
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

    public static void read(lookaheadRemeasure_Sx5XlMuidefault lookaheadremeasure_sx5xlmuidefault, setOnDetachui setondetachui) {
        lookaheadremeasure_sx5xlmuidefault.getClass();
        lookaheadremeasure_sx5xlmuidefault.keyValue_ = setondetachui;
    }

    public static void write(lookaheadRemeasure_Sx5XlMuidefault lookaheadremeasure_sx5xlmuidefault, recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty) {
        lookaheadremeasure_sx5xlmuidefault.getClass();
        recreateunfoldedchildrenifdirty.getClass();
        lookaheadremeasure_sx5xlmuidefault.params_ = recreateunfoldedchildrenifdirty;
    }

    public final recreateUnfoldedChildrenIfDirty serializer() {
        recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty = this.params_;
        return recreateunfoldedchildrenifdirty == null ? recreateUnfoldedChildrenIfDirty.IconCompatParcelizer() : recreateunfoldedchildrenifdirty;
    }
}
