package com.mapbox.maps.plugin.gestures;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.logistics.rider.glovo.R;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.StandardGestureDetector;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda22;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.RenderedQueryGeometry;
import com.mapbox.maps.RenderedQueryOptions;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.delegates.MapInteractionDelegate;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.util.CoreGesturesHandler;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.f2;
import o.f2ExternalSyntheticLambda1;
import o.hf;
import o.hgExternalSyntheticLambda1;
import o.hgExternalSyntheticLambda9;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.restore;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesPluginImpl implements GesturesPlugin, MapStyleObserverPlugin {
    public static final MapAnimationOptions IMMEDIATE_ANIMATION_OPTIONS = new MapAnimationOptions("Maps-Gestures", 0L, null);
    public static final ValueAnimator noOpAnimator = new ValueAnimator();
    public float angularVelocityMultiplier;
    public final Handler animationsTimeoutHandler;
    public CameraAnimationsPlugin cameraAnimationsPlugin;
    public ScreenCoordinate cameraCenterScreenCoordinate;
    public boolean cameraPaddingChanged;
    public ScreenCoordinate centerScreen;
    public final Context context;
    public CoreGesturesHandler coreGesturesHandler;
    public float defaultSpanSinceStartThreshold;
    public ScreenCoordinate doubleTapFocalPoint;
    public boolean doubleTapRegistered;
    public zzbv gestureState;
    public final restore gesturesInterpolator;
    public AndroidGesturesManager gesturesManager;
    public final LinkedHashSet interactionsCancelableSet;
    public GesturesSettings internalSettings;
    public boolean isCleanedUp;
    public MapboxMap mapCameraManagerDelegate;
    public MapInteractionDelegate mapInteractionDelegate;
    public MapboxMap mapTransformDelegate;
    public float minimumAngledGestureSpeed;
    public float minimumAngularVelocity;
    public float minimumGestureSpeed;
    public float minimumScaleSpanWhenRotating;
    public float minimumVelocity;
    public MoveGestureListener moveGestureListener;
    public final CopyOnWriteArraySet onFlingListeners;
    public final CopyOnWriteArraySet onMapClickListeners;
    public final CopyOnWriteArraySet onMapLongClickListeners;
    public final CopyOnWriteArraySet onMoveListeners;
    public final CopyOnWriteArraySet onRotateListeners;
    public final CopyOnWriteArraySet onScaleListeners;
    public final CopyOnWriteArraySet onShoveListeners;
    public OverScrollerFlingAnimator overScrollerFlingAnimator;
    public float pixelRatio;
    public final CopyOnWriteArraySet protectedCameraAnimatorOwners;
    public boolean quickZoom;
    public ValueAnimator[] rotateAnimators;
    public ScreenCoordinate rotateCachedAnchor;
    public double rotateVelocityRatioThreshold;
    public ValueAnimator[] scaleAnimators;
    public ScreenCoordinate scaleCachedAnchor;
    public double scaleVelocityRatioThreshold;
    public final ArrayList scheduledAnimators;
    public double screenHeight;
    public boolean sizeChanged;
    public float spanSinceLast;
    public double startZoom;
    public MapboxStyleManager style;

    public final class StandardGestureListener implements StandardGestureDetector.StandardOnGestureListener {
        public final float doubleTapMovementThreshold;

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(gesturesPluginImpl.protectedCameraAnimatorOwners));
            return true;
        }

        public StandardGestureListener(float f) {
            this.doubleTapMovementThreshold = f;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
            if (actionMasked == 0) {
                gesturesPluginImpl.doubleTapFocalPoint = GesturesPluginImplKt.access$toScreenCoordinate(motionEvent);
                zzbv zzbvVar = gesturesPluginImpl.gestureState;
                if (zzbvVar != null) {
                    zzbvVar.saveAndDisable(GestureState$Type.DoubleTap);
                    gesturesPluginImpl.doubleTapRegistered = true;
                } else {
                    removeNodeAtDepth.serializer("gestureState");
                    throw null;
                }
            }
            if (motionEvent.getActionMasked() != 1) {
                return false;
            }
            double dAbs = Math.abs(((double) motionEvent.getX()) - gesturesPluginImpl.doubleTapFocalPoint.getX());
            double dAbs2 = Math.abs(((double) motionEvent.getY()) - gesturesPluginImpl.doubleTapFocalPoint.getY());
            double d = this.doubleTapMovementThreshold;
            if (dAbs > d || dAbs2 > d) {
                return false;
            }
            GesturesSettings gesturesSettings = gesturesPluginImpl.internalSettings;
            if (!gesturesSettings.doubleTapToZoomInEnabled) {
                return false;
            }
            ScreenCoordinate screenCoordinate = gesturesSettings.focalPoint;
            if (screenCoordinate != null) {
                gesturesPluginImpl.doubleTapFocalPoint = screenCoordinate;
            }
            gesturesPluginImpl.handleZoomAnimation$plugin_gestures_release(true, gesturesPluginImpl.doubleTapFocalPoint);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.LONG_CLICK, GesturesPluginImplKt.access$toScreenCoordinate(motionEvent)));
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            GesturesPluginImpl.this.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.CLICK, GesturesPluginImplKt.access$toScreenCoordinate(motionEvent)));
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:57:0x0123  */
        /* JADX WARN: Code duplicated, block: B:58:0x0126  */
        /* JADX WARN: Code duplicated, block: B:62:0x0134  */
        /* JADX WARN: Code duplicated, block: B:65:0x013b  */
        /* JADX WARN: Code duplicated, block: B:67:0x015e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0162  */
        /* JADX WARN: Code duplicated, block: B:71:0x018a  */
        /* JADX WARN: Code duplicated, block: B:73:0x0194  */
        /* JADX WARN: Code duplicated, block: B:75:0x019b  */
        /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            double dExp;
            double d;
            GesturesSettings gesturesSettings;
            double d2;
            double d3;
            CameraAnimationsPlugin cameraAnimationsPlugin;
            long j;
            ScreenCoordinate screenCoordinate;
            CameraAnimationsPlugin cameraAnimationsPlugin2;
            MapboxMap mapboxMap;
            CameraOptions cameraOptionsCameraForDrag;
            MapAnimationOptions mapAnimationOptions;
            CoreGesturesHandler coreGesturesHandler;
            if (motionEvent != null && motionEvent2 != null) {
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                CopyOnWriteArraySet copyOnWriteArraySet = gesturesPluginImpl.protectedCameraAnimatorOwners;
                if (gesturesPluginImpl.internalSettings.scrollEnabled) {
                    ScreenCoordinate screenCoordinateAccess$toScreenCoordinate = GesturesPluginImplKt.access$toScreenCoordinate(motionEvent2);
                    if (!gesturesPluginImpl.isPointAboveHorizon$plugin_gestures_release(screenCoordinateAccess$toScreenCoordinate)) {
                        Iterator it = gesturesPluginImpl.onFlingListeners.iterator();
                        if (!it.hasNext()) {
                            if (gesturesPluginImpl.internalSettings.scrollDecelerationEnabled) {
                                float f3 = gesturesPluginImpl.pixelRatio;
                                double dHypot = Math.hypot(f / f3, f2 / f3);
                                if (dHypot >= 1000.0d) {
                                    if (gesturesPluginImpl.internalSettings.useNativeFlingDeceleration) {
                                        CameraAnimationsPlugin cameraAnimationsPlugin3 = gesturesPluginImpl.cameraAnimationsPlugin;
                                        if (cameraAnimationsPlugin3 != null) {
                                            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin3).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(copyOnWriteArraySet));
                                            OverScrollerFlingAnimator overScrollerFlingAnimator = gesturesPluginImpl.overScrollerFlingAnimator;
                                            if (overScrollerFlingAnimator != null) {
                                                GesturesSettings gesturesSettings2 = gesturesPluginImpl.internalSettings;
                                                gesturesSettings2.getClass();
                                                overScrollerFlingAnimator.limitHorizontal = gesturesSettings2.scrollMode == ScrollMode.VERTICAL;
                                                GesturesSettings gesturesSettings3 = gesturesPluginImpl.internalSettings;
                                                gesturesSettings3.getClass();
                                                overScrollerFlingAnimator.limitVertical = gesturesSettings3.scrollMode == ScrollMode.HORIZONTAL;
                                                overScrollerFlingAnimator.forceStop();
                                                overScrollerFlingAnimator.fromPoint = screenCoordinateAccess$toScreenCoordinate;
                                                overScrollerFlingAnimator.prevX = 0;
                                                overScrollerFlingAnimator.prevY = 0;
                                                overScrollerFlingAnimator.isRunning = true;
                                                overScrollerFlingAnimator.overScroller.fling(0, 0, (int) f, (int) f2, -1073741824, 1073741823, -1073741824, 1073741823);
                                                GesturesPluginImpl$onDelegateProvider$3$1 gesturesPluginImpl$onDelegateProvider$3$1 = overScrollerFlingAnimator.onAnimationStart;
                                                if (gesturesPluginImpl$onDelegateProvider$3$1 != null) {
                                                    gesturesPluginImpl$onDelegateProvider$3$1.invoke();
                                                }
                                                overScrollerFlingAnimator.choreographer.postFrameCallback(overScrollerFlingAnimator.frameCallback);
                                                return true;
                                            }
                                            removeNodeAtDepth.serializer("overScrollerFlingAnimator");
                                            throw null;
                                        }
                                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                        throw null;
                                    }
                                    float f4 = gesturesPluginImpl.pixelRatio;
                                    MapboxMap mapboxMap2 = gesturesPluginImpl.mapCameraManagerDelegate;
                                    if (mapboxMap2 != null) {
                                        double pitch = mapboxMap2.getCameraState().getPitch();
                                        if (pitch >= 60.0d) {
                                            if (60.0d > pitch || pitch > 85.0d) {
                                                dExp = 0.0d;
                                            } else {
                                                double dLog = Math.log(6.0d);
                                                dExp = Math.exp((((pitch - 60.0d) * (Math.log(300.0d) - dLog)) / 25.0d) + dLog);
                                            }
                                            d = (dExp / ((double) f4)) + 10.0d;
                                            gesturesSettings = gesturesPluginImpl.internalSettings;
                                            gesturesSettings.getClass();
                                            if (gesturesSettings.scrollMode == ScrollMode.VERTICAL) {
                                                d2 = 0.0d;
                                            } else {
                                                d2 = ((double) f) / d;
                                            }
                                            GesturesSettings gesturesSettings4 = gesturesPluginImpl.internalSettings;
                                            gesturesSettings4.getClass();
                                            d3 = gesturesSettings4.scrollMode != ScrollMode.HORIZONTAL ? ((double) f2) / d : 0.0d;
                                            cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
                                            if (cameraAnimationsPlugin != null) {
                                                ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(copyOnWriteArraySet));
                                                j = (long) (dHypot / d);
                                                screenCoordinate = new ScreenCoordinate(gesturesPluginImpl.centerScreen.getX(), gesturesPluginImpl.centerScreen.getY() * 2.0d);
                                                cameraAnimationsPlugin2 = gesturesPluginImpl.cameraAnimationsPlugin;
                                                if (cameraAnimationsPlugin2 != null) {
                                                    mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                                                    if (mapboxMap != null) {
                                                        cameraOptionsCameraForDrag = mapboxMap.cameraForDrag(screenCoordinate, new ScreenCoordinate(screenCoordinate.getX() + d2, screenCoordinate.getY() + d3));
                                                        restore restoreVar = gesturesPluginImpl.gesturesInterpolator;
                                                        restoreVar.getClass();
                                                        mapAnimationOptions = new MapAnimationOptions("Maps-Gestures", Long.valueOf(j), restoreVar);
                                                        coreGesturesHandler = gesturesPluginImpl.coreGesturesHandler;
                                                        if (coreGesturesHandler != null) {
                                                            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).easeTo(cameraOptionsCameraForDrag, mapAnimationOptions, coreGesturesHandler.getCoreGestureAnimatorHandler());
                                                            return true;
                                                        }
                                                        removeNodeAtDepth.serializer("coreGesturesHandler");
                                                        throw null;
                                                    }
                                                    removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                                    throw null;
                                                }
                                                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                                throw null;
                                            }
                                            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                            throw null;
                                        }
                                        dExp = pitch / 10.0d;
                                        d = (dExp / ((double) f4)) + 10.0d;
                                        gesturesSettings = gesturesPluginImpl.internalSettings;
                                        gesturesSettings.getClass();
                                        if (gesturesSettings.scrollMode == ScrollMode.VERTICAL) {
                                            d2 = 0.0d;
                                        } else {
                                            d2 = ((double) f) / d;
                                        }
                                        GesturesSettings gesturesSettings5 = gesturesPluginImpl.internalSettings;
                                        gesturesSettings5.getClass();
                                        if (gesturesSettings5.scrollMode != ScrollMode.HORIZONTAL) {
                                        }
                                        cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
                                        if (cameraAnimationsPlugin != null) {
                                            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(copyOnWriteArraySet));
                                            j = (long) (dHypot / d);
                                            screenCoordinate = new ScreenCoordinate(gesturesPluginImpl.centerScreen.getX(), gesturesPluginImpl.centerScreen.getY() * 2.0d);
                                            cameraAnimationsPlugin2 = gesturesPluginImpl.cameraAnimationsPlugin;
                                            if (cameraAnimationsPlugin2 != null) {
                                                mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                                                if (mapboxMap != null) {
                                                    cameraOptionsCameraForDrag = mapboxMap.cameraForDrag(screenCoordinate, new ScreenCoordinate(screenCoordinate.getX() + d2, screenCoordinate.getY() + d3));
                                                    restore restoreVar2 = gesturesPluginImpl.gesturesInterpolator;
                                                    restoreVar2.getClass();
                                                    mapAnimationOptions = new MapAnimationOptions("Maps-Gestures", Long.valueOf(j), restoreVar2);
                                                    coreGesturesHandler = gesturesPluginImpl.coreGesturesHandler;
                                                    if (coreGesturesHandler != null) {
                                                        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).easeTo(cameraOptionsCameraForDrag, mapAnimationOptions, coreGesturesHandler.getCoreGestureAnimatorHandler());
                                                        return true;
                                                    }
                                                    removeNodeAtDepth.serializer("coreGesturesHandler");
                                                    throw null;
                                                }
                                                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                                throw null;
                                            }
                                            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                            throw null;
                                        }
                                        removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                                        throw null;
                                    }
                                    removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                                    throw null;
                                }
                            }
                        } else {
                            m1$$ExternalSyntheticOutline0.m(it.next());
                            throw null;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$onDelegateProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ GesturesPluginImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(GesturesPluginImpl gesturesPluginImpl, int i) {
            super(1);
            this.$r8$classId = i;
            this.this$0 = gesturesPluginImpl;
        }

        /* JADX WARN: Code duplicated, block: B:67:0x013b  */
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Iterator it;
            MoveGestureDetector moveGestureDetector;
            MapboxMap mapboxMapDeprecated;
            int i = 2 % 2;
            int i2 = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            GesturesPluginImpl gesturesPluginImpl = this.this$0;
            if (i2 == 0) {
                MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) obj;
                mapboxStyleManager.getClass();
                gesturesPluginImpl.style = mapboxStyleManager;
                return createfromparcel;
            }
            Object obj2 = null;
            if (i2 == 1) {
                InteractionContext interactionContext = (InteractionContext) obj;
                interactionContext.getClass();
                ScreenCoordinate screenCoordinate = interactionContext.getScreenCoordinate();
                screenCoordinate.getClass();
                CopyOnWriteArraySet copyOnWriteArraySet = gesturesPluginImpl.onMapClickListeners;
                if (!copyOnWriteArraySet.isEmpty()) {
                    MapboxMap mapboxMap = gesturesPluginImpl.mapCameraManagerDelegate;
                    if (mapboxMap == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    Point pointCoordinateForPixel = mapboxMap.coordinateForPixel(screenCoordinate);
                    Iterator it2 = copyOnWriteArraySet.iterator();
                    if (it2.hasNext()) {
                        hf hfVar = ((hgExternalSyntheticLambda9) it2.next()).serializer;
                        pointCoordinateForPixel.getClass();
                        MapView mapView = hfVar.read;
                        if (mapView != null) {
                            int i3 = IconCompatParcelizer + 37;
                            write = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                mapView.getMapboxMapDeprecated();
                                obj2.hashCode();
                                throw null;
                            }
                            MapboxMap mapboxMapDeprecated2 = mapView.getMapboxMapDeprecated();
                            if (mapboxMapDeprecated2 != null) {
                                mapboxMapDeprecated2.queryRenderedFeatures(new RenderedQueryGeometry(mapboxMapDeprecated2.pixelForCoordinate(pointCoordinateForPixel)), new RenderedQueryOptions(null, null), new PreviewView$1$$ExternalSyntheticLambda2(hfVar, mapboxMapDeprecated2, pointCoordinateForPixel, 25));
                            }
                        }
                    }
                }
                return Boolean.TRUE;
            }
            if (i2 == 2) {
                InteractionContext interactionContext2 = (InteractionContext) obj;
                interactionContext2.getClass();
                ScreenCoordinate screenCoordinate2 = interactionContext2.getScreenCoordinate();
                screenCoordinate2.getClass();
                CopyOnWriteArraySet copyOnWriteArraySet2 = gesturesPluginImpl.onMapLongClickListeners;
                if (!copyOnWriteArraySet2.isEmpty()) {
                    int i4 = IconCompatParcelizer + 93;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    MapboxMap mapboxMap2 = gesturesPluginImpl.mapCameraManagerDelegate;
                    if (mapboxMap2 == null) {
                        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                        throw null;
                    }
                    int i6 = write + 47;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        mapboxMap2.coordinateForPixel(screenCoordinate2);
                        copyOnWriteArraySet2.iterator().hasNext();
                        obj2.hashCode();
                        throw null;
                    }
                    mapboxMap2.coordinateForPixel(screenCoordinate2);
                    Iterator it3 = copyOnWriteArraySet2.iterator();
                    if (it3.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it3.next());
                        throw null;
                    }
                }
                return Boolean.TRUE;
            }
            if (i2 == 3) {
                ((InteractionContext) obj).getClass();
                gesturesPluginImpl.cancelTransitionsIfRequired();
                MoveGestureListener moveGestureListener = gesturesPluginImpl.moveGestureListener;
                if (moveGestureListener == null) {
                    removeNodeAtDepth.serializer("moveGestureListener");
                    throw null;
                }
                if (moveGestureListener.detector == null) {
                    removeNodeAtDepth.serializer("detector");
                    throw null;
                }
                int i7 = write + 85;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    it = gesturesPluginImpl.onMoveListeners.iterator();
                    int i8 = 72 / 0;
                } else {
                    it = gesturesPluginImpl.onMoveListeners.iterator();
                }
                while (it.hasNext()) {
                    hgExternalSyntheticLambda1 hgexternalsyntheticlambda1 = (hgExternalSyntheticLambda1) it.next();
                    hgexternalsyntheticlambda1.getClass();
                    hf hfVar2 = hgexternalsyntheticlambda1.read;
                    MapView mapView2 = hfVar2.read;
                    if (mapView2 == null || (mapboxMapDeprecated = mapView2.getMapboxMapDeprecated()) == null) {
                        moveGestureDetector = null;
                    } else {
                        int i9 = write + 83;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        AndroidGesturesManager androidGesturesManager = (AndroidGesturesManager) mapboxMapDeprecated.gesturesPlugin(GesturesUtils$getGesturesManager$1.INSTANCE);
                        if (androidGesturesManager != null) {
                            moveGestureDetector = androidGesturesManager.moveGestureDetector;
                        } else {
                            moveGestureDetector = null;
                        }
                    }
                    if (moveGestureDetector != null) {
                        int i11 = IconCompatParcelizer + 69;
                        write = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        if (moveGestureDetector.isInProgress) {
                            hfVar2.IconCompatParcelizer.write(f2.serializer);
                        }
                    }
                }
                return Boolean.TRUE;
            }
            if (i2 != 4) {
                ((InteractionContext) obj).getClass();
                MoveGestureListener moveGestureListener2 = gesturesPluginImpl.moveGestureListener;
                if (moveGestureListener2 == null) {
                    removeNodeAtDepth.serializer("moveGestureListener");
                    throw null;
                }
                int i13 = IconCompatParcelizer + 59;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (moveGestureListener2.detector == null) {
                    removeNodeAtDepth.serializer("detector");
                    throw null;
                }
                for (hgExternalSyntheticLambda1 hgexternalsyntheticlambda2 : gesturesPluginImpl.onMoveListeners) {
                    hgexternalsyntheticlambda2.getClass();
                    hgexternalsyntheticlambda2.read.IconCompatParcelizer.write(f2ExternalSyntheticLambda1.IconCompatParcelizer);
                    int i15 = IconCompatParcelizer + 59;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                return createfromparcel;
            }
            InteractionContext interactionContext3 = (InteractionContext) obj;
            interactionContext3.getClass();
            ScreenCoordinate screenCoordinate3 = interactionContext3.getScreenCoordinate();
            screenCoordinate3.getClass();
            MoveGestureListener moveGestureListener3 = gesturesPluginImpl.moveGestureListener;
            if (moveGestureListener3 == null) {
                removeNodeAtDepth.serializer("moveGestureListener");
                throw null;
            }
            MoveGestureDetector moveGestureDetector2 = moveGestureListener3.detector;
            if (moveGestureDetector2 == null) {
                removeNodeAtDepth.serializer("detector");
                throw null;
            }
            Iterator it4 = gesturesPluginImpl.onMoveListeners.iterator();
            while (it4.hasNext()) {
                int i17 = write + 19;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                ((hgExternalSyntheticLambda1) it4.next()).getClass();
            }
            PointF pointF = moveGestureDetector2.focalPoint;
            double d = pointF.x;
            double d2 = pointF.y;
            CoreGesturesHandler coreGesturesHandler = gesturesPluginImpl.coreGesturesHandler;
            if (coreGesturesHandler == null) {
                removeNodeAtDepth.serializer("coreGesturesHandler");
                throw null;
            }
            int i19 = IconCompatParcelizer + 49;
            write = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            coreGesturesHandler.notifyCoreGestureStarted();
            MapboxMap mapboxMap3 = gesturesPluginImpl.mapCameraManagerDelegate;
            if (mapboxMap3 == null) {
                removeNodeAtDepth.serializer("mapCameraManagerDelegate");
                throw null;
            }
            CameraOptions cameraOptionsCameraForDrag = mapboxMap3.cameraForDrag(new ScreenCoordinate(d, d2), screenCoordinate3);
            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            MapAnimationOptions mapAnimationOptions = GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS;
            TuplesKt.easeTo$default(cameraAnimationsPlugin, cameraOptionsCameraForDrag);
            return createfromparcel;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        this.isCleanedUp = true;
        this.style = null;
        LinkedHashSet linkedHashSet = this.interactionsCancelableSet;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        linkedHashSet.clear();
        this.protectedCameraAnimatorOwners.clear();
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
    }

    public final class MoveGestureListener {
        public MoveGestureDetector detector;

        public MoveGestureListener() {
        }

        public final void onMove(MoveGestureDetector moveGestureDetector, float f, float f2) {
            ArrayList arrayList = moveGestureDetector.pointerIdList;
            if (!(f == 0.0f && f2 == 0.0f) && arrayList.size() <= 2) {
                GesturesPluginImpl gesturesPluginImpl = GesturesPluginImpl.this;
                if (gesturesPluginImpl.internalSettings.pinchScrollEnabled || arrayList.size() <= 1) {
                    AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
                    if (androidGesturesManager == null) {
                        removeNodeAtDepth.serializer("gesturesManager");
                        throw null;
                    }
                    if (androidGesturesManager.shoveGestureDetector.isInProgress) {
                        return;
                    }
                    PointF pointF = moveGestureDetector.focalPoint;
                    double d = pointF.x;
                    double d2 = pointF.y;
                    if (Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
                        MapboxLogger.logE("Gestures", "Invalid focal point=" + moveGestureDetector.focalPoint + " to perform map panning!");
                        return;
                    }
                    if (Float.isInfinite(f) || Float.isNaN(f) || Float.isInfinite(f2) || Float.isNaN(f2)) {
                        MapboxLogger.logE("Gestures", "Invalid distanceX=" + f + " or distanceY=" + f2 + " to perform map panning!");
                        return;
                    }
                    if (gesturesPluginImpl.isPointAboveHorizon$plugin_gestures_release(new ScreenCoordinate(d, d2))) {
                        return;
                    }
                    GesturesSettings gesturesSettings = gesturesPluginImpl.internalSettings;
                    gesturesSettings.getClass();
                    double d3 = gesturesSettings.scrollMode == ScrollMode.VERTICAL ? 0.0d : f;
                    GesturesSettings gesturesSettings2 = gesturesPluginImpl.internalSettings;
                    gesturesSettings2.getClass();
                    gesturesPluginImpl.getMapInteractionDelegate$plugin_gestures_release().dispatch(new PlatformEventInfo(PlatformEventType.DRAG, new ScreenCoordinate(d - d3, d2 - (gesturesSettings2.scrollMode != ScrollMode.HORIZONTAL ? f2 : 0.0d))));
                }
            }
        }
    }

    public final class RotateGestureListener {
        public RotateGestureListener() {
        }
    }

    public final class ScaleGestureListener {
        public ScaleGestureListener() {
        }
    }

    public final class ShoveGestureListener {
        public ShoveGestureListener() {
        }
    }

    public final class TapGestureListener {
        public TapGestureListener() {
        }
    }

    public final void cancelTransitionsIfRequired() {
        GesturesSettings gesturesSettings = this.internalSettings;
        if (gesturesSettings.scrollEnabled) {
            AndroidGesturesManager androidGesturesManager = this.gesturesManager;
            if (androidGesturesManager == null) {
                removeNodeAtDepth.serializer("gesturesManager");
                throw null;
            }
            if (androidGesturesManager.moveGestureDetector.isInProgress) {
                return;
            }
        }
        if (gesturesSettings.pinchToZoomEnabled || gesturesSettings.doubleTouchToZoomOutEnabled || gesturesSettings.doubleTapToZoomInEnabled) {
            AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
            if (androidGesturesManager2 == null) {
                removeNodeAtDepth.serializer("gesturesManager");
                throw null;
            }
            if (androidGesturesManager2.standardScaleGestureDetector.isInProgress) {
                return;
            }
        }
        if (gesturesSettings.rotateEnabled) {
            AndroidGesturesManager androidGesturesManager3 = this.gesturesManager;
            if (androidGesturesManager3 == null) {
                removeNodeAtDepth.serializer("gesturesManager");
                throw null;
            }
            if (androidGesturesManager3.rotateGestureDetector.isInProgress) {
                return;
            }
        }
        if (gesturesSettings.pitchEnabled) {
            AndroidGesturesManager androidGesturesManager4 = this.gesturesManager;
            if (androidGesturesManager4 == null) {
                removeNodeAtDepth.serializer("gesturesManager");
                throw null;
            }
            if (androidGesturesManager4.shoveGestureDetector.isInProgress) {
                return;
            }
        }
        CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).cancelAllAnimators(onContentCardDismissed.PlaybackStateCompat(this.protectedCameraAnimatorOwners));
        OverScrollerFlingAnimator overScrollerFlingAnimator = this.overScrollerFlingAnimator;
        if (overScrollerFlingAnimator != null) {
            overScrollerFlingAnimator.forceStop();
        } else {
            removeNodeAtDepth.serializer("overScrollerFlingAnimator");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
        if (checkCleanedUp("initialize")) {
            return;
        }
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        int i = 1;
        int i2 = 3;
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(1);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(3);
        int i3 = 2;
        hashSet2.add(2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(1);
        hashSet3.add(6);
        List listAsList = Arrays.asList(hashSet, hashSet2, hashSet3);
        ArrayList arrayList = androidGesturesManager.mutuallyExclusiveGestures;
        arrayList.clear();
        arrayList.addAll(listAsList);
        androidGesturesManager.rotateGestureDetector.angleThreshold = 3.0f;
        androidGesturesManager.shoveGestureDetector.maxShoveAngle = 45.0f;
        this.gesturesManager = androidGesturesManager;
        Context context = this.context;
        StandardGestureListener standardGestureListener = new StandardGestureListener(context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
        this.moveGestureListener = new MoveGestureListener();
        this.minimumGestureSpeed = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_speed);
        this.minimumAngledGestureSpeed = context.getResources().getDimension(R.dimen.mapbox_minimum_angled_scale_speed);
        this.minimumVelocity = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_velocity);
        this.scaleVelocityRatioThreshold = ((double) context.getResources().getDimension(R.dimen.mapbox_density_constant)) * 0.004d;
        ScaleGestureListener scaleGestureListener = new ScaleGestureListener();
        this.minimumScaleSpanWhenRotating = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_span_when_rotating);
        this.angularVelocityMultiplier = context.getResources().getDimension(R.dimen.mapbox_angular_velocity_multiplier);
        this.minimumAngularVelocity = context.getResources().getDimension(R.dimen.mapbox_minimum_angular_velocity);
        this.rotateVelocityRatioThreshold = ((double) context.getResources().getDimension(R.dimen.mapbox_density_constant)) * 2.2000000000000003E-4d;
        this.defaultSpanSinceStartThreshold = context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold);
        RotateGestureListener rotateGestureListener = new RotateGestureListener();
        ShoveGestureListener shoveGestureListener = new ShoveGestureListener();
        TapGestureListener tapGestureListener = new TapGestureListener();
        AndroidGesturesManager androidGesturesManager2 = this.gesturesManager;
        if (androidGesturesManager2 == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        androidGesturesManager2.standardGestureDetector.listener = standardGestureListener;
        MoveGestureListener moveGestureListener = this.moveGestureListener;
        if (moveGestureListener == null) {
            removeNodeAtDepth.serializer("moveGestureListener");
            throw null;
        }
        androidGesturesManager2.moveGestureDetector.listener = moveGestureListener;
        if (androidGesturesManager2 == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        androidGesturesManager2.standardScaleGestureDetector.listener = scaleGestureListener;
        androidGesturesManager2.rotateGestureDetector.listener = rotateGestureListener;
        androidGesturesManager2.shoveGestureDetector.listener = shoveGestureListener;
        androidGesturesManager2.multiFingerTapGestureDetector.listener = tapGestureListener;
        LinkedHashSet linkedHashSet = this.interactionsCancelableSet;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        linkedHashSet.clear();
        linkedHashSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(ClickInteraction.Companion.map(new AnonymousClass1(this, i))));
        linkedHashSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(LongClickInteraction.Companion.map(new AnonymousClass1(this, i3))));
        linkedHashSet.add(getMapInteractionDelegate$plugin_gestures_release().addInteraction(DragInteraction.Companion.invoke(new AnonymousClass1(this, i2), new AnonymousClass1(this, 4), new AnonymousClass1(this, 5))));
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) throws InvalidPluginConfigurationException {
        if (checkCleanedUp("onDelegateProvider")) {
            return;
        }
        ((MapboxMap) mapDelegateProviderImpl.mapboxMap).getStyle(new MapboxMap$$ExternalSyntheticLambda22(2, new AnonymousClass1(this, 0)));
        this.mapTransformDelegate = (MapboxMap) mapDelegateProviderImpl.mapTransformDelegate;
        this.mapCameraManagerDelegate = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
        MapboxMap mapboxMap = (MapboxMap) mapDelegateProviderImpl.mapInteractionDelegate;
        mapboxMap.getClass();
        this.mapInteractionDelegate = mapboxMap;
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) ((MapController) mapDelegateProviderImpl.mapPluginProviderDelegate).getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        if (cameraAnimationsPlugin == null) {
            throw new InvalidPluginConfigurationException();
        }
        this.cameraAnimationsPlugin = cameraAnimationsPlugin;
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).paddingListeners.add(new CameraAnimatorChangeListener() { // from class: com.mapbox.maps.plugin.gestures.GesturesPluginImpl$$ExternalSyntheticLambda0
            @Override // com.mapbox.maps.plugin.animation.CameraAnimatorChangeListener
            public final void onChanged(Object obj) {
                ((EdgeInsets) obj).getClass();
                this.f$0.cameraPaddingChanged = true;
            }
        });
        MapboxMap mapboxMap2 = this.mapTransformDelegate;
        if (mapboxMap2 == null) {
            removeNodeAtDepth.serializer("mapTransformDelegate");
            throw null;
        }
        MapboxMap mapboxMap3 = this.mapCameraManagerDelegate;
        if (mapboxMap3 == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        this.coreGesturesHandler = new CoreGesturesHandler(mapboxMap2, mapboxMap3);
        MapboxMap mapboxMap4 = this.mapCameraManagerDelegate;
        if (mapboxMap4 == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        OverScrollerFlingAnimator overScrollerFlingAnimator = new OverScrollerFlingAnimator(this.context, mapboxMap4);
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            removeNodeAtDepth.serializer("coreGesturesHandler");
            throw null;
        }
        AnimatorListenerAdapter coreGestureAnimatorHandler = coreGesturesHandler.getCoreGestureAnimatorHandler();
        overScrollerFlingAnimator.onAnimationStart = new GesturesPluginImpl$onDelegateProvider$3$1(coreGestureAnimatorHandler, 0);
        overScrollerFlingAnimator.onAnimationEnd = new GesturesPluginImpl$onDelegateProvider$3$1(coreGestureAnimatorHandler, 1);
        this.overScrollerFlingAnimator = overScrollerFlingAnimator;
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public final void onSizeChanged(int i, int i2) {
        this.centerScreen = new ScreenCoordinate(i / 2, i2 / 2);
        this.sizeChanged = true;
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public final void onStyleChanged(Style style) {
        if (checkCleanedUp("onStyleChanged")) {
            return;
        }
        this.style = style;
    }

    public GesturesPluginImpl(Context context, AttributeSet attributeSet, float f) {
        context.getClass();
        attributeSet.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet();
        this.onMapClickListeners = new CopyOnWriteArraySet();
        this.onMapLongClickListeners = new CopyOnWriteArraySet();
        this.onFlingListeners = new CopyOnWriteArraySet();
        this.onMoveListeners = new CopyOnWriteArraySet();
        this.onRotateListeners = new CopyOnWriteArraySet();
        this.onScaleListeners = new CopyOnWriteArraySet();
        this.onShoveListeners = new CopyOnWriteArraySet();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList();
        this.gesturesInterpolator = new restore(1);
        this.context = context;
        this.pixelRatio = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            GesturesSettings GesturesSettings = SentryUUID.GesturesSettings(new RootViewsSpy$Companion$install$1$1(8, typedArrayObtainStyledAttributes));
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = GesturesSettings;
            this.animationsTimeoutHandler = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void handleZoomAnimation$plugin_gestures_release(boolean z, ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        unregisterScheduledAnimators(this.scaleAnimators);
        AndroidGesturesManager androidGesturesManager = this.gesturesManager;
        if (androidGesturesManager == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        androidGesturesManager.standardScaleGestureDetector.getClass();
        Iterator it = this.onScaleListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
        MapboxMap mapboxMap = this.mapCameraManagerDelegate;
        if (mapboxMap == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        ValueAnimator[] valueAnimatorArrCreateScaleAnimators = createScaleAnimators(mapboxMap.getCameraState().getZoom(), z ? 1 : -1, screenCoordinate, 300L);
        this.scaleAnimators = valueAnimatorArrCreateScaleAnimators;
        scheduleAnimators(valueAnimatorArrCreateScaleAnimators);
    }

    public final void doubleTapFinished() {
        if (this.doubleTapRegistered) {
            zzbv zzbvVar = this.gestureState;
            if (zzbvVar == null) {
                removeNodeAtDepth.serializer("gestureState");
                throw null;
            }
            zzbvVar.restore(GestureState$Type.DoubleTap);
            this.doubleTapRegistered = false;
        }
    }

    public final void scheduleAnimators(ValueAnimator[] valueAnimatorArr) {
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            this.scheduledAnimators.add(valueAnimator);
        }
        Handler handler = this.animationsTimeoutHandler;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new ZM$$ExternalSyntheticLambda2(6, this), 150L);
    }

    @Override // com.mapbox.maps.plugin.ContextBinder
    public final void bind(Context context, AttributeSet attributeSet, float f) {
        context.getClass();
        AndroidGesturesManager androidGesturesManager = new AndroidGesturesManager(context);
        this.gesturesManager = androidGesturesManager;
        this.gestureState = new zzbv(androidGesturesManager);
        this.pixelRatio = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            GesturesSettings GesturesSettings = SentryUUID.GesturesSettings(new RootViewsSpy$Companion$install$1$1(8, typedArrayObtainStyledAttributes));
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = GesturesSettings;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final ValueAnimator[] createScaleAnimators(double d, double d2, ScreenCoordinate screenCoordinate, long j) {
        if (this.cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(new Double[]{Double.valueOf(d2 + d)}, 1);
        CameraAnimatorOptions cameraAnimatorOptions = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), Double.valueOf(d), "Maps-Gestures");
        restore restoreVar = this.gesturesInterpolator;
        int i = 0;
        CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(cameraAnimatorOptions, new GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(restoreVar, j, 0));
        cameraZoomAnimator.addListener(new GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1(this, 2));
        CoreGesturesHandler coreGesturesHandler = this.coreGesturesHandler;
        if (coreGesturesHandler == null) {
            removeNodeAtDepth.serializer("coreGesturesHandler");
            throw null;
        }
        cameraZoomAnimator.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
        if (this.cameraAnimationsPlugin == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
        CameraAnchorAnimator cameraAnchorAnimator = new CameraAnchorAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), screenCoordinate, "Maps-Gestures"), new GesturesPluginImpl$createScaleAnimators$zoomAnimator$2(restoreVar, j, 3));
        cameraAnchorAnimator.addListener(new GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1(this, i));
        return new ValueAnimator[]{cameraZoomAnimator, cameraAnchorAnimator};
    }

    public final void unregisterScheduledAnimators() {
        OverScrollerFlingAnimator overScrollerFlingAnimator = this.overScrollerFlingAnimator;
        if (overScrollerFlingAnimator == null) {
            removeNodeAtDepth.serializer("overScrollerFlingAnimator");
            throw null;
        }
        overScrollerFlingAnimator.forceStop();
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.scheduledAnimators.clear();
        unregisterScheduledAnimators(this.scaleAnimators);
        unregisterScheduledAnimators(this.rotateAnimators);
    }

    public final boolean checkCleanedUp(String str) {
        if (this.isCleanedUp) {
            MapboxLogger.logE("Gestures", str.concat(" called after cleanup, ignoring. Ensure map interactions are performed before MapView.onDestroy()."));
        }
        return this.isCleanedUp;
    }

    public final MapInteractionDelegate getMapInteractionDelegate$plugin_gestures_release() {
        MapInteractionDelegate mapInteractionDelegate = this.mapInteractionDelegate;
        if (mapInteractionDelegate != null) {
            return mapInteractionDelegate;
        }
        removeNodeAtDepth.serializer("mapInteractionDelegate");
        throw null;
    }

    public final boolean isPointAboveHorizon$plugin_gestures_release(ScreenCoordinate screenCoordinate) {
        String upperCase;
        MapboxStyleManager mapboxStyleManager = this.style;
        StylePropertyValue styleProjectionProperty = mapboxStyleManager != null ? mapboxStyleManager.getStyleProjectionProperty("name") : null;
        if (styleProjectionProperty == null) {
            return false;
        }
        if (styleProjectionProperty.getKind() == StylePropertyValueKind.UNDEFINED) {
            upperCase = "MERCATOR";
        } else {
            Object contents = styleProjectionProperty.getValue().getContents();
            contents.getClass();
            upperCase = ((String) contents).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        }
        if (!upperCase.equals("MERCATOR")) {
            return false;
        }
        MapboxMap mapboxMap = this.mapTransformDelegate;
        if (mapboxMap == null) {
            removeNodeAtDepth.serializer("mapTransformDelegate");
            throw null;
        }
        double height = ((double) mapboxMap.getSize().getHeight()) * 0.04d;
        double dMin = Math.min(10.0d, height / 2.0d);
        double x = screenCoordinate.getX();
        double d = 0.0d;
        if (Double.isNaN(x)) {
            MapboxLogger.logE("Gestures", "isPointAboveHorizon: screen coordinate x is NaN.");
            x = 0.0d;
        }
        double y = screenCoordinate.getY();
        if (Double.isNaN(y)) {
            MapboxLogger.logE("Gestures", "isPointAboveHorizon: screen coordinate y is NaN.");
        } else {
            d = y;
        }
        ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(x, d - height);
        MapboxMap mapboxMap2 = this.mapCameraManagerDelegate;
        if (mapboxMap2 == null) {
            removeNodeAtDepth.serializer("mapCameraManagerDelegate");
            throw null;
        }
        Point pointCoordinateForPixel = mapboxMap2.coordinateForPixel(screenCoordinate2);
        MapboxMap mapboxMap3 = this.mapCameraManagerDelegate;
        if (mapboxMap3 != null) {
            return mapboxMap3.pixelForCoordinate(pointCoordinateForPixel).getY() >= screenCoordinate2.getY() + dMin;
        }
        removeNodeAtDepth.serializer("mapCameraManagerDelegate");
        throw null;
    }

    public final void unregisterScheduledAnimators(ValueAnimator[] valueAnimatorArr) {
        if (valueAnimatorArr != null) {
            CameraAnimationsPlugin cameraAnimationsPlugin = this.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin != null) {
                ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).unregisterAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), true);
            } else {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
        }
    }

    public GesturesPluginImpl(Context context, float f) {
        context.getClass();
        this.pixelRatio = 1.0f;
        this.interactionsCancelableSet = new LinkedHashSet();
        this.protectedCameraAnimatorOwners = new CopyOnWriteArraySet();
        this.onMapClickListeners = new CopyOnWriteArraySet();
        this.onMapLongClickListeners = new CopyOnWriteArraySet();
        this.onFlingListeners = new CopyOnWriteArraySet();
        this.onMoveListeners = new CopyOnWriteArraySet();
        this.onRotateListeners = new CopyOnWriteArraySet();
        this.onScaleListeners = new CopyOnWriteArraySet();
        this.onShoveListeners = new CopyOnWriteArraySet();
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.doubleTapFocalPoint = screenCoordinate;
        this.centerScreen = screenCoordinate;
        this.cameraCenterScreenCoordinate = screenCoordinate;
        this.sizeChanged = true;
        this.scheduledAnimators = new ArrayList();
        this.gesturesInterpolator = new restore(1);
        this.context = context;
        this.pixelRatio = f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            GesturesSettings GesturesSettings = SentryUUID.GesturesSettings(new RootViewsSpy$Companion$install$1$1(8, typedArrayObtainStyledAttributes));
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = GesturesSettings;
            this.animationsTimeoutHandler = new Handler(Looper.getMainLooper());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
