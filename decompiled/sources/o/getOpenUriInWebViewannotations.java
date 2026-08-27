package o;

import android.content.ContentValues;
import com.sentiance.okhttp3.u$a;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.events.eventextras.TimelineUpdateDetails;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TimelineCreator")
public class getOpenUriInWebViewannotations implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getExpiresAt ComponentActivity;
    private final parseLonglambda0 IconCompatParcelizer;
    private final r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk MediaBrowserCompatMediaItem;
    private final _set_isIndicatorHighlighted_lambda0 MediaDescriptionCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaMetadataCompat;
    private final r8lambdaQwdzvCHX6VPuq3m8X5fPYEg3NrQ MediaSessionCompatQueueItem;
    private final r8lambdaktUwDO8RPEp6TXsZES7mdRqVXc MediaSessionCompatResultReceiverWrapper;
    private final isIndicatorHighlighted MediaSessionCompatToken;
    private final isDismissed ParcelableVolumeInfo;
    private final r8lambdaGsC5RGy6ZsYRnTdcPR0BNQBv7rc PlaybackStateCompat;
    private final isDismissedannotations PlaybackStateCompatCustomAction;
    private final setHeaderTextColor RatingCompat;
    private final logClicklambda1 RemoteActionCompatParcelizer;
    private final logImpressionlambda0 ResultReceiver;
    private final logClicklambda3 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private final logImpressionlambda4 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final isClicked r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final getListener r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private final logClicklambda1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final logClicklambda2 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private final getOpenUriInWebView r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private final getCreated r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final logImpressionlambda2 r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    private final getViewed r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private final r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final getCooldownEnterSeconds write;

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
    }

    public static void RemoteActionCompatParcelizer(getOpenUriInWebViewannotations getopenuriinwebviewannotations) {
        List<getImageStyle> list = getopenuriinwebviewannotations.MediaBrowserCompatMediaItem.read();
        getopenuriinwebviewannotations.MediaMetadataCompat.getClass();
        getopenuriinwebviewannotations.serializer(list, System.currentTimeMillis(), null);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        setHeaderTextColor setheadertextcolor = this.RatingCompat;
        setheadertextcolor.getClass();
        Long lValueOf = (Long) setheadertextcolor.RemoteActionCompatParcelizer(new getExitEvents(setheadertextcolor, 1));
        if (lValueOf == null) {
            this.MediaMetadataCompat.getClass();
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        map.put(r8lambdaSfjrR_HlZhgR9qJKoiGmntl4F8o.class, lValueOf);
        map.put(retryInAppMessage.class, lValueOf);
        map.put(r8lambda2L1vxSWbmFUTP9A4iejxpq7ZF7A.class, lValueOf);
        map.put(r8lambdaE7oIx09KQauliA8paOfGanE2_e8.class, lValueOf);
        map.put(setStaticExternalIEventMessengerandroid_sdk_base_release.class, lValueOf);
        map.put(setConfiguredCustomEndpointandroid_sdk_base_release.class, lValueOf);
        map.put(onReceivelambda0.class, lValueOf);
        Optional optional = this.write.read(invokeSuspendlambda0.class, lValueOf);
        if (optional.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer((getCooldownEnterSeconds.read) optional.write(), map, invokeSuspendlambda0.class);
        }
        return map;
    }

    public getOpenUriInWebViewannotations(parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, isDismissed isdismissed, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, setHeaderTextColor setheadertextcolor, r8lambdac3jvyDh89T8c2PwZtxY1g9Xzdk r8lambdac3jvydh89t8c2pwztxy1g9xzdk, r8lambdaQwdzvCHX6VPuq3m8X5fPYEg3NrQ r8lambdaqwdzvchx6vpuq3m8x5fpyeg3nrq, _set_isIndicatorHighlighted_lambda0 _set_isindicatorhighlighted_lambda0, isIndicatorHighlighted isindicatorhighlighted, isDismissedannotations isdismissedannotations, r8lambdaGsC5RGy6ZsYRnTdcPR0BNQBv7rc r8lambdagsc5rgy6zsyrntdcpr0bnqbv7rc, r8lambdaktUwDO8RPEp6TXsZES7mdRqVXc r8lambdaktuwdo8rpep6txszes7mdrqvxc) {
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = getanalyticsenabledenterannotations;
        this.write = getcooldownenterseconds;
        this.read = r8lambda59swxcybpdsiw8mt9h_rosbr8qq;
        this.MediaMetadataCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.ParcelableVolumeInfo = isdismissed;
        this.RatingCompat = setheadertextcolor;
        this.MediaBrowserCompatMediaItem = r8lambdac3jvydh89t8c2pwztxy1g9xzdk;
        this.MediaSessionCompatQueueItem = r8lambdaqwdzvchx6vpuq3m8x5fpyeg3nrq;
        this.MediaDescriptionCompat = _set_isindicatorhighlighted_lambda0;
        this.MediaSessionCompatToken = isindicatorhighlighted;
        this.PlaybackStateCompatCustomAction = isdismissedannotations;
        this.PlaybackStateCompat = r8lambdagsc5rgy6zsyrntdcpr0bnqbv7rc;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaktuwdo8rpep6txszes7mdrqvxc;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new logImpressionlambda4(this, readandroid_sdk_base_releaseVar);
        this.ComponentActivity = new getExpiresAt(this, readandroid_sdk_base_releaseVar);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new isClicked(this, readandroid_sdk_base_releaseVar);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new logClicklambda3(this, readandroid_sdk_base_releaseVar);
        this.ResultReceiver = new logImpressionlambda0(this, readandroid_sdk_base_releaseVar);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new getOpenUriInWebView(this, readandroid_sdk_base_releaseVar);
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new logClicklambda1(this, readandroid_sdk_base_releaseVar, 1);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new getListener(this, readandroid_sdk_base_releaseVar);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new getCreated(this, readandroid_sdk_base_releaseVar);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new logClicklambda2(this, readandroid_sdk_base_releaseVar);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new logImpressionlambda2(this, readandroid_sdk_base_releaseVar);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new getViewed(this, readandroid_sdk_base_releaseVar);
        this.RemoteActionCompatParcelizer = new logClicklambda1(this, readandroid_sdk_base_releaseVar, 0);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        getExpiresAt getexpiresat = this.ComponentActivity;
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, getexpiresat);
        getanalyticsenabledenterannotations.read(ControlMessage.CALL_DETECTOR_STOP, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        getanalyticsenabledenterannotations.read(ControlMessage.CALL_ACTIVE, this.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer(List<getImageStyle> list, long j, Long l) {
        if (list.isEmpty()) {
            return;
        }
        String strC = com.sentiance.sdk.util.x.c(j);
        String strC2 = l == null ? null : com.sentiance.sdk.util.x.c(l.longValue());
        for (getImageStyle getimagestyle : list) {
            Class<?> cls = getimagestyle.getClass();
            parseLonglambda0 parselonglambda0 = this.IconCompatParcelizer;
            if (cls == setHeaderTextAlign.class) {
                parselonglambda0.IconCompatParcelizer("Add entry: %s, at eventTime: %s, eventIngestionTime: %s", ((setHeaderTextAlign) getimagestyle).read(), strC, strC2);
            } else if (getimagestyle.getClass() == setHeader.class) {
                setHeader setheader = (setHeader) getimagestyle;
                parselonglambda0.IconCompatParcelizer("Delete table: %s, where: %s, at eventTime: %s, eventIngestionTime: %s", setheader.serializer().MediaDescriptionCompat(), setheader.read(), strC, strC2);
            } else if (getimagestyle.getClass() == handleLogClicklambda0.class) {
                handleLogClicklambda0 handlelogclicklambda0 = (handleLogClicklambda0) getimagestyle;
                parselonglambda0.IconCompatParcelizer("Update table: %s, set: %s, where: %s, at eventTime: %s, eventIngestionTime: %s", handlelogclicklambda0.serializer().MediaDescriptionCompat(), handlelogclicklambda0.write(), handlelogclicklambda0.read(), strC, strC2);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (l != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", (Integer) 1);
            contentValues.put("sdk_event_ingestion_time", l);
            arrayList.add(new handleLogClicklambda0(handleLogClicklambda2.read(), contentValues, new WhereClause(), true, new TimelineUpdateDetails()));
        }
        setHeaderTextColor setheadertextcolor = this.RatingCompat;
        setheadertextcolor.getClass();
        setheadertextcolor.serializer(new getAnalyticsEnabledEnter(setheadertextcolor, arrayList, 1));
        HashSet hashSet = new HashSet();
        TimelineUpdateDetails timelineUpdateDetails = new TimelineUpdateDetails();
        for (getImageStyle getimagestyle2 : list) {
            r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<? extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0> r8lambdarf7yhczztbilw1gecuyccn6jnysSerializer = getimagestyle2.serializer();
            if (r8lambdarf7yhczztbilw1gecuyccn6jnysSerializer instanceof isPushPrimer) {
                hashSet.add(((isPushPrimer) r8lambdarf7yhczztbilw1gecuyccn6jnysSerializer).MediaSessionCompatQueueItem());
            }
            timelineUpdateDetails.RemoteActionCompatParcelizer(getimagestyle2.RemoteActionCompatParcelizer());
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        this.read.getClass();
        u$a u_a = new u$a();
        u_a.IconCompatParcelizer = arrayList2;
        r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog r8lambdaqoukgs6h1gfby4ttokxnao8yog = new r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog(u_a);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(j);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaqoukgs6h1gfby4ttokxnao8yog;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        this.serializer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm, (Object) timelineUpdateDetails, true, (Scopes$$ExternalSyntheticLambda0) null);
    }
}
