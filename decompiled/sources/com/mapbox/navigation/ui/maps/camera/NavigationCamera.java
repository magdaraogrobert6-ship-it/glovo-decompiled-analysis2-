package com.mapbox.navigation.ui.maps.camera;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.sqlite.SQLite;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable$2;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.navigation.ui.maps.camera.data.MapboxNavigationViewportDataSource;
import com.mapbox.navigation.ui.maps.camera.data.ViewportData;
import com.mapbox.navigation.ui.maps.camera.state.NavigationCameraState;
import com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider;
import com.mapbox.navigation.ui.maps.camera.transition.MapboxAnimatorSetEndListener;
import com.mapbox.navigation.ui.maps.camera.transition.MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2;
import com.mapbox.navigation.ui.maps.camera.transition.NavigationCameraTransitionOptions;
import com.mapbox.navigation.ui.maps.camera.utils.MapboxNavigationCameraUtilsKt;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewMode;
import com.mapbox.navigation.ui.maps.internal.camera.OverviewViewportDataSource;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.createFromParcel;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.i9;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class NavigationCamera {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final x animatorsCreator;
    public final CameraAnimationsPlugin cameraPlugin;
    public NavigationCameraTransitionOptions frameTransitionOptions;
    public long lastCameraHintTime;
    public long lastCameraStateLogTime;
    public final MapboxMap mapboxMap;
    public final CopyOnWriteArraySet navigationCameraStateChangedObservers;
    public final OverviewViewportDataSource overviewViewportDataSource;
    public CameraOptions prevFollowingCameraForOverviewAnimationHint;
    public BlockRunner runningAnimation;
    public NavigationCameraState state;
    public final CopyOnWriteArraySet transitionEndListeners;
    public final MapboxNavigationViewportDataSource viewportDataSource;
    public static final NavigationCameraTransitionOptions DEFAULT_STATE_TRANSITION_OPT = new NavigationCameraTransitionOptions(3500);
    public static final NavigationCameraTransitionOptions DEFAULT_FRAME_TRANSITION_OPT = new NavigationCameraTransitionOptions(1000);

    public final class NavigationCameraTransitionListener implements MapboxAnimatorSetEndListener {
        private static int serializer = 0;
        private static int write = 1;
        public final NavigationCameraState finalState;
        public final NavigationCameraTransitionOptions frameTransitionOptions;
        public boolean isCanceled;
        public final NavigationCameraState progressState;
        public final /* synthetic */ NavigationCamera this$0;

        public NavigationCameraTransitionListener(NavigationCamera navigationCamera, NavigationCameraState navigationCameraState, NavigationCameraState navigationCameraState2, NavigationCameraTransitionOptions navigationCameraTransitionOptions) {
            navigationCameraState.getClass();
            navigationCameraState2.getClass();
            this.this$0 = navigationCamera;
            this.progressState = navigationCameraState;
            this.finalState = navigationCameraState2;
            this.frameTransitionOptions = navigationCameraTransitionOptions;
        }

        @Override // com.mapbox.navigation.ui.maps.camera.transition.MapboxAnimatorSetEndListener
        public final void onAnimationEnd(BlockRunner blockRunner) {
            int i = 2 % 2;
            blockRunner.getClass();
            boolean z = this.isCanceled;
            NavigationCamera navigationCamera = this.this$0;
            Object obj = null;
            if (!z) {
                int i2 = write + 61;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    navigationCamera.frameTransitionOptions = this.frameTransitionOptions;
                    navigationCamera.setState(this.finalState);
                    throw null;
                }
                navigationCamera.frameTransitionOptions = this.frameTransitionOptions;
                navigationCamera.setState(this.finalState);
            }
            navigationCamera.getClass();
            CopyOnWriteArraySet copyOnWriteArraySet = navigationCamera.transitionEndListeners;
            if (navigationCamera.runningAnimation == blockRunner) {
                int i3 = serializer + 43;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    navigationCamera.runningAnimation = null;
                    obj.hashCode();
                    throw null;
                }
                navigationCamera.runningAnimation = null;
            }
            Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(copyOnWriteArraySet);
            copyOnWriteArraySet.clear();
            Iterator it = setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.iterator();
            while (it.hasNext()) {
                int i4 = write + 5;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    ((i9) it.next()).read.invoke();
                    throw null;
                }
                ((i9) it.next()).read.invoke();
            }
            navigationCamera.updateFrame(navigationCamera.viewportDataSource.viewportData);
        }
    }

    public NavigationCamera(MapboxMap mapboxMap, CameraAnimationsPlugin cameraAnimationsPlugin, MapboxNavigationViewportDataSource mapboxNavigationViewportDataSource) {
        x xVar = new x(new m(mapboxMap, cameraAnimationsPlugin), cameraAnimationsPlugin, mapboxMap);
        this.mapboxMap = mapboxMap;
        this.cameraPlugin = cameraAnimationsPlugin;
        this.viewportDataSource = mapboxNavigationViewportDataSource;
        this.animatorsCreator = xVar;
        this.transitionEndListeners = new CopyOnWriteArraySet();
        this.frameTransitionOptions = DEFAULT_FRAME_TRANSITION_OPT;
        this.navigationCameraStateChangedObservers = new CopyOnWriteArraySet();
        this.overviewViewportDataSource = mapboxNavigationViewportDataSource.overviewViewportDataSource;
        this.state = NavigationCameraState.IDLE;
        NavigationCamera$$ExternalSyntheticLambda0 navigationCamera$$ExternalSyntheticLambda0 = new NavigationCamera$$ExternalSyntheticLambda0(this);
        mapboxNavigationViewportDataSource.viewportDataSourceUpdateObservers.add(navigationCamera$$ExternalSyntheticLambda0);
        navigationCamera$$ExternalSyntheticLambda0.viewportDataSourceUpdated(mapboxNavigationViewportDataSource.viewportData);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationCameraState.values().length];
            try {
                iArr[NavigationCameraState.TRANSITION_TO_FOLLOWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationCameraState.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationCameraState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationCameraState.TRANSITION_TO_OVERVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavigationCameraState.OVERVIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = write + 67;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r4.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw bo.app.ff$$ExternalSyntheticOutline0.m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r4.hasNext() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setState(com.mapbox.navigation.ui.maps.camera.state.NavigationCameraState r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.mapbox.navigation.ui.maps.camera.state.NavigationCameraState r1 = r3.state
            if (r4 == r1) goto L38
            int r1 = com.mapbox.navigation.ui.maps.camera.NavigationCamera.read
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.mapbox.navigation.ui.maps.camera.NavigationCamera.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L24
            r3.state = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.navigationCameraStateChangedObservers
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            r2 = 3
            int r2 = r2 / 0
            if (r1 != 0) goto L33
            goto L38
        L24:
            r3.state = r4
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.navigationCameraStateChangedObservers
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L33
            goto L38
        L33:
            java.lang.ClassCastException r4 = bo.app.ff$$ExternalSyntheticOutline0.m(r4)
            throw r4
        L38:
            int r4 = com.mapbox.navigation.ui.maps.camera.NavigationCamera.read
            int r4 = r4 + 9
            int r1 = r4 % 128
            com.mapbox.navigation.ui.maps.camera.NavigationCamera.IconCompatParcelizer = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L44
            return
        L44:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.camera.NavigationCamera.setState(com.mapbox.navigation.ui.maps.camera.state.NavigationCameraState):void");
    }

    public static void requestNavigationCameraToFollowing$default(NavigationCamera navigationCamera) {
        int i = 2 % 2;
        navigationCamera.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[navigationCamera.state.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            int i4 = read;
            int i5 = i4 + 111;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    int i7 = i4 + 117;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i2 != 4 && i2 != 5) {
                        return;
                    }
                }
                ViewportData viewportData = navigationCamera.viewportDataSource.viewportData;
                x xVar = navigationCamera.animatorsCreator;
                CameraOptions cameraOptions = viewportData.cameraForFollowing;
                xVar.getClass();
                CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
                MapboxMap mapboxMap = (MapboxMap) xVar.IconCompatParcelizer;
                AnimatorSet animatorSetTransitionFromLowZoomToHighZoom = ((x) ((m) xVar.read).read).transitionFromLowZoomToHighZoom(cameraOptions, DEFAULT_STATE_TRANSITION_OPT);
                BlockRunner blockRunner = new BlockRunner(cameraAnimationsPlugin, mapboxMap, animatorSetTransitionFromLowZoomToHighZoom);
                animatorSetTransitionFromLowZoomToHighZoom.addListener(new CircularProgressDrawable$2(new NavigationCameraTransitionListener(navigationCamera, NavigationCameraState.TRANSITION_TO_FOLLOWING, NavigationCameraState.FOLLOWING, DEFAULT_FRAME_TRANSITION_OPT), i3, blockRunner));
                navigationCamera.startAnimation(blockRunner, null);
                int i9 = IconCompatParcelizer + 45;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 androidx.lifecycle.BlockRunner) = (r1v4 androidx.lifecycle.BlockRunner), (r1v17 androidx.lifecycle.BlockRunner) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public final void startAnimation(BlockRunner blockRunner, i9 i9Var) {
        BlockRunner blockRunner2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            blockRunner2 = this.runningAnimation;
            int i3 = 37 / 0;
            if (blockRunner2 != null) {
                ((AnimatorSet) blockRunner2.RatingCompat).cancel();
                CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) blockRunner2.read;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) blockRunner2.RemoteActionCompatParcelizer;
                ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).unregisterAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), false);
            }
        } else {
            blockRunner2 = this.runningAnimation;
            if (blockRunner2 != null) {
                ((AnimatorSet) blockRunner2.RatingCompat).cancel();
                CameraAnimationsPlugin cameraAnimationsPlugin2 = (CameraAnimationsPlugin) blockRunner2.read;
                ValueAnimator[] valueAnimatorArr2 = (ValueAnimator[]) blockRunner2.RemoteActionCompatParcelizer;
                ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).unregisterAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr2, valueAnimatorArr2.length), false);
            }
        }
        this.runningAnimation = null;
        if (i9Var != null) {
            this.transitionEndListeners.add(i9Var);
        }
        ((CameraAnimationsPluginImpl) this.cameraPlugin).setAnchor(null);
        CameraAnimationsPlugin cameraAnimationsPlugin3 = (CameraAnimationsPlugin) blockRunner.read;
        ValueAnimator[] valueAnimatorArr3 = (ValueAnimator[]) blockRunner.RemoteActionCompatParcelizer;
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin3).registerAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr3, valueAnimatorArr3.length));
        List list = (List) blockRunner.write;
        AnimatorSet animatorSet = (AnimatorSet) blockRunner.RatingCompat;
        MapboxMap mapboxMap = (MapboxMap) blockRunner.serializer;
        CameraAnimationHint cameraAnimationHintCalculateCameraAnimationHint = CameraAnimationsUtils.calculateCameraAnimationHint(animatorSet, list, mapboxMap.getCameraState());
        if (cameraAnimationHintCalculateCameraAnimationHint != null) {
            int i4 = IconCompatParcelizer + 9;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            mapboxMap.setCameraAnimationHint(cameraAnimationHintCalculateCameraAnimationHint);
        }
        animatorSet.start();
        this.runningAnimation = blockRunner;
        int i6 = IconCompatParcelizer + 63;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0127  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x020c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0217  */
    /* JADX WARN: Code duplicated, block: B:63:0x0237  */
    /* JADX WARN: Code duplicated, block: B:68:0x0243  */
    /* JADX WARN: Code duplicated, block: B:70:0x024e  */
    /* JADX WARN: Code duplicated, block: B:73:0x025e  */
    /* JADX WARN: Code duplicated, block: B:75:0x026d A[PHI: r7 r14
  0x026d: PHI (r7v7 long) = (r7v6 long), (r7v18 long) binds: [B:74:0x026b, B:71:0x025b] A[DONT_GENERATE, DONT_INLINE]
  0x026d: PHI (r14v5 long) = (r14v4 long), (r14v6 long) binds: [B:74:0x026b, B:71:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0281 A[LOOP:1: B:76:0x027b->B:78:0x0281, LOOP_END] */
    public static void requestNavigationCameraToOverview$default(NavigationCamera navigationCamera, i9 i9Var) {
        double zoom;
        Double zoom2;
        double dDoubleValue;
        x xVar;
        CameraAnimationsPlugin cameraAnimationsPlugin;
        ArrayList arrayList;
        Point center;
        Double zoom3;
        Double bearing;
        Double pitch;
        EdgeInsets padding;
        AnimatorSet animatorSetCreateAnimatorSet;
        Iterator<T> it;
        Animator animator;
        AnimatorSet animatorSetTransitionFromLowZoomToHighZoom;
        int i;
        long j;
        long startDelay;
        double d;
        long duration;
        Object next;
        long duration2;
        BlockRunner blockRunner;
        int i2 = 2 % 2;
        navigationCamera.getClass();
        int i3 = WhenMappings.$EnumSwitchMapping$0[navigationCamera.state.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            int i5 = read + 45;
            int i6 = i5 % Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            if (i5 % 2 != 0 ? i3 != 2 : i3 != 3) {
                if (i3 != 3) {
                    int i7 = i6 + 3;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (i3 == 4) {
                        navigationCamera.transitionEndListeners.add(i9Var);
                        return;
                    }
                    if (i3 != 5) {
                        int i9 = i6 + 79;
                        read = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        return;
                    } else {
                        i9Var.read.invoke();
                        int i11 = read + 97;
                        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        return;
                    }
                }
            }
        }
        x xVar2 = navigationCamera.animatorsCreator;
        CameraOptions cameraOptions = navigationCamera.viewportDataSource.viewportData.cameraForOverview;
        OverviewViewportDataSource overviewViewportDataSource = navigationCamera.overviewViewportDataSource;
        Object next2 = null;
        if (overviewViewportDataSource != null) {
            int i13 = IconCompatParcelizer + 69;
            read = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                OverviewMode overviewMode = overviewViewportDataSource.internalOptions.overviewMode;
                OverviewMode overviewMode2 = OverviewMode.POINTS;
                next2.hashCode();
                throw null;
            }
            if (overviewViewportDataSource.internalOptions.overviewMode == OverviewMode.POINTS) {
                xVar2.getClass();
                cameraOptions.getClass();
                CameraAnimationsPlugin cameraAnimationsPlugin2 = (CameraAnimationsPlugin) xVar2.RemoteActionCompatParcelizer;
                MapboxMap mapboxMap = (MapboxMap) xVar2.IconCompatParcelizer;
                Point center2 = mapboxMap.getCameraState().getCenter();
                center2.getClass();
                Point center3 = cameraOptions.getCenter();
                CameraAnimator[] flyTo = ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).getCameraAnimationsFactory().getFlyTo(cameraOptions, "NAVIGATION_CAMERA_OWNER");
                long jMin = Math.min(center3 != null ? RangesKt.IconCompatParcelizer(MathKt.read((Math.log(TuplesKt.distance(center3, center2, "kilometers")) * 500.0d) + 200.0d), 1500L, 4000L) : 4000L, 3500L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether((Animator[]) Arrays.copyOf(flyTo, flyTo.length));
                animatorSet.setDuration(jMin);
                blockRunner = new BlockRunner(cameraAnimationsPlugin2, mapboxMap, animatorSet);
            } else {
                xVar2.getClass();
                cameraOptions.getClass();
                CameraAnimationsPlugin cameraAnimationsPlugin3 = (CameraAnimationsPlugin) xVar2.RemoteActionCompatParcelizer;
                MapboxMap mapboxMap2 = (MapboxMap) xVar2.IconCompatParcelizer;
                m mVar = (m) xVar2.read;
                zoom = ((MapboxMap) mVar.RemoteActionCompatParcelizer).getCameraState().getZoom();
                zoom2 = cameraOptions.getZoom();
                if (zoom2 == null) {
                    zoom2 = Double.valueOf(zoom);
                }
                dDoubleValue = zoom2.doubleValue();
                xVar = (x) mVar.read;
                if (zoom < dDoubleValue) {
                    animatorSetTransitionFromLowZoomToHighZoom = xVar.transitionFromLowZoomToHighZoom(cameraOptions, DEFAULT_STATE_TRANSITION_OPT);
                } else {
                    cameraAnimationsPlugin = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
                    arrayList = new ArrayList();
                    center = cameraOptions.getCenter();
                    if (center != null) {
                        Object[] objArrCopyOf = Arrays.copyOf(new Point[]{center}, 1);
                        CameraAnimatorOptions cameraAnimatorOptions = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), null, "NAVIGATION_CAMERA_OWNER");
                        MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$1;
                        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                        arrayList.add(new CameraCenterAnimator(cameraAnimatorOptions, false, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2));
                    }
                    zoom3 = cameraOptions.getZoom();
                    if (zoom3 != null) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(new Double[]{zoom3}, 1);
                        CameraAnimatorOptions cameraAnimatorOptions2 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), null, "NAVIGATION_CAMERA_OWNER");
                        MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$3 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE;
                        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                        arrayList.add(new CameraZoomAnimator(cameraAnimatorOptions2, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$3));
                    }
                    bearing = cameraOptions.getBearing();
                    if (bearing != null) {
                        CameraAnimationsPlugin cameraAnimationsPlugin4 = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
                        Object[] objArrCopyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
                        arrayList.add(TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin4, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length), null, "NAVIGATION_CAMERA_OWNER"), MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$2));
                    }
                    pitch = cameraOptions.getPitch();
                    if (pitch != null) {
                        Object[] objArrCopyOf4 = Arrays.copyOf(new Double[]{pitch}, 1);
                        CameraAnimatorOptions cameraAnimatorOptions3 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length), null, "NAVIGATION_CAMERA_OWNER");
                        MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$4 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$3;
                        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                        arrayList.add(new CameraPitchAnimator(cameraAnimatorOptions3, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$4));
                    }
                    padding = cameraOptions.getPadding();
                    if (padding != null) {
                        Object[] objArrCopyOf5 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
                        CameraAnimatorOptions cameraAnimatorOptions4 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length), null, "NAVIGATION_CAMERA_OWNER");
                        MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$5 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$4;
                        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                        arrayList.add(new CameraPaddingAnimator(cameraAnimatorOptions4, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$5));
                    }
                    animatorSetCreateAnimatorSet = MapboxNavigationCameraUtilsKt.createAnimatorSet(arrayList);
                    ArrayList<Animator> childAnimations = animatorSetCreateAnimatorSet.getChildAnimations();
                    childAnimations.getClass();
                    it = childAnimations.iterator();
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (it.hasNext()) {
                            Animator animator2 = (Animator) next2;
                            duration = animator2.getDuration() + animator2.getStartDelay();
                            do {
                                next = it.next();
                                Animator animator3 = (Animator) next;
                                duration2 = animator3.getDuration() + animator3.getStartDelay();
                                if (duration < duration2) {
                                    next2 = next;
                                    duration = duration2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    animator = (Animator) next2;
                    if (animator != null) {
                        i = IconCompatParcelizer + 89;
                        read = i % Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            startDelay = animator.getStartDelay() | animator.getDuration();
                            j = 3500;
                            if (startDelay > 3500) {
                                d = j / startDelay;
                                ArrayList<Animator> childAnimations2 = animatorSetCreateAnimatorSet.getChildAnimations();
                                childAnimations2.getClass();
                                for (Animator animator4 : childAnimations2) {
                                    animator4.setStartDelay((long) (animator4.getStartDelay() * d));
                                    animator4.setDuration((long) (animator4.getDuration() * d));
                                }
                            }
                        } else {
                            j = 3500;
                            startDelay = animator.getStartDelay() + animator.getDuration();
                            if (startDelay > 3500) {
                                d = j / startDelay;
                                ArrayList<Animator> childAnimations3 = animatorSetCreateAnimatorSet.getChildAnimations();
                                childAnimations3.getClass();
                                while (r2.hasNext()) {
                                    animator4.setStartDelay((long) (animator4.getStartDelay() * d));
                                    animator4.setDuration((long) (animator4.getDuration() * d));
                                }
                            }
                        }
                    }
                    animatorSetTransitionFromLowZoomToHighZoom = animatorSetCreateAnimatorSet;
                }
                blockRunner = new BlockRunner(cameraAnimationsPlugin3, mapboxMap2, animatorSetTransitionFromLowZoomToHighZoom);
            }
        } else {
            xVar2.getClass();
            cameraOptions.getClass();
            CameraAnimationsPlugin cameraAnimationsPlugin5 = (CameraAnimationsPlugin) xVar2.RemoteActionCompatParcelizer;
            MapboxMap mapboxMap3 = (MapboxMap) xVar2.IconCompatParcelizer;
            m mVar2 = (m) xVar2.read;
            zoom = ((MapboxMap) mVar2.RemoteActionCompatParcelizer).getCameraState().getZoom();
            zoom2 = cameraOptions.getZoom();
            if (zoom2 == null) {
                zoom2 = Double.valueOf(zoom);
            }
            dDoubleValue = zoom2.doubleValue();
            xVar = (x) mVar2.read;
            if (zoom < dDoubleValue) {
                animatorSetTransitionFromLowZoomToHighZoom = xVar.transitionFromLowZoomToHighZoom(cameraOptions, DEFAULT_STATE_TRANSITION_OPT);
            } else {
                cameraAnimationsPlugin = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
                arrayList = new ArrayList();
                center = cameraOptions.getCenter();
                if (center != null) {
                    Object[] objArrCopyOf6 = Arrays.copyOf(new Point[]{center}, 1);
                    CameraAnimatorOptions cameraAnimatorOptions5 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf6, objArrCopyOf6.length), null, "NAVIGATION_CAMERA_OWNER");
                    MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$6 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$1;
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                    arrayList.add(new CameraCenterAnimator(cameraAnimatorOptions5, false, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$6));
                }
                zoom3 = cameraOptions.getZoom();
                if (zoom3 != null) {
                    Object[] objArrCopyOf7 = Arrays.copyOf(new Double[]{zoom3}, 1);
                    CameraAnimatorOptions cameraAnimatorOptions6 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf7, objArrCopyOf7.length), null, "NAVIGATION_CAMERA_OWNER");
                    MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$7 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE;
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                    arrayList.add(new CameraZoomAnimator(cameraAnimatorOptions6, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$7));
                }
                bearing = cameraOptions.getBearing();
                if (bearing != null) {
                    CameraAnimationsPlugin cameraAnimationsPlugin6 = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
                    Object[] objArrCopyOf8 = Arrays.copyOf(new Double[]{bearing}, 1);
                    arrayList.add(TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin6, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf8, objArrCopyOf8.length), null, "NAVIGATION_CAMERA_OWNER"), MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$2));
                }
                pitch = cameraOptions.getPitch();
                if (pitch != null) {
                    Object[] objArrCopyOf9 = Arrays.copyOf(new Double[]{pitch}, 1);
                    CameraAnimatorOptions cameraAnimatorOptions7 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf9, objArrCopyOf9.length), null, "NAVIGATION_CAMERA_OWNER");
                    MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$8 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$3;
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                    arrayList.add(new CameraPitchAnimator(cameraAnimatorOptions7, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$8));
                }
                padding = cameraOptions.getPadding();
                if (padding != null) {
                    Object[] objArrCopyOf10 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
                    CameraAnimatorOptions cameraAnimatorOptions8 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf10, objArrCopyOf10.length), null, "NAVIGATION_CAMERA_OWNER");
                    MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2 mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$9 = MapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$2.INSTANCE$4;
                    ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
                    arrayList.add(new CameraPaddingAnimator(cameraAnimatorOptions8, mapboxNavigationCameraTransition$transitionFromHighZoomToLowZoom$2$zoomAnimator$9));
                }
                animatorSetCreateAnimatorSet = MapboxNavigationCameraUtilsKt.createAnimatorSet(arrayList);
                ArrayList<Animator> childAnimations4 = animatorSetCreateAnimatorSet.getChildAnimations();
                childAnimations4.getClass();
                it = childAnimations4.iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        Animator animator5 = (Animator) next2;
                        duration = animator5.getDuration() + animator5.getStartDelay();
                        do {
                            next = it.next();
                            Animator animator6 = (Animator) next;
                            duration2 = animator6.getDuration() + animator6.getStartDelay();
                            if (duration < duration2) {
                                next2 = next;
                                duration = duration2;
                            }
                        } while (it.hasNext());
                    }
                }
                animator = (Animator) next2;
                if (animator != null) {
                    i = IconCompatParcelizer + 89;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        startDelay = animator.getStartDelay() | animator.getDuration();
                        j = 3500;
                        if (startDelay > 3500) {
                            d = j / startDelay;
                            ArrayList<Animator> childAnimations5 = animatorSetCreateAnimatorSet.getChildAnimations();
                            childAnimations5.getClass();
                            while (r2.hasNext()) {
                                animator4.setStartDelay((long) (animator4.getStartDelay() * d));
                                animator4.setDuration((long) (animator4.getDuration() * d));
                            }
                        }
                    } else {
                        j = 3500;
                        startDelay = animator.getStartDelay() + animator.getDuration();
                        if (startDelay > 3500) {
                            d = j / startDelay;
                            ArrayList<Animator> childAnimations6 = animatorSetCreateAnimatorSet.getChildAnimations();
                            childAnimations6.getClass();
                            while (r2.hasNext()) {
                                animator4.setStartDelay((long) (animator4.getStartDelay() * d));
                                animator4.setDuration((long) (animator4.getDuration() * d));
                            }
                        }
                    }
                }
                animatorSetTransitionFromLowZoomToHighZoom = animatorSetCreateAnimatorSet;
            }
            blockRunner = new BlockRunner(cameraAnimationsPlugin5, mapboxMap3, animatorSetTransitionFromLowZoomToHighZoom);
        }
        ((AnimatorSet) blockRunner.RatingCompat).addListener(new CircularProgressDrawable$2(new NavigationCameraTransitionListener(navigationCamera, NavigationCameraState.TRANSITION_TO_OVERVIEW, NavigationCameraState.OVERVIEW, DEFAULT_FRAME_TRANSITION_OPT), i4, blockRunner));
        navigationCamera.startAnimation(blockRunner, i9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateFrame(ViewportData viewportData) {
        ArrayList arrayList;
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        x xVar = this.animatorsCreator;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        final long j = 1000;
        final int i4 = 1;
        if (i3 == 2) {
            CameraOptions cameraOptions = viewportData.cameraForFollowing;
            NavigationCameraTransitionOptions navigationCameraTransitionOptions = this.frameTransitionOptions;
            xVar.getClass();
            navigationCameraTransitionOptions.getClass();
            CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
            MapboxMap mapboxMap = (MapboxMap) xVar.IconCompatParcelizer;
            x xVar2 = (x) ((m) xVar.read).read;
            xVar2.getClass();
            DefaultSimplifiedUpdateFrameTransitionProvider defaultSimplifiedUpdateFrameTransitionProvider = (DefaultSimplifiedUpdateFrameTransitionProvider) xVar2.IconCompatParcelizer;
            defaultSimplifiedUpdateFrameTransitionProvider.getClass();
            ArrayList arrayList2 = new ArrayList();
            long j2 = navigationCameraTransitionOptions.maxDuration;
            j = 1000 > j2 ? j2 : 1000L;
            Point center = cameraOptions.getCenter();
            if (center != null) {
                Object[] objArrCopyOf = Arrays.copyOf(new Point[]{center}, 1);
                arrayList2.add(new CameraCenterAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), null, "NAVIGATION_CAMERA_OWNER"), objArr2 == true ? 1 : 0, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        long j3 = j;
                        if (i5 == 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) obj;
                            valueAnimator.getClass();
                            valueAnimator.setDuration(j3);
                            valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i5 == 1) {
                            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                            valueAnimator2.getClass();
                            valueAnimator2.setDuration(j3);
                            valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i5 == 2) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                            valueAnimator3.getClass();
                            valueAnimator3.setDuration(j3);
                            valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i5 != 3) {
                            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                            valueAnimator4.getClass();
                            valueAnimator4.setDuration(j3);
                            valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                        valueAnimator5.getClass();
                        valueAnimator5.setDuration(j3);
                        valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                }));
                int i5 = IconCompatParcelizer + 39;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            Double zoom = cameraOptions.getZoom();
            if (zoom != null) {
                Object[] objArrCopyOf2 = Arrays.copyOf(new Double[]{zoom}, 1);
                CameraAnimatorOptions cameraAnimatorOptions = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), null, "NAVIGATION_CAMERA_OWNER");
                final Object[] objArr4 = objArr == true ? 1 : 0;
                arrayList2.add(new CameraZoomAnimator(cameraAnimatorOptions, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i7 = objArr4;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        long j3 = j;
                        if (i7 == 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) obj;
                            valueAnimator.getClass();
                            valueAnimator.setDuration(j3);
                            valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 == 1) {
                            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                            valueAnimator2.getClass();
                            valueAnimator2.setDuration(j3);
                            valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 == 2) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                            valueAnimator3.getClass();
                            valueAnimator3.setDuration(j3);
                            valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 != 3) {
                            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                            valueAnimator4.getClass();
                            valueAnimator4.setDuration(j3);
                            valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                        valueAnimator5.getClass();
                        valueAnimator5.setDuration(j3);
                        valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                }));
            }
            Double bearing = cameraOptions.getBearing();
            if (bearing != null) {
                CameraAnimationsPlugin cameraAnimationsPlugin2 = defaultSimplifiedUpdateFrameTransitionProvider.cameraPlugin;
                Object[] objArrCopyOf3 = Arrays.copyOf(new Double[]{bearing}, 1);
                arrayList2.add(TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin2, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i7 = i;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        long j3 = j;
                        if (i7 == 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) obj;
                            valueAnimator.getClass();
                            valueAnimator.setDuration(j3);
                            valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 == 1) {
                            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                            valueAnimator2.getClass();
                            valueAnimator2.setDuration(j3);
                            valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 == 2) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                            valueAnimator3.getClass();
                            valueAnimator3.setDuration(j3);
                            valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i7 != 3) {
                            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                            valueAnimator4.getClass();
                            valueAnimator4.setDuration(j3);
                            valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                        valueAnimator5.getClass();
                        valueAnimator5.setDuration(j3);
                        valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                }));
            }
            Double pitch = cameraOptions.getPitch();
            if (pitch != null) {
                Object[] objArrCopyOf4 = Arrays.copyOf(new Double[]{pitch}, 1);
                final int i7 = 3;
                arrayList2.add(new CameraPitchAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i8 = i7;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        long j3 = j;
                        if (i8 == 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) obj;
                            valueAnimator.getClass();
                            valueAnimator.setDuration(j3);
                            valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i8 == 1) {
                            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                            valueAnimator2.getClass();
                            valueAnimator2.setDuration(j3);
                            valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i8 == 2) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                            valueAnimator3.getClass();
                            valueAnimator3.setDuration(j3);
                            valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i8 != 3) {
                            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                            valueAnimator4.getClass();
                            valueAnimator4.setDuration(j3);
                            valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                        valueAnimator5.getClass();
                        valueAnimator5.setDuration(j3);
                        valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                }));
            }
            EdgeInsets padding = cameraOptions.getPadding();
            if (padding != null) {
                Object[] objArrCopyOf5 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
                final int i8 = 4;
                arrayList2.add(new CameraPaddingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i9 = i8;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        long j3 = j;
                        if (i9 == 0) {
                            ValueAnimator valueAnimator = (ValueAnimator) obj;
                            valueAnimator.getClass();
                            valueAnimator.setDuration(j3);
                            valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i9 == 1) {
                            ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                            valueAnimator2.getClass();
                            valueAnimator2.setDuration(j3);
                            valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i9 == 2) {
                            ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                            valueAnimator3.getClass();
                            valueAnimator3.setDuration(j3);
                            valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        if (i9 != 3) {
                            ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                            valueAnimator4.getClass();
                            valueAnimator4.setDuration(j3);
                            valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                            return createfromparcel;
                        }
                        ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                        valueAnimator5.getClass();
                        valueAnimator5.setDuration(j3);
                        valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                }));
            }
            BlockRunner blockRunner = new BlockRunner(cameraAnimationsPlugin, mapboxMap, MapboxNavigationCameraUtilsKt.createAnimatorSet(arrayList2));
            ((CopyOnWriteArrayList) blockRunner.IconCompatParcelizer).add(new MapboxAnimatorSetEndListener() { // from class: com.mapbox.navigation.ui.maps.camera.NavigationCamera$createFrameListener$1
                @Override // com.mapbox.navigation.ui.maps.camera.transition.MapboxAnimatorSetEndListener
                public final void onAnimationEnd(BlockRunner blockRunner2) {
                    blockRunner2.getClass();
                    NavigationCamera navigationCamera = this.this$0;
                    if (navigationCamera.runningAnimation == blockRunner2) {
                        navigationCamera.runningAnimation = null;
                    }
                }
            });
            startAnimation(blockRunner, null);
            int i9 = read + 41;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i10 = IconCompatParcelizer + 3;
        read = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            if (i3 != 5) {
                return;
            }
        } else if (i3 != 5) {
            return;
        }
        CameraOptions cameraOptions2 = viewportData.cameraForFollowing;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastCameraHintTime >= 1000) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.prevFollowingCameraForOverviewAnimationHint, cameraOptions2}, getCieXyz.write())).booleanValue()) {
                this.lastCameraHintTime = jElapsedRealtime;
                this.prevFollowingCameraForOverviewAnimationHint = cameraOptions2;
                LoggerProviderKt.logI("Applying camera hint for the target camera state = " + cameraOptions2, "NavigationCamera");
                CameraAnimationHint cameraAnimationHintBuild = new CameraAnimationHint.Builder().stages((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new CameraAnimationHintStage.Builder().camera(cameraOptions2).progress(1L).build()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer())).build();
                cameraAnimationHintBuild.getClass();
                this.mapboxMap.setCameraAnimationHint(cameraAnimationHintBuild);
            }
        }
        CameraOptions cameraOptions3 = viewportData.cameraForOverview;
        NavigationCameraTransitionOptions navigationCameraTransitionOptions2 = this.frameTransitionOptions;
        xVar.getClass();
        cameraOptions3.getClass();
        navigationCameraTransitionOptions2.getClass();
        CameraAnimationsPlugin cameraAnimationsPlugin3 = (CameraAnimationsPlugin) xVar.RemoteActionCompatParcelizer;
        MapboxMap mapboxMap2 = (MapboxMap) xVar.IconCompatParcelizer;
        x xVar3 = (x) ((m) xVar.read).read;
        xVar3.getClass();
        DefaultSimplifiedUpdateFrameTransitionProvider defaultSimplifiedUpdateFrameTransitionProvider2 = (DefaultSimplifiedUpdateFrameTransitionProvider) xVar3.IconCompatParcelizer;
        defaultSimplifiedUpdateFrameTransitionProvider2.getClass();
        ArrayList arrayList3 = new ArrayList();
        long j3 = navigationCameraTransitionOptions2.maxDuration;
        if (1000 > j3) {
            j = j3;
        } else {
            int i11 = IconCompatParcelizer + 71;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        Point center2 = cameraOptions3.getCenter();
        if (center2 != null) {
            Object[] objArrCopyOf6 = Arrays.copyOf(new Point[]{center2}, 1);
            CameraCenterAnimator cameraCenterAnimator = new CameraCenterAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf6, objArrCopyOf6.length), null, "NAVIGATION_CAMERA_OWNER"), z, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i13 = i4;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    long j4 = j;
                    if (i13 == 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) obj;
                        valueAnimator.getClass();
                        valueAnimator.setDuration(j4);
                        valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 1) {
                        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                        valueAnimator2.getClass();
                        valueAnimator2.setDuration(j4);
                        valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 2) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                        valueAnimator3.getClass();
                        valueAnimator3.setDuration(j4);
                        valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 != 3) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                        valueAnimator4.getClass();
                        valueAnimator4.setDuration(j4);
                        valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                    valueAnimator5.getClass();
                    valueAnimator5.setDuration(j4);
                    valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                    return createfromparcel;
                }
            });
            arrayList = arrayList3;
            arrayList.add(cameraCenterAnimator);
        } else {
            arrayList = arrayList3;
        }
        Double zoom2 = cameraOptions3.getZoom();
        if (zoom2 != null) {
            Object[] objArrCopyOf7 = Arrays.copyOf(new Double[]{zoom2}, 1);
            CameraAnimatorOptions cameraAnimatorOptions2 = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf7, objArrCopyOf7.length), null, "NAVIGATION_CAMERA_OWNER");
            final Object[] objArr5 = objArr3 == true ? 1 : 0;
            arrayList.add(new CameraZoomAnimator(cameraAnimatorOptions2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i13 = objArr5;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    long j4 = j;
                    if (i13 == 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) obj;
                        valueAnimator.getClass();
                        valueAnimator.setDuration(j4);
                        valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 1) {
                        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                        valueAnimator2.getClass();
                        valueAnimator2.setDuration(j4);
                        valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 2) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                        valueAnimator3.getClass();
                        valueAnimator3.setDuration(j4);
                        valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 != 3) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                        valueAnimator4.getClass();
                        valueAnimator4.setDuration(j4);
                        valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                    valueAnimator5.getClass();
                    valueAnimator5.setDuration(j4);
                    valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                    return createfromparcel;
                }
            }));
        }
        Double bearing2 = cameraOptions3.getBearing();
        if (bearing2 != null) {
            CameraAnimationsPlugin cameraAnimationsPlugin4 = defaultSimplifiedUpdateFrameTransitionProvider2.cameraPlugin;
            Object[] objArrCopyOf8 = Arrays.copyOf(new Double[]{bearing2}, 1);
            arrayList.add(TuplesKt.createBearingAnimator$default(cameraAnimationsPlugin4, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf8, objArrCopyOf8.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i13 = i;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    long j4 = j;
                    if (i13 == 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) obj;
                        valueAnimator.getClass();
                        valueAnimator.setDuration(j4);
                        valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 1) {
                        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                        valueAnimator2.getClass();
                        valueAnimator2.setDuration(j4);
                        valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 == 2) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                        valueAnimator3.getClass();
                        valueAnimator3.setDuration(j4);
                        valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i13 != 3) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                        valueAnimator4.getClass();
                        valueAnimator4.setDuration(j4);
                        valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                    valueAnimator5.getClass();
                    valueAnimator5.setDuration(j4);
                    valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                    return createfromparcel;
                }
            }));
        }
        Double pitch2 = cameraOptions3.getPitch();
        if (pitch2 != null) {
            Object[] objArrCopyOf9 = Arrays.copyOf(new Double[]{pitch2}, 1);
            final int i13 = 3;
            arrayList.add(new CameraPitchAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf9, objArrCopyOf9.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i14 = i13;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    long j4 = j;
                    if (i14 == 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) obj;
                        valueAnimator.getClass();
                        valueAnimator.setDuration(j4);
                        valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i14 == 1) {
                        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                        valueAnimator2.getClass();
                        valueAnimator2.setDuration(j4);
                        valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i14 == 2) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                        valueAnimator3.getClass();
                        valueAnimator3.setDuration(j4);
                        valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i14 != 3) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                        valueAnimator4.getClass();
                        valueAnimator4.setDuration(j4);
                        valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                    valueAnimator5.getClass();
                    valueAnimator5.setDuration(j4);
                    valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                    return createfromparcel;
                }
            }));
        }
        EdgeInsets padding2 = cameraOptions3.getPadding();
        if (padding2 != null) {
            Object[] objArrCopyOf10 = Arrays.copyOf(new EdgeInsets[]{padding2}, 1);
            final int i14 = 4;
            arrayList.add(new CameraPaddingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf10, objArrCopyOf10.length), null, "NAVIGATION_CAMERA_OWNER"), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigation.ui.maps.camera.transition.DefaultSimplifiedUpdateFrameTransitionProvider$updateFrame$2$zoomAnimator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    int i15 = i14;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    long j4 = j;
                    if (i15 == 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) obj;
                        valueAnimator.getClass();
                        valueAnimator.setDuration(j4);
                        valueAnimator.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i15 == 1) {
                        ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                        valueAnimator2.getClass();
                        valueAnimator2.setDuration(j4);
                        valueAnimator2.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i15 == 2) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) obj;
                        valueAnimator3.getClass();
                        valueAnimator3.setDuration(j4);
                        valueAnimator3.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    if (i15 != 3) {
                        ValueAnimator valueAnimator4 = (ValueAnimator) obj;
                        valueAnimator4.getClass();
                        valueAnimator4.setDuration(j4);
                        valueAnimator4.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                        return createfromparcel;
                    }
                    ValueAnimator valueAnimator5 = (ValueAnimator) obj;
                    valueAnimator5.getClass();
                    valueAnimator5.setDuration(j4);
                    valueAnimator5.setInterpolator(DefaultSimplifiedUpdateFrameTransitionProvider.LINEAR_INTERPOLATOR);
                    return createfromparcel;
                }
            }));
        }
        BlockRunner blockRunner2 = new BlockRunner(cameraAnimationsPlugin3, mapboxMap2, MapboxNavigationCameraUtilsKt.createAnimatorSet(arrayList));
        ((CopyOnWriteArrayList) blockRunner2.IconCompatParcelizer).add(new MapboxAnimatorSetEndListener() { // from class: com.mapbox.navigation.ui.maps.camera.NavigationCamera$createFrameListener$1
            @Override // com.mapbox.navigation.ui.maps.camera.transition.MapboxAnimatorSetEndListener
            public final void onAnimationEnd(BlockRunner blockRunner3) {
                blockRunner3.getClass();
                NavigationCamera navigationCamera = this.this$0;
                if (navigationCamera.runningAnimation == blockRunner3) {
                    navigationCamera.runningAnimation = null;
                }
            }
        });
        startAnimation(blockRunner2, null);
    }
}
