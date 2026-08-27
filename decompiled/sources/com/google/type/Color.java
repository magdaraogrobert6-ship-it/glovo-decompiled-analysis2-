package com.google.type;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalGraphicsContext1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getOrCreateRetainedValuesStoreEntry;
import o.onCleared;

/* JADX INFO: loaded from: classes4.dex */
public final class Color extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private int bitField0_;
    private float blue_;
    private float green_;
    private float red_;

    private Color() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlpha() {
        this.alpha_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlue() {
        this.blue_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGreen() {
        this.green_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlue(float f) {
        this.blue_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGreen(float f) {
        this.green_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRed(float f) {
        this.red_ = f;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public boolean hasAlpha() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        GeneratedMessageLite.registerDefaultInstance(Color.class, color);
    }

    public static getOrCreateRetainedValuesStoreEntry newBuilder() {
        return (getOrCreateRetainedValuesStoreEntry) DEFAULT_INSTANCE.createBuilder();
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Color) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (onCleared.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Color();
            case 2:
                return new getOrCreateRetainedValuesStoreEntry(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "red_", "green_", "blue_", "alpha_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Color.class) {
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
    public void mergeAlpha(FloatValue floatValue) {
        floatValue.getClass();
        FloatValue floatValue2 = this.alpha_;
        if (floatValue2 == null || floatValue2 == FloatValue.getDefaultInstance()) {
            this.alpha_ = floatValue;
        } else {
            CompositionLocalsKtLocalGraphicsContext1 compositionLocalsKtLocalGraphicsContext1NewBuilder = FloatValue.newBuilder(this.alpha_);
            compositionLocalsKtLocalGraphicsContext1NewBuilder.read(floatValue);
            this.alpha_ = (FloatValue) compositionLocalsKtLocalGraphicsContext1NewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlpha(FloatValue floatValue) {
        floatValue.getClass();
        this.alpha_ = floatValue;
        this.bitField0_ |= 1;
    }

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        return floatValue == null ? FloatValue.getDefaultInstance() : floatValue;
    }

    public static getOrCreateRetainedValuesStoreEntry newBuilder(Color color) {
        return (getOrCreateRetainedValuesStoreEntry) DEFAULT_INSTANCE.createBuilder(color);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Color) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Color parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Color parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Color parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static Color parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Color parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Color parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Color parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Color parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Color) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
