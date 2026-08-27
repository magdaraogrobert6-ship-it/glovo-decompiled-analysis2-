package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$Tombstone extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
    public static final int ARCH_FIELD_NUMBER = 1;
    public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
    public static final int CAUSES_FIELD_NUMBER = 15;
    public static final int COMMAND_LINE_FIELD_NUMBER = 9;
    public static final int CRASH_DETAILS_FIELD_NUMBER = 21;
    private static final TombstoneProtos$Tombstone DEFAULT_INSTANCE;
    public static final int GUEST_ARCH_FIELD_NUMBER = 24;
    public static final int GUEST_THREADS_FIELD_NUMBER = 25;
    public static final int HAS_BEEN_16KB_MODE_FIELD_NUMBER = 23;
    public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
    public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
    public static final int OPEN_FDS_FIELD_NUMBER = 19;
    public static final int PAGE_SIZE_FIELD_NUMBER = 22;
    private static volatile component23 PARSER = null;
    public static final int PID_FIELD_NUMBER = 5;
    public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
    public static final int REVISION_FIELD_NUMBER = 3;
    public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
    public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
    public static final int STACK_HISTORY_BUFFER_FIELD_NUMBER = 26;
    public static final int THREADS_FIELD_NUMBER = 16;
    public static final int TID_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int UID_FIELD_NUMBER = 7;
    private String abortMessage_;
    private int arch_;
    private int bitField0_;
    private String buildFingerprint_;
    private decodeString causes_;
    private decodeString commandLine_;
    private decodeString crashDetails_;
    private int guestArch_;
    private fromDpSizeitqla9I guestThreads_;
    private boolean hasBeen16KbMode_;
    private decodeString logBuffers_;
    private decodeString memoryMappings_;
    private decodeString openFds_;
    private int pageSize_;
    private int pid_;
    private int processUptime_;
    private String revision_;
    private String selinuxLabel_;
    private TombstoneProtos$Signal signalInfo_;
    private TombstoneProtos$StackHistoryBuffer stackHistoryBuffer_;
    private fromDpSizeitqla9I threads_;
    private int tid_;
    private String timestamp_;
    private int uid_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArch() {
        this.arch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuestArch() {
        this.guestArch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasBeen16KbMode() {
        this.hasBeen16KbMode_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageSize() {
        this.pageSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessUptime() {
        this.processUptime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignalInfo() {
        this.signalInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStackHistoryBuffer() {
        this.stackHistoryBuffer_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0;
    }

    public static TombstoneProtos$Tombstone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, TombstoneProtos$Thread> getMutableGuestThreadsMap() {
        return internalGetMutableGuestThreads();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, TombstoneProtos$Thread> getMutableThreadsMap() {
        return internalGetMutableThreads();
    }

    private fromDpSizeitqla9I internalGetGuestThreads() {
        return this.guestThreads_;
    }

    private fromDpSizeitqla9I internalGetThreads() {
        return this.threads_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchValue(int i) {
        this.arch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuestArchValue(int i) {
        this.guestArch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasBeen16KbMode(boolean z) {
        this.hasBeen16KbMode_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageSize(int i) {
        this.pageSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i) {
        this.pid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessUptime(int i) {
        this.processUptime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(int i) {
        this.tid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i) {
        this.uid_ = i;
    }

    public String getAbortMessage() {
        return this.abortMessage_;
    }

    public int getArchValue() {
        return this.arch_;
    }

    public String getBuildFingerprint() {
        return this.buildFingerprint_;
    }

    public List<TombstoneProtos$Cause> getCausesList() {
        return this.causes_;
    }

    public List<? extends MediaSessionCompatResultReceiverWrapper> getCausesOrBuilderList() {
        return this.causes_;
    }

    public List<String> getCommandLineList() {
        return this.commandLine_;
    }

    public List<TombstoneProtos$CrashDetail> getCrashDetailsList() {
        return this.crashDetails_;
    }

    public List<? extends MediaSessionCompatToken> getCrashDetailsOrBuilderList() {
        return this.crashDetails_;
    }

    public int getGuestArchValue() {
        return this.guestArch_;
    }

    @Deprecated
    public Map<Integer, TombstoneProtos$Thread> getGuestThreads() {
        return getGuestThreadsMap();
    }

    public boolean getHasBeen16KbMode() {
        return this.hasBeen16KbMode_;
    }

    public List<TombstoneProtos$LogBuffer> getLogBuffersList() {
        return this.logBuffers_;
    }

    public List<? extends r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus> getLogBuffersOrBuilderList() {
        return this.logBuffers_;
    }

    public List<TombstoneProtos$MemoryMapping> getMemoryMappingsList() {
        return this.memoryMappings_;
    }

    public List<? extends r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28> getMemoryMappingsOrBuilderList() {
        return this.memoryMappings_;
    }

    public List<TombstoneProtos$FD> getOpenFdsList() {
        return this.openFds_;
    }

    public List<? extends ParcelableVolumeInfo> getOpenFdsOrBuilderList() {
        return this.openFds_;
    }

    public int getPageSize() {
        return this.pageSize_;
    }

    public int getPid() {
        return this.pid_;
    }

    public int getProcessUptime() {
        return this.processUptime_;
    }

    public String getRevision() {
        return this.revision_;
    }

    public String getSelinuxLabel() {
        return this.selinuxLabel_;
    }

    @Deprecated
    public Map<Integer, TombstoneProtos$Thread> getThreads() {
        return getThreadsMap();
    }

    public int getTid() {
        return this.tid_;
    }

    public String getTimestamp() {
        return this.timestamp_;
    }

    public int getUid() {
        return this.uid_;
    }

    public boolean hasSignalInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStackHistoryBuffer() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        TombstoneProtos$Tombstone tombstoneProtos$Tombstone = new TombstoneProtos$Tombstone();
        DEFAULT_INSTANCE = tombstoneProtos$Tombstone;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Tombstone.class, tombstoneProtos$Tombstone);
    }

    private fromDpSizeitqla9I internalGetMutableGuestThreads() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.guestThreads_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.guestThreads_ = fromdpsizeitqla9i.serializer();
        }
        return this.guestThreads_;
    }

    private fromDpSizeitqla9I internalGetMutableThreads() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.threads_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.threads_ = fromdpsizeitqla9i.serializer();
        }
        return this.threads_;
    }

    public static createFullyDrawnExecutor newBuilder() {
        return (createFullyDrawnExecutor) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$Tombstone();
            case 2:
                return new createFullyDrawnExecutor(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0001\u0001\u001a\u0017\u0002\u0006\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b\u0015\u001b\u0016\u000b\u0017\u0007\u0018\f\u00192\u001aဉ\u0001", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", TombstoneProtos$Cause.class, "threads_", addObserverForBackInvokerlambda0.IconCompatParcelizer, "memoryMappings_", TombstoneProtos$MemoryMapping.class, "logBuffers_", TombstoneProtos$LogBuffer.class, "openFds_", TombstoneProtos$FD.class, "processUptime_", "crashDetails_", TombstoneProtos$CrashDetail.class, "pageSize_", "hasBeen16KbMode_", "guestArch_", "guestThreads_", addObserverForBackInvoker.RemoteActionCompatParcelizer, "stackHistoryBuffer_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$Tombstone.class) {
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

    public getClipMetadata getAbortMessageBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.abortMessage_);
    }

    public read getArch() {
        read readVarForNumber = read.forNumber(this.arch_);
        return readVarForNumber == null ? read.UNRECOGNIZED : readVarForNumber;
    }

    public getClipMetadata getBuildFingerprintBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.buildFingerprint_);
    }

    public TombstoneProtos$Cause getCauses(int i) {
        return (TombstoneProtos$Cause) this.causes_.get(i);
    }

    public int getCausesCount() {
        return this.causes_.size();
    }

    public MediaSessionCompatResultReceiverWrapper getCausesOrBuilder(int i) {
        return (MediaSessionCompatResultReceiverWrapper) this.causes_.get(i);
    }

    public String getCommandLine(int i) {
        return (String) this.commandLine_.get(i);
    }

    public getClipMetadata getCommandLineBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.commandLine_.get(i));
    }

    public int getCommandLineCount() {
        return this.commandLine_.size();
    }

    public TombstoneProtos$CrashDetail getCrashDetails(int i) {
        return (TombstoneProtos$CrashDetail) this.crashDetails_.get(i);
    }

    public int getCrashDetailsCount() {
        return this.crashDetails_.size();
    }

    public MediaSessionCompatToken getCrashDetailsOrBuilder(int i) {
        return (MediaSessionCompatToken) this.crashDetails_.get(i);
    }

    public read getGuestArch() {
        read readVarForNumber = read.forNumber(this.guestArch_);
        return readVarForNumber == null ? read.UNRECOGNIZED : readVarForNumber;
    }

    public TombstoneProtos$LogBuffer getLogBuffers(int i) {
        return (TombstoneProtos$LogBuffer) this.logBuffers_.get(i);
    }

    public int getLogBuffersCount() {
        return this.logBuffers_.size();
    }

    public r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus getLogBuffersOrBuilder(int i) {
        return (r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) this.logBuffers_.get(i);
    }

    public TombstoneProtos$MemoryMapping getMemoryMappings(int i) {
        return (TombstoneProtos$MemoryMapping) this.memoryMappings_.get(i);
    }

    public int getMemoryMappingsCount() {
        return this.memoryMappings_.size();
    }

    public r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 getMemoryMappingsOrBuilder(int i) {
        return (r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) this.memoryMappings_.get(i);
    }

    public TombstoneProtos$FD getOpenFds(int i) {
        return (TombstoneProtos$FD) this.openFds_.get(i);
    }

    public int getOpenFdsCount() {
        return this.openFds_.size();
    }

    public ParcelableVolumeInfo getOpenFdsOrBuilder(int i) {
        return (ParcelableVolumeInfo) this.openFds_.get(i);
    }

    public getClipMetadata getRevisionBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.revision_);
    }

    public getClipMetadata getSelinuxLabelBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.selinuxLabel_);
    }

    public getClipMetadata getTimestampBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.timestamp_);
    }

    private TombstoneProtos$Tombstone() {
        fromDpSizeitqla9I fromdpsizeitqla9i = fromDpSizeitqla9I.serializer;
        this.threads_ = fromdpsizeitqla9i;
        this.guestThreads_ = fromdpsizeitqla9i;
        this.buildFingerprint_ = "";
        this.revision_ = "";
        this.timestamp_ = "";
        this.selinuxLabel_ = "";
        this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
        this.abortMessage_ = "";
        this.crashDetails_ = GeneratedMessageLite.emptyProtobufList();
        this.causes_ = GeneratedMessageLite.emptyProtobufList();
        this.memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
        this.logBuffers_ = GeneratedMessageLite.emptyProtobufList();
        this.openFds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCauses(Iterable<? extends TombstoneProtos$Cause> iterable) {
        ensureCausesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.causes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandLine(Iterable<String> iterable) {
        ensureCommandLineIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandLine_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCrashDetails(Iterable<? extends TombstoneProtos$CrashDetail> iterable) {
        ensureCrashDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.crashDetails_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogBuffers(Iterable<? extends TombstoneProtos$LogBuffer> iterable) {
        ensureLogBuffersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logBuffers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryMappings(Iterable<? extends TombstoneProtos$MemoryMapping> iterable) {
        ensureMemoryMappingsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryMappings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenFds(Iterable<? extends TombstoneProtos$FD> iterable) {
        ensureOpenFdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.openFds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLine(String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLineBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureCommandLineIsMutable();
        this.commandLine_.add(getclipmetadata.MediaMetadataCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashDetails(TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.add(tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(tombstoneProtos$FD);
    }

    private void ensureCausesIsMutable() {
        decodeString decodestring = this.causes_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.causes_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureCommandLineIsMutable() {
        decodeString decodestring = this.commandLine_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.commandLine_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureCrashDetailsIsMutable() {
        decodeString decodestring = this.crashDetails_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.crashDetails_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureLogBuffersIsMutable() {
        decodeString decodestring = this.logBuffers_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.logBuffers_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureMemoryMappingsIsMutable() {
        decodeString decodestring = this.memoryMappings_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.memoryMappings_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureOpenFdsIsMutable() {
        decodeString decodestring = this.openFds_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.openFds_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        TombstoneProtos$Signal tombstoneProtos$Signal2 = this.signalInfo_;
        if (tombstoneProtos$Signal2 == null || tombstoneProtos$Signal2 == TombstoneProtos$Signal.getDefaultInstance()) {
            this.signalInfo_ = tombstoneProtos$Signal;
        } else {
            _init_lambda1 _init_lambda1VarNewBuilder = TombstoneProtos$Signal.newBuilder(this.signalInfo_);
            _init_lambda1VarNewBuilder.read(tombstoneProtos$Signal);
            this.signalInfo_ = (TombstoneProtos$Signal) _init_lambda1VarNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        tombstoneProtos$StackHistoryBuffer.getClass();
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer2 = this.stackHistoryBuffer_;
        if (tombstoneProtos$StackHistoryBuffer2 == null || tombstoneProtos$StackHistoryBuffer2 == TombstoneProtos$StackHistoryBuffer.getDefaultInstance()) {
            this.stackHistoryBuffer_ = tombstoneProtos$StackHistoryBuffer;
        } else {
            accessensureViewModelStore accessensureviewmodelstoreNewBuilder = TombstoneProtos$StackHistoryBuffer.newBuilder(this.stackHistoryBuffer_);
            accessensureviewmodelstoreNewBuilder.read(tombstoneProtos$StackHistoryBuffer);
            this.stackHistoryBuffer_ = (TombstoneProtos$StackHistoryBuffer) accessensureviewmodelstoreNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCauses(int i) {
        ensureCausesIsMutable();
        this.causes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCrashDetails(int i) {
        ensureCrashDetailsIsMutable();
        this.crashDetails_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogBuffers(int i) {
        ensureLogBuffersIsMutable();
        this.logBuffers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryMappings(int i) {
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpenFds(int i) {
        ensureOpenFdsIsMutable();
        this.openFds_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessage(String str) {
        str.getClass();
        this.abortMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessageBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.abortMessage_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprint(String str) {
        str.getClass();
        this.buildFingerprint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprintBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.buildFingerprint_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCauses(int i, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.set(i, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandLine(int i, String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashDetails(int i, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.set(i, tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogBuffers(int i, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.set(i, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryMappings(int i, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.set(i, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenFds(int i, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.set(i, tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.revision_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabel(String str) {
        str.getClass();
        this.selinuxLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabelBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.selinuxLabel_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        this.signalInfo_ = tombstoneProtos$Signal;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStackHistoryBuffer(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        tombstoneProtos$StackHistoryBuffer.getClass();
        this.stackHistoryBuffer_ = tombstoneProtos$StackHistoryBuffer;
        this.bitField0_ |= 2;
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
    public void clearAbortMessage() {
        this.abortMessage_ = getDefaultInstance().getAbortMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildFingerprint() {
        this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCauses() {
        this.causes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandLine() {
        this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashDetails() {
        this.crashDetails_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogBuffers() {
        this.logBuffers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryMappings() {
        this.memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenFds() {
        this.openFds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelinuxLabel() {
        this.selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArch(read readVar) {
        this.arch_ = readVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuestArch(read readVar) {
        this.guestArch_ = readVar.getNumber();
    }

    public int getGuestThreadsCount() {
        return internalGetGuestThreads().size();
    }

    public Map<Integer, TombstoneProtos$Thread> getGuestThreadsMap() {
        return Collections.unmodifiableMap(internalGetGuestThreads());
    }

    public TombstoneProtos$Signal getSignalInfo() {
        TombstoneProtos$Signal tombstoneProtos$Signal = this.signalInfo_;
        return tombstoneProtos$Signal == null ? TombstoneProtos$Signal.getDefaultInstance() : tombstoneProtos$Signal;
    }

    public TombstoneProtos$StackHistoryBuffer getStackHistoryBuffer() {
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer = this.stackHistoryBuffer_;
        return tombstoneProtos$StackHistoryBuffer == null ? TombstoneProtos$StackHistoryBuffer.getDefaultInstance() : tombstoneProtos$StackHistoryBuffer;
    }

    public int getThreadsCount() {
        return internalGetThreads().size();
    }

    public Map<Integer, TombstoneProtos$Thread> getThreadsMap() {
        return Collections.unmodifiableMap(internalGetThreads());
    }

    public boolean containsGuestThreads(int i) {
        return internalGetGuestThreads().containsKey(Integer.valueOf(i));
    }

    public boolean containsThreads(int i) {
        return internalGetThreads().containsKey(Integer.valueOf(i));
    }

    public TombstoneProtos$Thread getGuestThreadsOrDefault(int i, TombstoneProtos$Thread tombstoneProtos$Thread) {
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetGuestThreads = internalGetGuestThreads();
        return fromdpsizeitqla9iInternalGetGuestThreads.containsKey(Integer.valueOf(i)) ? (TombstoneProtos$Thread) fromdpsizeitqla9iInternalGetGuestThreads.get(Integer.valueOf(i)) : tombstoneProtos$Thread;
    }

    public TombstoneProtos$Thread getGuestThreadsOrThrow(int i) {
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetGuestThreads = internalGetGuestThreads();
        if (fromdpsizeitqla9iInternalGetGuestThreads.containsKey(Integer.valueOf(i))) {
            return (TombstoneProtos$Thread) fromdpsizeitqla9iInternalGetGuestThreads.get(Integer.valueOf(i));
        }
        DrawableTransformation.write();
        return null;
    }

    public TombstoneProtos$Thread getThreadsOrDefault(int i, TombstoneProtos$Thread tombstoneProtos$Thread) {
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetThreads = internalGetThreads();
        return fromdpsizeitqla9iInternalGetThreads.containsKey(Integer.valueOf(i)) ? (TombstoneProtos$Thread) fromdpsizeitqla9iInternalGetThreads.get(Integer.valueOf(i)) : tombstoneProtos$Thread;
    }

    public TombstoneProtos$Thread getThreadsOrThrow(int i) {
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetThreads = internalGetThreads();
        if (fromdpsizeitqla9iInternalGetThreads.containsKey(Integer.valueOf(i))) {
            return (TombstoneProtos$Thread) fromdpsizeitqla9iInternalGetThreads.get(Integer.valueOf(i));
        }
        DrawableTransformation.write();
        return null;
    }

    public static createFullyDrawnExecutor newBuilder(TombstoneProtos$Tombstone tombstoneProtos$Tombstone) {
        return (createFullyDrawnExecutor) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Tombstone);
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Tombstone parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$Tombstone parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(int i, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(i, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashDetails(int i, TombstoneProtos$CrashDetail tombstoneProtos$CrashDetail) {
        tombstoneProtos$CrashDetail.getClass();
        ensureCrashDetailsIsMutable();
        this.crashDetails_.add(i, tombstoneProtos$CrashDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(int i, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(i, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(int i, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(i, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(int i, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(i, tombstoneProtos$FD);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
