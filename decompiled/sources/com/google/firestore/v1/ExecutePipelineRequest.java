package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accesssetTraversalValues;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getHoveredVirtualViewIdui;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getRequestFromAccessibilityToolForTestingui;
import o.setViewTranslationCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutePipelineRequest extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ExecutePipelineRequest DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private Object consistencySelector_;
    private Object pipelineType_;
    private int pipelineTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipelineType() {
        this.pipelineTypeCase_ = 0;
        this.pipelineType_ = null;
    }

    public static ExecutePipelineRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getDatabase() {
        return this.database_;
    }

    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 6;
    }

    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    public boolean hasStructuredPipeline() {
        return this.pipelineTypeCase_ == 2;
    }

    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    public enum IconCompatParcelizer {
        TRANSACTION(5),
        NEW_TRANSACTION(6),
        READ_TIME(7),
        CONSISTENCYSELECTOR_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        IconCompatParcelizer(int i) {
            this.value = i;
        }

        @Deprecated
        public static IconCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static IconCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 5) {
                return TRANSACTION;
            }
            if (i == 6) {
                return NEW_TRANSACTION;
            }
            if (i != 7) {
                return null;
            }
            return READ_TIME;
        }
    }

    public enum RemoteActionCompatParcelizer {
        STRUCTURED_PIPELINE(2),
        PIPELINETYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        RemoteActionCompatParcelizer(int i) {
            this.value = i;
        }

        public static RemoteActionCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return PIPELINETYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_PIPELINE;
        }

        @Deprecated
        public static RemoteActionCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ExecutePipelineRequest executePipelineRequest = new ExecutePipelineRequest();
        DEFAULT_INSTANCE = executePipelineRequest;
        GeneratedMessageLite.registerDefaultInstance(ExecutePipelineRequest.class, executePipelineRequest);
    }

    public static getRequestFromAccessibilityToolForTestingui newBuilder() {
        return (getRequestFromAccessibilityToolForTestingui) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExecutePipelineRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExecutePipelineRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getHoveredVirtualViewIdui.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ExecutePipelineRequest();
            case 2:
                return new getRequestFromAccessibilityToolForTestingui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0005=\u0001\u0006<\u0001\u0007<\u0001", new Object[]{"pipelineType_", "pipelineTypeCase_", "consistencySelector_", "consistencySelectorCase_", "database_", StructuredPipeline.class, TransactionOptions.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ExecutePipelineRequest.class) {
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

    public IconCompatParcelizer getConsistencySelectorCase() {
        return IconCompatParcelizer.forNumber(this.consistencySelectorCase_);
    }

    public getClipMetadata getDatabaseBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.database_);
    }

    public RemoteActionCompatParcelizer getPipelineTypeCase() {
        return RemoteActionCompatParcelizer.forNumber(this.pipelineTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        if (this.consistencySelectorCase_ != 6 || this.consistencySelector_ == TransactionOptions.getDefaultInstance()) {
            this.consistencySelector_ = transactionOptions;
        } else {
            setViewTranslationCallback setviewtranslationcallbackNewBuilder = TransactionOptions.newBuilder((TransactionOptions) this.consistencySelector_);
            setviewtranslationcallbackNewBuilder.read(transactionOptions);
            this.consistencySelector_ = setviewtranslationcallbackNewBuilder.read();
        }
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        if (this.consistencySelectorCase_ != 7 || this.consistencySelector_ == Timestamp.getDefaultInstance()) {
            this.consistencySelector_ = timestamp;
        } else {
            this.consistencySelector_ = o.IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.consistencySelector_, timestamp);
        }
        this.consistencySelectorCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredPipeline(StructuredPipeline structuredPipeline) {
        structuredPipeline.getClass();
        if (this.pipelineTypeCase_ != 2 || this.pipelineType_ == StructuredPipeline.getDefaultInstance()) {
            this.pipelineType_ = structuredPipeline;
        } else {
            accesssetTraversalValues accesssettraversalvaluesNewBuilder = StructuredPipeline.newBuilder((StructuredPipeline) this.pipelineType_);
            accesssettraversalvaluesNewBuilder.read(structuredPipeline);
            this.pipelineType_ = accesssettraversalvaluesNewBuilder.read();
        }
        this.pipelineTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.database_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = transactionOptions;
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredPipeline(StructuredPipeline structuredPipeline) {
        structuredPipeline.getClass();
        this.pipelineType_ = structuredPipeline;
        this.pipelineTypeCase_ = 2;
    }

    private ExecutePipelineRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.consistencySelectorCase_ = 5;
        this.consistencySelector_ = getclipmetadata;
    }

    public TransactionOptions getNewTransaction() {
        return this.consistencySelectorCase_ == 6 ? (TransactionOptions) this.consistencySelector_ : TransactionOptions.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        return this.consistencySelectorCase_ == 7 ? (Timestamp) this.consistencySelector_ : Timestamp.getDefaultInstance();
    }

    public StructuredPipeline getStructuredPipeline() {
        return this.pipelineTypeCase_ == 2 ? (StructuredPipeline) this.pipelineType_ : StructuredPipeline.getDefaultInstance();
    }

    public getClipMetadata getTransaction() {
        return this.consistencySelectorCase_ == 5 ? (getClipMetadata) this.consistencySelector_ : getClipMetadata.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredPipeline() {
        if (this.pipelineTypeCase_ == 2) {
            this.pipelineTypeCase_ = 0;
            this.pipelineType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static getRequestFromAccessibilityToolForTestingui newBuilder(ExecutePipelineRequest executePipelineRequest) {
        return (getRequestFromAccessibilityToolForTestingui) DEFAULT_INSTANCE.createBuilder(executePipelineRequest);
    }

    public static ExecutePipelineRequest parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineRequest parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineRequest parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ExecutePipelineRequest parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExecutePipelineRequest parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineRequest parseFrom(InputStream inputStream) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExecutePipelineRequest parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExecutePipelineRequest parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
