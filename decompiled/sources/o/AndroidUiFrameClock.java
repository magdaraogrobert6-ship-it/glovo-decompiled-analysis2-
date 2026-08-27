package o;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.SystemBarStyle$Companion;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import com.roadrunner.login.presentation.router.RouterActivity;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class AndroidUiFrameClock implements getPlacementScope, TransacterDefaultImpls, getMessageWebView {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public AndroidUiFrameClock(accessisMainThread accessismainthread) {
    }

    public Intent serializer(androidx.activity.ComponentActivity componentActivity) {
        int i = 2 % 2;
        Intent intent = new BrazeCompanionExternalSyntheticLambda21(2).read(componentActivity);
        int i2 = IconCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return intent;
        }
        throw null;
    }

    @Override // o.TransacterDefaultImpls
    public void IconCompatParcelizer(RouterActivity routerActivity, Uri uri) {
        int i = 2 % 2;
        Intent intentSerializer = serializer(routerActivity);
        if (uri != null) {
            int i2 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            intentSerializer.putExtra("deeplinkUri", uri);
        }
        routerActivity.startActivity(intentSerializer);
        int i4 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.getPlacementScope
    public Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = 2 % 2;
        SystemBarStyle$Companion.write();
        speculativeHit speculativehit = new speculativeHit(1);
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
        return speculativehit;
    }

    public static r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs r8lambdaoaqvy__5d9hmn5g6gasyvakdzs = new r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs(new RegistryMissingComponentException(), Math.min(1048576, Math.max(androidx.compose.ui.graphics.Fields.TransformOrigin, i)));
        int i3 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return r8lambdaoaqvy__5d9hmn5g6gasyvakdzs;
    }

    public static void RemoteActionCompatParcelizer(AndroidUiFrameClock androidUiFrameClock, div7Ah8Wj8 div7ah8wj8) {
        int i = 2 % 2;
        List listIconCompatParcelizer = div7ah8wj8.PlaybackStateCompatCustomAction.IconCompatParcelizer();
        listIconCompatParcelizer.getClass();
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
        androidx.fragment.app.FragmentActivity activity = null;
        if (fragment != null) {
            int i2 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                fragment.getActivity();
                throw null;
            }
            activity = fragment.getActivity();
        }
        if (activity != null) {
            DragAndDropNodeKtDragAndDropTargetModifierNode1.read(activity, "");
        }
        int i3 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
    }

    public static TextUnitTypeCompanion serializer(AndroidPopup_androidKtPopup81 androidPopup_androidKtPopup81) {
        int i = 2 % 2;
        androidPopup_androidKtPopup81.getClass();
        long jRatingCompat = androidPopup_androidKtPopup81.RatingCompat();
        String strRemoteActionCompatParcelizer = androidPopup_androidKtPopup81.RemoteActionCompatParcelizer();
        copyOhffZ5M.Companion.getClass();
        TextUnitTypeCompanion textUnitTypeCompanion = new TextUnitTypeCompanion(jRatingCompat, copyOhffZ5Mdefault.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer), androidPopup_androidKtPopup81.IconCompatParcelizer(), String.valueOf(androidPopup_androidKtPopup81.MediaDescriptionCompat()), androidPopup_androidKtPopup81.serializer(), androidPopup_androidKtPopup81.read(), androidPopup_androidKtPopup81.MediaSessionCompatQueueItem(), androidPopup_androidKtPopup81.MediaBrowserCompatMediaItem(), androidPopup_androidKtPopup81.MediaMetadataCompat(), androidPopup_androidKtPopup81.write());
        int i2 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return textUnitTypeCompanion;
    }

    public static ArrayList write(String str) {
        int i = 2 % 2;
        str.getClass();
        List<List<Point>> listCoordinates2 = Polygon.fromJson(str).coordinates();
        listCoordinates2.getClass();
        Object obj = onContentCardDismissed.read((List) listCoordinates2);
        obj.getClass();
        Iterable<Point> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        int i2 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (Point point : iterable) {
            arrayList.add(new o7ExternalSyntheticLambda3(point.latitude(), point.longitude()));
        }
        return arrayList;
    }

    public static getReferrer IconCompatParcelizer(getGooglePlayServicesInfo getgoogleplayservicesinfo, setUrlStrategy seturlstrategy, GooglePlayServicesClientGooglePlayServicesConnection googlePlayServicesClientGooglePlayServicesConnection) {
        getDeduplicationId getdeduplicationid;
        accesssetCustomBrazeNotificationFactorycp accesssetcustombrazenotificationfactorycp;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Long lMediaBrowserCompatMediaItem = getgoogleplayservicesinfo.MediaBrowserCompatMediaItem();
        Long lMediaSessionCompatToken = getgoogleplayservicesinfo.MediaSessionCompatToken();
        Long lMediaSessionCompatQueueItem = getgoogleplayservicesinfo.MediaSessionCompatQueueItem();
        String strIconCompatParcelizer = getgoogleplayservicesinfo.IconCompatParcelizer();
        Calendar calendarRatingCompat = getgoogleplayservicesinfo.RatingCompat();
        Calendar calendarRemoteActionCompatParcelizer = getgoogleplayservicesinfo.RemoteActionCompatParcelizer();
        switch (setTryInstallReferrer.RemoteActionCompatParcelizer[seturlstrategy.ordinal()]) {
            case 1:
                getdeduplicationid = getDeduplicationId.UPCOMING;
                break;
            case 2:
                getdeduplicationid = getDeduplicationId.LATE;
                break;
            case 3:
            case 4:
                getdeduplicationid = getDeduplicationId.NEXT;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                getdeduplicationid = getDeduplicationId.CURRENT;
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
        getDeduplicationId getdeduplicationid2 = getdeduplicationid;
        if (googlePlayServicesClientGooglePlayServicesConnection != null) {
            ArrayList<GlobalParameters> arrayList = googlePlayServicesClientGooglePlayServicesConnection.IconCompatParcelizer;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (GlobalParameters globalParameters : arrayList) {
                arrayList2.add(new accesssafeCallFlushDelayedInitPushAnalyticsQueue(globalParameters.IconCompatParcelizer(), globalParameters.read()));
            }
            accesssetcustombrazenotificationfactorycp = new accesssetCustomBrazeNotificationFactorycp(arrayList2, accesssetDeviceDataProvidercp.STARTING_AREA);
        } else {
            accesssetcustombrazenotificationfactorycp = null;
        }
        String strSerializer = getgoogleplayservicesinfo.serializer();
        List list = getgoogleplayservicesinfo.read();
        Boolean boolWrite = getgoogleplayservicesinfo.write();
        boolean zMediaMetadataCompat = getgoogleplayservicesinfo.MediaMetadataCompat();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getReferrer getreferrer = new getReferrer(calendarRatingCompat, calendarRemoteActionCompatParcelizer, strIconCompatParcelizer, lMediaSessionCompatToken, lMediaSessionCompatQueueItem, lMediaBrowserCompatMediaItem, getdeduplicationid2, accesssetcustombrazenotificationfactorycp, strSerializer, list, boolWrite, zMediaMetadataCompat, (String) getGooglePlayServicesInfo.serializer(-1660347057, iSerializer, isAppSetIdReadingEnabled.serializer(), new Object[]{getgoogleplayservicesinfo}, isAppSetIdReadingEnabled.serializer(), 1660347058, iSerializer2));
        int i4 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getreferrer;
    }

    public static Integer IconCompatParcelizer(TagIconTokenV1 tagIconTokenV1) {
        int i = 2 % 2;
        tagIconTokenV1.getClass();
        switch (invokeGetDesignInfo.IconCompatParcelizer[tagIconTokenV1.ordinal()]) {
            case 1:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_small_essentials_time_circle);
            case 2:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_small_essentials_shopping_bag_check);
            case 3:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_open_in_full_default);
            case 4:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_split_order);
            case 5:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_call_or_chat);
            case 6:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_change_needed);
            case 7:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_chat);
            case 8:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_door);
            case 9:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_halal_order);
            case 10:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_hang_order);
            case 11:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_leave_at_lobby);
            case 12:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_meet_at_lobby);
            case 13:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_non_halal_order);
            case 14:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_notification);
            case 15:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_outside);
            case 16:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_pelican_order);
            case 17:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_phone);
            case 18:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_reception);
            case 19:
                Integer numValueOf = Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_ring_doorbell);
                int i2 = IconCompatParcelizer + 117;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 98 / 0;
                }
                return numValueOf;
            case 20:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_specified_location);
            case 21:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_sync);
            case 22:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_small_logout_logout);
            case 23:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_file_note);
            case 24:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_phone_no_calling);
            case 25:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_instructions_stacked_order);
            case 26:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_phone_default);
            case 27:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_sync_one_direction_clockwise);
            case 28:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_qr_code);
            case 29:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_x_circle);
            case 30:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_check_circle_filled);
            case 31:
                return Integer.valueOf(com.logistics.rider.glovo.R.drawable.img_large_brand_qr_payment_qr_ph_logo);
            case 32:
                Integer numValueOf2 = Integer.valueOf(com.logistics.rider.glovo.R.drawable.img_large_brand_qr_payment_duit_now_logo);
                int i4 = IconCompatParcelizer + 75;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return numValueOf2;
                }
                throw null;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            case 33:
                return null;
        }
    }

    public AndroidUiFrameClock() {
    }
}
