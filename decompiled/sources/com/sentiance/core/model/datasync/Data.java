package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o._set_outboundNetworkRequestsOffline_lambda0;
import o.accessgetDiskLruCachep;
import o.configurelambda11;
import o.enableSdklambda1;
import o.getAlignmentLinesMap;
import o.getConfiguredApiKeylambda0;
import o.r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s;
import o.r8lambdatKSeL9Uh2pbXyeelyEQzXUUaTM;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class Data extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final Data DEFAULT_INSTANCE;
    public static final int GEOFENCE_EVENT_FIELD_NUMBER = 2;
    public static final int OCCUPANT_ROLE_FEEDBACK_FIELD_NUMBER = 3;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 1;
    public static final int VEHICLE_CRASH_DETECTION_FEEDBACK_FIELD_NUMBER = 4;
    private int dataTypeCase_ = 0;
    private Object dataType_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataType() {
        this.dataTypeCase_ = 0;
        this.dataType_ = null;
    }

    public static Data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasGeofenceEvent() {
        return this.dataTypeCase_ == 2;
    }

    public boolean hasOccupantRoleFeedback() {
        return this.dataTypeCase_ == 3;
    }

    public boolean hasTransportInfo() {
        return this.dataTypeCase_ == 1;
    }

    public boolean hasVehicleCrashDetectionFeedback() {
        return this.dataTypeCase_ == 4;
    }

    public enum DataTypeCase {
        TRANSPORT_INFO(1),
        GEOFENCE_EVENT(2),
        OCCUPANT_ROLE_FEEDBACK(3),
        VEHICLE_CRASH_DETECTION_FEEDBACK(4),
        DATATYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        DataTypeCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static DataTypeCase valueOf(int i) {
            return forNumber(i);
        }

        public static DataTypeCase forNumber(int i) {
            if (i == 0) {
                return DATATYPE_NOT_SET;
            }
            if (i == 1) {
                return TRANSPORT_INFO;
            }
            if (i == 2) {
                return GEOFENCE_EVENT;
            }
            if (i == 3) {
                return OCCUPANT_ROLE_FEEDBACK;
            }
            if (i != 4) {
                return null;
            }
            return VEHICLE_CRASH_DETECTION_FEEDBACK;
        }
    }

    static {
        Data data = new Data();
        DEFAULT_INSTANCE = data;
        GeneratedMessageLite.registerDefaultInstance(Data.class, data);
    }

    public static r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s newBuilder() {
        return (r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s) DEFAULT_INSTANCE.createBuilder();
    }

    public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (r8lambdatKSeL9Uh2pbXyeelyEQzXUUaTM.read[methodToInvoke.ordinal()]) {
            case 1:
                return new Data();
            case 2:
                return new r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"dataType_", "dataTypeCase_", TransportInfo.class, GeofenceEvent.class, OccupantRoleFeedback.class, VehicleCrashDetectionFeedback.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Data.class) {
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

    public DataTypeCase getDataTypeCase() {
        return DataTypeCase.forNumber(this.dataTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeofenceEvent(GeofenceEvent geofenceEvent) {
        geofenceEvent.getClass();
        if (this.dataTypeCase_ != 2 || this.dataType_ == GeofenceEvent.getDefaultInstance()) {
            this.dataType_ = geofenceEvent;
        } else {
            _set_outboundNetworkRequestsOffline_lambda0 _set_outboundnetworkrequestsoffline_lambda0NewBuilder = GeofenceEvent.newBuilder((GeofenceEvent) this.dataType_);
            _set_outboundnetworkrequestsoffline_lambda0NewBuilder.serializer(geofenceEvent);
            this.dataType_ = _set_outboundnetworkrequestsoffline_lambda0NewBuilder.IconCompatParcelizer();
        }
        this.dataTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOccupantRoleFeedback(OccupantRoleFeedback occupantRoleFeedback) {
        occupantRoleFeedback.getClass();
        if (this.dataTypeCase_ != 3 || this.dataType_ == OccupantRoleFeedback.getDefaultInstance()) {
            this.dataType_ = occupantRoleFeedback;
        } else {
            configurelambda11 configurelambda11VarNewBuilder = OccupantRoleFeedback.newBuilder((OccupantRoleFeedback) this.dataType_);
            configurelambda11VarNewBuilder.serializer(occupantRoleFeedback);
            this.dataType_ = configurelambda11VarNewBuilder.IconCompatParcelizer();
        }
        this.dataTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        if (this.dataTypeCase_ != 1 || this.dataType_ == TransportInfo.getDefaultInstance()) {
            this.dataType_ = transportInfo;
        } else {
            enableSdklambda1 enablesdklambda1NewBuilder = TransportInfo.newBuilder((TransportInfo) this.dataType_);
            enablesdklambda1NewBuilder.serializer(transportInfo);
            this.dataType_ = enablesdklambda1NewBuilder.IconCompatParcelizer();
        }
        this.dataTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleCrashDetectionFeedback(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        vehicleCrashDetectionFeedback.getClass();
        if (this.dataTypeCase_ != 4 || this.dataType_ == VehicleCrashDetectionFeedback.getDefaultInstance()) {
            this.dataType_ = vehicleCrashDetectionFeedback;
        } else {
            getConfiguredApiKeylambda0 getconfiguredapikeylambda0NewBuilder = VehicleCrashDetectionFeedback.newBuilder((VehicleCrashDetectionFeedback) this.dataType_);
            getconfiguredapikeylambda0NewBuilder.serializer(vehicleCrashDetectionFeedback);
            this.dataType_ = getconfiguredapikeylambda0NewBuilder.IconCompatParcelizer();
        }
        this.dataTypeCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeofenceEvent(GeofenceEvent geofenceEvent) {
        geofenceEvent.getClass();
        this.dataType_ = geofenceEvent;
        this.dataTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccupantRoleFeedback(OccupantRoleFeedback occupantRoleFeedback) {
        occupantRoleFeedback.getClass();
        this.dataType_ = occupantRoleFeedback;
        this.dataTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.dataType_ = transportInfo;
        this.dataTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleCrashDetectionFeedback(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        vehicleCrashDetectionFeedback.getClass();
        this.dataType_ = vehicleCrashDetectionFeedback;
        this.dataTypeCase_ = 4;
    }

    private Data() {
    }

    public GeofenceEvent getGeofenceEvent() {
        return this.dataTypeCase_ == 2 ? (GeofenceEvent) this.dataType_ : GeofenceEvent.getDefaultInstance();
    }

    public OccupantRoleFeedback getOccupantRoleFeedback() {
        return this.dataTypeCase_ == 3 ? (OccupantRoleFeedback) this.dataType_ : OccupantRoleFeedback.getDefaultInstance();
    }

    public TransportInfo getTransportInfo() {
        return this.dataTypeCase_ == 1 ? (TransportInfo) this.dataType_ : TransportInfo.getDefaultInstance();
    }

    public VehicleCrashDetectionFeedback getVehicleCrashDetectionFeedback() {
        return this.dataTypeCase_ == 4 ? (VehicleCrashDetectionFeedback) this.dataType_ : VehicleCrashDetectionFeedback.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeofenceEvent() {
        if (this.dataTypeCase_ == 2) {
            this.dataTypeCase_ = 0;
            this.dataType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOccupantRoleFeedback() {
        if (this.dataTypeCase_ == 3) {
            this.dataTypeCase_ = 0;
            this.dataType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        if (this.dataTypeCase_ == 1) {
            this.dataTypeCase_ = 0;
            this.dataType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleCrashDetectionFeedback() {
        if (this.dataTypeCase_ == 4) {
            this.dataTypeCase_ = 0;
            this.dataType_ = null;
        }
    }

    public static r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s newBuilder(Data data) {
        return (r8lambdaid3boRGkeo1H7cq0n0bABsqzn_s) DEFAULT_INSTANCE.createBuilder(data);
    }

    public static Data parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Data parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Data parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Data parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Data parseFrom(InputStream inputStream) throws IOException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Data parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Data parseFrom(u uVar) throws IOException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Data parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
