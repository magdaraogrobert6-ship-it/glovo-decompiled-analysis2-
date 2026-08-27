package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.ClipboardExtensions_androidKt;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$CrashDetail extends GeneratedMessageLite implements MediaSessionCompatToken {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final TombstoneProtos$CrashDetail DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private getClipMetadata data_;
    private getClipMetadata name_;

    public static TombstoneProtos$CrashDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public getClipMetadata getData() {
        return this.data_;
    }

    public getClipMetadata getName() {
        return this.name_;
    }

    static {
        TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail = new TombstoneProtos$CrashDetail();
        DEFAULT_INSTANCE = tombstoneProtos$CrashDetail;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$CrashDetail.class, tombstoneProtos$CrashDetail);
    }

    public static PlaybackStateCompat newBuilder() {
        return (PlaybackStateCompat) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$CrashDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$CrashDetail();
            case 2:
                return new PlaybackStateCompat(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"name_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$CrashDetail.class) {
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

    private TombstoneProtos$CrashDetail() {
        ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
        this.name_ = clipboardExtensions_androidKt;
        this.data_ = clipboardExtensions_androidKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.data_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.name_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static PlaybackStateCompat newBuilder(TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        return (PlaybackStateCompat) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$CrashDetail);
    }

    public static TombstoneProtos$CrashDetail parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$CrashDetail parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$CrashDetail parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$CrashDetail parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$CrashDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$CrashDetail parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$CrashDetail parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$CrashDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$CrashDetail parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$CrashDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
