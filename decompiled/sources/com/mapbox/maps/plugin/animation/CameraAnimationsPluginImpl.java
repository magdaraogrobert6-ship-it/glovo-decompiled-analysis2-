package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda1;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapDelegateProviderImpl$mapAttributionDelegate$2;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.locationcomponent.LocationPuckManager$disablePuckAnimationOnEnd$1;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;
import org.koin.core.instance.SingleInstanceFactory$get$1;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationsPluginImpl implements CameraAnimationsPlugin, MapCameraPlugin {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] $$delegatedProperties;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 anchor$delegate;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 bearing$delegate;
    public CameraAnimatorsFactory cameraAnimationsFactory;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 center$delegate;
    public HighLevelAnimatorSet highLevelAnimatorSet;
    public MapboxMap mapCameraManagerDelegate;
    public MapDelegateProviderImpl mapDelegateProvider;
    public MapboxMap mapTransformDelegate;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 padding$delegate;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 pitch$delegate;
    public final CameraAnimationsPluginImpl$special$$inlined$observable$1 zoom$delegate;
    public final HashSet animators = new HashSet();
    public final LinkedHashSet runningAnimatorsQueue = new LinkedHashSet();
    public final CopyOnWriteArraySet centerListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet zoomListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet paddingListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet anchorListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet bearingListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet pitchListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet lifecycleListeners = new CopyOnWriteArraySet();
    public final List cameraAnimationHintFractions = SQLite.read(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));
    public final CameraOptions.Builder cameraOptionsBuilder = new CameraOptions.Builder();
    public final SingleProcessDataStore$file$2 getCurrentCameraState = new SingleProcessDataStore$file$2(9, this);
    public final LocationPuckManager$disablePuckAnimationOnEnd$1 clearHighLevelAnimatorSetListener = new LocationPuckManager$disablePuckAnimationOnEnd$1(1, this);

    public enum AnimationFinishStatus {
        CANCELED,
        ENDED
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        HashSet hashSet = this.animators;
        Object[] array = hashSet.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        int i = 1;
        unregisterAnimators((ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length), true);
        HighLevelAnimatorSet highLevelAnimatorSet = this.highLevelAnimatorSet;
        if (highLevelAnimatorSet != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new HighLevelAnimatorSet.AnonymousClass1(highLevelAnimatorSet, i));
        }
        this.centerListeners.clear();
        this.zoomListeners.clear();
        this.bearingListeners.clear();
        this.pitchListeners.clear();
        this.anchorListeners.clear();
        this.paddingListeners.clear();
        this.lifecycleListeners.clear();
        hashSet.clear();
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.mapDelegateProvider = mapDelegateProviderImpl;
        this.mapCameraManagerDelegate = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
        this.mapTransformDelegate = (MapboxMap) mapDelegateProviderImpl.mapTransformDelegate;
        MapDelegateProviderImpl mapDelegateProviderImpl2 = this.mapDelegateProvider;
        if (mapDelegateProviderImpl2 != null) {
            this.cameraAnimationsFactory = new CameraAnimatorsFactory(mapDelegateProviderImpl2);
        } else {
            removeNodeAtDepth.serializer("mapDelegateProvider");
            throw null;
        }
    }

    public final Cancelable easeTo(CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, AnimatorListenerAdapter animatorListenerAdapter) {
        cameraOptions.getClass();
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op easeTo camera high-level animation as CameraOptions.isEmpty == true.");
            return new MapboxMap$$ExternalSyntheticLambda1(3);
        }
        CameraAnimatorsFactory cameraAnimationsFactory = getCameraAnimationsFactory();
        HashMap map = CameraAnimatorsFactory.defaultAnimationParameters;
        ArrayList<ValueAnimator> arrayList = new ArrayList();
        CameraState cameraState = cameraAnimationsFactory.mapCameraManagerDelegate.getCameraState();
        Point center = cameraOptions.getCenter();
        boolean z = true;
        if (center != null) {
            Object[] objArrCopyOf = Arrays.copyOf(new Point[]{center}, 1);
            Point center2 = cameraState.getCenter();
            center2.getClass();
            arrayList.add(new CameraCenterAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), center2, null), z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.CENTER)));
        }
        ScreenCoordinate anchor = cameraOptions.getAnchor();
        if (anchor != null) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new ScreenCoordinate[]{anchor}, 1);
            arrayList.add(new CameraAnchorAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), anchor, null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.ANCHOR)));
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            Object[] objArrCopyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
            arrayList.add(new CameraBearingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length), Double.valueOf(cameraState.getBearing()), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.BEARING)));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            Object[] objArrCopyOf4 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
            EdgeInsets padding2 = cameraState.getPadding();
            padding2.getClass();
            arrayList.add(new CameraPaddingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length), padding2, null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.PADDING)));
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            Object[] objArrCopyOf5 = Arrays.copyOf(new Double[]{pitch}, 1);
            arrayList.add(new CameraPitchAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length), Double.valueOf(cameraState.getPitch()), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.PITCH)));
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            Object[] objArrCopyOf6 = Arrays.copyOf(new Double[]{zoom}, 1);
            arrayList.add(new CameraZoomAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf6, objArrCopyOf6.length), Double.valueOf(cameraState.getZoom()), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.ZOOM)));
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (ValueAnimator valueAnimator : arrayList) {
            valueAnimator.getClass();
            arrayList2.add((CameraAnimator) valueAnimator);
        }
        Object[] array = arrayList2.toArray(new CameraAnimator[0]);
        array.getClass();
        return startHighLevelAnimation((CameraAnimator[]) array, mapAnimationOptions, animatorListenerAdapter);
    }

    public final ScreenCoordinate getAnchor() {
        return (ScreenCoordinate) getValue(this, $$delegatedProperties[3]);
    }

    public final void playAnimatorsTogether(ValueAnimator... valueAnimatorArr) {
        if (valueAnimatorArr.length == 0) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op playAnimatorsTogether() as no animators are passed");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            if (valueAnimator instanceof CameraAnimator) {
                CameraAnimator cameraAnimator = (CameraAnimator) valueAnimator;
                cameraAnimator.isInternal = true;
                if (cameraAnimator.owner == null) {
                    cameraAnimator.owner = "Maps-CameraInternal";
                }
                arrayList.add(valueAnimator);
            } else {
                MapboxLogger.logW("Mbgl-CameraManager", "All animators must be CameraAnimator's to be played together!");
            }
        }
        Object[] array = arrayList.toArray(new CameraAnimator[0]);
        array.getClass();
        CameraAnimator[] cameraAnimatorArr = (CameraAnimator[]) array;
        registerAnimators((ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array2 = arrayList.toArray(new CameraAnimator[0]);
        array2.getClass();
        CameraAnimator[] cameraAnimatorArr2 = (CameraAnimator[]) array2;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(cameraAnimatorArr2, cameraAnimatorArr2.length));
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new SearchOptionsKt$validateLimit$1(6, animatorSet));
    }

    public final void setAnchor(ScreenCoordinate screenCoordinate) {
        setValue(this, $$delegatedProperties[3], screenCoordinate);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102 A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:35:0x00fe, B:37:0x0102, B:38:0x0106, B:39:0x010b), top: B:44:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0106 A[Catch: Exception -> 0x010c, TryCatch #0 {Exception -> 0x010c, blocks: (B:35:0x00fe, B:37:0x0102, B:38:0x0106, B:39:0x010b), top: B:44:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void commitChanges() {
        MapboxMap mapboxMap;
        ScreenCoordinate anchor = getAnchor();
        CameraOptions.Builder builder = this.cameraOptionsBuilder;
        CameraOptions cameraOptionsBuild = builder.anchor(anchor).build();
        cameraOptionsBuild.getClass();
        if (!CameraOptionsUtils.isEmpty(cameraOptionsBuild)) {
            if (cameraOptionsBuild.getAnchor() != null) {
                try {
                    mapboxMap = this.mapCameraManagerDelegate;
                    if (mapboxMap != null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.setCamera(cameraOptionsBuild);
                } catch (Exception e) {
                    MapboxLogger.logE("Mbgl-CameraManager", "Exception while setting camera options : " + e.getMessage() + " CameraOptions = " + cameraOptionsBuild);
                }
            } else {
                Double pitch = cameraOptionsBuild.getPitch();
                registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = $$delegatedProperties;
                if (pitch != null) {
                    if (pitch.doubleValue() < 60.0d) {
                        double dDoubleValue = pitch.doubleValue();
                        Double d = (Double) getValue(this, registerinappmessagemanagerlambda2Arr[5]);
                        if (d != null && dDoubleValue == d.doubleValue()) {
                            if (cameraOptionsBuild.getZoom() == null) {
                                if (cameraOptionsBuild.getBearing() != null) {
                                    if (!removeNodeAtDepth.read(cameraOptionsBuild.getBearing(), (Double) getValue(this, registerinappmessagemanagerlambda2Arr[4]))) {
                                        if (cameraOptionsBuild.getCenter() != null) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                                                if (cameraOptionsBuild.getPadding() != null) {
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                                    }
                                                }
                                            }
                                        } else if (cameraOptionsBuild.getPadding() != null) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                            }
                                        }
                                    }
                                } else if (cameraOptionsBuild.getCenter() != null) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                                        if (cameraOptionsBuild.getPadding() != null) {
                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                            }
                                        }
                                    }
                                } else if (cameraOptionsBuild.getPadding() != null) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                    }
                                }
                            } else if (cameraOptionsBuild.getBearing() != null) {
                                if (!removeNodeAtDepth.read(cameraOptionsBuild.getBearing(), (Double) getValue(this, registerinappmessagemanagerlambda2Arr[4]))) {
                                    if (cameraOptionsBuild.getCenter() != null) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                                            if (cameraOptionsBuild.getPadding() != null) {
                                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                                }
                                            }
                                        }
                                    } else if (cameraOptionsBuild.getPadding() != null) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                        }
                                    }
                                }
                            } else if (cameraOptionsBuild.getCenter() != null) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                                    if (cameraOptionsBuild.getPadding() != null) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                        }
                                    }
                                }
                            } else if (cameraOptionsBuild.getPadding() != null) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                }
                            }
                        }
                    }
                    mapboxMap = this.mapCameraManagerDelegate;
                    if (mapboxMap != null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.setCamera(cameraOptionsBuild);
                } else if (cameraOptionsBuild.getZoom() == null && !removeNodeAtDepth.read(cameraOptionsBuild.getZoom(), (Double) getValue(this, registerinappmessagemanagerlambda2Arr[1]))) {
                    mapboxMap = this.mapCameraManagerDelegate;
                    if (mapboxMap != null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.setCamera(cameraOptionsBuild);
                } else if (cameraOptionsBuild.getBearing() != null) {
                    if (!removeNodeAtDepth.read(cameraOptionsBuild.getBearing(), (Double) getValue(this, registerinappmessagemanagerlambda2Arr[4]))) {
                        mapboxMap = this.mapCameraManagerDelegate;
                        if (mapboxMap != null) {
                            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    } else if (cameraOptionsBuild.getCenter() != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                            mapboxMap = this.mapCameraManagerDelegate;
                            if (mapboxMap != null) {
                                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        } else if (cameraOptionsBuild.getPadding() != null) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                                mapboxMap = this.mapCameraManagerDelegate;
                                if (mapboxMap != null) {
                                    removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                    throw null;
                                }
                                mapboxMap.setCamera(cameraOptionsBuild);
                            }
                        }
                    } else if (cameraOptionsBuild.getPadding() != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                            mapboxMap = this.mapCameraManagerDelegate;
                            if (mapboxMap != null) {
                                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        }
                    }
                } else if (cameraOptionsBuild.getCenter() != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getCenter(), (Point) getValue(this, registerinappmessagemanagerlambda2Arr[0])}, getCieXyz.write())).booleanValue()) {
                        mapboxMap = this.mapCameraManagerDelegate;
                        if (mapboxMap != null) {
                            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    } else if (cameraOptionsBuild.getPadding() != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                            mapboxMap = this.mapCameraManagerDelegate;
                            if (mapboxMap != null) {
                                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        }
                    }
                } else if (cameraOptionsBuild.getPadding() != null) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptionsBuild.getPadding(), (EdgeInsets) getValue(this, registerinappmessagemanagerlambda2Arr[2])}, getCieXyz.write())).booleanValue()) {
                        mapboxMap = this.mapCameraManagerDelegate;
                        if (mapboxMap != null) {
                            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    }
                }
            }
        }
        builder.center(null);
        builder.padding(null);
        builder.anchor(null);
        builder.zoom(null);
        builder.bearing(null);
        builder.pitch(null);
    }

    public final void unregisterAnimators(final ValueAnimator[] valueAnimatorArr, final boolean z) {
        AnimationThreadController.INSTANCE.postOnMainThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl.unregisterAnimators.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                ValueAnimator[] valueAnimatorArr2 = valueAnimatorArr;
                for (ValueAnimator valueAnimator : valueAnimatorArr2) {
                    if (!(valueAnimator instanceof CameraAnimator)) {
                        MapboxLogger.logW("Mbgl-CameraManager", "All animators must be CameraAnimator's to be unregistered!");
                        return createFromParcel.INSTANCE;
                    }
                    AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                    final boolean z2 = z;
                    final CameraAnimator cameraAnimator = (CameraAnimator) valueAnimator;
                    animationThreadController.postOnAnimatorThread(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl.unregisterAnimators.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            boolean z3 = z2;
                            CameraAnimator cameraAnimator2 = cameraAnimator;
                            if (z3) {
                                cameraAnimator2.cancel();
                            }
                            cameraAnimator2.removeInternalListener$plugin_animation_release();
                            cameraAnimator2.removeInternalUpdateListener$plugin_animation_release();
                            return createFromParcel.INSTANCE;
                        }
                    });
                }
                HashSet hashSet = this.animators;
                ArrayList arrayList = new ArrayList(valueAnimatorArr2.length);
                for (ValueAnimator valueAnimator2 : valueAnimatorArr2) {
                    valueAnimator2.getClass();
                    arrayList.add((CameraAnimator) valueAnimator2);
                }
                hashSet.removeAll(arrayList);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1] */
    public CameraAnimationsPluginImpl() {
        final int i = 0;
        this.center$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i2 = i;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i2 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i2 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i2 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
        final int i2 = 1;
        this.zoom$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i3 = i2;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i3 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i3 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i3 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
        final int i3 = 2;
        this.padding$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i4 = i3;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i4 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i4 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i4 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i4 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i4 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
        final int i4 = 3;
        this.anchor$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i5 = i4;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i5 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i5 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i5 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
        final int i5 = 4;
        this.bearing$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i6 = i5;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i6 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i6 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i6 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i6 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i6 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
        final int i6 = 5;
        this.pitch$delegate = new ObservableProperty(this) { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$special$$inlined$observable$1
            public final /* synthetic */ CameraAnimationsPluginImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
                this.this$0 = this;
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
                int i7 = i6;
                CameraAnimationsPluginImpl cameraAnimationsPluginImpl = this.this$0;
                if (i7 == 0) {
                    Point point = (Point) obj2;
                    Point point2 = (Point) obj;
                    if (point != null) {
                        int iWrite = getCieXyz.write();
                        int iWrite2 = getCieXyz.write();
                        int iWrite3 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{point2, point}, iWrite3)).booleanValue()) {
                            return;
                        }
                        Iterator it = cameraAnimationsPluginImpl.centerListeners.iterator();
                        while (it.hasNext()) {
                            ((CameraAnimatorChangeListener) it.next()).onChanged(point);
                        }
                        return;
                    }
                    return;
                }
                if (i7 == 1) {
                    Double d = (Double) obj2;
                    Double d2 = (Double) obj;
                    if (d != null) {
                        double dDoubleValue = d.doubleValue();
                        if (removeNodeAtDepth.read(d2, dDoubleValue)) {
                            return;
                        }
                        Iterator it2 = cameraAnimationsPluginImpl.zoomListeners.iterator();
                        while (it2.hasNext()) {
                            ((CameraAnimatorChangeListener) it2.next()).onChanged(Double.valueOf(dDoubleValue));
                        }
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    EdgeInsets edgeInsets = (EdgeInsets) obj2;
                    EdgeInsets edgeInsets2 = (EdgeInsets) obj;
                    if (edgeInsets != null) {
                        int iWrite4 = getCieXyz.write();
                        int iWrite5 = getCieXyz.write();
                        int iWrite6 = getCieXyz.write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{edgeInsets2, edgeInsets}, iWrite6)).booleanValue()) {
                            return;
                        }
                        Iterator it3 = cameraAnimationsPluginImpl.paddingListeners.iterator();
                        while (it3.hasNext()) {
                            ((CameraAnimatorChangeListener) it3.next()).onChanged(edgeInsets);
                        }
                        return;
                    }
                    return;
                }
                if (i7 == 3) {
                    ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                    int iWrite7 = getCieXyz.write();
                    int iWrite8 = getCieXyz.write();
                    int iWrite9 = getCieXyz.write();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite7, 1803334089, -1803334089, getCieXyz.write(), iWrite8, new Object[]{screenCoordinate, (ScreenCoordinate) obj2}, iWrite9)).booleanValue()) {
                        return;
                    }
                    Iterator it4 = cameraAnimationsPluginImpl.anchorListeners.iterator();
                    if (it4.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it4.next());
                        throw null;
                    }
                    return;
                }
                if (i7 != 4) {
                    Double d3 = (Double) obj2;
                    Double d4 = (Double) obj;
                    if (d3 != null) {
                        double dDoubleValue2 = d3.doubleValue();
                        if (removeNodeAtDepth.read(d4, dDoubleValue2)) {
                            return;
                        }
                        Iterator it5 = cameraAnimationsPluginImpl.pitchListeners.iterator();
                        while (it5.hasNext()) {
                            ((CameraAnimatorChangeListener) it5.next()).onChanged(Double.valueOf(dDoubleValue2));
                        }
                        return;
                    }
                    return;
                }
                Double d5 = (Double) obj2;
                Double d6 = (Double) obj;
                if (d5 != null) {
                    double dDoubleValue3 = d5.doubleValue();
                    if (removeNodeAtDepth.read(d6, dDoubleValue3)) {
                        return;
                    }
                    Iterator it6 = cameraAnimationsPluginImpl.bearingListeners.iterator();
                    while (it6.hasNext()) {
                        ((CameraAnimatorChangeListener) it6.next()).onChanged(Double.valueOf(dDoubleValue3));
                    }
                }
            }
        };
    }

    public final void cancelAllAnimators(List list) {
        int i;
        HighLevelAnimatorSet highLevelAnimatorSet;
        list.getClass();
        Iterator it = new HashSet(this.animators).iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            CameraAnimator cameraAnimator = (CameraAnimator) it.next();
            if (!onContentCardDismissed.write(list, cameraAnimator.owner)) {
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new CameraAnimator.C01401(cameraAnimator, 1));
            }
        }
        List list2 = list;
        HighLevelAnimatorSet highLevelAnimatorSet2 = this.highLevelAnimatorSet;
        if (onContentCardDismissed.write(list2, highLevelAnimatorSet2 != null ? highLevelAnimatorSet2.owner : null) || (highLevelAnimatorSet = this.highLevelAnimatorSet) == null) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new HighLevelAnimatorSet.AnonymousClass1(highLevelAnimatorSet, i));
    }

    @Override // com.mapbox.maps.plugin.MapCameraPlugin
    public final void onCameraMove(Point point, EdgeInsets edgeInsets, double d, double d2, double d3) {
        registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = $$delegatedProperties;
        setValue(this, registerinappmessagemanagerlambda2Arr[4], Double.valueOf(d3));
        setValue(this, registerinappmessagemanagerlambda2Arr[0], point);
        setValue(this, registerinappmessagemanagerlambda2Arr[2], edgeInsets);
        setValue(this, registerinappmessagemanagerlambda2Arr[5], Double.valueOf(d2));
        setValue(this, registerinappmessagemanagerlambda2Arr[1], Double.valueOf(d));
    }

    public final void registerAnimators(ValueAnimator... valueAnimatorArr) {
        AnimationThreadController.INSTANCE.postOnMainThread(new SingleInstanceFactory$get$1(valueAnimatorArr, 4, this));
    }

    public final CameraAnimatorsFactory getCameraAnimationsFactory() {
        CameraAnimatorsFactory cameraAnimatorsFactory = this.cameraAnimationsFactory;
        if (cameraAnimatorsFactory != null) {
            return cameraAnimatorsFactory;
        }
        removeNodeAtDepth.serializer("cameraAnimationsFactory");
        throw null;
    }

    public final Cancelable startHighLevelAnimation(CameraAnimator[] cameraAnimatorArr, MapAnimationOptions mapAnimationOptions, Animator.AnimatorListener animatorListener) {
        int i;
        TimeInterpolator timeInterpolator;
        if (cameraAnimatorArr.length == 0) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op camera high-level animation as CameraOptions are empty.");
            return new Cancelable() { // from class: com.mapbox.maps.plugin.animation.CameraAnimationsUtils$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId = 1;

                private final void cancel$com$mapbox$maps$plugin$animation$CameraAnimationsUtils$$ExternalSyntheticLambda0() {
                }

                @Override // com.mapbox.common.Cancelable
                public final void cancel() {
                    if (this.$r8$classId != 0) {
                        registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = CameraAnimationsPluginImpl.$$delegatedProperties;
                    }
                }
            };
        }
        int length = cameraAnimatorArr.length;
        int i2 = 0;
        while (true) {
            i = 1;
            String str = null;
            if (i2 >= length) {
                break;
            }
            CameraAnimator cameraAnimator = cameraAnimatorArr[i2];
            cameraAnimator.isInternal = true;
            if (mapAnimationOptions != null) {
                str = mapAnimationOptions.owner;
            }
            cameraAnimator.owner = str;
            i2++;
        }
        HighLevelAnimatorSet highLevelAnimatorSet = this.highLevelAnimatorSet;
        if (highLevelAnimatorSet != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new HighLevelAnimatorSet.AnonymousClass1(highLevelAnimatorSet, i));
        }
        registerAnimators((ValueAnimator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length));
        AnimatorSet animatorSet = new AnimatorSet();
        if (mapAnimationOptions != null) {
            animatorSet.setDuration(mapAnimationOptions.duration.longValue());
        }
        if (mapAnimationOptions != null && (timeInterpolator = mapAnimationOptions.interpolator) != null) {
            animatorSet.setInterpolator(timeInterpolator);
        }
        AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
        animationThreadController.postOnAnimatorThread(new MapDelegateProviderImpl$mapAttributionDelegate$2(animatorSet, this, animatorListener, i));
        animatorSet.playTogether((Animator[]) Arrays.copyOf(cameraAnimatorArr, cameraAnimatorArr.length));
        CameraAnimationHint cameraAnimationHintCalculateCameraAnimationHint = CameraAnimationsUtils.calculateCameraAnimationHint(animatorSet, this.cameraAnimationHintFractions, null);
        if (cameraAnimationHintCalculateCameraAnimationHint != null) {
            MapboxMap mapboxMap = this.mapTransformDelegate;
            if (mapboxMap == null) {
                removeNodeAtDepth.serializer("mapTransformDelegate");
                throw null;
            }
            mapboxMap.setCameraAnimationHint(cameraAnimationHintCalculateCameraAnimationHint);
        }
        HighLevelAnimatorSet highLevelAnimatorSet2 = new HighLevelAnimatorSet(mapAnimationOptions != null ? mapAnimationOptions.owner : null, animatorSet);
        this.highLevelAnimatorSet = highLevelAnimatorSet2;
        animationThreadController.postOnAnimatorThread(new SingleProcessDataStore$file$2(10, highLevelAnimatorSet2));
        return highLevelAnimatorSet2;
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "center", "getCenter()Lcom/mapbox/geojson/Point;", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        $$delegatedProperties = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "zoom", "getZoom()Ljava/lang/Double;", 0), new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "padding", "getPadding()Lcom/mapbox/maps/EdgeInsets;", 0), new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "anchor", "getAnchor()Lcom/mapbox/maps/ScreenCoordinate;", 0), new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "bearing", "getBearing()Ljava/lang/Double;", 0), new MutablePropertyReference1Impl(CameraAnimationsPluginImpl.class, "pitch", "getPitch()Ljava/lang/Double;", 0)};
    }
}
