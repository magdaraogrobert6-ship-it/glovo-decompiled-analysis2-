package com.mapbox.maps.plugin.compass;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.IntPair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapCameraPlugin;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.compass.generated.CompassAttributeParser$parseCompassSettings$1;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setLeft;

/* JADX INFO: loaded from: classes2.dex */
public final class CompassViewPlugin implements ViewPlugin, MapCameraPlugin, LifecyclePlugin {
    public CameraAnimationsPlugin animationPlugin;
    public double bearing;
    public final CopyOnWriteArraySet compassClickListeners;
    public CompassViewImpl compassView;
    public final ValueAnimator fadeAnimator;
    public CompassSettings internalSettings;
    public boolean isHidden;
    public MapboxMap mapCameraManager;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM viewImplProvider;

    public CompassViewPlugin() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.getClass();
        this.viewImplProvider = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.plugin.compass.CompassViewPlugin.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                Context context = (Context) obj;
                context.getClass();
                final CompassViewImpl compassViewImpl = new CompassViewImpl(context, null, 0);
                Resources resources = compassViewImpl.getResources();
                ThreadLocal threadLocal = setLeft.read;
                Drawable drawable = resources.getDrawable(2131232122, null);
                if (drawable != null) {
                    compassViewImpl.setCompassImage(drawable);
                }
                int dimensionPixelSize = compassViewImpl.getResources().getDimensionPixelSize(R.dimen.compass_view_size);
                compassViewImpl.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                compassViewImpl.setOnClickListener(new View.OnClickListener() { // from class: com.mapbox.maps.plugin.compass.CompassViewImpl$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CompassViewPlugin compassViewPlugin = compassViewImpl.presenter;
                        if (compassViewPlugin != null) {
                            Double dValueOf = Double.valueOf(0.0d);
                            if (compassViewPlugin.internalSettings.clickable) {
                                CameraAnimationsPlugin cameraAnimationsPlugin = compassViewPlugin.animationPlugin;
                                if (cameraAnimationsPlugin != null) {
                                    CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(dValueOf).build();
                                    cameraOptionsBuild.getClass();
                                    TuplesKt.flyTo$default(cameraAnimationsPlugin, cameraOptionsBuild, new MapAnimationOptions("Maps-Compass", 300L, null), 4);
                                } else {
                                    MapboxMap mapboxMap = compassViewPlugin.mapCameraManager;
                                    if (mapboxMap == null) {
                                        removeNodeAtDepth.serializer("mapCameraManager");
                                        throw null;
                                    }
                                    CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().bearing(dValueOf).build();
                                    cameraOptionsBuild2.getClass();
                                    mapboxMap.setCamera(cameraOptionsBuild2);
                                }
                                Iterator it = compassViewPlugin.compassClickListeners.iterator();
                                if (it.hasNext()) {
                                    m1$$ExternalSyntheticOutline0.m(it.next());
                                    throw null;
                                }
                            }
                        }
                    }
                });
                compassViewImpl.setContentDescription(context.getString(R.string.mapbox_compassContentDescription));
                return compassViewImpl;
            }
        };
        this.fadeAnimator = valueAnimatorOfFloat;
        this.internalSettings = new CompassSettings(true, 8388661, 4.0f, 4.0f, 4.0f, 4.0f, 1.0f, 0.0f, true, true, true, null);
        this.compassClickListeners = new CopyOnWriteArraySet();
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setStartDelay(500L);
        int i = 0;
        valueAnimatorOfFloat.addListener(new CompassViewPlugin$_init_$lambda$2$$inlined$doOnEnd$1(this, i));
        valueAnimatorOfFloat.addUpdateListener(new CompassViewPlugin$$ExternalSyntheticLambda0(i, this));
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.MapCameraPlugin
    public final void onCameraMove(Point point, EdgeInsets edgeInsets, double d, double d2, double d3) {
        update(d3);
    }

    public final void applySettings() {
        int iIntValue;
        setEnabled(this.internalSettings.enabled);
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        compassViewImpl.setCompassGravity(this.internalSettings.position);
        ImageHolder imageHolder = this.internalSettings.image;
        if (imageHolder != null) {
            Context context = compassViewImpl.getContext();
            Bitmap bitmap = imageHolder.getBitmap();
            if (bitmap != null) {
                compassViewImpl.setCompassImage(new BitmapDrawable(context.getResources(), bitmap));
            }
            Integer drawableId = imageHolder.getDrawableId();
            if (drawableId != null && (iIntValue = drawableId.intValue()) != -1) {
                Drawable drawableWrite = IntPair.write(context, iIntValue);
                drawableWrite.getClass();
                compassViewImpl.setCompassImage(drawableWrite);
            }
        }
        compassViewImpl.setCompassRotation(this.internalSettings.rotation);
        compassViewImpl.setCompassEnabled(this.internalSettings.enabled);
        compassViewImpl.setCompassAlpha(this.internalSettings.opacity);
        CompassSettings compassSettings = this.internalSettings;
        int i = (int) compassSettings.marginLeft;
        int i2 = (int) compassSettings.marginTop;
        int i3 = (int) compassSettings.marginRight;
        int i4 = (int) compassSettings.marginBottom;
        ViewGroup.LayoutParams layoutParams = compassViewImpl.getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).setMargins(i, i2, i3, i4);
        update(this.bearing);
        compassViewImpl.requestLayout();
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        this.compassClickListeners.clear();
        this.fadeAnimator.cancel();
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl != null) {
            compassViewImpl.setCompassEnabled(false);
        } else {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) throws InvalidPluginConfigurationException {
        MapboxMap mapboxMap = (MapboxMap) mapDelegateProviderImpl.mapCameraManagerDelegate;
        this.mapCameraManager = mapboxMap;
        this.bearing = mapboxMap.getCameraState().getBearing();
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) ((MapController) mapDelegateProviderImpl.mapPluginProviderDelegate).getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        if (cameraAnimationsPlugin == null) {
            throw new InvalidPluginConfigurationException();
        }
        this.animationPlugin = cameraAnimationsPlugin;
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStart() {
        update(this.bearing);
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStop() {
        this.fadeAnimator.cancel();
    }

    public final void setEnabled(boolean z) {
        CompassSettings.Builder builder = this.internalSettings.toBuilder();
        builder.enabled = z;
        this.internalSettings = builder.build();
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        compassViewImpl.setCompassEnabled(z);
        update(this.bearing);
        if (!z || shouldHideCompass()) {
            CompassViewImpl compassViewImpl2 = this.compassView;
            if (compassViewImpl2 == null) {
                removeNodeAtDepth.serializer("compassView");
                throw null;
            }
            compassViewImpl2.setCompassAlpha(0.0f);
            CompassViewImpl compassViewImpl3 = this.compassView;
            if (compassViewImpl3 != null) {
                compassViewImpl3.setCompassVisible(false);
                return;
            } else {
                removeNodeAtDepth.serializer("compassView");
                throw null;
            }
        }
        CompassViewImpl compassViewImpl4 = this.compassView;
        if (compassViewImpl4 == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        compassViewImpl4.setCompassAlpha(this.internalSettings.opacity);
        CompassViewImpl compassViewImpl5 = this.compassView;
        if (compassViewImpl5 != null) {
            compassViewImpl5.setCompassVisible(true);
        } else {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
    }

    public final boolean shouldHideCompass() {
        if (!this.internalSettings.fadeWhenFacingNorth) {
            return false;
        }
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        if (Math.abs(compassViewImpl.getCompassRotation()) >= 359.0d) {
            return true;
        }
        CompassViewImpl compassViewImpl2 = this.compassView;
        if (compassViewImpl2 != null) {
            return ((double) Math.abs(compassViewImpl2.getCompassRotation())) <= 1.0d;
        }
        removeNodeAtDepth.serializer("compassView");
        throw null;
    }

    public final void update(double d) {
        this.bearing = d;
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        compassViewImpl.setCompassRotation(-((float) d));
        updateVisibility(true);
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final View bind(MapView mapView, AttributeSet attributeSet, float f) {
        mapView.getClass();
        Context context = mapView.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            CompassAttributeParser$parseCompassSettings$1 compassAttributeParser$parseCompassSettings$1 = new CompassAttributeParser$parseCompassSettings$1(typedArrayObtainStyledAttributes, 0, f);
            CompassSettings.Builder builder = new CompassSettings.Builder();
            compassAttributeParser$parseCompassSettings$1.invoke(builder);
            CompassSettings compassSettingsBuild = builder.build();
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = compassSettingsBuild;
            Context context2 = mapView.getContext();
            context2.getClass();
            Object objInvoke = this.viewImplProvider.invoke(context2);
            CompassViewImpl compassViewImpl = (CompassViewImpl) objInvoke;
            compassViewImpl.getClass();
            compassViewImpl.presenter = this;
            return (View) objInvoke;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final void onPluginView(View view) {
        view.getClass();
        CompassViewImpl compassViewImpl = view instanceof CompassViewImpl ? (CompassViewImpl) view : null;
        if (compassViewImpl == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provided view needs to implement CompassContract.CompassView");
        } else {
            this.compassView = compassViewImpl;
            updateVisibility(false);
        }
    }

    public final void updateVisibility(boolean z) {
        CompassViewImpl compassViewImpl = this.compassView;
        if (compassViewImpl == null) {
            removeNodeAtDepth.serializer("compassView");
            throw null;
        }
        if (compassViewImpl.isEnabled()) {
            boolean zShouldHideCompass = shouldHideCompass();
            ValueAnimator valueAnimator = this.fadeAnimator;
            if (!zShouldHideCompass) {
                this.isHidden = false;
                valueAnimator.cancel();
                CompassViewImpl compassViewImpl2 = this.compassView;
                if (compassViewImpl2 == null) {
                    removeNodeAtDepth.serializer("compassView");
                    throw null;
                }
                compassViewImpl2.setCompassVisible(true);
                CompassViewImpl compassViewImpl3 = this.compassView;
                if (compassViewImpl3 != null) {
                    compassViewImpl3.setCompassAlpha(this.internalSettings.opacity);
                    return;
                } else {
                    removeNodeAtDepth.serializer("compassView");
                    throw null;
                }
            }
            if (this.isHidden) {
                return;
            }
            this.isHidden = true;
            if (z) {
                valueAnimator.start();
                return;
            }
            CompassViewImpl compassViewImpl4 = this.compassView;
            if (compassViewImpl4 == null) {
                removeNodeAtDepth.serializer("compassView");
                throw null;
            }
            compassViewImpl4.setCompassVisible(false);
            CompassViewImpl compassViewImpl5 = this.compassView;
            if (compassViewImpl5 != null) {
                compassViewImpl5.setCompassAlpha(0.0f);
            } else {
                removeNodeAtDepth.serializer("compassView");
                throw null;
            }
        }
    }
}
