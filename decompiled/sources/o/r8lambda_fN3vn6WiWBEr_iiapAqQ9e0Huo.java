package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda_fN3vn6WiWBEr_iiapAqQ9e0Huo extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaI90we4_tg_9aaM1nBxPMKmLPck RemoteActionCompatParcelizer;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        boolean z = obj instanceof Long;
        r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck = this.RemoteActionCompatParcelizer;
        if (z) {
            r8lambdaI90we4_tg_9aaM1nBxPMKmLPck.write(r8lambdai90we4_tg_9aam1nbxpmkmlpck, ((Long) obj).longValue());
        } else {
            r8lambdai90we4_tg_9aam1nbxpmkmlpck.MediaDescriptionCompat();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda_fN3vn6WiWBEr_iiapAqQ9e0Huo(r8lambdaI90we4_tg_9aaM1nBxPMKmLPck r8lambdai90we4_tg_9aam1nbxpmkmlpck, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "PowerInfoProvider");
        this.RemoteActionCompatParcelizer = r8lambdai90we4_tg_9aam1nbxpmkmlpck;
    }
}
