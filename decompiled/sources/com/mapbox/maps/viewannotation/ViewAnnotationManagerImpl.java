package com.mapbox.maps.viewannotation;

import android.graphics.Rect;
import android.os.Looper;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.DelegatingViewAnnotationPositionDescriptor;
import com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxDelicateApi;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxViewAnnotationException;
import com.mapbox.maps.ProjectedMeters;
import com.mapbox.maps.R;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.util.CameraOptionsUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContentCardAdapterExternalSyntheticLambda0;
import o.createFromParcel;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setImageLevel;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationManagerImpl extends DelegatingViewAnnotationPositionsUpdateListener implements ViewAnnotationManager {
    public static final Companion Companion = new Companion(null);
    private static final String EXCEPTION_TEXT_FEATURE_IS_NULL = "Annotated feature can not be null!";
    private static final int MAX_ADJUST_BOUNDS_COUNTER = 2;
    private static final String TAG = "ViewAnnotationImpl";
    private static final int USER_FIXED_DIMENSION = -1;
    private List<DelegatingViewAnnotationPositionDescriptor> currentPositionDescriptors;
    private final MapboxMap mapboxMap;
    private final float pixelRatio;
    private final MapboxRenderThread renderThread;
    private volatile List<DelegatingViewAnnotationPositionDescriptor> updatedPositionDescriptors;
    private final Map<String, ViewAnnotation> viewAnnotations;
    private final FrameLayout viewAnnotationsLayout;
    private final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> viewUpdatedListenerSet;

    public static final class ViewAnnotation {
        private View.OnAttachStateChangeListener attachStateListener;
        private boolean handleVisibilityAutomatically;
        private final String id;
        private boolean isPositioned;
        private int measuredHeight;
        private int measuredWidth;
        private DelegatingViewAnnotationPositionDescriptor positionDescriptor;
        private final View view;
        private ViewGroup.LayoutParams viewLayoutParams;
        private ViewAnnotationVisibility visibility;

        public final View component1() {
            return this.view;
        }

        public final String component10() {
            return this.id;
        }

        public final ViewGroup.LayoutParams component2() {
            return this.viewLayoutParams;
        }

        public final View.OnAttachStateChangeListener component3() {
            return this.attachStateListener;
        }

        public final boolean component4() {
            return this.handleVisibilityAutomatically;
        }

        public final ViewAnnotationVisibility component5() {
            return this.visibility;
        }

        public final int component6() {
            return this.measuredWidth;
        }

        public final int component7() {
            return this.measuredHeight;
        }

        public final DelegatingViewAnnotationPositionDescriptor component8() {
            return this.positionDescriptor;
        }

        public final boolean component9() {
            return this.isPositioned;
        }

        public final View.OnAttachStateChangeListener getAttachStateListener() {
            return this.attachStateListener;
        }

        public final boolean getHandleVisibilityAutomatically() {
            return this.handleVisibilityAutomatically;
        }

        public final String getId() {
            return this.id;
        }

        public final int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final DelegatingViewAnnotationPositionDescriptor getPositionDescriptor() {
            return this.positionDescriptor;
        }

        public final View getView() {
            return this.view;
        }

        public final ViewGroup.LayoutParams getViewLayoutParams() {
            return this.viewLayoutParams;
        }

        public final ViewAnnotationVisibility getVisibility() {
            return this.visibility;
        }

        public final boolean isPositioned() {
            return this.isPositioned;
        }

        public final void setAttachStateListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
            this.attachStateListener = onAttachStateChangeListener;
        }

        public final void setHandleVisibilityAutomatically(boolean z) {
            this.handleVisibilityAutomatically = z;
        }

        public final void setMeasuredHeight(int i) {
            this.measuredHeight = i;
        }

        public final void setMeasuredWidth(int i) {
            this.measuredWidth = i;
        }

        public final void setPositionDescriptor(DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
        }

        public final void setPositioned(boolean z) {
            this.isPositioned = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6, types: [int] */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [int] */
        /* JADX WARN: Type inference failed for: r5v2 */
        public int hashCode() {
            int iHashCode = this.view.hashCode();
            int iHashCode2 = this.viewLayoutParams.hashCode();
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
            int iHashCode3 = onAttachStateChangeListener == null ? 0 : onAttachStateChangeListener.hashCode();
            boolean z = this.handleVisibilityAutomatically;
            ?? r4 = z;
            if (z) {
                r4 = 1;
            }
            int iM = af$$ExternalSyntheticOutline0.m(this.measuredHeight, af$$ExternalSyntheticOutline0.m(this.measuredWidth, (this.visibility.hashCode() + ((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + r4) * 31)) * 31, 31), 31);
            DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor = this.positionDescriptor;
            int iHashCode4 = delegatingViewAnnotationPositionDescriptor != null ? delegatingViewAnnotationPositionDescriptor.hashCode() : 0;
            boolean z2 = this.isPositioned;
            return this.id.hashCode() + ((((iM + iHashCode4) * 31) + (z2 ? 1 : z2)) * 31);
        }

        public final boolean isVisible() {
            ViewAnnotationVisibility viewAnnotationVisibility = this.visibility;
            return viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
        }

        public final ViewAnnotation copy(View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z, ViewAnnotationVisibility viewAnnotationVisibility, int i, int i2, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z2, String str) {
            view.getClass();
            layoutParams.getClass();
            viewAnnotationVisibility.getClass();
            str.getClass();
            return new ViewAnnotation(view, layoutParams, onAttachStateChangeListener, z, viewAnnotationVisibility, i, i2, delegatingViewAnnotationPositionDescriptor, z2, str);
        }

        public final void setViewLayoutParams(ViewGroup.LayoutParams layoutParams) {
            layoutParams.getClass();
            this.viewLayoutParams = layoutParams;
        }

        public final void setVisibility(ViewAnnotationVisibility viewAnnotationVisibility) {
            viewAnnotationVisibility.getClass();
            this.visibility = viewAnnotationVisibility;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAnnotation)) {
                return false;
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.view, viewAnnotation.view}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.viewLayoutParams, viewAnnotation.viewLayoutParams}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.attachStateListener, viewAnnotation.attachStateListener}, getCieXyz.write())).booleanValue() || this.handleVisibilityAutomatically != viewAnnotation.handleVisibilityAutomatically || this.visibility != viewAnnotation.visibility || this.measuredWidth != viewAnnotation.measuredWidth || this.measuredHeight != viewAnnotation.measuredHeight) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.positionDescriptor, viewAnnotation.positionDescriptor}, getCieXyz.write())).booleanValue() || this.isPositioned != viewAnnotation.isPositioned) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, viewAnnotation.id}, getCieXyz.write())).booleanValue();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewAnnotation(view=");
            sb.append(this.view);
            sb.append(", viewLayoutParams=");
            sb.append(this.viewLayoutParams);
            sb.append(", attachStateListener=");
            sb.append(this.attachStateListener);
            sb.append(", handleVisibilityAutomatically=");
            sb.append(this.handleVisibilityAutomatically);
            sb.append(", visibility=");
            sb.append(this.visibility);
            sb.append(", measuredWidth=");
            sb.append(this.measuredWidth);
            sb.append(", measuredHeight=");
            sb.append(this.measuredHeight);
            sb.append(", positionDescriptor=");
            sb.append(this.positionDescriptor);
            sb.append(", isPositioned=");
            sb.append(this.isPositioned);
            sb.append(", id=");
            return ff$$ExternalSyntheticOutline0.m(sb, this.id, ')');
        }

        public /* synthetic */ ViewAnnotation(View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z, ViewAnnotationVisibility viewAnnotationVisibility, int i, int i2, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, layoutParams, (i3 & 4) != 0 ? null : onAttachStateChangeListener, z, viewAnnotationVisibility, i, i2, delegatingViewAnnotationPositionDescriptor, z2, (i3 & Fields.RotationY) != 0 ? d$$ExternalSyntheticOutline0.m() : str);
        }

        public ViewAnnotation(View view, ViewGroup.LayoutParams layoutParams, View.OnAttachStateChangeListener onAttachStateChangeListener, boolean z, ViewAnnotationVisibility viewAnnotationVisibility, int i, int i2, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z2, String str) {
            view.getClass();
            layoutParams.getClass();
            viewAnnotationVisibility.getClass();
            str.getClass();
            this.view = view;
            this.viewLayoutParams = layoutParams;
            this.attachStateListener = onAttachStateChangeListener;
            this.handleVisibilityAutomatically = z;
            this.visibility = viewAnnotationVisibility;
            this.measuredWidth = i;
            this.measuredHeight = i2;
            this.positionDescriptor = delegatingViewAnnotationPositionDescriptor;
            this.isPositioned = z2;
            this.id = str;
        }
    }

    @MapboxExperimental
    public static /* synthetic */ void getViewAnnotationAvoidLayers$annotations() {
    }

    public static /* synthetic */ void getViewUpdatedListenerSet$maps_sdk_release$annotations() {
    }

    private final void measureView(View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        boolean z = view.getTag(R.id.composeView) != null;
        if (z) {
            this.viewAnnotationsLayout.addView(view);
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (z) {
            this.viewAnnotationsLayout.removeView(view);
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final CopyOnWriteArraySet<OnViewAnnotationUpdatedListener> getViewUpdatedListenerSet$maps_sdk_release() {
        return this.viewUpdatedListenerSet;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean needToReorderZ$maps_sdk_release(List<DelegatingViewAnnotationPositionDescriptor> list, List<DelegatingViewAnnotationPositionDescriptor> list2) {
            list.getClass();
            list2.getClass();
            if (list.size() < list2.size()) {
                return true;
            }
            if (!list.isEmpty() && !list2.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                while (i2 < list.size() && i < list2.size()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i2).getIdentifier(), list2.get(i).getIdentifier()}, getCieXyz.write())).booleanValue()) {
                        if (!linkedHashSet.contains(list2.get(i).getIdentifier())) {
                            while (i2 < list.size()) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(i2).getIdentifier(), list2.get(i).getIdentifier()}, getCieXyz.write())).booleanValue()) {
                                    break;
                                }
                                String identifier = list.get(i2).getIdentifier();
                                identifier.getClass();
                                linkedHashSet.add(identifier);
                                i2++;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        i2++;
                        i++;
                    }
                }
                while (i < list2.size()) {
                    if (linkedHashSet.contains(list2.get(i).getIdentifier())) {
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$buildAttachStateListener$1] */
    private final AnonymousClass1 buildAttachStateListener(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, final ViewTreeObserver.OnDrawListener onDrawListener) {
        return new View.OnAttachStateChangeListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl.buildAttachStateListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                view2.getClass();
                view.getViewTreeObserver().addOnDrawListener(onDrawListener);
                view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.getClass();
                view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }

    private final ViewTreeObserver.OnDrawListener buildDrawListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnDrawListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                ViewAnnotationManagerImpl.buildDrawListener$lambda$21(viewAnnotation, this);
            }
        };
    }

    private final ViewTreeObserver.OnGlobalLayoutListener buildGlobalLayoutListener(final ViewAnnotation viewAnnotation) {
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewAnnotationManagerImpl.buildGlobalLayoutListener$lambda$22(viewAnnotation, this);
            }
        };
    }

    private final Point coordinate(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null) {
            return null;
        }
        AnnotatedFeature annotatedFeature = viewAnnotationOptions.getAnnotatedFeature();
        annotatedFeature.getClass();
        if (!annotatedFeature.isGeometry()) {
            if (delegatingViewAnnotationPositionDescriptor != null) {
                return delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate();
            }
            return null;
        }
        AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
        annotatedFeature2.getClass();
        Geometry geometry = annotatedFeature2.getGeometry();
        if (geometry instanceof Point) {
            return (Point) geometry;
        }
        return null;
    }

    private final Rect getViewAnnotationOptionsFrame(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        int iDoubleValue;
        int iDoubleValue2;
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfigBuild;
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
        if (viewAnnotationOptions == null || viewAnnotationOptions.getWidth() == null || viewAnnotationOptions.getHeight() == null) {
            return null;
        }
        Double width = viewAnnotationOptions.getWidth();
        width.getClass();
        if (width.doubleValue() > 0.0d) {
            Double width2 = viewAnnotationOptions.getWidth();
            width2.getClass();
            iDoubleValue = (int) (width2.doubleValue() * 0.5d);
        } else {
            iDoubleValue = 0;
        }
        Double height = viewAnnotationOptions.getHeight();
        height.getClass();
        if (height.doubleValue() > 0.0d) {
            Double height2 = viewAnnotationOptions.getHeight();
            height2.getClass();
            iDoubleValue2 = (int) (height2.doubleValue() * 0.5d);
        } else {
            iDoubleValue2 = 0;
        }
        int i = -iDoubleValue;
        int i2 = -iDoubleValue2;
        Rect rect = new Rect(i, i2, iDoubleValue, iDoubleValue2);
        if (delegatingViewAnnotationPositionDescriptor == null || (viewAnnotationAnchorConfigBuild = delegatingViewAnnotationPositionDescriptor.getAnchorConfig()) == null) {
            viewAnnotationAnchorConfigBuild = new ViewAnnotationAnchorConfig.Builder().anchor(ViewAnnotationAnchor.CENTER).build();
        }
        switch (WhenMappings.$EnumSwitchMapping$0[viewAnnotationAnchorConfigBuild.getAnchor().ordinal()]) {
            case 1:
                rect.offset(0, iDoubleValue2);
                break;
            case 2:
                rect.offset(iDoubleValue, iDoubleValue2);
                break;
            case 3:
                rect.offset(i, iDoubleValue2);
                break;
            case 4:
                rect.offset(0, i2);
                break;
            case 5:
                rect.offset(iDoubleValue, i2);
                break;
            case 6:
                rect.offset(i, i2);
                break;
            case 7:
                rect.offset(iDoubleValue, 0);
                break;
            case 8:
                rect.offset(i, 0);
                break;
            default:
                rect.offset(0, 0);
                break;
        }
        rect.offset((int) viewAnnotationAnchorConfigBuild.getOffsetX(), (int) viewAnnotationAnchorConfigBuild.getOffsetY());
        return rect;
    }

    private final void notifyPositionListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z) {
        if (!z) {
            DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{positionDescriptor != null ? positionDescriptor.getLeftTopCoordinate() : null, delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate()}, getCieXyz.write())).booleanValue()) {
                DelegatingViewAnnotationPositionDescriptor positionDescriptor2 = viewAnnotation.getPositionDescriptor();
                if (removeNodeAtDepth.read(positionDescriptor2 != null ? Double.valueOf(positionDescriptor2.getWidth()) : null, delegatingViewAnnotationPositionDescriptor.getWidth())) {
                    DelegatingViewAnnotationPositionDescriptor positionDescriptor3 = viewAnnotation.getPositionDescriptor();
                    if (removeNodeAtDepth.read(positionDescriptor3 != null ? Double.valueOf(positionDescriptor3.getHeight()) : null, delegatingViewAnnotationPositionDescriptor.getHeight())) {
                        return;
                    }
                }
            }
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ScreenCoordinate leftTopCoordinate = delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate();
            leftTopCoordinate.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationPositionUpdated(view, leftTopCoordinate, delegatingViewAnnotationPositionDescriptor.getWidth(), delegatingViewAnnotationPositionDescriptor.getHeight());
        }
    }

    private final void positionAnnotationViews(List<DelegatingViewAnnotationPositionDescriptor> list) {
        boolean zNeedToReorderZ$maps_sdk_release = Companion.needToReorderZ$maps_sdk_release(this.currentPositionDescriptors, list);
        this.currentPositionDescriptors = list;
        for (DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor : list) {
            ViewAnnotation viewAnnotation = this.viewAnnotations.get(delegatingViewAnnotationPositionDescriptor.getIdentifier());
            if (viewAnnotation != null) {
                View view = viewAnnotation.getView();
                view.setTranslationX((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getX());
                view.setTranslationY((float) delegatingViewAnnotationPositionDescriptor.getLeftTopCoordinate().getY());
                ViewGroup.LayoutParams viewLayoutParams = viewAnnotation.getViewLayoutParams();
                if (viewAnnotation.getMeasuredWidth() == -1) {
                    viewLayoutParams.width = (int) delegatingViewAnnotationPositionDescriptor.getWidth();
                }
                if (viewAnnotation.getMeasuredHeight() == -1) {
                    viewLayoutParams.height = (int) delegatingViewAnnotationPositionDescriptor.getHeight();
                }
                if (!viewAnnotation.isVisible() && this.viewAnnotationsLayout.indexOfChild(viewAnnotation.getView()) == -1) {
                    viewAnnotation.setPositioned(true);
                    this.viewAnnotationsLayout.addView(viewAnnotation.getView(), viewAnnotation.getViewLayoutParams());
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, viewAnnotation.getView().getVisibility() == 0 ? ViewAnnotationVisibility.VISIBLE_AND_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                }
                if (viewAnnotation.isPositioned()) {
                    notifyPositionListeners$default(this, viewAnnotation, delegatingViewAnnotationPositionDescriptor, false, 4, null);
                } else {
                    viewAnnotation.setPositioned(true);
                    viewAnnotation.getView().setVisibility(0);
                    updateVisibilityAndNotifyUpdateListeners(viewAnnotation, ViewAnnotationVisibility.VISIBLE_AND_POSITIONED);
                    notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor, true);
                }
                notifyAnchorListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                notifyAnchorCoordinateListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor);
                viewAnnotation.setPositionDescriptor(delegatingViewAnnotationPositionDescriptor);
                if (zNeedToReorderZ$maps_sdk_release) {
                    viewAnnotation.getView().bringToFront();
                }
            }
        }
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            if (entry.getValue().getView().getVisibility() == 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            List<DelegatingViewAnnotationPositionDescriptor> list2 = this.currentPositionDescriptors;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((DelegatingViewAnnotationPositionDescriptor) it.next()).getIdentifier(), entry2.getKey()}, getCieXyz.write())).booleanValue());
            }
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (it2.hasNext()) {
            ViewAnnotation viewAnnotation2 = (ViewAnnotation) ((Map.Entry) it2.next()).getValue();
            this.viewAnnotationsLayout.removeView(viewAnnotation2.getView());
            updateVisibilityAndNotifyUpdateListeners(viewAnnotation2, ViewAnnotationVisibility.INVISIBLE);
        }
    }

    private final void remove(ViewAnnotation viewAnnotation) {
        this.viewAnnotationsLayout.removeView(viewAnnotation.getView());
        updateVisibilityAndNotifyUpdateListeners(viewAnnotation, ViewAnnotationVisibility.INVISIBLE);
        View.OnAttachStateChangeListener attachStateListener = viewAnnotation.getAttachStateListener();
        if (attachStateListener != null) {
            attachStateListener.onViewDetachedFromWindow(viewAnnotation.getView());
        }
        viewAnnotation.getView().removeOnAttachStateChangeListener(viewAnnotation.getAttachStateListener());
        viewAnnotation.setAttachStateListener(null);
        Expected expectedRemoveViewAnnotation$maps_sdk_release = this.mapboxMap.removeViewAnnotation$maps_sdk_release(viewAnnotation.getId());
        if (expectedRemoveViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedRemoveViewAnnotation$maps_sdk_release.getError());
        }
        expectedRemoveViewAnnotation$maps_sdk_release.getValue();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public HashSet<String> getViewAnnotationAvoidLayers() {
        return this.mapboxMap.getViewAnnotationAvoidLayers$maps_sdk_release();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationUpdateMode getViewAnnotationUpdateMode() {
        return this.renderThread.getViewAnnotationMode$maps_sdk_release();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeAllViewAnnotations() {
        Iterator<Map.Entry<String, ViewAnnotation>> it = this.viewAnnotations.entrySet().iterator();
        while (it.hasNext()) {
            remove(it.next().getValue());
            it.remove();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewAnnotationAnchor.values().length];
            try {
                iArr[ViewAnnotationAnchor.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewAnnotationAnchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ViewAnnotationAnchor.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ViewAnnotationAnchor.LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ViewAnnotationAnchor.RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout) {
        mapView.getClass();
        frameLayout.getClass();
        this.viewAnnotationsLayout = frameLayout;
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        this.mapboxMap = mapboxMapDeprecated;
        this.renderThread = mapView.getMapController$maps_sdk_release().getRenderer$maps_sdk_release().getRenderThread$maps_sdk_release();
        this.pixelRatio = mapView.getResources().getDisplayMetrics().density;
        this.viewAnnotations = new LinkedHashMap();
        this.viewUpdatedListenerSet = new CopyOnWriteArraySet<>();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.updatedPositionDescriptors = instance_delegatelambda0Var;
        this.currentPositionDescriptors = instance_delegatelambda0Var;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mapView.addView(frameLayout, 1);
        mapView.requestDisallowInterceptTouchEvent(false);
        mapboxMapDeprecated.setViewAnnotationPositionsUpdateListener$maps_sdk_release(this);
    }

    private static final void addViewAnnotation$lambda$0(ViewAnnotationManagerImpl viewAnnotationManagerImpl, ViewAnnotationOptions viewAnnotationOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, View view, int i, ViewGroup viewGroup) {
        viewAnnotationManagerImpl.getClass();
        viewAnnotationOptions.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        view.getClass();
        viewAnnotationManagerImpl.prepareViewAnnotation(view, viewAnnotationOptions);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildDrawListener$lambda$21(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl viewAnnotationManagerImpl) {
        viewAnnotation.getClass();
        viewAnnotationManagerImpl.getClass();
        if (viewAnnotation.getHandleVisibilityAutomatically()) {
            boolean z = viewAnnotation.getView().getVisibility() == 0;
            if (z && viewAnnotation.isVisible()) {
                return;
            }
            if (z || viewAnnotation.getVisibility() != ViewAnnotationVisibility.INVISIBLE) {
                if (z || viewAnnotation.getVisibility() != ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED) {
                    if (z) {
                        ViewAnnotation viewAnnotation2 = viewAnnotationManagerImpl.viewAnnotations.get(viewAnnotation.getId());
                        if (viewAnnotation2 != null) {
                            viewAnnotation2.setPositioned(false);
                        }
                        viewAnnotation.getView().setVisibility(4);
                    }
                    viewAnnotationManagerImpl.updateVisibilityAndNotifyUpdateListeners(viewAnnotation, z ? ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED : ViewAnnotationVisibility.INVISIBLE);
                    Expected viewAnnotationOptions$maps_sdk_release = viewAnnotationManagerImpl.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
                    if (viewAnnotationOptions$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
                    }
                    ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
                    if (viewAnnotationOptions != null) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{viewAnnotationOptions.getVisible(), Boolean.valueOf(z)}, getCieXyz.write())).booleanValue()) {
                            return;
                        }
                    }
                    MapboxMap mapboxMap = viewAnnotationManagerImpl.mapboxMap;
                    String id = viewAnnotation.getId();
                    ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().visible(Boolean.valueOf(z)).build();
                    viewAnnotationOptionsBuild.getClass();
                    Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id, viewAnnotationOptionsBuild);
                    if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                        throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
                    }
                    expectedUpdateViewAnnotation$maps_sdk_release.getValue();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildGlobalLayoutListener$lambda$22(ViewAnnotation viewAnnotation, ViewAnnotationManagerImpl viewAnnotationManagerImpl) {
        viewAnnotation.getClass();
        viewAnnotationManagerImpl.getClass();
        if (viewAnnotation.getMeasuredWidth() != -1 && viewAnnotation.getView().getMeasuredWidth() > 0 && viewAnnotation.getView().getMeasuredWidth() != viewAnnotation.getMeasuredWidth()) {
            viewAnnotation.setMeasuredWidth(viewAnnotation.getView().getMeasuredWidth());
            MapboxMap mapboxMap = viewAnnotationManagerImpl.mapboxMap;
            String id = viewAnnotation.getId();
            ViewAnnotationOptions viewAnnotationOptionsBuild = new ViewAnnotationOptions.Builder().width(Double.valueOf(viewAnnotation.getView().getMeasuredWidth())).build();
            viewAnnotationOptionsBuild.getClass();
            Expected expectedUpdateViewAnnotation$maps_sdk_release = mapboxMap.updateViewAnnotation$maps_sdk_release(id, viewAnnotationOptionsBuild);
            if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
            }
            expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        }
        if (viewAnnotation.getMeasuredHeight() == -1 || viewAnnotation.getView().getMeasuredHeight() <= 0 || viewAnnotation.getView().getMeasuredHeight() == viewAnnotation.getMeasuredHeight()) {
            return;
        }
        viewAnnotation.setMeasuredHeight(viewAnnotation.getView().getMeasuredHeight());
        MapboxMap mapboxMap2 = viewAnnotationManagerImpl.mapboxMap;
        String id2 = viewAnnotation.getId();
        ViewAnnotationOptions viewAnnotationOptionsBuild2 = new ViewAnnotationOptions.Builder().height(Double.valueOf(viewAnnotation.getView().getMeasuredHeight())).build();
        viewAnnotationOptionsBuild2.getClass();
        Expected expectedUpdateViewAnnotation$maps_sdk_release2 = mapboxMap2.updateViewAnnotation$maps_sdk_release(id2, viewAnnotationOptionsBuild2);
        if (expectedUpdateViewAnnotation$maps_sdk_release2.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release2.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDelegatingViewAnnotationPositionsUpdate$lambda$20(ViewAnnotationManagerImpl viewAnnotationManagerImpl, List list, long j) {
        viewAnnotationManagerImpl.getClass();
        list.getClass();
        viewAnnotationManagerImpl.positionAnnotationViews(list);
    }

    private final void prepareViewAnnotation(View view, ViewAnnotationOptions viewAnnotationOptions) {
        measureView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        int measuredWidth = layoutParams.width;
        if (measuredWidth < 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        int measuredHeight = layoutParams.height;
        if (measuredHeight < 0) {
            measuredHeight = view.getMeasuredHeight();
        }
        ViewAnnotationOptions.Builder builder = viewAnnotationOptions.toBuilder();
        Double width = viewAnnotationOptions.getWidth();
        if (width == null) {
            width = Double.valueOf(measuredWidth);
        }
        ViewAnnotationOptions.Builder builderWidth = builder.width(width);
        Double height = viewAnnotationOptions.getHeight();
        if (height == null) {
            height = Double.valueOf(measuredHeight);
        }
        ViewAnnotationOptions viewAnnotationOptionsBuild = builderWidth.height(height).build();
        ViewAnnotation viewAnnotation = new ViewAnnotation(view, layoutParams, null, viewAnnotationOptions.getVisible() == null, ViewAnnotationVisibility.INITIAL, viewAnnotationOptions.getWidth() != null ? -1 : measuredWidth, viewAnnotationOptions.getHeight() != null ? -1 : measuredHeight, null, false, null, 516, null);
        viewAnnotation.setAttachStateListener(buildAttachStateListener(viewAnnotation.getView(), buildGlobalLayoutListener(viewAnnotation), buildDrawListener(viewAnnotation)));
        view.addOnAttachStateChangeListener(viewAnnotation.getAttachStateListener());
        this.viewAnnotations.put(viewAnnotation.getId(), viewAnnotation);
        MapboxMap mapboxMap = this.mapboxMap;
        String id = viewAnnotation.getId();
        viewAnnotationOptionsBuild.getClass();
        Expected expectedAddViewAnnotation$maps_sdk_release = mapboxMap.addViewAnnotation$maps_sdk_release(id, viewAnnotationOptionsBuild);
        if (expectedAddViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedAddViewAnnotation$maps_sdk_release.getError());
        }
        expectedAddViewAnnotation$maps_sdk_release.getValue();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        onViewAnnotationUpdatedListener.getClass();
        this.viewUpdatedListenerSet.add(onViewAnnotationUpdatedListener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(View view, ViewAnnotationOptions viewAnnotationOptions) {
        view.getClass();
        viewAnnotationOptions.getClass();
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{it.next().getValue().getView(), view}, getCieXyz.write())).booleanValue()) {
                    throw new MapboxViewAnnotationException("Trying to add view annotation that was already added before! Please consider deleting annotation view (" + view + ") beforehand.");
                }
            }
        }
        validateOptions(viewAnnotationOptions);
        prepareViewAnnotation(view, viewAnnotationOptions);
    }

    public final void destroy() {
        this.mapboxMap.setViewAnnotationPositionsUpdateListener$maps_sdk_release(null);
        this.viewUpdatedListenerSet.clear();
        removeAllViewAnnotations();
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View getViewAnnotation(AnnotatedLayerFeature annotatedLayerFeature) {
        annotatedLayerFeature.getClass();
        return (View) findByAnnotatedLayerFeature(annotatedLayerFeature).serializer;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(View view) {
        Object next;
        view.getClass();
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ViewAnnotation) next).getView(), view}, getCieXyz.write())).booleanValue());
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return null;
        }
        Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(viewAnnotation.getId());
        if (viewAnnotationOptions$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
        }
        return (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
    }

    @Override // com.mapbox.maps.DelegatingViewAnnotationPositionsUpdateListener
    public void onDelegatingViewAnnotationPositionsUpdate(List<DelegatingViewAnnotationPositionDescriptor> list) {
        list.getClass();
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            final List<DelegatingViewAnnotationPositionDescriptor> list2 = this.updatedPositionDescriptors;
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl$$ExternalSyntheticLambda0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ViewAnnotationManagerImpl.onDelegatingViewAnnotationPositionsUpdate$lambda$20(this.f$0, list2, j);
                }
            });
        } else {
            this.renderThread.setNeedViewAnnotationSync$maps_sdk_release(true);
            this.updatedPositionDescriptors = list;
        }
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void removeOnViewAnnotationUpdatedListener(OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener) {
        onViewAnnotationUpdatedListener.getClass();
        this.viewUpdatedListenerSet.remove(onViewAnnotationUpdatedListener);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean removeViewAnnotation(View view) {
        Object next;
        Object[] objArr;
        view.getClass();
        Iterator<T> it = this.viewAnnotations.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            objArr = new Object[]{((ViewAnnotation) ((Map.Entry) next).getValue()).getView(), view};
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        String str = (String) entry.getKey();
        ViewAnnotation viewAnnotation = (ViewAnnotation) entry.getValue();
        this.viewAnnotations.remove(str);
        remove(viewAnnotation);
        return true;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationAvoidLayers(HashSet<String> hashSet) {
        hashSet.getClass();
        this.mapboxMap.setViewAnnotationAvoidLayers$maps_sdk_release(hashSet);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void setViewAnnotationUpdateMode(ViewAnnotationUpdateMode viewAnnotationUpdateMode) {
        viewAnnotationUpdateMode.getClass();
        this.renderThread.setViewAnnotationMode$maps_sdk_release(viewAnnotationUpdateMode);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public boolean updateViewAnnotation(View view, ViewAnnotationOptions viewAnnotationOptions) {
        Object next;
        view.getClass();
        viewAnnotationOptions.getClass();
        Iterator<T> it = this.viewAnnotations.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ViewAnnotation) next).getView(), view}, getCieXyz.write())).booleanValue());
        ViewAnnotation viewAnnotation = (ViewAnnotation) next;
        if (viewAnnotation == null) {
            return false;
        }
        viewAnnotation.setHandleVisibilityAutomatically(viewAnnotationOptions.getVisible() == null);
        if (viewAnnotationOptions.getWidth() != null) {
            viewAnnotation.setMeasuredWidth(-1);
        }
        if (viewAnnotationOptions.getHeight() != null) {
            viewAnnotation.setMeasuredHeight(-1);
        }
        Expected expectedUpdateViewAnnotation$maps_sdk_release = this.mapboxMap.updateViewAnnotation$maps_sdk_release(viewAnnotation.getId(), viewAnnotationOptions);
        if (expectedUpdateViewAnnotation$maps_sdk_release.isError()) {
            throw new MapboxViewAnnotationException((String) expectedUpdateViewAnnotation$maps_sdk_release.getError());
        }
        expectedUpdateViewAnnotation$maps_sdk_release.getValue();
        return true;
    }

    private final CoordinateBounds calculateCoordinateBoundForAnnotation(ViewAnnotation viewAnnotation, Rect rect, Double d) {
        Point pointCoordinate = coordinate(viewAnnotation, viewAnnotation.getPositionDescriptor());
        if (pointCoordinate == null) {
            return null;
        }
        MapboxMap mapboxMap = this.mapboxMap;
        double metersPerPixelAtLatitude = d == null ? mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude()) : mapboxMap.getMetersPerPixelAtLatitude(pointCoordinate.latitude(), d.doubleValue());
        ProjectedMeters projectedMetersProjectedMetersForCoordinate = this.mapboxMap.projectedMetersForCoordinate(pointCoordinate);
        double d2 = metersPerPixelAtLatitude / ((double) this.pixelRatio);
        double northing = projectedMetersProjectedMetersForCoordinate.getNorthing();
        double dAbs = Math.abs(rect.top);
        double easting = projectedMetersProjectedMetersForCoordinate.getEasting();
        double dAbs2 = Math.abs(rect.right);
        return new CoordinateBounds(this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters(projectedMetersProjectedMetersForCoordinate.getNorthing() - (Math.abs(rect.bottom) * d2), projectedMetersProjectedMetersForCoordinate.getEasting() - (Math.abs(rect.left) * d2))), this.mapboxMap.coordinateForProjectedMeters(new ProjectedMeters((dAbs * d2) + northing, (dAbs2 * d2) + easting)));
    }

    private final onViewAttachedToWindowlambda0 findByAnnotatedLayerFeature(AnnotatedLayerFeature annotatedLayerFeature) {
        Object next;
        AnnotatedFeature annotatedFeature;
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, ViewAnnotation> entry : map.entrySet()) {
            String key = entry.getKey();
            View view = entry.getValue().getView();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(key);
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            arrayList.add(new onViewAttachedToWindowlambda0(view, viewAnnotationOptions$maps_sdk_release.getValue()));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) ((onViewAttachedToWindowlambda0) next).write;
            if (viewAnnotationOptions != null && (annotatedFeature = viewAnnotationOptions.getAnnotatedFeature()) != null && annotatedFeature.isAnnotatedLayerFeature()) {
                AnnotatedFeature annotatedFeature2 = viewAnnotationOptions.getAnnotatedFeature();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{annotatedFeature2 != null ? annotatedFeature2.getAnnotatedLayerFeature() : null, annotatedLayerFeature}, getCieXyz.write())).booleanValue()) {
                    break;
                }
            }
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) next;
        return onviewattachedtowindowlambda0 == null ? new onViewAttachedToWindowlambda0(null, null) : onviewattachedtowindowlambda0;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public Map<View, ViewAnnotationOptions> getAnnotations() {
        Map<String, ViewAnnotation> map = this.viewAnnotations;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ViewAnnotation>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ViewAnnotation value = it.next().getValue();
            Expected viewAnnotationOptions$maps_sdk_release = this.mapboxMap.getViewAnnotationOptions$maps_sdk_release(value.getId());
            if (viewAnnotationOptions$maps_sdk_release.isError()) {
                throw new MapboxViewAnnotationException((String) viewAnnotationOptions$maps_sdk_release.getError());
            }
            ViewAnnotationOptions viewAnnotationOptions = (ViewAnnotationOptions) viewAnnotationOptions$maps_sdk_release.getValue();
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = viewAnnotationOptions != null ? new onViewAttachedToWindowlambda0(value.getView(), viewAnnotationOptions) : null;
            if (onviewattachedtowindowlambda0 != null) {
                arrayList.add(onviewattachedtowindowlambda0);
            }
        }
        return onMove.serializer(arrayList);
    }

    public static /* synthetic */ void notifyPositionListeners$default(ViewAnnotationManagerImpl viewAnnotationManagerImpl, ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        viewAnnotationManagerImpl.notifyPositionListeners(viewAnnotation, delegatingViewAnnotationPositionDescriptor, z);
    }

    private final CameraOptions cameraForAnnotationsImpl(List<? extends View> list, final EdgeInsets edgeInsets, Double d, Double d2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((View) obj).getVisibility() == 0) {
                arrayList.add(obj);
            }
        }
        final ArrayList<ViewAnnotation> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            for (Object obj3 : this.viewAnnotations.values()) {
                Object[] objArr = {((ViewAnnotation) obj3).getView(), view};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    obj2 = obj3;
                    break;
                }
            }
            ViewAnnotation viewAnnotation = (ViewAnnotation) obj2;
            if (viewAnnotation != null) {
                arrayList2.add(viewAnnotation);
            }
        }
        if (arrayList2.isEmpty()) {
            return invokeCallbackAndReturn(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        ArrayList arrayList3 = new ArrayList();
        for (ViewAnnotation viewAnnotation2 : arrayList2) {
            Point pointCoordinate = coordinate(viewAnnotation2, viewAnnotation2.getPositionDescriptor());
            if (pointCoordinate != null) {
                arrayList3.add(pointCoordinate);
            }
        }
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.pitch(d2);
        builder.bearing(d);
        final CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        MapboxMap mapboxMap = this.mapboxMap;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            return adjustCameraForAnnotations(mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null), edgeInsets, arrayList2, cameraOptionsBuild, null);
        }
        mapboxMap.cameraForCoordinates(arrayList3, cameraOptionsBuild, new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.viewannotation.ViewAnnotationManagerImpl.cameraForAnnotationsImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(CameraOptions cameraOptions) {
                cameraOptions.getClass();
                ViewAnnotationManagerImpl.this.adjustCameraForAnnotations(cameraOptions, edgeInsets, arrayList2, cameraOptionsBuild, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                invoke((CameraOptions) obj4);
                return createFromParcel.INSTANCE;
            }
        });
        return null;
    }

    private final /* synthetic */ <V> V getValue(Expected<String, V> expected) {
        if (expected.isError()) {
            throw new MapboxViewAnnotationException(expected.getError());
        }
        return expected.getValue();
    }

    private final CameraOptions invokeCallbackAndReturn(CameraOptions cameraOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        CameraOptions cameraOptionsBuild;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            if (cameraOptions == null) {
                cameraOptionsBuild = new CameraOptions.Builder().build();
                cameraOptionsBuild.getClass();
            } else {
                cameraOptionsBuild = cameraOptions;
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(cameraOptionsBuild);
        }
        return cameraOptions;
    }

    private final void notifyAnchorCoordinateListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{positionDescriptor != null ? positionDescriptor.getAnchorCoordinate() : null, delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate()}, getCieXyz.write())).booleanValue()) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            Point anchorCoordinate = delegatingViewAnnotationPositionDescriptor.getAnchorCoordinate();
            anchorCoordinate.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorCoordinateUpdated(view, anchorCoordinate);
        }
    }

    private final void notifyAnchorListeners(ViewAnnotation viewAnnotation, DelegatingViewAnnotationPositionDescriptor delegatingViewAnnotationPositionDescriptor) {
        DelegatingViewAnnotationPositionDescriptor positionDescriptor = viewAnnotation.getPositionDescriptor();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{positionDescriptor != null ? positionDescriptor.getAnchorConfig() : null, delegatingViewAnnotationPositionDescriptor.getAnchorConfig()}, getCieXyz.write())).booleanValue()) {
            return;
        }
        for (OnViewAnnotationUpdatedListener onViewAnnotationUpdatedListener : this.viewUpdatedListenerSet) {
            View view = viewAnnotation.getView();
            ViewAnnotationAnchorConfig anchorConfig = delegatingViewAnnotationPositionDescriptor.getAnchorConfig();
            anchorConfig.getClass();
            onViewAnnotationUpdatedListener.onViewAnnotationAnchorUpdated(view, anchorConfig);
        }
    }

    private final void updateVisibilityAndNotifyUpdateListeners(ViewAnnotation viewAnnotation, ViewAnnotationVisibility viewAnnotationVisibility) {
        if (viewAnnotation.getVisibility() != viewAnnotationVisibility) {
            if (viewAnnotation.getVisibility() == ViewAnnotationVisibility.INITIAL && viewAnnotationVisibility == ViewAnnotationVisibility.INVISIBLE) {
                return;
            }
            boolean zIsVisible = viewAnnotation.isVisible();
            boolean z = viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_POSITIONED || viewAnnotationVisibility == ViewAnnotationVisibility.VISIBLE_AND_NOT_POSITIONED;
            viewAnnotation.setVisibility(viewAnnotationVisibility);
            if (this.viewUpdatedListenerSet.isEmpty() || z == zIsVisible) {
                return;
            }
            Iterator<T> it = this.viewUpdatedListenerSet.iterator();
            while (it.hasNext()) {
                ((OnViewAnnotationUpdatedListener) it.next()).onViewAnnotationVisibilityUpdated(viewAnnotation.getView(), z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraOptions adjustCameraForAnnotations(CameraOptions cameraOptions, EdgeInsets edgeInsets, List<ViewAnnotation> list, CameraOptions cameraOptions2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Double dValueOf = Double.valueOf(0.0d);
        int i = 0;
        Integer num = 0;
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            return invokeCallbackAndReturn(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        CameraOptions cameraOptionsCameraForCoordinates = cameraOptions;
        boolean z = false;
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 = null;
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda1 = null;
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda2 = null;
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda3 = null;
        int i2 = 1;
        while (!z && i2 <= 2) {
            Double zoom = cameraOptionsCameraForCoordinates.getZoom();
            i2++;
            ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda4 = contentCardAdapterExternalSyntheticLambda3;
            ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda5 = contentCardAdapterExternalSyntheticLambda2;
            ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda6 = contentCardAdapterExternalSyntheticLambda1;
            ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda7 = contentCardAdapterExternalSyntheticLambda0;
            boolean z2 = true;
            for (ViewAnnotation viewAnnotation : list) {
                Rect viewAnnotationOptionsFrame = getViewAnnotationOptionsFrame(viewAnnotation, viewAnnotation.getPositionDescriptor());
                if (viewAnnotationOptionsFrame == null) {
                    viewAnnotationOptionsFrame = new Rect(i, i, i, i);
                }
                CoordinateBounds coordinateBoundsCalculateCoordinateBoundForAnnotation = calculateCoordinateBoundForAnnotation(viewAnnotation, viewAnnotationOptionsFrame, zoom);
                if (coordinateBoundsCalculateCoordinateBoundForAnnotation != null) {
                    if (contentCardAdapterExternalSyntheticLambda7 == null || ((Number) contentCardAdapterExternalSyntheticLambda7.IconCompatParcelizer).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.north()) {
                        contentCardAdapterExternalSyntheticLambda7 = new ContentCardAdapterExternalSyntheticLambda0(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.north()));
                        z2 = false;
                    }
                    if (contentCardAdapterExternalSyntheticLambda4 == null || ((Number) contentCardAdapterExternalSyntheticLambda4.IconCompatParcelizer).doubleValue() < coordinateBoundsCalculateCoordinateBoundForAnnotation.east()) {
                        contentCardAdapterExternalSyntheticLambda4 = new ContentCardAdapterExternalSyntheticLambda0(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.east()));
                        z2 = false;
                    }
                    if (contentCardAdapterExternalSyntheticLambda6 == null || ((Number) contentCardAdapterExternalSyntheticLambda6.IconCompatParcelizer).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.south()) {
                        contentCardAdapterExternalSyntheticLambda6 = new ContentCardAdapterExternalSyntheticLambda0(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.south()));
                        z2 = false;
                    }
                    if (contentCardAdapterExternalSyntheticLambda5 == null || ((Number) contentCardAdapterExternalSyntheticLambda5.IconCompatParcelizer).doubleValue() > coordinateBoundsCalculateCoordinateBoundForAnnotation.west()) {
                        contentCardAdapterExternalSyntheticLambda5 = new ContentCardAdapterExternalSyntheticLambda0(viewAnnotation, viewAnnotationOptionsFrame, Double.valueOf(coordinateBoundsCalculateCoordinateBoundForAnnotation.west()));
                        z2 = false;
                    }
                }
                i = 0;
            }
            if (contentCardAdapterExternalSyntheticLambda7 != null && contentCardAdapterExternalSyntheticLambda4 != null && contentCardAdapterExternalSyntheticLambda6 != null && contentCardAdapterExternalSyntheticLambda5 != null) {
                ViewAnnotation viewAnnotation2 = (ViewAnnotation) contentCardAdapterExternalSyntheticLambda5.serializer;
                Point pointCoordinate = coordinate(viewAnnotation2, viewAnnotation2.getPositionDescriptor());
                pointCoordinate.getClass();
                double dLongitude = pointCoordinate.longitude();
                ViewAnnotation viewAnnotation3 = (ViewAnnotation) contentCardAdapterExternalSyntheticLambda6.serializer;
                Point pointCoordinate2 = coordinate(viewAnnotation3, viewAnnotation3.getPositionDescriptor());
                pointCoordinate2.getClass();
                Double d = dValueOf;
                Point pointFromLngLat = Point.fromLngLat(dLongitude, pointCoordinate2.latitude());
                ViewAnnotation viewAnnotation4 = (ViewAnnotation) contentCardAdapterExternalSyntheticLambda4.serializer;
                Point pointCoordinate3 = coordinate(viewAnnotation4, viewAnnotation4.getPositionDescriptor());
                pointCoordinate3.getClass();
                double dLongitude2 = pointCoordinate3.longitude();
                ViewAnnotation viewAnnotation5 = (ViewAnnotation) contentCardAdapterExternalSyntheticLambda7.serializer;
                Point pointCoordinate4 = coordinate(viewAnnotation5, viewAnnotation5.getPositionDescriptor());
                pointCoordinate4.getClass();
                Integer num2 = num;
                List<Point> list2 = SQLite.read(pointFromLngLat, Point.fromLngLat(dLongitude2, pointCoordinate4.latitude()));
                double dDoubleValue = (edgeInsets != null ? Double.valueOf(edgeInsets.getTop()) : num2).doubleValue();
                Rect rect = (Rect) contentCardAdapterExternalSyntheticLambda7.RemoteActionCompatParcelizer;
                double dAbs = Math.abs((rect != null ? Integer.valueOf(rect.top) : d).doubleValue());
                double dDoubleValue2 = (edgeInsets != null ? Double.valueOf(edgeInsets.getLeft()) : num2).doubleValue();
                Rect rect2 = (Rect) contentCardAdapterExternalSyntheticLambda5.RemoteActionCompatParcelizer;
                double dAbs2 = Math.abs((rect2 != null ? Integer.valueOf(rect2.left) : d).doubleValue());
                double dDoubleValue3 = (edgeInsets != null ? Double.valueOf(edgeInsets.getBottom()) : num2).doubleValue();
                Rect rect3 = (Rect) contentCardAdapterExternalSyntheticLambda6.RemoteActionCompatParcelizer;
                double dAbs3 = Math.abs((rect3 != null ? Integer.valueOf(rect3.bottom) : d).doubleValue());
                double dDoubleValue4 = (edgeInsets != null ? Double.valueOf(edgeInsets.getRight()) : num2).doubleValue();
                Rect rect4 = (Rect) contentCardAdapterExternalSyntheticLambda4.RemoteActionCompatParcelizer;
                cameraOptionsCameraForCoordinates = this.mapboxMap.cameraForCoordinates(list2, cameraOptions2, new EdgeInsets(dAbs + dDoubleValue, dAbs2 + dDoubleValue2, dAbs3 + dDoubleValue3, Math.abs((rect4 != null ? Integer.valueOf(rect4.right) : d).doubleValue()) + dDoubleValue4), null, null);
                dValueOf = d;
                z = z2;
                contentCardAdapterExternalSyntheticLambda0 = contentCardAdapterExternalSyntheticLambda7;
                contentCardAdapterExternalSyntheticLambda1 = contentCardAdapterExternalSyntheticLambda6;
                contentCardAdapterExternalSyntheticLambda2 = contentCardAdapterExternalSyntheticLambda5;
                contentCardAdapterExternalSyntheticLambda3 = contentCardAdapterExternalSyntheticLambda4;
                num = num2;
                i = 0;
            } else {
                MapboxLogger.logW(TAG, "ViewAnnotation options framing is null. Returning empty camera");
                return invokeCallbackAndReturn(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        }
        return invokeCallbackAndReturn(CameraOptionsUtils.isEmpty(cameraOptionsCameraForCoordinates) ? null : cameraOptionsCameraForCoordinates, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    private final void validateOptions(ViewAnnotationOptions viewAnnotationOptions) {
        if (viewAnnotationOptions.getAnnotatedFeature() != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(EXCEPTION_TEXT_FEATURE_IS_NULL);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    @MapboxDelicateApi
    public CameraOptions cameraForAnnotations(List<? extends View> list, EdgeInsets edgeInsets, Double d, Double d2) {
        list.getClass();
        return cameraForAnnotationsImpl(list, edgeInsets, d, d2, null);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void cameraForAnnotations(List<? extends View> list, EdgeInsets edgeInsets, Double d, Double d2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        list.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        cameraForAnnotationsImpl(list, edgeInsets, d, d2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public ViewAnnotationOptions getViewAnnotationOptions(AnnotatedLayerFeature annotatedLayerFeature) {
        annotatedLayerFeature.getClass();
        return (ViewAnnotationOptions) findByAnnotatedLayerFeature(annotatedLayerFeature).write;
    }

    public /* synthetic */ ViewAnnotationManagerImpl(MapView mapView, FrameLayout frameLayout, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mapView, (i & 2) != 0 ? new FrameLayout(mapView.getContext()) : frameLayout);
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public View addViewAnnotation(int i, ViewAnnotationOptions viewAnnotationOptions) {
        viewAnnotationOptions.getClass();
        validateOptions(viewAnnotationOptions);
        View viewInflate = LayoutInflater.from(this.viewAnnotationsLayout.getContext()).inflate(i, (ViewGroup) this.viewAnnotationsLayout, false);
        viewInflate.getClass();
        prepareViewAnnotation(viewInflate, viewAnnotationOptions);
        return viewInflate;
    }

    @Override // com.mapbox.maps.viewannotation.ViewAnnotationManager
    public void addViewAnnotation(int i, ViewAnnotationOptions viewAnnotationOptions, setImageLevel setimagelevel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        viewAnnotationOptions.getClass();
        throw null;
    }
}
