package o;

import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.sentiance.sdk.DisableDetectionsError;
import com.sentiance.sdk.EnableDetectionsError;
import com.sentiance.sdk.UserAccessTokenError;
import com.sentiance.sdk.init.AsyncInitializationError;
import com.sentiance.sdk.init.InitializationFailureReason;
import com.sentiance.sdk.pendingoperation.OnFailureListener;
import com.sentiance.sdk.usercreation.UserCreationError;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: classes3.dex */
public final class setExternalDeviceId implements OnFailureListener {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ SafeContinuation read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SentianceGuard write;

    public setExternalDeviceId(SafeContinuation safeContinuation, SentianceGuard sentianceGuard) {
        this.serializer = 0;
        this.read = safeContinuation;
        this.write = sentianceGuard;
    }

    public /* synthetic */ setExternalDeviceId(SentianceGuard sentianceGuard, SafeContinuation safeContinuation, int i) {
        this.serializer = i;
        this.write = sentianceGuard;
        this.read = safeContinuation;
    }

    @Override // com.sentiance.sdk.pendingoperation.OnFailureListener
    public final void onFailure(Object obj) {
        String strName;
        int i = 2 % 2;
        int i2 = this.serializer;
        SafeContinuation safeContinuation = this.read;
        SentianceGuard sentianceGuard = this.write;
        Map mapSingletonMap = null;
        if (i2 == 0) {
            AsyncInitializationError asyncInitializationError = (AsyncInitializationError) obj;
            asyncInitializationError.getClass();
            InitializationFailureReason failureReason = asyncInitializationError.getFailureReason();
            Throwable throwable = asyncInitializationError.getThrowable();
            getFirstErrorCode getfirsterrorcode = sentianceGuard.RemoteActionCompatParcelizer;
            if (failureReason != null) {
                int i3 = RemoteActionCompatParcelizer + 13;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    strName = failureReason.name();
                    int i4 = 55 / 0;
                } else {
                    strName = failureReason.name();
                }
            } else {
                int i5 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                strName = null;
            }
            if (strName != null) {
                int i7 = IconCompatParcelizer + 25;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getfirsterrorcode.getClass();
                mapSingletonMap = Collections.singletonMap("reason", strName);
                mapSingletonMap.getClass();
            }
            getfirsterrorcode.write("rider_safety_init_sdk_error", mapSingletonMap);
            sentianceGuard.IconCompatParcelizer("Sentiance initialization failed: Reason: " + strName, throwable);
            safeContinuation.resumeWith(Boolean.FALSE);
            return;
        }
        if (i2 == 1) {
            UserCreationError userCreationError = (UserCreationError) obj;
            userCreationError.getClass();
            String strName2 = userCreationError.getReason().name();
            getFirstErrorCode getfirsterrorcode2 = sentianceGuard.RemoteActionCompatParcelizer;
            getfirsterrorcode2.getClass();
            strName2.getClass();
            Map mapSingletonMap2 = Collections.singletonMap("reason", strName2);
            mapSingletonMap2.getClass();
            getfirsterrorcode2.write("rider_safety_create_user_error", mapSingletonMap2);
            sentianceGuard.IconCompatParcelizer("Sentiance user creation failed: ".concat(strName2), null);
            safeContinuation.resumeWith(Boolean.FALSE);
            return;
        }
        if (i2 == 2) {
            ((DisableDetectionsError) obj).getClass();
            sentianceGuard.RemoteActionCompatParcelizer.serializer("disable_detections");
            sentianceGuard.IconCompatParcelizer("Sentiance disable detections failed", null);
            safeContinuation.resumeWith(Boolean.FALSE);
            int i9 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return;
        }
        if (i2 != 3) {
            ((UserAccessTokenError) obj).getClass();
            sentianceGuard.RemoteActionCompatParcelizer.serializer("get_access_token");
            sentianceGuard.IconCompatParcelizer("Sentiance request user access token failed", null);
            safeContinuation.resumeWith(null);
            return;
        }
        EnableDetectionsError enableDetectionsError = (EnableDetectionsError) obj;
        enableDetectionsError.getClass();
        String strName3 = enableDetectionsError.getReason().name();
        getFirstErrorCode getfirsterrorcode3 = sentianceGuard.RemoteActionCompatParcelizer;
        getfirsterrorcode3.getClass();
        strName3.getClass();
        Map mapSingletonMap3 = Collections.singletonMap("reason", strName3);
        mapSingletonMap3.getClass();
        getfirsterrorcode3.write("rider_safety_start_trip_error", mapSingletonMap3);
        sentianceGuard.RemoteActionCompatParcelizer.serializer("enable_detections");
        sentianceGuard.IconCompatParcelizer("Sentiance enable detections failed: Reason: ".concat(strName3), null);
        safeContinuation.resumeWith(Boolean.FALSE);
    }
}
