package com.mapbox.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.nio.charset.StandardCharsets;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onItemDismisslambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes5.dex */
public final class AccessTokenInitializer {
    public static final AccessTokenInitializer INSTANCE;
    private static byte IconCompatParcelizer = 0;
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_initialization_settings";
    private static final String SETTING_NAME = "MapboxInitialized";
    private static final String TAG = "AccessTokenInitializer";
    private static final onViewDetachedFromWindowlambda1 preferences$delegate;
    private static int serializer = 0;
    private static int write = 1;

    private AccessTokenInitializer() {
    }

    private static final boolean getAllowInitialization() {
        try {
            return INSTANCE.getPreferences().getBoolean(SETTING_NAME, false);
        } catch (ClassCastException e) {
            Log.error("Unable to get a value for MapboxInitialized: " + e.getMessage(), TAG);
            return false;
        }
    }

    public static final boolean isAccessTokenInitializationAllowed() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier("com.mapbox.common.enable_delayed_initialization_logic", "bool", str)) == 0 || !resources.getBoolean(identifier)) {
                return true;
            }
            return getAllowInitialization();
        } catch (Throwable th) {
            Log.error("Unable to get access token initialization status: " + th.getMessage(), TAG);
        }
        return true;
    }

    @onItemDismisslambda0
    public static final void readEnvAndSetAccessToken() {
    }

    static {
        IconCompatParcelizer();
        INSTANCE = new AccessTokenInitializer();
        Object[] objArr = {new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.AccessTokenInitializer$preferences$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final SharedPreferences invoke() {
                return MapboxSDKCommon.INSTANCE.getContext().getSharedPreferences("mapbox_initialization_settings", 0);
            }
        }};
        preferences$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) preferences$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final void setAllowInitialization(boolean z) {
        if (z) {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationTrue").increment();
        } else {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationFalse").increment();
        }
        SharedPreferences.Editor editorEdit = INSTANCE.getPreferences().edit();
        editorEdit.putBoolean(SETTING_NAME, z);
        editorEdit.apply();
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static final String getAccessTokenFromEnv() {
        Resources resources;
        int identifier;
        int i = 2 % 2;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return "";
            }
            int i2 = serializer + 71;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str = applicationInfo.packageName;
            if (str == null || (identifier = (resources = context.getResources()).getIdentifier("mapbox_access_token", "string", str)) == 0) {
                return "";
            }
            int i4 = write + 67;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String string = resources.getString(identifier);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
            }
            string.getClass();
            return string;
        } catch (Throwable unused) {
            Log.warning("Unable to fetch `mapbox_access_token` resource value", TAG);
            return "";
        }
    }

    static void IconCompatParcelizer() {
        IconCompatParcelizer = (byte) -112;
    }
}
