package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class attachui extends GeneratedMessageLite {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final attachui DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private clearSubtreeIntrinsicsUsageui aesCtrKey_;
    private getRectInParentDirtyui hmacKey_;
    private int version_;

    public static void serializer(attachui attachuiVar) {
        attachuiVar.version_ = 0;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.version_;
    }

    static {
        attachui attachuiVar = new attachui();
        DEFAULT_INSTANCE = attachuiVar;
        GeneratedMessageLite.RemoteActionCompatParcelizer(attachui.class, attachuiVar);
    }

    public static requestRelayoutuidefault IconCompatParcelizer() {
        return (requestRelayoutuidefault) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public static attachui serializer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (attachui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (resetModifierState.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new attachui();
            case 2:
                return new requestRelayoutuidefault();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (attachui.class) {
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

    public static void RemoteActionCompatParcelizer(attachui attachuiVar, getRectInParentDirtyui getrectinparentdirtyui) {
        attachuiVar.getClass();
        getrectinparentdirtyui.getClass();
        attachuiVar.hmacKey_ = getrectinparentdirtyui;
    }

    public static void serializer(attachui attachuiVar, clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui) {
        attachuiVar.getClass();
        clearsubtreeintrinsicsusageui.getClass();
        attachuiVar.aesCtrKey_ = clearsubtreeintrinsicsusageui;
    }

    public final clearSubtreeIntrinsicsUsageui RemoteActionCompatParcelizer() {
        clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageui = this.aesCtrKey_;
        return clearsubtreeintrinsicsusageui == null ? clearSubtreeIntrinsicsUsageui.write() : clearsubtreeintrinsicsusageui;
    }

    public final getRectInParentDirtyui serializer() {
        getRectInParentDirtyui getrectinparentdirtyui = this.hmacKey_;
        return getrectinparentdirtyui == null ? getRectInParentDirtyui.write() : getrectinparentdirtyui;
    }
}
