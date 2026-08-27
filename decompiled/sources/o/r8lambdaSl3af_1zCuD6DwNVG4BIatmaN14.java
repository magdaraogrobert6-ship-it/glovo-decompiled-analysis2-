package o;

import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.authentication.UserLinkingError;
import com.sentiance.sdk.authentication.UserLinkingFailureReason;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSl3af_1zCuD6DwNVG4BIatmaN14 implements r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA {
    final /* synthetic */ BrazeNotificationUtilsExternalSyntheticLambda14 IconCompatParcelizer;
    final /* synthetic */ Sentiance RemoteActionCompatParcelizer;

    @Override // o.r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA
    public final void RemoteActionCompatParcelizer(UserLinkingFailureReason userLinkingFailureReason, String str) {
        this.IconCompatParcelizer.serializer(new UserLinkingError(userLinkingFailureReason, str));
    }

    public r8lambdaSl3af_1zCuD6DwNVG4BIatmaN14(Sentiance sentiance, BrazeNotificationUtilsExternalSyntheticLambda14 brazeNotificationUtilsExternalSyntheticLambda14) {
        this.RemoteActionCompatParcelizer = sentiance;
        this.IconCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda14;
    }

    @Override // o.r8lambdak5pX3NOWmwV8GeNkiJQvfTF4qIA
    public final void IconCompatParcelizer(r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqty) {
        this.RemoteActionCompatParcelizer.setUserLinkingOperationResult(this.IconCompatParcelizer, r8lambdazcbg_e0hjusjy78mvgh54swzqty);
    }
}
