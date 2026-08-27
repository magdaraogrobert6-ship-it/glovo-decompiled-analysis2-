package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.SubmitDetectionsCallback;
import com.sentiance.sdk.SubmitDetectionsError;
import com.sentiance.sdk.SubmitDetectionsFailureReason;
import com.sentiance.sdk.SubmitDetectionsResult;
import com.sentiance.sdk.usercreation.UserCreationFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public final class getBitmapFromMemCache implements SubmitDetectionsCallback, registerGeofencesWithGooglePlayIfNecessarylambda6 {
    final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getBitmapFromMemCache(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.registerGeofencesWithGooglePlayIfNecessarylambda6
    public void RemoteActionCompatParcelizer(UserCreationFailureReason userCreationFailureReason, String str) {
        Sentiance sentiance = (Sentiance) this.RemoteActionCompatParcelizer;
        sentiance.mIsUserCreationInProgress = false;
        sentiance.setUserCreationOperationError(userCreationFailureReason, str);
    }

    @Override // com.sentiance.sdk.SubmitDetectionsCallback
    public void onFailure() {
        ((BrazeNotificationUtilsExternalSyntheticLambda14) this.RemoteActionCompatParcelizer).serializer(new SubmitDetectionsError(SubmitDetectionsFailureReason.NETWORK_ERROR));
    }

    @Override // com.sentiance.sdk.SubmitDetectionsCallback, o.registerGeofencesWithGooglePlayIfNecessarylambda6
    public final void onSuccess() {
        int i = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((BrazeNotificationUtilsExternalSyntheticLambda14) obj).write(new SubmitDetectionsResult());
            return;
        }
        Sentiance sentiance = (Sentiance) obj;
        sentiance.authenticatedInit(true);
        sentiance.mIsUserCreationInProgress = false;
        sentiance.setUserCreationOperationResult();
    }
}
