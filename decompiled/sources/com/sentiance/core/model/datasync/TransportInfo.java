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
import o.SweepGradientShader9KIMszodefault;
import o._get_isDelayedInitializationEnabled_lambda0;
import o._get_isDisabled_lambda0;
import o.accessgetDiskLruCachep;
import o.accessgetSdkEnablementProvider;
import o.disableDelayedInitializationlambda0;
import o.enableMockNetworkRequestsAndDropEventsModelambda00;
import o.enableMockNetworkRequestsAndDropEventsModelambda1;
import o.enableSdklambda1;
import o.getAlignmentLinesMap;
import o.isSdkDisabledOrDelayedannotations;
import o.onSuccess;
import o.r8lambdaY3dtkULL93vi8xHNZeBitkB4C4;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.setConfiguredCustomEndpointlambda00;
import o.shouldAllowSingletonInitializationlambda1;
import o.stopInstancelambda2;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class TransportInfo extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CALL_EVENTS_FIELD_NUMBER = 16;
    public static final int CALL_WHILE_MOVING_EVENTS_FIELD_NUMBER = 10;
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 1;
    public static final int HARSH_DRIVING_EVENTS_FIELD_NUMBER = 8;
    public static final int MODE_FIELD_NUMBER = 2;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int PHONE_USAGE_EVENTS_FIELD_NUMBER = 9;
    public static final int SAFETY_SCORES_FIELD_NUMBER = 7;
    public static final int SPEEDING_EVENTS_FIELD_NUMBER = 11;
    public static final int START_FIELD_NUMBER = 3;
    public static final int STOP_FIELD_NUMBER = 4;
    public static final int TRANSPORT_OCCUPANT_ROLE_FIELD_NUMBER = 13;
    public static final int TRANSPORT_TAGS_FIELD_NUMBER = 12;
    public static final int TRAVELLED_DISTANCE_METERS_FIELD_NUMBER = 14;
    public static final int VEHICLE_CRASH_EVENTS_FIELD_NUMBER = 6;
    public static final int WAYPOINTS_FIELD_NUMBER = 5;
    public static final int WRONG_WAY_DRIVING_EVENTS_FIELD_NUMBER = 15;
    private int bitField0_;
    private CallEvents callEvents_;
    private int mode_;
    private SafetyScores safetyScores_;
    private SpeedingEvents speedingEvents_;
    private DateTime start_;
    private DateTime stop_;
    private int transportOccupantRole_;
    private int travelledDistanceMeters_;
    private String eventId_ = "";
    private onSuccess waypoints_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess vehicleCrashEvents_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess harshDrivingEvents_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess phoneUsageEvents_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess callWhileMovingEvents_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess transportTags_ = GeneratedMessageLite.emptyProtobufList();
    private onSuccess wrongWayDrivingEvents_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallEvents() {
        this.callEvents_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSafetyScores() {
        this.safetyScores_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedingEvents() {
        this.speedingEvents_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStop() {
        this.stop_ = null;
        this.bitField0_ &= -3;
    }

    public static TransportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i) {
        this.mode_ = i;
    }

    public List<CallWhileMovingEvent> getCallWhileMovingEventsList() {
        return this.callWhileMovingEvents_;
    }

    public List<? extends isSdkDisabledOrDelayedannotations> getCallWhileMovingEventsOrBuilderList() {
        return this.callWhileMovingEvents_;
    }

    public String getEventId() {
        return this.eventId_;
    }

    public List<HarshDrivingEvent> getHarshDrivingEventsList() {
        return this.harshDrivingEvents_;
    }

    public List<? extends setConfiguredCustomEndpointlambda00> getHarshDrivingEventsOrBuilderList() {
        return this.harshDrivingEvents_;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public List<PhoneUsageEvent> getPhoneUsageEventsList() {
        return this.phoneUsageEvents_;
    }

    public List<? extends shouldAllowSingletonInitializationlambda1> getPhoneUsageEventsOrBuilderList() {
        return this.phoneUsageEvents_;
    }

    public int getTransportOccupantRoleValue() {
        return this.transportOccupantRole_;
    }

    public List<TransportTag> getTransportTagsList() {
        return this.transportTags_;
    }

    public List<? extends stopInstancelambda2> getTransportTagsOrBuilderList() {
        return this.transportTags_;
    }

    public int getTravelledDistanceMeters() {
        return this.travelledDistanceMeters_;
    }

    public List<VehicleCrashEvent> getVehicleCrashEventsList() {
        return this.vehicleCrashEvents_;
    }

    public List<? extends _get_isDisabled_lambda0> getVehicleCrashEventsOrBuilderList() {
        return this.vehicleCrashEvents_;
    }

    public List<Waypoint> getWaypointsList() {
        return this.waypoints_;
    }

    public List<? extends _get_isDelayedInitializationEnabled_lambda0> getWaypointsOrBuilderList() {
        return this.waypoints_;
    }

    public List<WrongWayDrivingEvent> getWrongWayDrivingEventsList() {
        return this.wrongWayDrivingEvents_;
    }

    public List<? extends accessgetSdkEnablementProvider> getWrongWayDrivingEventsOrBuilderList() {
        return this.wrongWayDrivingEvents_;
    }

    public boolean hasCallEvents() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSafetyScores() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSpeedingEvents() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStart() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStop() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransportOccupantRole() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTravelledDistanceMeters() {
        return (this.bitField0_ & 32) != 0;
    }

    static {
        TransportInfo transportInfo = new TransportInfo();
        DEFAULT_INSTANCE = transportInfo;
        GeneratedMessageLite.registerDefaultInstance(TransportInfo.class, transportInfo);
    }

    public static enableSdklambda1 newBuilder() {
        return (enableSdklambda1) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (enableMockNetworkRequestsAndDropEventsModelambda1.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new TransportInfo();
            case 2:
                return new enableSdklambda1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0007\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002\b\u001b\t\u001b\n\u001b\u000bဉ\u0003\f\u001b\rဌ\u0004\u000eင\u0005\u000f\u001b\u0010ဉ\u0006", new Object[]{"bitField0_", "eventId_", "mode_", "start_", "stop_", "waypoints_", Waypoint.class, "vehicleCrashEvents_", VehicleCrashEvent.class, "safetyScores_", "harshDrivingEvents_", HarshDrivingEvent.class, "phoneUsageEvents_", PhoneUsageEvent.class, "callWhileMovingEvents_", CallWhileMovingEvent.class, "speedingEvents_", "transportTags_", TransportTag.class, "transportOccupantRole_", "travelledDistanceMeters_", "wrongWayDrivingEvents_", WrongWayDrivingEvent.class, "callEvents_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (TransportInfo.class) {
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

    public CallWhileMovingEvent getCallWhileMovingEvents(int i) {
        return (CallWhileMovingEvent) this.callWhileMovingEvents_.get(i);
    }

    public int getCallWhileMovingEventsCount() {
        return this.callWhileMovingEvents_.size();
    }

    public isSdkDisabledOrDelayedannotations getCallWhileMovingEventsOrBuilder(int i) {
        return (isSdkDisabledOrDelayedannotations) this.callWhileMovingEvents_.get(i);
    }

    public ByteString getEventIdBytes() {
        return ByteString.read(this.eventId_);
    }

    public HarshDrivingEvent getHarshDrivingEvents(int i) {
        return (HarshDrivingEvent) this.harshDrivingEvents_.get(i);
    }

    public int getHarshDrivingEventsCount() {
        return this.harshDrivingEvents_.size();
    }

    public setConfiguredCustomEndpointlambda00 getHarshDrivingEventsOrBuilder(int i) {
        return (setConfiguredCustomEndpointlambda00) this.harshDrivingEvents_.get(i);
    }

    public TransportMode getMode() {
        TransportMode transportModeForNumber = TransportMode.forNumber(this.mode_);
        return transportModeForNumber == null ? TransportMode.UNRECOGNIZED : transportModeForNumber;
    }

    public PhoneUsageEvent getPhoneUsageEvents(int i) {
        return (PhoneUsageEvent) this.phoneUsageEvents_.get(i);
    }

    public int getPhoneUsageEventsCount() {
        return this.phoneUsageEvents_.size();
    }

    public shouldAllowSingletonInitializationlambda1 getPhoneUsageEventsOrBuilder(int i) {
        return (shouldAllowSingletonInitializationlambda1) this.phoneUsageEvents_.get(i);
    }

    public TransportOccupantRole getTransportOccupantRole() {
        TransportOccupantRole transportOccupantRoleForNumber = TransportOccupantRole.forNumber(this.transportOccupantRole_);
        return transportOccupantRoleForNumber == null ? TransportOccupantRole.UNRECOGNIZED : transportOccupantRoleForNumber;
    }

    public TransportTag getTransportTags(int i) {
        return (TransportTag) this.transportTags_.get(i);
    }

    public int getTransportTagsCount() {
        return this.transportTags_.size();
    }

    public stopInstancelambda2 getTransportTagsOrBuilder(int i) {
        return (stopInstancelambda2) this.transportTags_.get(i);
    }

    public VehicleCrashEvent getVehicleCrashEvents(int i) {
        return (VehicleCrashEvent) this.vehicleCrashEvents_.get(i);
    }

    public int getVehicleCrashEventsCount() {
        return this.vehicleCrashEvents_.size();
    }

    public _get_isDisabled_lambda0 getVehicleCrashEventsOrBuilder(int i) {
        return (_get_isDisabled_lambda0) this.vehicleCrashEvents_.get(i);
    }

    public Waypoint getWaypoints(int i) {
        return (Waypoint) this.waypoints_.get(i);
    }

    public int getWaypointsCount() {
        return this.waypoints_.size();
    }

    public _get_isDelayedInitializationEnabled_lambda0 getWaypointsOrBuilder(int i) {
        return (_get_isDelayedInitializationEnabled_lambda0) this.waypoints_.get(i);
    }

    public WrongWayDrivingEvent getWrongWayDrivingEvents(int i) {
        return (WrongWayDrivingEvent) this.wrongWayDrivingEvents_.get(i);
    }

    public int getWrongWayDrivingEventsCount() {
        return this.wrongWayDrivingEvents_.size();
    }

    public accessgetSdkEnablementProvider getWrongWayDrivingEventsOrBuilder(int i) {
        return (accessgetSdkEnablementProvider) this.wrongWayDrivingEvents_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCallWhileMovingEvents(Iterable<? extends CallWhileMovingEvent> iterable) {
        ensureCallWhileMovingEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.callWhileMovingEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHarshDrivingEvents(Iterable<? extends HarshDrivingEvent> iterable) {
        ensureHarshDrivingEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.harshDrivingEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPhoneUsageEvents(Iterable<? extends PhoneUsageEvent> iterable) {
        ensurePhoneUsageEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.phoneUsageEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTransportTags(Iterable<? extends TransportTag> iterable) {
        ensureTransportTagsIsMutable();
        a.addAll((Iterable) iterable, (List) this.transportTags_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleCrashEvents(Iterable<? extends VehicleCrashEvent> iterable) {
        ensureVehicleCrashEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.vehicleCrashEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoints(Iterable<? extends Waypoint> iterable) {
        ensureWaypointsIsMutable();
        a.addAll((Iterable) iterable, (List) this.waypoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrongWayDrivingEvents(Iterable<? extends WrongWayDrivingEvent> iterable) {
        ensureWrongWayDrivingEventsIsMutable();
        a.addAll((Iterable) iterable, (List) this.wrongWayDrivingEvents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallWhileMovingEvents(CallWhileMovingEvent callWhileMovingEvent) {
        callWhileMovingEvent.getClass();
        ensureCallWhileMovingEventsIsMutable();
        this.callWhileMovingEvents_.add(callWhileMovingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHarshDrivingEvents(HarshDrivingEvent harshDrivingEvent) {
        harshDrivingEvent.getClass();
        ensureHarshDrivingEventsIsMutable();
        this.harshDrivingEvents_.add(harshDrivingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPhoneUsageEvents(PhoneUsageEvent phoneUsageEvent) {
        phoneUsageEvent.getClass();
        ensurePhoneUsageEventsIsMutable();
        this.phoneUsageEvents_.add(phoneUsageEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransportTags(TransportTag transportTag) {
        transportTag.getClass();
        ensureTransportTagsIsMutable();
        this.transportTags_.add(transportTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleCrashEvents(VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureVehicleCrashEventsIsMutable();
        this.vehicleCrashEvents_.add(vehicleCrashEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.add(waypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrongWayDrivingEvents(WrongWayDrivingEvent wrongWayDrivingEvent) {
        wrongWayDrivingEvent.getClass();
        ensureWrongWayDrivingEventsIsMutable();
        this.wrongWayDrivingEvents_.add(wrongWayDrivingEvent);
    }

    private void ensureCallWhileMovingEventsIsMutable() {
        onSuccess onsuccess = this.callWhileMovingEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.callWhileMovingEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensureHarshDrivingEventsIsMutable() {
        onSuccess onsuccess = this.harshDrivingEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.harshDrivingEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensurePhoneUsageEventsIsMutable() {
        onSuccess onsuccess = this.phoneUsageEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.phoneUsageEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensureTransportTagsIsMutable() {
        onSuccess onsuccess = this.transportTags_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.transportTags_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensureVehicleCrashEventsIsMutable() {
        onSuccess onsuccess = this.vehicleCrashEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.vehicleCrashEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensureWaypointsIsMutable() {
        onSuccess onsuccess = this.waypoints_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.waypoints_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    private void ensureWrongWayDrivingEventsIsMutable() {
        onSuccess onsuccess = this.wrongWayDrivingEvents_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.wrongWayDrivingEvents_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCallEvents(CallEvents callEvents) {
        callEvents.getClass();
        CallEvents callEvents2 = this.callEvents_;
        if (callEvents2 == null || callEvents2 == CallEvents.getDefaultInstance()) {
            this.callEvents_ = callEvents;
        } else {
            r8lambdaY3dtkULL93vi8xHNZeBitkB4C4 r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder = CallEvents.newBuilder(this.callEvents_);
            r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.serializer(callEvents);
            this.callEvents_ = (CallEvents) r8lambday3dtkull93vi8xhnzebitkb4c4NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSafetyScores(SafetyScores safetyScores) {
        safetyScores.getClass();
        SafetyScores safetyScores2 = this.safetyScores_;
        if (safetyScores2 == null || safetyScores2 == SafetyScores.getDefaultInstance()) {
            this.safetyScores_ = safetyScores;
        } else {
            disableDelayedInitializationlambda0 disabledelayedinitializationlambda0NewBuilder = SafetyScores.newBuilder(this.safetyScores_);
            disabledelayedinitializationlambda0NewBuilder.serializer(safetyScores);
            this.safetyScores_ = (SafetyScores) disabledelayedinitializationlambda0NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedingEvents(SpeedingEvents speedingEvents) {
        speedingEvents.getClass();
        SpeedingEvents speedingEvents2 = this.speedingEvents_;
        if (speedingEvents2 == null || speedingEvents2 == SpeedingEvents.getDefaultInstance()) {
            this.speedingEvents_ = speedingEvents;
        } else {
            enableMockNetworkRequestsAndDropEventsModelambda00 enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder = SpeedingEvents.newBuilder(this.speedingEvents_);
            enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder.serializer(speedingEvents);
            this.speedingEvents_ = (SpeedingEvents) enablemocknetworkrequestsanddropeventsmodelambda00NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStart(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.start_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.start_ = dateTime;
        } else {
            this.start_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.start_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStop(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.stop_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.stop_ = dateTime;
        } else {
            this.stop_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.stop_, dateTime);
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCallWhileMovingEvents(int i) {
        ensureCallWhileMovingEventsIsMutable();
        this.callWhileMovingEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHarshDrivingEvents(int i) {
        ensureHarshDrivingEventsIsMutable();
        this.harshDrivingEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePhoneUsageEvents(int i) {
        ensurePhoneUsageEventsIsMutable();
        this.phoneUsageEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTransportTags(int i) {
        ensureTransportTagsIsMutable();
        this.transportTags_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVehicleCrashEvents(int i) {
        ensureVehicleCrashEventsIsMutable();
        this.vehicleCrashEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoints(int i) {
        ensureWaypointsIsMutable();
        this.waypoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrongWayDrivingEvents(int i) {
        ensureWrongWayDrivingEventsIsMutable();
        this.wrongWayDrivingEvents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallEvents(CallEvents callEvents) {
        callEvents.getClass();
        this.callEvents_ = callEvents;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallWhileMovingEvents(int i, CallWhileMovingEvent callWhileMovingEvent) {
        callWhileMovingEvent.getClass();
        ensureCallWhileMovingEventsIsMutable();
        this.callWhileMovingEvents_.set(i, callWhileMovingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHarshDrivingEvents(int i, HarshDrivingEvent harshDrivingEvent) {
        harshDrivingEvent.getClass();
        ensureHarshDrivingEventsIsMutable();
        this.harshDrivingEvents_.set(i, harshDrivingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneUsageEvents(int i, PhoneUsageEvent phoneUsageEvent) {
        phoneUsageEvent.getClass();
        ensurePhoneUsageEventsIsMutable();
        this.phoneUsageEvents_.set(i, phoneUsageEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSafetyScores(SafetyScores safetyScores) {
        safetyScores.getClass();
        this.safetyScores_ = safetyScores;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedingEvents(SpeedingEvents speedingEvents) {
        speedingEvents.getClass();
        this.speedingEvents_ = speedingEvents;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(DateTime dateTime) {
        dateTime.getClass();
        this.start_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStop(DateTime dateTime) {
        dateTime.getClass();
        this.stop_ = dateTime;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportTags(int i, TransportTag transportTag) {
        transportTag.getClass();
        ensureTransportTagsIsMutable();
        this.transportTags_.set(i, transportTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleCrashEvents(int i, VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureVehicleCrashEventsIsMutable();
        this.vehicleCrashEvents_.set(i, vehicleCrashEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoints(int i, Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.set(i, waypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrongWayDrivingEvents(int i, WrongWayDrivingEvent wrongWayDrivingEvent) {
        wrongWayDrivingEvent.getClass();
        ensureWrongWayDrivingEventsIsMutable();
        this.wrongWayDrivingEvents_.set(i, wrongWayDrivingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallWhileMovingEvents() {
        this.callWhileMovingEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHarshDrivingEvents() {
        this.harshDrivingEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneUsageEvents() {
        this.phoneUsageEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportOccupantRole() {
        this.bitField0_ &= -17;
        this.transportOccupantRole_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportTags() {
        this.transportTags_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelledDistanceMeters() {
        this.bitField0_ &= -33;
        this.travelledDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleCrashEvents() {
        this.vehicleCrashEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoints() {
        this.waypoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrongWayDrivingEvents() {
        this.wrongWayDrivingEvents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(TransportMode transportMode) {
        this.mode_ = transportMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportOccupantRole(TransportOccupantRole transportOccupantRole) {
        this.transportOccupantRole_ = transportOccupantRole.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportOccupantRoleValue(int i) {
        this.bitField0_ |= 16;
        this.transportOccupantRole_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelledDistanceMeters(int i) {
        this.bitField0_ |= 32;
        this.travelledDistanceMeters_ = i;
    }

    public CallEvents getCallEvents() {
        CallEvents callEvents = this.callEvents_;
        return callEvents == null ? CallEvents.getDefaultInstance() : callEvents;
    }

    public SafetyScores getSafetyScores() {
        SafetyScores safetyScores = this.safetyScores_;
        return safetyScores == null ? SafetyScores.getDefaultInstance() : safetyScores;
    }

    public SpeedingEvents getSpeedingEvents() {
        SpeedingEvents speedingEvents = this.speedingEvents_;
        return speedingEvents == null ? SpeedingEvents.getDefaultInstance() : speedingEvents;
    }

    public DateTime getStart() {
        DateTime dateTime = this.start_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public DateTime getStop() {
        DateTime dateTime = this.stop_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    private TransportInfo() {
    }

    public static enableSdklambda1 newBuilder(TransportInfo transportInfo) {
        return (enableSdklambda1) DEFAULT_INSTANCE.createBuilder(transportInfo);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static TransportInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TransportInfo parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCallWhileMovingEvents(int i, CallWhileMovingEvent callWhileMovingEvent) {
        callWhileMovingEvent.getClass();
        ensureCallWhileMovingEventsIsMutable();
        this.callWhileMovingEvents_.add(i, callWhileMovingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHarshDrivingEvents(int i, HarshDrivingEvent harshDrivingEvent) {
        harshDrivingEvent.getClass();
        ensureHarshDrivingEventsIsMutable();
        this.harshDrivingEvents_.add(i, harshDrivingEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPhoneUsageEvents(int i, PhoneUsageEvent phoneUsageEvent) {
        phoneUsageEvent.getClass();
        ensurePhoneUsageEventsIsMutable();
        this.phoneUsageEvents_.add(i, phoneUsageEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransportTags(int i, TransportTag transportTag) {
        transportTag.getClass();
        ensureTransportTagsIsMutable();
        this.transportTags_.add(i, transportTag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleCrashEvents(int i, VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureVehicleCrashEventsIsMutable();
        this.vehicleCrashEvents_.add(i, vehicleCrashEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(int i, Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.add(i, waypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrongWayDrivingEvents(int i, WrongWayDrivingEvent wrongWayDrivingEvent) {
        wrongWayDrivingEvent.getClass();
        ensureWrongWayDrivingEventsIsMutable();
        this.wrongWayDrivingEvents_.add(i, wrongWayDrivingEvent);
    }

    public static TransportInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransportInfo parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static TransportInfo parseFrom(InputStream inputStream) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static TransportInfo parseFrom(u uVar) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static TransportInfo parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (TransportInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
