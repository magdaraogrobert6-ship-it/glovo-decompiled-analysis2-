package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewhandleRotaryEvent1 implements accessgetFocusedVirtualViewIdp {
    public final AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;

    public AndroidComposeViewhandleRotaryEvent1(accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip, AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1) {
        this.serializer = 2;
        this.read = accessgetcurrentlyfocusedanip;
        this.RemoteActionCompatParcelizer = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.serializer;
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.read;
        if (i == 0) {
            return new AndroidComposeViewderivedIsAttached2((Context) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer, (accessboundsInScreen) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write());
        }
        if (i != 1) {
            return new accessgetSendingFocusAffectingEventp((addNotificationForSysPropsChangelambda0010) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), (TextAnnouncementContentCardView) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer);
        }
        Context context = (Context) androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1.serializer;
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        context.getClass();
        textAnnouncementContentCardView.getClass();
        performCustomExitMxy_nc0 performcustomexitmxy_nc0 = AndroidComposeViewRootModifierNoderulerLambda1.read(SessionConfigsSerializer.RemoteActionCompatParcelizer, new accessgetAlwayscp(new accessgetIntersectcp(27)), YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), new getSavedStateRegistryOwner(context, 0));
        if (performcustomexitmxy_nc0 != null) {
            return performcustomexitmxy_nc0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public /* synthetic */ AndroidComposeViewhandleRotaryEvent1(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1, accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
        this.read = accessgetcurrentlyfocusedanip;
    }
}
