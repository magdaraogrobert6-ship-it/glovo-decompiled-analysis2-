package o;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class getExtra implements Runnable {
    public final /* synthetic */ Bundle read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ NoWindowInsetsAnimation write;

    public /* synthetic */ getExtra(NoWindowInsetsAnimation noWindowInsetsAnimation, Bundle bundle, int i) {
        this.serializer = i;
        this.read = bundle;
        this.write = noWindowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i = this.serializer;
        Bundle bundle2 = this.read;
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.write;
        if (i == 0) {
            noWindowInsetsAnimation.MediaSessionCompatToken();
            noWindowInsetsAnimation.serializer();
            String string = bundle2.getString("name");
            String string2 = bundle2.getString("origin");
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(string);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(string2);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle2.get("value"));
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (!lookaheadScopeKtLookaheadScope221.write()) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Conditional property not set since app measurement is disabled");
                return;
            }
            zzpl zzplVar = new zzpl(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
            try {
                onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                zzbg zzbgVarRemoteActionCompatParcelizer = onlayoutrectchangeddefault.RemoteActionCompatParcelizer(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                zzbg zzbgVarRemoteActionCompatParcelizer2 = onlayoutrectchangeddefault.RemoteActionCompatParcelizer(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat().serializer(new zzah(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID), string2, zzplVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), zzbgVarRemoteActionCompatParcelizer2, bundle2.getLong("trigger_timeout"), zzbgVarRemoteActionCompatParcelizer, bundle2.getLong("time_to_live"), onlayoutrectchangeddefault.RemoteActionCompatParcelizer(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                return;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
        if (i == 1) {
            noWindowInsetsAnimation.MediaSessionCompatToken();
            noWindowInsetsAnimation.serializer();
            String string3 = bundle2.getString("name");
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(string3);
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (!lookaheadScopeKtLookaheadScope222.write()) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Conditional property not cleared since app measurement is disabled");
                return;
            } else {
                zzpl zzplVar2 = new zzpl(0L, null, string3, "");
                try {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                    bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID);
                    lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat().serializer(new zzah(bundle2.getString(HiAnalyticsConstant.BI_KEY_APP_ID), "", zzplVar2, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), onlayoutrectchangeddefault2.RemoteActionCompatParcelizer(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            }
        }
        coil3.memory.MemoryCacheService memoryCacheService = noWindowInsetsAnimation.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (bundle2.isEmpty()) {
            bundle = bundle2;
        } else {
            LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
            onLayoutRectChangeddefault onlayoutrectchangeddefault3 = lookaheadScopeKtLookaheadScope223.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope223.PlaybackStateCompat;
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            bundle = new Bundle(lookaheadScopeKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer());
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                    if (onLayoutRectChangeddefault.RatingCompat(obj)) {
                        onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, 27, null, null, 0);
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.RatingCompat.serializer("Invalid default event parameter type. Name, value", str, obj);
                } else if (onLayoutRectChangeddefault.RemoteActionCompatParcelizer(str)) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.RatingCompat.serializer(str, "Invalid default event parameter name. Name");
                } else if (obj == null) {
                    bundle.remove(str);
                } else {
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                    setcomposedwithreusablecontenthost.getClass();
                    if (onlayoutrectchangeddefault3.serializer(RemoteMessageConst.MessageBody.PARAM, str, Constant.ERROR_UNKNOWN, obj)) {
                        onlayoutrectchangeddefault3.write(str, bundle, obj);
                    }
                }
            }
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
            onLayoutRectChangeddefault onlayoutrectchangeddefault4 = ((LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
            int i2 = onlayoutrectchangeddefault4.read(201500000) ? 100 : 25;
            if (bundle.size() > i2) {
                int i3 = 0;
                for (String str2 : new TreeSet(bundle.keySet())) {
                    i3++;
                    if (i3 > i2) {
                        bundle.remove(str2);
                    }
                }
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                onLayoutRectChangeddefault.RemoteActionCompatParcelizer(memoryCacheService, null, 26, null, null, 0);
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.RatingCompat.RemoteActionCompatParcelizer("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        LookaheadScopeKt lookaheadScopeKt2 = lookaheadScopeKtLookaheadScope223.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
        lookaheadScopeKt2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(bundle);
        if (!bundle2.isEmpty() || lookaheadScopeKtLookaheadScope223.PlaybackStateCompat.write(null, premeasure0kLqBqw.addContentView)) {
            lookaheadScopeKtLookaheadScope223.MediaDescriptionCompat().serializer(bundle);
        }
    }
}
