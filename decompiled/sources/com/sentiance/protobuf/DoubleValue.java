package com.sentiance.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.putEnumSet;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.setConfigurationlambda0;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class DoubleValue extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    private DoubleValue() {
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double d) {
        this.value_ = d;
    }

    public double getValue() {
        return this.value_;
    }

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        GeneratedMessageLite.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static putEnumSet newBuilder() {
        return (putEnumSet) DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (setConfigurationlambda0.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new DoubleValue();
            case 2:
                return new putEnumSet(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (DoubleValue.class) {
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

    public static DoubleValue of(double d) {
        putEnumSet putenumsetNewBuilder = newBuilder();
        putenumsetNewBuilder.serializer();
        ((DoubleValue) putenumsetNewBuilder.write).setValue(d);
        return (DoubleValue) putenumsetNewBuilder.write();
    }

    public static putEnumSet newBuilder(DoubleValue doubleValue) {
        return (putEnumSet) DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static DoubleValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DoubleValue parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static DoubleValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DoubleValue parseFrom(u uVar) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static DoubleValue parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DoubleValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
