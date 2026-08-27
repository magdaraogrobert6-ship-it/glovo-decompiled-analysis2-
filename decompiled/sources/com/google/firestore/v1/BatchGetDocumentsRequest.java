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
import o.getLocalProvidableScrollCaptureInProgress;
import o.populateAccessibilityNodeInfoProperties;
import o.populateAccessibilityNodeInfoPropertiescanScrollBackward;
import o.setViewTranslationCallback;
import o.transformMatrixToWindowEL8BTi8;
import o.updateHoveredVirtualView;

/* JADX INFO: loaded from: classes4.dex */
public final class BatchGetDocumentsRequest extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BatchGetDocumentsRequest DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private int consistencySelectorCase_ = 0;
    private String database_ = "";
    private decodeString documents_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMask() {
        this.mask_ = null;
        this.bitField0_ &= -2;
    }

    public static BatchGetDocumentsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getDatabase() {
        return this.database_;
    }

    public List<String> getDocumentsList() {
        return this.documents_;
    }

    public boolean hasMask() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNewTransaction() {
        return this.consistencySelectorCase_ == 5;
    }

    public boolean hasReadTime() {
        return this.consistencySelectorCase_ == 7;
    }

    public boolean hasTransaction() {
        return this.consistencySelectorCase_ == 4;
    }

    public enum write {
        TRANSACTION(4),
        NEW_TRANSACTION(5),
        READ_TIME(7),
        CONSISTENCYSELECTOR_NOT_SET(0);

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
                return CONSISTENCYSELECTOR_NOT_SET;
            }
            if (i == 7) {
                return READ_TIME;
            }
            if (i == 4) {
                return TRANSACTION;
            }
            if (i != 5) {
                return null;
            }
            return NEW_TRANSACTION;
        }
    }

    static {
        BatchGetDocumentsRequest batchGetDocumentsRequest = new BatchGetDocumentsRequest();
        DEFAULT_INSTANCE = batchGetDocumentsRequest;
        GeneratedMessageLite.registerDefaultInstance(BatchGetDocumentsRequest.class, batchGetDocumentsRequest);
    }

    public static populateAccessibilityNodeInfoProperties newBuilder() {
        return (populateAccessibilityNodeInfoProperties) DEFAULT_INSTANCE.createBuilder();
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (populateAccessibilityNodeInfoPropertiescanScrollBackward.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BatchGetDocumentsRequest();
            case 2:
                return new populateAccessibilityNodeInfoProperties(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004=\u0000\u0005<\u0000\u0007<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", TransactionOptions.class, Timestamp.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BatchGetDocumentsRequest.class) {
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

    public write getConsistencySelectorCase() {
        return write.forNumber(this.consistencySelectorCase_);
    }

    public getClipMetadata getDatabaseBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.database_);
    }

    public String getDocuments(int i) {
        return (String) this.documents_.get(i);
    }

    public getClipMetadata getDocumentsBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.documents_.get(i));
    }

    public int getDocumentsCount() {
        return this.documents_.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDocuments(Iterable<String> iterable) {
        ensureDocumentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.documents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(String str) {
        str.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocumentsBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureDocumentsIsMutable();
        this.documents_.add(getclipmetadata.MediaMetadataCompat());
    }

    private void ensureDocumentsIsMutable() {
        decodeString decodestring = this.documents_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.documents_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 == null || documentMask2 == DocumentMask.getDefaultInstance()) {
            this.mask_ = documentMask;
        } else {
            updateHoveredVirtualView updatehoveredvirtualviewNewBuilder = DocumentMask.newBuilder(this.mask_);
            updatehoveredvirtualviewNewBuilder.read(documentMask);
            this.mask_ = (DocumentMask) updatehoveredvirtualviewNewBuilder.read();
        }
        this.bitField0_ |= 1;
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
        if (this.consistencySelectorCase_ != 7 || this.consistencySelector_ == Timestamp.getDefaultInstance()) {
            this.consistencySelector_ = timestamp;
        } else {
            this.consistencySelector_ = IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.consistencySelector_, timestamp);
        }
        this.consistencySelectorCase_ = 7;
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
    public void setDocuments(int i, String str) {
        str.getClass();
        ensureDocumentsIsMutable();
        this.documents_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.mask_ = documentMask;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewTransaction(TransactionOptions transactionOptions) {
        transactionOptions.getClass();
        this.consistencySelector_ = transactionOptions;
        this.consistencySelectorCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.consistencySelector_ = timestamp;
        this.consistencySelectorCase_ = 7;
    }

    private BatchGetDocumentsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        this.documents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransaction(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.consistencySelectorCase_ = 4;
        this.consistencySelector_ = getclipmetadata;
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        return documentMask == null ? DocumentMask.getDefaultInstance() : documentMask;
    }

    public TransactionOptions getNewTransaction() {
        return this.consistencySelectorCase_ == 5 ? (TransactionOptions) this.consistencySelector_ : TransactionOptions.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        return this.consistencySelectorCase_ == 7 ? (Timestamp) this.consistencySelector_ : Timestamp.getDefaultInstance();
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
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static populateAccessibilityNodeInfoProperties newBuilder(BatchGetDocumentsRequest batchGetDocumentsRequest) {
        return (populateAccessibilityNodeInfoProperties) DEFAULT_INSTANCE.createBuilder(batchGetDocumentsRequest);
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsRequest parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BatchGetDocumentsRequest parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BatchGetDocumentsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
