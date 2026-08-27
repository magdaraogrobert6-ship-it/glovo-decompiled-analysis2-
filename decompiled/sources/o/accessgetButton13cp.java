package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.home.CreateHomeScope;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton13cp implements accessgetForwardcp {
    public final URL IconCompatParcelizer;
    public final accessgetMediaPlaycp MediaSessionCompatQueueItem;
    public final accessgetMediaPlaycp RatingCompat;
    public final ConnectivityManager RemoteActionCompatParcelizer;
    public final int read;
    public final Context serializer;
    public final CreateHomeScope write;

    public static URL write(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid url: ", str), e);
        }
    }

    public final accessgetDvrcp read(accessgetDvrcp accessgetdvrcp) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.RemoteActionCompatParcelizer.getActiveNetworkInfo();
        accessgetEndCallcp accessgetendcallcpIconCompatParcelizer = accessgetdvrcp.IconCompatParcelizer();
        int i = Build.VERSION.SDK_INT;
        HashMap map = accessgetendcallcpIconCompatParcelizer.write;
        if (map == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("sdk-version", String.valueOf(i));
        accessgetendcallcpIconCompatParcelizer.serializer("model", Build.MODEL);
        accessgetendcallcpIconCompatParcelizer.serializer("hardware", Build.HARDWARE);
        accessgetendcallcpIconCompatParcelizer.serializer("device", Build.DEVICE);
        accessgetendcallcpIconCompatParcelizer.serializer("product", Build.PRODUCT);
        accessgetendcallcpIconCompatParcelizer.serializer("os-uild", Build.ID);
        accessgetendcallcpIconCompatParcelizer.serializer("manufacturer", Build.MANUFACTURER);
        accessgetendcallcpIconCompatParcelizer.serializer(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map2 = accessgetendcallcpIconCompatParcelizer.write;
        if (map2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("tz-offset", String.valueOf(offset));
        int value = activeNetworkInfo == null ? accessgetDeletecp.NONE.getValue() : activeNetworkInfo.getType();
        HashMap map3 = accessgetendcallcpIconCompatParcelizer.write;
        if (map3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("net-type", String.valueOf(value));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = accessgetDirectionDowncp.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = accessgetDirectionDowncp.COMBINED.getValue();
            } else if (accessgetDirectionDowncp.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap map4 = accessgetendcallcpIconCompatParcelizer.write;
        if (map4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("mobile-subtype", String.valueOf(subtype));
        accessgetendcallcpIconCompatParcelizer.serializer(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, java.util.Locale.getDefault().getCountry());
        accessgetendcallcpIconCompatParcelizer.serializer("locale", java.util.Locale.getDefault().getLanguage());
        Context context = this.serializer;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        accessgetendcallcpIconCompatParcelizer.serializer("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            RangesKt.serializer("CctTransportBackend", "Unable to find version code for package", e);
        }
        accessgetendcallcpIconCompatParcelizer.serializer("application_build", Integer.toString(i2));
        return accessgetendcallcpIconCompatParcelizer.read();
    }

    public accessgetButton13cp(Context context, accessgetMediaPlaycp accessgetmediaplaycp, accessgetMediaPlaycp accessgetmediaplaycp2) {
        detachAndRemoveNode detachandremovenode = new detachAndRemoveNode();
        accessgetButton2cp accessgetbutton2cp = accessgetButton2cp.serializer;
        detachandremovenode.serializer(accessgetCalendarcp.class, accessgetbutton2cp);
        detachandremovenode.serializer(accessgetButtonL2cp.class, accessgetbutton2cp);
        accessgetButton9cp accessgetbutton9cp = accessgetButton9cp.read;
        detachandremovenode.serializer(accessgetDirectionDownLeftcp.class, accessgetbutton9cp);
        detachandremovenode.serializer(accessgetButtonZcp.class, accessgetbutton9cp);
        accessgetButton4cp accessgetbutton4cp = accessgetButton4cp.serializer;
        detachandremovenode.serializer(accessgetCapsLockcp.class, accessgetbutton4cp);
        detachandremovenode.serializer(accessgetButtonL1cp.class, accessgetbutton4cp);
        accessgetButton3cp accessgetbutton3cp = accessgetButton3cp.MediaDescriptionCompat;
        detachandremovenode.serializer(accessgetButton14cp.class, accessgetbutton3cp);
        detachandremovenode.serializer(accessgetButtonCcp.class, accessgetbutton3cp);
        accessgetButton8cp accessgetbutton8cp = accessgetButton8cp.MediaMetadataCompat;
        detachandremovenode.serializer(accessgetCtrlRightcp.class, accessgetbutton8cp);
        detachandremovenode.serializer(accessgetCcp.class, accessgetbutton8cp);
        accessgetButton16cp accessgetbutton16cp = accessgetButton16cp.write;
        detachandremovenode.serializer(accessgetCallcp.class, accessgetbutton16cp);
        detachandremovenode.serializer(accessgetButtonModecp.class, accessgetbutton16cp);
        accessgetButton7cp accessgetbutton7cp = accessgetButton7cp.IconCompatParcelizer;
        detachandremovenode.serializer(accessgetCutcp.class, accessgetbutton7cp);
        detachandremovenode.serializer(accessgetButtonSelectcp.class, accessgetbutton7cp);
        accessgetButton6cp accessgetbutton6cp = accessgetButton6cp.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(accessgetChannelUpcp.class, accessgetbutton6cp);
        detachandremovenode.serializer(accessgetButtonR1cp.class, accessgetbutton6cp);
        accessgetButtonAcp accessgetbuttonacp = accessgetButtonAcp.read;
        detachandremovenode.serializer(accessgetDirectionDownRightcp.class, accessgetbuttonacp);
        detachandremovenode.serializer(accessgetCalculatorcp.class, accessgetbuttonacp);
        accessgetButton5cp accessgetbutton5cp = accessgetButton5cp.serializer;
        detachandremovenode.serializer(accessgetChannelDowncp.class, accessgetbutton5cp);
        detachandremovenode.serializer(accessgetButtonThumbLeftcp.class, accessgetbutton5cp);
        detachandremovenode.RatingCompat = true;
        this.write = new CreateHomeScope(detachandremovenode);
        this.serializer = context;
        this.RemoteActionCompatParcelizer = (ConnectivityManager) context.getSystemService("connectivity");
        this.IconCompatParcelizer = write(accessgetButton11cp.RemoteActionCompatParcelizer);
        this.RatingCompat = accessgetmediaplaycp2;
        this.MediaSessionCompatQueueItem = accessgetmediaplaycp;
        this.read = 130000;
    }
}
