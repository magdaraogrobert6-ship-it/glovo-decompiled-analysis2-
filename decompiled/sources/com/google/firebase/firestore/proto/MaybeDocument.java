package com.google.firebase.firestore.proto;

import com.google.firestore.v1.Document;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.OnUnplacedModifierNode;
import o.OutOfFrameExecutor;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.onNodePositioned;
import o.resizeozmzZPI;
import o.setContentInvalid;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDocument extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentType() {
        this.documentTypeCase_ = 0;
        this.documentType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCommittedMutations() {
        this.hasCommittedMutations_ = false;
    }

    public static MaybeDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCommittedMutations(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    public boolean getHasCommittedMutations() {
        return this.hasCommittedMutations_;
    }

    public boolean hasDocument() {
        return this.documentTypeCase_ == 2;
    }

    public boolean hasNoDocument() {
        return this.documentTypeCase_ == 1;
    }

    public boolean hasUnknownDocument() {
        return this.documentTypeCase_ == 3;
    }

    public enum read {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);

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
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return NO_DOCUMENT;
            }
            if (i == 2) {
                return DOCUMENT;
            }
            if (i != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        GeneratedMessageLite.registerDefaultInstance(MaybeDocument.class, maybeDocument);
    }

    public static OnUnplacedModifierNode newBuilder() {
        return (OnUnplacedModifierNode) DEFAULT_INSTANCE.createBuilder();
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (onNodePositioned.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MaybeDocument();
            case 2:
                return new OnUnplacedModifierNode(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, Document.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MaybeDocument.class) {
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

    public read getDocumentTypeCase() {
        return read.forNumber(this.documentTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(Document document) {
        document.getClass();
        if (this.documentTypeCase_ != 2 || this.documentType_ == Document.getDefaultInstance()) {
            this.documentType_ = document;
        } else {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder((Document) this.documentType_);
            setcontentinvalidNewBuilder.read(document);
            this.documentType_ = setcontentinvalidNewBuilder.read();
        }
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        if (this.documentTypeCase_ != 1 || this.documentType_ == NoDocument.getDefaultInstance()) {
            this.documentType_ = noDocument;
        } else {
            OutOfFrameExecutor outOfFrameExecutorNewBuilder = NoDocument.newBuilder((NoDocument) this.documentType_);
            outOfFrameExecutorNewBuilder.read(noDocument);
            this.documentType_ = outOfFrameExecutorNewBuilder.read();
        }
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        if (this.documentTypeCase_ != 3 || this.documentType_ == UnknownDocument.getDefaultInstance()) {
            this.documentType_ = unknownDocument;
        } else {
            resizeozmzZPI resizeozmzzpiNewBuilder = UnknownDocument.newBuilder((UnknownDocument) this.documentType_);
            resizeozmzzpiNewBuilder.read(unknownDocument);
            this.documentType_ = resizeozmzzpiNewBuilder.read();
        }
        this.documentTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(Document document) {
        document.getClass();
        this.documentType_ = document;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        this.documentType_ = noDocument;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        this.documentType_ = unknownDocument;
        this.documentTypeCase_ = 3;
    }

    private MaybeDocument() {
    }

    public Document getDocument() {
        return this.documentTypeCase_ == 2 ? (Document) this.documentType_ : Document.getDefaultInstance();
    }

    public NoDocument getNoDocument() {
        return this.documentTypeCase_ == 1 ? (NoDocument) this.documentType_ : NoDocument.getDefaultInstance();
    }

    public UnknownDocument getUnknownDocument() {
        return this.documentTypeCase_ == 3 ? (UnknownDocument) this.documentType_ : UnknownDocument.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.documentTypeCase_ == 2) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoDocument() {
        if (this.documentTypeCase_ == 1) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknownDocument() {
        if (this.documentTypeCase_ == 3) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    public static OnUnplacedModifierNode newBuilder(MaybeDocument maybeDocument) {
        return (OnUnplacedModifierNode) DEFAULT_INSTANCE.createBuilder(maybeDocument);
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MaybeDocument parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MaybeDocument parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MaybeDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaybeDocument parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MaybeDocument parseFrom(InputStream inputStream) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MaybeDocument parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MaybeDocument parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MaybeDocument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
