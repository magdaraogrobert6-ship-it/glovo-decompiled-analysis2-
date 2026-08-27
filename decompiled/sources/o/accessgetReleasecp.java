package o;

import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.push.event.PushDeepLink;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetReleasecp {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final getPress4ZHQPSE IconCompatParcelizer;
    public final getMove4ZHQPSE RemoteActionCompatParcelizer;
    public final SharedResourcePool read;
    public final DialogMessageRequestProxy write;

    public accessgetReleasecp(DialogMessageRequestProxy dialogMessageRequestProxy, getPress4ZHQPSE getpress4zhqpse, getMove4ZHQPSE getmove4zhqpse, SharedResourcePool sharedResourcePool) {
        this.write = dialogMessageRequestProxy;
        this.IconCompatParcelizer = getpress4zhqpse;
        this.RemoteActionCompatParcelizer = getmove4zhqpse;
        this.read = sharedResourcePool;
    }

    public final void handleMessage(String str, String str2, String str3, boolean z, PushDeepLink pushDeepLink, String str4, String str5, PushAnalyticsData pushAnalyticsData, String str6) {
        String strMediaBrowserCompatMediaItem;
        int i = 2 % 2;
        boolean zRemoteActionCompatParcelizer = disableThirdPartySharingForCoppaEnabledI.RemoteActionCompatParcelizer(str3);
        boolean z2 = disableThirdPartySharingForCoppaEnabledI.read(str3);
        boolean zSerializer = disableThirdPartySharingForCoppaEnabledI.serializer(str3);
        if (str == null || str2 == null) {
            return;
        }
        String strMediaBrowserCompatMediaItem2 = null;
        if (pushAnalyticsData != null) {
            strMediaBrowserCompatMediaItem = pushAnalyticsData.MediaBrowserCompatMediaItem();
            int i2 = MediaDescriptionCompat + 37;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            strMediaBrowserCompatMediaItem = null;
        }
        if (strMediaBrowserCompatMediaItem != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strMediaBrowserCompatMediaItem)) {
            boolean zContains = ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer.read).IconCompatParcelizer.RemoteActionCompatParcelizer("nafath_tweety_template_names").contains(strMediaBrowserCompatMediaItem);
            int i4 = MediaDescriptionCompat + 19;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (zContains) {
                ((setOnRemoteTriggerListener) this.read.IconCompatParcelizer).read(str3, setOnSessionTrackingFailedListener.NAFATH_TWEETY, false, new wa(5), new NafathLogger$$ExternalSyntheticLambda0(11));
            }
        }
        if (pushAnalyticsData != null) {
            strMediaBrowserCompatMediaItem2 = pushAnalyticsData.MediaBrowserCompatMediaItem();
            int i6 = serializer + 123;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        this.write.write.onNext(new accessdrawWithChildTracking(new access900(str, str2, z, zRemoteActionCompatParcelizer, zSerializer, z2, pushDeepLink, str4, str5, str3, pushAnalyticsData, !((strMediaBrowserCompatMediaItem2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strMediaBrowserCompatMediaItem2)) ? false : ((FirebaseRemoteConfigImpl) this.IconCompatParcelizer.serializer).IconCompatParcelizer.RemoteActionCompatParcelizer("push_notification_dialog_suppressed_template_names").contains(strMediaBrowserCompatMediaItem2)), str6)));
    }
}
