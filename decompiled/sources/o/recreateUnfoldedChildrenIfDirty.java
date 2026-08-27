package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class recreateUnfoldedChildrenIfDirty extends GeneratedMessageLite {
    private static final recreateUnfoldedChildrenIfDirty DEFAULT_INSTANCE;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    public static recreateUnfoldedChildrenIfDirty IconCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    public final int write() {
        return this.tagSize_;
    }

    static {
        recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty = new recreateUnfoldedChildrenIfDirty();
        DEFAULT_INSTANCE = recreateunfoldedchildrenifdirty;
        GeneratedMessageLite.RemoteActionCompatParcelizer(recreateUnfoldedChildrenIfDirty.class, recreateunfoldedchildrenifdirty);
    }

    public static void read(recreateUnfoldedChildrenIfDirty recreateunfoldedchildrenifdirty) {
        recreateunfoldedchildrenifdirty.tagSize_ = 16;
    }

    public static setLookaheadRoot serializer() {
        return (setLookaheadRoot) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (requestRemeasureuidefault.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new recreateUnfoldedChildrenIfDirty();
            case 2:
                return new setLookaheadRoot(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (recreateUnfoldedChildrenIfDirty.class) {
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
