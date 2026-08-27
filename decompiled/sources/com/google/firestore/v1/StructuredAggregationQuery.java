package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalSoftwareKeyboardController1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessexcludeLineAndPageGranularities;
import o.accessgetInfoIsCheckable;
import o.accessgetInfoStateDescriptionOrNull;
import o.accessgetInfoText;
import o.accessibilityEquals;
import o.accessisRtl;
import o.accesspropertiesDeleted;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getDisableContentCapture;
import o.getLocalProvidableScrollCaptureInProgress;
import o.isScreenReaderFocusable;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class StructuredAggregationQuery extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int AGGREGATIONS_FIELD_NUMBER = 3;
    private static final StructuredAggregationQuery DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 1;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private decodeString aggregations_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Aggregation extends GeneratedMessageLite implements accesspropertiesDeleted {
        public static final int ALIAS_FIELD_NUMBER = 7;
        public static final int AVG_FIELD_NUMBER = 3;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final Aggregation DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int SUM_FIELD_NUMBER = 2;
        private Object operator_;
        private int operatorCase_ = 0;
        private String alias_ = "";

        public static final class Avg extends GeneratedMessageLite implements dumpRenderNodeData {
            private static final Avg DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile component23 PARSER;
            private int bitField0_;
            private StructuredQuery.FieldReference field_;

            private Avg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearField() {
                this.field_ = null;
                this.bitField0_ &= -2;
            }

            public static Avg getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public boolean hasField() {
                return (this.bitField0_ & 1) != 0;
            }

            static {
                Avg avg = new Avg();
                DEFAULT_INSTANCE = avg;
                GeneratedMessageLite.registerDefaultInstance(Avg.class, avg);
            }

            public static accessgetInfoText newBuilder() {
                return (accessgetInfoText) DEFAULT_INSTANCE.createBuilder();
            }

            public static Avg parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Avg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Avg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static component23 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
                component23 compositionLocalsKtLocalLayoutDirection1;
                switch (accessexcludeLineAndPageGranularities.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                    case 1:
                        return new Avg();
                    case 2:
                        return new accessgetInfoText(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        component23 component23Var = PARSER;
                        if (component23Var != null) {
                            return component23Var;
                        }
                        synchronized (Avg.class) {
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
            public void mergeField(StructuredQuery.FieldReference fieldReference) {
                fieldReference.getClass();
                StructuredQuery.FieldReference fieldReference2 = this.field_;
                if (fieldReference2 == null || fieldReference2 == StructuredQuery.FieldReference.getDefaultInstance()) {
                    this.field_ = fieldReference;
                } else {
                    isScreenReaderFocusable isscreenreaderfocusableNewBuilder = StructuredQuery.FieldReference.newBuilder(this.field_);
                    isscreenreaderfocusableNewBuilder.read(fieldReference);
                    this.field_ = (StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.read();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setField(StructuredQuery.FieldReference fieldReference) {
                fieldReference.getClass();
                this.field_ = fieldReference;
                this.bitField0_ |= 1;
            }

            public StructuredQuery.FieldReference getField() {
                StructuredQuery.FieldReference fieldReference = this.field_;
                return fieldReference == null ? StructuredQuery.FieldReference.getDefaultInstance() : fieldReference;
            }

            public static accessgetInfoText newBuilder(Avg avg) {
                return (accessgetInfoText) DEFAULT_INSTANCE.createBuilder(avg);
            }

            public static Avg parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Avg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Avg parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
            }

            public static Avg parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
            }

            public static Avg parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
            }

            public static Avg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Avg parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
            }

            public static Avg parseFrom(InputStream inputStream) throws IOException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Avg parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Avg parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Avg parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Avg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
            }
        }

        public static final class Count extends GeneratedMessageLite implements dumpRenderNodeData {
            private static final Count DEFAULT_INSTANCE;
            private static volatile component23 PARSER = null;
            public static final int UP_TO_FIELD_NUMBER = 1;
            private int bitField0_;
            private Int64Value upTo_;

            private Count() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUpTo() {
                this.upTo_ = null;
                this.bitField0_ &= -2;
            }

            public static Count getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public boolean hasUpTo() {
                return (this.bitField0_ & 1) != 0;
            }

            static {
                Count count = new Count();
                DEFAULT_INSTANCE = count;
                GeneratedMessageLite.registerDefaultInstance(Count.class, count);
            }

            public static accessgetInfoIsCheckable newBuilder() {
                return (accessgetInfoIsCheckable) DEFAULT_INSTANCE.createBuilder();
            }

            public static Count parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Count) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Count parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static component23 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
                component23 compositionLocalsKtLocalLayoutDirection1;
                switch (accessexcludeLineAndPageGranularities.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                    case 1:
                        return new Count();
                    case 2:
                        return new accessgetInfoIsCheckable(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "upTo_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        component23 component23Var = PARSER;
                        if (component23Var != null) {
                            return component23Var;
                        }
                        synchronized (Count.class) {
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
            public void mergeUpTo(Int64Value int64Value) {
                int64Value.getClass();
                Int64Value int64Value2 = this.upTo_;
                if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
                    this.upTo_ = int64Value;
                } else {
                    CompositionLocalsKtLocalSoftwareKeyboardController1 compositionLocalsKtLocalSoftwareKeyboardController1NewBuilder = Int64Value.newBuilder(this.upTo_);
                    compositionLocalsKtLocalSoftwareKeyboardController1NewBuilder.read(int64Value);
                    this.upTo_ = (Int64Value) compositionLocalsKtLocalSoftwareKeyboardController1NewBuilder.read();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUpTo(Int64Value int64Value) {
                int64Value.getClass();
                this.upTo_ = int64Value;
                this.bitField0_ |= 1;
            }

            public Int64Value getUpTo() {
                Int64Value int64Value = this.upTo_;
                return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
            }

            public static accessgetInfoIsCheckable newBuilder(Count count) {
                return (accessgetInfoIsCheckable) DEFAULT_INSTANCE.createBuilder(count);
            }

            public static Count parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Count) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Count parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
            }

            public static Count parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
            }

            public static Count parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
            }

            public static Count parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Count parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
            }

            public static Count parseFrom(InputStream inputStream) throws IOException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Count parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Count parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Count parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Count) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
            }
        }

        public static final class Sum extends GeneratedMessageLite implements dumpRenderNodeData {
            private static final Sum DEFAULT_INSTANCE;
            public static final int FIELD_FIELD_NUMBER = 1;
            private static volatile component23 PARSER;
            private int bitField0_;
            private StructuredQuery.FieldReference field_;

            private Sum() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearField() {
                this.field_ = null;
                this.bitField0_ &= -2;
            }

            public static Sum getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public boolean hasField() {
                return (this.bitField0_ & 1) != 0;
            }

            static {
                Sum sum = new Sum();
                DEFAULT_INSTANCE = sum;
                GeneratedMessageLite.registerDefaultInstance(Sum.class, sum);
            }

            public static accessisRtl newBuilder() {
                return (accessisRtl) DEFAULT_INSTANCE.createBuilder();
            }

            public static Sum parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Sum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Sum parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static component23 parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
                component23 compositionLocalsKtLocalLayoutDirection1;
                switch (accessexcludeLineAndPageGranularities.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                    case 1:
                        return new Sum();
                    case 2:
                        return new accessisRtl(DEFAULT_INSTANCE);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "field_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        component23 component23Var = PARSER;
                        if (component23Var != null) {
                            return component23Var;
                        }
                        synchronized (Sum.class) {
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
            public void mergeField(StructuredQuery.FieldReference fieldReference) {
                fieldReference.getClass();
                StructuredQuery.FieldReference fieldReference2 = this.field_;
                if (fieldReference2 == null || fieldReference2 == StructuredQuery.FieldReference.getDefaultInstance()) {
                    this.field_ = fieldReference;
                } else {
                    isScreenReaderFocusable isscreenreaderfocusableNewBuilder = StructuredQuery.FieldReference.newBuilder(this.field_);
                    isscreenreaderfocusableNewBuilder.read(fieldReference);
                    this.field_ = (StructuredQuery.FieldReference) isscreenreaderfocusableNewBuilder.read();
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setField(StructuredQuery.FieldReference fieldReference) {
                fieldReference.getClass();
                this.field_ = fieldReference;
                this.bitField0_ |= 1;
            }

            public StructuredQuery.FieldReference getField() {
                StructuredQuery.FieldReference fieldReference = this.field_;
                return fieldReference == null ? StructuredQuery.FieldReference.getDefaultInstance() : fieldReference;
            }

            public static accessisRtl newBuilder(Sum sum) {
                return (accessisRtl) DEFAULT_INSTANCE.createBuilder(sum);
            }

            public static Sum parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Sum) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Sum parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
            }

            public static Sum parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
            }

            public static Sum parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
            }

            public static Sum parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Sum parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
            }

            public static Sum parseFrom(InputStream inputStream) throws IOException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Sum parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
            }

            public static Sum parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Sum parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
                return (Sum) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperator() {
            this.operatorCase_ = 0;
            this.operator_ = null;
        }

        public static Aggregation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public String getAlias() {
            return this.alias_;
        }

        public boolean hasAvg() {
            return this.operatorCase_ == 3;
        }

        public boolean hasCount() {
            return this.operatorCase_ == 1;
        }

        public boolean hasSum() {
            return this.operatorCase_ == 2;
        }

        public enum RemoteActionCompatParcelizer {
            COUNT(1),
            SUM(2),
            AVG(3),
            OPERATOR_NOT_SET(0);

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
                    return OPERATOR_NOT_SET;
                }
                if (i == 1) {
                    return COUNT;
                }
                if (i == 2) {
                    return SUM;
                }
                if (i != 3) {
                    return null;
                }
                return AVG;
            }
        }

        static {
            Aggregation aggregation = new Aggregation();
            DEFAULT_INSTANCE = aggregation;
            GeneratedMessageLite.registerDefaultInstance(Aggregation.class, aggregation);
        }

        public static accessgetInfoStateDescriptionOrNull newBuilder() {
            return (accessgetInfoStateDescriptionOrNull) DEFAULT_INSTANCE.createBuilder();
        }

        public static Aggregation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Aggregation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (accessexcludeLineAndPageGranularities.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Aggregation();
                case 2:
                    return new accessgetInfoStateDescriptionOrNull(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0007Ȉ", new Object[]{"operator_", "operatorCase_", Count.class, Sum.class, Avg.class, "alias_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Aggregation.class) {
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

        public getClipMetadata getAliasBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.alias_);
        }

        public RemoteActionCompatParcelizer getOperatorCase() {
            return RemoteActionCompatParcelizer.forNumber(this.operatorCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAvg(Avg avg) {
            avg.getClass();
            if (this.operatorCase_ != 3 || this.operator_ == Avg.getDefaultInstance()) {
                this.operator_ = avg;
            } else {
                accessgetInfoText accessgetinfotextNewBuilder = Avg.newBuilder((Avg) this.operator_);
                accessgetinfotextNewBuilder.read(avg);
                this.operator_ = accessgetinfotextNewBuilder.read();
            }
            this.operatorCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCount(Count count) {
            count.getClass();
            if (this.operatorCase_ != 1 || this.operator_ == Count.getDefaultInstance()) {
                this.operator_ = count;
            } else {
                accessgetInfoIsCheckable accessgetinfoischeckableNewBuilder = Count.newBuilder((Count) this.operator_);
                accessgetinfoischeckableNewBuilder.read(count);
                this.operator_ = accessgetinfoischeckableNewBuilder.read();
            }
            this.operatorCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSum(Sum sum) {
            sum.getClass();
            if (this.operatorCase_ != 2 || this.operator_ == Sum.getDefaultInstance()) {
                this.operator_ = sum;
            } else {
                accessisRtl accessisrtlNewBuilder = Sum.newBuilder((Sum) this.operator_);
                accessisrtlNewBuilder.read(sum);
                this.operator_ = accessisrtlNewBuilder.read();
            }
            this.operatorCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlias(String str) {
            str.getClass();
            this.alias_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAliasBytes(getClipMetadata getclipmetadata) {
            AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
            this.alias_ = getclipmetadata.MediaMetadataCompat();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAvg(Avg avg) {
            avg.getClass();
            this.operator_ = avg;
            this.operatorCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(Count count) {
            count.getClass();
            this.operator_ = count;
            this.operatorCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSum(Sum sum) {
            sum.getClass();
            this.operator_ = sum;
            this.operatorCase_ = 2;
        }

        private Aggregation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlias() {
            this.alias_ = getDefaultInstance().getAlias();
        }

        public Avg getAvg() {
            return this.operatorCase_ == 3 ? (Avg) this.operator_ : Avg.getDefaultInstance();
        }

        public Count getCount() {
            return this.operatorCase_ == 1 ? (Count) this.operator_ : Count.getDefaultInstance();
        }

        public Sum getSum() {
            return this.operatorCase_ == 2 ? (Sum) this.operator_ : Sum.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAvg() {
            if (this.operatorCase_ == 3) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            if (this.operatorCase_ == 1) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSum() {
            if (this.operatorCase_ == 2) {
                this.operatorCase_ = 0;
                this.operator_ = null;
            }
        }

        public static accessgetInfoStateDescriptionOrNull newBuilder(Aggregation aggregation) {
            return (accessgetInfoStateDescriptionOrNull) DEFAULT_INSTANCE.createBuilder(aggregation);
        }

        public static Aggregation parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Aggregation parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Aggregation parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Aggregation parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Aggregation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Aggregation parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Aggregation parseFrom(InputStream inputStream) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Aggregation parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Aggregation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Aggregation parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Aggregation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    public static StructuredAggregationQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Aggregation> getAggregationsList() {
        return this.aggregations_;
    }

    public List<? extends accesspropertiesDeleted> getAggregationsOrBuilderList() {
        return this.aggregations_;
    }

    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 1;
    }

    public enum write {
        STRUCTURED_QUERY(1),
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
            if (i != 1) {
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
        StructuredAggregationQuery structuredAggregationQuery = new StructuredAggregationQuery();
        DEFAULT_INSTANCE = structuredAggregationQuery;
        GeneratedMessageLite.registerDefaultInstance(StructuredAggregationQuery.class, structuredAggregationQuery);
    }

    public static accessibilityEquals newBuilder() {
        return (accessibilityEquals) DEFAULT_INSTANCE.createBuilder();
    }

    public static StructuredAggregationQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredAggregationQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessexcludeLineAndPageGranularities.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new StructuredAggregationQuery();
            case 2:
                return new accessibilityEquals(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001<\u0000\u0003\u001b", new Object[]{"queryType_", "queryTypeCase_", StructuredQuery.class, "aggregations_", Aggregation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (StructuredAggregationQuery.class) {
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

    public Aggregation getAggregations(int i) {
        return (Aggregation) this.aggregations_.get(i);
    }

    public int getAggregationsCount() {
        return this.aggregations_.size();
    }

    public accesspropertiesDeleted getAggregationsOrBuilder(int i) {
        return (accesspropertiesDeleted) this.aggregations_.get(i);
    }

    public write getQueryTypeCase() {
        return write.forNumber(this.queryTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggregations(Aggregation aggregation) {
        aggregation.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.add(aggregation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAggregations(Iterable<? extends Aggregation> iterable) {
        ensureAggregationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.aggregations_);
    }

    private void ensureAggregationsIsMutable() {
        decodeString decodestring = this.aggregations_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.aggregations_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        if (this.queryTypeCase_ != 1 || this.queryType_ == StructuredQuery.getDefaultInstance()) {
            this.queryType_ = structuredQuery;
        } else {
            getDisableContentCapture getdisablecontentcaptureNewBuilder = StructuredQuery.newBuilder((StructuredQuery) this.queryType_);
            getdisablecontentcaptureNewBuilder.read(structuredQuery);
            this.queryType_ = getdisablecontentcaptureNewBuilder.read();
        }
        this.queryTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAggregations(int i) {
        ensureAggregationsIsMutable();
        this.aggregations_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregations(int i, Aggregation aggregation) {
        aggregation.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.set(i, aggregation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = structuredQuery;
        this.queryTypeCase_ = 1;
    }

    private StructuredAggregationQuery() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregations() {
        this.aggregations_ = GeneratedMessageLite.emptyProtobufList();
    }

    public StructuredQuery getStructuredQuery() {
        return this.queryTypeCase_ == 1 ? (StructuredQuery) this.queryType_ : StructuredQuery.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredQuery() {
        if (this.queryTypeCase_ == 1) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    public static accessibilityEquals newBuilder(StructuredAggregationQuery structuredAggregationQuery) {
        return (accessibilityEquals) DEFAULT_INSTANCE.createBuilder(structuredAggregationQuery);
    }

    public static StructuredAggregationQuery parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredAggregationQuery parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredAggregationQuery parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static StructuredAggregationQuery parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAggregations(int i, Aggregation aggregation) {
        aggregation.getClass();
        ensureAggregationsIsMutable();
        this.aggregations_.add(i, aggregation);
    }

    public static StructuredAggregationQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StructuredAggregationQuery parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredAggregationQuery parseFrom(InputStream inputStream) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredAggregationQuery parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredAggregationQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StructuredAggregationQuery parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredAggregationQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
