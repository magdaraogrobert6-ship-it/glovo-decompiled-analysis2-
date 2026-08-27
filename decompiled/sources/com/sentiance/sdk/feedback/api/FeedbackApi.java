package com.sentiance.sdk.feedback.api;

import android.annotation.SuppressLint;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;
import com.sentiance.sdk.util.N;
import o.getFlushMinMinutes;
import o.getImageDownloadSuccessfulannotations;
import o.getLargeIcon;
import o.getNotificationVisibility;
import o.getPushStoryPages;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@DontObfuscate
public class FeedbackApi extends N implements IFeedbackApi {

    @SuppressLint
    private static FeedbackApi sInstance;

    private FeedbackApi() {
    }

    public static FeedbackApi getInstance() {
        FeedbackApi feedbackApi;
        synchronized (FeedbackApi.class) {
            if (sInstance == null) {
                sInstance = new FeedbackApi();
            }
            feedbackApi = sInstance;
        }
        return feedbackApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OccupantRoleFeedbackResult lambda$submitOccupantRoleFeedback$0(String str, OccupantRoleFeedback occupantRoleFeedback) {
        OccupantRoleFeedbackInternal occupantRoleFeedbackInternal;
        getPushStoryPages getpushstorypages = (getPushStoryPages) setPushUniqueId.read(getPushStoryPages.class);
        OccupantRoleFeedbackInternal.Companion.getClass();
        occupantRoleFeedback.getClass();
        int i = getImageDownloadSuccessfulannotations.serializer[occupantRoleFeedback.ordinal()];
        if (i == 1) {
            occupantRoleFeedbackInternal = OccupantRoleFeedbackInternal.DRIVER;
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            occupantRoleFeedbackInternal = OccupantRoleFeedbackInternal.PASSENGER;
        }
        return getpushstorypages.read(str, occupantRoleFeedbackInternal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ VehicleCrashDetectionFeedbackResult lambda$submitVehicleCrashDetectionFeedback$1(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        return ((getNotificationVisibility) setPushUniqueId.read(getNotificationVisibility.class)).serializer(vehicleCrashDetectionFeedback);
    }

    @Override // com.sentiance.sdk.feedback.api.IFeedbackApi
    public OccupantRoleFeedbackResult submitOccupantRoleFeedback(String str, OccupantRoleFeedback occupantRoleFeedback) throws SdkException {
        return (OccupantRoleFeedbackResult) ifSdkIsInitializedWithUser(OccupantRoleFeedbackResult.TRANSPORT_NOT_FOUND, new getLargeIcon(str, 0, occupantRoleFeedback));
    }

    @Override // com.sentiance.sdk.feedback.api.IFeedbackApi
    public VehicleCrashDetectionFeedbackResult submitVehicleCrashDetectionFeedback(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        return (VehicleCrashDetectionFeedbackResult) ifSdkIsInitializedWithUser(VehicleCrashDetectionFeedbackResult.NO_USER, new getFlushMinMinutes(0, vehicleCrashDetectionFeedback));
    }
}
