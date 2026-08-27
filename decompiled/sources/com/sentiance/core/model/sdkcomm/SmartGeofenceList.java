package com.sentiance.core.model.sdkcomm;

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
import o.onSuccess;
import o.r8lambdajH0yDT0JR5y8z9iPS4Y2tybPBWE;
import o.r8lambdak9noXonxEUkwvJe8dghJiuB8G0;
import o.r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class SmartGeofenceList extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final SmartGeofenceList DEFAULT_INSTANCE;
    public static final int GEOFENCES_FIELD_NUMBER = 1;
    public static final int LAST_MODIFICATION_TIME_EPOCH_UTC_FIELD_NUMBER = 2;
    private static volatile writeStringlambda1 PARSER;
    private onSuccess geofences_ = GeneratedMessageLite.emptyProtobufList();
    private long lastModificationTimeEpochUtc_;

    public static SmartGeofenceList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastModificationTimeEpochUtc(long j) {
        this.lastModificationTimeEpochUtc_ = j;
    }

    public List<SmartGeofence> getGeofencesList() {
        return this.geofences_;
    }

    public List<? extends r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs> getGeofencesOrBuilderList() {
        return this.geofences_;
    }

    public long getLastModificationTimeEpochUtc() {
        return this.lastModificationTimeEpochUtc_;
    }

    static {
        SmartGeofenceList smartGeofenceList = new SmartGeofenceList();
        DEFAULT_INSTANCE = smartGeofenceList;
        GeneratedMessageLite.registerDefaultInstance(SmartGeofenceList.class, smartGeofenceList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastModificationTimeEpochUtc() {
        this.lastModificationTimeEpochUtc_ = 0L;
    }

    public static r8lambdak9noXonxEUkwvJe8dghJiuB8G0 newBuilder() {
        return (r8lambdak9noXonxEUkwvJe8dghJiuB8G0) DEFAULT_INSTANCE.createBuilder();
    }

    public static SmartGeofenceList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmartGeofenceList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (r8lambdajH0yDT0JR5y8z9iPS4Y2tybPBWE.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new SmartGeofenceList();
            case 2:
                return new r8lambdak9noXonxEUkwvJe8dghJiuB8G0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"geofences_", SmartGeofence.class, "lastModificationTimeEpochUtc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SmartGeofenceList.class) {
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

    public SmartGeofence getGeofences(int i) {
        return (SmartGeofence) this.geofences_.get(i);
    }

    public int getGeofencesCount() {
        return this.geofences_.size();
    }

    public r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs getGeofencesOrBuilder(int i) {
        return (r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs) this.geofences_.get(i);
    }

    private SmartGeofenceList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGeofences(Iterable<? extends SmartGeofence> iterable) {
        ensureGeofencesIsMutable();
        a.addAll((Iterable) iterable, (List) this.geofences_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeofences(SmartGeofence smartGeofence) {
        smartGeofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.add(smartGeofence);
    }

    private void ensureGeofencesIsMutable() {
        onSuccess onsuccess = this.geofences_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.geofences_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGeofences(int i) {
        ensureGeofencesIsMutable();
        this.geofences_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeofences(int i, SmartGeofence smartGeofence) {
        smartGeofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.set(i, smartGeofence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeofences() {
        this.geofences_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static r8lambdak9noXonxEUkwvJe8dghJiuB8G0 newBuilder(SmartGeofenceList smartGeofenceList) {
        return (r8lambdak9noXonxEUkwvJe8dghJiuB8G0) DEFAULT_INSTANCE.createBuilder(smartGeofenceList);
    }

    public static SmartGeofenceList parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofenceList parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofenceList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SmartGeofenceList parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeofences(int i, SmartGeofence smartGeofence) {
        smartGeofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.add(i, smartGeofence);
    }

    public static SmartGeofenceList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SmartGeofenceList parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofenceList parseFrom(InputStream inputStream) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmartGeofenceList parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofenceList parseFrom(u uVar) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SmartGeofenceList parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofenceList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
