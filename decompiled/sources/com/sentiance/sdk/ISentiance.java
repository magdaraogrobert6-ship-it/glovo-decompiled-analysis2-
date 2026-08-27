package com.sentiance.sdk;

import android.app.Notification;
import com.sentiance.sdk.authentication.UserLinkingError;
import com.sentiance.sdk.authentication.UserLinkingResult;
import com.sentiance.sdk.detectionupdates.UserActivity;
import com.sentiance.sdk.detectionupdates.UserActivityListener;
import com.sentiance.sdk.init.AsyncInitializationError;
import com.sentiance.sdk.init.AsyncInitializationResult;
import com.sentiance.sdk.init.InitializationResult;
import com.sentiance.sdk.init.SentianceOptions;
import com.sentiance.sdk.pendingoperation.PendingOperation;
import com.sentiance.sdk.reset.ResetError;
import com.sentiance.sdk.reset.ResetResult;
import com.sentiance.sdk.trip.StartTripCallback;
import com.sentiance.sdk.trip.StartTripError;
import com.sentiance.sdk.trip.StartTripResult;
import com.sentiance.sdk.trip.StopTripCallback;
import com.sentiance.sdk.trip.StopTripError;
import com.sentiance.sdk.trip.StopTripResult;
import com.sentiance.sdk.trip.TransportMode;
import com.sentiance.sdk.trip.TripTimeoutListener;
import com.sentiance.sdk.trip.TripType;
import com.sentiance.sdk.usercreation.UserCreationError;
import com.sentiance.sdk.usercreation.UserCreationOptions;
import com.sentiance.sdk.usercreation.UserCreationResult;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public interface ISentiance {
    boolean addTripMetadata(Map<String, String> map);

    void addUserMetadataField(String str, String str2);

    void addUserMetadataFields(Map<String, String> map);

    PendingOperation<UserCreationResult, UserCreationError> createUser(UserCreationOptions userCreationOptions);

    void disableBatteryOptimization();

    PendingOperation<DisableDetectionsResult, DisableDetectionsError> disableDetections();

    PendingOperation<EnableDetectionsResult, EnableDetectionsError> enableDetections();

    PendingOperation<EnableDetectionsResult, EnableDetectionsError> enableDetections(Date date);

    DetectionStatus getDetectionStatus();

    long getDiskQuotaLimit();

    long getDiskQuotaUsage();

    InitState getInitState();

    long getMobileQuotaLimit();

    long getMobileQuotaUsage();

    SdkStatus getSdkStatus();

    Set<TransmittableDataType> getTransmittableDataTypes();

    @Deprecated
    void getUserAccessToken(TokenResultCallback tokenResultCallback);

    UserActivity getUserActivity();

    String getUserId();

    String getVersion();

    long getWiFiQuotaLimit();

    long getWiFiQuotaUsage();

    @Deprecated
    void init(SdkConfig sdkConfig, OnInitCallback onInitCallback);

    InitializationResult initialize();

    InitializationResult initialize(SentianceOptions sentianceOptions);

    PendingOperation<AsyncInitializationResult, AsyncInitializationError> initializeAsync(SentianceOptions sentianceOptions);

    boolean isAllowedToUseMobileData();

    boolean isAppSessionDataCollectionEnabled();

    boolean isTripOngoing(TripType tripType);

    boolean isUserLinked();

    PendingOperation<UserLinkingResult, UserLinkingError> linkUser(UserLinker userLinker);

    PendingOperation<UserLinkingResult, UserLinkingError> linkUser(UserLinkerAsync userLinkerAsync);

    PendingOperation<UserLinkingResult, UserLinkingError> linkUser(String str);

    void removeUserMetadataField(String str);

    PendingOperation<Token, UserAccessTokenError> requestUserAccessToken();

    PendingOperation<ResetResult, ResetError> reset();

    @Deprecated
    void reset(ResetCallback resetCallback);

    void setAppSessionDataCollectionEnabled(boolean z);

    void setIsAllowedToUseMobileData(boolean z);

    void setSdkStatusUpdateListener(SdkStatusUpdateListener sdkStatusUpdateListener);

    void setTransmittableDataTypes(Set<TransmittableDataType> set);

    void setTripTimeoutListener(TripTimeoutListener tripTimeoutListener);

    void setUserActivityListener(UserActivityListener userActivityListener);

    @Deprecated
    void start(OnStartFinishedHandler onStartFinishedHandler);

    @Deprecated
    void start(Date date, OnStartFinishedHandler onStartFinishedHandler);

    PendingOperation<StartTripResult, StartTripError> startTrip(Map<String, String> map, TransportMode transportMode);

    @Deprecated
    void startTrip(Map<String, String> map, TransportMode transportMode, StartTripCallback startTripCallback);

    @Deprecated
    void stop();

    PendingOperation<StopTripResult, StopTripError> stopTrip();

    @Deprecated
    void stopTrip(StopTripCallback stopTripCallback);

    PendingOperation<SubmitDetectionsResult, SubmitDetectionsError> submitDetections();

    @Deprecated
    void submitDetections(SubmitDetectionsCallback submitDetectionsCallback);

    void updateSdkNotification(Notification notification);

    boolean userExists();
}
