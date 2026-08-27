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
import o.SweepGradientShader9KIMszodefault;
import o.accessgetDiskLruCachep;
import o.clearSharedPreferencesDatalambda2;
import o.configurelambda10;
import o.enableDelayedInitializationlambda3;
import o.getAlignmentLinesMap;
import o.r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class Payload extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CREATION_TIME_FIELD_NUMBER = 2;
    public static final int DATA_FIELD_NUMBER = 4;
    private static final Payload DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private DateTime creationTime_;
    private Data data_;
    private Sdk sdk_;
    private String uuid_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTime() {
        this.creationTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdk() {
        this.sdk_ = null;
        this.bitField0_ &= -3;
    }

    public static Payload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getUuid() {
        return this.uuid_;
    }

    public boolean hasCreationTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasData() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSdk() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        Payload payload = new Payload();
        DEFAULT_INSTANCE = payload;
        GeneratedMessageLite.registerDefaultInstance(Payload.class, payload);
    }

    public static configurelambda10 newBuilder() {
        return (configurelambda10) DEFAULT_INSTANCE.createBuilder();
    }

    public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (clearSharedPreferencesDatalambda2.write[methodToInvoke.ordinal()]) {
            case 1:
                return new Payload();
            case 2:
                return new configurelambda10(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "uuid_", "creationTime_", "sdk_", "data_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Payload.class) {
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

    public ByteString getUuidBytes() {
        return ByteString.read(this.uuid_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreationTime(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.creationTime_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.creationTime_ = dateTime;
        } else {
            this.creationTime_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.creationTime_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(Data data) {
        data.getClass();
        Data data2 = this.data_;
        if (data2 == null || data2 == Data.getDefaultInstance()) {
            this.data_ = data;
        } else {
            r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder = Data.newBuilder(this.data_);
            r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.serializer(data);
            this.data_ = (Data) r8lambdaid3borgkeo1h7cq0n0babsqzn_sNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdk(Sdk sdk) {
        sdk.getClass();
        Sdk sdk2 = this.sdk_;
        if (sdk2 == null || sdk2 == Sdk.getDefaultInstance()) {
            this.sdk_ = sdk;
        } else {
            enableDelayedInitializationlambda3 enabledelayedinitializationlambda3NewBuilder = Sdk.newBuilder(this.sdk_);
            enabledelayedinitializationlambda3NewBuilder.serializer(sdk);
            this.sdk_ = (Sdk) enabledelayedinitializationlambda3NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTime(DateTime dateTime) {
        dateTime.getClass();
        this.creationTime_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(Data data) {
        data.getClass();
        this.data_ = data;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdk(Sdk sdk) {
        sdk.getClass();
        this.sdk_ = sdk;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        str.getClass();
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.uuid_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.uuid_ = getDefaultInstance().getUuid();
    }

    public DateTime getCreationTime() {
        DateTime dateTime = this.creationTime_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public Data getData() {
        Data data = this.data_;
        return data == null ? Data.getDefaultInstance() : data;
    }

    public Sdk getSdk() {
        Sdk sdk = this.sdk_;
        return sdk == null ? Sdk.getDefaultInstance() : sdk;
    }

    private Payload() {
    }

    public static configurelambda10 newBuilder(Payload payload) {
        return (configurelambda10) DEFAULT_INSTANCE.createBuilder(payload);
    }

    public static Payload parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Payload parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Payload parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Payload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Payload parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Payload parseFrom(InputStream inputStream) throws IOException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Payload parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Payload parseFrom(u uVar) throws IOException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Payload parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
