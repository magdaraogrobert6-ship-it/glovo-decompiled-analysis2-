package o;

import com.roadrunner.localPushNotifications.smartPolling.presentation.SmartPollingDisplayPushNotificationWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewClientCompat extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SmartPollingDisplayPushNotificationWorker serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewClientCompat(SmartPollingDisplayPushNotificationWorker smartPollingDisplayPushNotificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = smartPollingDisplayPushNotificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objDoWork = this.serializer.doWork(this);
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objDoWork;
    }
}
