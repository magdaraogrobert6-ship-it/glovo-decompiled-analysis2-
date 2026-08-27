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
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$Thread extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
    public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Thread DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
    private static volatile component23 PARSER = null;
    public static final int REGISTERS_FIELD_NUMBER = 3;
    public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
    public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
    private int id_;
    private long pacEnabledKeys_;
    private long taggedAddrCtrl_;
    private String name_ = "";
    private decodeString registers_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString memoryDump_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    public static TombstoneProtos$Thread getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacEnabledKeys(long j) {
        this.pacEnabledKeys_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaggedAddrCtrl(long j) {
        this.taggedAddrCtrl_ = j;
    }

    public List<String> getBacktraceNoteList() {
        return this.backtraceNote_;
    }

    public List<TombstoneProtos$BacktraceFrame> getCurrentBacktraceList() {
        return this.currentBacktrace_;
    }

    public List<? extends MediaMetadataCompat> getCurrentBacktraceOrBuilderList() {
        return this.currentBacktrace_;
    }

    public int getId() {
        return this.id_;
    }

    public List<TombstoneProtos$MemoryDump> getMemoryDumpList() {
        return this.memoryDump_;
    }

    public List<? extends r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8> getMemoryDumpOrBuilderList() {
        return this.memoryDump_;
    }

    public String getName() {
        return this.name_;
    }

    public long getPacEnabledKeys() {
        return this.pacEnabledKeys_;
    }

    public List<TombstoneProtos$Register> getRegistersList() {
        return this.registers_;
    }

    public List<? extends _init_lambda4> getRegistersOrBuilderList() {
        return this.registers_;
    }

    public long getTaggedAddrCtrl() {
        return this.taggedAddrCtrl_;
    }

    public List<String> getUnreadableElfFilesList() {
        return this.unreadableElfFiles_;
    }

    static {
        TombstoneProtos$Thread tombstoneProtos$Thread = new TombstoneProtos$Thread();
        DEFAULT_INSTANCE = tombstoneProtos$Thread;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Thread.class, tombstoneProtos$Thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacEnabledKeys() {
        this.pacEnabledKeys_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaggedAddrCtrl() {
        this.taggedAddrCtrl_ = 0L;
    }

    public static defaultViewModelProviderFactory_delegatelambda0 newBuilder() {
        return (defaultViewModelProviderFactory_delegatelambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$Thread();
            case 2:
                return new defaultViewModelProviderFactory_delegatelambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", TombstoneProtos$Register.class, "currentBacktrace_", TombstoneProtos$BacktraceFrame.class, "memoryDump_", TombstoneProtos$MemoryDump.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$Thread.class) {
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

    public String getBacktraceNote(int i) {
        return (String) this.backtraceNote_.get(i);
    }

    public getClipMetadata getBacktraceNoteBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.backtraceNote_.get(i));
    }

    public int getBacktraceNoteCount() {
        return this.backtraceNote_.size();
    }

    public TombstoneProtos$BacktraceFrame getCurrentBacktrace(int i) {
        return (TombstoneProtos$BacktraceFrame) this.currentBacktrace_.get(i);
    }

    public int getCurrentBacktraceCount() {
        return this.currentBacktrace_.size();
    }

    public MediaMetadataCompat getCurrentBacktraceOrBuilder(int i) {
        return (MediaMetadataCompat) this.currentBacktrace_.get(i);
    }

    public TombstoneProtos$MemoryDump getMemoryDump(int i) {
        return (TombstoneProtos$MemoryDump) this.memoryDump_.get(i);
    }

    public int getMemoryDumpCount() {
        return this.memoryDump_.size();
    }

    public r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 getMemoryDumpOrBuilder(int i) {
        return (r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) this.memoryDump_.get(i);
    }

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    public TombstoneProtos$Register getRegisters(int i) {
        return (TombstoneProtos$Register) this.registers_.get(i);
    }

    public int getRegistersCount() {
        return this.registers_.size();
    }

    public _init_lambda4 getRegistersOrBuilder(int i) {
        return (_init_lambda4) this.registers_.get(i);
    }

    public String getUnreadableElfFiles(int i) {
        return (String) this.unreadableElfFiles_.get(i);
    }

    public getClipMetadata getUnreadableElfFilesBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.unreadableElfFiles_.get(i));
    }

    public int getUnreadableElfFilesCount() {
        return this.unreadableElfFiles_.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBacktraceNote(Iterable<String> iterable) {
        ensureBacktraceNoteIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backtraceNote_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureCurrentBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.currentBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryDump(Iterable<? extends TombstoneProtos$MemoryDump> iterable) {
        ensureMemoryDumpIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryDump_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegisters(Iterable<? extends TombstoneProtos$Register> iterable) {
        ensureRegistersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.registers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnreadableElfFiles(Iterable<String> iterable) {
        ensureUnreadableElfFilesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.unreadableElfFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNote(String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNoteBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(getclipmetadata.MediaMetadataCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFiles(String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFilesBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(getclipmetadata.MediaMetadataCompat());
    }

    private void ensureBacktraceNoteIsMutable() {
        decodeString decodestring = this.backtraceNote_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.backtraceNote_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureCurrentBacktraceIsMutable() {
        decodeString decodestring = this.currentBacktrace_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.currentBacktrace_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureMemoryDumpIsMutable() {
        decodeString decodestring = this.memoryDump_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.memoryDump_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureRegistersIsMutable() {
        decodeString decodestring = this.registers_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.registers_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureUnreadableElfFilesIsMutable() {
        decodeString decodestring = this.unreadableElfFiles_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.unreadableElfFiles_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentBacktrace(int i) {
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryDump(int i) {
        ensureMemoryDumpIsMutable();
        this.memoryDump_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegisters(int i) {
        ensureRegistersIsMutable();
        this.registers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBacktraceNote(int i, String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryDump(int i, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.set(i, tombstoneProtos$MemoryDump);
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
    public void setRegisters(int i, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.set(i, tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreadableElfFiles(int i, String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBacktraceNote() {
        this.backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentBacktrace() {
        this.currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryDump() {
        this.memoryDump_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisters() {
        this.registers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreadableElfFiles() {
        this.unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    private TombstoneProtos$Thread() {
    }

    public static defaultViewModelProviderFactory_delegatelambda0 newBuilder(TombstoneProtos$Thread tombstoneProtos$Thread) {
        return (defaultViewModelProviderFactory_delegatelambda0) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Thread);
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Thread parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$Thread parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(int i, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(i, tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(int i, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(i, tombstoneProtos$Register);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
