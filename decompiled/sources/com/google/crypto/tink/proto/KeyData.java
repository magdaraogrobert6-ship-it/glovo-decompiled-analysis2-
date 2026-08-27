package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import o.LayoutNodeCompanionDummyViewConfiguration1;
import o.getAlignmentLinesMap;
import o.getAlignmentLinesOwnerui;
import o.getDetachedFromParentLookaheadPlacementui;
import o.getZComparatorui;
import o.invalidateMeasurementsui;
import o.invalidateOnPositionedui;
import o.invalidateSemanticsui;
import o.setOnAttachui;
import o.setOnDetachui;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyData extends GeneratedMessageLite {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private setOnAttachui value_ = setOnAttachui.IconCompatParcelizer;

    public static KeyData IconCompatParcelizer() {
        return DEFAULT_INSTANCE;
    }

    public final setOnAttachui MediaMetadataCompat() {
        return this.value_;
    }

    public final String RatingCompat() {
        return this.typeUrl_;
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.RemoteActionCompatParcelizer(KeyData.class, keyData);
    }

    public static invalidateMeasurementsui serializer() {
        return (invalidateMeasurementsui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (invalidateOnPositionedui.serializer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new KeyData();
            case 2:
                return new invalidateMeasurementsui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (KeyData.class) {
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

    public final invalidateSemanticsui RemoteActionCompatParcelizer() {
        invalidateSemanticsui invalidatesemanticsuiForNumber = invalidateSemanticsui.forNumber(this.keyMaterialType_);
        return invalidatesemanticsuiForNumber == null ? invalidateSemanticsui.UNRECOGNIZED : invalidatesemanticsuiForNumber;
    }

    public static void IconCompatParcelizer(KeyData keyData, String str) {
        keyData.getClass();
        str.getClass();
        keyData.typeUrl_ = str;
    }

    public static void IconCompatParcelizer(KeyData keyData, invalidateSemanticsui invalidatesemanticsui) {
        keyData.getClass();
        keyData.keyMaterialType_ = invalidatesemanticsui.getNumber();
    }

    public static void write(KeyData keyData, setOnDetachui setondetachui) {
        keyData.getClass();
        keyData.value_ = setondetachui;
    }
}
