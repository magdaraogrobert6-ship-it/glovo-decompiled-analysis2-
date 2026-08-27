package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import o.LayoutNodeCompanionDummyViewConfiguration1;
import o.LayoutNodeCompanionErrorMeasurePolicy1;
import o.getAlignmentLinesMap;
import o.getAlignmentLinesOwnerui;
import o.getDetachedFromParentLookaheadPassui;
import o.getDetachedFromParentLookaheadPlacementui;
import o.getZComparatorui;
import o.isSemanticsInvalidatedui;
import o.markLookaheadLayoutPendingui;
import o.moveui;
import o.onCoordinatorRectChangedui;
import o.requestRemeasureui;
import o.setGloballyPositionedObservers;

/* JADX INFO: loaded from: classes2.dex */
public final class KeysetInfo extends GeneratedMessageLite {
    private static final KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private LayoutNodeCompanionErrorMeasurePolicy1 keyInfo_ = getDetachedFromParentLookaheadPassui.serializer;
    private int primaryKeyId_;

    public final class KeyInfo extends GeneratedMessageLite {
        private static final KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile getAlignmentLinesOwnerui PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static void IconCompatParcelizer(KeyInfo keyInfo, int i) {
            keyInfo.keyId_ = i;
        }

        public final int serializer() {
            return this.keyId_;
        }

        static {
            KeyInfo keyInfo = new KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            GeneratedMessageLite.RemoteActionCompatParcelizer(KeyInfo.class, keyInfo);
        }

        public static moveui write() {
            return (moveui) DEFAULT_INSTANCE.MediaSessionCompatToken();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
            getAlignmentLinesOwnerui getzcomparatorui;
            switch (onCoordinatorRectChangedui.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
                case 1:
                    return new KeyInfo();
                case 2:
                    return new moveui();
                case 3:
                    return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                    if (getalignmentlinesownerui != null) {
                        return getalignmentlinesownerui;
                    }
                    synchronized (KeyInfo.class) {
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

        public static void IconCompatParcelizer(KeyInfo keyInfo, requestRemeasureui requestremeasureui) {
            keyInfo.getClass();
            keyInfo.outputPrefixType_ = requestremeasureui.getNumber();
        }

        public static void read(KeyInfo keyInfo, String str) {
            keyInfo.getClass();
            str.getClass();
            keyInfo.typeUrl_ = str;
        }

        public static void serializer(KeyInfo keyInfo, isSemanticsInvalidatedui issemanticsinvalidatedui) {
            keyInfo.getClass();
            keyInfo.status_ = issemanticsinvalidatedui.getNumber();
        }
    }

    public static void serializer(KeysetInfo keysetInfo, int i) {
        keysetInfo.primaryKeyId_ = i;
    }

    public final KeyInfo write() {
        return (KeyInfo) this.keyInfo_.get(0);
    }

    static {
        KeysetInfo keysetInfo = new KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        GeneratedMessageLite.RemoteActionCompatParcelizer(KeysetInfo.class, keysetInfo);
    }

    public static markLookaheadLayoutPendingui serializer() {
        return (markLookaheadLayoutPendingui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (onCoordinatorRectChangedui.IconCompatParcelizer[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new KeysetInfo();
            case 2:
                return new markLookaheadLayoutPendingui();
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", KeyInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (KeysetInfo.class) {
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

    public static void RemoteActionCompatParcelizer(KeysetInfo keysetInfo, KeyInfo keyInfo) {
        keysetInfo.getClass();
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = keysetInfo.keyInfo_;
        if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
            int size = layoutNodeCompanionErrorMeasurePolicy1.size();
            keysetInfo.keyInfo_ = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
        }
        keysetInfo.keyInfo_.add(keyInfo);
    }
}
