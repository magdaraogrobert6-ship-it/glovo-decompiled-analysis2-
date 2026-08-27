package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getLookaheadPassDelegateui extends GeneratedMessageLite {
    private static final getLookaheadPassDelegateui DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private setOnAttachui keyValue_ = setOnAttachui.IconCompatParcelizer;
    private int version_;

    public static void RemoteActionCompatParcelizer(getLookaheadPassDelegateui getlookaheadpassdelegateui) {
        getlookaheadpassdelegateui.version_ = 0;
    }

    public final setOnAttachui RemoteActionCompatParcelizer() {
        return this.keyValue_;
    }

    public final int serializer() {
        return this.version_;
    }

    static {
        getLookaheadPassDelegateui getlookaheadpassdelegateui = new getLookaheadPassDelegateui();
        DEFAULT_INSTANCE = getlookaheadpassdelegateui;
        GeneratedMessageLite.RemoteActionCompatParcelizer(getLookaheadPassDelegateui.class, getlookaheadpassdelegateui);
    }

    public static getMeasuredByParentInLookaheadui IconCompatParcelizer() {
        return (getMeasuredByParentInLookaheadui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static getLookaheadPassDelegateui write(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (getLookaheadPassDelegateui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (getLookaheadMeasurePendingui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new getLookaheadPassDelegateui();
            case 2:
                return new getMeasuredByParentInLookaheadui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (getLookaheadPassDelegateui.class) {
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

    public static void serializer(getLookaheadPassDelegateui getlookaheadpassdelegateui, setOnDetachui setondetachui) {
        getlookaheadpassdelegateui.getClass();
        getlookaheadpassdelegateui.keyValue_ = setondetachui;
    }
}
