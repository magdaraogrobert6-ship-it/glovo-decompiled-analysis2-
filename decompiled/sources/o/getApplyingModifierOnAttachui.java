package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getApplyingModifierOnAttachui extends GeneratedMessageLite {
    private static final getApplyingModifierOnAttachui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private getChildrenInfo params_;
    private int version_;

    public static void serializer(getApplyingModifierOnAttachui getapplyingmodifieronattachui) {
        getapplyingmodifieronattachui.version_ = 0;
    }

    public final int MediaDescriptionCompat() {
        return this.version_;
    }

    public final setOnAttachui write() {
        return this.keyValue_;
    }

    static {
        getApplyingModifierOnAttachui getapplyingmodifieronattachui = new getApplyingModifierOnAttachui();
        DEFAULT_INSTANCE = getapplyingmodifieronattachui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getApplyingModifierOnAttachui.class, getapplyingmodifieronattachui);
    }

    public static getApplyingModifierOnAttachui serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getApplyingModifierOnAttachui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static getChildrenui serializer() {
        return (getChildrenui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getCanMultiMeasureui.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getApplyingModifierOnAttachui();
            case 2:
                return new getChildrenui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getApplyingModifierOnAttachui.class) {
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

    public static void IconCompatParcelizer(getApplyingModifierOnAttachui getapplyingmodifieronattachui, setOnDetachui setondetachui) {
        getapplyingmodifieronattachui.getClass();
        getapplyingmodifieronattachui.keyValue_ = setondetachui;
    }

    public static void write(getApplyingModifierOnAttachui getapplyingmodifieronattachui, getChildrenInfo getchildreninfo) {
        getapplyingmodifieronattachui.getClass();
        getchildreninfo.getClass();
        getapplyingmodifieronattachui.params_ = getchildreninfo;
    }

    public final getChildrenInfo IconCompatParcelizer() {
        getChildrenInfo getchildreninfo = this.params_;
        return getchildreninfo == null ? getChildrenInfo.serializer() : getchildreninfo;
    }
}
