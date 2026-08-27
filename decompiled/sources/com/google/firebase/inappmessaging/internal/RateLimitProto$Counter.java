package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.cacheIfAlive;
import o.checkAddView;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class RateLimitProto$Counter extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final RateLimitProto$Counter DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    private RateLimitProto$Counter() {
    }

    public static RateLimitProto$Counter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeEpoch(long j) {
        this.startTimeEpoch_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    public long getStartTimeEpoch() {
        return this.startTimeEpoch_;
    }

    public long getValue() {
        return this.value_;
    }

    static {
        RateLimitProto$Counter rateLimitProto$Counter = new RateLimitProto$Counter();
        DEFAULT_INSTANCE = rateLimitProto$Counter;
        GeneratedMessageLite.registerDefaultInstance(RateLimitProto$Counter.class, rateLimitProto$Counter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimeEpoch() {
        this.startTimeEpoch_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static cacheIfAlive newBuilder() {
        return (cacheIfAlive) DEFAULT_INSTANCE.createBuilder();
    }

    public static RateLimitProto$Counter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$Counter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (checkAddView.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new RateLimitProto$Counter();
            case 2:
                return new cacheIfAlive(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (RateLimitProto$Counter.class) {
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

    public static cacheIfAlive newBuilder(RateLimitProto$Counter rateLimitProto$Counter) {
        return (cacheIfAlive) DEFAULT_INSTANCE.createBuilder(rateLimitProto$Counter);
    }

    public static RateLimitProto$Counter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$Counter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$Counter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static RateLimitProto$Counter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$Counter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RateLimitProto$Counter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$Counter parseFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$Counter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$Counter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RateLimitProto$Counter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$Counter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
