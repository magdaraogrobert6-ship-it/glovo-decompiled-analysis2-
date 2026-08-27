package com.google.apphosting.datastore.testing;

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
import o.DelegatableNodeRegistrationHandle;
import o.addLayoutNodeChildren;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.requireOwner;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$TestTrace extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final DatastoreTestTrace$TestTrace DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TRACE_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private String traceId_ = "";
    private decodeString action_ = GeneratedMessageLite.emptyProtobufList();
    private String traceDescription_ = "";

    public static DatastoreTestTrace$TestTrace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<DatastoreTestTrace$DatastoreAction> getActionList() {
        return this.action_;
    }

    public List<? extends addLayoutNodeChildren> getActionOrBuilderList() {
        return this.action_;
    }

    public String getTraceDescription() {
        return this.traceDescription_;
    }

    public String getTraceId() {
        return this.traceId_;
    }

    static {
        DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace = new DatastoreTestTrace$TestTrace();
        DEFAULT_INSTANCE = datastoreTestTrace$TestTrace;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$TestTrace.class, datastoreTestTrace$TestTrace);
    }

    public static requireOwner newBuilder() {
        return (requireOwner) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$TestTrace parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$TestTrace();
            case 2:
                return new requireOwner(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ", new Object[]{"traceId_", "action_", DatastoreTestTrace$DatastoreAction.class, "traceDescription_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$TestTrace.class) {
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

    public DatastoreTestTrace$DatastoreAction getAction(int i) {
        return (DatastoreTestTrace$DatastoreAction) this.action_.get(i);
    }

    public int getActionCount() {
        return this.action_.size();
    }

    public addLayoutNodeChildren getActionOrBuilder(int i) {
        return (addLayoutNodeChildren) this.action_.get(i);
    }

    public getClipMetadata getTraceDescriptionBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.traceDescription_);
    }

    public getClipMetadata getTraceIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.traceId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAction(DatastoreTestTrace$DatastoreAction datastoreTestTrace$DatastoreAction) {
        datastoreTestTrace$DatastoreAction.getClass();
        ensureActionIsMutable();
        this.action_.add(datastoreTestTrace$DatastoreAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAction(Iterable<? extends DatastoreTestTrace$DatastoreAction> iterable) {
        ensureActionIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.action_);
    }

    private void ensureActionIsMutable() {
        decodeString decodestring = this.action_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.action_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAction(int i) {
        ensureActionIsMutable();
        this.action_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(int i, DatastoreTestTrace$DatastoreAction datastoreTestTrace$DatastoreAction) {
        datastoreTestTrace$DatastoreAction.getClass();
        ensureActionIsMutable();
        this.action_.set(i, datastoreTestTrace$DatastoreAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceDescription(String str) {
        str.getClass();
        this.traceDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceDescriptionBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.traceDescription_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceId(String str) {
        str.getClass();
        this.traceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.traceId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceDescription() {
        this.traceDescription_ = getDefaultInstance().getTraceDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceId() {
        this.traceId_ = getDefaultInstance().getTraceId();
    }

    private DatastoreTestTrace$TestTrace() {
    }

    public static requireOwner newBuilder(DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace) {
        return (requireOwner) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$TestTrace);
    }

    public static DatastoreTestTrace$TestTrace parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAction(int i, DatastoreTestTrace$DatastoreAction datastoreTestTrace$DatastoreAction) {
        datastoreTestTrace$DatastoreAction.getClass();
        ensureActionIsMutable();
        this.action_.add(i, datastoreTestTrace$DatastoreAction);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$TestTrace parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
