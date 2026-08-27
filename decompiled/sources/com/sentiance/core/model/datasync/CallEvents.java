package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.DelayedInitializationAnalyticsBehavior;
import o.InAppMessageEvent;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.getStaticExternalIEventMessengerandroid_sdk_base_releaseannotations;
import o.onSuccess;
import o.r8lambdaUCFjTER5BBZqe6irs_HCrazmuyE;
import o.r8lambdaY3dtkULL93vi8xHNZeBitkB4C4;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class CallEvents extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CALL_EVENTS_FIELD_NUMBER = 2;
    private static final CallEvents DEFAULT_INSTANCE;
    public static final int IS_CALL_DETECTION_ATTEMPTED_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER;
    private onSuccess callEvents_ = GeneratedMessageLite.emptyProtobufList();
    private boolean isCallDetectionAttempted_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCallDetectionAttempted() {
        this.isCallDetectionAttempted_ = false;
    }

    public static CallEvents getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCallDetectionAttempted(boolean z) {
        this.isCallDetectionAttempted_ = z;
    }

    public List<CallEvent> getCallEventsList() {
        return this.callEvents_;
    }

    public List<? extends getStaticExternalIEventMessengerandroid_sdk_base_releaseannotations> getCallEventsOrBuilderList() {
        return this.callEvents_;
    }

    public boolean getIsCallDetectionAttempted() {
        return this.isCallDetectionAttempted_;
    }

    static {
        CallEvents callEvents = new CallEvents();
        DEFAULT_INSTANCE = callEvents;
        GeneratedMessageLite.registerDefaultInstance(CallEvents.class, callEvents);
    }

    public static r8lambdaY3dtkULL93vi8xHNZeBitkB4C4 newBuilder() {
        return (r8lambdaY3dtkULL93vi8xHNZeBitkB4C4) DEFAULT_INSTANCE.createBuilder();
    }

    public static CallEvents parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CallEvents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (r8lambdaUCFjTER5BBZqe6irs_HCrazmuyE.IconCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new CallEvents();
            case 2:
                return new r8lambdaY3dtkULL93vi8xHNZeBitkB4C4(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002\u001b", new Object[]{"isCallDetectionAttempted_", "callEvents_", CallEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (CallEvents.class) {
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

    public CallEvent getCallEvents(int i) {
        return (CallEvent) this.callEvents_.get(i);
    }

    public int getCallEventsCount() {
        return this.callEvents_.size();
    }

    public getStaticExternalIEventMessengerandroid_sdk_base_releaseannotations getCallEventsOrBuilder(int i) {
        return (getStaticExternalIEventMessengerandroid_sdk_base_releaseannotations) this.callEvents_.get(i);
    }

    private CallEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCallEvents(Iterable<? extends CallEvent> iterable) {
        ensureCallEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.callEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallEvents(CallEvent callEvent) {
        callEvent.getClass();
        ensureCallEventsIsMutable();
        this.callEvents_.add(callEvent);
    }

    private void ensureCallEventsIsMutable() {
        onSuccess onsuccess = this.callEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.callEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCallEvents(int i) {
        ensureCallEventsIsMutable();
        this.callEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallEvents(int i, CallEvent callEvent) {
        callEvent.getClass();
        ensureCallEventsIsMutable();
        this.callEvents_.set(i, callEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallEvents() {
        this.callEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static r8lambdaY3dtkULL93vi8xHNZeBitkB4C4 newBuilder(CallEvents callEvents) {
        return (r8lambdaY3dtkULL93vi8xHNZeBitkB4C4) DEFAULT_INSTANCE.createBuilder(callEvents);
    }

    public static CallEvents parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static CallEvents parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static CallEvents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CallEvents parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallEvents(int i, CallEvent callEvent) {
        callEvent.getClass();
        ensureCallEventsIsMutable();
        this.callEvents_.add(i, callEvent);
    }

    public static CallEvents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CallEvents parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static CallEvents parseFrom(InputStream inputStream) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CallEvents parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static CallEvents parseFrom(u uVar) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static CallEvents parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (CallEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
