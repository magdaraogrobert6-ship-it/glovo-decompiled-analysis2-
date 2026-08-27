package com.google.apphosting.datastore.testing;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNodeRegistrationHandle;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.requireGraphicsContext;
import o.requireOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$TimelineTestTrace extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DatastoreTestTrace$TimelineTestTrace DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TEST_TRACE_FIELD_NUMBER = 1;
    private int bitField0_;
    private DatastoreTestTrace$TestTrace testTrace_;

    private DatastoreTestTrace$TimelineTestTrace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTestTrace() {
        this.testTrace_ = null;
        this.bitField0_ &= -2;
    }

    public static DatastoreTestTrace$TimelineTestTrace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasTestTrace() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        DatastoreTestTrace$TimelineTestTrace datastoreTestTrace$TimelineTestTrace = new DatastoreTestTrace$TimelineTestTrace();
        DEFAULT_INSTANCE = datastoreTestTrace$TimelineTestTrace;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$TimelineTestTrace.class, datastoreTestTrace$TimelineTestTrace);
    }

    public static requireGraphicsContext newBuilder() {
        return (requireGraphicsContext) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$TimelineTestTrace parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$TimelineTestTrace();
            case 2:
                return new requireGraphicsContext(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "testTrace_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$TimelineTestTrace.class) {
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
    public void mergeTestTrace(DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace) {
        datastoreTestTrace$TestTrace.getClass();
        DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace2 = this.testTrace_;
        if (datastoreTestTrace$TestTrace2 == null || datastoreTestTrace$TestTrace2 == DatastoreTestTrace$TestTrace.getDefaultInstance()) {
            this.testTrace_ = datastoreTestTrace$TestTrace;
        } else {
            requireOwner requireownerNewBuilder = DatastoreTestTrace$TestTrace.newBuilder(this.testTrace_);
            requireownerNewBuilder.read(datastoreTestTrace$TestTrace);
            this.testTrace_ = (DatastoreTestTrace$TestTrace) requireownerNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTestTrace(DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace) {
        datastoreTestTrace$TestTrace.getClass();
        this.testTrace_ = datastoreTestTrace$TestTrace;
        this.bitField0_ |= 1;
    }

    public DatastoreTestTrace$TestTrace getTestTrace() {
        DatastoreTestTrace$TestTrace datastoreTestTrace$TestTrace = this.testTrace_;
        return datastoreTestTrace$TestTrace == null ? DatastoreTestTrace$TestTrace.getDefaultInstance() : datastoreTestTrace$TestTrace;
    }

    public static requireGraphicsContext newBuilder(DatastoreTestTrace$TimelineTestTrace datastoreTestTrace$TimelineTestTrace) {
        return (requireGraphicsContext) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$TimelineTestTrace);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$TimelineTestTrace parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$TimelineTestTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
