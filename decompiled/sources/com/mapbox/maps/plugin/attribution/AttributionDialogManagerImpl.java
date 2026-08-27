package com.mapbox.maps.plugin.attribution;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.widget.Toast;
import com.adjust.sdk.Constants;
import com.logistics.rider.glovo.R;
import com.mapbox.common.MapboxOptions;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.Style;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.MapAttributionDelegateImpl;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.getIndexOfFirstFeature;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onUserLeaveHint;
import o.removeNodeAtDepth;
import o.removeOnContextAvailableListener;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributionDialogManagerImpl implements DialogInterface.OnClickListener {
    public List attributionList;
    public final Context context;
    public removeOnContextAvailableListener dialog;
    public MapGeofencingConsent geofencingConsent;
    public removeOnContextAvailableListener geofencingDialog;
    public MapAttributionDelegateImpl mapAttributionDelegate;
    public MapTelemetry telemetry;
    public removeOnContextAvailableListener telemetryDialog;

    public final DeltaDecoder prepareDialogBuilder() {
        DeltaDecoder deltaDecoder;
        int[] iArr = onUserLeaveHint.AppCompatTheme;
        Context context = this.context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes.getClass();
        try {
            deltaDecoder = typedArrayObtainStyledAttributes.hasValue(117) ? new DeltaDecoder(context) : new DeltaDecoder(new getIndexOfFirstFeature(context, R.style.Theme_AppCompat_DayNight_Dialog_Alert));
        } catch (Throwable unused) {
        }
        typedArrayObtainStyledAttributes.recycle();
        return deltaDecoder;
    }

    public final void showWebPage(String str) {
        String lowerCase;
        Context context = this.context;
        Uri uri = Uri.parse(str);
        Set setMediaSessionCompatQueueItem = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"http", Constants.SCHEME});
        String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        if (onContentCardDismissed.write(setMediaSessionCompatQueueItem, lowerCase)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(context, R.string.mapbox_attributionErrorNoBrowser, 1).show();
            } catch (Throwable th) {
                Toast.makeText(context, th.getLocalizedMessage(), 1).show();
            }
        }
    }

    public AttributionDialogManagerImpl(Context context) {
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda0] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.getClass();
        List list = this.attributionList;
        if (list == null) {
            removeNodeAtDepth.serializer("attributionList");
            throw null;
        }
        Attribution attribution = (Attribution) list.get(i);
        String url = attribution.getUrl();
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        if (url.equals("https://www.mapbox.com/telemetry/")) {
            DeltaDecoder deltaDecoderPrepareDialogBuilder = prepareDialogBuilder();
            deltaDecoderPrepareDialogBuilder.IconCompatParcelizer(R.string.mapbox_attributionTelemetryTitle);
            deltaDecoderPrepareDialogBuilder.write(R.string.mapbox_attributionTelemetryMessage);
            deltaDecoderPrepareDialogBuilder.serializer(R.string.mapbox_attributionTelemetryPositive, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda0
                public final /* synthetic */ AttributionDialogManagerImpl f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i5) {
                    int i6 = i4;
                    AttributionDialogManagerImpl attributionDialogManagerImpl = this.f$0;
                    if (i6 == 0) {
                        MapTelemetry mapTelemetry = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry != null) {
                            mapTelemetry.setUserTelemetryRequestState(true);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    if (i6 != 1) {
                        MapTelemetry mapTelemetry2 = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry2 != null) {
                            mapTelemetry2.setUserTelemetryRequestState(false);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    String string = attributionDialogManagerImpl.context.getResources().getString(R.string.mapbox_telemetryLink);
                    string.getClass();
                    attributionDialogManagerImpl.showWebPage(string);
                    dialogInterface2.cancel();
                }
            });
            deltaDecoderPrepareDialogBuilder.write((AttributionDialogManagerImpl$$ExternalSyntheticLambda0) new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda0
                public final /* synthetic */ AttributionDialogManagerImpl f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i5) {
                    int i6 = i3;
                    AttributionDialogManagerImpl attributionDialogManagerImpl = this.f$0;
                    if (i6 == 0) {
                        MapTelemetry mapTelemetry = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry != null) {
                            mapTelemetry.setUserTelemetryRequestState(true);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    if (i6 != 1) {
                        MapTelemetry mapTelemetry2 = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry2 != null) {
                            mapTelemetry2.setUserTelemetryRequestState(false);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    String string = attributionDialogManagerImpl.context.getResources().getString(R.string.mapbox_telemetryLink);
                    string.getClass();
                    attributionDialogManagerImpl.showWebPage(string);
                    dialogInterface2.cancel();
                }
            });
            deltaDecoderPrepareDialogBuilder.read(R.string.mapbox_attributionTelemetryNegative, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda0
                public final /* synthetic */ AttributionDialogManagerImpl f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i5) {
                    int i6 = i2;
                    AttributionDialogManagerImpl attributionDialogManagerImpl = this.f$0;
                    if (i6 == 0) {
                        MapTelemetry mapTelemetry = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry != null) {
                            mapTelemetry.setUserTelemetryRequestState(true);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    if (i6 != 1) {
                        MapTelemetry mapTelemetry2 = attributionDialogManagerImpl.telemetry;
                        if (mapTelemetry2 != null) {
                            mapTelemetry2.setUserTelemetryRequestState(false);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    String string = attributionDialogManagerImpl.context.getResources().getString(R.string.mapbox_telemetryLink);
                    string.getClass();
                    attributionDialogManagerImpl.showWebPage(string);
                    dialogInterface2.cancel();
                }
            });
            this.telemetryDialog = deltaDecoderPrepareDialogBuilder.MediaMetadataCompat();
            return;
        }
        if (url.equals("geofencing_url_marker")) {
            DeltaDecoder deltaDecoderPrepareDialogBuilder2 = prepareDialogBuilder();
            deltaDecoderPrepareDialogBuilder2.IconCompatParcelizer(R.string.mapbox_attributionGeofencingTitle);
            deltaDecoderPrepareDialogBuilder2.write(R.string.mapbox_attributionGeofencingMessage);
            MapGeofencingConsent mapGeofencingConsent = this.geofencingConsent;
            boolean userConsent = mapGeofencingConsent != null ? mapGeofencingConsent.getUserConsent() : false;
            int i5 = userConsent ? R.string.mapbox_attributionGeofencingConsentedPositive : R.string.mapbox_attributionGeofencingRevokedPositive;
            int i6 = userConsent ? R.string.mapbox_attributionGeofencingConsentedNegative : R.string.mapbox_attributionGeofencingRevokedNegative;
            final Snapshotter$$ExternalSyntheticLambda0 snapshotter$$ExternalSyntheticLambda0 = new Snapshotter$$ExternalSyntheticLambda0(13);
            deltaDecoderPrepareDialogBuilder2.serializer(i5, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda4
                public final /* synthetic */ AttributionDialogManagerImpl f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    int i8 = i4;
                    Snapshotter$$ExternalSyntheticLambda0 snapshotter$$ExternalSyntheticLambda1 = snapshotter$$ExternalSyntheticLambda0;
                    AttributionDialogManagerImpl attributionDialogManagerImpl = this.f$0;
                    if (i8 != 0) {
                        MapGeofencingConsent mapGeofencingConsent2 = attributionDialogManagerImpl.geofencingConsent;
                        if (mapGeofencingConsent2 != null) {
                            mapGeofencingConsent2.setUserConsent(false, snapshotter$$ExternalSyntheticLambda1);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    MapGeofencingConsent mapGeofencingConsent3 = attributionDialogManagerImpl.geofencingConsent;
                    if (mapGeofencingConsent3 != null) {
                        mapGeofencingConsent3.setUserConsent(true, snapshotter$$ExternalSyntheticLambda1);
                    }
                    dialogInterface2.cancel();
                }
            });
            deltaDecoderPrepareDialogBuilder2.read(i6, new DialogInterface.OnClickListener(this) { // from class: com.mapbox.maps.plugin.attribution.AttributionDialogManagerImpl$$ExternalSyntheticLambda4
                public final /* synthetic */ AttributionDialogManagerImpl f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    int i8 = i3;
                    Snapshotter$$ExternalSyntheticLambda0 snapshotter$$ExternalSyntheticLambda1 = snapshotter$$ExternalSyntheticLambda0;
                    AttributionDialogManagerImpl attributionDialogManagerImpl = this.f$0;
                    if (i8 != 0) {
                        MapGeofencingConsent mapGeofencingConsent2 = attributionDialogManagerImpl.geofencingConsent;
                        if (mapGeofencingConsent2 != null) {
                            mapGeofencingConsent2.setUserConsent(false, snapshotter$$ExternalSyntheticLambda1);
                        }
                        dialogInterface2.cancel();
                        return;
                    }
                    MapGeofencingConsent mapGeofencingConsent3 = attributionDialogManagerImpl.geofencingConsent;
                    if (mapGeofencingConsent3 != null) {
                        mapGeofencingConsent3.setUserConsent(true, snapshotter$$ExternalSyntheticLambda1);
                    }
                    dialogInterface2.cancel();
                }
            });
            this.geofencingDialog = deltaDecoderPrepareDialogBuilder2.MediaMetadataCompat();
            return;
        }
        String url2 = attribution.getUrl();
        MapAttributionDelegateImpl mapAttributionDelegateImpl = this.mapAttributionDelegate;
        if (mapAttributionDelegateImpl != null && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) url2, (CharSequence) "contribute", false)) {
            Uri.Builder builderBuildUpon = Uri.parse("https://apps.mapbox.com/feedback").buildUpon();
            MapboxMap mapboxMap = mapAttributionDelegateImpl.mapboxMap;
            CameraState cameraState = mapboxMap.getCameraState();
            Point center = cameraState.getCenter();
            builderBuildUpon.encodedFragment("/" + center.longitude() + '/' + center.latitude() + '/' + cameraState.getZoom() + '/' + cameraState.getBearing() + '/' + cameraState.getPitch());
            String packageName = this.context.getApplicationContext().getPackageName();
            if (packageName != null) {
                builderBuildUpon.appendQueryParameter(Constants.REFERRER, packageName);
            }
            builderBuildUpon.appendQueryParameter("access_token", MapboxOptions.getAccessToken());
            Style styleDeprecated = mapboxMap.getStyleDeprecated();
            if (styleDeprecated != null) {
                Pattern patternCompile = Pattern.compile("^(.*://[^:^/]*)/(.*)/(.*)");
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(styleDeprecated.getStyleURI());
                matcher.getClass();
                if (matcher.find()) {
                    builderBuildUpon.appendQueryParameter("owner", matcher.group(2)).appendQueryParameter("id", matcher.group(3));
                }
            }
            url2 = builderBuildUpon.build().toString();
            url2.getClass();
        }
        if (url2.length() > 0) {
            showWebPage(url2);
        }
    }
}
