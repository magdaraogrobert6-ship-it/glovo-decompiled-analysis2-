package com.mapbox.navigation.core.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.SdkInfoRegistry;
import com.mapbox.common.SdkInfoRegistryFactory;
import com.mapbox.common.SdkInformation;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.ArrayList;
import java.util.List;
import o.copyColorMatrixgBh15pIdefault;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationSDKInitializerImpl implements copyColorMatrixgBh15pIdefault {
    @Override // o.copyColorMatrixgBh15pIdefault
    public final Object create(Context context) throws PackageManager.NameNotFoundException {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        context.getClass();
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor);
        applicationInfo.getClass();
        Bundle bundle = applicationInfo.metaData;
        SdkVariant sdkVariant = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bundle != null ? Boolean.valueOf(bundle.getBoolean("com.mapbox.navigation.UxFramework")) : null, Boolean.TRUE}, getCieXyz.write())).booleanValue() ? SdkVariant.UX_FRAMEWORK : SdkVariant.CORE_FRAMEWORK;
        SdkVariant sdkVariant2 = SdkVariantKt.sdkVariant;
        sdkVariant.getClass();
        SdkVariantKt.sdkVariant = sdkVariant;
        SdkInfoRegistry sdkInfoRegistryFactory = SdkInfoRegistryFactory.getInstance();
        int i = SdkInfoProvider$WhenMappings.$EnumSwitchMapping$0[SdkVariantKt.sdkVariant.ordinal()];
        if (i == 1) {
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("mapbox-navigationCore-android", "com.mapbox.navigationCore");
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("mapbox-navigationUX-android", "com.mapbox.navigationUX");
        }
        sdkInfoRegistryFactory.registerSdkInformation(new SdkInformation((String) onviewattachedtowindowlambda0.serializer, "3.25.1", (String) onviewattachedtowindowlambda0.write));
        return MapboxNavigationSDK.INSTANCE;
    }

    @Override // o.copyColorMatrixgBh15pIdefault
    public final List dependencies() {
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        return (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new Class[]{MapboxSDKCommonInitializerImpl.class, MapboxNavigationNativeInitializerImpl.class}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
    }
}
