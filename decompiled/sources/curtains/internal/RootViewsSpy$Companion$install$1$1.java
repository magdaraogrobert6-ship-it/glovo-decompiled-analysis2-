package curtains.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.datastore.core.SingleProcessDataStore;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.performance.core.aqs.AppQualityScore$enableScreenMetrics$1$1;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import io.sentry.okhttp.IconCompatParcelizer;
import io.sentry.protocol.ResultReceiver;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.FwFClientaddFeatureKeys1;
import o.LayerSnapshotV22;
import o.ShadowRenderer;
import o._get_messageWebView_lambda1;
import o.accessgetVcp;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.defaultCardHandlinglambda0;
import o.displayInAppMessagelambda1;
import o.drawCachedImageFqjB98A;
import o.getExposureHandlerfwf_client_release;
import o.getHttpClientfwf_client_release;
import o.getSerializerfwf_client_release;
import o.getTimerfwf_client_release;
import o.grantFocus;
import o.hgExternalSyntheticLambda1;
import o.hgExternalSyntheticLambda9;
import o.isIdentityannotations;
import o.onContentCardDismissed;
import o.onImageAvailable;
import o.r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE;
import o.r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeCustomerProfileAttributesfwf_client_release;
import o.syncClientfwf_client_release;
import org.koin.android.ext.koin.KoinExtKt$androidContext$1$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RootViewsSpy$Companion$install$1$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootViewsSpy$Companion$install$1$1(int i, Object obj) {
        super(1);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ScreenCoordinate screenCoordinate = null;
        int i = 0;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                r8lambdaPRM2tcY0gMp3x1zosH4ODWDaM r8lambdaprm2tcy0gmp3x1zosh4odwdam = ((r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE) this.write).IconCompatParcelizer;
                r8lambdaprm2tcy0gmp3x1zosh4odwdam.addAll(arrayList);
                return r8lambdaprm2tcy0gmp3x1zosh4odwdam;
            case 1:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((SingleProcessDataStore) this.write).MediaSessionCompatQueueItem.IconCompatParcelizer(new grantFocus(th));
                }
                Object obj2 = SingleProcessDataStore.RemoteActionCompatParcelizer;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) this.write;
                synchronized (obj2) {
                    SingleProcessDataStore.IconCompatParcelizer.remove(singleProcessDataStore.write().getAbsolutePath());
                }
                return createFromParcel.INSTANCE;
            case 2:
                Exception exc = (Exception) obj;
                exc.getClass();
                CustomerChatModule customerChatModule = (CustomerChatModule) this.write;
                accessgetVcp accessgetvcp = CustomerChatModule.write;
                isIdentityannotations isidentityannotations = ((onImageAvailable) customerChatModule.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper()).serializer;
                if (isidentityannotations != null) {
                    isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "DATASTORE_OPERATION_CACHE_EVENT", "Customer chat configuration cache operation failed", exc);
                }
                return createFromParcel.INSTANCE;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AppQualityScore$enableScreenMetrics$1$1 appQualityScore$enableScreenMetrics$1$1 = ((drawCachedImageFqjB98A) this.write).MediaMetadataCompat;
                if (appQualityScore$enableScreenMetrics$1$1 != null) {
                    appQualityScore$enableScreenMetrics$1$1.IconCompatParcelizer(new ShadowRenderer(zBooleanValue));
                }
                return createFromParcel.INSTANCE;
            case 4:
                ((createInAppMessageEventSubscriber) this.write).IconCompatParcelizer = (Throwable) obj;
                return createFromParcel.INSTANCE;
            case 5:
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write).invoke();
                return createFromParcel.INSTANCE;
            case 6:
                GesturesPlugin gesturesPlugin = (GesturesPlugin) obj;
                gesturesPlugin.getClass();
                hgExternalSyntheticLambda9 hgexternalsyntheticlambda9 = (hgExternalSyntheticLambda9) this.write;
                GesturesPluginImpl gesturesPluginImpl = (GesturesPluginImpl) gesturesPlugin;
                if (!gesturesPluginImpl.checkCleanedUp("addOnMapClickListener")) {
                    gesturesPluginImpl.onMapClickListeners.add(hgexternalsyntheticlambda9);
                }
                return createFromParcel.INSTANCE;
            case 7:
                GesturesPlugin gesturesPlugin2 = (GesturesPlugin) obj;
                gesturesPlugin2.getClass();
                hgExternalSyntheticLambda1 hgexternalsyntheticlambda1 = (hgExternalSyntheticLambda1) this.write;
                GesturesPluginImpl gesturesPluginImpl2 = (GesturesPluginImpl) gesturesPlugin2;
                if (!gesturesPluginImpl2.checkCleanedUp("addOnMoveListener")) {
                    gesturesPluginImpl2.onMoveListeners.add(hgexternalsyntheticlambda1);
                }
                return createFromParcel.INSTANCE;
            case 8:
                GesturesSettings.Builder builder = (GesturesSettings.Builder) obj;
                builder.getClass();
                TypedArray typedArray = (TypedArray) this.write;
                builder.rotateEnabled = typedArray.getBoolean(43, true);
                builder.pinchToZoomEnabled = typedArray.getBoolean(39, true);
                builder.scrollEnabled = typedArray.getBoolean(45, true);
                builder.simultaneousRotateAndPinchToZoomEnabled = typedArray.getBoolean(47, true);
                builder.pitchEnabled = typedArray.getBoolean(40, true);
                ScrollMode scrollMode = ScrollMode.values()[typedArray.getInt(46, ScrollMode.HORIZONTAL_AND_VERTICAL.ordinal())];
                scrollMode.getClass();
                builder.scrollMode = scrollMode;
                builder.doubleTapToZoomInEnabled = typedArray.getBoolean(31, true);
                builder.doubleTouchToZoomOutEnabled = typedArray.getBoolean(32, true);
                builder.quickZoomEnabled = typedArray.getBoolean(41, true);
                if (typedArray.hasValue(33) && typedArray.hasValue(34)) {
                    screenCoordinate = new ScreenCoordinate(typedArray.getFloat(33, 0.0f), typedArray.getFloat(34, 0.0f));
                }
                builder.focalPoint = screenCoordinate;
                builder.pinchToZoomDecelerationEnabled = typedArray.getBoolean(38, true);
                builder.rotateDecelerationEnabled = typedArray.getBoolean(42, true);
                builder.scrollDecelerationEnabled = typedArray.getBoolean(44, true);
                builder.increaseRotateThresholdWhenPinchingToZoom = typedArray.getBoolean(36, true);
                builder.increasePinchToZoomThresholdWhenRotating = typedArray.getBoolean(35, true);
                builder.zoomAnimationAmount = typedArray.getFloat(49, 1.0f);
                builder.pinchScrollEnabled = typedArray.getBoolean(37, true);
                builder.useNativeFlingDeceleration = typedArray.getBoolean(48, false);
                return createFromParcel.INSTANCE;
            case 9:
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.getClass();
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.RemoteActionCompatParcelizer((IOException) this.write);
                r8lambdareqvhj3p9oule_afn8an0r0tlg0.read(defaultCardHandlinglambda0.INTERNAL_ERROR);
                return createFromParcel.INSTANCE;
            case 10:
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg1 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
                r8lambdareqvhj3p9oule_afn8an0r0tlg1.getClass();
                List list = (List) this.write;
                if (!list.isEmpty()) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg1.read(onContentCardDismissed.IconCompatParcelizer(list, null, null, null, IconCompatParcelizer.IconCompatParcelizer, 31), "proxies");
                }
                return createFromParcel.INSTANCE;
            case 11:
                r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg2 = (r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) obj;
                r8lambdareqvhj3p9oule_afn8an0r0tlg2.getClass();
                int i2 = ((_get_messageWebView_lambda1) this.write).code;
                r8lambdareqvhj3p9oule_afn8an0r0tlg2.read(Integer.valueOf(i2), "http.response.status_code");
                if (r8lambdareqvhj3p9oule_afn8an0r0tlg2.MediaSessionCompatQueueItem() == null) {
                    r8lambdareqvhj3p9oule_afn8an0r0tlg2.read(defaultCardHandlinglambda0.fromHttpStatusCode(i2));
                }
                return createFromParcel.INSTANCE;
            case 12:
                ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.write).serializer = Long.valueOf(((Number) obj).longValue());
                return createFromParcel.INSTANCE;
            case 13:
                ((ResultReceiver) this.write).IconCompatParcelizer = Long.valueOf(((Number) obj).longValue());
                return createFromParcel.INSTANCE;
            default:
                syncClientfwf_client_release syncclientfwf_client_release = (syncClientfwf_client_release) obj;
                syncclientfwf_client_release.getClass();
                KoinExtKt$androidContext$1$1 koinExtKt$androidContext$1$1 = new KoinExtKt$androidContext$1$1(i, (Context) this.write);
                removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release = FwFClientaddFeatureKeys1.IconCompatParcelizer;
                getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = new getExposureHandlerfwf_client_release(removecustomerprofileattributesfwf_client_release, displayInAppMessagelambda1.serializer(Application.class), null, koinExtKt$androidContext$1$1, getTimerfwf_client_release.Singleton);
                getSerializerfwf_client_release getserializerfwf_client_release = new getSerializerfwf_client_release(getexposurehandlerfwf_client_release);
                syncclientfwf_client_release.read(getserializerfwf_client_release);
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Context.class);
                getexposurehandlerfwf_client_release.MediaMetadataCompat = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getexposurehandlerfwf_client_release.MediaMetadataCompat, (Object) r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer);
                syncclientfwf_client_release.write.put(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, null, removecustomerprofileattributesfwf_client_release), getserializerfwf_client_release);
                return createFromParcel.INSTANCE;
        }
    }
}
