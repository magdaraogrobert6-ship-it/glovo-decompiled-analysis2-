package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getGloballyPositionedObservers extends GeneratedMessageLite {
    private static final getGloballyPositionedObservers DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private int keySize_;
    private getChildrenInfo params_;

    public static void write(getGloballyPositionedObservers getgloballypositionedobservers, int i) {
        getgloballypositionedobservers.keySize_ = i;
    }

    public final int write() {
        return this.keySize_;
    }

    static {
        getGloballyPositionedObservers getgloballypositionedobservers = new getGloballyPositionedObservers();
        DEFAULT_INSTANCE = getgloballypositionedobservers;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getGloballyPositionedObservers.class, getgloballypositionedobservers);
    }

    public static getDepthui IconCompatParcelizer() {
        return (getDepthui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getGloballyPositionedObservers write(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getGloballyPositionedObservers) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getFoldedChildrenui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getGloballyPositionedObservers();
            case 2:
                return new getDepthui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getGloballyPositionedObservers.class) {
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

    public static void IconCompatParcelizer(getGloballyPositionedObservers getgloballypositionedobservers, getChildrenInfo getchildreninfo) {
        getgloballypositionedobservers.getClass();
        getgloballypositionedobservers.params_ = getchildreninfo;
    }

    public final getChildrenInfo RemoteActionCompatParcelizer() {
        getChildrenInfo getchildreninfo = this.params_;
        return getchildreninfo == null ? getChildrenInfo.serializer() : getchildreninfo;
    }
}
