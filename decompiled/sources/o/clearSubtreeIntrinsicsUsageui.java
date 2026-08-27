package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class clearSubtreeIntrinsicsUsageui extends GeneratedMessageLite {
    private static final clearSubtreeIntrinsicsUsageui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private forEachCoordinatorIncludingInnerui params_;
    private int version_;

    public static void IconCompatParcelizer(clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui) {
        clearsubtreeintrinsicsusageui.version_ = 0;
    }

    public static clearSubtreeIntrinsicsUsageui write() {
        return DEFAULT_INSTANCE;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.version_;
    }

    public final setOnAttachui serializer() {
        return this.keyValue_;
    }

    static {
        clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui = new clearSubtreeIntrinsicsUsageui();
        DEFAULT_INSTANCE = clearsubtreeintrinsicsusageui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(clearSubtreeIntrinsicsUsageui.class, clearsubtreeintrinsicsusageui);
    }

    public static getAddedToRectListui IconCompatParcelizer() {
        return (getAddedToRectListui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static clearSubtreeIntrinsicsUsageui read(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (clearSubtreeIntrinsicsUsageui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (dispatchOnPositionedCallbacksui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new clearSubtreeIntrinsicsUsageui();
            case 2:
                return new getAddedToRectListui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (clearSubtreeIntrinsicsUsageui.class) {
                    getzcomparatorui = PARSER;
                    if (getzcomparatorui == null) {
                        getzcomparatorui = new getZComparatorui(0);
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

    public static void RemoteActionCompatParcelizer(clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui, forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui) {
        clearsubtreeintrinsicsusageui.getClass();
        foreachcoordinatorincludinginnerui.getClass();
        clearsubtreeintrinsicsusageui.params_ = foreachcoordinatorincludinginnerui;
    }

    public static void write(clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui, setOnDetachui setondetachui) {
        clearsubtreeintrinsicsusageui.getClass();
        clearsubtreeintrinsicsusageui.keyValue_ = setondetachui;
    }

    public final forEachCoordinatorIncludingInnerui RemoteActionCompatParcelizer() {
        forEachCoordinatorIncludingInnerui foreachcoordinatorincludinginnerui = this.params_;
        return foreachcoordinatorincludinginnerui == null ? forEachCoordinatorIncludingInnerui.write() : foreachcoordinatorincludinginnerui;
    }
}
