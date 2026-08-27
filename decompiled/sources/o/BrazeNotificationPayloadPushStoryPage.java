package o;

import com.sentiance.sdk.events.EventUploadResult;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationPayloadPushStoryPage extends getPropertiesJsonannotations {
    final /* synthetic */ stringAndKey IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeNotificationPayloadPushStoryPage(stringAndKey stringandkey, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar);
        this.IconCompatParcelizer = stringandkey;
    }

    @Override // o.getPropertiesJsonannotations
    public final void serializer(EventUploadResult eventUploadResult) {
        stringAndKey.serializer(this.IconCompatParcelizer, eventUploadResult);
    }
}
