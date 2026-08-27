package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getIdToAfterMapui;
import o.getIdToBeforeMapui;
import o.getLocalProvidableScrollCaptureInProgress;
import o.toSpannableString;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class ExecutePipelineResponse extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final ExecutePipelineResponse DEFAULT_INSTANCE;
    public static final int EXECUTION_TIME_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp executionTime_;
    private getClipMetadata transaction_ = getClipMetadata.serializer;
    private decodeString results_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExecutionTime() {
        this.executionTime_ = null;
        this.bitField0_ &= -2;
    }

    public static ExecutePipelineResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Document> getResultsList() {
        return this.results_;
    }

    public List<? extends toSpannableString> getResultsOrBuilderList() {
        return this.results_;
    }

    public getClipMetadata getTransaction() {
        return this.transaction_;
    }

    public boolean hasExecutionTime() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        ExecutePipelineResponse executePipelineResponse = new ExecutePipelineResponse();
        DEFAULT_INSTANCE = executePipelineResponse;
        GeneratedMessageLite.registerDefaultInstance(ExecutePipelineResponse.class, executePipelineResponse);
    }

    public static getIdToBeforeMapui newBuilder() {
        return (getIdToBeforeMapui) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExecutePipelineResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExecutePipelineResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getIdToAfterMapui.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ExecutePipelineResponse();
            case 2:
                return new getIdToBeforeMapui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\n\u0002\u001b\u0003ဉ\u0000", new Object[]{"bitField0_", "transaction_", "results_", Document.class, "executionTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ExecutePipelineResponse.class) {
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

    public Document getResults(int i) {
        return (Document) this.results_.get(i);
    }

    public int getResultsCount() {
        return this.results_.size();
    }

    public toSpannableString getResultsOrBuilder(int i) {
        return (toSpannableString) this.results_.get(i);
    }

    private ExecutePipelineResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResults(Iterable<? extends Document> iterable) {
        ensureResultsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.results_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResults(Document document) {
        document.getClass();
        ensureResultsIsMutable();
        this.results_.add(document);
    }

    private void ensureResultsIsMutable() {
        decodeString decodestring = this.results_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.results_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExecutionTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.executionTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.executionTime_ = timestamp;
        } else {
            this.executionTime_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.executionTime_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResults(int i) {
        ensureResultsIsMutable();
        this.results_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExecutionTime(Timestamp timestamp) {
        timestamp.getClass();
        this.executionTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResults(int i, Document document) {
        document.getClass();
        ensureResultsIsMutable();
        this.results_.set(i, document);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.transaction_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResults() {
        this.results_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    public Timestamp getExecutionTime() {
        Timestamp timestamp = this.executionTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public static getIdToBeforeMapui newBuilder(ExecutePipelineResponse executePipelineResponse) {
        return (getIdToBeforeMapui) DEFAULT_INSTANCE.createBuilder(executePipelineResponse);
    }

    public static ExecutePipelineResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ExecutePipelineResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResults(int i, Document document) {
        document.getClass();
        ensureResultsIsMutable();
        this.results_.add(i, document);
    }

    public static ExecutePipelineResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExecutePipelineResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineResponse parseFrom(InputStream inputStream) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExecutePipelineResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExecutePipelineResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExecutePipelineResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExecutePipelineResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
