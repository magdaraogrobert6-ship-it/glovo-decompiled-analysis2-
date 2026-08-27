package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class forEachCoordinatorIncludingInnerui extends GeneratedMessageLite {
    private static final forEachCoordinatorIncludingInnerui DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private int ivSize_;

    public static forEachCoordinatorIncludingInnerui write() {
        return DEFAULT_INSTANCE;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.ivSize_;
    }

    static {
        forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui = new forEachCoordinatorIncludingInnerui();
        DEFAULT_INSTANCE = foreachcoordinatorincludinginnerui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(forEachCoordinatorIncludingInnerui.class, foreachcoordinatorincludinginnerui);
    }

    public static getChildLookaheadMeasurablesui IconCompatParcelizer() {
        return (getChildLookaheadMeasurablesui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static void write(forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui) {
        foreachcoordinatorincludinginnerui.ivSize_ = 16;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getChildMeasurablesui.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new forEachCoordinatorIncludingInnerui();
            case 2:
                return new getChildLookaheadMeasurablesui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (forEachCoordinatorIncludingInnerui.class) {
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
