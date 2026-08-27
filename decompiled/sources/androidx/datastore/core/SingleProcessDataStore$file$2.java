package androidx.datastore.core;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.compose.animation.core.Transition;
import androidx.lifecycle.BlockRunner$cancel$1;
import com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl;
import com.deliveryhero.performance.core.calculator.PerformanceClassCalculatorImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.HighLevelAnimatorSet;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.compass.CompassViewPlugin$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.util.write;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import o.LayerSnapshotV21;
import o.LayerSnapshot_androidKt;
import o.ShortNewsContentCardView;
import o.ViewLayerVerificationHelper31;
import o.accessgetLayerOutlinep;
import o.accesssemanticsScrollByd4ec7I;
import o.accesssetDrawInvalidation;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invalidate;
import o.lerpNonNull;
import o.onContentCardDismissed;
import o.onShowTranslationui;
import o.parselambda0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.rebuildOutline;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SingleProcessDataStore$file$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleProcessDataStore$file$2(int i, Object obj) {
        super(0);
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        LayerSnapshot_androidKt layerSnapshot_androidKt;
        rebuildOutline rebuildoutline;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                File file = (File) ((SingleProcessDataStore) this.write).MediaDescriptionCompat.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (SingleProcessDataStore.RemoteActionCompatParcelizer) {
                    LinkedHashSet linkedHashSet = SingleProcessDataStore.IconCompatParcelizer;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return file;
            case 1:
                Transition transition = (Transition) this.write;
                Object objIconCompatParcelizer = transition.MediaSessionCompatToken.IconCompatParcelizer();
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.PostExit;
                return Boolean.valueOf(objIconCompatParcelizer == accesssemanticsscrollbyd4ec7i && ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue() == accesssemanticsscrollbyd4ec7i);
            case 2:
                File file2 = (File) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write).invoke();
                file2.getClass();
                String name = file2.getName();
                name.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', name, "").equals("preferences_pb")) {
                    return file2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.read("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                return null;
            case 3:
                ((StateV3$$ExternalSyntheticLambda0) this.write).invoke();
                return createFromParcel.INSTANCE;
            case 4:
                LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) ((accessgetLayerOutlinep) this.write).serializer).write();
                if (layerSnapshotV21Write == null || (layerSnapshot_androidKt = layerSnapshotV21Write.write) == null || (rebuildoutline = layerSnapshot_androidKt.dhEnvironment) == null) {
                    return "";
                }
                int i = invalidate.read[rebuildoutline.ordinal()];
                if (i == 1) {
                    return "https://helpcenter-ap.usehurrier.com/";
                }
                if (i == 2 || i == 3) {
                    return "https://helpcenter-stg.usehurrier.com/";
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 5:
                return (lerpNonNull) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new BlockRunner$cancel$1((PerformanceClassCalculatorImpl) this.write, shortNewsContentCardView, 21));
            case 6:
                return ((UserPropertiesDataStoreHelperImpl) ((accesssetDrawInvalidation) this.write).serializer).IconCompatParcelizer();
            case 7:
                HashMap map = new HashMap();
                Layer layer = (Layer) this.write;
                map.put("id", new PropertyValue("id", layer.getLayerId()));
                map.put("type", new PropertyValue("type", layer.getType$extension_style_release()));
                String str = layer.internalSourceId;
                if (str != null) {
                    map.put("source", new PropertyValue("source", str));
                }
                return map;
            case 8:
                HashMap map2 = new HashMap();
                map2.put("type", new PropertyValue("type", ((Source) this.write).getType$extension_style_release()));
                return map2;
            case 9:
                MapboxMap mapboxMap = ((CameraAnimationsPluginImpl) this.write).mapCameraManagerDelegate;
                if (mapboxMap != null) {
                    return mapboxMap.getCameraState();
                }
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            case 10:
                ((HighLevelAnimatorSet) this.write).animatorSet.start();
                return createFromParcel.INSTANCE;
            case 11:
                CameraAnimator cameraAnimator = (CameraAnimator) this.write;
                if (cameraAnimator.registered) {
                    cameraAnimator.canceled = false;
                    cameraAnimator.endedManually = false;
                    if (cameraAnimator.getDuration() == 0 && cameraAnimator.getStartDelay() == 0) {
                        ArrayList<Animator.AnimatorListener> listeners = cameraAnimator.getListeners();
                        listeners.getClass();
                        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(listeners);
                        Iterator it = listPlaybackStateCompat.iterator();
                        while (it.hasNext()) {
                            ((Animator.AnimatorListener) it.next()).onAnimationStart(cameraAnimator);
                        }
                        CompassViewPlugin$$ExternalSyntheticLambda0 compassViewPlugin$$ExternalSyntheticLambda0 = cameraAnimator.internalUpdateListener;
                        if (compassViewPlugin$$ExternalSyntheticLambda0 != null) {
                            compassViewPlugin$$ExternalSyntheticLambda0.onAnimationUpdate(cameraAnimator);
                        }
                        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : cameraAnimator.userUpdateListeners) {
                            if (animatorUpdateListener != null) {
                                animatorUpdateListener.onAnimationUpdate(cameraAnimator);
                            }
                        }
                        Iterator it2 = listPlaybackStateCompat.iterator();
                        while (it2.hasNext()) {
                            ((Animator.AnimatorListener) it2.next()).onAnimationEnd(cameraAnimator);
                        }
                    } else {
                        super/*android.animation.ValueAnimator*/.start();
                    }
                } else {
                    MapboxLogger.logW("Mbgl-CameraAnimator", "Animation " + cameraAnimator.getType() + " was not registered and will not run. Register it with registerAnimation() method.");
                }
                return createFromParcel.INSTANCE;
            case 12:
                return (HomeFragment) this.write;
            case 13:
                return (asFrameworkPaint) ((SingleProcessDataStore$file$2) this.write).invoke();
            case 14:
                return (MapboxFragment) this.write;
            case 15:
                return (asFrameworkPaint) ((SingleProcessDataStore$file$2) this.write).invoke();
            default:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new parselambda0(1));
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
                SentryOptions sentryOptions = ((ReplayIntegration) this.write).MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions != null) {
                    return new write(scheduledExecutorServiceNewSingleThreadScheduledExecutor, sentryOptions);
                }
                removeNodeAtDepth.serializer("options");
                throw null;
        }
    }
}
