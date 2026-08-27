package o;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzgs;
import com.huawei.hms.support.api.entity.core.CommonCode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class maxWidth implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 2;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    public maxWidth(NoWindowInsetsAnimation noWindowInsetsAnimation, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.IconCompatParcelizer = atomicReference;
        this.serializer = str;
        this.write = str2;
        this.read = z;
        Objects.requireNonNull(noWindowInsetsAnimation);
        this.RatingCompat = noWindowInsetsAnimation;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleIconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.RatingCompat;
        if (i == 0) {
            setViewportBounds setviewportboundsMediaDescriptionCompat = ((AppMeasurementDynamiteService) obj2).zza.MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new onFirstVisible(setviewportboundsMediaDescriptionCompat, this.serializer, this.write, setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(false), this.read, (getQEK5gGoQ) obj));
            return;
        }
        if (i == 1) {
            setViewportBounds setviewportboundsMediaDescriptionCompat2 = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) obj2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
            setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat2.serializer();
            setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new onFirstVisible(setviewportboundsMediaDescriptionCompat2, (AtomicReference) obj, this.serializer, this.write, setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(false), this.read));
            return;
        }
        zzfa zzfaVar = (zzfa) obj2;
        NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) zzfaVar.IconCompatParcelizer;
        noWindowInsetsAnimation.MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        coil3.memory.MemoryCacheService memoryCacheService = noWindowInsetsAnimation.read;
        String str = this.write;
        Uri uri = (Uri) obj;
        try {
            onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            String str2 = "Activity created with data 'referrer' without required params";
            if (TextUtils.isEmpty(str)) {
                bundleIconCompatParcelizer = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleIconCompatParcelizer = onlayoutrectchangeddefault.IconCompatParcelizer(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleIconCompatParcelizer != null) {
                    bundleIconCompatParcelizer.putString("_cis", com.adjust.sdk.Constants.REFERRER);
                }
            } else {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.MediaSessionCompatToken.RemoteActionCompatParcelizer("Activity created with data 'referrer' without required params");
                bundleIconCompatParcelizer = null;
            }
            boolean z = this.read;
            String str3 = this.serializer;
            if (z) {
                try {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                    Bundle bundleIconCompatParcelizer2 = onlayoutrectchangeddefault2.IconCompatParcelizer(uri);
                    if (bundleIconCompatParcelizer2 != null) {
                        bundleIconCompatParcelizer2.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        if (!bundleIconCompatParcelizer2.containsKey("gclid") && bundleIconCompatParcelizer != null && bundleIconCompatParcelizer.containsKey("gclid")) {
                            bundleIconCompatParcelizer2.putString("_cer", "gclid=" + bundleIconCompatParcelizer.getString("gclid"));
                        }
                        noWindowInsetsAnimation.RemoteActionCompatParcelizer(str3, "_cmp", bundleIconCompatParcelizer2);
                        memoryCacheService.RemoteActionCompatParcelizer(bundleIconCompatParcelizer2, str3);
                    } else {
                        str2 = "Activity created with data 'referrer' without required params";
                    }
                } catch (RuntimeException e) {
                    e = e;
                    getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) zzfaVar.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.serializer.serializer(e, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
            } else {
                str2 = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgs zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
            zzgsVar.serializer(str, "Activity created with referrer");
            if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw._init_lambda4)) {
                if (bundleIconCompatParcelizer != null) {
                    noWindowInsetsAnimation.RemoteActionCompatParcelizer(str3, "_cmp", bundleIconCompatParcelizer);
                    memoryCacheService.RemoteActionCompatParcelizer(bundleIconCompatParcelizer, str3);
                } else {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    zzgsVar.serializer(str, "Referrer does not contain valid parameters");
                }
                lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                noWindowInsetsAnimation.write("auto", "_ldl", null, true, System.currentTimeMillis());
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar.RemoteActionCompatParcelizer(str2);
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                noWindowInsetsAnimation.write("auto", "_ldl", str, true, System.currentTimeMillis());
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public maxWidth(AppMeasurementDynamiteService appMeasurementDynamiteService, getQEK5gGoQ getqek5ggoq, String str, String str2, boolean z) {
        this.IconCompatParcelizer = getqek5ggoq;
        this.serializer = str;
        this.write = str2;
        this.read = z;
        this.RatingCompat = appMeasurementDynamiteService;
    }

    public maxWidth(zzfa zzfaVar, boolean z, Uri uri, String str, String str2) {
        this.read = z;
        this.IconCompatParcelizer = uri;
        this.serializer = str;
        this.write = str2;
        this.RatingCompat = zzfaVar;
    }
}
