package o;

import android.content.Context;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SessionDataSerializer;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetCurrentlyAccessibilityFocusedANIp implements accessgetFocusedVirtualViewIdp {
    public final accessgetCurrentlyFocusedANIp RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public accesssetCurrentlyAccessibilityFocusedANIp(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1, accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip, accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip2) {
        this.read = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
        this.write = accessgetcurrentlyfocusedanip;
        this.RemoteActionCompatParcelizer = accessgetcurrentlyfocusedanip2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = this.serializer;
        accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.write;
        if (i == 0) {
            return new SettingsCacheImpl((TextAnnouncementContentCardView) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write(), (AndroidComposeViewAccessibilityDelegateCompat) r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write(), (performCustomExitMxy_nc0) accessgetcurrentlyfocusedanip.write());
        }
        Context context = (Context) ((AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).serializer;
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
        SessionDataSerializer sessionDataSerializer = (SessionDataSerializer) accessgetcurrentlyfocusedanip.write();
        context.getClass();
        textAnnouncementContentCardView.getClass();
        sessionDataSerializer.getClass();
        performCustomExitMxy_nc0 performcustomexitmxy_nc0 = AndroidComposeViewRootModifierNoderulerLambda1.read(sessionDataSerializer, new accessgetAlwayscp(new RoomDatabase$$ExternalSyntheticLambda2(15, sessionDataSerializer)), YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), new getSavedStateRegistryOwner(context, 1));
        if (performcustomexitmxy_nc0 != null) {
            return performcustomexitmxy_nc0;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public accesssetCurrentlyAccessibilityFocusedANIp(AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1, AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect2, accessgetCurrentlyFocusedANIp accessgetcurrentlyfocusedanip) {
        this.write = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect1;
        this.read = androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithPrevRect2;
        this.RemoteActionCompatParcelizer = accessgetcurrentlyfocusedanip;
    }
}
