package com.google.firestore.bundle;

import com.google.firestore.v1.Document;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getBoundsInScreen;
import o.getClipMetadata;
import o.getCurrentSemanticsNodes;
import o.getIteratorForGranularity;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getOnSendAccessibilityEventuiannotations;
import o.isTouchExplorationEnabled;
import o.setContentInvalid;

/* JADX INFO: loaded from: classes4.dex */
public final class BundleElement extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final BundleElement DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_METADATA_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAMED_QUERY_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private int elementTypeCase_ = 0;
    private Object elementType_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElementType() {
        this.elementTypeCase_ = 0;
        this.elementType_ = null;
    }

    public static BundleElement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasDocument() {
        return this.elementTypeCase_ == 4;
    }

    public boolean hasDocumentMetadata() {
        return this.elementTypeCase_ == 3;
    }

    public boolean hasMetadata() {
        return this.elementTypeCase_ == 1;
    }

    public boolean hasNamedQuery() {
        return this.elementTypeCase_ == 2;
    }

    public enum read {
        METADATA(1),
        NAMED_QUERY(2),
        DOCUMENT_METADATA(3),
        DOCUMENT(4),
        ELEMENTTYPE_NOT_SET(0);

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
                return ELEMENTTYPE_NOT_SET;
            }
            if (i == 1) {
                return METADATA;
            }
            if (i == 2) {
                return NAMED_QUERY;
            }
            if (i == 3) {
                return DOCUMENT_METADATA;
            }
            if (i != 4) {
                return null;
            }
            return DOCUMENT;
        }
    }

    static {
        BundleElement bundleElement = new BundleElement();
        DEFAULT_INSTANCE = bundleElement;
        GeneratedMessageLite.registerDefaultInstance(BundleElement.class, bundleElement);
    }

    public static getBoundsInScreen newBuilder() {
        return (getBoundsInScreen) DEFAULT_INSTANCE.createBuilder();
    }

    public static BundleElement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundleElement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getCurrentSemanticsNodes.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BundleElement();
            case 2:
                return new getBoundsInScreen(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"elementType_", "elementTypeCase_", BundleMetadata.class, NamedQuery.class, BundledDocumentMetadata.class, Document.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BundleElement.class) {
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

    public read getElementTypeCase() {
        return read.forNumber(this.elementTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(Document document) {
        document.getClass();
        if (this.elementTypeCase_ != 4 || this.elementType_ == Document.getDefaultInstance()) {
            this.elementType_ = document;
        } else {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder((Document) this.elementType_);
            setcontentinvalidNewBuilder.read(document);
            this.elementType_ = setcontentinvalidNewBuilder.read();
        }
        this.elementTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
        bundledDocumentMetadata.getClass();
        if (this.elementTypeCase_ != 3 || this.elementType_ == BundledDocumentMetadata.getDefaultInstance()) {
            this.elementType_ = bundledDocumentMetadata;
        } else {
            getIteratorForGranularity getiteratorforgranularityNewBuilder = BundledDocumentMetadata.newBuilder((BundledDocumentMetadata) this.elementType_);
            getiteratorforgranularityNewBuilder.read(bundledDocumentMetadata);
            this.elementType_ = getiteratorforgranularityNewBuilder.read();
        }
        this.elementTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(BundleMetadata bundleMetadata) {
        bundleMetadata.getClass();
        if (this.elementTypeCase_ != 1 || this.elementType_ == BundleMetadata.getDefaultInstance()) {
            this.elementType_ = bundleMetadata;
        } else {
            getOnSendAccessibilityEventuiannotations getonsendaccessibilityeventuiannotationsNewBuilder = BundleMetadata.newBuilder((BundleMetadata) this.elementType_);
            getonsendaccessibilityeventuiannotationsNewBuilder.read(bundleMetadata);
            this.elementType_ = getonsendaccessibilityeventuiannotationsNewBuilder.read();
        }
        this.elementTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNamedQuery(NamedQuery namedQuery) {
        namedQuery.getClass();
        if (this.elementTypeCase_ != 2 || this.elementType_ == NamedQuery.getDefaultInstance()) {
            this.elementType_ = namedQuery;
        } else {
            isTouchExplorationEnabled istouchexplorationenabledNewBuilder = NamedQuery.newBuilder((NamedQuery) this.elementType_);
            istouchexplorationenabledNewBuilder.read(namedQuery);
            this.elementType_ = istouchexplorationenabledNewBuilder.read();
        }
        this.elementTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(Document document) {
        document.getClass();
        this.elementType_ = document;
        this.elementTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentMetadata(BundledDocumentMetadata bundledDocumentMetadata) {
        bundledDocumentMetadata.getClass();
        this.elementType_ = bundledDocumentMetadata;
        this.elementTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(BundleMetadata bundleMetadata) {
        bundleMetadata.getClass();
        this.elementType_ = bundleMetadata;
        this.elementTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamedQuery(NamedQuery namedQuery) {
        namedQuery.getClass();
        this.elementType_ = namedQuery;
        this.elementTypeCase_ = 2;
    }

    private BundleElement() {
    }

    public Document getDocument() {
        return this.elementTypeCase_ == 4 ? (Document) this.elementType_ : Document.getDefaultInstance();
    }

    public BundledDocumentMetadata getDocumentMetadata() {
        return this.elementTypeCase_ == 3 ? (BundledDocumentMetadata) this.elementType_ : BundledDocumentMetadata.getDefaultInstance();
    }

    public BundleMetadata getMetadata() {
        return this.elementTypeCase_ == 1 ? (BundleMetadata) this.elementType_ : BundleMetadata.getDefaultInstance();
    }

    public NamedQuery getNamedQuery() {
        return this.elementTypeCase_ == 2 ? (NamedQuery) this.elementType_ : NamedQuery.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.elementTypeCase_ == 4) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentMetadata() {
        if (this.elementTypeCase_ == 3) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        if (this.elementTypeCase_ == 1) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamedQuery() {
        if (this.elementTypeCase_ == 2) {
            this.elementTypeCase_ = 0;
            this.elementType_ = null;
        }
    }

    public static getBoundsInScreen newBuilder(BundleElement bundleElement) {
        return (getBoundsInScreen) DEFAULT_INSTANCE.createBuilder(bundleElement);
    }

    public static BundleElement parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundleElement parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundleElement parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BundleElement parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundleElement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BundleElement parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundleElement parseFrom(InputStream inputStream) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundleElement parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundleElement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BundleElement parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundleElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
