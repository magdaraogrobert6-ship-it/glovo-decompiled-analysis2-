package o;

import com.sentiance.sdk.events.controlmessageextras.LogUploadResult;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationPayloadCompanionExternalSyntheticLambda0 extends isExpired {
    final /* synthetic */ stringAndKey RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationPayloadCompanionExternalSyntheticLambda0(stringAndKey stringandkey, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar);
        this.RemoteActionCompatParcelizer = stringandkey;
    }

    @Override // o.isExpired
    public final void IconCompatParcelizer(LogUploadResult logUploadResult) {
        stringAndKey.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, logUploadResult);
    }
}
