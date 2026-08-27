package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class drawui extends GeneratedMessageLite {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final drawui DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER;
    private forEachChildIndexed aesCtrKeyFormat_;
    private hitTestSemantics6fMxITsui hmacKeyFormat_;

    static {
        drawui drawuiVar = new drawui();
        DEFAULT_INSTANCE = drawuiVar;
        GeneratedMessageLite.RemoteActionCompatParcelizer(drawui.class, drawuiVar);
    }

    public static drawui RemoteActionCompatParcelizer(setOnAttachui setonattachui, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        return (drawui) GeneratedMessageLite.write(DEFAULT_INSTANCE, setonattachui, getnotplacedplaceorderuiannotations);
    }

    public static detachui serializer() {
        return (detachui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (forEachChild.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new drawui();
            case 2:
                return new detachui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (drawui.class) {
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

    public static void RemoteActionCompatParcelizer(drawui drawuiVar, hitTestSemantics6fMxITsui hittestsemantics6fmxitsui) {
        drawuiVar.getClass();
        drawuiVar.hmacKeyFormat_ = hittestsemantics6fmxitsui;
    }

    public static void write(drawui drawuiVar, forEachChildIndexed foreachchildindexed) {
        drawuiVar.getClass();
        drawuiVar.aesCtrKeyFormat_ = foreachchildindexed;
    }

    public final hitTestSemantics6fMxITsui RemoteActionCompatParcelizer() {
        hitTestSemantics6fMxITsui hittestsemantics6fmxitsui = this.hmacKeyFormat_;
        return hittestsemantics6fmxitsui == null ? hitTestSemantics6fMxITsui.write() : hittestsemantics6fmxitsui;
    }

    public final forEachChildIndexed write() {
        forEachChildIndexed foreachchildindexed = this.aesCtrKeyFormat_;
        return foreachchildindexed == null ? forEachChildIndexed.RemoteActionCompatParcelizer() : foreachchildindexed;
    }
}
