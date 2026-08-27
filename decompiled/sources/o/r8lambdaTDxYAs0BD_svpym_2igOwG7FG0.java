package o;

import com.sentiance.sdk.OnInitCallback;
import com.sentiance.sdk.ResetCallback;
import com.sentiance.sdk.SdkConfig;
import com.sentiance.sdk.Sentiance;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaTDxYAs0BD_svpym_2igOwG7FG0 implements ResetCallback {
    final /* synthetic */ SdkConfig IconCompatParcelizer;
    final /* synthetic */ OnInitCallback RemoteActionCompatParcelizer;
    final /* synthetic */ Sentiance serializer;

    @Override // com.sentiance.sdk.ResetCallback
    public final void onResetFailure(ResetCallback.ResetFailureReason resetFailureReason) {
        readBoolean.write(new performWorklambda2(this));
    }

    @Override // com.sentiance.sdk.ResetCallback
    public final void onResetSuccess() {
        this.serializer.init(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    public r8lambdaTDxYAs0BD_svpym_2igOwG7FG0(Sentiance sentiance, SdkConfig sdkConfig, OnInitCallback onInitCallback) {
        this.serializer = sentiance;
        this.IconCompatParcelizer = sdkConfig;
        this.RemoteActionCompatParcelizer = onInitCallback;
    }
}
