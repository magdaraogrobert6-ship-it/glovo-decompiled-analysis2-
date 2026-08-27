package o;

import com.sentiance.sdk.events.EventUploadResult;
import io.sentry.Scopes$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getPropertiesJsonannotations {
    private final clearandroid_sdk_base_release serializer;

    public abstract void serializer(EventUploadResult eventUploadResult);

    public getPropertiesJsonannotations(clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        this.serializer = clearandroid_sdk_base_releaseVar;
    }

    public final void IconCompatParcelizer(EventUploadResult eventUploadResult) {
        this.serializer.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 4, eventUploadResult));
    }
}
