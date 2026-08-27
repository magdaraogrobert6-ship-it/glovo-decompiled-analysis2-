package o;

import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class withTransaction extends androidx.lifecycle.ViewModel {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow serializer;

    public withTransaction(setTransactionSuccessful settransactionsuccessful, RectManager rectManager) {
        String str;
        settransactionsuccessful.getClass();
        rectManager.getClass();
        metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = rectManager.serializer();
        if (metamarkupdatedandhascallbacksSerializer != null) {
            str = metamarkupdatedandhascallbacksSerializer.privacyPolicyUrl;
            int i = RemoteActionCompatParcelizer + 11;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } else {
            int i3 = read + 53;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            str = null;
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new Pool(new FlowUtilcreateFlowinlinedmap12(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_privacy_policy_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_privacy_policy), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.start_camera), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_description_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_description_sub_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_requirement_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_requirement_mask), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_requirement_helmet), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_requirement_sunglasses), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_video_privacy_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_header_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.liveness_detection_instruction_header_sub_title)), str));
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
    }
}
