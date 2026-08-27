package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.sqlite.SQLite;
import coil3.ImageLoader$Builder;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.logistics.rider.glovo.R;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.ContextBinder;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.LocationPuck3D;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapStyleObserverPlugin;
import com.mapbox.maps.plugin.ModelElevationReference;
import com.mapbox.maps.plugin.ModelScaleMode;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAccuracyRadiusAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckBearingAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckPositionAnimator;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckPulsingAnimator;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.mapbox.navigation.ui.maps.location.NavigationLocationProvider;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationComponentPluginImpl implements MapPlugin, MapStyleObserverPlugin, LifecyclePlugin, ContextBinder {
    public MapDelegateProviderImpl delegateProvider;
    public LocationComponentSettings internalSettings;
    public boolean isLocationComponentActivated;
    public Point lastIndicatorPosition;
    public LocationProvider locationProvider;
    public LocationPuckManager locationPuckManager;
    public WeakReference weakContext;
    public final CopyOnWriteArraySet onIndicatorPositionChangedListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet onIndicatorBearingChangedListeners = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet onIndicatorAccuracyRadiusChangedListeners = new CopyOnWriteArraySet();
    public final LocationComponentPluginImpl$$ExternalSyntheticLambda0 indicatorPositionChangedListener = new OnIndicatorPositionChangedListener() { // from class: com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl$$ExternalSyntheticLambda0
        @Override // com.mapbox.maps.plugin.locationcomponent.OnIndicatorPositionChangedListener
        public final void onIndicatorPositionChanged(Point point) {
            point.getClass();
            LocationComponentPluginImpl locationComponentPluginImpl = this.f$0;
            locationComponentPluginImpl.lastIndicatorPosition = point;
            Iterator it = locationComponentPluginImpl.onIndicatorPositionChangedListeners.iterator();
            while (it.hasNext()) {
                ((OnIndicatorPositionChangedListener) it.next()).onIndicatorPositionChanged(point);
            }
        }
    };
    public final LocationComponentPluginImpl$$ExternalSyntheticLambda1 indicatorBearingChangedListener = new LocationComponentPluginImpl$$ExternalSyntheticLambda1(this);
    public final LocationComponentPluginImpl$$ExternalSyntheticLambda2 indicatorAccuracyRadiusChangedListener = new LocationComponentPluginImpl$$ExternalSyntheticLambda2(this);

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.delegateProvider = mapDelegateProviderImpl;
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStart() {
        activateLocationComponent();
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStop() {
        this.isLocationComponentActivated = false;
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            ImageLoader$Builder imageLoader$Builder = locationPuckManager.animationManager;
            ((PuckBearingAnimator) imageLoader$Builder.RemoteActionCompatParcelizer).cancelRunning();
            ((PuckPositionAnimator) imageLoader$Builder.IconCompatParcelizer).cancelRunning();
            ((PuckPulsingAnimator) imageLoader$Builder.serializer).cancelRunning();
            ((PuckAccuracyRadiusAnimator) imageLoader$Builder.read).cancelRunning();
        }
        LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            locationProvider.unRegisterLocationConsumer(this);
        }
    }

    public final void setLocationProvider(LocationProvider locationProvider) {
        locationProvider.getClass();
        LocationProvider locationProvider2 = this.locationProvider;
        if (locationProvider2 != null) {
            locationProvider2.unRegisterLocationConsumer(this);
        }
        this.locationProvider = locationProvider;
        if (this.isLocationComponentActivated) {
            locationProvider.registerLocationConsumer(this);
        }
    }

    public final void activateLocationComponent() {
        if (getInternalSettings().enabled) {
            MapDelegateProviderImpl mapDelegateProviderImpl = this.delegateProvider;
            if (mapDelegateProviderImpl == null) {
                removeNodeAtDepth.serializer("delegateProvider");
                throw null;
            }
            MapboxMap mapboxMap = (MapboxMap) mapDelegateProviderImpl.mapStyleManagerDelegate;
            LocationPuckManager locationPuckManager = this.locationPuckManager;
            if (locationPuckManager != null && locationPuckManager.locationLayerRenderer.isRendererInitialised() && this.isLocationComponentActivated) {
                return;
            }
            if (this.locationPuckManager == null) {
                LocationComponentSettings internalSettings = getInternalSettings();
                WeakReference weakReference = this.weakContext;
                if (weakReference == null) {
                    removeNodeAtDepth.serializer("weakContext");
                    throw null;
                }
                MapDelegateProviderImpl mapDelegateProviderImpl2 = this.delegateProvider;
                if (mapDelegateProviderImpl2 == null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                String str = getInternalSettings().layerAbove;
                String str2 = getInternalSettings().layerBelow;
                mapboxMap.getClass();
                ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                protobufEncoder.write = mapboxMap;
                protobufEncoder.serializer = str;
                protobufEncoder.RemoteActionCompatParcelizer = str2;
                float pixelRatio = mapboxMap.getPixelRatio();
                LocationComponentPluginImpl$$ExternalSyntheticLambda0 locationComponentPluginImpl$$ExternalSyntheticLambda0 = this.indicatorPositionChangedListener;
                locationComponentPluginImpl$$ExternalSyntheticLambda0.getClass();
                LocationComponentPluginImpl$$ExternalSyntheticLambda1 locationComponentPluginImpl$$ExternalSyntheticLambda1 = this.indicatorBearingChangedListener;
                locationComponentPluginImpl$$ExternalSyntheticLambda1.getClass();
                LocationComponentPluginImpl$$ExternalSyntheticLambda2 locationComponentPluginImpl$$ExternalSyntheticLambda2 = this.indicatorAccuracyRadiusChangedListener;
                locationComponentPluginImpl$$ExternalSyntheticLambda2.getClass();
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.RemoteActionCompatParcelizer = new PuckBearingAnimator(locationComponentPluginImpl$$ExternalSyntheticLambda1);
                imageLoader$Builder.IconCompatParcelizer = new PuckPositionAnimator(locationComponentPluginImpl$$ExternalSyntheticLambda0);
                imageLoader$Builder.read = new PuckAccuracyRadiusAnimator(locationComponentPluginImpl$$ExternalSyntheticLambda2);
                imageLoader$Builder.serializer = new PuckPulsingAnimator(pixelRatio);
                this.locationPuckManager = new LocationPuckManager(internalSettings, weakReference, mapDelegateProviderImpl2, protobufEncoder, imageLoader$Builder);
            }
            LocationPuckManager locationPuckManager2 = this.locationPuckManager;
            if (locationPuckManager2 != null) {
                locationPuckManager2.initialize(mapboxMap);
            }
            LocationPuckManager locationPuckManager3 = this.locationPuckManager;
            if (locationPuckManager3 != null) {
                PuckPulsingAnimator puckPulsingAnimator = (PuckPulsingAnimator) locationPuckManager3.animationManager.serializer;
                if (puckPulsingAnimator.enabled) {
                    puckPulsingAnimator.animateInfinite();
                }
            }
            LocationProvider locationProvider = this.locationProvider;
            if (locationProvider != null) {
                locationProvider.registerLocationConsumer(this);
            }
            this.isLocationComponentActivated = true;
        }
    }

    public final void applySettings() {
        if (getInternalSettings().enabled && !this.isLocationComponentActivated) {
            WeakReference weakReference = this.weakContext;
            if (weakReference == null) {
                removeNodeAtDepth.serializer("weakContext");
                throw null;
            }
            Context context = (Context) weakReference.get();
            if (context != null) {
                if (this.locationProvider == null) {
                    this.locationProvider = new DefaultLocationProvider(context);
                }
                activateLocationComponent();
            }
        }
        boolean z = getInternalSettings().enabled;
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (!z) {
            if (locationPuckManager != null) {
                locationPuckManager.isHidden = true;
                locationPuckManager.locationLayerRenderer.hide();
                ImageLoader$Builder imageLoader$Builder = locationPuckManager.animationManager;
                ((PuckBearingAnimator) imageLoader$Builder.RemoteActionCompatParcelizer).cancelRunning();
                ((PuckPositionAnimator) imageLoader$Builder.IconCompatParcelizer).cancelRunning();
                ((PuckPulsingAnimator) imageLoader$Builder.serializer).cancelRunning();
                ((PuckAccuracyRadiusAnimator) imageLoader$Builder.read).cancelRunning();
                locationPuckManager.locationLayerRenderer.clearBitmaps();
                locationPuckManager.locationLayerRenderer.removeLayers();
            }
            this.locationPuckManager = null;
            LocationProvider locationProvider = this.locationProvider;
            if (locationProvider != null) {
                locationProvider.unRegisterLocationConsumer(this);
            }
            this.isLocationComponentActivated = false;
            return;
        }
        if (locationPuckManager != null) {
            LocationComponentSettings internalSettings = getInternalSettings();
            locationPuckManager.settings = internalSettings;
            ProtobufEncoder protobufEncoder = locationPuckManager.positionManager;
            protobufEncoder.serializer = internalSettings.layerAbove;
            protobufEncoder.RemoteActionCompatParcelizer = internalSettings.layerBelow;
            locationPuckManager.locationLayerRenderer.clearBitmaps();
            locationPuckManager.locationLayerRenderer.removeLayers();
            LocationLayerRenderer locationLayerRenderer = locationPuckManager.getLocationLayerRenderer(internalSettings);
            locationPuckManager.locationLayerRenderer = locationLayerRenderer;
            locationLayerRenderer.slot(internalSettings.slot);
            locationPuckManager.initialize((MapboxMap) locationPuckManager.delegateProvider.mapStyleManagerDelegate);
        }
        LocationProvider locationProvider2 = this.locationProvider;
        DefaultLocationProvider defaultLocationProvider = locationProvider2 instanceof DefaultLocationProvider ? (DefaultLocationProvider) locationProvider2 : null;
        if (defaultLocationProvider != null) {
            LocationComponentSettings internalSettings2 = getInternalSettings();
            defaultLocationProvider.puckBearingFlow.IconCompatParcelizer(internalSettings2.puckBearingEnabled ? internalSettings2.puckBearing : null);
        }
    }

    @Override // com.mapbox.maps.plugin.ContextBinder
    public final void bind(Context context, AttributeSet attributeSet, final float f) {
        LocationPuck locationPuck2D;
        List listRatingCompat;
        ImageHolder imageHolderFrom;
        ImageHolder imageHolderFrom2;
        context.getClass();
        this.weakContext = new WeakReference(context);
        List listRatingCompat2 = instance_delegatelambda0.write;
        final TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            final boolean z = typedArrayObtainStyledAttributes.getBoolean(92, false);
            int i = typedArrayObtainStyledAttributes.getInt(55, -1);
            if (i == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(60, -1);
                Integer numValueOf = Integer.valueOf(resourceId);
                if (resourceId == -1) {
                    numValueOf = null;
                }
                ImageHolder imageHolderFrom3 = numValueOf != null ? ImageHolder.Companion.from(numValueOf.intValue()) : null;
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(56, -1);
                Integer numValueOf2 = Integer.valueOf(resourceId2);
                if (resourceId2 == -1) {
                    numValueOf2 = null;
                }
                ImageHolder imageHolderFrom4 = numValueOf2 != null ? ImageHolder.Companion.from(numValueOf2.intValue()) : null;
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(59, -1);
                Integer numValueOf3 = Integer.valueOf(resourceId3);
                if (resourceId3 == -1) {
                    numValueOf3 = null;
                }
                locationPuck2D = new LocationPuck2D(imageHolderFrom3, imageHolderFrom4, numValueOf3 != null ? ImageHolder.Companion.from(numValueOf3.intValue()) : null, typedArrayObtainStyledAttributes.getString(58), typedArrayObtainStyledAttributes.getFloat(57, 1.0f));
            } else if (i != 1) {
                ImageHolder.Companion companion = ImageHolder.Companion;
                ImageHolder imageHolderFrom5 = companion.from(R.drawable.mapbox_user_icon);
                if (z) {
                    imageHolderFrom = companion.from(R.drawable.mapbox_user_bearing_icon);
                } else {
                    imageHolderFrom = companion.from(R.drawable.mapbox_user_stroke_icon);
                }
                if (z) {
                    imageHolderFrom2 = companion.from(R.drawable.mapbox_user_stroke_icon);
                } else {
                    imageHolderFrom2 = companion.from(R.drawable.mapbox_user_icon_shadow);
                }
                locationPuck2D = new LocationPuck2D(imageHolderFrom5, imageHolderFrom, imageHolderFrom2, 24);
            } else {
                String string = typedArrayObtainStyledAttributes.getString(87);
                if (string != null) {
                    List list = SQLite.read(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(90, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(89, 0.0f)));
                    float f2 = typedArrayObtainStyledAttributes.getFloat(72, 1.0f);
                    List list2 = SQLite.read(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(81, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(82, 1.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(83, 1.0f)));
                    String string2 = typedArrayObtainStyledAttributes.getString(79);
                    List list3 = SQLite.read(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(85, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(84, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(86, 0.0f)));
                    List list4 = SQLite.read(Float.valueOf(typedArrayObtainStyledAttributes.getFloat(76, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(77, 0.0f)), Float.valueOf(typedArrayObtainStyledAttributes.getFloat(78, 90.0f)));
                    boolean z2 = typedArrayObtainStyledAttributes.getBoolean(62, true);
                    boolean z3 = typedArrayObtainStyledAttributes.getBoolean(74, true);
                    ModelScaleMode modelScaleMode = ModelScaleMode.values()[typedArrayObtainStyledAttributes.getInt(80, ModelScaleMode.VIEWPORT.ordinal())];
                    float f3 = typedArrayObtainStyledAttributes.getFloat(70, 1.0f);
                    String string3 = typedArrayObtainStyledAttributes.getString(71);
                    String string4 = typedArrayObtainStyledAttributes.getString(73);
                    String string5 = typedArrayObtainStyledAttributes.getString(75);
                    int color = typedArrayObtainStyledAttributes.getColor(63, Color.parseColor("#ffffff"));
                    String string6 = typedArrayObtainStyledAttributes.getString(64);
                    float f4 = typedArrayObtainStyledAttributes.getFloat(65, 0.0f);
                    String string7 = typedArrayObtainStyledAttributes.getString(66);
                    try {
                        String[] stringArray = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(61, 0));
                        stringArray.getClass();
                        listRatingCompat = onContentCardClicked.RatingCompat(stringArray);
                    } catch (Exception unused) {
                        listRatingCompat = listRatingCompat2;
                    }
                    try {
                        String[] stringArray2 = typedArrayObtainStyledAttributes.getResources().getStringArray(typedArrayObtainStyledAttributes.getResourceId(88, 0));
                        stringArray2.getClass();
                        listRatingCompat2 = onContentCardClicked.RatingCompat(stringArray2);
                    } catch (Exception unused2) {
                    }
                    List list5 = listRatingCompat2;
                    ModelElevationReference modelElevationReference = ModelElevationReference.values()[typedArrayObtainStyledAttributes.getInt(69, ModelElevationReference.GROUND.ordinal())];
                    String string8 = typedArrayObtainStyledAttributes.getString(67);
                    if (string8 == null) {
                        string8 = "default";
                    }
                    locationPuck2D = new LocationPuck3D(string, list, f2, list2, string2, list3, list4, z2, z3, modelScaleMode, f3, string3, string4, string5, color, string6, f4, string7, listRatingCompat, list5, modelElevationReference, string8, typedArrayObtainStyledAttributes.getString(68));
                } else {
                    throw new IllegalArgumentException("model-uri must be specified in order to use 3d location puck.");
                }
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentAttributeParser$parseLocationComponentSettings$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    LocationComponentSettings.Builder builder = (LocationComponentSettings.Builder) obj;
                    builder.getClass();
                    TypedArray typedArray = typedArrayObtainStyledAttributes;
                    builder.enabled = typedArray.getBoolean(52, false);
                    builder.pulsingEnabled = typedArray.getBoolean(94, false);
                    builder.pulsingColor = typedArray.getColor(93, Color.parseColor("#4A90E2"));
                    builder.pulsingMaxRadius = typedArray.getDimension(95, f * 10.0f);
                    builder.showAccuracyRing = typedArray.getBoolean(96, false);
                    builder.accuracyRingColor = typedArray.getColor(51, Color.parseColor("#4d89cff0"));
                    builder.accuracyRingBorderColor = typedArray.getColor(50, Color.parseColor("#4d89cff0"));
                    builder.layerAbove = typedArray.getString(53);
                    builder.layerBelow = typedArray.getString(54);
                    builder.puckBearingEnabled = z;
                    PuckBearing puckBearing = PuckBearing.values()[typedArray.getInt(91, 0)];
                    puckBearing.getClass();
                    builder.puckBearing = puckBearing;
                    builder.slot = typedArray.getString(97);
                    return createFromParcel.INSTANCE;
                }
            };
            LocationComponentSettings.Builder builder = new LocationComponentSettings.Builder(locationPuck2D);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
            LocationComponentSettings locationComponentSettingsBuild = builder.build();
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = locationComponentSettingsBuild;
            if (getInternalSettings().enabled && this.locationProvider == null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                DefaultLocationProvider defaultLocationProvider = new DefaultLocationProvider(applicationContext);
                LocationComponentSettings internalSettings = getInternalSettings();
                defaultLocationProvider.puckBearingFlow.IconCompatParcelizer(internalSettings.puckBearingEnabled ? internalSettings.puckBearing : null);
                this.locationProvider = defaultLocationProvider;
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void onLocationUpdated(Point[] pointArr, NavigationLocationProvider.AnonymousClass1 anonymousClass1) {
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.updateCurrentPosition((Point[]) Arrays.copyOf(pointArr, pointArr.length), anonymousClass1);
        }
    }

    @Override // com.mapbox.maps.plugin.MapStyleObserverPlugin
    public final void onStyleChanged(Style style) {
        LocationPuckManager locationPuckManager = this.locationPuckManager;
        if (locationPuckManager != null) {
            locationPuckManager.locationLayerRenderer.updateStyle(style);
            locationPuckManager.positionManager.write = style;
        }
    }

    public final void updateSettings(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        LocationComponentSettings.Builder builder = getInternalSettings().toBuilder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        LocationComponentSettings locationComponentSettingsBuild = builder.build();
        boolean z = locationComponentSettingsBuild.enabled;
        if (getInternalSettings().enabled != z) {
            LocationComponentSettings.Builder builder2 = getInternalSettings().toBuilder();
            builder2.enabled = z;
            this.internalSettings = builder2.build();
            applySettings();
        }
        this.internalSettings = locationComponentSettingsBuild;
        applySettings();
    }

    public final LocationComponentSettings getInternalSettings() {
        LocationComponentSettings locationComponentSettings = this.internalSettings;
        if (locationComponentSettings != null) {
            return locationComponentSettings;
        }
        removeNodeAtDepth.serializer("internalSettings");
        throw null;
    }
}
