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
import o._get_isDisabled_lambda0;
import o.getAlignmentLinesMap;
import o.getSdkEnablementProviderandroid_sdk_base_releaseannotations;
import o.getShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_releaseannotations;
import o.isDisabledannotations;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitialization;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class VehicleCrashEvent extends GeneratedMessageLite implements _get_isDisabled_lambda0 {
    public static final int CONFIDENCE_PERCENTAGE_FIELD_NUMBER = 5;
    private static final VehicleCrashEvent DEFAULT_INSTANCE;
    public static final int DELTA_V_MPS_FIELD_NUMBER = 7;
    public static final int MAX_MAGNITUDE_G_FIELD_NUMBER = 10;
    public static final int MAX_MAGNITUDE_MPS2_FIELD_NUMBER = 4;
    public static final int ML_MODELS_FIELD_NUMBER = 3;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SEVERITY_FIELD_NUMBER = 8;
    public static final int SPEED_AT_IMPACT_MPS_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int WAYPOINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int confidencePercentage_;
    private float deltaVMps_;
    private float maxMagnitudeG_;
    private float maxMagnitudeMps2_;
    private onSuccess mlModels_ = GeneratedMessageLite.emptyProtobufList();
    private int severity_;
    private float speedAtImpactMps_;
    private DateTime timestamp_;
    private Waypoint waypoint_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidencePercentage() {
        this.confidencePercentage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeltaVMps() {
        this.deltaVMps_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxMagnitudeMps2() {
        this.maxMagnitudeMps2_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedAtImpactMps() {
        this.speedAtImpactMps_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -3;
    }

    public static VehicleCrashEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidencePercentage(int i) {
        this.confidencePercentage_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeltaVMps(float f) {
        this.deltaVMps_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxMagnitudeMps2(float f) {
        this.maxMagnitudeMps2_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedAtImpactMps(float f) {
        this.speedAtImpactMps_ = f;
    }

    public int getConfidencePercentage() {
        return this.confidencePercentage_;
    }

    public float getDeltaVMps() {
        return this.deltaVMps_;
    }

    public float getMaxMagnitudeG() {
        return this.maxMagnitudeG_;
    }

    public float getMaxMagnitudeMps2() {
        return this.maxMagnitudeMps2_;
    }

    public List<MLModel> getMlModelsList() {
        return this.mlModels_;
    }

    public List<? extends shouldAllowSingletonInitialization> getMlModelsOrBuilderList() {
        return this.mlModels_;
    }

    public int getSeverityValue() {
        return this.severity_;
    }

    public float getSpeedAtImpactMps() {
        return this.speedAtImpactMps_;
    }

    public boolean hasMaxMagnitudeG() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSeverity() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        VehicleCrashEvent vehicleCrashEvent = new VehicleCrashEvent();
        DEFAULT_INSTANCE = vehicleCrashEvent;
        GeneratedMessageLite.registerDefaultInstance(VehicleCrashEvent.class, vehicleCrashEvent);
    }

    public static getSdkEnablementProviderandroid_sdk_base_releaseannotations newBuilder() {
        return (getSdkEnablementProviderandroid_sdk_base_releaseannotations) DEFAULT_INSTANCE.createBuilder();
    }

    public static VehicleCrashEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getShouldRequestFrameworkListenToNetworkUpdatesandroid_sdk_base_releaseannotations.write[methodToInvoke.ordinal()]) {
            case 1:
                return new VehicleCrashEvent();
            case 2:
                return new getSdkEnablementProviderandroid_sdk_base_releaseannotations(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u0001\u0005\u0004\u0006\u0001\u0007\u0001\bဌ\u0002\nခ\u0003", new Object[]{"bitField0_", "timestamp_", "waypoint_", "mlModels_", MLModel.class, "maxMagnitudeMps2_", "confidencePercentage_", "speedAtImpactMps_", "deltaVMps_", "severity_", "maxMagnitudeG_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (VehicleCrashEvent.class) {
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

    public MLModel getMlModels(int i) {
        return (MLModel) this.mlModels_.get(i);
    }

    public int getMlModelsCount() {
        return this.mlModels_.size();
    }

    public shouldAllowSingletonInitialization getMlModelsOrBuilder(int i) {
        return (shouldAllowSingletonInitialization) this.mlModels_.get(i);
    }

    public VehicleCrashEventSeverity getSeverity() {
        VehicleCrashEventSeverity vehicleCrashEventSeverityForNumber = VehicleCrashEventSeverity.forNumber(this.severity_);
        return vehicleCrashEventSeverityForNumber == null ? VehicleCrashEventSeverity.UNRECOGNIZED : vehicleCrashEventSeverityForNumber;
    }

    private VehicleCrashEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMlModels(Iterable<? extends MLModel> iterable) {
        ensureMlModelsIsMutable();
        a.addAll((Iterable) iterable, (List) this.mlModels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMlModels(MLModel mLModel) {
        mLModel.getClass();
        ensureMlModelsIsMutable();
        this.mlModels_.add(mLModel);
    }

    private void ensureMlModelsIsMutable() {
        onSuccess onsuccess = this.mlModels_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.mlModels_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.timestamp_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.timestamp_ = dateTime;
        } else {
            this.timestamp_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.timestamp_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(Waypoint waypoint) {
        waypoint.getClass();
        Waypoint waypoint2 = this.waypoint_;
        if (waypoint2 == null || waypoint2 == Waypoint.getDefaultInstance()) {
            this.waypoint_ = waypoint;
        } else {
            isDisabledannotations isdisabledannotationsNewBuilder = Waypoint.newBuilder(this.waypoint_);
            isdisabledannotationsNewBuilder.serializer(waypoint);
            this.waypoint_ = (Waypoint) isdisabledannotationsNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMlModels(int i) {
        ensureMlModelsIsMutable();
        this.mlModels_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMlModels(int i, MLModel mLModel) {
        mLModel.getClass();
        ensureMlModelsIsMutable();
        this.mlModels_.set(i, mLModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(DateTime dateTime) {
        dateTime.getClass();
        this.timestamp_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(Waypoint waypoint) {
        waypoint.getClass();
        this.waypoint_ = waypoint;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxMagnitudeG() {
        this.bitField0_ &= -9;
        this.maxMagnitudeG_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMlModels() {
        this.mlModels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeverity() {
        this.bitField0_ &= -5;
        this.severity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxMagnitudeG(float f) {
        this.bitField0_ |= 8;
        this.maxMagnitudeG_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeverity(VehicleCrashEventSeverity vehicleCrashEventSeverity) {
        this.severity_ = vehicleCrashEventSeverity.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeverityValue(int i) {
        this.bitField0_ |= 4;
        this.severity_ = i;
    }

    public DateTime getTimestamp() {
        DateTime dateTime = this.timestamp_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public Waypoint getWaypoint() {
        Waypoint waypoint = this.waypoint_;
        return waypoint == null ? Waypoint.getDefaultInstance() : waypoint;
    }

    public static getSdkEnablementProviderandroid_sdk_base_releaseannotations newBuilder(VehicleCrashEvent vehicleCrashEvent) {
        return (getSdkEnablementProviderandroid_sdk_base_releaseannotations) DEFAULT_INSTANCE.createBuilder(vehicleCrashEvent);
    }

    public static VehicleCrashEvent parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashEvent parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VehicleCrashEvent parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMlModels(int i, MLModel mLModel) {
        mLModel.getClass();
        ensureMlModelsIsMutable();
        this.mlModels_.add(i, mLModel);
    }

    public static VehicleCrashEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VehicleCrashEvent parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashEvent parseFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashEvent parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashEvent parseFrom(u uVar) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static VehicleCrashEvent parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
