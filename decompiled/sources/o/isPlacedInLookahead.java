package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class isPlacedInLookahead extends GeneratedMessageLite {
    private static final isPlacedInLookahead DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private setOnAttachui value_ = setOnAttachui.IconCompatParcelizer;

    public static isPlacedInLookahead RemoteActionCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    public final String IconCompatParcelizer() {
        return this.typeUrl_;
    }

    public final setOnAttachui MediaBrowserCompatMediaItem() {
        return this.value_;
    }

    static {
        isPlacedInLookahead isplacedinlookahead = new isPlacedInLookahead();
        DEFAULT_INSTANCE = isplacedinlookahead;
        GeneratedMessageLite.RemoteActionCompatParcelizer(isPlacedInLookahead.class, isplacedinlookahead);
    }

    public static invalidateParentDataui serializer() {
        return (invalidateParentDataui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (isPlacedByParent.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new isPlacedInLookahead();
            case 2:
                return new invalidateParentDataui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (isPlacedInLookahead.class) {
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

    public final requestRemeasureui write() {
        requestRemeasureui requestremeasureuiForNumber = requestRemeasureui.forNumber(this.outputPrefixType_);
        return requestremeasureuiForNumber == null ? requestRemeasureui.UNRECOGNIZED : requestremeasureuiForNumber;
    }

    public static void RemoteActionCompatParcelizer(isPlacedInLookahead isplacedinlookahead, requestRemeasureui requestremeasureui) {
        isplacedinlookahead.getClass();
        isplacedinlookahead.outputPrefixType_ = requestremeasureui.getNumber();
    }

    public static void read(isPlacedInLookahead isplacedinlookahead, setOnDetachui setondetachui) {
        isplacedinlookahead.getClass();
        isplacedinlookahead.value_ = setondetachui;
    }

    public static void serializer(isPlacedInLookahead isplacedinlookahead, String str) {
        isplacedinlookahead.getClass();
        str.getClass();
        isplacedinlookahead.typeUrl_ = str;
    }
}
