package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.enableSdklambda0;
import o.getAlignmentLinesMap;
import o.getDeviceDataProviderandroid_sdk_base_releaseannotations;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.stopInstancelambda2;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class TransportTag extends GeneratedMessageLite implements stopInstancelambda2 {
    private static final TransportTag DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private String value_ = "";

    public static TransportTag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getName() {
        return this.name_;
    }

    public String getValue() {
        return this.value_;
    }

    static {
        TransportTag transportTag = new TransportTag();
        DEFAULT_INSTANCE = transportTag;
        GeneratedMessageLite.registerDefaultInstance(TransportTag.class, transportTag);
    }

    public static getDeviceDataProviderandroid_sdk_base_releaseannotations newBuilder() {
        return (getDeviceDataProviderandroid_sdk_base_releaseannotations) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportTag parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportTag parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (enableSdklambda0.serializer[methodToInvoke.ordinal()]) {
            case 1:
                return new TransportTag();
            case 2:
                return new getDeviceDataProviderandroid_sdk_base_releaseannotations(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (TransportTag.class) {
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

    public ByteString getNameBytes() {
        return ByteString.read(this.name_);
    }

    public ByteString getValueBytes() {
        return ByteString.read(this.value_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    private TransportTag() {
    }

    public static getDeviceDataProviderandroid_sdk_base_releaseannotations newBuilder(TransportTag transportTag) {
        return (getDeviceDataProviderandroid_sdk_base_releaseannotations) DEFAULT_INSTANCE.createBuilder(transportTag);
    }

    public static TransportTag parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static TransportTag parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static TransportTag parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TransportTag parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static TransportTag parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransportTag parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static TransportTag parseFrom(InputStream inputStream) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportTag parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static TransportTag parseFrom(u uVar) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static TransportTag parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
