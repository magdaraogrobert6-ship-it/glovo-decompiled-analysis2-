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
public final class TombstoneProtos$LogMessage extends GeneratedMessageLite implements r8lambda54BeH8ZsBru0CXI2CCSP2syNys {
    private static final TombstoneProtos$LogMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    private static volatile component23 PARSER = null;
    public static final int PID_FIELD_NUMBER = 2;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TAG_FIELD_NUMBER = 5;
    public static final int TID_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int pid_;
    private int priority_;
    private int tid_;
    private String timestamp_ = "";
    private String tag_ = "";
    private String message_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    public static TombstoneProtos$LogMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i) {
        this.pid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i) {
        this.priority_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(int i) {
        this.tid_ = i;
    }

    public String getMessage() {
        return this.message_;
    }

    public int getPid() {
        return this.pid_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public String getTag() {
        return this.tag_;
    }

    public int getTid() {
        return this.tid_;
    }

    public String getTimestamp() {
        return this.timestamp_;
    }

    static {
        TombstoneProtos$LogMessage tombstoneProtos$LogMessage = new TombstoneProtos$LogMessage();
        DEFAULT_INSTANCE = tombstoneProtos$LogMessage;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogMessage.class, tombstoneProtos$LogMessage);
    }

    public static r8lambda7IJBVrN0sHyidCAZufWEJFc7yY newBuilder() {
        return (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogMessage();
            case 2:
                return new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȉ\u0006Ȉ", new Object[]{"timestamp_", "pid_", "tid_", "priority_", "tag_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$LogMessage.class) {
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

    public getClipMetadata getMessageBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.message_);
    }

    public getClipMetadata getTagBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.tag_);
    }

    public getClipMetadata getTimestampBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.timestamp_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.message_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.tag_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(String str) {
        str.getClass();
        this.timestamp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.timestamp_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    private TombstoneProtos$LogMessage() {
    }

    public static r8lambda7IJBVrN0sHyidCAZufWEJFc7yY newBuilder(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        return (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogMessage parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$LogMessage parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
