package com.roadrunner.delivery.common.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.FontEj4NQ78;
import o.FontEj4NQ78default;
import o.FontMuC2MFsdefault;
import o.FontVariationSettingFloat;
import o.ShortNewsContentCardView;
import o.StaticImageDecoder;
import o.decode;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.onFontRetrievalFailed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptanceLogger {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final StaticImageDecoder MediaMetadataCompat;
    public final FontEj4NQ78 MediaSessionCompatQueueItem;
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final FontEj4NQ78default read;
    public final decode serializer;
    public final FontVariationSettingFloat write;

    public DeliveryAcceptanceLogger(decode decodeVar, FontVariationSettingFloat fontVariationSettingFloat, FontEj4NQ78 fontEj4NQ78, StaticImageDecoder staticImageDecoder, FontEj4NQ78default fontEj4NQ78default, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        decodeVar.getClass();
        fontEj4NQ78.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.serializer = decodeVar;
        this.write = fontVariationSettingFloat;
        this.MediaSessionCompatQueueItem = fontEj4NQ78;
        this.MediaMetadataCompat = staticImageDecoder;
        this.read = fontEj4NQ78default;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.RemoteActionCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("has_map_centric", "true"));
    }

    public final void serializer(TrackingEvent trackingEvent) {
        int i = 2 % 2;
        trackingEvent.getClass();
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new LocalAuthDataSource.AnonymousClass2(this, trackingEvent, null, 20), 3);
        int i2 = MediaDescriptionCompat + 101;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    public final void write(TrackingEvent trackingEvent) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            trackingEvent.getClass();
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{trackingEvent.name, "ab_test_participated"}, getCieXyz.write())).booleanValue();
            obj.hashCode();
            throw null;
        }
        trackingEvent.getClass();
        String str = trackingEvent.name;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ab_test_participated"}, getCieXyz.write())).booleanValue()) {
            serializer(trackingEvent);
            return;
        }
        Map mapRemoteActionCompatParcelizer = FontMuC2MFsdefault.RemoteActionCompatParcelizer(trackingEvent.parameters);
        if (mapRemoteActionCompatParcelizer.containsKey("screenName")) {
            int i3 = MediaDescriptionCompat + 23;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            str = (String) onMove.read(mapRemoteActionCompatParcelizer, "screenName");
            int i5 = RatingCompat + 53;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 / 4;
            }
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "screen_opened"}, getCieXyz.write())).booleanValue()) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new IllegalStateException(), "No Screen name found in tracking params from BE, params " + mapRemoteActionCompatParcelizer + ", event " + trackingEvent, new Object[0]);
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new DeliveryAcceptanceLogger$logScreen$1(this, str, mapRemoteActionCompatParcelizer, (ShortNewsContentCardView) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public static final Object access$getOverlayPermissionsParams(DeliveryAcceptanceLogger deliveryAcceptanceLogger, ContinuationImpl continuationImpl) throws Throwable {
        onFontRetrievalFailed onfontretrievalfailed;
        String str;
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        deliveryAcceptanceLogger.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof onFontRetrievalFailed) {
            int i4 = RatingCompat + 109;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = ((onFontRetrievalFailed) continuationImpl).read;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            onfontretrievalfailed = (onFontRetrievalFailed) continuationImpl;
            int i6 = onfontretrievalfailed.read;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onfontretrievalfailed.read = i6 - Integer.MIN_VALUE;
            } else {
                onfontretrievalfailed = new onFontRetrievalFailed(deliveryAcceptanceLogger, continuationImpl);
            }
        } else {
            onfontretrievalfailed = new onFontRetrievalFailed(deliveryAcceptanceLogger, continuationImpl);
        }
        Object obj = onfontretrievalfailed.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = onfontretrievalfailed.read;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StaticImageDecoder staticImageDecoder = deliveryAcceptanceLogger.MediaMetadataCompat;
            onfontretrievalfailed.RemoteActionCompatParcelizer = "hasDrawingOnOtherAppsPermission";
            onfontretrievalfailed.read = 1;
            ((inCompatibilityMode) staticImageDecoder.IconCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(staticImageDecoder, shortNewsContentCardView, 6), onfontretrievalfailed);
            if (objWithContext == coroutineSingletons) {
                int i8 = RatingCompat + 123;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            }
            obj = objWithContext;
            str = "hasDrawingOnOtherAppsPermission";
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = onfontretrievalfailed.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        Map mapSingletonMap = Collections.singletonMap(str, String.valueOf(((Boolean) obj).booleanValue()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
