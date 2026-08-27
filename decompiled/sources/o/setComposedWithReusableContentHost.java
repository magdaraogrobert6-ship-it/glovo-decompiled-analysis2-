package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class setComposedWithReusableContentHost extends androidx.compose.animation.core.TransitionState {
    public Boolean IconCompatParcelizer;
    public Boolean read;
    public String serializer;
    public setActiveState write;

    public final Bundle MediaMetadataCompat() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        try {
            Context context = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
            Context context2 = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            if (context.getPackageManager() == null) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoWrite = accessgetTvMediaContextMenucp.serializer(context2).write(androidx.compose.ui.graphics.Fields.SpotShadowColor, context2.getPackageName());
            if (applicationInfoWrite != null) {
                return applicationInfoWrite.metaData;
            }
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final boolean MediaSessionCompatQueueItem() {
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("firebase_analytics_collection_deactivated");
        return boolRemoteActionCompatParcelizer != null && boolRemoteActionCompatParcelizer.booleanValue();
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("google_analytics_automatic_screen_reporting_enabled");
        return boolRemoteActionCompatParcelizer == null || boolRemoteActionCompatParcelizer.booleanValue();
    }

    public final String read(String str) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str2);
            return str2;
        } catch (ClassNotFoundException e) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.serializer(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
            getlookaheaddelegate4.serializer.serializer(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void read() {
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
    }

    public final boolean serializer(String str) {
        return "1".equals(this.write.serializer(str, "measurement.event_sampling_enabled"));
    }

    public final boolean write(String str) {
        return "1".equals(this.write.serializer(str, "gaia_collection_enabled"));
    }

    public final Boolean RemoteActionCompatParcelizer(String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        Bundle bundleMediaMetadataCompat = MediaMetadataCompat();
        if (bundleMediaMetadataCompat != null) {
            if (bundleMediaMetadataCompat.containsKey(str)) {
                return Boolean.valueOf(bundleMediaMetadataCompat.getBoolean(str));
            }
            return null;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final MeasureScopeDefaultImpls read(String str, boolean z) {
        Object obj;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Bundle bundleMediaMetadataCompat = MediaMetadataCompat();
        if (bundleMediaMetadataCompat == null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleMediaMetadataCompat.get(str);
        }
        if (obj == null) {
            return MeasureScopeDefaultImpls.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return MeasureScopeDefaultImpls.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return MeasureScopeDefaultImpls.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return MeasureScopeDefaultImpls.POLICY;
        }
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer(str, "Invalid manifest metadata for");
        return MeasureScopeDefaultImpls.UNINITIALIZED;
    }

    public final boolean serializer() {
        if (this.read == null) {
            Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("app_measurement_lite");
            this.read = boolRemoteActionCompatParcelizer;
            if (boolRemoteActionCompatParcelizer == null) {
                this.read = Boolean.FALSE;
            }
        }
        return this.read.booleanValue() || !((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).RatingCompat;
    }

    public final double IconCompatParcelizer(String str, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).doubleValue();
        }
        String strSerializer = this.write.serializer(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.write);
        if (TextUtils.isEmpty(strSerializer)) {
            return ((Double) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).doubleValue();
        }
        try {
            return ((Double) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(Double.valueOf(Double.parseDouble(strSerializer)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).doubleValue();
        }
    }

    public final long RemoteActionCompatParcelizer(String str, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue();
        }
        String strSerializer = this.write.serializer(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.write);
        if (TextUtils.isEmpty(strSerializer)) {
            return ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue();
        }
        try {
            return ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(Long.valueOf(Long.parseLong(strSerializer)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue();
        }
    }

    public final String read(String str, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) {
        return TextUtils.isEmpty(str) ? (String) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null) : (String) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(this.write.serializer(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.write));
    }

    public final int serializer(String str, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).intValue();
        }
        String strSerializer = this.write.serializer(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.write);
        if (TextUtils.isEmpty(strSerializer)) {
            return ((Integer) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).intValue();
        }
        try {
            return ((Integer) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(Integer.valueOf(Integer.parseInt(strSerializer)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).intValue();
        }
    }

    public final boolean write(String str, LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).booleanValue();
        }
        String strSerializer = this.write.serializer(str, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.write);
        return TextUtils.isEmpty(strSerializer) ? ((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).booleanValue() : ((Boolean) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(Boolean.valueOf("1".equals(strSerializer)))).booleanValue();
    }

    public setComposedWithReusableContentHost(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
    }
}
