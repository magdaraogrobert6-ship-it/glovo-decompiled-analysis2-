package com.google.firestore.admin.v1;

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
import o.canScrollmoWRBKg;
import o.checkForSemanticsChanges;
import o.clearAccessibilityFocus;
import o.component23;
import o.createEvent;
import o.createNodeInfo;
import o.createOutline12SF9DM;
import o.createTextSelectionChangedEvent;
import o.dataAvailable;
import o.decodeByte;
import o.decodeString;
import o.dumpRenderNodeData;
import o.emptyNodeInfoOrNull;
import o.getAccessibilitySelectionEnd;
import o.getAccessibilitySelectionStart;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getEnabledServices;
import o.getHandler;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class Index extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final Index DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private decodeString fields_ = GeneratedMessageLite.emptyProtobufList();

    public static final class IndexField extends GeneratedMessageLite implements emptyNodeInfoOrNull {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final IndexField DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile component23 PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValueMode() {
            this.valueModeCase_ = 0;
            this.valueMode_ = null;
        }

        public static IndexField getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArrayConfigValue(int i) {
            this.valueModeCase_ = 3;
            this.valueMode_ = Integer.valueOf(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrderValue(int i) {
            this.valueModeCase_ = 2;
            this.valueMode_ = Integer.valueOf(i);
        }

        public String getFieldPath() {
            return this.fieldPath_;
        }

        public boolean hasArrayConfig() {
            return this.valueModeCase_ == 3;
        }

        public boolean hasOrder() {
            return this.valueModeCase_ == 2;
        }

        public enum RemoteActionCompatParcelizer implements ifDebug {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);

            public static final int ASCENDING_VALUE = 1;
            public static final int DESCENDING_VALUE = 2;
            public static final int ORDER_UNSPECIFIED_VALUE = 0;
            private static final dataAvailable internalValueMap = new getAccessibilitySelectionEnd();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return getAccessibilitySelectionStart.serializer;
            }

            RemoteActionCompatParcelizer(int i) {
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

            @Deprecated
            public static RemoteActionCompatParcelizer valueOf(int i) {
                return forNumber(i);
            }

            public static RemoteActionCompatParcelizer forNumber(int i) {
                if (i == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (i == 1) {
                    return ASCENDING;
                }
                if (i != 2) {
                    return null;
                }
                return DESCENDING;
            }
        }

        /* JADX INFO: loaded from: classes4.dex */
        public enum serializer implements ifDebug {
            ARRAY_CONFIG_UNSPECIFIED(0),
            CONTAINS(1),
            UNRECOGNIZED(-1);

            public static final int ARRAY_CONFIG_UNSPECIFIED_VALUE = 0;
            public static final int CONTAINS_VALUE = 1;
            private static final dataAvailable internalValueMap = new clearAccessibilityFocus();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return createEvent.write;
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
                    return ARRAY_CONFIG_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return CONTAINS;
            }

            @Deprecated
            public static serializer valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum write {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);

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
                    return VALUEMODE_NOT_SET;
                }
                if (i == 2) {
                    return ORDER;
                }
                if (i != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            IndexField indexField = new IndexField();
            DEFAULT_INSTANCE = indexField;
            GeneratedMessageLite.registerDefaultInstance(IndexField.class, indexField);
        }

        public static checkForSemanticsChanges newBuilder() {
            return (checkForSemanticsChanges) DEFAULT_INSTANCE.createBuilder();
        }

        public static IndexField parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IndexField) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IndexField parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (canScrollmoWRBKg.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new IndexField();
                case 2:
                    return new checkForSemanticsChanges(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (IndexField.class) {
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

        public write getValueModeCase() {
            return write.forNumber(this.valueModeCase_);
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

        private IndexField() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        public serializer getArrayConfig() {
            if (this.valueModeCase_ != 3) {
                return serializer.ARRAY_CONFIG_UNSPECIFIED;
            }
            serializer serializerVarForNumber = serializer.forNumber(((Integer) this.valueMode_).intValue());
            return serializerVarForNumber == null ? serializer.UNRECOGNIZED : serializerVarForNumber;
        }

        public int getArrayConfigValue() {
            if (this.valueModeCase_ == 3) {
                return ((Integer) this.valueMode_).intValue();
            }
            return 0;
        }

        public RemoteActionCompatParcelizer getOrder() {
            if (this.valueModeCase_ != 2) {
                return RemoteActionCompatParcelizer.ORDER_UNSPECIFIED;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizerForNumber = RemoteActionCompatParcelizer.forNumber(((Integer) this.valueMode_).intValue());
            return remoteActionCompatParcelizerForNumber == null ? RemoteActionCompatParcelizer.UNRECOGNIZED : remoteActionCompatParcelizerForNumber;
        }

        public int getOrderValue() {
            if (this.valueModeCase_ == 2) {
                return ((Integer) this.valueMode_).intValue();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArrayConfig() {
            if (this.valueModeCase_ == 3) {
                this.valueModeCase_ = 0;
                this.valueMode_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrder() {
            if (this.valueModeCase_ == 2) {
                this.valueModeCase_ = 0;
                this.valueMode_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArrayConfig(serializer serializerVar) {
            this.valueMode_ = Integer.valueOf(serializerVar.getNumber());
            this.valueModeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrder(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.valueMode_ = Integer.valueOf(remoteActionCompatParcelizer.getNumber());
            this.valueModeCase_ = 2;
        }

        public static checkForSemanticsChanges newBuilder(IndexField indexField) {
            return (checkForSemanticsChanges) DEFAULT_INSTANCE.createBuilder(indexField);
        }

        public static IndexField parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (IndexField) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static IndexField parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static IndexField parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static IndexField parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static IndexField parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IndexField parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static IndexField parseFrom(InputStream inputStream) throws IOException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IndexField parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static IndexField parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static IndexField parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (IndexField) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryScope() {
        this.queryScope_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static Index getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryScopeValue(int i) {
        this.queryScope_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i) {
        this.state_ = i;
    }

    public List<IndexField> getFieldsList() {
        return this.fields_;
    }

    public List<? extends emptyNodeInfoOrNull> getFieldsOrBuilderList() {
        return this.fields_;
    }

    public String getName() {
        return this.name_;
    }

    public int getQueryScopeValue() {
        return this.queryScope_;
    }

    public int getStateValue() {
        return this.state_;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum serializer implements ifDebug {
        QUERY_SCOPE_UNSPECIFIED(0),
        COLLECTION(1),
        COLLECTION_GROUP(2),
        UNRECOGNIZED(-1);

        public static final int COLLECTION_GROUP_VALUE = 2;
        public static final int COLLECTION_VALUE = 1;
        public static final int QUERY_SCOPE_UNSPECIFIED_VALUE = 0;
        private static final dataAvailable internalValueMap = new createTextSelectionChangedEvent();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return createOutline12SF9DM.IconCompatParcelizer;
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

        @Deprecated
        public static serializer valueOf(int i) {
            return forNumber(i);
        }

        public static serializer forNumber(int i) {
            if (i == 0) {
                return QUERY_SCOPE_UNSPECIFIED;
            }
            if (i == 1) {
                return COLLECTION;
            }
            if (i != 2) {
                return null;
            }
            return COLLECTION_GROUP;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum write implements ifDebug {
        STATE_UNSPECIFIED(0),
        CREATING(1),
        READY(2),
        NEEDS_REPAIR(3),
        UNRECOGNIZED(-1);

        public static final int CREATING_VALUE = 1;
        public static final int NEEDS_REPAIR_VALUE = 3;
        public static final int READY_VALUE = 2;
        public static final int STATE_UNSPECIFIED_VALUE = 0;
        private static final dataAvailable internalValueMap = new getEnabledServices();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return getHandler.read;
        }

        write(int i) {
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

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }

        public static write forNumber(int i) {
            if (i == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return CREATING;
            }
            if (i == 2) {
                return READY;
            }
            if (i != 3) {
                return null;
            }
            return NEEDS_REPAIR;
        }
    }

    static {
        Index index = new Index();
        DEFAULT_INSTANCE = index;
        GeneratedMessageLite.registerDefaultInstance(Index.class, index);
    }

    public static createNodeInfo newBuilder() {
        return (createNodeInfo) DEFAULT_INSTANCE.createBuilder();
    }

    public static Index parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Index) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Index parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (canScrollmoWRBKg.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Index();
            case 2:
                return new createNodeInfo(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", IndexField.class, "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Index.class) {
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

    public IndexField getFields(int i) {
        return (IndexField) this.fields_.get(i);
    }

    public int getFieldsCount() {
        return this.fields_.size();
    }

    public emptyNodeInfoOrNull getFieldsOrBuilder(int i) {
        return (emptyNodeInfoOrNull) this.fields_.get(i);
    }

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    public serializer getQueryScope() {
        serializer serializerVarForNumber = serializer.forNumber(this.queryScope_);
        return serializerVarForNumber == null ? serializer.UNRECOGNIZED : serializerVarForNumber;
    }

    public write getState() {
        write writeVarForNumber = write.forNumber(this.state_);
        return writeVarForNumber == null ? write.UNRECOGNIZED : writeVarForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFields(Iterable<? extends IndexField> iterable) {
        ensureFieldsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(IndexField indexField) {
        indexField.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(indexField);
    }

    private void ensureFieldsIsMutable() {
        decodeString decodestring = this.fields_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.fields_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFields(int i, IndexField indexField) {
        indexField.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, indexField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.name_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFields() {
        this.fields_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryScope(serializer serializerVar) {
        this.queryScope_ = serializerVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(write writeVar) {
        this.state_ = writeVar.getNumber();
    }

    private Index() {
    }

    public static createNodeInfo newBuilder(Index index) {
        return (createNodeInfo) DEFAULT_INSTANCE.createBuilder(index);
    }

    public static Index parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Index) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Index parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Index parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Index parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFields(int i, IndexField indexField) {
        indexField.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, indexField);
    }

    public static Index parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Index parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Index parseFrom(InputStream inputStream) throws IOException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Index parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Index parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Index parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Index) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
