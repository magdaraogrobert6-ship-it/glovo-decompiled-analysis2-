package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.r8lambdaoxkgntaV1d_YaO5day16NC6GCgM;
import o.r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTime extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final DateTime DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int TIMESTAMP_UTC_MILLISECONDS_FIELD_NUMBER = 1;
    public static final int TIMEZONE_OFFSET_MINUTES_FIELD_NUMBER = 2;
    private long timestampUtcMilliseconds_;
    private int timezoneOffsetMinutes_;

    private DateTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimezoneOffsetMinutes() {
        this.timezoneOffsetMinutes_ = 0;
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampUtcMilliseconds(long j) {
        this.timestampUtcMilliseconds_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimezoneOffsetMinutes(int i) {
        this.timezoneOffsetMinutes_ = i;
    }

    public long getTimestampUtcMilliseconds() {
        return this.timestampUtcMilliseconds_;
    }

    public int getTimezoneOffsetMinutes() {
        return this.timezoneOffsetMinutes_;
    }

    static {
        DateTime dateTime = new DateTime();
        DEFAULT_INSTANCE = dateTime;
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampUtcMilliseconds() {
        this.timestampUtcMilliseconds_ = 0L;
    }

    public static r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E newBuilder() {
        return (r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E) DEFAULT_INSTANCE.createBuilder();
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (r8lambdaoxkgntaV1d_YaO5day16NC6GCgM.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new DateTime();
            case 2:
                return new r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"timestampUtcMilliseconds_", "timezoneOffsetMinutes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (DateTime.class) {
                    r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                    if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                        PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                    }
                    break;
                }
                return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public static r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E newBuilder(DateTime dateTime) {
        return (r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E) DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DateTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static DateTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DateTime parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static DateTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DateTime parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static DateTime parseFrom(InputStream inputStream) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DateTime parseFrom(u uVar) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static DateTime parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DateTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
