package o;

import com.sentiance.sdk.OnSdkStatusUpdateHandler;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.SdkStatusUpdateListener;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.UserLinker;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.UserLinkerCallback;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class createNotificationlambda0 implements OnSdkStatusUpdateHandler, UserLinkerAsync {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ createNotificationlambda0(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // com.sentiance.sdk.UserLinkerAsync
    public void link(String str, UserLinkerCallback userLinkerCallback) {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            Sentiance.lambda$linkUser$4((UserLinker) obj, str, userLinkerCallback);
        } else {
            r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg.IconCompatParcelizer((r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg) obj, str, userLinkerCallback);
        }
    }

    @Override // com.sentiance.sdk.OnSdkStatusUpdateHandler
    public void onSdkStatusUpdate(SdkStatus sdkStatus) {
        ((SdkStatusUpdateListener) this.serializer).onSdkStatusUpdate(sdkStatus);
    }
}
