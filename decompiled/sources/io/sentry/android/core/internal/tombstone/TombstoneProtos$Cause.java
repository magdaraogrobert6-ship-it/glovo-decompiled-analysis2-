package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$Cause extends GeneratedMessageLite implements MediaSessionCompatResultReceiverWrapper {
    private static final TombstoneProtos$Cause DEFAULT_INSTANCE;
    public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
    public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private Object details_;
    private int detailsCase_ = 0;
    private String humanReadable_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.detailsCase_ = 0;
        this.details_ = null;
    }

    public static TombstoneProtos$Cause getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getHumanReadable() {
        return this.humanReadable_;
    }

    public boolean hasMemoryError() {
        return this.detailsCase_ == 2;
    }

    public enum serializer {
        MEMORY_ERROR(2),
        DETAILS_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        serializer(int i) {
            this.value = i;
        }

        public static serializer forNumber(int i) {
            if (i == 0) {
                return DETAILS_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return MEMORY_ERROR;
        }

        @Deprecated
        public static serializer valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TombstoneProtos$Cause tombstoneProtos$Cause = new TombstoneProtos$Cause();
        DEFAULT_INSTANCE = tombstoneProtos$Cause;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Cause.class, tombstoneProtos$Cause);
    }

    public static RatingCompat newBuilder() {
        return (RatingCompat) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$Cause();
            case 2:
                return new RatingCompat(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"details_", "detailsCase_", "humanReadable_", TombstoneProtos$MemoryError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$Cause.class) {
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

    public serializer getDetailsCase() {
        return serializer.forNumber(this.detailsCase_);
    }

    public getClipMetadata getHumanReadableBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.humanReadable_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        if (this.detailsCase_ != 2 || this.details_ == TombstoneProtos$MemoryError.getDefaultInstance()) {
            this.details_ = tombstoneProtos$MemoryError;
        } else {
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM r8lambdaci7dwlt0wnpzj9a3orpjguf1usmNewBuilder = TombstoneProtos$MemoryError.newBuilder((TombstoneProtos$MemoryError) this.details_);
            r8lambdaci7dwlt0wnpzj9a3orpjguf1usmNewBuilder.read(tombstoneProtos$MemoryError);
            this.details_ = r8lambdaci7dwlt0wnpzj9a3orpjguf1usmNewBuilder.read();
        }
        this.detailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadable(String str) {
        str.getClass();
        this.humanReadable_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadableBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.humanReadable_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        this.details_ = tombstoneProtos$MemoryError;
        this.detailsCase_ = 2;
    }

    private TombstoneProtos$Cause() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHumanReadable() {
        this.humanReadable_ = getDefaultInstance().getHumanReadable();
    }

    public TombstoneProtos$MemoryError getMemoryError() {
        return this.detailsCase_ == 2 ? (TombstoneProtos$MemoryError) this.details_ : TombstoneProtos$MemoryError.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryError() {
        if (this.detailsCase_ == 2) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    public static RatingCompat newBuilder(TombstoneProtos$Cause tombstoneProtos$Cause) {
        return (RatingCompat) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Cause);
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Cause parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$Cause parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
