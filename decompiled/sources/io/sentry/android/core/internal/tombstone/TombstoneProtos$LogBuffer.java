package io.sentry.android.core.internal.tombstone;

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
import o.component23;
import o.decodeString;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$LogBuffer extends GeneratedMessageLite implements r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus {
    private static final TombstoneProtos$LogBuffer DEFAULT_INSTANCE;
    public static final int LOGS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private String name_ = "";
    private decodeString logs_ = GeneratedMessageLite.emptyProtobufList();

    public static TombstoneProtos$LogBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<TombstoneProtos$LogMessage> getLogsList() {
        return this.logs_;
    }

    public List<? extends r8lambda54BeH8ZsBru0CXI2CCSP2syNys> getLogsOrBuilderList() {
        return this.logs_;
    }

    public String getName() {
        return this.name_;
    }

    static {
        TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer = new TombstoneProtos$LogBuffer();
        DEFAULT_INSTANCE = tombstoneProtos$LogBuffer;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogBuffer.class, tombstoneProtos$LogBuffer);
    }

    public static ComponentActivity newBuilder() {
        return (ComponentActivity) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogBuffer();
            case 2:
                return new ComponentActivity(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "logs_", TombstoneProtos$LogMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$LogBuffer.class) {
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

    public TombstoneProtos$LogMessage getLogs(int i) {
        return (TombstoneProtos$LogMessage) this.logs_.get(i);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public r8lambda54BeH8ZsBru0CXI2CCSP2syNys getLogsOrBuilder(int i) {
        return (r8lambda54BeH8ZsBru0CXI2CCSP2syNys) this.logs_.get(i);
    }

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends TombstoneProtos$LogMessage> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(tombstoneProtos$LogMessage);
    }

    private void ensureLogsIsMutable() {
        decodeString decodestring = this.logs_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, tombstoneProtos$LogMessage);
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
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private TombstoneProtos$LogBuffer() {
    }

    public static ComponentActivity newBuilder(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        return (ComponentActivity) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogBuffer);
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogBuffer parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$LogBuffer parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
