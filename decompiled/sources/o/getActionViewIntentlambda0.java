package o;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.maps.EdgeInsets;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.login.presentation.router.RouterActivity;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Calendar;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class getActionViewIntentlambda0 implements getPlacementScope, enclosingTransactionruntime {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = 2 % 2;
        AndroidUiFrameClockwithFrameNanos21 androidUiFrameClockwithFrameNanos21 = new AndroidUiFrameClockwithFrameNanos21(metricsBatchProcessor.write(speculativeHit.class));
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return androidUiFrameClockwithFrameNanos21;
        }
        throw null;
    }

    public Intent read(Context context, String str, String str2, String str3, Boolean bool, String str4, String str5, PushAnalyticsData pushAnalyticsData, String str6) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) RouterActivity.class);
        intent.addFlags(335544320);
        if (str != null) {
            intent.putExtra(com.deliveryhero.chatsdk.util.PushNotificationParserObj.TITLE_KEY, str);
            int i2 = read + 109;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        if (str2 != null) {
            intent.putExtra("message", str2);
        }
        if (str3 != null) {
            intent.putExtra("category", str3);
        }
        if (bool != null) {
            int i4 = IconCompatParcelizer + 69;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            intent.putExtra("syncState", bool.booleanValue());
        }
        if (str4 != null) {
            intent.putExtra("newDeliveryId", str4);
        }
        if (str5 != null) {
            intent.putExtra("messageId", str5);
        }
        if (pushAnalyticsData != null) {
            int i6 = IconCompatParcelizer + 47;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                intent.putExtra("analytics_data", pushAnalyticsData);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            intent.putExtra("analytics_data", pushAnalyticsData);
        }
        if (str6 != null) {
            intent.putExtra("pushSourceTrigger", str6);
        }
        int i7 = IconCompatParcelizer + 27;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return intent;
    }

    public static AdjustEvent read(getReferrer getreferrer, getFailureResponseData getfailureresponsedata) {
        int i = 2 % 2;
        getfailureresponsedata.getClass();
        if (getreferrer == null || getreferrer.MediaDescriptionCompat == getDeduplicationId.CURRENT) {
            return null;
        }
        Long l = getreferrer.MediaSessionCompatQueueItem;
        String str = getreferrer.read;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Long l2 = getreferrer.ParcelableVolumeInfo;
        Long l3 = getreferrer.PlaybackStateCompatCustomAction;
        Calendar calendar = getreferrer.MediaMetadataCompat;
        if (calendar == null) {
            calendar = Calendar.getInstance();
        }
        Calendar calendar2 = calendar;
        calendar2.getClass();
        Calendar calendar3 = getreferrer.IconCompatParcelizer;
        if (calendar3 == null) {
            int i2 = IconCompatParcelizer + 93;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                calendar3 = Calendar.getInstance();
                int i3 = 42 / 0;
            } else {
                calendar3 = Calendar.getInstance();
            }
            int i4 = read + 9;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        Calendar calendar4 = calendar3;
        calendar4.getClass();
        getDeduplicationId getdeduplicationid = getreferrer.MediaDescriptionCompat;
        accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp = getreferrer.RatingCompat;
        boolean z = getdeduplicationid == getDeduplicationId.UPCOMING || getdeduplicationid == getDeduplicationId.LATE;
        int i6 = IconCompatParcelizer + 125;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return new AdjustEvent(l, l2, l3, getfailureresponsedata, str2, calendar2, calendar4, getdeduplicationid, accesssetcustombrazenotificationfactorycp, z, getreferrer.RemoteActionCompatParcelizer, getreferrer.write, getreferrer.serializer, getreferrer.MediaBrowserCompatMediaItem);
    }

    public static Float IconCompatParcelizer(double d, double d2, double d3, double d4) {
        float f;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                float[] fArr = new float[1];
                Location.distanceBetween(d, d2, d3, d4, fArr);
                f = fArr[1];
            } else {
                float[] fArr2 = new float[1];
                Location.distanceBetween(d, d2, d3, d4, fArr2);
                f = fArr2[0];
            }
            Float fValueOf = Float.valueOf(f);
            int i3 = read + 71;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 88 / 0;
            }
            return fValueOf;
        } catch (Exception e) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m(d, "Failed to calculate distance between {", ", ");
            sbM.append(d2);
            sbM.append("} and {");
            sbM.append(d3);
            sbM.append(", ");
            forest.RemoteActionCompatParcelizer(e, ff$$ExternalSyntheticOutline0.m(d4, "}", sbM), new Object[0]);
            return null;
        }
    }

    public static EdgeInsets IconCompatParcelizer(g6 g6Var) {
        int i = 2 % 2;
        g6Var.getClass();
        EdgeInsets edgeInsets = new EdgeInsets(g6Var.read, g6Var.IconCompatParcelizer, g6Var.write, g6Var.serializer);
        int i2 = read + 29;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return edgeInsets;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
