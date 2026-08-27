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
import o.IconCompatParcelizer;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.populateAccessibilityNodeInfoPropertiescanScrollForward;
import o.registerScrollingId;
import o.requestAccessibilityFocus;
import o.setContentInvalid;

/* JADX INFO: loaded from: classes4.dex */
public final class BatchGetDocumentsResponse extends GeneratedMessageLite implements registerScrollingId {
    private static final BatchGetDocumentsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private getClipMetadata transaction_ = getClipMetadata.serializer;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static BatchGetDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public getClipMetadata getTransaction() {
        return this.transaction_;
    }

    public boolean hasFound() {
        return this.resultCase_ == 1;
    }

    public boolean hasMissing() {
        return this.resultCase_ == 2;
    }

    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public enum write {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        write(int i) {
            this.value = i;
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }

        public static write forNumber(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 1) {
                return FOUND;
            }
            if (i != 2) {
                return null;
            }
            return MISSING;
        }
    }

    static {
        BatchGetDocumentsResponse batchGetDocumentsResponse = new BatchGetDocumentsResponse();
        DEFAULT_INSTANCE = batchGetDocumentsResponse;
        GeneratedMessageLite.registerDefaultInstance(BatchGetDocumentsResponse.class, batchGetDocumentsResponse);
    }

    public static requestAccessibilityFocus newBuilder() {
        return (requestAccessibilityFocus) DEFAULT_INSTANCE.createBuilder();
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (populateAccessibilityNodeInfoPropertiescanScrollForward.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BatchGetDocumentsResponse();
            case 2:
                return new requestAccessibilityFocus(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004ဉ\u0000", new Object[]{"result_", "resultCase_", "bitField0_", Document.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BatchGetDocumentsResponse.class) {
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

    public write getResultCase() {
        return write.forNumber(this.resultCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFound(Document document) {
        document.getClass();
        if (this.resultCase_ != 1 || this.result_ == Document.getDefaultInstance()) {
            this.result_ = document;
        } else {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder((Document) this.result_);
            setcontentinvalidNewBuilder.read(document);
            this.result_ = setcontentinvalidNewBuilder.read();
        }
        this.resultCase_ = 1;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFound(Document document) {
        document.getClass();
        this.result_ = document;
        this.resultCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissingBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.result_ = getclipmetadata.MediaMetadataCompat();
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.transaction_ = getclipmetadata;
    }

    private BatchGetDocumentsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        this.transaction_ = getDefaultInstance().getTransaction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMissing(String str) {
        str.getClass();
        this.resultCase_ = 2;
        this.result_ = str;
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Document getFound() {
        return this.resultCase_ == 1 ? (Document) this.result_ : Document.getDefaultInstance();
    }

    public String getMissing() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public getClipMetadata getMissingBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.resultCase_ == 2 ? (String) this.result_ : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFound() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMissing() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static requestAccessibilityFocus newBuilder(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        return (requestAccessibilityFocus) DEFAULT_INSTANCE.createBuilder(batchGetDocumentsResponse);
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BatchGetDocumentsResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
