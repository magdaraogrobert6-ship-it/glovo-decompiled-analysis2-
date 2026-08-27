package com.google.firestore.v1;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings;
import o.AndroidComposeViewAccessibilityDelegateCompat_androidKtexcludeLineAndPageGranularitiesancestor1;
import o.AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1;
import o.AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList2;
import o.AndroidComposeViewAssistHelperMethodsO;
import o.AndroidComposeViewForceDarkModeQ;
import o.AndroidComposeViewSensitiveContent35;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.CompositionLocalsKtLocalUriHandler1;
import o.accesscontainsDescendant;
import o.component23;
import o.dataAvailable;
import o.decodeByte;
import o.decodeString;
import o.disallowForceDark;
import o.dumpRenderNodeData;
import o.enabled;
import o.excludeLineAndPageGranularities;
import o.findClosestParentNode;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getDisableContentCapture;
import o.getDisableContentCaptureannotations;
import o.getInfoIsCheckable;
import o.getInfoStateDescriptionOrNull;
import o.getInfoText;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;
import o.isRtl;
import o.isScreenReaderFocusable;
import o.propertiesDeleted;
import o.sendTypeViewScrolledAccessibilityEvent;
import o.setContentSensitivity;
import o.setDisableContentCapture;
import o.setTraversalValues;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class StructuredQuery extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final StructuredQuery DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile component23 PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Cursor endAt_;
    private Int32Value limit_;
    private int offset_;
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;
    private decodeString from_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString orderBy_ = GeneratedMessageLite.emptyProtobufList();

    public static final class CollectionSelector extends GeneratedMessageLite implements findClosestParentNode {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final CollectionSelector DEFAULT_INSTANCE;
        private static volatile component23 PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllDescendants() {
            this.allDescendants_ = false;
        }

        public static CollectionSelector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllDescendants(boolean z) {
            this.allDescendants_ = z;
        }

        public boolean getAllDescendants() {
            return this.allDescendants_;
        }

        public String getCollectionId() {
            return this.collectionId_;
        }

        static {
            CollectionSelector collectionSelector = new CollectionSelector();
            DEFAULT_INSTANCE = collectionSelector;
            GeneratedMessageLite.registerDefaultInstance(CollectionSelector.class, collectionSelector);
        }

        public static excludeLineAndPageGranularities newBuilder() {
            return (excludeLineAndPageGranularities) DEFAULT_INSTANCE.createBuilder();
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectionSelector parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new CollectionSelector();
                case 2:
                    return new excludeLineAndPageGranularities(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (CollectionSelector.class) {
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

        public getClipMetadata getCollectionIdBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.collectionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectionId(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCollectionIdBytes(getClipMetadata getclipmetadata) {
            AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
            this.collectionId_ = getclipmetadata.MediaMetadataCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCollectionId() {
            this.collectionId_ = getDefaultInstance().getCollectionId();
        }

        private CollectionSelector() {
        }

        public static excludeLineAndPageGranularities newBuilder(CollectionSelector collectionSelector) {
            return (excludeLineAndPageGranularities) DEFAULT_INSTANCE.createBuilder(collectionSelector);
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CollectionSelector parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static CollectionSelector parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static CollectionSelector parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static CollectionSelector parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CollectionSelector parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static CollectionSelector parseFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CollectionSelector parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CollectionSelector) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class CompositeFilter extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final CompositeFilter DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile component23 PARSER;
        private decodeString filters_ = GeneratedMessageLite.emptyProtobufList();
        private int op_;

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        public static CompositeFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        public List<Filter> getFiltersList() {
            return this.filters_;
        }

        public List<? extends AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList2> getFiltersOrBuilderList() {
            return this.filters_;
        }

        public int getOpValue() {
            return this.op_;
        }

        public enum read implements ifDebug {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            OR(2),
            UNRECOGNIZED(-1);

            public static final int AND_VALUE = 1;
            public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
            public static final int OR_VALUE = 2;
            private static final dataAvailable internalValueMap = new isRtl();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return getInfoText.IconCompatParcelizer;
            }

            read(int i) {
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
            public static read valueOf(int i) {
                return forNumber(i);
            }

            public static read forNumber(int i) {
                if (i == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return AND;
                }
                if (i != 2) {
                    return null;
                }
                return OR;
            }
        }

        static {
            CompositeFilter compositeFilter = new CompositeFilter();
            DEFAULT_INSTANCE = compositeFilter;
            GeneratedMessageLite.registerDefaultInstance(CompositeFilter.class, compositeFilter);
        }

        public static getDisableContentCaptureannotations newBuilder() {
            return (getDisableContentCaptureannotations) DEFAULT_INSTANCE.createBuilder();
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CompositeFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new CompositeFilter();
                case 2:
                    return new getDisableContentCaptureannotations(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", Filter.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (CompositeFilter.class) {
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

        public Filter getFilters(int i) {
            return (Filter) this.filters_.get(i);
        }

        public int getFiltersCount() {
            return this.filters_.size();
        }

        public AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList2 getFiltersOrBuilder(int i) {
            return (AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList2) this.filters_.get(i);
        }

        public read getOp() {
            read readVarForNumber = read.forNumber(this.op_);
            return readVarForNumber == null ? read.UNRECOGNIZED : readVarForNumber;
        }

        private CompositeFilter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFilters(Iterable<? extends Filter> iterable) {
            ensureFiltersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.filters_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFilters(Filter filter) {
            filter.getClass();
            ensureFiltersIsMutable();
            this.filters_.add(filter);
        }

        private void ensureFiltersIsMutable() {
            decodeString decodestring = this.filters_;
            if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                return;
            }
            this.filters_ = GeneratedMessageLite.mutableCopy(decodestring);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFilters(int i) {
            ensureFiltersIsMutable();
            this.filters_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFilters(int i, Filter filter) {
            filter.getClass();
            ensureFiltersIsMutable();
            this.filters_.set(i, filter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilters() {
            this.filters_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(read readVar) {
            this.op_ = readVar.getNumber();
        }

        public static getDisableContentCaptureannotations newBuilder(CompositeFilter compositeFilter) {
            return (getDisableContentCaptureannotations) DEFAULT_INSTANCE.createBuilder(compositeFilter);
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CompositeFilter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static CompositeFilter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static CompositeFilter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFilters(int i, Filter filter) {
            filter.getClass();
            ensureFiltersIsMutable();
            this.filters_.add(i, filter);
        }

        public static CompositeFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CompositeFilter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static CompositeFilter parseFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CompositeFilter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (CompositeFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class FieldFilter extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final FieldFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile component23 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private FieldReference field_;
        private int op_;
        private Value value_;

        private FieldFilter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = null;
            this.bitField0_ &= -3;
        }

        public static FieldFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        public int getOpValue() {
            return this.op_;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasValue() {
            return (this.bitField0_ & 2) != 0;
        }

        public enum read implements ifDebug {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);

            public static final int ARRAY_CONTAINS_ANY_VALUE = 9;
            public static final int ARRAY_CONTAINS_VALUE = 7;
            public static final int EQUAL_VALUE = 5;
            public static final int GREATER_THAN_OR_EQUAL_VALUE = 4;
            public static final int GREATER_THAN_VALUE = 3;
            public static final int IN_VALUE = 8;
            public static final int LESS_THAN_OR_EQUAL_VALUE = 2;
            public static final int LESS_THAN_VALUE = 1;
            public static final int NOT_EQUAL_VALUE = 6;
            public static final int NOT_IN_VALUE = 10;
            public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
            private static final dataAvailable internalValueMap = new setTraversalValues();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return setDisableContentCapture.read;
            }

            read(int i) {
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

            public static read forNumber(int i) {
                switch (i) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case 9:
                        return ARRAY_CONTAINS_ANY;
                    case 10:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Deprecated
            public static read valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            FieldFilter fieldFilter = new FieldFilter();
            DEFAULT_INSTANCE = fieldFilter;
            GeneratedMessageLite.registerDefaultInstance(FieldFilter.class, fieldFilter);
        }

        public static AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings newBuilder() {
            return (AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new FieldFilter();
                case 2:
                    return new AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "field_", "op_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (FieldFilter.class) {
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

        public read getOp() {
            read readVarForNumber = read.forNumber(this.op_);
            return readVarForNumber == null ? read.UNRECOGNIZED : readVarForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 == null || fieldReference2 == FieldReference.getDefaultInstance()) {
                this.field_ = fieldReference;
            } else {
                isScreenReaderFocusable isscreenreaderfocusableNewBuilder = FieldReference.newBuilder(this.field_);
                isscreenreaderfocusableNewBuilder.read(fieldReference);
                this.field_ = (FieldReference) isscreenreaderfocusableNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeValue(Value value) {
            value.getClass();
            Value value2 = this.value_;
            if (value2 == null || value2 == Value.getDefaultInstance()) {
                this.value_ = value;
            } else {
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder(this.value_);
                accesscontainsdescendantNewBuilder.read(value);
                this.value_ = (Value) accesscontainsdescendantNewBuilder.read();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(Value value) {
            value.getClass();
            this.value_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(read readVar) {
            this.op_ = readVar.getNumber();
        }

        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.getDefaultInstance() : fieldReference;
        }

        public Value getValue() {
            Value value = this.value_;
            return value == null ? Value.getDefaultInstance() : value;
        }

        public static AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings newBuilder(FieldFilter fieldFilter) {
            return (AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings) DEFAULT_INSTANCE.createBuilder(fieldFilter);
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldFilter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldFilter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static FieldFilter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldFilter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldFilter parseFrom(InputStream inputStream) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldFilter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class FieldReference extends GeneratedMessageLite implements propertiesDeleted {
        private static final FieldReference DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile component23 PARSER;
        private String fieldPath_ = "";

        public static FieldReference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public String getFieldPath() {
            return this.fieldPath_;
        }

        static {
            FieldReference fieldReference = new FieldReference();
            DEFAULT_INSTANCE = fieldReference;
            GeneratedMessageLite.registerDefaultInstance(FieldReference.class, fieldReference);
        }

        public static isScreenReaderFocusable newBuilder() {
            return (isScreenReaderFocusable) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldReference parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new FieldReference();
                case 2:
                    return new isScreenReaderFocusable(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (FieldReference.class) {
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
        public void clearFieldPath() {
            this.fieldPath_ = getDefaultInstance().getFieldPath();
        }

        private FieldReference() {
        }

        public static isScreenReaderFocusable newBuilder(FieldReference fieldReference) {
            return (isScreenReaderFocusable) DEFAULT_INSTANCE.createBuilder(fieldReference);
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldReference parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldReference parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static FieldReference parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldReference parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldReference parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldReference parseFrom(InputStream inputStream) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldReference parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (FieldReference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class Filter extends GeneratedMessageLite implements AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList2 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final Filter DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile component23 PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFilterType() {
            this.filterTypeCase_ = 0;
            this.filterType_ = null;
        }

        public static Filter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasCompositeFilter() {
            return this.filterTypeCase_ == 1;
        }

        public boolean hasFieldFilter() {
            return this.filterTypeCase_ == 2;
        }

        public boolean hasUnaryFilter() {
            return this.filterTypeCase_ == 3;
        }

        public enum write {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);

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
                    return FILTERTYPE_NOT_SET;
                }
                if (i == 1) {
                    return COMPOSITE_FILTER;
                }
                if (i == 2) {
                    return FIELD_FILTER;
                }
                if (i != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            Filter filter = new Filter();
            DEFAULT_INSTANCE = filter;
            GeneratedMessageLite.registerDefaultInstance(Filter.class, filter);
        }

        public static AndroidComposeViewAssistHelperMethodsO newBuilder() {
            return (AndroidComposeViewAssistHelperMethodsO) DEFAULT_INSTANCE.createBuilder();
        }

        public static Filter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Filter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Filter();
                case 2:
                    return new AndroidComposeViewAssistHelperMethodsO(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", CompositeFilter.class, FieldFilter.class, UnaryFilter.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Filter.class) {
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

        public write getFilterTypeCase() {
            return write.forNumber(this.filterTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCompositeFilter(CompositeFilter compositeFilter) {
            compositeFilter.getClass();
            if (this.filterTypeCase_ != 1 || this.filterType_ == CompositeFilter.getDefaultInstance()) {
                this.filterType_ = compositeFilter;
            } else {
                getDisableContentCaptureannotations getdisablecontentcaptureannotationsNewBuilder = CompositeFilter.newBuilder((CompositeFilter) this.filterType_);
                getdisablecontentcaptureannotationsNewBuilder.read(compositeFilter);
                this.filterType_ = getdisablecontentcaptureannotationsNewBuilder.read();
            }
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFieldFilter(FieldFilter fieldFilter) {
            fieldFilter.getClass();
            if (this.filterTypeCase_ != 2 || this.filterType_ == FieldFilter.getDefaultInstance()) {
                this.filterType_ = fieldFilter;
            } else {
                AndroidComposeViewAccessibilityDelegateCompat_androidKtWhenMappings androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder = FieldFilter.newBuilder((FieldFilter) this.filterType_);
                androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.read(fieldFilter);
                this.filterType_ = androidComposeViewAccessibilityDelegateCompat_androidKtWhenMappingsNewBuilder.read();
            }
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeUnaryFilter(UnaryFilter unaryFilter) {
            unaryFilter.getClass();
            if (this.filterTypeCase_ != 3 || this.filterType_ == UnaryFilter.getDefaultInstance()) {
                this.filterType_ = unaryFilter;
            } else {
                disallowForceDark disallowforcedarkNewBuilder = UnaryFilter.newBuilder((UnaryFilter) this.filterType_);
                disallowforcedarkNewBuilder.read(unaryFilter);
                this.filterType_ = disallowforcedarkNewBuilder.read();
            }
            this.filterTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompositeFilter(CompositeFilter compositeFilter) {
            compositeFilter.getClass();
            this.filterType_ = compositeFilter;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldFilter(FieldFilter fieldFilter) {
            fieldFilter.getClass();
            this.filterType_ = fieldFilter;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnaryFilter(UnaryFilter unaryFilter) {
            unaryFilter.getClass();
            this.filterType_ = unaryFilter;
            this.filterTypeCase_ = 3;
        }

        private Filter() {
        }

        public CompositeFilter getCompositeFilter() {
            return this.filterTypeCase_ == 1 ? (CompositeFilter) this.filterType_ : CompositeFilter.getDefaultInstance();
        }

        public FieldFilter getFieldFilter() {
            return this.filterTypeCase_ == 2 ? (FieldFilter) this.filterType_ : FieldFilter.getDefaultInstance();
        }

        public UnaryFilter getUnaryFilter() {
            return this.filterTypeCase_ == 3 ? (UnaryFilter) this.filterType_ : UnaryFilter.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        public static AndroidComposeViewAssistHelperMethodsO newBuilder(Filter filter) {
            return (AndroidComposeViewAssistHelperMethodsO) DEFAULT_INSTANCE.createBuilder(filter);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Filter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Filter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Filter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Filter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Filter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Filter parseFrom(InputStream inputStream) throws IOException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Filter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Filter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class Order extends GeneratedMessageLite implements AndroidComposeViewAccessibilityDelegateCompat_androidKtexcludeLineAndPageGranularitiesancestor1 {
        private static final Order DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile component23 PARSER;
        private int bitField0_;
        private int direction_;
        private FieldReference field_;

        private Order() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirection() {
            this.direction_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = null;
            this.bitField0_ &= -2;
        }

        public static Order getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectionValue(int i) {
            this.direction_ = i;
        }

        public int getDirectionValue() {
            return this.direction_;
        }

        public boolean hasField() {
            return (this.bitField0_ & 1) != 0;
        }

        static {
            Order order = new Order();
            DEFAULT_INSTANCE = order;
            GeneratedMessageLite.registerDefaultInstance(Order.class, order);
        }

        public static AndroidComposeViewForceDarkModeQ newBuilder() {
            return (AndroidComposeViewForceDarkModeQ) DEFAULT_INSTANCE.createBuilder();
        }

        public static Order parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Order) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Order parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Order();
                case 2:
                    return new AndroidComposeViewForceDarkModeQ(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Order.class) {
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

        public IconCompatParcelizer getDirection() {
            IconCompatParcelizer iconCompatParcelizerForNumber = IconCompatParcelizer.forNumber(this.direction_);
            return iconCompatParcelizerForNumber == null ? IconCompatParcelizer.UNRECOGNIZED : iconCompatParcelizerForNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 == null || fieldReference2 == FieldReference.getDefaultInstance()) {
                this.field_ = fieldReference;
            } else {
                isScreenReaderFocusable isscreenreaderfocusableNewBuilder = FieldReference.newBuilder(this.field_);
                isscreenreaderfocusableNewBuilder.read(fieldReference);
                this.field_ = (FieldReference) isscreenreaderfocusableNewBuilder.read();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirection(IconCompatParcelizer iconCompatParcelizer) {
            this.direction_ = iconCompatParcelizer.getNumber();
        }

        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            return fieldReference == null ? FieldReference.getDefaultInstance() : fieldReference;
        }

        public static AndroidComposeViewForceDarkModeQ newBuilder(Order order) {
            return (AndroidComposeViewForceDarkModeQ) DEFAULT_INSTANCE.createBuilder(order);
        }

        public static Order parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Order) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Order parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Order parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Order parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Order parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Order parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Order parseFrom(InputStream inputStream) throws IOException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Order parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Order parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Order parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Order) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Projection extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final Projection DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile component23 PARSER;
        private decodeString fields_ = GeneratedMessageLite.emptyProtobufList();

        public static Projection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public List<FieldReference> getFieldsList() {
            return this.fields_;
        }

        public List<? extends propertiesDeleted> getFieldsOrBuilderList() {
            return this.fields_;
        }

        static {
            Projection projection = new Projection();
            DEFAULT_INSTANCE = projection;
            GeneratedMessageLite.registerDefaultInstance(Projection.class, projection);
        }

        public static AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1 newBuilder() {
            return (AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1) DEFAULT_INSTANCE.createBuilder();
        }

        public static Projection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Projection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Projection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Projection();
                case 2:
                    return new AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", FieldReference.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Projection.class) {
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

        public FieldReference getFields(int i) {
            return (FieldReference) this.fields_.get(i);
        }

        public int getFieldsCount() {
            return this.fields_.size();
        }

        public propertiesDeleted getFieldsOrBuilder(int i) {
            return (propertiesDeleted) this.fields_.get(i);
        }

        private Projection() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFields(Iterable<? extends FieldReference> iterable) {
            ensureFieldsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.fields_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(FieldReference fieldReference) {
            fieldReference.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(fieldReference);
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
        public void setFields(int i, FieldReference fieldReference) {
            fieldReference.getClass();
            ensureFieldsIsMutable();
            this.fields_.set(i, fieldReference);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFields() {
            this.fields_ = GeneratedMessageLite.emptyProtobufList();
        }

        public static AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1 newBuilder(Projection projection) {
            return (AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1) DEFAULT_INSTANCE.createBuilder(projection);
        }

        public static Projection parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Projection) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Projection parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Projection parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Projection parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFields(int i, FieldReference fieldReference) {
            fieldReference.getClass();
            ensureFieldsIsMutable();
            this.fields_.add(i, fieldReference);
        }

        public static Projection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Projection parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Projection parseFrom(InputStream inputStream) throws IOException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Projection parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Projection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class UnaryFilter extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final UnaryFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile component23 PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOp() {
            this.op_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperandType() {
            this.operandTypeCase_ = 0;
            this.operandType_ = null;
        }

        public static UnaryFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpValue(int i) {
            this.op_ = i;
        }

        public int getOpValue() {
            return this.op_;
        }

        public boolean hasField() {
            return this.operandTypeCase_ == 2;
        }

        /* JADX INFO: loaded from: classes4.dex */
        public enum read {
            FIELD(2),
            OPERANDTYPE_NOT_SET(0);

            private final int value;

            public int getNumber() {
                return this.value;
            }

            read(int i) {
                this.value = i;
            }

            public static read forNumber(int i) {
                if (i == 0) {
                    return OPERANDTYPE_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return FIELD;
            }

            @Deprecated
            public static read valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum write implements ifDebug {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);

            public static final int IS_NAN_VALUE = 2;
            public static final int IS_NOT_NAN_VALUE = 4;
            public static final int IS_NOT_NULL_VALUE = 5;
            public static final int IS_NULL_VALUE = 3;
            public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
            private static final dataAvailable internalValueMap = new setContentSensitivity();
            private final int value;

            public static dataAvailable internalGetValueMap() {
                return internalValueMap;
            }

            public static decodeByte internalGetVerifier() {
                return AndroidComposeViewSensitiveContent35.RemoteActionCompatParcelizer;
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
                    return OPERATOR_UNSPECIFIED;
                }
                if (i == 2) {
                    return IS_NAN;
                }
                if (i == 3) {
                    return IS_NULL;
                }
                if (i == 4) {
                    return IS_NOT_NAN;
                }
                if (i != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }
        }

        static {
            UnaryFilter unaryFilter = new UnaryFilter();
            DEFAULT_INSTANCE = unaryFilter;
            GeneratedMessageLite.registerDefaultInstance(UnaryFilter.class, unaryFilter);
        }

        public static disallowForceDark newBuilder() {
            return (disallowForceDark) DEFAULT_INSTANCE.createBuilder();
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnaryFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new UnaryFilter();
                case 2:
                    return new disallowForceDark(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", FieldReference.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (UnaryFilter.class) {
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

        public write getOp() {
            write writeVarForNumber = write.forNumber(this.op_);
            return writeVarForNumber == null ? write.UNRECOGNIZED : writeVarForNumber;
        }

        public read getOperandTypeCase() {
            return read.forNumber(this.operandTypeCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            if (this.operandTypeCase_ != 2 || this.operandType_ == FieldReference.getDefaultInstance()) {
                this.operandType_ = fieldReference;
            } else {
                isScreenReaderFocusable isscreenreaderfocusableNewBuilder = FieldReference.newBuilder((FieldReference) this.operandType_);
                isscreenreaderfocusableNewBuilder.read(fieldReference);
                this.operandType_ = isscreenreaderfocusableNewBuilder.read();
            }
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.operandType_ = fieldReference;
            this.operandTypeCase_ = 2;
        }

        private UnaryFilter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOp(write writeVar) {
            this.op_ = writeVar.getNumber();
        }

        public FieldReference getField() {
            return this.operandTypeCase_ == 2 ? (FieldReference) this.operandType_ : FieldReference.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            if (this.operandTypeCase_ == 2) {
                this.operandTypeCase_ = 0;
                this.operandType_ = null;
            }
        }

        public static disallowForceDark newBuilder(UnaryFilter unaryFilter) {
            return (disallowForceDark) DEFAULT_INSTANCE.createBuilder(unaryFilter);
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static UnaryFilter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static UnaryFilter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static UnaryFilter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static UnaryFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UnaryFilter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static UnaryFilter parseFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UnaryFilter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (UnaryFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAt() {
        this.endAt_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimit() {
        this.limit_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelect() {
        this.select_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartAt() {
        this.startAt_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWhere() {
        this.where_ = null;
        this.bitField0_ &= -3;
    }

    public static StructuredQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(int i) {
        this.offset_ = i;
    }

    public List<CollectionSelector> getFromList() {
        return this.from_;
    }

    public List<? extends findClosestParentNode> getFromOrBuilderList() {
        return this.from_;
    }

    public int getOffset() {
        return this.offset_;
    }

    public List<Order> getOrderByList() {
        return this.orderBy_;
    }

    public List<? extends AndroidComposeViewAccessibilityDelegateCompat_androidKtexcludeLineAndPageGranularitiesancestor1> getOrderByOrBuilderList() {
        return this.orderBy_;
    }

    public boolean hasEndAt() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLimit() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSelect() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartAt() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWhere() {
        return (this.bitField0_ & 2) != 0;
    }

    public enum IconCompatParcelizer implements ifDebug {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);

        public static final int ASCENDING_VALUE = 1;
        public static final int DESCENDING_VALUE = 2;
        public static final int DIRECTION_UNSPECIFIED_VALUE = 0;
        private static final dataAvailable internalValueMap = new getInfoIsCheckable();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return getInfoStateDescriptionOrNull.write;
        }

        IconCompatParcelizer(int i) {
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
        public static IconCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static IconCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return DIRECTION_UNSPECIFIED;
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

    static {
        StructuredQuery structuredQuery = new StructuredQuery();
        DEFAULT_INSTANCE = structuredQuery;
        GeneratedMessageLite.registerDefaultInstance(StructuredQuery.class, structuredQuery);
    }

    public static getDisableContentCapture newBuilder() {
        return (getDisableContentCapture) DEFAULT_INSTANCE.createBuilder();
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (enabled.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new StructuredQuery();
            case 2:
                return new getDisableContentCapture(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b\u0005ဉ\u0004\u0006\u0004\u0007ဉ\u0002\bဉ\u0003", new Object[]{"bitField0_", "select_", "from_", CollectionSelector.class, "where_", "orderBy_", Order.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (StructuredQuery.class) {
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

    public CollectionSelector getFrom(int i) {
        return (CollectionSelector) this.from_.get(i);
    }

    public int getFromCount() {
        return this.from_.size();
    }

    public findClosestParentNode getFromOrBuilder(int i) {
        return (findClosestParentNode) this.from_.get(i);
    }

    public Order getOrderBy(int i) {
        return (Order) this.orderBy_.get(i);
    }

    public int getOrderByCount() {
        return this.orderBy_.size();
    }

    public AndroidComposeViewAccessibilityDelegateCompat_androidKtexcludeLineAndPageGranularitiesancestor1 getOrderByOrBuilder(int i) {
        return (AndroidComposeViewAccessibilityDelegateCompat_androidKtexcludeLineAndPageGranularitiesancestor1) this.orderBy_.get(i);
    }

    private StructuredQuery() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFrom(Iterable<? extends CollectionSelector> iterable) {
        ensureFromIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.from_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOrderBy(Iterable<? extends Order> iterable) {
        ensureOrderByIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.orderBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrom(CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        ensureFromIsMutable();
        this.from_.add(collectionSelector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrderBy(Order order) {
        order.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.add(order);
    }

    private void ensureFromIsMutable() {
        decodeString decodestring = this.from_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.from_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureOrderByIsMutable() {
        decodeString decodestring = this.orderBy_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.orderBy_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndAt(Cursor cursor) {
        cursor.getClass();
        Cursor cursor2 = this.endAt_;
        if (cursor2 == null || cursor2 == Cursor.getDefaultInstance()) {
            this.endAt_ = cursor;
        } else {
            sendTypeViewScrolledAccessibilityEvent sendtypeviewscrolledaccessibilityeventNewBuilder = Cursor.newBuilder(this.endAt_);
            sendtypeviewscrolledaccessibilityeventNewBuilder.read(cursor);
            this.endAt_ = (Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder.read();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLimit(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.limit_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.limit_ = int32Value;
        } else {
            CompositionLocalsKtLocalUriHandler1 compositionLocalsKtLocalUriHandler1NewBuilder = Int32Value.newBuilder(this.limit_);
            compositionLocalsKtLocalUriHandler1NewBuilder.read(int32Value);
            this.limit_ = (Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.read();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelect(Projection projection) {
        projection.getClass();
        Projection projection2 = this.select_;
        if (projection2 == null || projection2 == Projection.getDefaultInstance()) {
            this.select_ = projection;
        } else {
            AndroidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1 androidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1NewBuilder = Projection.newBuilder(this.select_);
            androidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1NewBuilder.read(projection);
            this.select_ = (Projection) androidComposeViewAccessibilityDelegateCompat_androidKtsetTraversalValuessemanticsOrderList1NewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartAt(Cursor cursor) {
        cursor.getClass();
        Cursor cursor2 = this.startAt_;
        if (cursor2 == null || cursor2 == Cursor.getDefaultInstance()) {
            this.startAt_ = cursor;
        } else {
            sendTypeViewScrolledAccessibilityEvent sendtypeviewscrolledaccessibilityeventNewBuilder = Cursor.newBuilder(this.startAt_);
            sendtypeviewscrolledaccessibilityeventNewBuilder.read(cursor);
            this.startAt_ = (Cursor) sendtypeviewscrolledaccessibilityeventNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWhere(Filter filter) {
        filter.getClass();
        Filter filter2 = this.where_;
        if (filter2 == null || filter2 == Filter.getDefaultInstance()) {
            this.where_ = filter;
        } else {
            AndroidComposeViewAssistHelperMethodsO androidComposeViewAssistHelperMethodsONewBuilder = Filter.newBuilder(this.where_);
            androidComposeViewAssistHelperMethodsONewBuilder.read(filter);
            this.where_ = (Filter) androidComposeViewAssistHelperMethodsONewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFrom(int i) {
        ensureFromIsMutable();
        this.from_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOrderBy(int i) {
        ensureOrderByIsMutable();
        this.orderBy_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAt(Cursor cursor) {
        cursor.getClass();
        this.endAt_ = cursor;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(int i, CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        ensureFromIsMutable();
        this.from_.set(i, collectionSelector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimit(Int32Value int32Value) {
        int32Value.getClass();
        this.limit_ = int32Value;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderBy(int i, Order order) {
        order.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.set(i, order);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelect(Projection projection) {
        projection.getClass();
        this.select_ = projection;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartAt(Cursor cursor) {
        cursor.getClass();
        this.startAt_ = cursor;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhere(Filter filter) {
        filter.getClass();
        this.where_ = filter;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrderBy() {
        this.orderBy_ = GeneratedMessageLite.emptyProtobufList();
    }

    public Cursor getEndAt() {
        Cursor cursor = this.endAt_;
        return cursor == null ? Cursor.getDefaultInstance() : cursor;
    }

    public Int32Value getLimit() {
        Int32Value int32Value = this.limit_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public Projection getSelect() {
        Projection projection = this.select_;
        return projection == null ? Projection.getDefaultInstance() : projection;
    }

    public Cursor getStartAt() {
        Cursor cursor = this.startAt_;
        return cursor == null ? Cursor.getDefaultInstance() : cursor;
    }

    public Filter getWhere() {
        Filter filter = this.where_;
        return filter == null ? Filter.getDefaultInstance() : filter;
    }

    public static getDisableContentCapture newBuilder(StructuredQuery structuredQuery) {
        return (getDisableContentCapture) DEFAULT_INSTANCE.createBuilder(structuredQuery);
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredQuery parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredQuery parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static StructuredQuery parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrom(int i, CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        ensureFromIsMutable();
        this.from_.add(i, collectionSelector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOrderBy(int i, Order order) {
        order.getClass();
        ensureOrderByIsMutable();
        this.orderBy_.add(i, order);
    }

    public static StructuredQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StructuredQuery parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredQuery parseFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredQuery parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
