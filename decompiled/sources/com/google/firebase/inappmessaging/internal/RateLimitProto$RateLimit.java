package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.checkAddView;
import o.component23;
import o.dumpRenderNodeData;
import o.ensureCompositionCreated;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getDisposeViewCompositionStrategyannotations;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class RateLimitProto$RateLimit extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final RateLimitProto$RateLimit DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private fromDpSizeitqla9I limits_ = fromDpSizeitqla9I.serializer;

    public static RateLimitProto$RateLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RateLimitProto$Counter> getMutableLimitsMap() {
        return internalGetMutableLimits();
    }

    private fromDpSizeitqla9I internalGetLimits() {
        return this.limits_;
    }

    @Deprecated
    public Map<String, RateLimitProto$Counter> getLimits() {
        return getLimitsMap();
    }

    static {
        RateLimitProto$RateLimit rateLimitProto$RateLimit = new RateLimitProto$RateLimit();
        DEFAULT_INSTANCE = rateLimitProto$RateLimit;
        GeneratedMessageLite.registerDefaultInstance(RateLimitProto$RateLimit.class, rateLimitProto$RateLimit);
    }

    private fromDpSizeitqla9I internalGetMutableLimits() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.limits_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.limits_ = fromdpsizeitqla9i.serializer();
        }
        return this.limits_;
    }

    public static getDisposeViewCompositionStrategyannotations newBuilder() {
        return (getDisposeViewCompositionStrategyannotations) DEFAULT_INSTANCE.createBuilder();
    }

    public static RateLimitProto$RateLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (checkAddView.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new RateLimitProto$RateLimit();
            case 2:
                return new getDisposeViewCompositionStrategyannotations();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", ensureCompositionCreated.RemoteActionCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (RateLimitProto$RateLimit.class) {
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

    private RateLimitProto$RateLimit() {
    }

    public boolean containsLimits(String str) {
        str.getClass();
        return internalGetLimits().containsKey(str);
    }

    public RateLimitProto$Counter getLimitsOrDefault(String str, RateLimitProto$Counter rateLimitProto$Counter) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetLimits = internalGetLimits();
        return fromdpsizeitqla9iInternalGetLimits.containsKey(str) ? (RateLimitProto$Counter) fromdpsizeitqla9iInternalGetLimits.get(str) : rateLimitProto$Counter;
    }

    public RateLimitProto$Counter getLimitsOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetLimits = internalGetLimits();
        if (fromdpsizeitqla9iInternalGetLimits.containsKey(str)) {
            return (RateLimitProto$Counter) fromdpsizeitqla9iInternalGetLimits.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    public int getLimitsCount() {
        return internalGetLimits().size();
    }

    public Map<String, RateLimitProto$Counter> getLimitsMap() {
        return Collections.unmodifiableMap(internalGetLimits());
    }

    public static getDisposeViewCompositionStrategyannotations newBuilder(RateLimitProto$RateLimit rateLimitProto$RateLimit) {
        return (getDisposeViewCompositionStrategyannotations) DEFAULT_INSTANCE.createBuilder(rateLimitProto$RateLimit);
    }

    public static RateLimitProto$RateLimit parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$RateLimit parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$RateLimit parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static RateLimitProto$RateLimit parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$RateLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RateLimitProto$RateLimit parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$RateLimit parseFrom(InputStream inputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static RateLimitProto$RateLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RateLimitProto$RateLimit parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (RateLimitProto$RateLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
