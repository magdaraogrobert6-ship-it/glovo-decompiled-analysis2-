package io.sentry.android.core.internal.tombstone;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dataAvailable;
import o.decodeByte;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$MemoryError extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final TombstoneProtos$MemoryError DEFAULT_INSTANCE;
    public static final int HEAP_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int TOOL_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int locationCase_ = 0;
    private Object location_;
    private int tool_;
    private int type_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.locationCase_ = 0;
        this.location_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTool() {
        this.tool_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static TombstoneProtos$MemoryError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolValue(int i) {
        this.tool_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    public int getToolValue() {
        return this.tool_;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasHeap() {
        return this.locationCase_ == 3;
    }

    public enum IconCompatParcelizer implements ifDebug {
        UNKNOWN(0),
        USE_AFTER_FREE(1),
        DOUBLE_FREE(2),
        INVALID_FREE(3),
        BUFFER_OVERFLOW(4),
        BUFFER_UNDERFLOW(5),
        UNRECOGNIZED(-1);

        public static final int BUFFER_OVERFLOW_VALUE = 4;
        public static final int BUFFER_UNDERFLOW_VALUE = 5;
        public static final int DOUBLE_FREE_VALUE = 2;
        public static final int INVALID_FREE_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        public static final int USE_AFTER_FREE_VALUE = 1;
        private static final dataAvailable internalValueMap = new r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer;
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
                return UNKNOWN;
            }
            if (i == 1) {
                return USE_AFTER_FREE;
            }
            if (i == 2) {
                return DOUBLE_FREE;
            }
            if (i == 3) {
                return INVALID_FREE;
            }
            if (i == 4) {
                return BUFFER_OVERFLOW;
            }
            if (i != 5) {
                return null;
            }
            return BUFFER_UNDERFLOW;
        }
    }

    public enum read {
        HEAP(3),
        LOCATION_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        read(int i) {
            this.value = i;
        }

        public static read forNumber(int i) {
            if (i == 0) {
                return LOCATION_NOT_SET;
            }
            if (i != 3) {
                return null;
            }
            return HEAP;
        }

        @Deprecated
        public static read valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum write implements ifDebug {
        GWP_ASAN(0),
        SCUDO(1),
        UNRECOGNIZED(-1);

        public static final int GWP_ASAN_VALUE = 0;
        public static final int SCUDO_VALUE = 1;
        private static final dataAvailable internalValueMap = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.read;
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

        public static write forNumber(int i) {
            if (i == 0) {
                return GWP_ASAN;
            }
            if (i != 1) {
                return null;
            }
            return SCUDO;
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TombstoneProtos$MemoryError tombstoneProtos$MemoryError = new TombstoneProtos$MemoryError();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryError;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryError.class, tombstoneProtos$MemoryError);
    }

    public static r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM newBuilder() {
        return (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (io.sentry.android.core.internal.tombstone.IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryError();
            case 2:
                return new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000", new Object[]{"location_", "locationCase_", "tool_", "type_", TombstoneProtos$HeapObject.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$MemoryError.class) {
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

    public read getLocationCase() {
        return read.forNumber(this.locationCase_);
    }

    public write getTool() {
        write writeVarForNumber = write.forNumber(this.tool_);
        return writeVarForNumber == null ? write.UNRECOGNIZED : writeVarForNumber;
    }

    public IconCompatParcelizer getType() {
        IconCompatParcelizer iconCompatParcelizerForNumber = IconCompatParcelizer.forNumber(this.type_);
        return iconCompatParcelizerForNumber == null ? IconCompatParcelizer.UNRECOGNIZED : iconCompatParcelizerForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        if (this.locationCase_ != 3 || this.location_ == TombstoneProtos$HeapObject.getDefaultInstance()) {
            this.location_ = tombstoneProtos$HeapObject;
        } else {
            ResultReceiver resultReceiverNewBuilder = TombstoneProtos$HeapObject.newBuilder((TombstoneProtos$HeapObject) this.location_);
            resultReceiverNewBuilder.read(tombstoneProtos$HeapObject);
            this.location_ = resultReceiverNewBuilder.read();
        }
        this.locationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        this.location_ = tombstoneProtos$HeapObject;
        this.locationCase_ = 3;
    }

    private TombstoneProtos$MemoryError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTool(write writeVar) {
        this.tool_ = writeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(IconCompatParcelizer iconCompatParcelizer) {
        this.type_ = iconCompatParcelizer.getNumber();
    }

    public TombstoneProtos$HeapObject getHeap() {
        return this.locationCase_ == 3 ? (TombstoneProtos$HeapObject) this.location_ : TombstoneProtos$HeapObject.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeap() {
        if (this.locationCase_ == 3) {
            this.locationCase_ = 0;
            this.location_ = null;
        }
    }

    public static r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM newBuilder(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        return (r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryError);
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryError parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$MemoryError parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
