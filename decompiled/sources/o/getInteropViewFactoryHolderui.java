package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getInteropViewFactoryHolderui extends GeneratedMessageLite {
    private static final getInteropViewFactoryHolderui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private int version_;

    public static void serializer(getInteropViewFactoryHolderui getinteropviewfactoryholderui) {
        getinteropviewfactoryholderui.version_ = 0;
    }

    public final setOnAttachui RemoteActionCompatParcelizer() {
        return this.keyValue_;
    }

    public final int serializer() {
        return this.version_;
    }

    static {
        getInteropViewFactoryHolderui getinteropviewfactoryholderui = new getInteropViewFactoryHolderui();
        DEFAULT_INSTANCE = getinteropviewfactoryholderui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getInteropViewFactoryHolderui.class, getinteropviewfactoryholderui);
    }

    public static getInnerLayerCoordinatorui IconCompatParcelizer() {
        return (getInnerLayerCoordinatorui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getInteropViewFactoryHolderui read(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getInteropViewFactoryHolderui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getInnerLayerCoordinatorIsDirtyui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getInteropViewFactoryHolderui();
            case 2:
                return new getInnerLayerCoordinatorui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getInteropViewFactoryHolderui.class) {
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

    public static void read(getInteropViewFactoryHolderui getinteropviewfactoryholderui, setOnDetachui setondetachui) {
        getinteropviewfactoryholderui.getClass();
        getinteropviewfactoryholderui.keyValue_ = setondetachui;
    }
}
