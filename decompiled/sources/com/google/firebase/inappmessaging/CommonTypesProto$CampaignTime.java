package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.type.Date;
import com.google.type.TimeOfDay;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessgetObserverp;
import o.accessgetOnCommitAffectingLayoutModifierp;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.scheduleFrameEndCallback;
import o.set_scaleFactor;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonTypesProto$CampaignTime extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int DATE_FIELD_NUMBER = 1;
    private static final CommonTypesProto$CampaignTime DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Date date_;
    private String timeZone_ = "";
    private TimeOfDay time_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = null;
        this.bitField0_ &= -3;
    }

    public static CommonTypesProto$CampaignTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getTimeZone() {
        return this.timeZone_;
    }

    public boolean hasDate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = new CommonTypesProto$CampaignTime();
        DEFAULT_INSTANCE = commonTypesProto$CampaignTime;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$CampaignTime.class, commonTypesProto$CampaignTime);
    }

    public static accessgetOnCommitAffectingLayoutModifierp newBuilder() {
        return (accessgetOnCommitAffectingLayoutModifierp) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$CampaignTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$CampaignTime();
            case 2:
                return new accessgetOnCommitAffectingLayoutModifierp(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ", new Object[]{"bitField0_", "date_", "time_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$CampaignTime.class) {
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

    public getClipMetadata getTimeZoneBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.timeZone_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDate(Date date) {
        date.getClass();
        Date date2 = this.date_;
        if (date2 == null || date2 == Date.getDefaultInstance()) {
            this.date_ = date;
        } else {
            scheduleFrameEndCallback scheduleframeendcallbackNewBuilder = Date.newBuilder(this.date_);
            scheduleframeendcallbackNewBuilder.read(date);
            this.date_ = (Date) scheduleframeendcallbackNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTime(TimeOfDay timeOfDay) {
        timeOfDay.getClass();
        TimeOfDay timeOfDay2 = this.time_;
        if (timeOfDay2 == null || timeOfDay2 == TimeOfDay.getDefaultInstance()) {
            this.time_ = timeOfDay;
        } else {
            set_scaleFactor set_scalefactorNewBuilder = TimeOfDay.newBuilder(this.time_);
            set_scalefactorNewBuilder.read(timeOfDay);
            this.time_ = (TimeOfDay) set_scalefactorNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(Date date) {
        date.getClass();
        this.date_ = date;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(TimeOfDay timeOfDay) {
        timeOfDay.getClass();
        this.time_ = timeOfDay;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.timeZone_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    public Date getDate() {
        Date date = this.date_;
        return date == null ? Date.getDefaultInstance() : date;
    }

    public TimeOfDay getTime() {
        TimeOfDay timeOfDay = this.time_;
        return timeOfDay == null ? TimeOfDay.getDefaultInstance() : timeOfDay;
    }

    private CommonTypesProto$CampaignTime() {
    }

    public static accessgetOnCommitAffectingLayoutModifierp newBuilder(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        return (accessgetOnCommitAffectingLayoutModifierp) DEFAULT_INSTANCE.createBuilder(commonTypesProto$CampaignTime);
    }

    public static CommonTypesProto$CampaignTime parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$CampaignTime parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$CampaignTime parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$CampaignTime parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$CampaignTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$CampaignTime parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$CampaignTime parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$CampaignTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$CampaignTime parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$CampaignTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
