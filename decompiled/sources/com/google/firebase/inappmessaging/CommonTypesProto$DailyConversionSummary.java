package com.google.firebase.inappmessaging;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessgetObserverp;
import o.accessgetOnCommitAffectingLookaheadMeasurep;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonTypesProto$DailyConversionSummary extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CONVERSIONS_FIELD_NUMBER = 2;
    private static final CommonTypesProto$DailyConversionSummary DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
    private int conversions_;
    private long startOfDayMillis_;

    private CommonTypesProto$DailyConversionSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversions() {
        this.conversions_ = 0;
    }

    public static CommonTypesProto$DailyConversionSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversions(int i) {
        this.conversions_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartOfDayMillis(long j) {
        this.startOfDayMillis_ = j;
    }

    public int getConversions() {
        return this.conversions_;
    }

    public long getStartOfDayMillis() {
        return this.startOfDayMillis_;
    }

    static {
        CommonTypesProto$DailyConversionSummary commonTypesProto$DailyConversionSummary = new CommonTypesProto$DailyConversionSummary();
        DEFAULT_INSTANCE = commonTypesProto$DailyConversionSummary;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$DailyConversionSummary.class, commonTypesProto$DailyConversionSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartOfDayMillis() {
        this.startOfDayMillis_ = 0L;
    }

    public static accessgetOnCommitAffectingLookaheadMeasurep newBuilder() {
        return (accessgetOnCommitAffectingLookaheadMeasurep) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$DailyConversionSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$DailyConversionSummary();
            case 2:
                return new accessgetOnCommitAffectingLookaheadMeasurep(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"startOfDayMillis_", "conversions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$DailyConversionSummary.class) {
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

    public static accessgetOnCommitAffectingLookaheadMeasurep newBuilder(CommonTypesProto$DailyConversionSummary commonTypesProto$DailyConversionSummary) {
        return (accessgetOnCommitAffectingLookaheadMeasurep) DEFAULT_INSTANCE.createBuilder(commonTypesProto$DailyConversionSummary);
    }

    public static CommonTypesProto$DailyConversionSummary parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$DailyConversionSummary parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyConversionSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
