package com.mapbox.maps.plugin.attribution;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.ImageCapture$Metadata;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.oss.licenses.zzo;
import com.huawei.location.nlp.scan.FB;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.MapView;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapAttributionDelegateImpl;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import com.mapbox.maps.plugin.compass.generated.CompassAttributeParser$parseCompassSettings$1;
import java.util.Arrays;
import java.util.List;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.removeOnContextAvailableListener;
import o.setLeft;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributionPluginImpl implements View.OnClickListener, ViewPlugin, LifecyclePlugin {
    public AttributionViewImpl attributionView;
    public AttributionDialogManagerImpl dialogManager;
    public MapAttributionDelegateImpl mapAttributionDelegate;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM viewImplProvider = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.plugin.attribution.AttributionPluginImpl.1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            context.getClass();
            AttributionViewImpl attributionViewImpl = new AttributionViewImpl(context, null, 0);
            Resources resources = attributionViewImpl.getResources();
            ThreadLocal threadLocal = setLeft.read;
            Drawable drawable = resources.getDrawable(R.drawable.mapbox_attribution_selector, null);
            if (drawable != null) {
                attributionViewImpl.setImageDrawable(drawable);
            }
            attributionViewImpl.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            attributionViewImpl.setContentDescription(context.getString(R.string.mapbox_attributionsDialogTitle));
            return attributionViewImpl;
        }
    };
    public AttributionSettings internalSettings = new AttributionSettings(true, Color.parseColor("#FF1E8CAB"), 8388691, 92.0f, 4.0f, 4.0f, 4.0f, true);

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStart() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.internalSettings.clickable) {
            AttributionDialogManagerImpl attributionDialogManagerImpl = this.dialogManager;
            if (attributionDialogManagerImpl == null) {
                removeNodeAtDepth.serializer("dialogManager");
                throw null;
            }
            MapAttributionDelegateImpl mapAttributionDelegateImpl = this.mapAttributionDelegate;
            if (mapAttributionDelegateImpl == null) {
                removeNodeAtDepth.serializer("mapAttributionDelegate");
                throw null;
            }
            Context context = attributionDialogManagerImpl.context;
            attributionDialogManagerImpl.mapAttributionDelegate = mapAttributionDelegateImpl;
            attributionDialogManagerImpl.telemetry = mapAttributionDelegateImpl.mapTelemetry;
            MapGeofencingConsent mapGeofencingConsent = mapAttributionDelegateImpl.mapGeofencingConsent;
            attributionDialogManagerImpl.geofencingConsent = mapGeofencingConsent;
            ImageCapture$Metadata imageCapture$Metadata = new ImageCapture$Metadata(mapGeofencingConsent.shouldShowConsent());
            Object[] array = mapAttributionDelegateImpl.mapboxMap.getAttributions().toArray(new String[0]);
            array.getClass();
            String[] strArr = (String[]) array;
            attributionDialogManagerImpl.attributionList = onContentCardDismissed.serializer(new AttributionParser.Options(context).withCopyrightSign(true).withImproveMap(true).withTelemetryAttribution(true).withMapboxAttribution(true).withMapboxPrivacyPolicy(true).withMapboxGeofencingConsent(imageCapture$Metadata.getWithMapboxGeofencingConsent()).withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withExtraAttributions(instance_delegatelambda0.write).build().getAttributions(), new FB(19));
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                return;
            }
            List list = attributionDialogManagerImpl.attributionList;
            if (list == null) {
                removeNodeAtDepth.serializer("attributionList");
                throw null;
            }
            DeltaDecoder deltaDecoderPrepareDialogBuilder = attributionDialogManagerImpl.prepareDialogBuilder();
            deltaDecoderPrepareDialogBuilder.IconCompatParcelizer(R.string.mapbox_attributionsDialogTitle);
            deltaDecoderPrepareDialogBuilder.serializer(new zzo(context, list), attributionDialogManagerImpl);
            attributionDialogManagerImpl.dialog = deltaDecoderPrepareDialogBuilder.MediaMetadataCompat();
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.mapAttributionDelegate = (MapAttributionDelegateImpl) ((isAdapterPositionOnScreen) mapDelegateProviderImpl.mapAttributionDelegate$delegate).MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final View bind(MapView mapView, AttributeSet attributeSet, float f) {
        mapView.getClass();
        Context context = mapView.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            CompassAttributeParser$parseCompassSettings$1 compassAttributeParser$parseCompassSettings$1 = new CompassAttributeParser$parseCompassSettings$1(typedArrayObtainStyledAttributes, 1, f);
            AttributionSettings.Builder builder = new AttributionSettings.Builder();
            builder.enabled = true;
            builder.iconColor = Color.parseColor("#FF1E8CAB");
            builder.position = 8388691;
            builder.marginLeft = 92.0f;
            builder.marginTop = 4.0f;
            builder.marginRight = 4.0f;
            builder.marginBottom = 4.0f;
            builder.clickable = true;
            compassAttributeParser$parseCompassSettings$1.invoke(builder);
            AttributionSettings attributionSettings = new AttributionSettings(builder.enabled, builder.iconColor, builder.position, builder.marginLeft, builder.marginTop, builder.marginRight, builder.marginBottom, builder.clickable);
            typedArrayObtainStyledAttributes.recycle();
            this.internalSettings = attributionSettings;
            Context context2 = mapView.getContext();
            context2.getClass();
            this.dialogManager = new AttributionDialogManagerImpl(context2);
            Context context3 = mapView.getContext();
            context3.getClass();
            return (View) this.viewImplProvider.invoke(context3);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final void onPluginView(View view) {
        view.getClass();
        AttributionViewImpl attributionViewImpl = view instanceof AttributionViewImpl ? (AttributionViewImpl) view : null;
        if (attributionViewImpl == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provided view needs to implement AttributionView");
        } else {
            this.attributionView = attributionViewImpl;
            attributionViewImpl.setViewOnClickListener(this);
        }
    }

    public final void applySettings() {
        AttributionViewImpl attributionViewImpl = this.attributionView;
        if (attributionViewImpl == null) {
            removeNodeAtDepth.serializer("attributionView");
            throw null;
        }
        attributionViewImpl.setGravity(this.internalSettings.position);
        AttributionViewImpl attributionViewImpl2 = this.attributionView;
        if (attributionViewImpl2 == null) {
            removeNodeAtDepth.serializer("attributionView");
            throw null;
        }
        attributionViewImpl2.setEnable(this.internalSettings.enabled);
        AttributionViewImpl attributionViewImpl3 = this.attributionView;
        if (attributionViewImpl3 == null) {
            removeNodeAtDepth.serializer("attributionView");
            throw null;
        }
        attributionViewImpl3.setIconColor(this.internalSettings.iconColor);
        AttributionViewImpl attributionViewImpl4 = this.attributionView;
        if (attributionViewImpl4 == null) {
            removeNodeAtDepth.serializer("attributionView");
            throw null;
        }
        AttributionSettings attributionSettings = this.internalSettings;
        int i = (int) attributionSettings.marginLeft;
        int i2 = (int) attributionSettings.marginTop;
        int i3 = (int) attributionSettings.marginRight;
        int i4 = (int) attributionSettings.marginBottom;
        ViewGroup.LayoutParams layoutParams = attributionViewImpl4.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i, i2, i3, i4);
        layoutParams2.setMarginStart(i);
        layoutParams2.setMarginEnd(i3);
        AttributionViewImpl attributionViewImpl5 = this.attributionView;
        if (attributionViewImpl5 != null) {
            attributionViewImpl5.requestLayout();
        } else {
            removeNodeAtDepth.serializer("attributionView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStop() {
        AttributionDialogManagerImpl attributionDialogManagerImpl = this.dialogManager;
        if (attributionDialogManagerImpl == null) {
            removeNodeAtDepth.serializer("dialogManager");
            throw null;
        }
        removeOnContextAvailableListener removeoncontextavailablelistener = attributionDialogManagerImpl.dialog;
        if (removeoncontextavailablelistener != null) {
            if (!removeoncontextavailablelistener.isShowing()) {
                removeoncontextavailablelistener = null;
            }
            if (removeoncontextavailablelistener != null) {
                removeoncontextavailablelistener.dismiss();
            }
        }
        removeOnContextAvailableListener removeoncontextavailablelistener2 = attributionDialogManagerImpl.telemetryDialog;
        if (removeoncontextavailablelistener2 != null) {
            if (!removeoncontextavailablelistener2.isShowing()) {
                removeoncontextavailablelistener2 = null;
            }
            if (removeoncontextavailablelistener2 != null) {
                removeoncontextavailablelistener2.dismiss();
            }
        }
        removeOnContextAvailableListener removeoncontextavailablelistener3 = attributionDialogManagerImpl.geofencingDialog;
        if (removeoncontextavailablelistener3 != null) {
            removeOnContextAvailableListener removeoncontextavailablelistener4 = removeoncontextavailablelistener3.isShowing() ? removeoncontextavailablelistener3 : null;
            if (removeoncontextavailablelistener4 != null) {
                removeoncontextavailablelistener4.dismiss();
            }
        }
    }
}
