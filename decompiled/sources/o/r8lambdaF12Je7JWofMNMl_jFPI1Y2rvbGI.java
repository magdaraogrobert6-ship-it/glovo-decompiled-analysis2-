package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaF12Je7JWofMNMl_jFPI1Y2rvbGI extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaF12Je7JWofMNMl_jFPI1Y2rvbGI(r8lambdaJFE_chLd2jQnyQVpk_1hYHN04 r8lambdajfe_chld2jqnyqvpk_1hyhn04) {
        super(r8lambdajfe_chld2jqnyqvpk_1hyhn04.write, "DataSyncPayloadUploader");
        this.RemoteActionCompatParcelizer = r8lambdajfe_chld2jqnyqvpk_1hyhn04;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        controlMessage.getClass();
        boolean z = controlMessage == ControlMessage.DATA_SYNC_PAYLOAD_FORCE_SUBMISSION;
        String str = obj instanceof String ? (String) obj : null;
        int i = r8lambdaJFE_chLd2jQnyQVpk_1hYHN04.serializer;
        this.RemoteActionCompatParcelizer.write(str == null ? new r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4("DataSyncPayloadUploader", z, null, null, 8, null) : new r8lambda8NVsCOP5X9ZkTElkHsCW8l8Y0F4("DataSyncPayloadUploader", z, null, str));
    }
}
