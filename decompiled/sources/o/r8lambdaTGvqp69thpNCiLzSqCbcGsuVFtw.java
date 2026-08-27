package o;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw extends requestPushPermissionPromptlambda3 {
    public final /* synthetic */ hasPermissionlambda0 RemoteActionCompatParcelizer;
    public final Object write;
    public final /* synthetic */ int serializer = 0;
    public final AtomicBoolean read = new AtomicBoolean(false);

    public r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw(BrazeWebViewActivitycreateWebChromeClient1 brazeWebViewActivitycreateWebChromeClient1, JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = brazeWebViewActivitycreateWebChromeClient1;
        TextStreamsKt.serializer(jsonUtilsExternalSyntheticLambda1, "subchannel");
        this.write = jsonUtilsExternalSyntheticLambda1;
    }

    @Override // o.requestPushPermissionPromptlambda3
    public final wouldPushPermissionPromptDisplaylambda0 write(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        int i = this.serializer;
        hasPermissionlambda0 haspermissionlambda0 = this.RemoteActionCompatParcelizer;
        AtomicBoolean atomicBoolean = this.read;
        if (i == 0) {
            if (atomicBoolean.compareAndSet(false, true)) {
                ((BrazeWebViewActivitycreateWebChromeClient1) haspermissionlambda0).MediaBrowserCompatMediaItem.write().execute(new isAutomaticGeofenceRequestsEnabled(13, this));
            }
            return wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            getMethodQuietlylambda1 getmethodquietlylambda1Write = ((setBrazeDeeplinkHandler) haspermissionlambda0).ParcelableVolumeInfo.write();
            setBrazeDeeplinkHandler setbrazedeeplinkhandler = (setBrazeDeeplinkHandler) this.write;
            Objects.requireNonNull(setbrazedeeplinkhandler);
            getmethodquietlylambda1Write.execute(new e$$ExternalSyntheticLambda0(12, setbrazedeeplinkhandler));
        }
        return wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer;
    }

    public r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw(setBrazeDeeplinkHandler setbrazedeeplinkhandler, setBrazeDeeplinkHandler setbrazedeeplinkhandler2) {
        this.RemoteActionCompatParcelizer = setbrazedeeplinkhandler;
        this.write = setbrazedeeplinkhandler2;
    }
}
