package com.google.firebase.inappmessaging;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.OwnerSnapshotObserver;
import o.accessgetObserverp;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonTypesProto$DailyAnalyticsSummary extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CLICKS_FIELD_NUMBER = 3;
    private static final CommonTypesProto$DailyAnalyticsSummary DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 4;
    public static final int IMPRESSIONS_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int START_OF_DAY_MILLIS_FIELD_NUMBER = 1;
    private int clicks_;
    private int errors_;
    private int impressions_;
    private long startOfDayMillis_;

    private CommonTypesProto$DailyAnalyticsSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClicks() {
        this.clicks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrors() {
        this.errors_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressions() {
        this.impressions_ = 0;
    }

    public static CommonTypesProto$DailyAnalyticsSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClicks(int i) {
        this.clicks_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrors(int i) {
        this.errors_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressions(int i) {
        this.impressions_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartOfDayMillis(long j) {
        this.startOfDayMillis_ = j;
    }

    public int getClicks() {
        return this.clicks_;
    }

    public int getErrors() {
        return this.errors_;
    }

    public int getImpressions() {
        return this.impressions_;
    }

    public long getStartOfDayMillis() {
        return this.startOfDayMillis_;
    }

    static {
        CommonTypesProto$DailyAnalyticsSummary commonTypesProto$DailyAnalyticsSummary = new CommonTypesProto$DailyAnalyticsSummary();
        DEFAULT_INSTANCE = commonTypesProto$DailyAnalyticsSummary;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$DailyAnalyticsSummary.class, commonTypesProto$DailyAnalyticsSummary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartOfDayMillis() {
        this.startOfDayMillis_ = 0L;
    }

    public static OwnerSnapshotObserver newBuilder() {
        return (OwnerSnapshotObserver) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$DailyAnalyticsSummary();
            case 2:
                return new OwnerSnapshotObserver(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"startOfDayMillis_", "impressions_", "clicks_", "errors_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$DailyAnalyticsSummary.class) {
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

    public static OwnerSnapshotObserver newBuilder(CommonTypesProto$DailyAnalyticsSummary commonTypesProto$DailyAnalyticsSummary) {
        return (OwnerSnapshotObserver) DEFAULT_INSTANCE.createBuilder(commonTypesProto$DailyAnalyticsSummary);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$DailyAnalyticsSummary parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$DailyAnalyticsSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
