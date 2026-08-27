package com.google.firebase.firestore.proto;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeViewTranslationCallback;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.inverseTransform58bKbWc;
import o.isFrameRateFromParent;
import o.onHideTranslation;
import o.onShowTranslation;

/* JADX INFO: loaded from: classes2.dex */
public final class Target extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile component23 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private Timestamp snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private getClipMetadata resumeToken_ = getClipMetadata.serializer;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastLimboFreeSnapshotVersion() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotVersion() {
        this.snapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastListenSequenceNumber(long j) {
        this.lastListenSequenceNumber_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    public long getLastListenSequenceNumber() {
        return this.lastListenSequenceNumber_;
    }

    public getClipMetadata getResumeToken() {
        return this.resumeToken_;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public boolean hasDocuments() {
        return this.targetTypeCase_ == 6;
    }

    public boolean hasLastLimboFreeSnapshotVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPipelineQuery() {
        return this.targetTypeCase_ == 13;
    }

    public boolean hasQuery() {
        return this.targetTypeCase_ == 5;
    }

    public boolean hasSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public enum serializer {
        QUERY(5),
        DOCUMENTS(6),
        PIPELINE_QUERY(13),
        TARGETTYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        serializer(int i) {
            this.value = i;
        }

        @Deprecated
        public static serializer valueOf(int i) {
            return forNumber(i);
        }

        public static serializer forNumber(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 13) {
                return PIPELINE_QUERY;
            }
            if (i == 5) {
                return QUERY;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.registerDefaultInstance(Target.class, target);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastListenSequenceNumber() {
        this.lastListenSequenceNumber_ = 0L;
    }

    public static isFrameRateFromParent newBuilder() {
        return (isFrameRateFromParent) DEFAULT_INSTANCE.createBuilder();
    }

    public static Target parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (inverseTransform58bKbWc.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new isFrameRateFromParent(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\r\b\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", com.google.firestore.v1.Target.QueryTarget.class, com.google.firestore.v1.Target.DocumentsTarget.class, "lastLimboFreeSnapshotVersion_", com.google.firestore.v1.Target.PipelineQueryTarget.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Target.class) {
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

    public serializer getTargetTypeCase() {
        return serializer.forNumber(this.targetTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(com.google.firestore.v1.Target.DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        if (this.targetTypeCase_ != 6 || this.targetType_ == com.google.firestore.v1.Target.DocumentsTarget.getDefaultInstance()) {
            this.targetType_ = documentsTarget;
        } else {
            onHideTranslation onhidetranslationNewBuilder = com.google.firestore.v1.Target.DocumentsTarget.newBuilder((com.google.firestore.v1.Target.DocumentsTarget) this.targetType_);
            onhidetranslationNewBuilder.read(documentsTarget);
            this.targetType_ = onhidetranslationNewBuilder.read();
        }
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastLimboFreeSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.lastLimboFreeSnapshotVersion_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.lastLimboFreeSnapshotVersion_ = timestamp;
        } else {
            this.lastLimboFreeSnapshotVersion_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.lastLimboFreeSnapshotVersion_, timestamp);
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePipelineQuery(com.google.firestore.v1.Target.PipelineQueryTarget pipelineQueryTarget) {
        pipelineQueryTarget.getClass();
        if (this.targetTypeCase_ != 13 || this.targetType_ == com.google.firestore.v1.Target.PipelineQueryTarget.getDefaultInstance()) {
            this.targetType_ = pipelineQueryTarget;
        } else {
            AndroidComposeViewTranslationCallback androidComposeViewTranslationCallbackNewBuilder = com.google.firestore.v1.Target.PipelineQueryTarget.newBuilder((com.google.firestore.v1.Target.PipelineQueryTarget) this.targetType_);
            androidComposeViewTranslationCallbackNewBuilder.read(pipelineQueryTarget);
            this.targetType_ = androidComposeViewTranslationCallbackNewBuilder.read();
        }
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(com.google.firestore.v1.Target.QueryTarget queryTarget) {
        queryTarget.getClass();
        if (this.targetTypeCase_ != 5 || this.targetType_ == com.google.firestore.v1.Target.QueryTarget.getDefaultInstance()) {
            this.targetType_ = queryTarget;
        } else {
            onShowTranslation onshowtranslationNewBuilder = com.google.firestore.v1.Target.QueryTarget.newBuilder((com.google.firestore.v1.Target.QueryTarget) this.targetType_);
            onshowtranslationNewBuilder.read(queryTarget);
            this.targetType_ = onshowtranslationNewBuilder.read();
        }
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.snapshotVersion_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.snapshotVersion_ = timestamp;
        } else {
            this.snapshotVersion_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.snapshotVersion_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(com.google.firestore.v1.Target.DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastLimboFreeSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        this.lastLimboFreeSnapshotVersion_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipelineQuery(com.google.firestore.v1.Target.PipelineQueryTarget pipelineQueryTarget) {
        pipelineQueryTarget.getClass();
        this.targetType_ = pipelineQueryTarget;
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(com.google.firestore.v1.Target.QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.resumeToken_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        this.snapshotVersion_ = timestamp;
        this.bitField0_ |= 1;
    }

    private Target() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    public Timestamp getLastLimboFreeSnapshotVersion() {
        Timestamp timestamp = this.lastLimboFreeSnapshotVersion_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getSnapshotVersion() {
        Timestamp timestamp = this.snapshotVersion_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public com.google.firestore.v1.Target.DocumentsTarget getDocuments() {
        return this.targetTypeCase_ == 6 ? (com.google.firestore.v1.Target.DocumentsTarget) this.targetType_ : com.google.firestore.v1.Target.DocumentsTarget.getDefaultInstance();
    }

    public com.google.firestore.v1.Target.QueryTarget getQuery() {
        return this.targetTypeCase_ == 5 ? (com.google.firestore.v1.Target.QueryTarget) this.targetType_ : com.google.firestore.v1.Target.QueryTarget.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 6) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 5) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    public com.google.firestore.v1.Target.PipelineQueryTarget getPipelineQuery() {
        return this.targetTypeCase_ == 13 ? (com.google.firestore.v1.Target.PipelineQueryTarget) this.targetType_ : com.google.firestore.v1.Target.PipelineQueryTarget.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipelineQuery() {
        if (this.targetTypeCase_ == 13) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    public static isFrameRateFromParent newBuilder(Target target) {
        return (isFrameRateFromParent) DEFAULT_INSTANCE.createBuilder(target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Target) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Target parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Target parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static Target parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Target parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Target parseFrom(InputStream inputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Target parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Target parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Target) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
