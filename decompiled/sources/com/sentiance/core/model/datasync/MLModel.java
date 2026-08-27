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
import o.clearDataStoreDatalambda0;
import o.clearInstancelambda00;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitialization;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class MLModel extends GeneratedMessageLite implements shouldAllowSingletonInitialization {
    private static final MLModel DEFAULT_INSTANCE;
    public static final int FLAVOR_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private String version_ = "";
    private String flavor_ = "";

    public static MLModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getFlavor() {
        return this.flavor_;
    }

    public String getName() {
        return this.name_;
    }

    public String getVersion() {
        return this.version_;
    }

    static {
        MLModel mLModel = new MLModel();
        DEFAULT_INSTANCE = mLModel;
        GeneratedMessageLite.registerDefaultInstance(MLModel.class, mLModel);
    }

    public static clearDataStoreDatalambda0 newBuilder() {
        return (clearDataStoreDatalambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static MLModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MLModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MLModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (clearInstancelambda00.IconCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new MLModel();
            case 2:
                return new clearDataStoreDatalambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "version_", "flavor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (MLModel.class) {
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

    public ByteString getFlavorBytes() {
        return ByteString.read(this.flavor_);
    }

    public ByteString getNameBytes() {
        return ByteString.read(this.name_);
    }

    public ByteString getVersionBytes() {
        return ByteString.read(this.version_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlavor(String str) {
        str.getClass();
        this.flavor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlavorBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.flavor_ = byteString.write();
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
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlavor() {
        this.flavor_ = getDefaultInstance().getFlavor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private MLModel() {
    }

    public static clearDataStoreDatalambda0 newBuilder(MLModel mLModel) {
        return (clearDataStoreDatalambda0) DEFAULT_INSTANCE.createBuilder(mLModel);
    }

    public static MLModel parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (MLModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static MLModel parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static MLModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MLModel parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static MLModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MLModel parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static MLModel parseFrom(InputStream inputStream) throws IOException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MLModel parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static MLModel parseFrom(u uVar) throws IOException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static MLModel parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (MLModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
