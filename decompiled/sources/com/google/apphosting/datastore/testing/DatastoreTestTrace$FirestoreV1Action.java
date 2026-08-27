package com.google.apphosting.datastore.testing;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitResponse;
import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.DeleteDocumentRequest;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Empty;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewAccessibilityDelegateCompatApi24Impl;
import o.AndroidComposeViewAccessibilityDelegateCompatCompanion;
import o.AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeededLambda1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNodeRegistrationHandle;
import o.accessaccessibilityEquals;
import o.accessenabled;
import o.accessfindClosestParentNode;
import o.addExtraDataToAccessibilityNodeInfo;
import o.addPageActions;
import o.addSetProgressAction;
import o.ancestors6rFNWt0;
import o.ancestors6rFNWt0default;
import o.asLayoutModifierNode;
import o.component23;
import o.decodeString;
import o.dispatchForKind6rFNWt0;
import o.dispatchForKindYYKmho;
import o.dispatchOnScrollChangedUv8p0NA;
import o.dumpRenderNodeData;
import o.findNearestBeyondBoundsLayoutAncestor;
import o.focusable;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalFontFamilyResolver;
import o.getLocalProvidableScrollCaptureInProgress;
import o.has64DMado;
import o.invalidateDrawForSubtree;
import o.invalidateMeasurementForSubtree;
import o.invalidateSubtree;
import o.isDelegationRoot;
import o.nearestAncestor;
import o.nearestAncestor64DMado;
import o.populateAccessibilityNodeInfoProperties;
import o.registerScrollingId;
import o.requireCoordinator64DMado;
import o.requireDensity;
import o.requireLayoutNode;
import o.resetEnabledAccessibilityServiceList;
import o.scrollDxDyForNodeVisibleRE3cj74;
import o.semanticsChangeCheckerlambda0;
import o.sendPaneChangeEvents;
import o.sendPendingTextTraversedAtGranularityEvent;
import o.setContentInvalid;
import o.setOnSendAccessibilityEventui;
import o.setRequestFromAccessibilityToolForTestingui;
import o.toAndroidRectdefault;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$FirestoreV1Action extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BATCH_GET_DOCUMENTS_FIELD_NUMBER = 10;
    public static final int BEGIN_TRANSACTION_FIELD_NUMBER = 6;
    public static final int COMMIT_FIELD_NUMBER = 7;
    public static final int CREATE_DOCUMENT_FIELD_NUMBER = 3;
    public static final int DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER = 202;
    private static final DatastoreTestTrace$FirestoreV1Action DEFAULT_INSTANCE;
    public static final int DELETE_DOCUMENT_FIELD_NUMBER = 5;
    public static final int GET_DOCUMENT_FIELD_NUMBER = 1;
    public static final int LISTEN_FIELD_NUMBER = 12;
    public static final int LIST_COLLECTION_IDS_FIELD_NUMBER = 9;
    public static final int LIST_DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 203;
    private static volatile component23 PARSER = null;
    public static final int REMOVE_LISTEN_FIELD_NUMBER = 13;
    public static final int ROLLBACK_FIELD_NUMBER = 8;
    public static final int RUN_QUERY_FIELD_NUMBER = 11;
    public static final int STATUS_FIELD_NUMBER = 201;
    public static final int UPDATE_DOCUMENT_FIELD_NUMBER = 4;
    private Object action_;
    private int bitField0_;
    private RunQuery databaseContentsBeforeAction_;
    private DatastoreTestTrace$StatusProto status_;
    private int actionCase_ = 0;
    private decodeString matchingDocuments_ = GeneratedMessageLite.emptyProtobufList();

    public static final class BatchGetDocuments extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final BatchGetDocuments DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private BatchGetDocumentsRequest request_;
        private decodeString response_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        public static BatchGetDocuments getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<BatchGetDocumentsResponse> getResponseList() {
            return this.response_;
        }

        public List<? extends registerScrollingId> getResponseOrBuilderList() {
            return this.response_;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        static {
            BatchGetDocuments batchGetDocuments = new BatchGetDocuments();
            DEFAULT_INSTANCE = batchGetDocuments;
            GeneratedMessageLite.registerDefaultInstance(BatchGetDocuments.class, batchGetDocuments);
        }

        public static ancestors6rFNWt0 newBuilder() {
            return (ancestors6rFNWt0) DEFAULT_INSTANCE.createBuilder();
        }

        public static BatchGetDocuments parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatchGetDocuments parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new BatchGetDocuments();
                case 2:
                    return new ancestors6rFNWt0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", BatchGetDocumentsResponse.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (BatchGetDocuments.class) {
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

        public BatchGetDocumentsResponse getResponse(int i) {
            return (BatchGetDocumentsResponse) this.response_.get(i);
        }

        public int getResponseCount() {
            return this.response_.size();
        }

        public registerScrollingId getResponseOrBuilder(int i) {
            return (registerScrollingId) this.response_.get(i);
        }

        private BatchGetDocuments() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResponse(Iterable<? extends BatchGetDocumentsResponse> iterable) {
            ensureResponseIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.response_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponse(BatchGetDocumentsResponse batchGetDocumentsResponse) {
            batchGetDocumentsResponse.getClass();
            ensureResponseIsMutable();
            this.response_.add(batchGetDocumentsResponse);
        }

        private void ensureResponseIsMutable() {
            decodeString decodestring = this.response_;
            if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                return;
            }
            this.response_ = GeneratedMessageLite.mutableCopy(decodestring);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(BatchGetDocumentsRequest batchGetDocumentsRequest) {
            batchGetDocumentsRequest.getClass();
            BatchGetDocumentsRequest batchGetDocumentsRequest2 = this.request_;
            if (batchGetDocumentsRequest2 == null || batchGetDocumentsRequest2 == BatchGetDocumentsRequest.getDefaultInstance()) {
                this.request_ = batchGetDocumentsRequest;
            } else {
                populateAccessibilityNodeInfoProperties populateaccessibilitynodeinfopropertiesNewBuilder = BatchGetDocumentsRequest.newBuilder(this.request_);
                populateaccessibilitynodeinfopropertiesNewBuilder.read(batchGetDocumentsRequest);
                this.request_ = (BatchGetDocumentsRequest) populateaccessibilitynodeinfopropertiesNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResponse(int i) {
            ensureResponseIsMutable();
            this.response_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(BatchGetDocumentsRequest batchGetDocumentsRequest) {
            batchGetDocumentsRequest.getClass();
            this.request_ = batchGetDocumentsRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(int i, BatchGetDocumentsResponse batchGetDocumentsResponse) {
            batchGetDocumentsResponse.getClass();
            ensureResponseIsMutable();
            this.response_.set(i, batchGetDocumentsResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = GeneratedMessageLite.emptyProtobufList();
        }

        public BatchGetDocumentsRequest getRequest() {
            BatchGetDocumentsRequest batchGetDocumentsRequest = this.request_;
            return batchGetDocumentsRequest == null ? BatchGetDocumentsRequest.getDefaultInstance() : batchGetDocumentsRequest;
        }

        public static ancestors6rFNWt0 newBuilder(BatchGetDocuments batchGetDocuments) {
            return (ancestors6rFNWt0) DEFAULT_INSTANCE.createBuilder(batchGetDocuments);
        }

        public static BatchGetDocuments parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static BatchGetDocuments parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static BatchGetDocuments parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static BatchGetDocuments parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponse(int i, BatchGetDocumentsResponse batchGetDocumentsResponse) {
            batchGetDocumentsResponse.getClass();
            ensureResponseIsMutable();
            this.response_.add(i, batchGetDocumentsResponse);
        }

        public static BatchGetDocuments parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BatchGetDocuments parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static BatchGetDocuments parseFrom(InputStream inputStream) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BatchGetDocuments parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static BatchGetDocuments parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BatchGetDocuments parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BatchGetDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class BeginTransaction extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final BeginTransaction DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private BeginTransactionRequest request_;
        private BeginTransactionResponse response_;

        private BeginTransaction() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static BeginTransaction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            BeginTransaction beginTransaction = new BeginTransaction();
            DEFAULT_INSTANCE = beginTransaction;
            GeneratedMessageLite.registerDefaultInstance(BeginTransaction.class, beginTransaction);
        }

        public static dispatchForKind6rFNWt0 newBuilder() {
            return (dispatchForKind6rFNWt0) DEFAULT_INSTANCE.createBuilder();
        }

        public static BeginTransaction parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeginTransaction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new BeginTransaction();
                case 2:
                    return new dispatchForKind6rFNWt0(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (BeginTransaction.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(BeginTransactionRequest beginTransactionRequest) {
            beginTransactionRequest.getClass();
            BeginTransactionRequest beginTransactionRequest2 = this.request_;
            if (beginTransactionRequest2 == null || beginTransactionRequest2 == BeginTransactionRequest.getDefaultInstance()) {
                this.request_ = beginTransactionRequest;
            } else {
                scrollDxDyForNodeVisibleRE3cj74 scrolldxdyfornodevisiblere3cj74NewBuilder = BeginTransactionRequest.newBuilder(this.request_);
                scrolldxdyfornodevisiblere3cj74NewBuilder.read(beginTransactionRequest);
                this.request_ = (BeginTransactionRequest) scrolldxdyfornodevisiblere3cj74NewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(BeginTransactionResponse beginTransactionResponse) {
            beginTransactionResponse.getClass();
            BeginTransactionResponse beginTransactionResponse2 = this.response_;
            if (beginTransactionResponse2 == null || beginTransactionResponse2 == BeginTransactionResponse.getDefaultInstance()) {
                this.response_ = beginTransactionResponse;
            } else {
                resetEnabledAccessibilityServiceList resetenabledaccessibilityservicelistNewBuilder = BeginTransactionResponse.newBuilder(this.response_);
                resetenabledaccessibilityservicelistNewBuilder.read(beginTransactionResponse);
                this.response_ = (BeginTransactionResponse) resetenabledaccessibilityservicelistNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(BeginTransactionRequest beginTransactionRequest) {
            beginTransactionRequest.getClass();
            this.request_ = beginTransactionRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(BeginTransactionResponse beginTransactionResponse) {
            beginTransactionResponse.getClass();
            this.response_ = beginTransactionResponse;
            this.bitField0_ |= 2;
        }

        public BeginTransactionRequest getRequest() {
            BeginTransactionRequest beginTransactionRequest = this.request_;
            return beginTransactionRequest == null ? BeginTransactionRequest.getDefaultInstance() : beginTransactionRequest;
        }

        public BeginTransactionResponse getResponse() {
            BeginTransactionResponse beginTransactionResponse = this.response_;
            return beginTransactionResponse == null ? BeginTransactionResponse.getDefaultInstance() : beginTransactionResponse;
        }

        public static dispatchForKind6rFNWt0 newBuilder(BeginTransaction beginTransaction) {
            return (dispatchForKind6rFNWt0) DEFAULT_INSTANCE.createBuilder(beginTransaction);
        }

        public static BeginTransaction parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static BeginTransaction parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static BeginTransaction parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static BeginTransaction parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static BeginTransaction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BeginTransaction parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static BeginTransaction parseFrom(InputStream inputStream) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeginTransaction parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static BeginTransaction parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BeginTransaction parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (BeginTransaction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class Commit extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final Commit DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private CommitRequest request_;
        private CommitResponse response_;

        private Commit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static Commit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            Commit commit = new Commit();
            DEFAULT_INSTANCE = commit;
            GeneratedMessageLite.registerDefaultInstance(Commit.class, commit);
        }

        public static ancestors6rFNWt0default newBuilder() {
            return (ancestors6rFNWt0default) DEFAULT_INSTANCE.createBuilder();
        }

        public static Commit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Commit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Commit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Commit();
                case 2:
                    return new ancestors6rFNWt0default(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Commit.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(CommitRequest commitRequest) {
            commitRequest.getClass();
            CommitRequest commitRequest2 = this.request_;
            if (commitRequest2 == null || commitRequest2 == CommitRequest.getDefaultInstance()) {
                this.request_ = commitRequest;
            } else {
                semanticsChangeCheckerlambda0 semanticschangecheckerlambda0NewBuilder = CommitRequest.newBuilder(this.request_);
                semanticschangecheckerlambda0NewBuilder.read(commitRequest);
                this.request_ = (CommitRequest) semanticschangecheckerlambda0NewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(CommitResponse commitResponse) {
            commitResponse.getClass();
            CommitResponse commitResponse2 = this.response_;
            if (commitResponse2 == null || commitResponse2 == CommitResponse.getDefaultInstance()) {
                this.response_ = commitResponse;
            } else {
                sendPaneChangeEvents sendpanechangeeventsNewBuilder = CommitResponse.newBuilder(this.response_);
                sendpanechangeeventsNewBuilder.read(commitResponse);
                this.response_ = (CommitResponse) sendpanechangeeventsNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(CommitRequest commitRequest) {
            commitRequest.getClass();
            this.request_ = commitRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(CommitResponse commitResponse) {
            commitResponse.getClass();
            this.response_ = commitResponse;
            this.bitField0_ |= 2;
        }

        public CommitRequest getRequest() {
            CommitRequest commitRequest = this.request_;
            return commitRequest == null ? CommitRequest.getDefaultInstance() : commitRequest;
        }

        public CommitResponse getResponse() {
            CommitResponse commitResponse = this.response_;
            return commitResponse == null ? CommitResponse.getDefaultInstance() : commitResponse;
        }

        public static ancestors6rFNWt0default newBuilder(Commit commit) {
            return (ancestors6rFNWt0default) DEFAULT_INSTANCE.createBuilder(commit);
        }

        public static Commit parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Commit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Commit parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Commit parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Commit parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Commit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Commit parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Commit parseFrom(InputStream inputStream) throws IOException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Commit parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Commit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Commit parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Commit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class CreateDocument extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final CreateDocument DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private CreateDocumentRequest request_;
        private Document response_;

        private CreateDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static CreateDocument getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            CreateDocument createDocument = new CreateDocument();
            DEFAULT_INSTANCE = createDocument;
            GeneratedMessageLite.registerDefaultInstance(CreateDocument.class, createDocument);
        }

        public static dispatchOnScrollChangedUv8p0NA newBuilder() {
            return (dispatchOnScrollChangedUv8p0NA) DEFAULT_INSTANCE.createBuilder();
        }

        public static CreateDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new CreateDocument();
                case 2:
                    return new dispatchOnScrollChangedUv8p0NA(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (CreateDocument.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(CreateDocumentRequest createDocumentRequest) {
            createDocumentRequest.getClass();
            CreateDocumentRequest createDocumentRequest2 = this.request_;
            if (createDocumentRequest2 == null || createDocumentRequest2 == CreateDocumentRequest.getDefaultInstance()) {
                this.request_ = createDocumentRequest;
            } else {
                sendPendingTextTraversedAtGranularityEvent sendpendingtexttraversedatgranularityeventNewBuilder = CreateDocumentRequest.newBuilder(this.request_);
                sendpendingtexttraversedatgranularityeventNewBuilder.read(createDocumentRequest);
                this.request_ = (CreateDocumentRequest) sendpendingtexttraversedatgranularityeventNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(Document document) {
            document.getClass();
            Document document2 = this.response_;
            if (document2 == null || document2 == Document.getDefaultInstance()) {
                this.response_ = document;
            } else {
                setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder(this.response_);
                setcontentinvalidNewBuilder.read(document);
                this.response_ = (Document) setcontentinvalidNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(CreateDocumentRequest createDocumentRequest) {
            createDocumentRequest.getClass();
            this.request_ = createDocumentRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(Document document) {
            document.getClass();
            this.response_ = document;
            this.bitField0_ |= 2;
        }

        public CreateDocumentRequest getRequest() {
            CreateDocumentRequest createDocumentRequest = this.request_;
            return createDocumentRequest == null ? CreateDocumentRequest.getDefaultInstance() : createDocumentRequest;
        }

        public Document getResponse() {
            Document document = this.response_;
            return document == null ? Document.getDefaultInstance() : document;
        }

        public static dispatchOnScrollChangedUv8p0NA newBuilder(CreateDocument createDocument) {
            return (dispatchOnScrollChangedUv8p0NA) DEFAULT_INSTANCE.createBuilder(createDocument);
        }

        public static CreateDocument parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CreateDocument parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static CreateDocument parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static CreateDocument parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static CreateDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CreateDocument parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static CreateDocument parseFrom(InputStream inputStream) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CreateDocument parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CreateDocument parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CreateDocument parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CreateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class DeleteDocument extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final DeleteDocument DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private DeleteDocumentRequest request_;
        private Empty response_;

        private DeleteDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static DeleteDocument getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            DeleteDocument deleteDocument = new DeleteDocument();
            DEFAULT_INSTANCE = deleteDocument;
            GeneratedMessageLite.registerDefaultInstance(DeleteDocument.class, deleteDocument);
        }

        public static dispatchForKindYYKmho newBuilder() {
            return (dispatchForKindYYKmho) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeleteDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new DeleteDocument();
                case 2:
                    return new dispatchForKindYYKmho(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (DeleteDocument.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(DeleteDocumentRequest deleteDocumentRequest) {
            deleteDocumentRequest.getClass();
            DeleteDocumentRequest deleteDocumentRequest2 = this.request_;
            if (deleteDocumentRequest2 == null || deleteDocumentRequest2 == DeleteDocumentRequest.getDefaultInstance()) {
                this.request_ = deleteDocumentRequest;
            } else {
                toAndroidRectdefault toandroidrectdefaultNewBuilder = DeleteDocumentRequest.newBuilder(this.request_);
                toandroidrectdefaultNewBuilder.read(deleteDocumentRequest);
                this.request_ = (DeleteDocumentRequest) toandroidrectdefaultNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(Empty empty) {
            empty.getClass();
            Empty empty2 = this.response_;
            if (empty2 == null || empty2 == Empty.getDefaultInstance()) {
                this.response_ = empty;
            } else {
                getLocalFontFamilyResolver getlocalfontfamilyresolverNewBuilder = Empty.newBuilder(this.response_);
                getlocalfontfamilyresolverNewBuilder.read(empty);
                this.response_ = (Empty) getlocalfontfamilyresolverNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(DeleteDocumentRequest deleteDocumentRequest) {
            deleteDocumentRequest.getClass();
            this.request_ = deleteDocumentRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(Empty empty) {
            empty.getClass();
            this.response_ = empty;
            this.bitField0_ |= 2;
        }

        public DeleteDocumentRequest getRequest() {
            DeleteDocumentRequest deleteDocumentRequest = this.request_;
            return deleteDocumentRequest == null ? DeleteDocumentRequest.getDefaultInstance() : deleteDocumentRequest;
        }

        public Empty getResponse() {
            Empty empty = this.response_;
            return empty == null ? Empty.getDefaultInstance() : empty;
        }

        public static dispatchForKindYYKmho newBuilder(DeleteDocument deleteDocument) {
            return (dispatchForKindYYKmho) DEFAULT_INSTANCE.createBuilder(deleteDocument);
        }

        public static DeleteDocument parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static DeleteDocument parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static DeleteDocument parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static DeleteDocument parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static DeleteDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeleteDocument parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static DeleteDocument parseFrom(InputStream inputStream) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeleteDocument parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static DeleteDocument parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DeleteDocument parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DeleteDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class GetDocument extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final GetDocument DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private GetDocumentRequest request_;
        private Document response_;

        private GetDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static GetDocument getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            GetDocument getDocument = new GetDocument();
            DEFAULT_INSTANCE = getDocument;
            GeneratedMessageLite.registerDefaultInstance(GetDocument.class, getDocument);
        }

        public static invalidateSubtree newBuilder() {
            return (invalidateSubtree) DEFAULT_INSTANCE.createBuilder();
        }

        public static GetDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new GetDocument();
                case 2:
                    return new invalidateSubtree(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (GetDocument.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(GetDocumentRequest getDocumentRequest) {
            getDocumentRequest.getClass();
            GetDocumentRequest getDocumentRequest2 = this.request_;
            if (getDocumentRequest2 == null || getDocumentRequest2 == GetDocumentRequest.getDefaultInstance()) {
                this.request_ = getDocumentRequest;
            } else {
                setRequestFromAccessibilityToolForTestingui setrequestfromaccessibilitytoolfortestinguiNewBuilder = GetDocumentRequest.newBuilder(this.request_);
                setrequestfromaccessibilitytoolfortestinguiNewBuilder.read(getDocumentRequest);
                this.request_ = (GetDocumentRequest) setrequestfromaccessibilitytoolfortestinguiNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(Document document) {
            document.getClass();
            Document document2 = this.response_;
            if (document2 == null || document2 == Document.getDefaultInstance()) {
                this.response_ = document;
            } else {
                setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder(this.response_);
                setcontentinvalidNewBuilder.read(document);
                this.response_ = (Document) setcontentinvalidNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(GetDocumentRequest getDocumentRequest) {
            getDocumentRequest.getClass();
            this.request_ = getDocumentRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(Document document) {
            document.getClass();
            this.response_ = document;
            this.bitField0_ |= 2;
        }

        public GetDocumentRequest getRequest() {
            GetDocumentRequest getDocumentRequest = this.request_;
            return getDocumentRequest == null ? GetDocumentRequest.getDefaultInstance() : getDocumentRequest;
        }

        public Document getResponse() {
            Document document = this.response_;
            return document == null ? Document.getDefaultInstance() : document;
        }

        public static invalidateSubtree newBuilder(GetDocument getDocument) {
            return (invalidateSubtree) DEFAULT_INSTANCE.createBuilder(getDocument);
        }

        public static GetDocument parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static GetDocument parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static GetDocument parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static GetDocument parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static GetDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetDocument parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static GetDocument parseFrom(InputStream inputStream) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetDocument parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static GetDocument parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetDocument parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (GetDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class ListCollectionIds extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final ListCollectionIds DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private ListCollectionIdsRequest request_;
        private ListCollectionIdsResponse response_;

        private ListCollectionIds() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static ListCollectionIds getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            ListCollectionIds listCollectionIds = new ListCollectionIds();
            DEFAULT_INSTANCE = listCollectionIds;
            GeneratedMessageLite.registerDefaultInstance(ListCollectionIds.class, listCollectionIds);
        }

        public static findNearestBeyondBoundsLayoutAncestor newBuilder() {
            return (findNearestBeyondBoundsLayoutAncestor) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListCollectionIds parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCollectionIds parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new ListCollectionIds();
                case 2:
                    return new findNearestBeyondBoundsLayoutAncestor(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (ListCollectionIds.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(ListCollectionIdsRequest listCollectionIdsRequest) {
            listCollectionIdsRequest.getClass();
            ListCollectionIdsRequest listCollectionIdsRequest2 = this.request_;
            if (listCollectionIdsRequest2 == null || listCollectionIdsRequest2 == ListCollectionIdsRequest.getDefaultInstance()) {
                this.request_ = listCollectionIdsRequest;
            } else {
                setOnSendAccessibilityEventui setonsendaccessibilityeventuiNewBuilder = ListCollectionIdsRequest.newBuilder(this.request_);
                setonsendaccessibilityeventuiNewBuilder.read(listCollectionIdsRequest);
                this.request_ = (ListCollectionIdsRequest) setonsendaccessibilityeventuiNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(ListCollectionIdsResponse listCollectionIdsResponse) {
            listCollectionIdsResponse.getClass();
            ListCollectionIdsResponse listCollectionIdsResponse2 = this.response_;
            if (listCollectionIdsResponse2 == null || listCollectionIdsResponse2 == ListCollectionIdsResponse.getDefaultInstance()) {
                this.response_ = listCollectionIdsResponse;
            } else {
                addPageActions addpageactionsNewBuilder = ListCollectionIdsResponse.newBuilder(this.response_);
                addpageactionsNewBuilder.read(listCollectionIdsResponse);
                this.response_ = (ListCollectionIdsResponse) addpageactionsNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(ListCollectionIdsRequest listCollectionIdsRequest) {
            listCollectionIdsRequest.getClass();
            this.request_ = listCollectionIdsRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(ListCollectionIdsResponse listCollectionIdsResponse) {
            listCollectionIdsResponse.getClass();
            this.response_ = listCollectionIdsResponse;
            this.bitField0_ |= 2;
        }

        public ListCollectionIdsRequest getRequest() {
            ListCollectionIdsRequest listCollectionIdsRequest = this.request_;
            return listCollectionIdsRequest == null ? ListCollectionIdsRequest.getDefaultInstance() : listCollectionIdsRequest;
        }

        public ListCollectionIdsResponse getResponse() {
            ListCollectionIdsResponse listCollectionIdsResponse = this.response_;
            return listCollectionIdsResponse == null ? ListCollectionIdsResponse.getDefaultInstance() : listCollectionIdsResponse;
        }

        public static findNearestBeyondBoundsLayoutAncestor newBuilder(ListCollectionIds listCollectionIds) {
            return (findNearestBeyondBoundsLayoutAncestor) DEFAULT_INSTANCE.createBuilder(listCollectionIds);
        }

        public static ListCollectionIds parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListCollectionIds parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListCollectionIds parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static ListCollectionIds parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListCollectionIds parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListCollectionIds parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListCollectionIds parseFrom(InputStream inputStream) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListCollectionIds parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListCollectionIds parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListCollectionIds parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListCollectionIds) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class ListDocuments extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final ListDocuments DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private ListDocumentsRequest request_;
        private ListDocumentsResponse response_;

        private ListDocuments() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static ListDocuments getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            ListDocuments listDocuments = new ListDocuments();
            DEFAULT_INSTANCE = listDocuments;
            GeneratedMessageLite.registerDefaultInstance(ListDocuments.class, listDocuments);
        }

        public static has64DMado newBuilder() {
            return (has64DMado) DEFAULT_INSTANCE.createBuilder();
        }

        public static ListDocuments parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListDocuments parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new ListDocuments();
                case 2:
                    return new has64DMado(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (ListDocuments.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(ListDocumentsRequest listDocumentsRequest) {
            listDocumentsRequest.getClass();
            ListDocumentsRequest listDocumentsRequest2 = this.request_;
            if (listDocumentsRequest2 == null || listDocumentsRequest2 == ListDocumentsRequest.getDefaultInstance()) {
                this.request_ = listDocumentsRequest;
            } else {
                addSetProgressAction addsetprogressactionNewBuilder = ListDocumentsRequest.newBuilder(this.request_);
                addsetprogressactionNewBuilder.read(listDocumentsRequest);
                this.request_ = (ListDocumentsRequest) addsetprogressactionNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(ListDocumentsResponse listDocumentsResponse) {
            listDocumentsResponse.getClass();
            ListDocumentsResponse listDocumentsResponse2 = this.response_;
            if (listDocumentsResponse2 == null || listDocumentsResponse2 == ListDocumentsResponse.getDefaultInstance()) {
                this.response_ = listDocumentsResponse;
            } else {
                AndroidComposeViewAccessibilityDelegateCompatApi24Impl androidComposeViewAccessibilityDelegateCompatApi24ImplNewBuilder = ListDocumentsResponse.newBuilder(this.response_);
                androidComposeViewAccessibilityDelegateCompatApi24ImplNewBuilder.read(listDocumentsResponse);
                this.response_ = (ListDocumentsResponse) androidComposeViewAccessibilityDelegateCompatApi24ImplNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(ListDocumentsRequest listDocumentsRequest) {
            listDocumentsRequest.getClass();
            this.request_ = listDocumentsRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(ListDocumentsResponse listDocumentsResponse) {
            listDocumentsResponse.getClass();
            this.response_ = listDocumentsResponse;
            this.bitField0_ |= 2;
        }

        public ListDocumentsRequest getRequest() {
            ListDocumentsRequest listDocumentsRequest = this.request_;
            return listDocumentsRequest == null ? ListDocumentsRequest.getDefaultInstance() : listDocumentsRequest;
        }

        public ListDocumentsResponse getResponse() {
            ListDocumentsResponse listDocumentsResponse = this.response_;
            return listDocumentsResponse == null ? ListDocumentsResponse.getDefaultInstance() : listDocumentsResponse;
        }

        public static has64DMado newBuilder(ListDocuments listDocuments) {
            return (has64DMado) DEFAULT_INSTANCE.createBuilder(listDocuments);
        }

        public static ListDocuments parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListDocuments parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListDocuments parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static ListDocuments parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListDocuments parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ListDocuments parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListDocuments parseFrom(InputStream inputStream) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ListDocuments parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ListDocuments parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ListDocuments parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ListDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class Listen extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final Listen DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private ListenRequest request_;
        private ListenResponse response_;

        private Listen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static Listen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            Listen listen = new Listen();
            DEFAULT_INSTANCE = listen;
            GeneratedMessageLite.registerDefaultInstance(Listen.class, listen);
        }

        public static invalidateDrawForSubtree newBuilder() {
            return (invalidateDrawForSubtree) DEFAULT_INSTANCE.createBuilder();
        }

        public static Listen parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Listen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Listen parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Listen();
                case 2:
                    return new invalidateDrawForSubtree(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Listen.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(ListenRequest listenRequest) {
            listenRequest.getClass();
            ListenRequest listenRequest2 = this.request_;
            if (listenRequest2 == null || listenRequest2 == ListenRequest.getDefaultInstance()) {
                this.request_ = listenRequest;
            } else {
                addExtraDataToAccessibilityNodeInfo addextradatatoaccessibilitynodeinfoNewBuilder = ListenRequest.newBuilder(this.request_);
                addextradatatoaccessibilitynodeinfoNewBuilder.read(listenRequest);
                this.request_ = (ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(ListenResponse listenResponse) {
            listenResponse.getClass();
            ListenResponse listenResponse2 = this.response_;
            if (listenResponse2 == null || listenResponse2 == ListenResponse.getDefaultInstance()) {
                this.response_ = listenResponse;
            } else {
                AndroidComposeViewAccessibilityDelegateCompatCompanion androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder = ListenResponse.newBuilder(this.response_);
                androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder.read(listenResponse);
                this.response_ = (ListenResponse) androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(ListenRequest listenRequest) {
            listenRequest.getClass();
            this.request_ = listenRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(ListenResponse listenResponse) {
            listenResponse.getClass();
            this.response_ = listenResponse;
            this.bitField0_ |= 2;
        }

        public ListenRequest getRequest() {
            ListenRequest listenRequest = this.request_;
            return listenRequest == null ? ListenRequest.getDefaultInstance() : listenRequest;
        }

        public ListenResponse getResponse() {
            ListenResponse listenResponse = this.response_;
            return listenResponse == null ? ListenResponse.getDefaultInstance() : listenResponse;
        }

        public static invalidateDrawForSubtree newBuilder(Listen listen) {
            return (invalidateDrawForSubtree) DEFAULT_INSTANCE.createBuilder(listen);
        }

        public static Listen parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Listen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Listen parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Listen parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Listen parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Listen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Listen parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Listen parseFrom(InputStream inputStream) throws IOException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Listen parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Listen parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Listen parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Listen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class MatchingDocuments extends GeneratedMessageLite implements requireDensity {
        private static final MatchingDocuments DEFAULT_INSTANCE;
        public static final int LISTEN_RESPONSE_FIELD_NUMBER = 1;
        public static final int MATCHING_DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile component23 PARSER;
        private int bitField0_;
        private ListenResponse listenResponse_;
        private RunQueryResponse matchingDocuments_;

        private MatchingDocuments() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearListenResponse() {
            this.listenResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMatchingDocuments() {
            this.matchingDocuments_ = null;
            this.bitField0_ &= -3;
        }

        public static MatchingDocuments getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasListenResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMatchingDocuments() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            MatchingDocuments matchingDocuments = new MatchingDocuments();
            DEFAULT_INSTANCE = matchingDocuments;
            GeneratedMessageLite.registerDefaultInstance(MatchingDocuments.class, matchingDocuments);
        }

        public static invalidateMeasurementForSubtree newBuilder() {
            return (invalidateMeasurementForSubtree) DEFAULT_INSTANCE.createBuilder();
        }

        public static MatchingDocuments parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MatchingDocuments parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new MatchingDocuments();
                case 2:
                    return new invalidateMeasurementForSubtree(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "listenResponse_", "matchingDocuments_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (MatchingDocuments.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeListenResponse(ListenResponse listenResponse) {
            listenResponse.getClass();
            ListenResponse listenResponse2 = this.listenResponse_;
            if (listenResponse2 == null || listenResponse2 == ListenResponse.getDefaultInstance()) {
                this.listenResponse_ = listenResponse;
            } else {
                AndroidComposeViewAccessibilityDelegateCompatCompanion androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder = ListenResponse.newBuilder(this.listenResponse_);
                androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder.read(listenResponse);
                this.listenResponse_ = (ListenResponse) androidComposeViewAccessibilityDelegateCompatCompanionNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMatchingDocuments(RunQueryResponse runQueryResponse) {
            runQueryResponse.getClass();
            RunQueryResponse runQueryResponse2 = this.matchingDocuments_;
            if (runQueryResponse2 == null || runQueryResponse2 == RunQueryResponse.getDefaultInstance()) {
                this.matchingDocuments_ = runQueryResponse;
            } else {
                accessenabled accessenabledVarNewBuilder = RunQueryResponse.newBuilder(this.matchingDocuments_);
                accessenabledVarNewBuilder.read(runQueryResponse);
                this.matchingDocuments_ = (RunQueryResponse) accessenabledVarNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setListenResponse(ListenResponse listenResponse) {
            listenResponse.getClass();
            this.listenResponse_ = listenResponse;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMatchingDocuments(RunQueryResponse runQueryResponse) {
            runQueryResponse.getClass();
            this.matchingDocuments_ = runQueryResponse;
            this.bitField0_ |= 2;
        }

        public ListenResponse getListenResponse() {
            ListenResponse listenResponse = this.listenResponse_;
            return listenResponse == null ? ListenResponse.getDefaultInstance() : listenResponse;
        }

        public RunQueryResponse getMatchingDocuments() {
            RunQueryResponse runQueryResponse = this.matchingDocuments_;
            return runQueryResponse == null ? RunQueryResponse.getDefaultInstance() : runQueryResponse;
        }

        public static invalidateMeasurementForSubtree newBuilder(MatchingDocuments matchingDocuments) {
            return (invalidateMeasurementForSubtree) DEFAULT_INSTANCE.createBuilder(matchingDocuments);
        }

        public static MatchingDocuments parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static MatchingDocuments parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static MatchingDocuments parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static MatchingDocuments parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static MatchingDocuments parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MatchingDocuments parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static MatchingDocuments parseFrom(InputStream inputStream) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MatchingDocuments parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static MatchingDocuments parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MatchingDocuments parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (MatchingDocuments) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class RemoveListen extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final RemoveListen DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int TARGET_ID_FIELD_NUMBER = 1;
        private int targetId_;

        private RemoveListen() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetId() {
            this.targetId_ = 0;
        }

        public static RemoveListen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetId(int i) {
            this.targetId_ = i;
        }

        public int getTargetId() {
            return this.targetId_;
        }

        static {
            RemoveListen removeListen = new RemoveListen();
            DEFAULT_INSTANCE = removeListen;
            GeneratedMessageLite.registerDefaultInstance(RemoveListen.class, removeListen);
        }

        public static requireCoordinator64DMado newBuilder() {
            return (requireCoordinator64DMado) DEFAULT_INSTANCE.createBuilder();
        }

        public static RemoveListen parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveListen parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new RemoveListen();
                case 2:
                    return new requireCoordinator64DMado(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"targetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (RemoveListen.class) {
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

        public static requireCoordinator64DMado newBuilder(RemoveListen removeListen) {
            return (requireCoordinator64DMado) DEFAULT_INSTANCE.createBuilder(removeListen);
        }

        public static RemoveListen parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static RemoveListen parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static RemoveListen parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static RemoveListen parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static RemoveListen parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RemoveListen parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static RemoveListen parseFrom(InputStream inputStream) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RemoveListen parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static RemoveListen parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RemoveListen parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RemoveListen) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class Rollback extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final Rollback DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private RollbackRequest request_;
        private Empty response_;

        private Rollback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static Rollback getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            Rollback rollback = new Rollback();
            DEFAULT_INSTANCE = rollback;
            GeneratedMessageLite.registerDefaultInstance(Rollback.class, rollback);
        }

        public static nearestAncestor64DMado newBuilder() {
            return (nearestAncestor64DMado) DEFAULT_INSTANCE.createBuilder();
        }

        public static Rollback parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Rollback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rollback parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Rollback();
                case 2:
                    return new nearestAncestor64DMado(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Rollback.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(RollbackRequest rollbackRequest) {
            rollbackRequest.getClass();
            RollbackRequest rollbackRequest2 = this.request_;
            if (rollbackRequest2 == null || rollbackRequest2 == RollbackRequest.getDefaultInstance()) {
                this.request_ = rollbackRequest;
            } else {
                AndroidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeededLambda1 androidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeededLambda1NewBuilder = RollbackRequest.newBuilder(this.request_);
                androidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeededLambda1NewBuilder.read(rollbackRequest);
                this.request_ = (RollbackRequest) androidComposeViewAccessibilityDelegateCompatscheduleScrollEventIfNeededLambda1NewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(Empty empty) {
            empty.getClass();
            Empty empty2 = this.response_;
            if (empty2 == null || empty2 == Empty.getDefaultInstance()) {
                this.response_ = empty;
            } else {
                getLocalFontFamilyResolver getlocalfontfamilyresolverNewBuilder = Empty.newBuilder(this.response_);
                getlocalfontfamilyresolverNewBuilder.read(empty);
                this.response_ = (Empty) getlocalfontfamilyresolverNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(RollbackRequest rollbackRequest) {
            rollbackRequest.getClass();
            this.request_ = rollbackRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(Empty empty) {
            empty.getClass();
            this.response_ = empty;
            this.bitField0_ |= 2;
        }

        public RollbackRequest getRequest() {
            RollbackRequest rollbackRequest = this.request_;
            return rollbackRequest == null ? RollbackRequest.getDefaultInstance() : rollbackRequest;
        }

        public Empty getResponse() {
            Empty empty = this.response_;
            return empty == null ? Empty.getDefaultInstance() : empty;
        }

        public static nearestAncestor64DMado newBuilder(Rollback rollback) {
            return (nearestAncestor64DMado) DEFAULT_INSTANCE.createBuilder(rollback);
        }

        public static Rollback parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Rollback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Rollback parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Rollback parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Rollback parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Rollback parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Rollback parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Rollback parseFrom(InputStream inputStream) throws IOException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Rollback parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Rollback parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Rollback parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Rollback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class RunQuery extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final RunQuery DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private RunQueryRequest request_;
        private decodeString response_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        public static RunQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<RunQueryResponse> getResponseList() {
            return this.response_;
        }

        public List<? extends accessfindClosestParentNode> getResponseOrBuilderList() {
            return this.response_;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        static {
            RunQuery runQuery = new RunQuery();
            DEFAULT_INSTANCE = runQuery;
            GeneratedMessageLite.registerDefaultInstance(RunQuery.class, runQuery);
        }

        public static nearestAncestor newBuilder() {
            return (nearestAncestor) DEFAULT_INSTANCE.createBuilder();
        }

        public static RunQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RunQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new RunQuery();
                case 2:
                    return new nearestAncestor(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "request_", "response_", RunQueryResponse.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (RunQuery.class) {
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

        public RunQueryResponse getResponse(int i) {
            return (RunQueryResponse) this.response_.get(i);
        }

        public int getResponseCount() {
            return this.response_.size();
        }

        public accessfindClosestParentNode getResponseOrBuilder(int i) {
            return (accessfindClosestParentNode) this.response_.get(i);
        }

        private RunQuery() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllResponse(Iterable<? extends RunQueryResponse> iterable) {
            ensureResponseIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.response_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponse(RunQueryResponse runQueryResponse) {
            runQueryResponse.getClass();
            ensureResponseIsMutable();
            this.response_.add(runQueryResponse);
        }

        private void ensureResponseIsMutable() {
            decodeString decodestring = this.response_;
            if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                return;
            }
            this.response_ = GeneratedMessageLite.mutableCopy(decodestring);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(RunQueryRequest runQueryRequest) {
            runQueryRequest.getClass();
            RunQueryRequest runQueryRequest2 = this.request_;
            if (runQueryRequest2 == null || runQueryRequest2 == RunQueryRequest.getDefaultInstance()) {
                this.request_ = runQueryRequest;
            } else {
                accessaccessibilityEquals accessaccessibilityequalsNewBuilder = RunQueryRequest.newBuilder(this.request_);
                accessaccessibilityequalsNewBuilder.read(runQueryRequest);
                this.request_ = (RunQueryRequest) accessaccessibilityequalsNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeResponse(int i) {
            ensureResponseIsMutable();
            this.response_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(RunQueryRequest runQueryRequest) {
            runQueryRequest.getClass();
            this.request_ = runQueryRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(int i, RunQueryResponse runQueryResponse) {
            runQueryResponse.getClass();
            ensureResponseIsMutable();
            this.response_.set(i, runQueryResponse);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = GeneratedMessageLite.emptyProtobufList();
        }

        public RunQueryRequest getRequest() {
            RunQueryRequest runQueryRequest = this.request_;
            return runQueryRequest == null ? RunQueryRequest.getDefaultInstance() : runQueryRequest;
        }

        public static nearestAncestor newBuilder(RunQuery runQuery) {
            return (nearestAncestor) DEFAULT_INSTANCE.createBuilder(runQuery);
        }

        public static RunQuery parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static RunQuery parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static RunQuery parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static RunQuery parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addResponse(int i, RunQueryResponse runQueryResponse) {
            runQueryResponse.getClass();
            ensureResponseIsMutable();
            this.response_.add(i, runQueryResponse);
        }

        public static RunQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RunQuery parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static RunQuery parseFrom(InputStream inputStream) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RunQuery parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static RunQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RunQuery parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (RunQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class UpdateDocument extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final UpdateDocument DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private int bitField0_;
        private UpdateDocumentRequest request_;
        private Document response_;

        private UpdateDocument() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequest() {
            this.request_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearResponse() {
            this.response_ = null;
            this.bitField0_ &= -3;
        }

        public static UpdateDocument getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            UpdateDocument updateDocument = new UpdateDocument();
            DEFAULT_INSTANCE = updateDocument;
            GeneratedMessageLite.registerDefaultInstance(UpdateDocument.class, updateDocument);
        }

        public static isDelegationRoot newBuilder() {
            return (isDelegationRoot) DEFAULT_INSTANCE.createBuilder();
        }

        public static UpdateDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new UpdateDocument();
                case 2:
                    return new isDelegationRoot(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "request_", "response_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (UpdateDocument.class) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRequest(UpdateDocumentRequest updateDocumentRequest) {
            updateDocumentRequest.getClass();
            UpdateDocumentRequest updateDocumentRequest2 = this.request_;
            if (updateDocumentRequest2 == null || updateDocumentRequest2 == UpdateDocumentRequest.getDefaultInstance()) {
                this.request_ = updateDocumentRequest;
            } else {
                focusable focusableVarNewBuilder = UpdateDocumentRequest.newBuilder(this.request_);
                focusableVarNewBuilder.read(updateDocumentRequest);
                this.request_ = (UpdateDocumentRequest) focusableVarNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeResponse(Document document) {
            document.getClass();
            Document document2 = this.response_;
            if (document2 == null || document2 == Document.getDefaultInstance()) {
                this.response_ = document;
            } else {
                setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder(this.response_);
                setcontentinvalidNewBuilder.read(document);
                this.response_ = (Document) setcontentinvalidNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequest(UpdateDocumentRequest updateDocumentRequest) {
            updateDocumentRequest.getClass();
            this.request_ = updateDocumentRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponse(Document document) {
            document.getClass();
            this.response_ = document;
            this.bitField0_ |= 2;
        }

        public UpdateDocumentRequest getRequest() {
            UpdateDocumentRequest updateDocumentRequest = this.request_;
            return updateDocumentRequest == null ? UpdateDocumentRequest.getDefaultInstance() : updateDocumentRequest;
        }

        public Document getResponse() {
            Document document = this.response_;
            return document == null ? Document.getDefaultInstance() : document;
        }

        public static isDelegationRoot newBuilder(UpdateDocument updateDocument) {
            return (isDelegationRoot) DEFAULT_INSTANCE.createBuilder(updateDocument);
        }

        public static UpdateDocument parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static UpdateDocument parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static UpdateDocument parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static UpdateDocument parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static UpdateDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UpdateDocument parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static UpdateDocument parseFrom(InputStream inputStream) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UpdateDocument parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static UpdateDocument parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UpdateDocument parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UpdateDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabaseContentsBeforeAction() {
        this.databaseContentsBeforeAction_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static DatastoreTestTrace$FirestoreV1Action getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<MatchingDocuments> getMatchingDocumentsList() {
        return this.matchingDocuments_;
    }

    public List<? extends requireDensity> getMatchingDocumentsOrBuilderList() {
        return this.matchingDocuments_;
    }

    public boolean hasBatchGetDocuments() {
        return this.actionCase_ == 10;
    }

    public boolean hasBeginTransaction() {
        return this.actionCase_ == 6;
    }

    public boolean hasCommit() {
        return this.actionCase_ == 7;
    }

    public boolean hasCreateDocument() {
        return this.actionCase_ == 3;
    }

    public boolean hasDatabaseContentsBeforeAction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeleteDocument() {
        return this.actionCase_ == 5;
    }

    public boolean hasGetDocument() {
        return this.actionCase_ == 1;
    }

    public boolean hasListCollectionIds() {
        return this.actionCase_ == 9;
    }

    public boolean hasListDocuments() {
        return this.actionCase_ == 2;
    }

    public boolean hasListen() {
        return this.actionCase_ == 12;
    }

    public boolean hasRemoveListen() {
        return this.actionCase_ == 13;
    }

    public boolean hasRollback() {
        return this.actionCase_ == 8;
    }

    public boolean hasRunQuery() {
        return this.actionCase_ == 11;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUpdateDocument() {
        return this.actionCase_ == 4;
    }

    public enum write {
        GET_DOCUMENT(1),
        LIST_DOCUMENTS(2),
        CREATE_DOCUMENT(3),
        UPDATE_DOCUMENT(4),
        DELETE_DOCUMENT(5),
        BEGIN_TRANSACTION(6),
        COMMIT(7),
        ROLLBACK(8),
        LIST_COLLECTION_IDS(9),
        BATCH_GET_DOCUMENTS(10),
        RUN_QUERY(11),
        LISTEN(12),
        REMOVE_LISTEN(13),
        ACTION_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        write(int i) {
            this.value = i;
        }

        public static write forNumber(int i) {
            switch (i) {
                case 0:
                    return ACTION_NOT_SET;
                case 1:
                    return GET_DOCUMENT;
                case 2:
                    return LIST_DOCUMENTS;
                case 3:
                    return CREATE_DOCUMENT;
                case 4:
                    return UPDATE_DOCUMENT;
                case 5:
                    return DELETE_DOCUMENT;
                case 6:
                    return BEGIN_TRANSACTION;
                case 7:
                    return COMMIT;
                case 8:
                    return ROLLBACK;
                case 9:
                    return LIST_COLLECTION_IDS;
                case 10:
                    return BATCH_GET_DOCUMENTS;
                case 11:
                    return RUN_QUERY;
                case 12:
                    return LISTEN;
                case 13:
                    return REMOVE_LISTEN;
                default:
                    return null;
            }
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        DatastoreTestTrace$FirestoreV1Action datastoreTestTrace$FirestoreV1Action = new DatastoreTestTrace$FirestoreV1Action();
        DEFAULT_INSTANCE = datastoreTestTrace$FirestoreV1Action;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$FirestoreV1Action.class, datastoreTestTrace$FirestoreV1Action);
    }

    public static asLayoutModifierNode newBuilder() {
        return (asLayoutModifierNode) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$FirestoreV1Action parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$FirestoreV1Action();
            case 2:
                return new asLayoutModifierNode(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0001\u0001Ë\u0010\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000Éဉ\u0000Êဉ\u0001Ë\u001b", new Object[]{"action_", "actionCase_", "bitField0_", GetDocument.class, ListDocuments.class, CreateDocument.class, UpdateDocument.class, DeleteDocument.class, BeginTransaction.class, Commit.class, Rollback.class, ListCollectionIds.class, BatchGetDocuments.class, RunQuery.class, Listen.class, RemoveListen.class, "status_", "databaseContentsBeforeAction_", "matchingDocuments_", MatchingDocuments.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$FirestoreV1Action.class) {
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

    public write getActionCase() {
        return write.forNumber(this.actionCase_);
    }

    public MatchingDocuments getMatchingDocuments(int i) {
        return (MatchingDocuments) this.matchingDocuments_.get(i);
    }

    public int getMatchingDocumentsCount() {
        return this.matchingDocuments_.size();
    }

    public requireDensity getMatchingDocumentsOrBuilder(int i) {
        return (requireDensity) this.matchingDocuments_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMatchingDocuments(Iterable<? extends MatchingDocuments> iterable) {
        ensureMatchingDocumentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.matchingDocuments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMatchingDocuments(MatchingDocuments matchingDocuments) {
        matchingDocuments.getClass();
        ensureMatchingDocumentsIsMutable();
        this.matchingDocuments_.add(matchingDocuments);
    }

    private void ensureMatchingDocumentsIsMutable() {
        decodeString decodestring = this.matchingDocuments_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.matchingDocuments_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBatchGetDocuments(BatchGetDocuments batchGetDocuments) {
        batchGetDocuments.getClass();
        if (this.actionCase_ != 10 || this.action_ == BatchGetDocuments.getDefaultInstance()) {
            this.action_ = batchGetDocuments;
        } else {
            ancestors6rFNWt0 ancestors6rfnwt0NewBuilder = BatchGetDocuments.newBuilder((BatchGetDocuments) this.action_);
            ancestors6rfnwt0NewBuilder.read(batchGetDocuments);
            this.action_ = ancestors6rfnwt0NewBuilder.read();
        }
        this.actionCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBeginTransaction(BeginTransaction beginTransaction) {
        beginTransaction.getClass();
        if (this.actionCase_ != 6 || this.action_ == BeginTransaction.getDefaultInstance()) {
            this.action_ = beginTransaction;
        } else {
            dispatchForKind6rFNWt0 dispatchforkind6rfnwt0NewBuilder = BeginTransaction.newBuilder((BeginTransaction) this.action_);
            dispatchforkind6rfnwt0NewBuilder.read(beginTransaction);
            this.action_ = dispatchforkind6rfnwt0NewBuilder.read();
        }
        this.actionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCommit(Commit commit) {
        commit.getClass();
        if (this.actionCase_ != 7 || this.action_ == Commit.getDefaultInstance()) {
            this.action_ = commit;
        } else {
            ancestors6rFNWt0default ancestors6rfnwt0defaultNewBuilder = Commit.newBuilder((Commit) this.action_);
            ancestors6rfnwt0defaultNewBuilder.read(commit);
            this.action_ = ancestors6rfnwt0defaultNewBuilder.read();
        }
        this.actionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateDocument(CreateDocument createDocument) {
        createDocument.getClass();
        if (this.actionCase_ != 3 || this.action_ == CreateDocument.getDefaultInstance()) {
            this.action_ = createDocument;
        } else {
            dispatchOnScrollChangedUv8p0NA dispatchonscrollchangeduv8p0naNewBuilder = CreateDocument.newBuilder((CreateDocument) this.action_);
            dispatchonscrollchangeduv8p0naNewBuilder.read(createDocument);
            this.action_ = dispatchonscrollchangeduv8p0naNewBuilder.read();
        }
        this.actionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDatabaseContentsBeforeAction(RunQuery runQuery) {
        runQuery.getClass();
        RunQuery runQuery2 = this.databaseContentsBeforeAction_;
        if (runQuery2 == null || runQuery2 == RunQuery.getDefaultInstance()) {
            this.databaseContentsBeforeAction_ = runQuery;
        } else {
            nearestAncestor nearestancestorNewBuilder = RunQuery.newBuilder(this.databaseContentsBeforeAction_);
            nearestancestorNewBuilder.read(runQuery);
            this.databaseContentsBeforeAction_ = (RunQuery) nearestancestorNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteDocument(DeleteDocument deleteDocument) {
        deleteDocument.getClass();
        if (this.actionCase_ != 5 || this.action_ == DeleteDocument.getDefaultInstance()) {
            this.action_ = deleteDocument;
        } else {
            dispatchForKindYYKmho dispatchforkindyykmhoNewBuilder = DeleteDocument.newBuilder((DeleteDocument) this.action_);
            dispatchforkindyykmhoNewBuilder.read(deleteDocument);
            this.action_ = dispatchforkindyykmhoNewBuilder.read();
        }
        this.actionCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGetDocument(GetDocument getDocument) {
        getDocument.getClass();
        if (this.actionCase_ != 1 || this.action_ == GetDocument.getDefaultInstance()) {
            this.action_ = getDocument;
        } else {
            invalidateSubtree invalidatesubtreeNewBuilder = GetDocument.newBuilder((GetDocument) this.action_);
            invalidatesubtreeNewBuilder.read(getDocument);
            this.action_ = invalidatesubtreeNewBuilder.read();
        }
        this.actionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListCollectionIds(ListCollectionIds listCollectionIds) {
        listCollectionIds.getClass();
        if (this.actionCase_ != 9 || this.action_ == ListCollectionIds.getDefaultInstance()) {
            this.action_ = listCollectionIds;
        } else {
            findNearestBeyondBoundsLayoutAncestor findnearestbeyondboundslayoutancestorNewBuilder = ListCollectionIds.newBuilder((ListCollectionIds) this.action_);
            findnearestbeyondboundslayoutancestorNewBuilder.read(listCollectionIds);
            this.action_ = findnearestbeyondboundslayoutancestorNewBuilder.read();
        }
        this.actionCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListDocuments(ListDocuments listDocuments) {
        listDocuments.getClass();
        if (this.actionCase_ != 2 || this.action_ == ListDocuments.getDefaultInstance()) {
            this.action_ = listDocuments;
        } else {
            has64DMado has64dmadoNewBuilder = ListDocuments.newBuilder((ListDocuments) this.action_);
            has64dmadoNewBuilder.read(listDocuments);
            this.action_ = has64dmadoNewBuilder.read();
        }
        this.actionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListen(Listen listen) {
        listen.getClass();
        if (this.actionCase_ != 12 || this.action_ == Listen.getDefaultInstance()) {
            this.action_ = listen;
        } else {
            invalidateDrawForSubtree invalidatedrawforsubtreeNewBuilder = Listen.newBuilder((Listen) this.action_);
            invalidatedrawforsubtreeNewBuilder.read(listen);
            this.action_ = invalidatedrawforsubtreeNewBuilder.read();
        }
        this.actionCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveListen(RemoveListen removeListen) {
        removeListen.getClass();
        if (this.actionCase_ != 13 || this.action_ == RemoveListen.getDefaultInstance()) {
            this.action_ = removeListen;
        } else {
            requireCoordinator64DMado requirecoordinator64dmadoNewBuilder = RemoveListen.newBuilder((RemoveListen) this.action_);
            requirecoordinator64dmadoNewBuilder.read(removeListen);
            this.action_ = requirecoordinator64dmadoNewBuilder.read();
        }
        this.actionCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRollback(Rollback rollback) {
        rollback.getClass();
        if (this.actionCase_ != 8 || this.action_ == Rollback.getDefaultInstance()) {
            this.action_ = rollback;
        } else {
            nearestAncestor64DMado nearestancestor64dmadoNewBuilder = Rollback.newBuilder((Rollback) this.action_);
            nearestancestor64dmadoNewBuilder.read(rollback);
            this.action_ = nearestancestor64dmadoNewBuilder.read();
        }
        this.actionCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRunQuery(RunQuery runQuery) {
        runQuery.getClass();
        if (this.actionCase_ != 11 || this.action_ == RunQuery.getDefaultInstance()) {
            this.action_ = runQuery;
        } else {
            nearestAncestor nearestancestorNewBuilder = RunQuery.newBuilder((RunQuery) this.action_);
            nearestancestorNewBuilder.read(runQuery);
            this.action_ = nearestancestorNewBuilder.read();
        }
        this.actionCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto) {
        datastoreTestTrace$StatusProto.getClass();
        DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto2 = this.status_;
        if (datastoreTestTrace$StatusProto2 == null || datastoreTestTrace$StatusProto2 == DatastoreTestTrace$StatusProto.getDefaultInstance()) {
            this.status_ = datastoreTestTrace$StatusProto;
        } else {
            requireLayoutNode requirelayoutnodeNewBuilder = DatastoreTestTrace$StatusProto.newBuilder(this.status_);
            requirelayoutnodeNewBuilder.read(datastoreTestTrace$StatusProto);
            this.status_ = (DatastoreTestTrace$StatusProto) requirelayoutnodeNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateDocument(UpdateDocument updateDocument) {
        updateDocument.getClass();
        if (this.actionCase_ != 4 || this.action_ == UpdateDocument.getDefaultInstance()) {
            this.action_ = updateDocument;
        } else {
            isDelegationRoot isdelegationrootNewBuilder = UpdateDocument.newBuilder((UpdateDocument) this.action_);
            isdelegationrootNewBuilder.read(updateDocument);
            this.action_ = isdelegationrootNewBuilder.read();
        }
        this.actionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMatchingDocuments(int i) {
        ensureMatchingDocumentsIsMutable();
        this.matchingDocuments_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchGetDocuments(BatchGetDocuments batchGetDocuments) {
        batchGetDocuments.getClass();
        this.action_ = batchGetDocuments;
        this.actionCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginTransaction(BeginTransaction beginTransaction) {
        beginTransaction.getClass();
        this.action_ = beginTransaction;
        this.actionCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommit(Commit commit) {
        commit.getClass();
        this.action_ = commit;
        this.actionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateDocument(CreateDocument createDocument) {
        createDocument.getClass();
        this.action_ = createDocument;
        this.actionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseContentsBeforeAction(RunQuery runQuery) {
        runQuery.getClass();
        this.databaseContentsBeforeAction_ = runQuery;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteDocument(DeleteDocument deleteDocument) {
        deleteDocument.getClass();
        this.action_ = deleteDocument;
        this.actionCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetDocument(GetDocument getDocument) {
        getDocument.getClass();
        this.action_ = getDocument;
        this.actionCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListCollectionIds(ListCollectionIds listCollectionIds) {
        listCollectionIds.getClass();
        this.action_ = listCollectionIds;
        this.actionCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListDocuments(ListDocuments listDocuments) {
        listDocuments.getClass();
        this.action_ = listDocuments;
        this.actionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListen(Listen listen) {
        listen.getClass();
        this.action_ = listen;
        this.actionCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchingDocuments(int i, MatchingDocuments matchingDocuments) {
        matchingDocuments.getClass();
        ensureMatchingDocumentsIsMutable();
        this.matchingDocuments_.set(i, matchingDocuments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveListen(RemoveListen removeListen) {
        removeListen.getClass();
        this.action_ = removeListen;
        this.actionCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRollback(Rollback rollback) {
        rollback.getClass();
        this.action_ = rollback;
        this.actionCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunQuery(RunQuery runQuery) {
        runQuery.getClass();
        this.action_ = runQuery;
        this.actionCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto) {
        datastoreTestTrace$StatusProto.getClass();
        this.status_ = datastoreTestTrace$StatusProto;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateDocument(UpdateDocument updateDocument) {
        updateDocument.getClass();
        this.action_ = updateDocument;
        this.actionCase_ = 4;
    }

    private DatastoreTestTrace$FirestoreV1Action() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchingDocuments() {
        this.matchingDocuments_ = GeneratedMessageLite.emptyProtobufList();
    }

    public RunQuery getDatabaseContentsBeforeAction() {
        RunQuery runQuery = this.databaseContentsBeforeAction_;
        return runQuery == null ? RunQuery.getDefaultInstance() : runQuery;
    }

    public DatastoreTestTrace$StatusProto getStatus() {
        DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto = this.status_;
        return datastoreTestTrace$StatusProto == null ? DatastoreTestTrace$StatusProto.getDefaultInstance() : datastoreTestTrace$StatusProto;
    }

    public BeginTransaction getBeginTransaction() {
        return this.actionCase_ == 6 ? (BeginTransaction) this.action_ : BeginTransaction.getDefaultInstance();
    }

    public Commit getCommit() {
        return this.actionCase_ == 7 ? (Commit) this.action_ : Commit.getDefaultInstance();
    }

    public CreateDocument getCreateDocument() {
        return this.actionCase_ == 3 ? (CreateDocument) this.action_ : CreateDocument.getDefaultInstance();
    }

    public DeleteDocument getDeleteDocument() {
        return this.actionCase_ == 5 ? (DeleteDocument) this.action_ : DeleteDocument.getDefaultInstance();
    }

    public GetDocument getGetDocument() {
        return this.actionCase_ == 1 ? (GetDocument) this.action_ : GetDocument.getDefaultInstance();
    }

    public ListDocuments getListDocuments() {
        return this.actionCase_ == 2 ? (ListDocuments) this.action_ : ListDocuments.getDefaultInstance();
    }

    public UpdateDocument getUpdateDocument() {
        return this.actionCase_ == 4 ? (UpdateDocument) this.action_ : UpdateDocument.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginTransaction() {
        if (this.actionCase_ == 6) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommit() {
        if (this.actionCase_ == 7) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateDocument() {
        if (this.actionCase_ == 3) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteDocument() {
        if (this.actionCase_ == 5) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetDocument() {
        if (this.actionCase_ == 1) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListDocuments() {
        if (this.actionCase_ == 2) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateDocument() {
        if (this.actionCase_ == 4) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public BatchGetDocuments getBatchGetDocuments() {
        return this.actionCase_ == 10 ? (BatchGetDocuments) this.action_ : BatchGetDocuments.getDefaultInstance();
    }

    public ListCollectionIds getListCollectionIds() {
        return this.actionCase_ == 9 ? (ListCollectionIds) this.action_ : ListCollectionIds.getDefaultInstance();
    }

    public Listen getListen() {
        return this.actionCase_ == 12 ? (Listen) this.action_ : Listen.getDefaultInstance();
    }

    public RemoveListen getRemoveListen() {
        return this.actionCase_ == 13 ? (RemoveListen) this.action_ : RemoveListen.getDefaultInstance();
    }

    public Rollback getRollback() {
        return this.actionCase_ == 8 ? (Rollback) this.action_ : Rollback.getDefaultInstance();
    }

    public RunQuery getRunQuery() {
        return this.actionCase_ == 11 ? (RunQuery) this.action_ : RunQuery.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchGetDocuments() {
        if (this.actionCase_ == 10) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListCollectionIds() {
        if (this.actionCase_ == 9) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListen() {
        if (this.actionCase_ == 12) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveListen() {
        if (this.actionCase_ == 13) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRollback() {
        if (this.actionCase_ == 8) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunQuery() {
        if (this.actionCase_ == 11) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static asLayoutModifierNode newBuilder(DatastoreTestTrace$FirestoreV1Action datastoreTestTrace$FirestoreV1Action) {
        return (asLayoutModifierNode) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$FirestoreV1Action);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMatchingDocuments(int i, MatchingDocuments matchingDocuments) {
        matchingDocuments.getClass();
        ensureMatchingDocumentsIsMutable();
        this.matchingDocuments_.add(i, matchingDocuments);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$FirestoreV1Action parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$FirestoreV1Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
