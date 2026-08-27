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
import o.accessgetOnCommitAffectingLookaheadp;
import o.clearInvalidObservationsui;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.observeLayoutModifierSnapshotReadsAffectingLookaheadui;
import o.observeLayoutSnapshotReadsui;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonTypesProto$TriggeringCondition extends GeneratedMessageLite implements clearInvalidObservationsui {
    private static final CommonTypesProto$TriggeringCondition DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCondition() {
        this.conditionCase_ = 0;
        this.condition_ = null;
    }

    public static CommonTypesProto$TriggeringCondition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamTriggerValue(int i) {
        this.conditionCase_ = 1;
        this.condition_ = Integer.valueOf(i);
    }

    public boolean hasEvent() {
        return this.conditionCase_ == 2;
    }

    public boolean hasFiamTrigger() {
        return this.conditionCase_ == 1;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum IconCompatParcelizer {
        FIAM_TRIGGER(1),
        EVENT(2),
        CONDITION_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        IconCompatParcelizer(int i) {
            this.value = i;
        }

        @Deprecated
        public static IconCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static IconCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return CONDITION_NOT_SET;
            }
            if (i == 1) {
                return FIAM_TRIGGER;
            }
            if (i != 2) {
                return null;
            }
            return EVENT;
        }
    }

    static {
        CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition = new CommonTypesProto$TriggeringCondition();
        DEFAULT_INSTANCE = commonTypesProto$TriggeringCondition;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$TriggeringCondition.class, commonTypesProto$TriggeringCondition);
    }

    public static observeLayoutModifierSnapshotReadsAffectingLookaheadui newBuilder() {
        return (observeLayoutModifierSnapshotReadsAffectingLookaheadui) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$TriggeringCondition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$TriggeringCondition();
            case 2:
                return new observeLayoutModifierSnapshotReadsAffectingLookaheadui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", CommonTypesProto$Event.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$TriggeringCondition.class) {
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

    public IconCompatParcelizer getConditionCase() {
        return IconCompatParcelizer.forNumber(this.conditionCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvent(CommonTypesProto$Event commonTypesProto$Event) {
        commonTypesProto$Event.getClass();
        if (this.conditionCase_ != 2 || this.condition_ == CommonTypesProto$Event.getDefaultInstance()) {
            this.condition_ = commonTypesProto$Event;
        } else {
            accessgetOnCommitAffectingLookaheadp accessgetoncommitaffectinglookaheadpNewBuilder = CommonTypesProto$Event.newBuilder((CommonTypesProto$Event) this.condition_);
            accessgetoncommitaffectinglookaheadpNewBuilder.read(commonTypesProto$Event);
            this.condition_ = accessgetoncommitaffectinglookaheadpNewBuilder.read();
        }
        this.conditionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(CommonTypesProto$Event commonTypesProto$Event) {
        commonTypesProto$Event.getClass();
        this.condition_ = commonTypesProto$Event;
        this.conditionCase_ = 2;
    }

    private CommonTypesProto$TriggeringCondition() {
    }

    public CommonTypesProto$Event getEvent() {
        return this.conditionCase_ == 2 ? (CommonTypesProto$Event) this.condition_ : CommonTypesProto$Event.getDefaultInstance();
    }

    public observeLayoutSnapshotReadsui getFiamTrigger() {
        if (this.conditionCase_ != 1) {
            return observeLayoutSnapshotReadsui.UNKNOWN_TRIGGER;
        }
        observeLayoutSnapshotReadsui observelayoutsnapshotreadsuiForNumber = observeLayoutSnapshotReadsui.forNumber(((Integer) this.condition_).intValue());
        return observelayoutsnapshotreadsuiForNumber == null ? observeLayoutSnapshotReadsui.UNRECOGNIZED : observelayoutsnapshotreadsuiForNumber;
    }

    public int getFiamTriggerValue() {
        if (this.conditionCase_ == 1) {
            return ((Integer) this.condition_).intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        if (this.conditionCase_ == 2) {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFiamTrigger() {
        if (this.conditionCase_ == 1) {
            this.conditionCase_ = 0;
            this.condition_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamTrigger(observeLayoutSnapshotReadsui observelayoutsnapshotreadsui) {
        this.condition_ = Integer.valueOf(observelayoutsnapshotreadsui.getNumber());
        this.conditionCase_ = 1;
    }

    public static observeLayoutModifierSnapshotReadsAffectingLookaheadui newBuilder(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        return (observeLayoutModifierSnapshotReadsAffectingLookaheadui) DEFAULT_INSTANCE.createBuilder(commonTypesProto$TriggeringCondition);
    }

    public static CommonTypesProto$TriggeringCondition parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$TriggeringCondition parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggeringCondition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
