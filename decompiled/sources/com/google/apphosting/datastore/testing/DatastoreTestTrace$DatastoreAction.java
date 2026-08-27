package com.google.apphosting.datastore.testing;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNodeKt;
import o.DelegatableNodeRegistrationHandle;
import o.addLayoutNodeChildren;
import o.asLayoutModifierNode;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.requireLayoutDirection;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$DatastoreAction extends GeneratedMessageLite implements addLayoutNodeChildren {
    public static final int ACTION_ID_FIELD_NUMBER = 200;
    private static final DatastoreTestTrace$DatastoreAction DEFAULT_INSTANCE;
    public static final int FIRESTORE_V1_ACTION_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int VALIDATION_RULE_FIELD_NUMBER = 201;
    private int actionCase_ = 0;
    private int actionId_;
    private Object action_;
    private int bitField0_;
    private DatastoreTestTrace$ValidationRule validationRule_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionId() {
        this.actionId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidationRule() {
        this.validationRule_ = null;
        this.bitField0_ &= -2;
    }

    public static DatastoreTestTrace$DatastoreAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionId(int i) {
        this.actionId_ = i;
    }

    public int getActionId() {
        return this.actionId_;
    }

    public boolean hasFirestoreV1Action() {
        return this.actionCase_ == 3;
    }

    public boolean hasValidationRule() {
        return (this.bitField0_ & 1) != 0;
    }

    public enum serializer {
        FIRESTORE_V1_ACTION(3),
        ACTION_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        serializer(int i) {
            this.value = i;
        }

        public static serializer forNumber(int i) {
            if (i == 0) {
                return ACTION_NOT_SET;
            }
            if (i != 3) {
                return null;
            }
            return FIRESTORE_V1_ACTION;
        }

        @Deprecated
        public static serializer valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        DatastoreTestTrace$DatastoreAction datastoreTestTrace$DatastoreAction = new DatastoreTestTrace$DatastoreAction();
        DEFAULT_INSTANCE = datastoreTestTrace$DatastoreAction;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$DatastoreAction.class, datastoreTestTrace$DatastoreAction);
    }

    public static DelegatableNodeKt newBuilder() {
        return (DelegatableNodeKt) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$DatastoreAction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$DatastoreAction();
            case 2:
                return new DelegatableNodeKt(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0003É\u0003\u0000\u0000\u0000\u0003<\u0000È\u0004Éဉ\u0000", new Object[]{"action_", "actionCase_", "bitField0_", DatastoreTestTrace$FirestoreV1Action.class, "actionId_", "validationRule_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$DatastoreAction.class) {
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

    public serializer getActionCase() {
        return serializer.forNumber(this.actionCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirestoreV1Action(DatastoreTestTrace$FirestoreV1Action datastoreTestTrace$FirestoreV1Action) {
        datastoreTestTrace$FirestoreV1Action.getClass();
        if (this.actionCase_ != 3 || this.action_ == DatastoreTestTrace$FirestoreV1Action.getDefaultInstance()) {
            this.action_ = datastoreTestTrace$FirestoreV1Action;
        } else {
            asLayoutModifierNode aslayoutmodifiernodeNewBuilder = DatastoreTestTrace$FirestoreV1Action.newBuilder((DatastoreTestTrace$FirestoreV1Action) this.action_);
            aslayoutmodifiernodeNewBuilder.read(datastoreTestTrace$FirestoreV1Action);
            this.action_ = aslayoutmodifiernodeNewBuilder.read();
        }
        this.actionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidationRule(DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule) {
        datastoreTestTrace$ValidationRule.getClass();
        DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule2 = this.validationRule_;
        if (datastoreTestTrace$ValidationRule2 == null || datastoreTestTrace$ValidationRule2 == DatastoreTestTrace$ValidationRule.getDefaultInstance()) {
            this.validationRule_ = datastoreTestTrace$ValidationRule;
        } else {
            requireLayoutDirection requirelayoutdirectionNewBuilder = DatastoreTestTrace$ValidationRule.newBuilder(this.validationRule_);
            requirelayoutdirectionNewBuilder.read(datastoreTestTrace$ValidationRule);
            this.validationRule_ = (DatastoreTestTrace$ValidationRule) requirelayoutdirectionNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirestoreV1Action(DatastoreTestTrace$FirestoreV1Action datastoreTestTrace$FirestoreV1Action) {
        datastoreTestTrace$FirestoreV1Action.getClass();
        this.action_ = datastoreTestTrace$FirestoreV1Action;
        this.actionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationRule(DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule) {
        datastoreTestTrace$ValidationRule.getClass();
        this.validationRule_ = datastoreTestTrace$ValidationRule;
        this.bitField0_ |= 1;
    }

    private DatastoreTestTrace$DatastoreAction() {
    }

    public DatastoreTestTrace$ValidationRule getValidationRule() {
        DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule = this.validationRule_;
        return datastoreTestTrace$ValidationRule == null ? DatastoreTestTrace$ValidationRule.getDefaultInstance() : datastoreTestTrace$ValidationRule;
    }

    public DatastoreTestTrace$FirestoreV1Action getFirestoreV1Action() {
        return this.actionCase_ == 3 ? (DatastoreTestTrace$FirestoreV1Action) this.action_ : DatastoreTestTrace$FirestoreV1Action.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirestoreV1Action() {
        if (this.actionCase_ == 3) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static DelegatableNodeKt newBuilder(DatastoreTestTrace$DatastoreAction datastoreTestTrace$DatastoreAction) {
        return (DelegatableNodeKt) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$DatastoreAction);
    }

    public static DatastoreTestTrace$DatastoreAction parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$DatastoreAction parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$DatastoreAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
