package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class hitTestSemantics6fMxITsui extends GeneratedMessageLite {
    private static final hitTestSemantics6fMxITsui DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private invalidateLayersui params_;
    private int version_;

    public static hitTestSemantics6fMxITsui write() {
        return DEFAULT_INSTANCE;
    }

    public static void write(hitTestSemantics6fMxITsui hittestsemantics6fmxitsui, int i) {
        hittestsemantics6fmxitsui.keySize_ = i;
    }

    public final int serializer() {
        return this.keySize_;
    }

    static {
        hitTestSemantics6fMxITsui hittestsemantics6fmxitsui = new hitTestSemantics6fMxITsui();
        DEFAULT_INSTANCE = hittestsemantics6fmxitsui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(hitTestSemantics6fMxITsui.class, hittestsemantics6fmxitsui);
    }

    public static getZSortedChildren IconCompatParcelizer() {
        return (getZSortedChildren) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static hitTestSemantics6fMxITsui write(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (hitTestSemantics6fMxITsui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (hitTest6fMxITsui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new hitTestSemantics6fMxITsui();
            case 2:
                return new getZSortedChildren(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (hitTestSemantics6fMxITsui.class) {
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

    public static void read(hitTestSemantics6fMxITsui hittestsemantics6fmxitsui, invalidateLayersui invalidatelayersui) {
        hittestsemantics6fmxitsui.getClass();
        hittestsemantics6fmxitsui.params_ = invalidatelayersui;
    }

    public final invalidateLayersui RemoteActionCompatParcelizer() {
        invalidateLayersui invalidatelayersui = this.params_;
        return invalidatelayersui == null ? invalidateLayersui.RemoteActionCompatParcelizer() : invalidatelayersui;
    }
}
