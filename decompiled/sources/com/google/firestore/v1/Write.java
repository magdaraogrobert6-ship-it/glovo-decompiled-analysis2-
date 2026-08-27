package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessgetContentCaptureSessionCompat;
import o.accesspreTranslatecG2Xzmc;
import o.component23;
import o.decodeString;
import o.diffForWindowMetricsChanged;
import o.getAccessibilityForceEnabledForTestingui;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getOnSendAccessibilityEventui;
import o.setContentInvalid;
import o.transformMatrixToWindowEL8BTi8;
import o.updateHoveredVirtualView;

/* JADX INFO: loaded from: classes2.dex */
public final class Write extends GeneratedMessageLite implements accessgetContentCaptureSessionCompat {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final Write DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private int bitField0_;
    private Precondition currentDocument_;
    private Object operation_;
    private DocumentMask updateMask_;
    private int operationCase_ = 0;
    private decodeString updateTransforms_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDocument() {
        this.currentDocument_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperation() {
        this.operationCase_ = 0;
        this.operation_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateMask() {
        this.updateMask_ = null;
        this.bitField0_ &= -2;
    }

    public static Write getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<DocumentTransform.FieldTransform> getUpdateTransformsList() {
        return this.updateTransforms_;
    }

    public List<? extends getOnSendAccessibilityEventui> getUpdateTransformsOrBuilderList() {
        return this.updateTransforms_;
    }

    public boolean hasCurrentDocument() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDelete() {
        return this.operationCase_ == 2;
    }

    public boolean hasTransform() {
        return this.operationCase_ == 6;
    }

    public boolean hasUpdate() {
        return this.operationCase_ == 1;
    }

    public boolean hasUpdateMask() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVerify() {
        return this.operationCase_ == 5;
    }

    public enum write {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);

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
                return OPERATION_NOT_SET;
            }
            if (i == 1) {
                return UPDATE;
            }
            if (i == 2) {
                return DELETE;
            }
            if (i == 5) {
                return VERIFY;
            }
            if (i != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        Write write2 = new Write();
        DEFAULT_INSTANCE = write2;
        GeneratedMessageLite.registerDefaultInstance(Write.class, write2);
    }

    public static diffForWindowMetricsChanged newBuilder() {
        return (diffForWindowMetricsChanged) DEFAULT_INSTANCE.createBuilder();
    }

    public static Write parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Write) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Write parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accesspreTranslatecG2Xzmc.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Write();
            case 2:
                return new diffForWindowMetricsChanged(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", "bitField0_", Document.class, "updateMask_", "currentDocument_", DocumentTransform.class, "updateTransforms_", DocumentTransform.FieldTransform.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Write.class) {
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

    public write getOperationCase() {
        return write.forNumber(this.operationCase_);
    }

    public DocumentTransform.FieldTransform getUpdateTransforms(int i) {
        return (DocumentTransform.FieldTransform) this.updateTransforms_.get(i);
    }

    public int getUpdateTransformsCount() {
        return this.updateTransforms_.size();
    }

    public getOnSendAccessibilityEventui getUpdateTransformsOrBuilder(int i) {
        return (getOnSendAccessibilityEventui) this.updateTransforms_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpdateTransforms(Iterable<? extends DocumentTransform.FieldTransform> iterable) {
        ensureUpdateTransformsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.updateTransforms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdateTransforms(DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add(fieldTransform);
    }

    private void ensureUpdateTransformsIsMutable() {
        decodeString decodestring = this.updateTransforms_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.updateTransforms_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentDocument(Precondition precondition) {
        precondition.getClass();
        Precondition precondition2 = this.currentDocument_;
        if (precondition2 == null || precondition2 == Precondition.getDefaultInstance()) {
            this.currentDocument_ = precondition;
        } else {
            AndroidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1 androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder = Precondition.newBuilder(this.currentDocument_);
            androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.read(precondition);
            this.currentDocument_ = (Precondition) androidComposeViewAccessibilityDelegateCompatboundsUpdatesEventLoop1NewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransform(DocumentTransform documentTransform) {
        documentTransform.getClass();
        if (this.operationCase_ != 6 || this.operation_ == DocumentTransform.getDefaultInstance()) {
            this.operation_ = documentTransform;
        } else {
            getAccessibilityForceEnabledForTestingui getaccessibilityforceenabledfortestinguiNewBuilder = DocumentTransform.newBuilder((DocumentTransform) this.operation_);
            getaccessibilityforceenabledfortestinguiNewBuilder.read(documentTransform);
            this.operation_ = getaccessibilityforceenabledfortestinguiNewBuilder.read();
        }
        this.operationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdate(Document document) {
        document.getClass();
        if (this.operationCase_ != 1 || this.operation_ == Document.getDefaultInstance()) {
            this.operation_ = document;
        } else {
            setContentInvalid setcontentinvalidNewBuilder = Document.newBuilder((Document) this.operation_);
            setcontentinvalidNewBuilder.read(document);
            this.operation_ = setcontentinvalidNewBuilder.read();
        }
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        DocumentMask documentMask2 = this.updateMask_;
        if (documentMask2 == null || documentMask2 == DocumentMask.getDefaultInstance()) {
            this.updateMask_ = documentMask;
        } else {
            updateHoveredVirtualView updatehoveredvirtualviewNewBuilder = DocumentMask.newBuilder(this.updateMask_);
            updatehoveredvirtualviewNewBuilder.read(documentMask);
            this.updateMask_ = (DocumentMask) updatehoveredvirtualviewNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpdateTransforms(int i) {
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDocument(Precondition precondition) {
        precondition.getClass();
        this.currentDocument_ = precondition;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.operation_ = getclipmetadata.MediaMetadataCompat();
        this.operationCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransform(DocumentTransform documentTransform) {
        documentTransform.getClass();
        this.operation_ = documentTransform;
        this.operationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdate(Document document) {
        document.getClass();
        this.operation_ = document;
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateMask(DocumentMask documentMask) {
        documentMask.getClass();
        this.updateMask_ = documentMask;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTransforms(int i, DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.set(i, fieldTransform);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerifyBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.operation_ = getclipmetadata.MediaMetadataCompat();
        this.operationCase_ = 5;
    }

    private Write() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTransforms() {
        this.updateTransforms_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerify(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        return precondition == null ? Precondition.getDefaultInstance() : precondition;
    }

    public DocumentMask getUpdateMask() {
        DocumentMask documentMask = this.updateMask_;
        return documentMask == null ? DocumentMask.getDefaultInstance() : documentMask;
    }

    public String getDelete() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public getClipMetadata getDeleteBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.operationCase_ == 2 ? (String) this.operation_ : "");
    }

    public DocumentTransform getTransform() {
        return this.operationCase_ == 6 ? (DocumentTransform) this.operation_ : DocumentTransform.getDefaultInstance();
    }

    public Document getUpdate() {
        return this.operationCase_ == 1 ? (Document) this.operation_ : Document.getDefaultInstance();
    }

    public String getVerify() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public getClipMetadata getVerifyBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.operationCase_ == 5 ? (String) this.operation_ : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.operationCase_ == 2) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransform() {
        if (this.operationCase_ == 6) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdate() {
        if (this.operationCase_ == 1) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerify() {
        if (this.operationCase_ == 5) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    public static diffForWindowMetricsChanged newBuilder(Write write2) {
        return (diffForWindowMetricsChanged) DEFAULT_INSTANCE.createBuilder(write2);
    }

    public static Write parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Write) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Write parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Write parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Write parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdateTransforms(int i, DocumentTransform.FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureUpdateTransformsIsMutable();
        this.updateTransforms_.add(i, fieldTransform);
    }

    public static Write parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Write parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Write parseFrom(InputStream inputStream) throws IOException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Write parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Write parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Write parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Write) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
