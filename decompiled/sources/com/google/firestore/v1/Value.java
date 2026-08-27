package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeView_androidKt;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.accesscontainsDescendant;
import o.component21;
import o.component23;
import o.containsDescendant;
import o.getAction;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getFromIndex;
import o.getLocalProvidableScrollCaptureInProgress;
import o.hitTestSemanticsAtui;
import o.performActionHelper;
import o.stopRetainingExitedValues;

/* JADX INFO: loaded from: classes2.dex */
public final class Value extends GeneratedMessageLite implements containsDescendant {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final Value DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int FIELD_REFERENCE_VALUE_FIELD_NUMBER = 19;
    public static final int FUNCTION_VALUE_FIELD_NUMBER = 20;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile component23 PARSER = null;
    public static final int PIPELINE_VALUE_FIELD_NUMBER = 21;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueTypeCase_ = 0;
        this.valueType_ = null;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBooleanValue(boolean z) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntegerValue(long j) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j);
    }

    public boolean hasArrayValue() {
        return this.valueTypeCase_ == 9;
    }

    public boolean hasBooleanValue() {
        return this.valueTypeCase_ == 1;
    }

    public boolean hasBytesValue() {
        return this.valueTypeCase_ == 18;
    }

    public boolean hasDoubleValue() {
        return this.valueTypeCase_ == 3;
    }

    public boolean hasFieldReferenceValue() {
        return this.valueTypeCase_ == 19;
    }

    public boolean hasFunctionValue() {
        return this.valueTypeCase_ == 20;
    }

    public boolean hasGeoPointValue() {
        return this.valueTypeCase_ == 8;
    }

    public boolean hasIntegerValue() {
        return this.valueTypeCase_ == 2;
    }

    public boolean hasMapValue() {
        return this.valueTypeCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.valueTypeCase_ == 11;
    }

    public boolean hasPipelineValue() {
        return this.valueTypeCase_ == 21;
    }

    public boolean hasReferenceValue() {
        return this.valueTypeCase_ == 5;
    }

    public boolean hasStringValue() {
        return this.valueTypeCase_ == 17;
    }

    public boolean hasTimestampValue() {
        return this.valueTypeCase_ == 10;
    }

    public enum RemoteActionCompatParcelizer {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        FIELD_REFERENCE_VALUE(19),
        FUNCTION_VALUE(20),
        PIPELINE_VALUE(21),
        VALUETYPE_NOT_SET(0);

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
                return VALUETYPE_NOT_SET;
            }
            if (i == 1) {
                return BOOLEAN_VALUE;
            }
            if (i == 2) {
                return INTEGER_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 5) {
                return REFERENCE_VALUE;
            }
            if (i != 6) {
                switch (i) {
                    case 8:
                        return GEO_POINT_VALUE;
                    case 9:
                        return ARRAY_VALUE;
                    case 10:
                        return TIMESTAMP_VALUE;
                    case 11:
                        return NULL_VALUE;
                    default:
                        switch (i) {
                            case 17:
                                return STRING_VALUE;
                            case 18:
                                return BYTES_VALUE;
                            case 19:
                                return FIELD_REFERENCE_VALUE;
                            case 20:
                                return FUNCTION_VALUE;
                            case 21:
                                return PIPELINE_VALUE;
                            default:
                                return null;
                        }
                }
            }
            return MAP_VALUE;
        }
    }

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        GeneratedMessageLite.registerDefaultInstance(Value.class, value);
    }

    public static accesscontainsDescendant newBuilder() {
        return (accesscontainsDescendant) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.valueTypeCase_ = 11;
        this.valueType_ = Integer.valueOf(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidComposeView_androidKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new accesscontainsDescendant(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0000\u0001\u0015\u000e\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000\u0013Ȼ\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"valueType_", "valueTypeCase_", MapValue.class, LatLng.class, ArrayValue.class, Timestamp.class, Function.class, Pipeline.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Value.class) {
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

    public RemoteActionCompatParcelizer getValueTypeCase() {
        return RemoteActionCompatParcelizer.forNumber(this.valueTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        if (this.valueTypeCase_ != 9 || this.valueType_ == ArrayValue.getDefaultInstance()) {
            this.valueType_ = arrayValue;
        } else {
            performActionHelper performactionhelperNewBuilder = ArrayValue.newBuilder((ArrayValue) this.valueType_);
            performactionhelperNewBuilder.read(arrayValue);
            this.valueType_ = performactionhelperNewBuilder.read();
        }
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFunctionValue(Function function) {
        function.getClass();
        if (this.valueTypeCase_ != 20 || this.valueType_ == Function.getDefaultInstance()) {
            this.valueType_ = function;
        } else {
            hitTestSemanticsAtui hittestsemanticsatuiNewBuilder = Function.newBuilder((Function) this.valueType_);
            hittestsemanticsatuiNewBuilder.read(function);
            this.valueType_ = hittestsemanticsatuiNewBuilder.read();
        }
        this.valueTypeCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeoPointValue(LatLng latLng) {
        latLng.getClass();
        if (this.valueTypeCase_ != 8 || this.valueType_ == LatLng.getDefaultInstance()) {
            this.valueType_ = latLng;
        } else {
            stopRetainingExitedValues stopretainingexitedvaluesNewBuilder = LatLng.newBuilder((LatLng) this.valueType_);
            stopretainingexitedvaluesNewBuilder.read(latLng);
            this.valueType_ = stopretainingexitedvaluesNewBuilder.read();
        }
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapValue(MapValue mapValue) {
        mapValue.getClass();
        if (this.valueTypeCase_ != 6 || this.valueType_ == MapValue.getDefaultInstance()) {
            this.valueType_ = mapValue;
        } else {
            getAction getactionNewBuilder = MapValue.newBuilder((MapValue) this.valueType_);
            getactionNewBuilder.read(mapValue);
            this.valueType_ = getactionNewBuilder.read();
        }
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePipelineValue(Pipeline pipeline) {
        pipeline.getClass();
        if (this.valueTypeCase_ != 21 || this.valueType_ == Pipeline.getDefaultInstance()) {
            this.valueType_ = pipeline;
        } else {
            getFromIndex getfromindexNewBuilder = Pipeline.newBuilder((Pipeline) this.valueType_);
            getfromindexNewBuilder.read(pipeline);
            this.valueType_ = getfromindexNewBuilder.read();
        }
        this.valueTypeCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestampValue(Timestamp timestamp) {
        timestamp.getClass();
        if (this.valueTypeCase_ != 10 || this.valueType_ == Timestamp.getDefaultInstance()) {
            this.valueType_ = timestamp;
        } else {
            this.valueType_ = IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.valueType_, timestamp);
        }
        this.valueTypeCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.valueType_ = arrayValue;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldReferenceValueBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.valueType_ = getclipmetadata.MediaMetadataCompat();
        this.valueTypeCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionValue(Function function) {
        function.getClass();
        this.valueType_ = function;
        this.valueTypeCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeoPointValue(LatLng latLng) {
        latLng.getClass();
        this.valueType_ = latLng;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapValue(MapValue mapValue) {
        mapValue.getClass();
        this.valueType_ = mapValue;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipelineValue(Pipeline pipeline) {
        pipeline.getClass();
        this.valueType_ = pipeline;
        this.valueTypeCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceValueBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.valueType_ = getclipmetadata.MediaMetadataCompat();
        this.valueTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.valueType_ = getclipmetadata.MediaMetadataCompat();
        this.valueTypeCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampValue(Timestamp timestamp) {
        timestamp.getClass();
        this.valueType_ = timestamp;
        this.valueTypeCase_ = 10;
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferenceValue(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldReferenceValue(String str) {
        str.getClass();
        this.valueTypeCase_ = 19;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    public boolean getBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public double getDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public long getIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public MapValue getMapValue() {
        return this.valueTypeCase_ == 6 ? (MapValue) this.valueType_ : MapValue.getDefaultInstance();
    }

    public String getReferenceValue() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public getClipMetadata getReferenceValueBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.valueTypeCase_ == 5 ? (String) this.valueType_ : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapValue() {
        if (this.valueTypeCase_ == 6) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferenceValue() {
        if (this.valueTypeCase_ == 5) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    public ArrayValue getArrayValue() {
        return this.valueTypeCase_ == 9 ? (ArrayValue) this.valueType_ : ArrayValue.getDefaultInstance();
    }

    public getClipMetadata getBytesValue() {
        return this.valueTypeCase_ == 18 ? (getClipMetadata) this.valueType_ : getClipMetadata.serializer;
    }

    public String getFieldReferenceValue() {
        return this.valueTypeCase_ == 19 ? (String) this.valueType_ : "";
    }

    public getClipMetadata getFieldReferenceValueBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.valueTypeCase_ == 19 ? (String) this.valueType_ : "");
    }

    public Function getFunctionValue() {
        return this.valueTypeCase_ == 20 ? (Function) this.valueType_ : Function.getDefaultInstance();
    }

    public LatLng getGeoPointValue() {
        return this.valueTypeCase_ == 8 ? (LatLng) this.valueType_ : LatLng.getDefaultInstance();
    }

    public component21 getNullValue() {
        if (this.valueTypeCase_ != 11) {
            return component21.NULL_VALUE;
        }
        component21 component21VarForNumber = component21.forNumber(((Integer) this.valueType_).intValue());
        return component21VarForNumber == null ? component21.UNRECOGNIZED : component21VarForNumber;
    }

    public int getNullValueValue() {
        if (this.valueTypeCase_ == 11) {
            return ((Integer) this.valueType_).intValue();
        }
        return 0;
    }

    public Pipeline getPipelineValue() {
        return this.valueTypeCase_ == 21 ? (Pipeline) this.valueType_ : Pipeline.getDefaultInstance();
    }

    public String getStringValue() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public getClipMetadata getStringValueBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.valueTypeCase_ == 17 ? (String) this.valueType_ : "");
    }

    public Timestamp getTimestampValue() {
        return this.valueTypeCase_ == 10 ? (Timestamp) this.valueType_ : Timestamp.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrayValue() {
        if (this.valueTypeCase_ == 9) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        if (this.valueTypeCase_ == 18) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldReferenceValue() {
        if (this.valueTypeCase_ == 19) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionValue() {
        if (this.valueTypeCase_ == 20) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.valueTypeCase_ == 11) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipelineValue() {
        if (this.valueTypeCase_ == 21) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueTypeCase_ == 17) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(component21 component21Var) {
        this.valueType_ = Integer.valueOf(component21Var.getNumber());
        this.valueTypeCase_ = 11;
    }

    public static accesscontainsDescendant newBuilder(Value value) {
        return (accesscontainsDescendant) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Value parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Value parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
