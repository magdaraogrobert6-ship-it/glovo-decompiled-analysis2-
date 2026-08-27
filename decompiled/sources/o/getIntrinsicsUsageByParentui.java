package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getIntrinsicsUsageByParentui extends GeneratedMessageLite {
    private static final getIntrinsicsUsageByParentui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private int version_;

    public static void read(getIntrinsicsUsageByParentui getintrinsicsusagebyparentui) {
        getintrinsicsusagebyparentui.version_ = 0;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.version_;
    }

    public final setOnAttachui serializer() {
        return this.keyValue_;
    }

    static {
        getIntrinsicsUsageByParentui getintrinsicsusagebyparentui = new getIntrinsicsUsageByParentui();
        DEFAULT_INSTANCE = getintrinsicsusagebyparentui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getIntrinsicsUsageByParentui.class, getintrinsicsusagebyparentui);
    }

    public static getIntrinsicsUsageByParentui serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getIntrinsicsUsageByParentui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static getLookaheadLayoutPendingui write() {
        return (getLookaheadLayoutPendingui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getLayoutPendingui.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getIntrinsicsUsageByParentui();
            case 2:
                return new getLookaheadLayoutPendingui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getIntrinsicsUsageByParentui.class) {
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

    public static void read(getIntrinsicsUsageByParentui getintrinsicsusagebyparentui, setOnDetachui setondetachui) {
        getintrinsicsusagebyparentui.getClass();
        getintrinsicsusagebyparentui.keyValue_ = setondetachui;
    }
}
