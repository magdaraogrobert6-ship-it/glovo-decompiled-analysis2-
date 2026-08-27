package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.I$b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getAltImageText extends getCardType<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> {
    public getAltImageText(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, List<r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0> list) {
        super(setsoundifpresentandsupportedlambda1, list);
    }

    @Override // o.getCardType
    public final short IconCompatParcelizer() {
        return (short) 7;
    }

    @Override // o.getCardType
    public final getDefaultNotificationAccentColorandroid_sdk_base_release IconCompatParcelizer(r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme) {
        getGoodNetworkIntervalandroid_sdk_base_release getgoodnetworkintervalandroid_sdk_base_releaseWrite;
        ArrayList arrayList;
        r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0 = (r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0) r8lambdajpyyzonaiuxh7ebz6m40cuqfrme;
        Float fRatingCompat = r8lambda5plvmmyc7msph8a8xignikxwbe0.RatingCompat();
        E$b e$b = new E$b(15);
        if (r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaMetadataCompat() == null || r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaDescriptionCompat() == null) {
            getgoodnetworkintervalandroid_sdk_base_releaseWrite = null;
        } else {
            r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Integer.valueOf((int) (r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaMetadataCompat().floatValue() * 1000000.0f));
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Integer.valueOf((int) (r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaDescriptionCompat().floatValue() * 1000000.0f));
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = r8lambda5plvmmyc7msph8a8xignikxwbe0.read();
            getgoodnetworkintervalandroid_sdk_base_releaseWrite = r8lambdayc78smgbbb6fudfjq0u5z3_ls.write();
        }
        e$b.read = getgoodnetworkintervalandroid_sdk_base_releaseWrite;
        if (r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatQueueItem().isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua : r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatQueueItem()) {
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                String strIconCompatParcelizer = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.IconCompatParcelizer();
                if (strIconCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'name' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = strIconCompatParcelizer;
                String str = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.read();
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'version' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = str;
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.RemoteActionCompatParcelizer();
                arrayList.add(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.read());
            }
        }
        e$b.IconCompatParcelizer = arrayList;
        e$b.MediaDescriptionCompat = fRatingCompat == null ? null : Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(fRatingCompat.floatValue()));
        e$b.MediaMetadataCompat = fRatingCompat == null ? null : Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(fRatingCompat.floatValue())));
        e$b.RemoteActionCompatParcelizer = r8lambda5plvmmyc7msph8a8xignikxwbe0.serializer() == null ? null : Byte.valueOf((byte) (r8lambda5plvmmyc7msph8a8xignikxwbe0.serializer().floatValue() * 100.0f));
        e$b.MediaBrowserCompatMediaItem = r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat() == null ? null : Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat().floatValue()));
        e$b.write = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaBrowserCompatMediaItem() != null ? Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaBrowserCompatMediaItem().floatValue())) : null;
        getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release = new getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release(e$b);
        I$b i$b = new I$b(0);
        i$b.MediaDescriptionCompat = getinappmessagewebviewclientmaxonpagefinishedwaitmsandroid_sdk_base_release;
        return i$b.write();
    }
}
