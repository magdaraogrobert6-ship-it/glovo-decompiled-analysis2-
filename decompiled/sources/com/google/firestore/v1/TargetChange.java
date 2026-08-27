package com.google.firestore.v1;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewTranslationCallbackS;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DebugUtilsKt;
import o.IconCompatParcelizer;
import o.clearViewTranslationCallback;
import o.component23;
import o.dataAvailable;
import o.decodeByte;
import o.decodeFloat;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getContainerDpSizeMYxV2XQ;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;
import o.onClearTranslation;
import o.setPointerIcon;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetChange extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final TargetChange DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Status cause_;
    private Timestamp readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private decodeFloat targetIds_ = GeneratedMessageLite.emptyIntList();
    private getClipMetadata resumeToken_ = getClipMetadata.serializer;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCause() {
        this.cause_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChangeType() {
        this.targetChangeType_ = 0;
    }

    public static TargetChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChangeTypeValue(int i) {
        this.targetChangeType_ = i;
    }

    public getClipMetadata getResumeToken() {
        return this.resumeToken_;
    }

    public int getTargetChangeTypeValue() {
        return this.targetChangeType_;
    }

    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    public boolean hasCause() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public enum RemoteActionCompatParcelizer implements ifDebug {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);

        public static final int ADD_VALUE = 1;
        public static final int CURRENT_VALUE = 3;
        public static final int NO_CHANGE_VALUE = 0;
        public static final int REMOVE_VALUE = 2;
        public static final int RESET_VALUE = 4;
        private static final dataAvailable internalValueMap = new setPointerIcon();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return clearViewTranslationCallback.write;
        }

        RemoteActionCompatParcelizer(int i) {
            this.value = i;
        }

        @Override // o.ifDebug
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static RemoteActionCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static RemoteActionCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return NO_CHANGE;
            }
            if (i == 1) {
                return ADD;
            }
            if (i == 2) {
                return REMOVE;
            }
            if (i == 3) {
                return CURRENT;
            }
            if (i != 4) {
                return null;
            }
            return RESET;
        }
    }

    static {
        TargetChange targetChange = new TargetChange();
        DEFAULT_INSTANCE = targetChange;
        GeneratedMessageLite.registerDefaultInstance(TargetChange.class, targetChange);
    }

    public static AndroidComposeViewTranslationCallbackS newBuilder() {
        return (AndroidComposeViewTranslationCallbackS) DEFAULT_INSTANCE.createBuilder();
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (onClearTranslation.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TargetChange();
            case 2:
                return new AndroidComposeViewTranslationCallbackS(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003ဉ\u0000\u0004\n\u0006ဉ\u0001", new Object[]{"bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TargetChange.class) {
                    compositionLocalsKtLocalLayoutDirection1 = PARSER;
                    if (compositionLocalsKtLocalLayoutDirection1 == null) {
                        compositionLocalsKtLocalLayoutDirection1 = new CompositionLocalsKtLocalLayoutDirection1(DEFAULT_INSTANCE);
                        PARSER = compositionLocalsKtLocalLayoutDirection1;
                    }
                    break;
                }
                return compositionLocalsKtLocalLayoutDirection1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public RemoteActionCompatParcelizer getTargetChangeType() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerForNumber = RemoteActionCompatParcelizer.forNumber(this.targetChangeType_);
        return remoteActionCompatParcelizerForNumber == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : remoteActionCompatParcelizerForNumber;
    }

    public int getTargetIds(int i) {
        return ((DebugUtilsKt) this.targetIds_).serializer(i);
    }

    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetIds(Iterable<? extends Integer> iterable) {
        ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.targetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetIds(int i) {
        ensureTargetIdsIsMutable();
        ((DebugUtilsKt) this.targetIds_).IconCompatParcelizer(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureTargetIdsIsMutable() {
        decodeFloat decodefloat = this.targetIds_;
        if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
            return;
        }
        this.targetIds_ = GeneratedMessageLite.mutableCopy(decodefloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCause(Status status) {
        status.getClass();
        Status status2 = this.cause_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.cause_ = status;
        } else {
            getContainerDpSizeMYxV2XQ getcontainerdpsizemyxv2xqNewBuilder = Status.newBuilder(this.cause_);
            getcontainerdpsizemyxv2xqNewBuilder.read(status);
            this.cause_ = (Status) getcontainerdpsizemyxv2xqNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.readTime_ = timestamp;
        } else {
            this.readTime_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.readTime_, timestamp);
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCause(Status status) {
        status.getClass();
        this.cause_ = status;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.resumeToken_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetIds(int i, int i2) {
        ensureTargetIdsIsMutable();
        ((DebugUtilsKt) this.targetIds_).IconCompatParcelizer(i, i2);
    }

    private TargetChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetIds() {
        this.targetIds_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChangeType(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.targetChangeType_ = remoteActionCompatParcelizer.getNumber();
    }

    public Status getCause() {
        Status status = this.cause_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public static AndroidComposeViewTranslationCallbackS newBuilder(TargetChange targetChange) {
        return (AndroidComposeViewTranslationCallbackS) DEFAULT_INSTANCE.createBuilder(targetChange);
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetChange parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetChange parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TargetChange parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TargetChange parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetChange parseFrom(InputStream inputStream) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetChange parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
