package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasurePendingui extends GeneratedMessageLite {
    private static final getMeasurePendingui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private int version_;

    public static void serializer(getMeasurePendingui getmeasurependingui) {
        getmeasurependingui.version_ = 0;
    }

    public final setOnAttachui IconCompatParcelizer() {
        return this.keyValue_;
    }

    public final int serializer() {
        return this.version_;
    }

    static {
        getMeasurePendingui getmeasurependingui = new getMeasurePendingui();
        DEFAULT_INSTANCE = getmeasurependingui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getMeasurePendingui.class, getmeasurependingui);
    }

    public static getMeasurePendingui RemoteActionCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getMeasurePendingui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static getOuterToInnerOffsetnOccacui RemoteActionCompatParcelizer() {
        return (getOuterToInnerOffsetnOccacui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getOuterToInnerOffsetDirtyui.write[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getMeasurePendingui();
            case 2:
                return new getOuterToInnerOffsetnOccacui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getMeasurePendingui.class) {
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

    public static void serializer(getMeasurePendingui getmeasurependingui, setOnDetachui setondetachui) {
        getmeasurependingui.getClass();
        getmeasurependingui.keyValue_ = setondetachui;
    }
}
