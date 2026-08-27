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
public final class TombstoneProtos$FD extends GeneratedMessageLite implements ParcelableVolumeInfo {
    private static final TombstoneProtos$FD DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    public static final int TAG_FIELD_NUMBER = 4;
    private int fd_;
    private long tag_;
    private String path_ = "";
    private String owner_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    public static TombstoneProtos$FD getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(long j) {
        this.tag_ = j;
    }

    public int getFd() {
        return this.fd_;
    }

    public String getOwner() {
        return this.owner_;
    }

    public String getPath() {
        return this.path_;
    }

    public long getTag() {
        return this.tag_;
    }

    static {
        TombstoneProtos$FD tombstoneProtos$FD = new TombstoneProtos$FD();
        DEFAULT_INSTANCE = tombstoneProtos$FD;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$FD.class, tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = 0L;
    }

    public static PlaybackStateCompatCustomAction newBuilder() {
        return (PlaybackStateCompatCustomAction) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$FD();
            case 2:
                return new PlaybackStateCompatCustomAction(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0003", new Object[]{"fd_", "path_", "owner_", "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$FD.class) {
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

    public getClipMetadata getOwnerBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.owner_);
    }

    public getClipMetadata getPathBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.path_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.owner_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.path_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    private TombstoneProtos$FD() {
    }

    public static PlaybackStateCompatCustomAction newBuilder(TombstoneProtos$FD tombstoneProtos$FD) {
        return (PlaybackStateCompatCustomAction) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$FD);
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$FD parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$FD parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
