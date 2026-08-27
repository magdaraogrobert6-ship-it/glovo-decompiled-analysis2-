package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewStartDragAndDropN;
import o.AndroidComposeViewTranslationCallback;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.CompositionLocalsKtLocalUriHandler1;
import o.IconCompatParcelizer;
import o.accesssetTraversalValues;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getDisableContentCapture;
import o.getLocalProvidableScrollCaptureInProgress;
import o.onHideTranslation;
import o.onShowTranslation;
import o.startDragAndDrop;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class Target extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile component23 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private Int32Value expectedCount_;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    public static final class DocumentsTarget extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final DocumentsTarget DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile component23 PARSER;
        private decodeString documents_ = GeneratedMessageLite.emptyProtobufList();

        public static DocumentsTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<String> getDocumentsList() {
            return this.documents_;
        }

        static {
            DocumentsTarget documentsTarget = new DocumentsTarget();
            DEFAULT_INSTANCE = documentsTarget;
            GeneratedMessageLite.registerDefaultInstance(DocumentsTarget.class, documentsTarget);
        }

        public static onHideTranslation newBuilder() {
            return (onHideTranslation) DEFAULT_INSTANCE.createBuilder();
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (startDragAndDrop.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new DocumentsTarget();
                case 2:
                    return new onHideTranslation(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (DocumentsTarget.class) {
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

        public String getDocuments(int i) {
            return (String) this.documents_.get(i);
        }

        public getClipMetadata getDocumentsBytes(int i) {
            return getClipMetadata.RemoteActionCompatParcelizer((String) this.documents_.get(i));
        }

        public int getDocumentsCount() {
            return this.documents_.size();
        }

        private DocumentsTarget() {
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
        public void setDocuments(int i, String str) {
            str.getClass();
            ensureDocumentsIsMutable();
            this.documents_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDocuments() {
            this.documents_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static onHideTranslation newBuilder(DocumentsTarget documentsTarget) {
            return (onHideTranslation) DEFAULT_INSTANCE.createBuilder(documentsTarget);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static DocumentsTarget parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static DocumentsTarget parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static DocumentsTarget parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static DocumentsTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DocumentsTarget parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (DocumentsTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class PipelineQueryTarget extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final PipelineQueryTarget DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int STRUCTURED_PIPELINE_FIELD_NUMBER = 1;
        private int pipelineTypeCase_ = 0;
        private Object pipelineType_;

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPipelineType() {
            this.pipelineTypeCase_ = 0;
            this.pipelineType_ = null;
        }

        public static PipelineQueryTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasStructuredPipeline() {
            return this.pipelineTypeCase_ == 1;
        }

        public enum read {
            STRUCTURED_PIPELINE(1),
            PIPELINETYPE_NOT_SET(0);

            private final int value;

            public int getNumber() {
                return this.value;
            }

            read(int i) {
                this.value = i;
            }

            public static read forNumber(int i) {
                if (i == 0) {
                    return PIPELINETYPE_NOT_SET;
                }
                if (i != 1) {
                    return null;
                }
                return STRUCTURED_PIPELINE;
            }

            @Deprecated
            public static read valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            PipelineQueryTarget pipelineQueryTarget = new PipelineQueryTarget();
            DEFAULT_INSTANCE = pipelineQueryTarget;
            GeneratedMessageLite.registerDefaultInstance(PipelineQueryTarget.class, pipelineQueryTarget);
        }

        public static AndroidComposeViewTranslationCallback newBuilder() {
            return (AndroidComposeViewTranslationCallback) DEFAULT_INSTANCE.createBuilder();
        }

        public static PipelineQueryTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PipelineQueryTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (startDragAndDrop.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new PipelineQueryTarget();
                case 2:
                    return new AndroidComposeViewTranslationCallback(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"pipelineType_", "pipelineTypeCase_", StructuredPipeline.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (PipelineQueryTarget.class) {
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

        public read getPipelineTypeCase() {
            return read.forNumber(this.pipelineTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStructuredPipeline(StructuredPipeline structuredPipeline) {
            structuredPipeline.getClass();
            if (this.pipelineTypeCase_ != 1 || this.pipelineType_ == StructuredPipeline.getDefaultInstance()) {
                this.pipelineType_ = structuredPipeline;
            } else {
                accesssetTraversalValues accesssettraversalvaluesNewBuilder = StructuredPipeline.newBuilder((StructuredPipeline) this.pipelineType_);
                accesssettraversalvaluesNewBuilder.read(structuredPipeline);
                this.pipelineType_ = accesssettraversalvaluesNewBuilder.read();
            }
            this.pipelineTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStructuredPipeline(StructuredPipeline structuredPipeline) {
            structuredPipeline.getClass();
            this.pipelineType_ = structuredPipeline;
            this.pipelineTypeCase_ = 1;
        }

        private PipelineQueryTarget() {
        }

        public StructuredPipeline getStructuredPipeline() {
            return this.pipelineTypeCase_ == 1 ? (StructuredPipeline) this.pipelineType_ : StructuredPipeline.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredPipeline() {
            if (this.pipelineTypeCase_ == 1) {
                this.pipelineTypeCase_ = 0;
                this.pipelineType_ = null;
            }
        }

        public static AndroidComposeViewTranslationCallback newBuilder(PipelineQueryTarget pipelineQueryTarget) {
            return (AndroidComposeViewTranslationCallback) DEFAULT_INSTANCE.createBuilder(pipelineQueryTarget);
        }

        public static PipelineQueryTarget parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static PipelineQueryTarget parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static PipelineQueryTarget parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static PipelineQueryTarget parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static PipelineQueryTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PipelineQueryTarget parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static PipelineQueryTarget parseFrom(InputStream inputStream) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PipelineQueryTarget parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static PipelineQueryTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PipelineQueryTarget parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (PipelineQueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class QueryTarget extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final QueryTarget DEFAULT_INSTANCE;
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile component23 PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQueryType() {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }

        public static QueryTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public String getParent() {
            return this.parent_;
        }

        public boolean hasStructuredQuery() {
            return this.queryTypeCase_ == 2;
        }

        /* JADX INFO: loaded from: classes4.dex */
        public enum write {
            STRUCTURED_QUERY(2),
            QUERYTYPE_NOT_SET(0);

            private final int value;

            public int getNumber() {
                return this.value;
            }

            write(int i) {
                this.value = i;
            }

            public static write forNumber(int i) {
                if (i == 0) {
                    return QUERYTYPE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return STRUCTURED_QUERY;
            }

            @Deprecated
            public static write valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            QueryTarget queryTarget = new QueryTarget();
            DEFAULT_INSTANCE = queryTarget;
            GeneratedMessageLite.registerDefaultInstance(QueryTarget.class, queryTarget);
        }

        public static onShowTranslation newBuilder() {
            return (onShowTranslation) DEFAULT_INSTANCE.createBuilder();
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (startDragAndDrop.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new QueryTarget();
                case 2:
                    return new onShowTranslation(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (QueryTarget.class) {
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

        public getClipMetadata getParentBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.parent_);
        }

        public write getQueryTypeCase() {
            return write.forNumber(this.queryTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStructuredQuery(StructuredQuery structuredQuery) {
            structuredQuery.getClass();
            if (this.queryTypeCase_ != 2 || this.queryType_ == StructuredQuery.getDefaultInstance()) {
                this.queryType_ = structuredQuery;
            } else {
                getDisableContentCapture getdisablecontentcaptureNewBuilder = StructuredQuery.newBuilder((StructuredQuery) this.queryType_);
                getdisablecontentcaptureNewBuilder.read(structuredQuery);
                this.queryType_ = getdisablecontentcaptureNewBuilder.read();
            }
            this.queryTypeCase_ = 2;
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
        public void setStructuredQuery(StructuredQuery structuredQuery) {
            structuredQuery.getClass();
            this.queryType_ = structuredQuery;
            this.queryTypeCase_ = 2;
        }

        private QueryTarget() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParent() {
            this.parent_ = getDefaultInstance().getParent();
        }

        public StructuredQuery getStructuredQuery() {
            return this.queryTypeCase_ == 2 ? (StructuredQuery) this.queryType_ : StructuredQuery.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStructuredQuery() {
            if (this.queryTypeCase_ == 2) {
                this.queryTypeCase_ = 0;
                this.queryType_ = null;
            }
        }

        public static onShowTranslation newBuilder(QueryTarget queryTarget) {
            return (onShowTranslation) DEFAULT_INSTANCE.createBuilder(queryTarget);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static QueryTarget parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static QueryTarget parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static QueryTarget parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static QueryTarget parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static QueryTarget parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static QueryTarget parseFrom(InputStream inputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static QueryTarget parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (QueryTarget) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpectedCount() {
        this.expectedCount_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnce() {
        this.once_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeType() {
        this.resumeTypeCase_ = 0;
        this.resumeType_ = null;
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
    public void setOnce(boolean z) {
        this.once_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    public boolean getOnce() {
        return this.once_;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public boolean hasDocuments() {
        return this.targetTypeCase_ == 3;
    }

    public boolean hasExpectedCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPipelineQuery() {
        return this.targetTypeCase_ == 13;
    }

    public boolean hasQuery() {
        return this.targetTypeCase_ == 2;
    }

    public boolean hasReadTime() {
        return this.resumeTypeCase_ == 11;
    }

    public boolean hasResumeToken() {
        return this.resumeTypeCase_ == 4;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum RemoteActionCompatParcelizer {
        QUERY(2),
        DOCUMENTS(3),
        PIPELINE_QUERY(13),
        TARGETTYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        RemoteActionCompatParcelizer(int i) {
            this.value = i;
        }

        @Deprecated
        public static RemoteActionCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static RemoteActionCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i == 13) {
                return PIPELINE_QUERY;
            }
            if (i == 2) {
                return QUERY;
            }
            if (i != 3) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum read {
        RESUME_TOKEN(4),
        READ_TIME(11),
        RESUMETYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        read(int i) {
            this.value = i;
        }

        @Deprecated
        public static read valueOf(int i) {
            return forNumber(i);
        }

        public static read forNumber(int i) {
            if (i == 0) {
                return RESUMETYPE_NOT_SET;
            }
            if (i == 4) {
                return RESUME_TOKEN;
            }
            if (i != 11) {
                return null;
            }
            return READ_TIME;
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        GeneratedMessageLite.registerDefaultInstance(Target.class, target);
    }

    public static AndroidComposeViewStartDragAndDropN newBuilder() {
        return (AndroidComposeViewStartDragAndDropN) DEFAULT_INSTANCE.createBuilder();
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
        switch (startDragAndDrop.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Target();
            case 2:
                return new AndroidComposeViewStartDragAndDropN(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0002\u0001\u0002\r\b\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001\fဉ\u0000\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", QueryTarget.class, DocumentsTarget.class, "targetId_", "once_", Timestamp.class, "expectedCount_", PipelineQueryTarget.class});
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

    public read getResumeTypeCase() {
        return read.forNumber(this.resumeTypeCase_);
    }

    public RemoteActionCompatParcelizer getTargetTypeCase() {
        return RemoteActionCompatParcelizer.forNumber(this.targetTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        if (this.targetTypeCase_ != 3 || this.targetType_ == DocumentsTarget.getDefaultInstance()) {
            this.targetType_ = documentsTarget;
        } else {
            onHideTranslation onhidetranslationNewBuilder = DocumentsTarget.newBuilder((DocumentsTarget) this.targetType_);
            onhidetranslationNewBuilder.read(documentsTarget);
            this.targetType_ = onhidetranslationNewBuilder.read();
        }
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpectedCount(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.expectedCount_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.expectedCount_ = int32Value;
        } else {
            CompositionLocalsKtLocalUriHandler1 compositionLocalsKtLocalUriHandler1NewBuilder = Int32Value.newBuilder(this.expectedCount_);
            compositionLocalsKtLocalUriHandler1NewBuilder.read(int32Value);
            this.expectedCount_ = (Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePipelineQuery(PipelineQueryTarget pipelineQueryTarget) {
        pipelineQueryTarget.getClass();
        if (this.targetTypeCase_ != 13 || this.targetType_ == PipelineQueryTarget.getDefaultInstance()) {
            this.targetType_ = pipelineQueryTarget;
        } else {
            AndroidComposeViewTranslationCallback androidComposeViewTranslationCallbackNewBuilder = PipelineQueryTarget.newBuilder((PipelineQueryTarget) this.targetType_);
            androidComposeViewTranslationCallbackNewBuilder.read(pipelineQueryTarget);
            this.targetType_ = androidComposeViewTranslationCallbackNewBuilder.read();
        }
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        if (this.targetTypeCase_ != 2 || this.targetType_ == QueryTarget.getDefaultInstance()) {
            this.targetType_ = queryTarget;
        } else {
            onShowTranslation onshowtranslationNewBuilder = QueryTarget.newBuilder((QueryTarget) this.targetType_);
            onshowtranslationNewBuilder.read(queryTarget);
            this.targetType_ = onshowtranslationNewBuilder.read();
        }
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        if (this.resumeTypeCase_ != 11 || this.resumeType_ == Timestamp.getDefaultInstance()) {
            this.resumeType_ = timestamp;
        } else {
            this.resumeType_ = IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.resumeType_, timestamp);
        }
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(DocumentsTarget documentsTarget) {
        documentsTarget.getClass();
        this.targetType_ = documentsTarget;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpectedCount(Int32Value int32Value) {
        int32Value.getClass();
        this.expectedCount_ = int32Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipelineQuery(PipelineQueryTarget pipelineQueryTarget) {
        pipelineQueryTarget.getClass();
        this.targetType_ = pipelineQueryTarget;
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(QueryTarget queryTarget) {
        queryTarget.getClass();
        this.targetType_ = queryTarget;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.resumeType_ = timestamp;
        this.resumeTypeCase_ = 11;
    }

    private Target() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = getclipmetadata;
    }

    public Int32Value getExpectedCount() {
        Int32Value int32Value = this.expectedCount_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public DocumentsTarget getDocuments() {
        return this.targetTypeCase_ == 3 ? (DocumentsTarget) this.targetType_ : DocumentsTarget.getDefaultInstance();
    }

    public QueryTarget getQuery() {
        return this.targetTypeCase_ == 2 ? (QueryTarget) this.targetType_ : QueryTarget.getDefaultInstance();
    }

    public getClipMetadata getResumeToken() {
        return this.resumeTypeCase_ == 4 ? (getClipMetadata) this.resumeType_ : getClipMetadata.serializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 3) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 2) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    public PipelineQueryTarget getPipelineQuery() {
        return this.targetTypeCase_ == 13 ? (PipelineQueryTarget) this.targetType_ : PipelineQueryTarget.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        return this.resumeTypeCase_ == 11 ? (Timestamp) this.resumeType_ : Timestamp.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipelineQuery() {
        if (this.targetTypeCase_ == 13) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        if (this.resumeTypeCase_ == 11) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    public static AndroidComposeViewStartDragAndDropN newBuilder(Target target) {
        return (AndroidComposeViewStartDragAndDropN) DEFAULT_INSTANCE.createBuilder(target);
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
