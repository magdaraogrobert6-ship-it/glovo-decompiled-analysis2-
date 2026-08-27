package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class invalidateLayersui extends GeneratedMessageLite {
    private static final invalidateLayersui DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    public static invalidateLayersui RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    public static void RemoteActionCompatParcelizer(invalidateLayersui invalidatelayersui, int i) {
        invalidatelayersui.tagSize_ = i;
    }

    public final int serializer() {
        return this.tagSize_;
    }

    static {
        invalidateLayersui invalidatelayersui = new invalidateLayersui();
        DEFAULT_INSTANCE = invalidatelayersui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(invalidateLayersui.class, invalidatelayersui);
    }

    public static insertAtui IconCompatParcelizer() {
        return (insertAtui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (invalidateLayerui.RemoteActionCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new invalidateLayersui();
            case 2:
                return new insertAtui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (invalidateLayersui.class) {
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

    public final getOwnerui write() {
        getOwnerui getowneruiForNumber = getOwnerui.forNumber(this.hash_);
        return getowneruiForNumber == null ? getOwnerui.UNRECOGNIZED : getowneruiForNumber;
    }

    public static void serializer(invalidateLayersui invalidatelayersui, getOwnerui getownerui) {
        invalidatelayersui.getClass();
        invalidatelayersui.hash_ = getownerui.getNumber();
    }
}
