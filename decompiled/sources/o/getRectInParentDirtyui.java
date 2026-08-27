package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getRectInParentDirtyui extends GeneratedMessageLite {
    private static final getRectInParentDirtyui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private invalidateLayersui params_;
    private int version_;

    public static getRectInParentDirtyui write() {
        return DEFAULT_INSTANCE;
    }

    public static void write(getRectInParentDirtyui getrectinparentdirtyui) {
        getrectinparentdirtyui.version_ = 0;
    }

    public final int MediaMetadataCompat() {
        return this.version_;
    }

    public final setOnAttachui RemoteActionCompatParcelizer() {
        return this.keyValue_;
    }

    static {
        getRectInParentDirtyui getrectinparentdirtyui = new getRectInParentDirtyui();
        DEFAULT_INSTANCE = getrectinparentdirtyui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getRectInParentDirtyui.class, getrectinparentdirtyui);
    }

    public static ignoreRemeasureRequestsui serializer() {
        return (ignoreRemeasureRequestsui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getRectInParentDirtyui write(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getRectInParentDirtyui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (get_childrenui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getRectInParentDirtyui();
            case 2:
                return new ignoreRemeasureRequestsui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getRectInParentDirtyui.class) {
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

    public static void RemoteActionCompatParcelizer(getRectInParentDirtyui getrectinparentdirtyui, invalidateLayersui invalidatelayersui) {
        getrectinparentdirtyui.getClass();
        invalidatelayersui.getClass();
        getrectinparentdirtyui.params_ = invalidatelayersui;
    }

    public static void RemoteActionCompatParcelizer(getRectInParentDirtyui getrectinparentdirtyui, setOnDetachui setondetachui) {
        getrectinparentdirtyui.getClass();
        getrectinparentdirtyui.keyValue_ = setondetachui;
    }

    public final invalidateLayersui MediaDescriptionCompat() {
        invalidateLayersui invalidatelayersui = this.params_;
        return invalidatelayersui == null ? invalidateLayersui.RemoteActionCompatParcelizer() : invalidatelayersui;
    }
}
