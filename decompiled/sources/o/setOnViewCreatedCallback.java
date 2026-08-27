package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.Gson;
import com.huawei.hms.location.ActivityConversionData;
import com.huawei.hms.location.ActivityConversionResponse;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.ActivityIdentificationResponse;
import com.huawei.hms.location.api.response.RequestActivityConversionResp;
import com.huawei.hms.location.api.response.RequestActivityIdentificationResp;
import com.huawei.hms.location.entity.activity.ActivityRecognitionResult;
import com.huawei.hms.location.entity.activity.ActivityTransitionEvent;
import com.huawei.hms.location.entity.activity.ActivityTransitionResult;
import com.huawei.hms.location.entity.activity.DetectedActivity;
import com.huawei.location.activity.BaseApiTaskCall;
import com.huawei.location.activity.RequestActivityConversionUpdatesTaskCall;
import com.huawei.location.activity.RequestActivityIdentificationUpdatesTaskCall;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.base.activity.callback.ATCallback;
import com.huawei.location.base.activity.permission.ARLocationPermissionManager;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setOnViewCreatedCallback implements ATCallback, ARCallback {
    public final /* synthetic */ BaseApiTaskCall read;

    public /* synthetic */ setOnViewCreatedCallback(BaseApiTaskCall baseApiTaskCall) {
        this.read = baseApiTaskCall;
    }

    @Override // com.huawei.location.base.activity.callback.ARCallback
    public void onActivityRecognition(ActivityRecognitionResult activityRecognitionResult) {
        String str;
        RequestActivityIdentificationUpdatesTaskCall requestActivityIdentificationUpdatesTaskCall = (RequestActivityIdentificationUpdatesTaskCall) this.read;
        requestActivityIdentificationUpdatesTaskCall.reportBuilder.RemoteActionCompatParcelizer("AR_activityStateCallback");
        if (requestActivityIdentificationUpdatesTaskCall.pendingIntent == null) {
            RequestActivityIdentificationResp requestActivityIdentificationResp = new RequestActivityIdentificationResp();
            requestActivityIdentificationResp.setActivityRecognitionResult(activityRecognitionResult);
            requestActivityIdentificationUpdatesTaskCall.doExecute(new RouterResponse(new Gson().toJson(requestActivityIdentificationResp), new StatusInfo(0, requestActivityIdentificationUpdatesTaskCall.errorCode, requestActivityIdentificationUpdatesTaskCall.errorReason)));
        } else {
            if (!ARLocationPermissionManager.checkCPActivityRecognitionPermissionByException(requestActivityIdentificationUpdatesTaskCall.getTAG(), "checkActivityRecognitionPermission", requestActivityIdentificationUpdatesTaskCall.clientInfo.getClientPid(), requestActivityIdentificationUpdatesTaskCall.clientInfo.getClientUid())) {
                requestActivityIdentificationUpdatesTaskCall.removeActivityIdentificationUpdates();
                return;
            }
            try {
                List<DetectedActivity> probableActivities = activityRecognitionResult.getProbableActivities();
                ArrayList arrayList = new ArrayList();
                for (DetectedActivity detectedActivity : probableActivities) {
                    arrayList.add(new ActivityIdentificationData(detectedActivity.getType() + 100, detectedActivity.getConfidence()));
                }
                ActivityIdentificationResponse activityIdentificationResponse = new ActivityIdentificationResponse(arrayList, activityRecognitionResult.getTime(), activityRecognitionResult.getElapsedRealtimeMillis());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestActivityIdentificationUpdatesAPI", "sending recognition result:" + activityRecognitionResult);
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                try {
                    bundle.putParcelable("KEY_RESPONSE", activityIdentificationResponse);
                } catch (Throwable th) {
                    ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.RemoteActionCompatParcelizer("SafeBundle", "putParcelable exception: " + th.getMessage());
                }
                intent.putExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_RESULT", bundle);
                requestActivityIdentificationUpdatesTaskCall.pendingIntent.send(placeAtf8xVGno.read(), 0, intent);
            } catch (PendingIntent.CanceledException unused) {
                str = "CanceledException";
                WrappedCompositionsetContent1211.serializer("RequestActivityIdentificationUpdatesAPI", str);
                requestActivityIdentificationUpdatesTaskCall.errorCode = 10000;
            } catch (com.huawei.hms.common.ApiException unused2) {
                str = "ApiException";
                WrappedCompositionsetContent1211.serializer("RequestActivityIdentificationUpdatesAPI", str);
                requestActivityIdentificationUpdatesTaskCall.errorCode = 10000;
            } catch (NullPointerException unused3) {
                str = "NullPointerException";
                WrappedCompositionsetContent1211.serializer("RequestActivityIdentificationUpdatesAPI", str);
                requestActivityIdentificationUpdatesTaskCall.errorCode = 10000;
            }
        }
        requestActivityIdentificationUpdatesTaskCall.reportBuilder.yn(requestActivityIdentificationUpdatesTaskCall.requestActivityIdentificationReq);
        requestActivityIdentificationUpdatesTaskCall.reportBuilder.serializer().write(String.valueOf(requestActivityIdentificationUpdatesTaskCall.errorCode));
    }

    @Override // com.huawei.location.base.activity.callback.ATCallback
    public void onActivityTransition(ActivityTransitionResult activityTransitionResult) {
        String str;
        RequestActivityConversionUpdatesTaskCall requestActivityConversionUpdatesTaskCall = (RequestActivityConversionUpdatesTaskCall) this.read;
        requestActivityConversionUpdatesTaskCall.reportBuilder.RemoteActionCompatParcelizer("AR_activityTransitionCallback");
        if (requestActivityConversionUpdatesTaskCall.pendingIntent == null) {
            RequestActivityConversionResp requestActivityConversionResp = new RequestActivityConversionResp();
            requestActivityConversionResp.setActivityTransitionResult(activityTransitionResult);
            requestActivityConversionUpdatesTaskCall.doExecute(new RouterResponse(new Gson().toJson(requestActivityConversionResp), new StatusInfo(0, requestActivityConversionUpdatesTaskCall.errorCode, requestActivityConversionUpdatesTaskCall.errorReason)));
        } else {
            if (!ARLocationPermissionManager.checkCPActivityRecognitionPermissionByException(requestActivityConversionUpdatesTaskCall.getTAG(), "checkActivityRecognitionPermission", requestActivityConversionUpdatesTaskCall.clientInfo.getClientPid(), requestActivityConversionUpdatesTaskCall.clientInfo.getClientUid())) {
                requestActivityConversionUpdatesTaskCall.removeActivityConversionUpdates();
                return;
            }
            try {
                List<ActivityTransitionEvent> transitionEvents = activityTransitionResult.getTransitionEvents();
                ArrayList arrayList = new ArrayList();
                for (ActivityTransitionEvent activityTransitionEvent : transitionEvents) {
                    arrayList.add(new ActivityConversionData(activityTransitionEvent.getActivityType() + 100, activityTransitionEvent.getTransitionType(), activityTransitionEvent.getElapsedRealTimeNanos()));
                }
                ActivityConversionResponse activityConversionResponse = new ActivityConversionResponse(arrayList);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestActivityConversionUpdatesAPI", "sending transition result:" + activityTransitionResult);
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                try {
                    bundle.putParcelable("KEY_RESPONSE", activityConversionResponse);
                } catch (Throwable th) {
                    ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.RemoteActionCompatParcelizer("SafeBundle", "putParcelable exception: " + th.getMessage());
                }
                intent.putExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT", bundle);
                requestActivityConversionUpdatesTaskCall.pendingIntent.send(placeAtf8xVGno.read(), 0, intent);
            } catch (PendingIntent.CanceledException unused) {
                str = "CanceledException";
                WrappedCompositionsetContent1211.serializer("RequestActivityConversionUpdatesAPI", str);
                requestActivityConversionUpdatesTaskCall.errorCode = 10000;
            } catch (NullPointerException unused2) {
                str = "NullPointerException";
                WrappedCompositionsetContent1211.serializer("RequestActivityConversionUpdatesAPI", str);
                requestActivityConversionUpdatesTaskCall.errorCode = 10000;
            }
        }
        requestActivityConversionUpdatesTaskCall.reportBuilder.yn(requestActivityConversionUpdatesTaskCall.requestActivityConversionReq);
        requestActivityConversionUpdatesTaskCall.reportBuilder.serializer().write(String.valueOf(requestActivityConversionUpdatesTaskCall.errorCode));
    }
}
