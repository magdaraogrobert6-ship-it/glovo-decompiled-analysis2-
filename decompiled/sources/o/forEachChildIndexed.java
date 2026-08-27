package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class forEachChildIndexed extends GeneratedMessageLite {
    private static final forEachChildIndexed DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private int keySize_;
    private forEachCoordinatorIncludingInnerui params_;

    public static forEachChildIndexed RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    public static void serializer(forEachChildIndexed foreachchildindexed, int i) {
        foreachchildindexed.keySize_ = i;
    }

    public final int IconCompatParcelizer() {
        return this.keySize_;
    }

    static {
        forEachChildIndexed foreachchildindexed = new forEachChildIndexed();
        DEFAULT_INSTANCE = foreachchildindexed;
        GeneratedMessageLite.RemoteActionCompatParcelizer(forEachChildIndexed.class, foreachchildindexed);
    }

    public static forEachChildIndexed IconCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (forEachChildIndexed) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static forEachCoordinatorui serializer() {
        return (forEachCoordinatorui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getAlignmentLinesRequiredui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new forEachChildIndexed();
            case 2:
                return new forEachCoordinatorui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (forEachChildIndexed.class) {
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

    public static void RemoteActionCompatParcelizer(forEachChildIndexed foreachchildindexed, forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui) {
        foreachchildindexed.getClass();
        foreachchildindexed.params_ = foreachcoordinatorincludinginnerui;
    }

    public final forEachCoordinatorIncludingInnerui write() {
        forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui = this.params_;
        return foreachcoordinatorincludinginnerui == null ? forEachCoordinatorIncludingInnerui.write() : foreachcoordinatorincludinginnerui;
    }
}
