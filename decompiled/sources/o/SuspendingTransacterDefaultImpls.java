package o;

import bo.app.af$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SuspendingTransacterDefaultImpls implements decode {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final isAdapterPositionOnScreen serializer;
    public final Object write;

    public SuspendingTransacterDefaultImpls(setOnEventTrackingSucceededListener setoneventtrackingsucceededlistener, transferSessionPackageI transfersessionpackagei, transactionWithResult transactionwithresult) {
        this.read = 1;
        this.write = setoneventtrackingsucceededlistener;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.IconCompatParcelizer = transactionwithresult;
        this.serializer = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(4, this));
    }

    public SuspendingTransacterDefaultImpls(Set set, getContentViewGroupParentLayout getcontentviewgroupparentlayout, isOpenInternalroom_runtime isopeninternalroom_runtime, AppEventInfoChangeHandler appEventInfoChangeHandler) {
        this.read = 0;
        this.write = set;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = appEventInfoChangeHandler;
        this.serializer = new isAdapterPositionOnScreen(new waExternalSyntheticLambda3(4, isopeninternalroom_runtime));
    }

    @Override // o.decode
    public final void logEvent(String str, Map map) {
        int i = 2 % 2;
        int i2 = this.read;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.serializer;
        str.getClass();
        if (i2 != 0) {
            if (((Set) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).contains(str)) {
                return;
            }
            if (map == null) {
                int i3 = MediaDescriptionCompat + 119;
                MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                map = SimpleItemTouchHelperCallback.serializer;
            }
            read(str, map);
            return;
        }
        int length = str.length();
        if (1 > length || length >= 41) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Event name is not within boundaries of [1, 40]. Event name = " + str + ", length = " + str.length(), new Object[0]);
            int i5 = MediaBrowserCompatMediaItem + 95;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, (CoroutineDispatcher) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, new HeatmapDataStore$set$2(this, str, map, (ShortNewsContentCardView) null, 6), 2);
    }

    public void read(String str, Map map) {
        Map mapIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        AdjustDeeplink adjustDeeplink = (AdjustDeeplink) ((setOnEventTrackingSucceededListener) this.write).RatingCompat.read();
        setSdkPrefix setsdkprefix = adjustDeeplink != null ? adjustDeeplink.read : null;
        if (setsdkprefix == null) {
            int i4 = MediaDescriptionCompat + 125;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                throw null;
            }
            mapIconCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
        } else {
            safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
            String value = setsdkprefix.MediaMetadataCompat.getValue();
            if (value != null) {
                int i5 = MediaBrowserCompatMediaItem + 9;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            safesetcliptooutline.put("rider_id", String.valueOf(setsdkprefix.write));
            mapIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
        }
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(mapIconCompatParcelizer, map);
        try {
            transactionWithResult transactionwithresult = (transactionWithResult) this.IconCompatParcelizer;
            str.getClass();
            BuildersKt.RemoteActionCompatParcelizer(transactionwithresult.IconCompatParcelizer, (CoroutineDispatcher) transactionwithresult.serializer.MediaSessionCompatResultReceiverWrapper(), null, new AsyncImagePainter$launchJob$1(transactionwithresult, str, linkedHashMapRemoteActionCompatParcelizer, null, 23), 2);
        } catch (Throwable th) {
            int i7 = MediaDescriptionCompat;
            int i8 = i7 + 17;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = i7 + 39;
            MediaBrowserCompatMediaItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                th.getMessage();
                throw null;
            }
            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
            String message = th.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            forest2.write(new IllegalStateException(af$$ExternalSyntheticOutline0.m("Failed to send Perseus event [", str, "]. Reason: ", message), th));
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("Event name is empty for perseus. parameters: " + map));
            int i11 = MediaDescriptionCompat + 33;
            MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
    }

    @Override // o.decode
    public final void IconCompatParcelizer(String str, Map map) {
        Map mapSingletonMap;
        int i = 2 % 2;
        int i2 = this.read;
        Map map2 = SimpleItemTouchHelperCallback.serializer;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.serializer;
        str.getClass();
        Object obj = null;
        if (i2 != 0) {
            if (!((Set) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).contains(str)) {
                if (map != null) {
                    map2 = map;
                }
                read("impression", map2);
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("Event name is empty for perseus. parameters: " + map));
                }
            }
            int i3 = MediaDescriptionCompat + 105;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (str.equals("screen_opened")) {
            mapSingletonMap = map2;
        } else {
            int i4 = MediaBrowserCompatMediaItem + 109;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                mapSingletonMap = Collections.singletonMap("screenName", str);
                mapSingletonMap.getClass();
                int i5 = 22 / 0;
            } else {
                mapSingletonMap = Collections.singletonMap("screenName", str);
                mapSingletonMap.getClass();
            }
        }
        if (map == null) {
            map = map2;
        }
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(map, mapSingletonMap);
        if (linkedHashMapRemoteActionCompatParcelizer.containsKey("screenName")) {
            ((AppEventInfoChangeHandler) this.IconCompatParcelizer).write("last_active_screen", (String) onMove.read(linkedHashMapRemoteActionCompatParcelizer, "screenName"));
            int i6 = MediaBrowserCompatMediaItem + 105;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException("Screen Name is Invalid with screen name = " + str + " and parameters = " + linkedHashMapRemoteActionCompatParcelizer));
        }
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, (CoroutineDispatcher) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, new HeatmapDataStore$set$2(this, str, (Map) linkedHashMapRemoteActionCompatParcelizer, (ShortNewsContentCardView) null, 7), 2);
    }
}
