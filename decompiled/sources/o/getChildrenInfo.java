package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getChildrenInfo extends GeneratedMessageLite {
    private static final getChildrenInfo DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private int ivSize_;

    public static getChildrenInfo serializer() {
        return DEFAULT_INSTANCE;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.ivSize_;
    }

    static {
        getChildrenInfo getchildreninfo = new getChildrenInfo();
        DEFAULT_INSTANCE = getchildreninfo;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getChildrenInfo.class, getchildreninfo);
    }

    public static getInnerCoordinatorui write() {
        return (getInnerCoordinatorui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static void write(getChildrenInfo getchildreninfo) {
        getchildreninfo.ivSize_ = 16;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getHasFixedInnerContentConstraintsui.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getChildrenInfo();
            case 2:
                return new getInnerCoordinatorui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getChildrenInfo.class) {
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
