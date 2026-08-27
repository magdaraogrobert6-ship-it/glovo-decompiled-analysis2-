package o;

import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;
import io.sentry.Scopes$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isExpired {
    private final clearandroid_sdk_base_release serializer;

    public abstract void IconCompatParcelizer(LogUploadResult logUploadResult);

    public isExpired(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        this.serializer = clearandroid_sdk_base_releaseVar;
    }

    public final void read(LogUploadResult logUploadResult) {
        this.serializer.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 3, logUploadResult));
    }
}
