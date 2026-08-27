package com.google.firestore.v1;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
import o.accesscontainsDescendant;
import o.component23;
import o.dataAvailable;
import o.decodeByte;
import o.decodeString;
import o.dispatchHoverEventui;
import o.dumpRenderNodeData;
import o.getAccessibilityForceEnabledForTestingui;
import o.getAccessibilityNodeProvider;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getExtraDataTestTraversalAfterValui;
import o.getExtraDataTestTraversalBeforeValui;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getOnSendAccessibilityEventui;
import o.ifDebug;
import o.performActionHelper;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentTransform extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DocumentTransform DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private String document_ = "";
    private decodeString fieldTransforms_ = GeneratedMessageLite.emptyProtobufList();

    public static final class FieldTransform extends GeneratedMessageLite implements getOnSendAccessibilityEventui {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final FieldTransform DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile component23 PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransformType() {
            this.transformTypeCase_ = 0;
            this.transformType_ = null;
        }

        public static FieldTransform getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetToServerValueValue(int i) {
            this.transformTypeCase_ = 2;
            this.transformType_ = Integer.valueOf(i);
        }

        public String getFieldPath() {
            return this.fieldPath_;
        }

        public boolean hasAppendMissingElements() {
            return this.transformTypeCase_ == 6;
        }

        public boolean hasIncrement() {
            return this.transformTypeCase_ == 3;
        }

        public boolean hasMaximum() {
            return this.transformTypeCase_ == 4;
        }

        public boolean hasMinimum() {
            return this.transformTypeCase_ == 5;
        }

        public boolean hasRemoveAllFromArray() {
            return this.transformTypeCase_ == 7;
        }

        public boolean hasSetToServerValue() {
            return this.transformTypeCase_ == 2;
        }

        public enum IconCompatParcelizer {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);

            private final int value;

            public int getNumber() {
                return this.value;
            }

            IconCompatParcelizer(int i) {
                this.value = i;
            }

            public static IconCompatParcelizer forNumber(int i) {
                if (i != 0) {
                    switch (i) {
                        case 2:
                            return SET_TO_SERVER_VALUE;
                        case 3:
                            return INCREMENT;
                        case 4:
                            return MAXIMUM;
                        case 5:
                            return MINIMUM;
                        case 6:
                            return APPEND_MISSING_ELEMENTS;
                        case 7:
                            return REMOVE_ALL_FROM_ARRAY;
                        default:
                            return null;
                    }
                }
                return TRANSFORMTYPE_NOT_SET;
            }

            @Deprecated
            public static IconCompatParcelizer valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum serializer implements ifDebug {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);

            public static final int REQUEST_TIME_VALUE = 1;
            public static final int SERVER_VALUE_UNSPECIFIED_VALUE = 0;
            private static final dataAvailable internalValueMap = new getExtraDataTestTraversalBeforeValui();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return getExtraDataTestTraversalAfterValui.RemoteActionCompatParcelizer;
            }

            serializer(int i) {
                this.value = i;
            }

            @Override // o.ifDebug
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
                return 0;
            }

            public static serializer forNumber(int i) {
                if (i == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Deprecated
            public static serializer valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            FieldTransform fieldTransform = new FieldTransform();
            DEFAULT_INSTANCE = fieldTransform;
            GeneratedMessageLite.registerDefaultInstance(FieldTransform.class, fieldTransform);
        }

        public static dispatchHoverEventui newBuilder() {
            return (dispatchHoverEventui) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldTransform parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (getAccessibilityNodeProvider.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new FieldTransform();
                case 2:
                    return new dispatchHoverEventui(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", Value.class, Value.class, Value.class, ArrayValue.class, ArrayValue.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (FieldTransform.class) {
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

        public getClipMetadata getFieldPathBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.fieldPath_);
        }

        public IconCompatParcelizer getTransformTypeCase() {
            return IconCompatParcelizer.forNumber(this.transformTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAppendMissingElements(ArrayValue arrayValue) {
            arrayValue.getClass();
            if (this.transformTypeCase_ != 6 || this.transformType_ == ArrayValue.getDefaultInstance()) {
                this.transformType_ = arrayValue;
            } else {
                performActionHelper performactionhelperNewBuilder = ArrayValue.newBuilder((ArrayValue) this.transformType_);
                performactionhelperNewBuilder.read(arrayValue);
                this.transformType_ = performactionhelperNewBuilder.read();
            }
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIncrement(Value value) {
            value.getClass();
            if (this.transformTypeCase_ != 3 || this.transformType_ == Value.getDefaultInstance()) {
                this.transformType_ = value;
            } else {
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder((Value) this.transformType_);
                accesscontainsdescendantNewBuilder.read(value);
                this.transformType_ = accesscontainsdescendantNewBuilder.read();
            }
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMaximum(Value value) {
            value.getClass();
            if (this.transformTypeCase_ != 4 || this.transformType_ == Value.getDefaultInstance()) {
                this.transformType_ = value;
            } else {
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder((Value) this.transformType_);
                accesscontainsdescendantNewBuilder.read(value);
                this.transformType_ = accesscontainsdescendantNewBuilder.read();
            }
            this.transformTypeCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMinimum(Value value) {
            value.getClass();
            if (this.transformTypeCase_ != 5 || this.transformType_ == Value.getDefaultInstance()) {
                this.transformType_ = value;
            } else {
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder((Value) this.transformType_);
                accesscontainsdescendantNewBuilder.read(value);
                this.transformType_ = accesscontainsdescendantNewBuilder.read();
            }
            this.transformTypeCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRemoveAllFromArray(ArrayValue arrayValue) {
            arrayValue.getClass();
            if (this.transformTypeCase_ != 7 || this.transformType_ == ArrayValue.getDefaultInstance()) {
                this.transformType_ = arrayValue;
            } else {
                performActionHelper performactionhelperNewBuilder = ArrayValue.newBuilder((ArrayValue) this.transformType_);
                performactionhelperNewBuilder.read(arrayValue);
                this.transformType_ = performactionhelperNewBuilder.read();
            }
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppendMissingElements(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPath(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPathBytes(getClipMetadata getclipmetadata) {
            AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
            this.fieldPath_ = getclipmetadata.MediaMetadataCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncrement(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximum(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimum(Value value) {
            value.getClass();
            this.transformType_ = value;
            this.transformTypeCase_ = 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemoveAllFromArray(ArrayValue arrayValue) {
            arrayValue.getClass();
            this.transformType_ = arrayValue;
            this.transformTypeCase_ = 7;
        }

        private FieldTransform() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        public ArrayValue getAppendMissingElements() {
            return this.transformTypeCase_ == 6 ? (ArrayValue) this.transformType_ : ArrayValue.getDefaultInstance();
        }

        public Value getIncrement() {
            return this.transformTypeCase_ == 3 ? (Value) this.transformType_ : Value.getDefaultInstance();
        }

        public Value getMaximum() {
            return this.transformTypeCase_ == 4 ? (Value) this.transformType_ : Value.getDefaultInstance();
        }

        public Value getMinimum() {
            return this.transformTypeCase_ == 5 ? (Value) this.transformType_ : Value.getDefaultInstance();
        }

        public ArrayValue getRemoveAllFromArray() {
            return this.transformTypeCase_ == 7 ? (ArrayValue) this.transformType_ : ArrayValue.getDefaultInstance();
        }

        public serializer getSetToServerValue() {
            if (this.transformTypeCase_ != 2) {
                return serializer.SERVER_VALUE_UNSPECIFIED;
            }
            serializer serializerVarForNumber = serializer.forNumber(((Integer) this.transformType_).intValue());
            return serializerVarForNumber == null ? serializer.UNRECOGNIZED : serializerVarForNumber;
        }

        public int getSetToServerValueValue() {
            if (this.transformTypeCase_ == 2) {
                return ((Integer) this.transformType_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncrement() {
            if (this.transformTypeCase_ == 3) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximum() {
            if (this.transformTypeCase_ == 4) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimum() {
            if (this.transformTypeCase_ == 5) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetToServerValue(serializer serializerVar) {
            this.transformType_ = Integer.valueOf(serializerVar.getNumber());
            this.transformTypeCase_ = 2;
        }

        public static dispatchHoverEventui newBuilder(FieldTransform fieldTransform) {
            return (dispatchHoverEventui) DEFAULT_INSTANCE.createBuilder(fieldTransform);
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldTransform parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldTransform parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static FieldTransform parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldTransform parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldTransform parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldTransform parseFrom(InputStream inputStream) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldTransform parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static DocumentTransform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getDocument() {
        return this.document_;
    }

    public List<FieldTransform> getFieldTransformsList() {
        return this.fieldTransforms_;
    }

    public List<? extends getOnSendAccessibilityEventui> getFieldTransformsOrBuilderList() {
        return this.fieldTransforms_;
    }

    static {
        DocumentTransform documentTransform = new DocumentTransform();
        DEFAULT_INSTANCE = documentTransform;
        GeneratedMessageLite.registerDefaultInstance(DocumentTransform.class, documentTransform);
    }

    public static getAccessibilityForceEnabledForTestingui newBuilder() {
        return (getAccessibilityForceEnabledForTestingui) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentTransform parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getAccessibilityNodeProvider.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DocumentTransform();
            case 2:
                return new getAccessibilityForceEnabledForTestingui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", FieldTransform.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DocumentTransform.class) {
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

    public getClipMetadata getDocumentBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.document_);
    }

    public FieldTransform getFieldTransforms(int i) {
        return (FieldTransform) this.fieldTransforms_.get(i);
    }

    public int getFieldTransformsCount() {
        return this.fieldTransforms_.size();
    }

    public getOnSendAccessibilityEventui getFieldTransformsOrBuilder(int i) {
        return (getOnSendAccessibilityEventui) this.fieldTransforms_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTransforms(Iterable<? extends FieldTransform> iterable) {
        ensureFieldTransformsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fieldTransforms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldTransforms(FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(fieldTransform);
    }

    private void ensureFieldTransformsIsMutable() {
        decodeString decodestring = this.fieldTransforms_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.fieldTransforms_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldTransforms(int i) {
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(String str) {
        str.getClass();
        this.document_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.document_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldTransforms(int i, FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.set(i, fieldTransform);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        this.document_ = getDefaultInstance().getDocument();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldTransforms() {
        this.fieldTransforms_ = GeneratedMessageLite.emptyProtobufList();
    }

    private DocumentTransform() {
    }

    public static getAccessibilityForceEnabledForTestingui newBuilder(DocumentTransform documentTransform) {
        return (getAccessibilityForceEnabledForTestingui) DEFAULT_INSTANCE.createBuilder(documentTransform);
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentTransform parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentTransform parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DocumentTransform parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldTransforms(int i, FieldTransform fieldTransform) {
        fieldTransform.getClass();
        ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(i, fieldTransform);
    }

    public static DocumentTransform parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentTransform parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentTransform parseFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentTransform parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentTransform) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
