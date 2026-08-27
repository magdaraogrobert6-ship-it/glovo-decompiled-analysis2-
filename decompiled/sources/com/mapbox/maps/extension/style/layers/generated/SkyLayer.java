package com.mapbox.maps.extension.style.layers.generated;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class SkyLayer extends Layer {
    public final /* synthetic */ int $r8$classId;
    public final String layerId;

    public SkyLayer(String str, String str2, int i) {
        this.$r8$classId = i;
        str.getClass();
        str2.getClass();
        if (i == 3) {
            this.layerId = str;
            this.internalSourceId = str2;
            return;
        }
        if (i == 4) {
            this.layerId = str;
            this.internalSourceId = str2;
            return;
        }
        if (i == 6) {
            this.layerId = str;
            this.internalSourceId = str2;
        } else if (i == 7) {
            this.layerId = str;
            this.internalSourceId = str2;
        } else if (i != 8) {
            this.layerId = str;
            this.internalSourceId = str2;
        } else {
            this.layerId = str;
            this.internalSourceId = str2;
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Layer visibility(Visibility visibility) {
        switch (this.$r8$classId) {
            case 0:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 1:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 2:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 3:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 4:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 5:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 6:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 7:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            case 8:
                visibility.getClass();
                setProperty$extension_style_release(new PropertyValue(RemoteMessageConst.Notification.VISIBILITY, visibility));
                break;
            default:
                visibility.getClass();
                break;
        }
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getLayerId() {
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
        }
        return this.layerId;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final Visibility getVisibility() {
        int i = this.$r8$classId;
        Visibility visibility = Visibility.NONE;
        Visibility visibility2 = Visibility.VISIBLE;
        switch (i) {
            case 0:
                String str = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str != null) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    String strReplace = upperCase.replace('-', '_');
                    strReplace.getClass();
                    if (strReplace.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace));
                }
                return null;
            case 1:
                String str2 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str2 != null) {
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    String upperCase2 = str2.toUpperCase(locale2);
                    upperCase2.getClass();
                    String strReplace2 = upperCase2.replace('-', '_');
                    strReplace2.getClass();
                    if (strReplace2.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace2.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace2));
                }
                return null;
            case 2:
                String str3 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str3 != null) {
                    Locale locale3 = Locale.US;
                    locale3.getClass();
                    String upperCase3 = str3.toUpperCase(locale3);
                    upperCase3.getClass();
                    String strReplace3 = upperCase3.replace('-', '_');
                    strReplace3.getClass();
                    if (strReplace3.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace3.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace3));
                }
                return null;
            case 3:
                String str4 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str4 != null) {
                    Locale locale4 = Locale.US;
                    locale4.getClass();
                    String upperCase4 = str4.toUpperCase(locale4);
                    upperCase4.getClass();
                    String strReplace4 = upperCase4.replace('-', '_');
                    strReplace4.getClass();
                    if (strReplace4.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace4.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace4));
                }
                return null;
            case 4:
                String str5 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str5 != null) {
                    Locale locale5 = Locale.US;
                    locale5.getClass();
                    String upperCase5 = str5.toUpperCase(locale5);
                    upperCase5.getClass();
                    String strReplace5 = upperCase5.replace('-', '_');
                    strReplace5.getClass();
                    if (strReplace5.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace5.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace5));
                }
                return null;
            case 5:
                String str6 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str6 != null) {
                    Locale locale6 = Locale.US;
                    locale6.getClass();
                    String upperCase6 = str6.toUpperCase(locale6);
                    upperCase6.getClass();
                    String strReplace6 = upperCase6.replace('-', '_');
                    strReplace6.getClass();
                    if (strReplace6.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace6.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace6));
                }
                return null;
            case 6:
                String str7 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str7 != null) {
                    Locale locale7 = Locale.US;
                    locale7.getClass();
                    String upperCase7 = str7.toUpperCase(locale7);
                    upperCase7.getClass();
                    String strReplace7 = upperCase7.replace('-', '_');
                    strReplace7.getClass();
                    if (strReplace7.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace7.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace7));
                }
                return null;
            case 7:
                String str8 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str8 != null) {
                    Locale locale8 = Locale.US;
                    locale8.getClass();
                    String upperCase8 = str8.toUpperCase(locale8);
                    upperCase8.getClass();
                    String strReplace8 = upperCase8.replace('-', '_');
                    strReplace8.getClass();
                    if (strReplace8.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace8.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace8));
                }
                return null;
            case 8:
                String str9 = (String) Layer.access$getPropertyValueWithType(this, RemoteMessageConst.Notification.VISIBILITY, String.class);
                if (str9 != null) {
                    Locale locale9 = Locale.US;
                    locale9.getClass();
                    String upperCase9 = str9.toUpperCase(locale9);
                    upperCase9.getClass();
                    String strReplace9 = upperCase9.replace('-', '_');
                    strReplace9.getClass();
                    if (strReplace9.equals("VISIBLE")) {
                        return visibility2;
                    }
                    if (strReplace9.equals("NONE")) {
                        return visibility;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(m1$$ExternalSyntheticOutline0.m(']', "Visibility.valueOf does not support [", strReplace9));
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public final String getType$extension_style_release() {
        switch (this.$r8$classId) {
            case 0:
                return "sky";
            case 1:
                return "background";
            case 2:
                return "clip";
            case 3:
                return "heatmap";
            case 4:
                return "hillshade";
            case 5:
                return "location-indicator";
            case 6:
                return "model";
            case 7:
                return "raster";
            case 8:
                return "raster-particle";
            default:
                return "slot";
        }
    }

    public SkyLayer(String str, int i) {
        this.$r8$classId = i;
        str.getClass();
        if (i == 1) {
            this.layerId = str;
            return;
        }
        if (i == 5) {
            this.layerId = str;
        } else if (i != 9) {
            this.layerId = str;
        } else {
            this.layerId = str;
        }
    }
}
