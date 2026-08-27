package o;

import android.net.Uri;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSendingFocusAffectingEventp {
    public final TextAnnouncementContentCardView read;
    public final addNotificationForSysPropsChangelambda0010 serializer;

    public accessgetSendingFocusAffectingEventp(addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        addnotificationforsyspropschangelambda0010.getClass();
        textAnnouncementContentCardView.getClass();
        this.serializer = addnotificationforsyspropschangelambda0010;
        this.read = textAnnouncementContentCardView;
    }

    public static final URL read(accessgetSendingFocusAffectingEventp accessgetsendingfocusaffectingeventp) {
        accessgetsendingfocusaffectingeventp.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(com.adjust.sdk.Constants.SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(FWFHelper.fwfDeviceOS).appendPath("gmp");
        addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010 = accessgetsendingfocusaffectingeventp.serializer;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(addnotificationforsyspropschangelambda0010.serializer).appendPath("settings");
        removeNotificationForSysPropsChange removenotificationforsyspropschange = addnotificationforsyspropschangelambda0010.write;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", removenotificationforsyspropschange.RemoteActionCompatParcelizer).appendQueryParameter("display_version", removenotificationforsyspropschange.serializer).build().toString());
    }
}
