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
import o.enableMockNetworkRequestsAndDropEventsModelambda00;
import o.enableMockNetworkRequestsAndDropEventsModelambda01;
import o.getAlignmentLinesMap;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitializationlambda0;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class SpeedingEvents extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final SpeedingEvents DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SPEEDING_EVENTS_FIELD_NUMBER = 1;
    private onSuccess speedingEvents_ = GeneratedMessageLite.emptyProtobufList();

    public static SpeedingEvents getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<SpeedingEvent> getSpeedingEventsList() {
        return this.speedingEvents_;
    }

    public List<? extends shouldAllowSingletonInitializationlambda0> getSpeedingEventsOrBuilderList() {
        return this.speedingEvents_;
    }

    static {
        SpeedingEvents speedingEvents = new SpeedingEvents();
        DEFAULT_INSTANCE = speedingEvents;
        GeneratedMessageLite.registerDefaultInstance(SpeedingEvents.class, speedingEvents);
    }

    public static enableMockNetworkRequestsAndDropEventsModelambda00 newBuilder() {
        return (enableMockNetworkRequestsAndDropEventsModelambda00) DEFAULT_INSTANCE.createBuilder();
    }

    public static SpeedingEvents parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedingEvents parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (enableMockNetworkRequestsAndDropEventsModelambda01.serializer[methodToInvoke.ordinal()]) {
            case 1:
                return new SpeedingEvents();
            case 2:
                return new enableMockNetworkRequestsAndDropEventsModelambda00(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"speedingEvents_", SpeedingEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SpeedingEvents.class) {
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

    public SpeedingEvent getSpeedingEvents(int i) {
        return (SpeedingEvent) this.speedingEvents_.get(i);
    }

    public int getSpeedingEventsCount() {
        return this.speedingEvents_.size();
    }

    public shouldAllowSingletonInitializationlambda0 getSpeedingEventsOrBuilder(int i) {
        return (shouldAllowSingletonInitializationlambda0) this.speedingEvents_.get(i);
    }

    private SpeedingEvents() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeedingEvents(Iterable<? extends SpeedingEvent> iterable) {
        ensureSpeedingEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.speedingEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeedingEvents(SpeedingEvent speedingEvent) {
        speedingEvent.getClass();
        ensureSpeedingEventsIsMutable();
        this.speedingEvents_.add(speedingEvent);
    }

    private void ensureSpeedingEventsIsMutable() {
        onSuccess onsuccess = this.speedingEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.speedingEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpeedingEvents(int i) {
        ensureSpeedingEventsIsMutable();
        this.speedingEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedingEvents(int i, SpeedingEvent speedingEvent) {
        speedingEvent.getClass();
        ensureSpeedingEventsIsMutable();
        this.speedingEvents_.set(i, speedingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedingEvents() {
        this.speedingEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static enableMockNetworkRequestsAndDropEventsModelambda00 newBuilder(SpeedingEvents speedingEvents) {
        return (enableMockNetworkRequestsAndDropEventsModelambda00) DEFAULT_INSTANCE.createBuilder(speedingEvents);
    }

    public static SpeedingEvents parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedingEvents parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedingEvents parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpeedingEvents parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeedingEvents(int i, SpeedingEvent speedingEvent) {
        speedingEvent.getClass();
        ensureSpeedingEventsIsMutable();
        this.speedingEvents_.add(i, speedingEvent);
    }

    public static SpeedingEvents parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpeedingEvents parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedingEvents parseFrom(InputStream inputStream) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedingEvents parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedingEvents parseFrom(u uVar) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SpeedingEvents parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedingEvents) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
