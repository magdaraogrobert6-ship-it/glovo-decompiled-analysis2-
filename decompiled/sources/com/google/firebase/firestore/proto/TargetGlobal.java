package com.google.firebase.firestore.proto;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.destroy;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.isInLayerk4lQ0M;

/* JADX INFO: loaded from: classes4.dex */
public final class TargetGlobal extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private int bitField0_;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private Timestamp lastRemoteSnapshotVersion_;
    private int targetCount_;

    private TargetGlobal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestTargetId() {
        this.highestTargetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastRemoteSnapshotVersion() {
        this.lastRemoteSnapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetCount() {
        this.targetCount_ = 0;
    }

    public static TargetGlobal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestListenSequenceNumber(long j) {
        this.highestListenSequenceNumber_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestTargetId(int i) {
        this.highestTargetId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetCount(int i) {
        this.targetCount_ = i;
    }

    public long getHighestListenSequenceNumber() {
        return this.highestListenSequenceNumber_;
    }

    public int getHighestTargetId() {
        return this.highestTargetId_;
    }

    public int getTargetCount() {
        return this.targetCount_;
    }

    public boolean hasLastRemoteSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        GeneratedMessageLite.registerDefaultInstance(TargetGlobal.class, targetGlobal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestListenSequenceNumber() {
        this.highestListenSequenceNumber_ = 0L;
    }

    public static destroy newBuilder() {
        return (destroy) DEFAULT_INSTANCE.createBuilder();
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (isInLayerk4lQ0M.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TargetGlobal();
            case 2:
                return new destroy(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003ဉ\u0000\u0004\u0004", new Object[]{"bitField0_", "highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TargetGlobal.class) {
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
    public void mergeLastRemoteSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.lastRemoteSnapshotVersion_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.lastRemoteSnapshotVersion_ = timestamp;
        } else {
            this.lastRemoteSnapshotVersion_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.lastRemoteSnapshotVersion_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastRemoteSnapshotVersion(Timestamp timestamp) {
        timestamp.getClass();
        this.lastRemoteSnapshotVersion_ = timestamp;
        this.bitField0_ |= 1;
    }

    public Timestamp getLastRemoteSnapshotVersion() {
        Timestamp timestamp = this.lastRemoteSnapshotVersion_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public static destroy newBuilder(TargetGlobal targetGlobal) {
        return (destroy) DEFAULT_INSTANCE.createBuilder(targetGlobal);
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetGlobal parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TargetGlobal parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetGlobal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TargetGlobal parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetGlobal parseFrom(InputStream inputStream) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TargetGlobal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TargetGlobal parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TargetGlobal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
