package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DebugUtilsKt;
import o.component23;
import o.decodeFloat;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setContentInvalid;
import o.toBoundsInScreen;
import o.toBoundsRelativeToNodeBounds;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentChange extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DocumentChange DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Document document_;
    private int targetIdsMemoizedSerializedSize = -1;
    private int removedTargetIdsMemoizedSerializedSize = -1;
    private decodeFloat targetIds_ = GeneratedMessageLite.emptyIntList();
    private decodeFloat removedTargetIds_ = GeneratedMessageLite.emptyIntList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -2;
    }

    public static DocumentChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    public boolean hasDocument() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        DocumentChange documentChange = new DocumentChange();
        DEFAULT_INSTANCE = documentChange;
        GeneratedMessageLite.registerDefaultInstance(DocumentChange.class, documentChange);
    }

    public static toBoundsRelativeToNodeBounds newBuilder() {
        return (toBoundsRelativeToNodeBounds) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (toBoundsInScreen.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DocumentChange();
            case 2:
                return new toBoundsRelativeToNodeBounds(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0005'\u0006'", new Object[]{"bitField0_", "document_", "targetIds_", "removedTargetIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DocumentChange.class) {
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

    public int getRemovedTargetIds(int i) {
        return ((DebugUtilsKt) this.removedTargetIds_).serializer(i);
    }

    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    public int getTargetIds(int i) {
        return ((DebugUtilsKt) this.targetIds_).serializer(i);
    }

    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        ensureRemovedTargetIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.removedTargetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargetIds(Iterable<? extends Integer> iterable) {
        ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.targetIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemovedTargetIds(int i) {
        ensureRemovedTargetIdsIsMutable();
        ((DebugUtilsKt) this.removedTargetIds_).IconCompatParcelizer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargetIds(int i) {
        ensureTargetIdsIsMutable();
        ((DebugUtilsKt) this.targetIds_).IconCompatParcelizer(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureRemovedTargetIdsIsMutable() {
        decodeFloat decodefloat = this.removedTargetIds_;
        if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
            return;
        }
        this.removedTargetIds_ = GeneratedMessageLite.mutableCopy(decodefloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureTargetIdsIsMutable() {
        decodeFloat decodefloat = this.targetIds_;
        if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
            return;
        }
        this.targetIds_ = GeneratedMessageLite.mutableCopy(decodefloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(Document document) {
        document.getClass();
        Document document2 = this.document_;
        if (document2 == null || document2 == Document.getDefaultInstance()) {
            this.document_ = document;
        } else {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder(this.document_);
            setcontentinvalidNewBuilder.read(document);
            this.document_ = (Document) setcontentinvalidNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(Document document) {
        document.getClass();
        this.document_ = document;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovedTargetIds(int i, int i2) {
        ensureRemovedTargetIdsIsMutable();
        ((DebugUtilsKt) this.removedTargetIds_).IconCompatParcelizer(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetIds(int i, int i2) {
        ensureTargetIdsIsMutable();
        ((DebugUtilsKt) this.targetIds_).IconCompatParcelizer(i, i2);
    }

    private DocumentChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovedTargetIds() {
        this.removedTargetIds_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetIds() {
        this.targetIds_ = GeneratedMessageLite.emptyIntList();
    }

    public Document getDocument() {
        Document document = this.document_;
        return document == null ? Document.getDefaultInstance() : document;
    }

    public static toBoundsRelativeToNodeBounds newBuilder(DocumentChange documentChange) {
        return (toBoundsRelativeToNodeBounds) DEFAULT_INSTANCE.createBuilder(documentChange);
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentChange parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentChange parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DocumentChange parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentChange parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentChange parseFrom(InputStream inputStream) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentChange parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
