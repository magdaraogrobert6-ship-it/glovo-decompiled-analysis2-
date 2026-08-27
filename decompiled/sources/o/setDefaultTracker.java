package o;

import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import com.sentiance.sdk.DisableDetectionsResult;
import com.sentiance.sdk.EnableDetectionsResult;
import com.sentiance.sdk.Token;
import com.sentiance.sdk.init.AsyncInitializationResult;
import com.sentiance.sdk.pendingoperation.OnSuccessListener;
import com.sentiance.sdk.usercreation.UserCreationResult;
import kotlin.coroutines.SafeContinuation;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class setDefaultTracker implements OnSuccessListener {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ SentianceGuard RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SafeContinuation write;

    public setDefaultTracker(SafeContinuation safeContinuation, SentianceGuard sentianceGuard) {
        this.serializer = 0;
        this.write = safeContinuation;
        this.RemoteActionCompatParcelizer = sentianceGuard;
    }

    public /* synthetic */ setDefaultTracker(SentianceGuard sentianceGuard, SafeContinuation safeContinuation, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = sentianceGuard;
        this.write = safeContinuation;
    }

    @Override // com.sentiance.sdk.pendingoperation.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.serializer;
        SafeContinuation safeContinuation = this.write;
        SentianceGuard sentianceGuard = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ((AsyncInitializationResult) obj).getClass();
            getFirstErrorCode getfirsterrorcode = sentianceGuard.RemoteActionCompatParcelizer;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance initialized successfully", new Object[0]);
            getfirsterrorcode.RemoteActionCompatParcelizer("initialize");
            safeContinuation.resumeWith(Boolean.TRUE);
            int i4 = read + 1;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
        if (i3 == 1) {
            ((UserCreationResult) obj).getClass();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance user is created successfully", new Object[0]);
            sentianceGuard.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("create_user");
            safeContinuation.resumeWith(Boolean.TRUE);
            return;
        }
        if (i3 == 2) {
            DisableDetectionsResult disableDetectionsResult = (DisableDetectionsResult) obj;
            disableDetectionsResult.getClass();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance detections are disabled successfully: " + disableDetectionsResult.getDetectionStatus(), new Object[0]);
            sentianceGuard.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("disable_detections");
            safeContinuation.resumeWith(Boolean.TRUE);
            return;
        }
        if (i3 != 3) {
            Token token = (Token) obj;
            token.getClass();
            sentianceGuard.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("get_access_token");
            safeContinuation.resumeWith(token.getTokenId());
            return;
        }
        EnableDetectionsResult enableDetectionsResult = (EnableDetectionsResult) obj;
        enableDetectionsResult.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Sentiance detections are enabled successfully: " + enableDetectionsResult.getDetectionStatus(), new Object[0]);
        sentianceGuard.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("enable_detections");
        safeContinuation.resumeWith(Boolean.TRUE);
    }
}
