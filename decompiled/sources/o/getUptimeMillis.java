package o;

import android.app.Application;
import android.text.TextUtils;
import com.foodora.courier.push.tokenregistery.data.HMSPushTokenProvider;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.push.HmsMessaging;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.ArrayList;
import java.util.HashMap;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getUptimeMillis implements CompletableOnSubscribe, SingleOnSubscribe {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ HMSPushTokenProvider read;

    @Override // io.reactivex.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) throws Exception {
        int i = 2 % 2;
        HMSPushTokenProvider hMSPushTokenProvider = this.read;
        handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = hMSPushTokenProvider.write;
        Application application = hMSPushTokenProvider.RemoteActionCompatParcelizer;
        singleEmitter.getClass();
        try {
            try {
                String token = HmsInstanceId.getInstance(application).getToken(new accessgetMinimumFlingVelocityjd(application, null, new HashMap(), new ArrayList()).serializer("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
                boolean zIsEmpty = TextUtils.isEmpty(token);
                decode decodeVar = handlethirdpartysharingcallbacki.IconCompatParcelizer;
                if (!(!zIsEmpty)) {
                    decodeVar.logEvent("push_huawei_token_provider_empty", null);
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("token is empty", new Object[0]);
                } else {
                    int i2 = IconCompatParcelizer + 31;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    decodeVar.logEvent("push_huawei_token_provider_success", null);
                    Timber.RemoteActionCompatParcelizer.getClass();
                }
                singleEmitter.IconCompatParcelizer(token);
            } catch (Exception e) {
                throw e;
            }
        } catch (com.huawei.hms.common.ApiException e2) {
            handlethirdpartysharingcallbacki.IconCompatParcelizer.logEvent("push_huawei_token_provider_fail", null);
            EnumColumnAdapter enumColumnAdapter = hMSPushTokenProvider.IconCompatParcelizer.IconCompatParcelizer;
            executeAsList executeaslist = executeAsList.INFRA;
            String message = e2.getMessage();
            if (message == null) {
                int i4 = serializer + 43;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                message = "";
            }
            EnumColumnAdapter.serializer(enumColumnAdapter, "push_huawei_token_provider_failed", executeaslist, message);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to get token with exception: ", e2.getMessage()), new Object[0]);
            singleEmitter.read(e2);
        }
    }

    @Override // io.reactivex.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        int i = 2 % 2;
        Application application = this.read.RemoteActionCompatParcelizer;
        completableEmitter.getClass();
        try {
            HmsInstanceId.getInstance(application).deleteToken(new accessgetMinimumFlingVelocityjd(application, null, new HashMap(), new ArrayList()).serializer("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
            int i2 = IconCompatParcelizer + 75;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (com.huawei.hms.common.ApiException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("HMS Push Token delete failed: ", e.getMessage()), new Object[0]);
        }
        completableEmitter.IconCompatParcelizer();
    }
}
