package com.google.firestore.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeViewAccessibilityDelegateCompatCompanion;
import o.AndroidComposeViewAccessibilityDelegateCompatComposeAccessibilityNodeProvider;
import o.AndroidComposeViewTranslationCallbackS;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.onTouchExplorationStateChanged;
import o.toBoundsRelativeToNodeBounds;
import o.toCornerArray;
import o.traverseAtGranularity;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenResponse extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final ListenResponse DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile component23 PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    public static ListenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasDocumentChange() {
        return this.responseTypeCase_ == 3;
    }

    public boolean hasDocumentDelete() {
        return this.responseTypeCase_ == 4;
    }

    public boolean hasDocumentRemove() {
        return this.responseTypeCase_ == 6;
    }

    public boolean hasFilter() {
        return this.responseTypeCase_ == 5;
    }

    public boolean hasTargetChange() {
        return this.responseTypeCase_ == 2;
    }

    public enum read {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);

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
                return RESPONSETYPE_NOT_SET;
            }
            if (i == 2) {
                return TARGET_CHANGE;
            }
            if (i == 3) {
                return DOCUMENT_CHANGE;
            }
            if (i == 4) {
                return DOCUMENT_DELETE;
            }
            if (i == 5) {
                return FILTER;
            }
            if (i != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        ListenResponse listenResponse = new ListenResponse();
        DEFAULT_INSTANCE = listenResponse;
        GeneratedMessageLite.registerDefaultInstance(ListenResponse.class, listenResponse);
    }

    public static AndroidComposeViewAccessibilityDelegateCompatCompanion newBuilder() {
        return (AndroidComposeViewAccessibilityDelegateCompatCompanion) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidComposeViewAccessibilityDelegateCompatComposeAccessibilityNodeProvider.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ListenResponse();
            case 2:
                return new AndroidComposeViewAccessibilityDelegateCompatCompanion(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", TargetChange.class, DocumentChange.class, DocumentDelete.class, ExistenceFilter.class, DocumentRemove.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ListenResponse.class) {
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

    public read getResponseTypeCase() {
        return read.forNumber(this.responseTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentChange(DocumentChange documentChange) {
        documentChange.getClass();
        if (this.responseTypeCase_ != 3 || this.responseType_ == DocumentChange.getDefaultInstance()) {
            this.responseType_ = documentChange;
        } else {
            toBoundsRelativeToNodeBounds toboundsrelativetonodeboundsNewBuilder = DocumentChange.newBuilder((DocumentChange) this.responseType_);
            toboundsrelativetonodeboundsNewBuilder.read(documentChange);
            this.responseType_ = toboundsrelativetonodeboundsNewBuilder.read();
        }
        this.responseTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentDelete(DocumentDelete documentDelete) {
        documentDelete.getClass();
        if (this.responseTypeCase_ != 4 || this.responseType_ == DocumentDelete.getDefaultInstance()) {
            this.responseType_ = documentDelete;
        } else {
            toCornerArray tocornerarrayNewBuilder = DocumentDelete.newBuilder((DocumentDelete) this.responseType_);
            tocornerarrayNewBuilder.read(documentDelete);
            this.responseType_ = tocornerarrayNewBuilder.read();
        }
        this.responseTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentRemove(DocumentRemove documentRemove) {
        documentRemove.getClass();
        if (this.responseTypeCase_ != 6 || this.responseType_ == DocumentRemove.getDefaultInstance()) {
            this.responseType_ = documentRemove;
        } else {
            traverseAtGranularity traverseatgranularityNewBuilder = DocumentRemove.newBuilder((DocumentRemove) this.responseType_);
            traverseatgranularityNewBuilder.read(documentRemove);
            this.responseType_ = traverseatgranularityNewBuilder.read();
        }
        this.responseTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFilter(ExistenceFilter existenceFilter) {
        existenceFilter.getClass();
        if (this.responseTypeCase_ != 5 || this.responseType_ == ExistenceFilter.getDefaultInstance()) {
            this.responseType_ = existenceFilter;
        } else {
            onTouchExplorationStateChanged ontouchexplorationstatechangedNewBuilder = ExistenceFilter.newBuilder((ExistenceFilter) this.responseType_);
            ontouchexplorationstatechangedNewBuilder.read(existenceFilter);
            this.responseType_ = ontouchexplorationstatechangedNewBuilder.read();
        }
        this.responseTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTargetChange(TargetChange targetChange) {
        targetChange.getClass();
        if (this.responseTypeCase_ != 2 || this.responseType_ == TargetChange.getDefaultInstance()) {
            this.responseType_ = targetChange;
        } else {
            AndroidComposeViewTranslationCallbackS androidComposeViewTranslationCallbackSNewBuilder = TargetChange.newBuilder((TargetChange) this.responseType_);
            androidComposeViewTranslationCallbackSNewBuilder.read(targetChange);
            this.responseType_ = androidComposeViewTranslationCallbackSNewBuilder.read();
        }
        this.responseTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentChange(DocumentChange documentChange) {
        documentChange.getClass();
        this.responseType_ = documentChange;
        this.responseTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentDelete(DocumentDelete documentDelete) {
        documentDelete.getClass();
        this.responseType_ = documentDelete;
        this.responseTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentRemove(DocumentRemove documentRemove) {
        documentRemove.getClass();
        this.responseType_ = documentRemove;
        this.responseTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilter(ExistenceFilter existenceFilter) {
        existenceFilter.getClass();
        this.responseType_ = existenceFilter;
        this.responseTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetChange(TargetChange targetChange) {
        targetChange.getClass();
        this.responseType_ = targetChange;
        this.responseTypeCase_ = 2;
    }

    private ListenResponse() {
    }

    public DocumentChange getDocumentChange() {
        return this.responseTypeCase_ == 3 ? (DocumentChange) this.responseType_ : DocumentChange.getDefaultInstance();
    }

    public DocumentDelete getDocumentDelete() {
        return this.responseTypeCase_ == 4 ? (DocumentDelete) this.responseType_ : DocumentDelete.getDefaultInstance();
    }

    public DocumentRemove getDocumentRemove() {
        return this.responseTypeCase_ == 6 ? (DocumentRemove) this.responseType_ : DocumentRemove.getDefaultInstance();
    }

    public ExistenceFilter getFilter() {
        return this.responseTypeCase_ == 5 ? (ExistenceFilter) this.responseType_ : ExistenceFilter.getDefaultInstance();
    }

    public TargetChange getTargetChange() {
        return this.responseTypeCase_ == 2 ? (TargetChange) this.responseType_ : TargetChange.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChange() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static AndroidComposeViewAccessibilityDelegateCompatCompanion newBuilder(ListenResponse listenResponse) {
        return (AndroidComposeViewAccessibilityDelegateCompatCompanion) DEFAULT_INSTANCE.createBuilder(listenResponse);
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ListenResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListenResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
