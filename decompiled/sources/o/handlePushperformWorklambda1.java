package o;

import com.sentiance.sdk.InitState;
import com.sentiance.sdk.ResetCallback;
import com.sentiance.sdk.reset.ResetError;
import com.sentiance.sdk.reset.ResetFailureReason;
import com.sentiance.sdk.reset.ResetResult;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class handlePushperformWorklambda1 {
    private final ResetCallback RemoteActionCompatParcelizer;
    private final BrazeNotificationUtilsExternalSyntheticLambda14<ResetResult, ResetError> read;

    public final void RemoteActionCompatParcelizer(InitState initState) {
        initState.getClass();
        BrazeNotificationUtilsExternalSyntheticLambda14<ResetResult, ResetError> brazeNotificationUtilsExternalSyntheticLambda14 = this.read;
        if (brazeNotificationUtilsExternalSyntheticLambda14 != null) {
            brazeNotificationUtilsExternalSyntheticLambda14.write(new ResetResult(initState));
            return;
        }
        ResetCallback resetCallback = this.RemoteActionCompatParcelizer;
        if (resetCallback != null) {
            readBoolean.write(new e$$ExternalSyntheticLambda0(3, resetCallback));
        }
    }

    public handlePushperformWorklambda1(ResetCallback resetCallback) {
        this.read = null;
        this.RemoteActionCompatParcelizer = resetCallback;
    }

    public handlePushperformWorklambda1(BrazeNotificationUtilsExternalSyntheticLambda14<ResetResult, ResetError> brazeNotificationUtilsExternalSyntheticLambda14) {
        this.RemoteActionCompatParcelizer = null;
        this.read = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    public final void RemoteActionCompatParcelizer(ResetFailureReason resetFailureReason, Throwable th) {
        resetFailureReason.getClass();
        BrazeNotificationUtilsExternalSyntheticLambda14<ResetResult, ResetError> brazeNotificationUtilsExternalSyntheticLambda14 = this.read;
        if (brazeNotificationUtilsExternalSyntheticLambda14 != null) {
            brazeNotificationUtilsExternalSyntheticLambda14.serializer(new ResetError(resetFailureReason, th));
            return;
        }
        ResetCallback resetCallback = this.RemoteActionCompatParcelizer;
        if (resetCallback != null) {
            readBoolean.write(new Scopes$$ExternalSyntheticLambda0(resetCallback, this, resetFailureReason));
        }
    }
}
