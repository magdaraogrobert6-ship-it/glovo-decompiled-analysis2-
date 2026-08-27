package com.mapbox.maps.plugin.locationcomponent;

import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAccuracyRadiusAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckBearingAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckPositionAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckPulsingAnimator;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.maps.util.MathUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o.DrawableTransformation;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.getCieXyz;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationPuckManager {
    public final ImageLoader$Builder animationManager;
    public final MapDelegateProviderImpl delegateProvider;
    public final LocationPuckManager$disablePuckAnimationOnEnd$1 disablePuckAnimationOnEnd;
    public boolean isHidden;
    public double lastAccuracyRadius;
    public double lastBearing;
    public Point lastLocation;
    public LocationLayerRenderer locationLayerRenderer;
    public final LocationPuckManager$onBearingUpdated$1 onAccuracyRadiusUpdated;
    public final LocationPuckManager$onBearingUpdated$1 onBearingUpdated;
    public final LocationPuckManager$onBearingUpdated$1 onLocationUpdated;
    public final ProtobufEncoder positionManager;
    public LocationComponentSettings settings;
    public final WeakReference weakContext;

    public final void updateHorizontalAccuracyRadius(double[] dArr) {
        Object[] objArr = new Object[2];
        double[] dArr2 = {this.lastAccuracyRadius, 0.0d};
        objArr[1] = dArr;
        int i = 0;
        int length = 0;
        while (true) {
            Object obj = objArr[i];
            length += obj != null ? ((double[]) obj).length : 1;
            if (i == 1) {
                break;
            } else {
                i++;
            }
        }
        double[] dArr3 = new double[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (i3 < i2) {
                    int i5 = i2 - i3;
                    System.arraycopy(dArr2, i3, dArr3, i4, i5);
                    i4 += i5;
                }
                int length2 = ((double[]) obj2).length;
                System.arraycopy(obj2, 0, dArr3, i4, length2);
                i4 += length2;
                i3 = i2 + 1;
            }
            if (i2 == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (i3 < 2) {
            System.arraycopy(dArr2, i3, dArr3, i4, 2 - i3);
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr3, length);
        ImageLoader$Builder imageLoader$Builder = this.animationManager;
        PuckAccuracyRadiusAnimator puckAccuracyRadiusAnimator = (PuckAccuracyRadiusAnimator) imageLoader$Builder.read;
        Double[] dArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(dArrCopyOf);
        puckAccuracyRadiusAnimator.animate(Arrays.copyOf(dArrIconCompatParcelizer, dArrIconCompatParcelizer.length), null);
        if (dArr.length == 0) {
            DrawableTransformation.write("Array is empty.");
            return;
        }
        double d = dArr[dArr.length - 1];
        if (((int) this.settings.pulsingMaxRadius) == -1) {
            MapDelegateProviderImpl mapDelegateProviderImpl = this.delegateProvider;
            MapboxMap mapboxMap = (MapboxMap) mapDelegateProviderImpl.mapProjectionDelegate;
            MapboxMap mapboxMap2 = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
            double metersPerPixelAtLatitude = d / mapboxMap.getMetersPerPixelAtLatitude(mapboxMap2.getCameraState().getCenter().latitude(), mapboxMap2.getCameraState().getZoom());
            LocationComponentSettings locationComponentSettings = this.settings;
            PuckPulsingAnimator puckPulsingAnimator = (PuckPulsingAnimator) imageLoader$Builder.serializer;
            boolean z = locationComponentSettings.pulsingEnabled;
            puckPulsingAnimator.enabled = z;
            if (!z) {
                puckPulsingAnimator.cancelRunning();
            } else {
                puckPulsingAnimator.maxRadius = metersPerPixelAtLatitude;
                puckPulsingAnimator.animateInfinite();
            }
        }
    }

    public final LocationLayerRenderer getLocationLayerRenderer(LocationComponentSettings locationComponentSettings) {
        LocationPuck locationPuck = locationComponentSettings.locationPuck;
        if (!(locationPuck instanceof LocationPuck2D)) {
            if (locationPuck instanceof LocationPuck3D) {
                return new ModelLayerRenderer((LocationPuck3D) locationPuck);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        LocationPuck2D locationPuck2D = (LocationPuck2D) locationPuck;
        WeakReference weakReference = this.weakContext;
        weakReference.getClass();
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = new LocationIndicatorLayerWrapper("mapbox-location-indicator-layer");
        Value value = new Value("mapbox-location-indicator-layer");
        HashMap map = locationIndicatorLayerWrapper.layerProperties;
        map.put("id", value);
        map.put("type", new Value("location-indicator"));
        map.put("location-transition", LocationIndicatorLayerWrapper.buildTransition());
        map.put("bearing-transition", LocationIndicatorLayerWrapper.buildTransition());
        map.put("perspective-compensation", new Value(0.9d));
        map.put("image-pitch-displacement", new Value(4.0d));
        locationPuck2D.getClass();
        weakReference.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
        imageLoader$Builder.RemoteActionCompatParcelizer = locationPuck2D;
        imageLoader$Builder.IconCompatParcelizer = weakReference;
        imageLoader$Builder.read = locationIndicatorLayerWrapper;
        return imageLoader$Builder;
    }

    public final void initialize(MapboxStyleManager mapboxStyleManager) {
        String modelScaleExpression;
        ImageLoader$Builder imageLoader$Builder = this.animationManager;
        PuckPulsingAnimator puckPulsingAnimator = (PuckPulsingAnimator) imageLoader$Builder.serializer;
        PuckBearingAnimator puckBearingAnimator = (PuckBearingAnimator) imageLoader$Builder.RemoteActionCompatParcelizer;
        PuckPositionAnimator puckPositionAnimator = (PuckPositionAnimator) imageLoader$Builder.IconCompatParcelizer;
        PuckAccuracyRadiusAnimator puckAccuracyRadiusAnimator = (PuckAccuracyRadiusAnimator) imageLoader$Builder.read;
        mapboxStyleManager.getClass();
        if (this.locationLayerRenderer.isRendererInitialised()) {
            return;
        }
        LocationPuckManager$onBearingUpdated$1 locationPuckManager$onBearingUpdated$1 = this.onBearingUpdated;
        locationPuckManager$onBearingUpdated$1.getClass();
        LocationPuckManager$onBearingUpdated$1 locationPuckManager$onBearingUpdated$2 = this.onAccuracyRadiusUpdated;
        locationPuckManager$onBearingUpdated$2.getClass();
        puckPositionAnimator.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = puckPositionAnimator.updateListener;
        LocationPuckManager$onBearingUpdated$1 locationPuckManager$onBearingUpdated$3 = this.onLocationUpdated;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaunavo3sxub_pc9xroryotnrlvsm, locationPuckManager$onBearingUpdated$3}, getCieXyz.write())).booleanValue()) {
            puckPositionAnimator.updateListener = locationPuckManager$onBearingUpdated$3;
        }
        puckBearingAnimator.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{puckBearingAnimator.updateListener, locationPuckManager$onBearingUpdated$1}, getCieXyz.write())).booleanValue()) {
            puckBearingAnimator.updateListener = locationPuckManager$onBearingUpdated$1;
        }
        puckAccuracyRadiusAnimator.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{puckAccuracyRadiusAnimator.updateListener, locationPuckManager$onBearingUpdated$2}, getCieXyz.write())).booleanValue()) {
            puckAccuracyRadiusAnimator.updateListener = locationPuckManager$onBearingUpdated$2;
        }
        LocationLayerRenderer locationLayerRenderer = this.locationLayerRenderer;
        locationLayerRenderer.getClass();
        puckBearingAnimator.getClass();
        puckBearingAnimator.locationRenderer = locationLayerRenderer;
        puckPositionAnimator.getClass();
        puckPositionAnimator.locationRenderer = locationLayerRenderer;
        puckPulsingAnimator.getClass();
        puckPulsingAnimator.locationRenderer = locationLayerRenderer;
        puckAccuracyRadiusAnimator.getClass();
        puckAccuracyRadiusAnimator.locationRenderer = locationLayerRenderer;
        LocationComponentSettings locationComponentSettings = this.settings;
        boolean z = locationComponentSettings.pulsingEnabled;
        puckPulsingAnimator.enabled = z;
        puckPulsingAnimator.maxRadius = locationComponentSettings.pulsingMaxRadius;
        puckPulsingAnimator.pulsingColor = locationComponentSettings.pulsingColor;
        if (z) {
            puckPulsingAnimator.animateInfinite();
        } else {
            puckPulsingAnimator.cancelRunning();
        }
        puckAccuracyRadiusAnimator.enabled = locationComponentSettings.showAccuracyRing;
        puckAccuracyRadiusAnimator.accuracyCircleColor = locationComponentSettings.accuracyRingColor;
        puckAccuracyRadiusAnimator.accuracyCircleBorderColor = locationComponentSettings.accuracyRingBorderColor;
        Point point = this.lastLocation;
        if (point != null) {
            updateCurrentPosition(new Point[]{point}, null);
        }
        updateCurrentBearing$default(this, new double[]{this.lastBearing}, null, 2);
        this.locationLayerRenderer.addLayers(this.positionManager);
        this.locationLayerRenderer.initializeComponents(mapboxStyleManager);
        LocationPuck locationPuck = this.settings.locationPuck;
        if (locationPuck instanceof LocationPuck2D) {
            modelScaleExpression = ((LocationPuck2D) locationPuck).scaleExpression;
        } else {
            if (!(locationPuck instanceof LocationPuck3D)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            modelScaleExpression = ((LocationPuck3D) locationPuck).getModelScaleExpression();
        }
        if (modelScaleExpression != null) {
            LocationLayerRenderer locationLayerRenderer2 = this.locationLayerRenderer;
            Expected<String, Value> expectedFromJson = Value.fromJson(modelScaleExpression);
            expectedFromJson.getClass();
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value = expectedFromJson.getValue();
            if (value == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            locationLayerRenderer2.styleScaling(value);
        }
        if (this.lastLocation == null || !this.settings.enabled) {
            this.isHidden = true;
            this.locationLayerRenderer.hide();
        } else {
            this.isHidden = false;
            this.locationLayerRenderer.show();
        }
        if (this.settings.showAccuracyRing) {
            updateHorizontalAccuracyRadius(new double[]{this.lastAccuracyRadius});
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public final void updateCurrentPosition(Point[] pointArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Point[] pointArr2;
        if (this.settings.enabled && this.isHidden) {
            this.isHidden = false;
            this.locationLayerRenderer.show();
        }
        Point point = this.lastLocation;
        if (point != null) {
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(2);
            applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(point);
            applydisplaycutoutmarginstocontentarealambda0.serializer(pointArr);
            ArrayList arrayList = applydisplaycutoutmarginstocontentarealambda0.write;
            pointArr2 = (Point[]) arrayList.toArray(new Point[arrayList.size()]);
            if (pointArr2 == null) {
                applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda1 = new applyDisplayCutoutMarginsToContentArealambda0(2);
                applydisplaycutoutmarginstocontentarealambda1.serializer(pointArr);
                applydisplaycutoutmarginstocontentarealambda1.serializer(pointArr);
                ArrayList arrayList2 = applydisplaycutoutmarginstocontentarealambda1.write;
                pointArr2 = (Point[]) arrayList2.toArray(new Point[arrayList2.size()]);
            }
        } else {
            applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda2 = new applyDisplayCutoutMarginsToContentArealambda0(2);
            applydisplaycutoutmarginstocontentarealambda2.serializer(pointArr);
            applydisplaycutoutmarginstocontentarealambda2.serializer(pointArr);
            ArrayList arrayList3 = applydisplaycutoutmarginstocontentarealambda2.write;
            pointArr2 = (Point[]) arrayList3.toArray(new Point[arrayList3.size()]);
        }
        Point[] pointArr3 = (Point[]) Arrays.copyOf(pointArr2, pointArr2.length);
        ((PuckPositionAnimator) this.animationManager.IconCompatParcelizer).animate(Arrays.copyOf(pointArr3, pointArr3.length), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public LocationPuckManager(LocationComponentSettings locationComponentSettings, WeakReference weakReference, MapDelegateProviderImpl mapDelegateProviderImpl, ProtobufEncoder protobufEncoder, ImageLoader$Builder imageLoader$Builder) {
        weakReference.getClass();
        mapDelegateProviderImpl.getClass();
        this.settings = locationComponentSettings;
        this.weakContext = weakReference;
        this.delegateProvider = mapDelegateProviderImpl;
        this.positionManager = protobufEncoder;
        this.animationManager = imageLoader$Builder;
        this.isHidden = true;
        this.onLocationUpdated = new LocationPuckManager$onBearingUpdated$1(this, 2);
        this.lastBearing = ((MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate).getCameraState().getBearing();
        int i = 0;
        this.onBearingUpdated = new LocationPuckManager$onBearingUpdated$1(this, i);
        this.disablePuckAnimationOnEnd = new LocationPuckManager$disablePuckAnimationOnEnd$1(i, this);
        this.onAccuracyRadiusUpdated = new LocationPuckManager$onBearingUpdated$1(this, 1);
        this.locationLayerRenderer = getLocationLayerRenderer(this.settings);
    }

    public final void animateToBearing(double[] dArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        if (!z) {
            if (dArr.length == 0) {
                DrawableTransformation.write("Array is empty.");
                return;
            } else if (Math.abs(dArr[dArr.length - 1] - this.lastBearing) < 1.0d) {
                return;
            }
        }
        Object[] objArr = new Object[2];
        double[] dArr2 = {this.lastBearing, 0.0d};
        objArr[1] = dArr;
        int i = 0;
        int length = 0;
        while (true) {
            Object obj = objArr[i];
            length += obj != null ? ((double[]) obj).length : 1;
            if (i == 1) {
                break;
            } else {
                i++;
            }
        }
        double[] dArr3 = new double[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (i3 < i2) {
                    int i5 = i2 - i3;
                    System.arraycopy(dArr2, i3, dArr3, i4, i5);
                    i4 += i5;
                }
                int length2 = ((double[]) obj2).length;
                System.arraycopy(obj2, 0, dArr3, i4, length2);
                i4 += length2;
                i3 = i2 + 1;
            }
            if (i2 == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (i3 < 2) {
            System.arraycopy(dArr2, i3, dArr3, i4, 2 - i3);
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr3, length);
        PuckBearingAnimator puckBearingAnimator = (PuckBearingAnimator) this.animationManager.RemoteActionCompatParcelizer;
        Double[] dArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(MathUtils.INSTANCE.prepareOptimalBearingPath(dArrCopyOf));
        puckBearingAnimator.animate(Arrays.copyOf(dArrIconCompatParcelizer, dArrIconCompatParcelizer.length), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static void updateCurrentBearing$default(LocationPuckManager locationPuckManager, double[] dArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = null;
        }
        boolean z = (i & 4) == 0;
        locationPuckManager.getClass();
        boolean z2 = locationPuckManager.settings.puckBearingEnabled;
        PuckBearingAnimator puckBearingAnimator = (PuckBearingAnimator) locationPuckManager.animationManager.RemoteActionCompatParcelizer;
        if (z2) {
            puckBearingAnimator.enabled = true;
            locationPuckManager.animateToBearing(dArr, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z);
        } else if (puckBearingAnimator.enabled) {
            locationPuckManager.animateToBearing(new double[]{0.0d}, new LocationPuckManager$onBearingUpdated$1(locationPuckManager, 3), z);
        }
    }
}
