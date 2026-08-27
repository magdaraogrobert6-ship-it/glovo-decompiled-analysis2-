package com.mapbox.maps.plugin.animation;

import android.animation.TypeEvaluator;
import android.view.animation.PathInterpolator;
import androidx.sqlite.SQLite;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Size;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraTypeEvaluator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.ranges.RangesKt;
import o.displayInAppMessagelambda5;
import o.getQueryParameterslambda2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.restore;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimatorsFactory {
    public static final restore DEFAULT_INTERPOLATOR;
    public static final HashMap defaultAnimationParameters;
    public final MapboxMap mapCameraManagerDelegate;
    public final MapboxMap mapProjectionDelegate;
    public final MapboxMap mapTransformDelegate;

    /* JADX WARN: Type inference failed for: r9v4, types: [com.mapbox.maps.plugin.animation.CameraAnimatorsFactory$getFlyTo$animators$4] */
    public final CameraAnimator[] getFlyTo(CameraOptions cameraOptions, String str) {
        double dMax;
        cameraOptions.getClass();
        MapboxMap mapboxMap = this.mapCameraManagerDelegate;
        CameraState cameraState = mapboxMap.getCameraState();
        EdgeInsets padding = cameraState.getPadding();
        padding.getClass();
        EdgeInsets padding2 = cameraOptions.getPadding();
        EdgeInsets edgeInsets = padding2 == null ? padding : padding2;
        Point center = cameraOptions.getCenter();
        if (center == null) {
            center = cameraState.getCenter();
        }
        center.getClass();
        Point pointWrapCoordinate = ModuleDSLKt.wrapCoordinate(center);
        Double zoom = cameraOptions.getZoom();
        if (zoom == null) {
            zoom = Double.valueOf(cameraState.getZoom());
        }
        double dDoubleValue = zoom.doubleValue();
        Double bearing = cameraOptions.getBearing();
        if (bearing == null) {
            bearing = Double.valueOf(cameraState.getBearing());
        }
        double dDoubleValue2 = bearing.doubleValue();
        double pitch = cameraState.getPitch();
        Double pitch2 = cameraOptions.getPitch();
        if (pitch2 == null) {
            pitch2 = Double.valueOf(pitch);
        }
        double dDoubleValue3 = pitch2.doubleValue();
        double bearing2 = cameraState.getBearing();
        final double dPow = Math.pow(2.0d, cameraState.getZoom());
        final double dLog = Math.log(dPow) / displayInAppMessagelambda5.write;
        double d = RangesKt.read(dDoubleValue, mapboxMap.getBounds().getMinZoom(), mapboxMap.getBounds().getMaxZoom());
        Point center2 = cameraState.getCenter();
        center2.getClass();
        Point pointUnwrapForShortestPath = ModuleDSLKt.unwrapForShortestPath(ModuleDSLKt.wrapCoordinate(center2), pointWrapCoordinate);
        MapboxMap mapboxMap2 = this.mapProjectionDelegate;
        final MercatorCoordinate mercatorCoordinateProject = mapboxMap2.project(pointUnwrapForShortestPath, dPow);
        final MercatorCoordinate mercatorCoordinateProject2 = mapboxMap2.project(pointWrapCoordinate, dPow);
        MapboxMap mapboxMap3 = this.mapTransformDelegate;
        Size size = mapboxMap3.getSize();
        float pixelRatio = mapboxMap3.getMapOptions().getPixelRatio();
        if (size.getWidth() == edgeInsets.getRight() + edgeInsets.getLeft() || size.getHeight() == edgeInsets.getTop() + edgeInsets.getBottom()) {
            double d2 = pixelRatio;
            dMax = Math.max(((double) size.getWidth()) / d2, ((double) size.getHeight()) / d2);
        } else {
            double d3 = pixelRatio;
            dMax = Math.max(((((double) size.getWidth()) - edgeInsets.getLeft()) - edgeInsets.getRight()) / d3, ((((double) size.getHeight()) - edgeInsets.getTop()) - edgeInsets.getBottom()) / d3);
        }
        final double dPow2 = dMax / Math.pow(2.0d, d - dLog);
        mercatorCoordinateProject2.getClass();
        mercatorCoordinateProject.getClass();
        final double dHypot = Math.hypot(new ScreenCoordinate(mercatorCoordinateProject2.getX() - mercatorCoordinateProject.getX(), mercatorCoordinateProject2.getY() - mercatorCoordinateProject.getY()).getX(), new ScreenCoordinate(mercatorCoordinateProject2.getX() - mercatorCoordinateProject.getX(), mercatorCoordinateProject2.getY() - mercatorCoordinateProject.getY()).getY());
        double flyTo$r = dHypot == 0.0d ? Double.POSITIVE_INFINITY : getFlyTo$r(dPow2, dMax, dHypot, 0);
        double flyTo$r2 = dHypot != 0.0d ? getFlyTo$r(dPow2, dMax, dHypot, 1) : Double.POSITIVE_INFINITY;
        boolean z = Math.abs(dHypot) < 1.0E-6d || Double.isInfinite(flyTo$r) || Double.isInfinite(flyTo$r2);
        final double dAbs = (z ? Math.abs(Math.log(dPow2 / dMax)) : flyTo$r2 - flyTo$r) / 1.42d;
        final boolean z2 = z;
        final double d4 = dMax;
        EdgeInsets edgeInsets2 = edgeInsets;
        final double d5 = flyTo$r;
        TypeEvaluator typeEvaluator = new TypeEvaluator() { // from class: com.mapbox.maps.plugin.animation.CameraAnimatorsFactory$$ExternalSyntheticLambda0
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                double dTanh;
                float f2 = Float.isNaN(f) ? 0.0f : f;
                double d6 = f2;
                double d7 = dAbs;
                if (f2 == 1.0f) {
                    dTanh = 1.0d;
                } else if (z2) {
                    dTanh = 0.0d;
                } else {
                    double d8 = d5;
                    dTanh = ((((Math.tanh(((d6 * d7) * 1.42d) + d8) * Math.cosh(d8)) - Math.sinh(d8)) * d4) / 2.0164d) / dHypot;
                }
                MercatorCoordinate mercatorCoordinate = mercatorCoordinateProject;
                double x = mercatorCoordinate.getX();
                MercatorCoordinate mercatorCoordinate2 = mercatorCoordinateProject2;
                return this.f$0.mapProjectionDelegate.unproject(new MercatorCoordinate(((mercatorCoordinate2.getX() - mercatorCoordinate.getX()) * dTanh) + x, ((mercatorCoordinate2.getY() - mercatorCoordinate.getY()) * dTanh) + mercatorCoordinate.getY()), dPow);
            }
        };
        Object[] objArrCopyOf = Arrays.copyOf(new Point[]{pointWrapCoordinate}, 1);
        CameraAnimatorOptions cameraAnimatorOptions = new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf, objArrCopyOf.length), pointUnwrapForShortestPath, null);
        CameraAnimatorType cameraAnimatorType = CameraAnimatorType.CENTER;
        HashMap map = defaultAnimationParameters;
        CameraCenterAnimator cameraCenterAnimator = new CameraCenterAnimator(typeEvaluator, cameraAnimatorOptions, true, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(cameraAnimatorType));
        if (str != null) {
            cameraCenterAnimator.owner = str;
        }
        final boolean z3 = z;
        final double d6 = dMax;
        final double d7 = flyTo$r;
        ?? r9 = new CameraTypeEvaluator(dAbs, this, dLog, z3, dPow2, d6, d7) { // from class: com.mapbox.maps.plugin.animation.CameraAnimatorsFactory$getFlyTo$animators$4
            public final /* synthetic */ double $S;
            public final /* synthetic */ boolean $isClose;
            public final /* synthetic */ double $r0;
            public final /* synthetic */ double $startZoom;
            public final /* synthetic */ double $w0;
            public final /* synthetic */ double $w1;

            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj, Object obj2) {
                double dCosh;
                ((Number) obj).doubleValue();
                ((Number) obj2).doubleValue();
                if (Float.isNaN(f)) {
                    f = 0.0f;
                }
                double d8 = ((double) f) * this.$S;
                if (this.$isClose) {
                    dCosh = Math.exp(((double) (this.$w1 < this.$w0 ? -1 : 1)) * 1.42d * d8);
                } else {
                    double d9 = this.$r0;
                    dCosh = Math.cosh(d9) / Math.cosh((d8 * 1.42d) + d9);
                }
                return Double.valueOf((Math.log(1.0d / dCosh) / displayInAppMessagelambda5.write) + this.$startZoom);
            }

            {
                this.$startZoom = dLog;
                this.$isClose = z3;
                this.$w1 = dPow2;
                this.$w0 = d6;
                this.$r0 = d7;
            }

            @Override // com.mapbox.maps.plugin.animation.animator.CameraTypeEvaluator
            public final boolean canSkip(Serializable serializable, Object obj, Object[] objArr) {
                serializable.getClass();
                obj.getClass();
                objArr.getClass();
                return this.$S == 0.0d;
            }
        };
        Object[] objArrCopyOf2 = Arrays.copyOf(new Double[]{Double.valueOf(d)}, 1);
        CameraZoomAnimator cameraZoomAnimator = new CameraZoomAnimator(r9, new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length), Double.valueOf(dLog), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.ZOOM));
        if (str != null) {
            cameraZoomAnimator.owner = str;
        }
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new CameraAnimator[]{cameraCenterAnimator, cameraZoomAnimator}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
        if (dDoubleValue2 != bearing2) {
            Object[] objArrCopyOf3 = Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue2)}, 1);
            CameraBearingAnimator cameraBearingAnimator = new CameraBearingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length), Double.valueOf(bearing2), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.BEARING));
            if (str != null) {
                cameraBearingAnimator.owner = str;
            }
            arrayList.add(cameraBearingAnimator);
        }
        if (dDoubleValue3 != pitch) {
            Object[] objArrCopyOf4 = Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue3)}, 1);
            CameraPitchAnimator cameraPitchAnimator = new CameraPitchAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length), Double.valueOf(pitch), null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.PITCH));
            if (str != null) {
                cameraPitchAnimator.owner = str;
            }
            arrayList.add(cameraPitchAnimator);
        }
        if (!edgeInsets2.equals(padding)) {
            Object[] objArrCopyOf5 = Arrays.copyOf(new EdgeInsets[]{edgeInsets2}, 1);
            CameraPaddingAnimator cameraPaddingAnimator = new CameraPaddingAnimator(new CameraAnimatorOptions(Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length), padding, null), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) map.get(CameraAnimatorType.PADDING));
            if (str != null) {
                cameraPaddingAnimator.owner = str;
            }
            arrayList.add(cameraPaddingAnimator);
        }
        Object[] array = arrayList.toArray(new CameraAnimator[0]);
        array.getClass();
        return (CameraAnimator[]) array;
    }

    public CameraAnimatorsFactory(MapDelegateProviderImpl mapDelegateProviderImpl) {
        mapDelegateProviderImpl.getClass();
        this.mapTransformDelegate = (MapboxMap) mapDelegateProviderImpl.mapTransformDelegate;
        this.mapProjectionDelegate = (MapboxMap) mapDelegateProviderImpl.mapProjectionDelegate;
        this.mapCameraManagerDelegate = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
    }

    static {
        new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);
        DEFAULT_INTERPOLATOR = new restore(0);
        HashMap map = new HashMap();
        map.put(CameraAnimatorType.ANCHOR, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE);
        map.put(CameraAnimatorType.BEARING, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE$1);
        map.put(CameraAnimatorType.PADDING, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE$2);
        map.put(CameraAnimatorType.PITCH, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE$3);
        map.put(CameraAnimatorType.CENTER, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE$4);
        map.put(CameraAnimatorType.ZOOM, CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$1.INSTANCE$5);
        defaultAnimationParameters = map;
    }

    public static final double getFlyTo$r(double d, double d2, double d3, int i) {
        double d4 = (((((((double) (i == 0 ? 1 : -1)) * 2.0164d) * 2.0164d) * d3) * d3) + ((d * d) - (d2 * d2))) / ((((i == 0 ? d2 : d) * 2.0d) * 2.0164d) * d3);
        return Math.log(Math.sqrt((d4 * d4) + 1.0d) - d4);
    }
}
