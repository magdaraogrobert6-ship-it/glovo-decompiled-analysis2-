package com.google.firestore.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getHasMatchedShape;
import o.getLocalProvidableScrollCaptureInProgress;
import o.performActionHelpercanScroll;

/* JADX INFO: loaded from: classes4.dex */
public final class RunAggregationQueryResponse extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final RunAggregationQueryResponse DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 1;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private Timestamp readTime_;
    private AggregationResult result_;
    private getClipMetadata transaction_ = getClipMetadata.serializer;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.result_ = null;
        this.bitField0_ &= -2;
    }

    public static RunAggregationQueryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public getClipMetadata getTransaction() {
        return this.transaction_;
    }

    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResult() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        RunAggregationQueryResponse runAggregationQueryResponse = new RunAggregationQueryResponse();
        DEFAULT_INSTANCE = runAggregationQueryResponse;
        GeneratedMessageLite.registerDefaultInstance(RunAggregationQueryResponse.class, runAggregationQueryResponse);
    }

    public static AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1 newBuilder() {
        return (AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1) DEFAULT_INSTANCE.createBuilder();
    }

    public static RunAggregationQueryResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RunAggregationQueryResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getHasMatchedShape.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new RunAggregationQueryResponse();
            case 2:
                return new AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\n\u0003ဉ\u0001", new Object[]{"bitField0_", "result_", "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (RunAggregationQueryResponse.class) {
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

    private RunAggregationQueryResponse() {
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
    public void mergeResult(AggregationResult aggregationResult) {
        aggregationResult.getClass();
        AggregationResult aggregationResult2 = this.result_;
        if (aggregationResult2 == null || aggregationResult2 == AggregationResult.getDefaultInstance()) {
            this.result_ = aggregationResult;
        } else {
            performActionHelpercanScroll performactionhelpercanscrollNewBuilder = AggregationResult.newBuilder(this.result_);
            performactionhelpercanscrollNewBuilder.read(aggregationResult);
            this.result_ = (AggregationResult) performactionhelpercanscrollNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(AggregationResult aggregationResult) {
        aggregationResult.getClass();
        this.result_ = aggregationResult;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.transaction_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public AggregationResult getResult() {
        AggregationResult aggregationResult = this.result_;
        return aggregationResult == null ? AggregationResult.getDefaultInstance() : aggregationResult;
    }

    public static AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1 newBuilder(RunAggregationQueryResponse runAggregationQueryResponse) {
        return (AndroidComposeViewAccessibilityDelegateCompatsendSubtreeChangeAccessibilityEvents1) DEFAULT_INSTANCE.createBuilder(runAggregationQueryResponse);
    }

    public static RunAggregationQueryResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static RunAggregationQueryResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RunAggregationQueryResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryResponse parseFrom(InputStream inputStream) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RunAggregationQueryResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RunAggregationQueryResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RunAggregationQueryResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RunAggregationQueryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
