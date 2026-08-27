package com.sentiance.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.LocationProviderName;
import o.accesssetDiskCacheStartingp;
import o.getAlignmentLinesMap;
import o.getGenderlambda1;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class Mixin extends GeneratedMessageLite implements accesssetDiskCacheStartingp {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getName() {
        return this.name_;
    }

    public String getRoot() {
        return this.root_;
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.registerDefaultInstance(Mixin.class, mixin);
    }

    public static LocationProviderName newBuilder() {
        return (LocationProviderName) DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getGenderlambda1.read[methodToInvoke.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new LocationProviderName(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Mixin.class) {
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

    public ByteString getRootBytes() {
        return ByteString.read(this.root_);
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
    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRootBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.root_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    private Mixin() {
    }

    public static LocationProviderName newBuilder(Mixin mixin) {
        return (LocationProviderName) DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Mixin) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Mixin parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Mixin parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Mixin parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Mixin parseFrom(u uVar) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Mixin parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Mixin) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
