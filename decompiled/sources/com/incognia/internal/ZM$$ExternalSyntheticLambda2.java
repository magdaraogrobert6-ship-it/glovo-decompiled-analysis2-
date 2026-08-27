package com.incognia.internal;

import android.view.Window;
import android.widget.EditText;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.riemann.location.gwivdr.utils.InputFreqCheckThread;
import com.huawei.riemann.location.gwivdr.utils.KeepAliveManager;
import com.logistics.rider.glovo.R;
import com.mapbox.common.CommonSdkLog;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import com.mapbox.maps.plugin.viewport.ViewportStatus$Idle;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuversList;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$resolve$2;
import com.mapbox.search.base.perf.PerformanceTracker;
import com.mapbox.search.record.LocalDataProviderImpl;
import com.mapbox.search.utils.CompoundCompletionCallback;
import com.mapbox.search.utils.LoggingCompletionCallback;
import com.roadrunner.home.nest.NestFragment;
import com.sentiance.sdk.eventtimeline.api.PotentialVehicleTransportStartListener;
import java.util.List;
import o.addNotificationActionlambda0;
import o.createFromParcel;
import o.forJsonPutlambda0;
import o.parseNonBlankStringlambda0;
import o.parsePayloadFieldsFromBundleparseBigImageStyle;
import o.parsePayloadFieldsFromBundleparsePushDeliveryEventData;
import o.r8lambdaJAzuAI86BqHAUWuq3a942DKIySE;
import o.r8lambdaJFE_chLd2jQnyQVpk_1hYHN04;
import o.r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ;
import o.r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk;
import o.r8lambdacjWcjm3stVKeZF_SundXc95EHE8;
import o.setOnCopyRequested;
import o.stringAndKey;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ZM$$ExternalSyntheticLambda2 implements Runnable {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ZM$$ExternalSyntheticLambda2(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ZM.BGx((ZM) obj);
                return;
            case 1:
                setOnCopyRequested.IconCompatParcelizer((setOnCopyRequested) ((i$d.a) obj).read, false);
                return;
            case 2:
                ((InputFreqCheckThread) obj).lambda$checkDataPeriodically$0();
                int i3 = read + 91;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return;
            case 3:
                ((KeepAliveManager) obj).lambda$setErrorCode$0();
                return;
            case 4:
                pNP.BGx((List) obj);
                return;
            case 5:
                pNP.mbG((ZBu) obj);
                return;
            case 6:
                ((GesturesPluginImpl) obj).unregisterScheduledAnimators();
                return;
            case 7:
                ((IndoorSelectorViewImpl) obj).updateArrows();
                return;
            case 8:
                ((ScaleBarImpl) obj).requestLayout();
                return;
            case 9:
                ((ViewportStatus$Idle) obj).getClass();
                throw null;
            case 10:
                MapboxManeuversList mapboxManeuversList = (MapboxManeuversList) obj;
                int i5 = MapboxManeuversList.$r8$clinit;
                mapboxManeuversList.mRequestedLayout = false;
                mapboxManeuversList.layout(mapboxManeuversList.getLeft(), mapboxManeuversList.getTop(), mapboxManeuversList.getRight(), mapboxManeuversList.getBottom());
                mapboxManeuversList.onLayout(false, mapboxManeuversList.getLeft(), mapboxManeuversList.getTop(), mapboxManeuversList.getRight(), mapboxManeuversList.getBottom());
                return;
            case 11:
                CommonSdkLog.INSTANCE.logd(null, ((LoggingCompletionCallback) obj).operationName.concat(" completed"));
                return;
            case 12:
                ((CompoundCompletionCallback) obj).onComplete(createfromparcel);
                return;
            case 13:
                PerformanceTracker.trackPerformanceSync("LocalDataProviderImpl#initialRead", new LocalDataProviderImpl.AnonymousClass1((LocalDataProviderImpl) obj, 1));
                return;
            case 14:
                ((IndexableDataProvidersRegistryImpl$resolve$2) obj).onComplete(createfromparcel);
                return;
            case 15:
                ((NestFragment) obj).read(false, false);
                return;
            case 16:
                ((Window) obj).setWindowAnimations(R.style.Animation_RoadRunner_Dialog_Expand_NoEnterAnimation);
                return;
            case 17:
                ((EditText) obj).requestLayout();
                return;
            case 18:
                r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ.read((r8lambdaMiz9IrkK7Q7UB6htOHoIqxpE3WQ) obj);
                return;
            case 19:
                r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.RemoteActionCompatParcelizer((r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk) obj);
                return;
            case 20:
                r8lambdacjWcjm3stVKeZF_SundXc95EHE8.serializer((r8lambdacjWcjm3stVKeZF_SundXc95EHE8) obj);
                int i6 = read + 47;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            case 21:
                forJsonPutlambda0.read((forJsonPutlambda0) obj);
                return;
            case 22:
                ((PotentialVehicleTransportStartListener) obj).onPotentialVehicleTransportStartDetected();
                return;
            case 23:
                parsePayloadFieldsFromBundleparseBigImageStyle.RemoteActionCompatParcelizer((parsePayloadFieldsFromBundleparseBigImageStyle) obj);
                return;
            case 24:
                parsePayloadFieldsFromBundleparsePushDeliveryEventData.write((parsePayloadFieldsFromBundleparsePushDeliveryEventData) obj);
                return;
            case 25:
                parseNonBlankStringlambda0.RemoteActionCompatParcelizer((parseNonBlankStringlambda0) obj);
                return;
            case 26:
                stringAndKey.read((stringAndKey) obj);
                return;
            case 27:
                addNotificationActionlambda0.write((addNotificationActionlambda0) obj);
                return;
            case 28:
                ((r8lambdaJAzuAI86BqHAUWuq3a942DKIySE) obj).MediaSessionCompatQueueItem();
                return;
            default:
                r8lambdaJFE_chLd2jQnyQVpk_1hYHN04.IconCompatParcelizer((r8lambdaJFE_chLd2jQnyQVpk_1hYHN04) obj);
                return;
        }
    }
}
