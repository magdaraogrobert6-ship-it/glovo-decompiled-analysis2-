package com.mapbox.maps.plugin;

import com.mapbox.maps.MapController;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import o.FontVariationSettingInt;
import o.backgroundTimerFiredI;
import o.convertStringJsonArrayToListlambda0;
import o.fastMergej5T8yCg;
import o.getColorIntegerOrNulllambda0;
import o.getDoubleOrNull;
import o.getEditableText;
import o.isAdapterPositionOnScreen;
import o.lineEndToVisibleEnd;
import o.mergeJsonObjects;
import o.onMeasureChild;
import o.publishErrorlambda1;
import o.q0;
import o.r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.setStateDescription;
import o.setUseTempTrackingTableroom_runtime;
import o.subscribeToFeatureFlagsUpdateslambda0;
import o.transformCanvas;

/* JADX INFO: loaded from: classes2.dex */
public final class MapDelegateProviderImpl {
    public final Object indoorManager;
    public final Object mapAttributionDelegate$delegate;
    public final Object mapCameraManagerDelegate;
    public final Object mapInteractionDelegate;
    public final Object mapListenerDelegate;
    public final Object mapPluginProviderDelegate;
    public final Object mapProjectionDelegate;
    public final Object mapStyleManagerDelegate;
    public final Object mapTransformDelegate;
    public final Object mapboxMap;

    public MapDelegateProviderImpl(FontVariationSettingInt fontVariationSettingInt, transformCanvas transformcanvas, FontVariationSettingInt fontVariationSettingInt2, fastMergej5T8yCg fastmergej5t8ycg, setStateDescription setstatedescription, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getEditableText geteditabletext, transformCanvas transformcanvas2, onMeasureChild onmeasurechild, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        fontVariationSettingInt.getClass();
        transformcanvas.getClass();
        fontVariationSettingInt2.getClass();
        fastmergej5t8ycg.getClass();
        setstatedescription.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        geteditabletext.getClass();
        transformcanvas2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.mapboxMap = fontVariationSettingInt;
        this.mapCameraManagerDelegate = transformcanvas;
        this.mapProjectionDelegate = fontVariationSettingInt2;
        this.mapTransformDelegate = fastmergej5t8ycg;
        this.mapListenerDelegate = setstatedescription;
        this.mapStyleManagerDelegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.mapInteractionDelegate = geteditabletext;
        this.mapAttributionDelegate$delegate = transformcanvas2;
        this.mapPluginProviderDelegate = onmeasurechild;
        this.indoorManager = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public MapDelegateProviderImpl(MapboxMap mapboxMap, MapController mapController, MapTelemetry mapTelemetry, MapGeofencingConsent mapGeofencingConsent) {
        this.mapboxMap = mapboxMap;
        this.mapCameraManagerDelegate = mapboxMap;
        this.mapProjectionDelegate = mapboxMap;
        this.mapTransformDelegate = mapboxMap;
        this.mapAttributionDelegate$delegate = new isAdapterPositionOnScreen(new MapDelegateProviderImpl$mapAttributionDelegate$2(this, mapTelemetry, mapGeofencingConsent, 0));
        this.mapPluginProviderDelegate = mapController;
        this.mapListenerDelegate = mapboxMap;
        this.mapStyleManagerDelegate = mapboxMap;
        this.mapInteractionDelegate = mapboxMap;
        this.indoorManager = mapboxMap.getIndoor();
    }

    public /* synthetic */ MapDelegateProviderImpl(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects3, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, mergeJsonObjects mergejsonobjects4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, getColorIntegerOrNulllambda0 getcolorintegerornulllambda4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda5) {
        this.mapboxMap = mergejsonobjects;
        this.mapCameraManagerDelegate = mergejsonobjects2;
        this.mapProjectionDelegate = getcolorintegerornulllambda0;
        this.mapTransformDelegate = getcolorintegerornulllambda1;
        this.mapListenerDelegate = mergejsonobjects3;
        this.mapStyleManagerDelegate = getcolorintegerornulllambda2;
        this.mapInteractionDelegate = mergejsonobjects4;
        this.mapAttributionDelegate$delegate = getcolorintegerornulllambda3;
        this.mapPluginProviderDelegate = getcolorintegerornulllambda4;
        this.indoorManager = getcolorintegerornulllambda5;
    }

    public MapDelegateProviderImpl(lineEndToVisibleEnd lineendtovisibleend, lineEndToVisibleEnd lineendtovisibleend2, lineEndToVisibleEnd lineendtovisibleend3, onMeasureChild onmeasurechild, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, lineEndToVisibleEnd lineendtovisibleend4, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4) {
        lineendtovisibleend.getClass();
        lineendtovisibleend2.getClass();
        onmeasurechild.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        lineendtovisibleend4.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq4.getClass();
        this.mapboxMap = lineendtovisibleend;
        this.mapCameraManagerDelegate = lineendtovisibleend2;
        this.mapProjectionDelegate = lineendtovisibleend3;
        this.mapTransformDelegate = onmeasurechild;
        this.mapListenerDelegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.mapStyleManagerDelegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.mapInteractionDelegate = lineendtovisibleend4;
        this.mapAttributionDelegate$delegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.mapPluginProviderDelegate = convertstringjsonarraytolistlambda0;
        this.indoorManager = r8lambdaktwlyipskq3tfa9ey3gatonixfq4;
    }

    public MapDelegateProviderImpl(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, backgroundTimerFiredI backgroundtimerfiredi, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, publishErrorlambda1 publisherrorlambda2, q0 q0Var, getDoubleOrNull getdoubleornull, subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0) {
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        backgroundtimerfiredi.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setusetemptrackingtableroom_runtime.getClass();
        publisherrorlambda2.getClass();
        q0Var.getClass();
        getdoubleornull.getClass();
        this.mapboxMap = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.mapCameraManagerDelegate = publisherrorlambda1;
        this.mapProjectionDelegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.mapTransformDelegate = backgroundtimerfiredi;
        this.mapListenerDelegate = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.mapStyleManagerDelegate = setusetemptrackingtableroom_runtime;
        this.mapInteractionDelegate = publisherrorlambda2;
        this.mapAttributionDelegate$delegate = q0Var;
        this.mapPluginProviderDelegate = getdoubleornull;
        this.indoorManager = subscribetofeatureflagsupdateslambda0;
    }
}
