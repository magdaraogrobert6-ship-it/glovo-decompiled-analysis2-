package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeViewAccessibilityDelegateCompatonSendAccessibilityEvent1;
import o.AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessibilityEquals;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setViewTranslationCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class RunAggregationQueryRequest extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final RunAggregationQueryRequest DEFAULT_INSTANCE;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private Object consistencySelector_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private int consistencySelectorCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    public static RunAggregationQueryRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getParent() {
        return this.parent_;
    }

    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 6;
    }

    public boolean hasStructuredAggregationQuery() {
        return this.queryTypeCase_ == 2;
    }

    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 4;
    }

    public enum IconCompatParcelizer {
        TRANSACTION(4),
        NEW_TRANSACTION(5),
        READ_TIME(6),
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
            if (i == 4) {
                return TRANSACTION;
            }
            if (i == 5) {
                return NEW_TRANSACTION;
            }
            if (i != 6) {
                return null;
            }
            return READ_TIME;
        }
    }

    public enum RemoteActionCompatParcelizer {
        STRUCTURED_AGGREGATION_QUERY(2),
        QUERYTYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        RemoteActionCompatParcelizer(int i) {
            this.value = i;
        }

        public static RemoteActionCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_AGGREGATION_QUERY;
        }

        @Deprecated
        public static RemoteActionCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        RunAggregationQueryRequest runAggregationQueryRequest = new RunAggregationQueryRequest();
        DEFAULT_INSTANCE = runAggregationQueryRequest;
        GeneratedMessageLite.registerDefaultInstance(RunAggregationQueryRequest.class, runAggregationQueryRequest);
    }

    public static AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1 newBuilder() {
        return (AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1) DEFAULT_INSTANCE.createBuilder();
    }

    public static RunAggregationQueryRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RunAggregationQueryRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidComposeViewAccessibilityDelegateCompatonSendAccessibilityEvent1.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new RunAggregationQueryRequest();
            case 2:
                return new AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0004=\u0001\u0005<\u0001\u0006<\u0001", new Object[]{"queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", StructuredAggregationQuery.class, TransactionOptions.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (RunAggregationQueryRequest.class) {
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

    public getClipMetadata getParentBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.parent_);
    }

    public RemoteActionCompatParcelizer getQueryTypeCase() {
        return RemoteActionCompatParcelizer.forNumber(this.queryTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        if (this.consistencySelectorCase_ != 5 || this.consistencySelector_ == TransactionOptions.getDefaultInstance()) {
            this.consistencySelector_ = transactionOptions;
        } else {
            setViewTranslationCallback setviewtranslationcallbackNewBuilder = TransactionOptions.newBuilder((TransactionOptions) this.consistencySelector_);
            setviewtranslationcallbackNewBuilder.read(transactionOptions);
            this.consistencySelector_ = setviewtranslationcallbackNewBuilder.read();
        }
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        if (this.consistencySelectorCase_ != 6 || this.consistencySelector_ == Timestamp.getDefaultInstance()) {
            this.consistencySelector_ = timestamp;
        } else {
            this.consistencySelector_ = o.IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.consistencySelector_, timestamp);
        }
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredAggregationQuery(StructuredAggregationQuery structuredAggregationQuery) {
        structuredAggregationQuery.getClass();
        if (this.queryTypeCase_ != 2 || this.queryType_ == StructuredAggregationQuery.getDefaultInstance()) {
            this.queryType_ = structuredAggregationQuery;
        } else {
            accessibilityEquals accessibilityequalsNewBuilder = StructuredAggregationQuery.newBuilder((StructuredAggregationQuery) this.queryType_);
            accessibilityequalsNewBuilder.read(structuredAggregationQuery);
            this.queryType_ = accessibilityequalsNewBuilder.read();
        }
        this.queryTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = transactionOptions;
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.parent_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredAggregationQuery(StructuredAggregationQuery structuredAggregationQuery) {
        structuredAggregationQuery.getClass();
        this.queryType_ = structuredAggregationQuery;
        this.queryTypeCase_ = 2;
    }

    private RunAggregationQueryRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.consistencySelectorCase_ = 4;
        this.consistencySelector_ = getclipmetadata;
    }

    public TransactionOptions getNewTransaction() {
        return this.consistencySelectorCase_ == 5 ? (TransactionOptions) this.consistencySelector_ : TransactionOptions.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        return this.consistencySelectorCase_ == 6 ? (Timestamp) this.consistencySelector_ : Timestamp.getDefaultInstance();
    }

    public StructuredAggregationQuery getStructuredAggregationQuery() {
        return this.queryTypeCase_ == 2 ? (StructuredAggregationQuery) this.queryType_ : StructuredAggregationQuery.getDefaultInstance();
    }

    public getClipMetadata getTransaction() {
        return this.consistencySelectorCase_ == 4 ? (getClipMetadata) this.consistencySelector_ : getClipMetadata.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredAggregationQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1 newBuilder(RunAggregationQueryRequest runAggregationQueryRequest) {
        return (AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeeded1) DEFAULT_INSTANCE.createBuilder(runAggregationQueryRequest);
    }

    public static RunAggregationQueryRequest parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryRequest parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryRequest parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static RunAggregationQueryRequest parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RunAggregationQueryRequest parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryRequest parseFrom(InputStream inputStream) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RunAggregationQueryRequest parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RunAggregationQueryRequest parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
