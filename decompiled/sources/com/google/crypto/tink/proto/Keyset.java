package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.CodedInputStream$StreamDecoder;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import o.LayoutNodeCompanionDummyViewConfiguration1;
import o.LayoutNodeCompanionErrorMeasurePolicy1;
import o.getAlignmentLinesMap;
import o.getAlignmentLinesOwnerui;
import o.getCoordinatesAccessedDuringPlacement;
import o.getDetachedFromParentLookaheadPassui;
import o.getDetachedFromParentLookaheadPlacementui;
import o.getNotPlacedPlaceOrderuiannotations;
import o.getZComparatorui;
import o.isEndBoundary;
import o.isSemanticsInvalidatedui;
import o.lookaheadRemeasure_Sx5XlMui;
import o.lookaheadReplaceui;
import o.markLookaheadMeasurePendingui;
import o.requestRemeasureui;
import o.setGloballyPositionedObservers;
import o.withComposeStackTrace;

/* JADX INFO: loaded from: classes2.dex */
public final class Keyset extends GeneratedMessageLite {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile getAlignmentLinesOwnerui PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private LayoutNodeCompanionErrorMeasurePolicy1 key_ = getDetachedFromParentLookaheadPassui.serializer;
    private int primaryKeyId_;

    public final class Key extends GeneratedMessageLite {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile getAlignmentLinesOwnerui PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static void write(Key key, int i) {
            key.keyId_ = i;
        }

        public final boolean MediaSessionCompatQueueItem() {
            return this.keyData_ != null;
        }

        public final int serializer() {
            return this.keyId_;
        }

        static {
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.RemoteActionCompatParcelizer(Key.class, key);
        }

        public static markLookaheadMeasurePendingui IconCompatParcelizer() {
            return (markLookaheadMeasurePendingui) DEFAULT_INSTANCE.MediaSessionCompatToken();
        }

        public final isSemanticsInvalidatedui MediaDescriptionCompat() {
            isSemanticsInvalidatedui issemanticsinvalidateduiForNumber = isSemanticsInvalidatedui.forNumber(this.status_);
            return issemanticsinvalidateduiForNumber == null ? isSemanticsInvalidatedui.UNRECOGNIZED : issemanticsinvalidateduiForNumber;
        }

        public final requestRemeasureui MediaMetadataCompat() {
            requestRemeasureui requestremeasureuiForNumber = requestRemeasureui.forNumber(this.outputPrefixType_);
            return requestremeasureuiForNumber == null ? requestRemeasureui.UNRECOGNIZED : requestremeasureuiForNumber;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
            getAlignmentLinesOwnerui getzcomparatorui;
            switch (lookaheadRemeasure_Sx5XlMui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
                case 1:
                    return new Key();
                case 2:
                    return new markLookaheadMeasurePendingui();
                case 3:
                    return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                    if (getalignmentlinesownerui != null) {
                        return getalignmentlinesownerui;
                    }
                    synchronized (Key.class) {
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

        public static void IconCompatParcelizer(Key key, KeyData keyData) {
            key.getClass();
            key.keyData_ = keyData;
        }

        public static void RemoteActionCompatParcelizer(Key key, requestRemeasureui requestremeasureui) {
            key.getClass();
            key.outputPrefixType_ = requestremeasureui.getNumber();
        }

        public static void write(Key key, isSemanticsInvalidatedui issemanticsinvalidatedui) {
            key.getClass();
            key.status_ = issemanticsinvalidatedui.getNumber();
        }

        public final KeyData RemoteActionCompatParcelizer() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.IconCompatParcelizer() : keyData;
        }
    }

    public static void RemoteActionCompatParcelizer(Keyset keyset, int i) {
        keyset.primaryKeyId_ = i;
    }

    public final List RemoteActionCompatParcelizer() {
        return this.key_;
    }

    public final int serializer() {
        return this.primaryKeyId_;
    }

    static {
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.RemoteActionCompatParcelizer(Keyset.class, keyset);
    }

    public static Keyset read(byte[] bArr, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) {
        Keyset keyset = DEFAULT_INSTANCE;
        int length = bArr.length;
        GeneratedMessageLite generatedMessageLiteResultReceiver = keyset.ResultReceiver();
        try {
            withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
            withcomposestacktrace.getClass();
            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer = withcomposestacktrace.RemoteActionCompatParcelizer(generatedMessageLiteResultReceiver.getClass());
            isEndBoundary isendboundary = new isEndBoundary();
            getnotplacedplaceorderuiannotations.getClass();
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.IconCompatParcelizer(generatedMessageLiteResultReceiver, bArr, 0, length, isendboundary);
            getcoordinatesaccessedduringplacementRemoteActionCompatParcelizer.write(generatedMessageLiteResultReceiver);
            GeneratedMessageLite.serializer(generatedMessageLiteResultReceiver);
            return (Keyset) generatedMessageLiteResultReceiver;
        } catch (InvalidProtocolBufferException e) {
            if (e.read) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }

    public static lookaheadReplaceui write() {
        return (lookaheadReplaceui) DEFAULT_INSTANCE.MediaSessionCompatToken();
    }

    public final int IconCompatParcelizer() {
        return this.key_.size();
    }

    public final Key IconCompatParcelizer(int i) {
        return (Key) this.key_.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object RemoteActionCompatParcelizer(LayoutNodeCompanionDummyViewConfiguration1 layoutNodeCompanionDummyViewConfiguration1) {
        getAlignmentLinesOwnerui getzcomparatorui;
        switch (lookaheadRemeasure_Sx5XlMui.read[layoutNodeCompanionDummyViewConfiguration1.ordinal()]) {
            case 1:
                return new Keyset();
            case 2:
                return new lookaheadReplaceui(DEFAULT_INSTANCE);
            case 3:
                return new getDetachedFromParentLookaheadPlacementui(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                getAlignmentLinesOwnerui getalignmentlinesownerui = PARSER;
                if (getalignmentlinesownerui != null) {
                    return getalignmentlinesownerui;
                }
                synchronized (Keyset.class) {
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

    public static void IconCompatParcelizer(Keyset keyset, Key key) {
        keyset.getClass();
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = keyset.key_;
        if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
            int size = layoutNodeCompanionErrorMeasurePolicy1.size();
            keyset.key_ = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
        }
        keyset.key_.add(key);
    }

    public static Keyset RemoteActionCompatParcelizer(ByteArrayInputStream byteArrayInputStream, getNotPlacedPlaceOrderuiannotations getnotplacedplaceorderuiannotations) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite = GeneratedMessageLite.read(DEFAULT_INSTANCE, new CodedInputStream$StreamDecoder(byteArrayInputStream), getnotplacedplaceorderuiannotations);
        GeneratedMessageLite.serializer(generatedMessageLite);
        return (Keyset) generatedMessageLite;
    }
}
