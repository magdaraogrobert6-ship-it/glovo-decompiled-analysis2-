package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.zzao;
import com.huawei.hms.framework.common.ContainerUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class maxHeight extends LayoutNodeSubcompositionsStatecreateMeasureResult1 {
    public final /* synthetic */ NoWindowInsetsAnimation RatingCompat;
    public final /* synthetic */ int write;

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:63:0x0195  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f9  */
    @Override // o.LayoutNodeSubcompositionsStatecreateMeasureResult1
    public final void serializer() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222;
        setViewportBounds setviewportboundsMediaDescriptionCompat;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223;
        isComplete iscomplete;
        zzao zzaoVarMediaMetadataCompat;
        Bundle bundle;
        String str;
        int i;
        boolean z;
        String str2;
        URL url;
        int i2 = this.write;
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.RatingCompat;
        if (i2 == 0) {
            NoWindowInsetsAnimation noWindowInsetsAnimation2 = ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation2);
            new Thread(new setDebounceMillis(noWindowInsetsAnimation2, 1)).start();
            return;
        }
        if (i2 == 1) {
            noWindowInsetsAnimation.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            return;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope224 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope224.PlaybackStateCompatCustomAction;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope224.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope224.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        NoOpSubcomposeSlotReusePolicy noOpSubcomposeSlotReusePolicy = lookaheadScopeKtLookaheadScope224.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        LookaheadScopeKtLookaheadScope221.write(noOpSubcomposeSlotReusePolicy);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope225 = (LookaheadScopeKtLookaheadScope221) noOpSubcomposeSlotReusePolicy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope221.write(noOpSubcomposeSlotReusePolicy);
        String strMediaSessionCompatResultReceiverWrapper = lookaheadScopeKtLookaheadScope224.MediaMetadataCompat().MediaSessionCompatResultReceiverWrapper();
        Boolean boolRemoteActionCompatParcelizer = lookaheadScopeKtLookaheadScope224.PlaybackStateCompat.RemoteActionCompatParcelizer("google_analytics_adid_collection_enabled");
        if (boolRemoteActionCompatParcelizer != null && !boolRemoteActionCompatParcelizer.booleanValue()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("ADID collection is disabled from Manifest. Skipping");
            return;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope226 = (LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKt.MediaSessionCompatToken();
        if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.AD_STORAGE)) {
            lookaheadScopeKtLookaheadScope226.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String str3 = lookaheadScopeKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope224;
            if (str3 == null || jElapsedRealtime >= lookaheadScopeKt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
                lookaheadScopeKt.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = lookaheadScopeKtLookaheadScope226.PlaybackStateCompat.RemoteActionCompatParcelizer(strMediaSessionCompatResultReceiverWrapper, premeasure0kLqBqw.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) + jElapsedRealtime;
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(lookaheadScopeKtLookaheadScope226.MediaDescriptionCompat);
                    lookaheadScopeKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = "";
                    String id = advertisingIdInfo.getId();
                    if (id != null) {
                        lookaheadScopeKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = id;
                    }
                    lookaheadScopeKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope226.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.MediaSessionCompatToken.serializer(e, "Unable to get advertising id");
                    lookaheadScopeKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = "";
                }
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                pair = new Pair(lookaheadScopeKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Boolean.valueOf(lookaheadScopeKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
            } else {
                pair = new Pair(str3, Boolean.valueOf(lookaheadScopeKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
            }
        } else {
            lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope224;
            pair = new Pair("", Boolean.FALSE);
        }
        if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        LookaheadScopeKtLookaheadScope221.write(noOpSubcomposeSlotReusePolicy);
        noOpSubcomposeSlotReusePolicy.ComponentActivity();
        ConnectivityManager connectivityManager = (ConnectivityManager) lookaheadScopeKtLookaheadScope225.MediaDescriptionCompat.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        StringBuilder sb = new StringBuilder();
        setViewportBounds setviewportboundsMediaDescriptionCompat2 = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat();
        setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
        setviewportboundsMediaDescriptionCompat2.serializer();
        if (setviewportboundsMediaDescriptionCompat2.MediaSessionCompatResultReceiverWrapper()) {
            onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            if (onlayoutrectchangeddefault.MediaSessionCompatResultReceiverWrapper() >= 234200) {
                lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope221;
                NoWindowInsetsAnimation noWindowInsetsAnimation3 = lookaheadScopeKtLookaheadScope222.ComponentActivity;
                LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation3);
                LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope227 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                noWindowInsetsAnimation3.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope227.MediaDescriptionCompat();
                lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                setviewportboundsMediaDescriptionCompat.serializer();
                iscomplete = setviewportboundsMediaDescriptionCompat.write;
                if (iscomplete == null) {
                    setviewportboundsMediaDescriptionCompat.MediaSessionCompatQueueItem();
                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.MediaSessionCompatToken.RemoteActionCompatParcelizer("Failed to get consents; not connected to service yet.");
                } else {
                    zzaoVarMediaMetadataCompat = iscomplete.MediaMetadataCompat(setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(false));
                    setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    if (zzaoVarMediaMetadataCompat != null) {
                        bundle = zzaoVarMediaMetadataCompat.serializer;
                    } else {
                        bundle = null;
                    }
                    if (bundle == null) {
                        i = lookaheadScopeKtLookaheadScope222.write;
                        lookaheadScopeKtLookaheadScope222.write = i + 1;
                        if (i < 10) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        if (i < 10) {
                            str2 = "Retrying.";
                        } else {
                            str2 = "Skipping.";
                        }
                        getlookaheaddelegate.MediaSessionCompatToken.serializer(Integer.valueOf(lookaheadScopeKtLookaheadScope222.write), d$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                        if (z) {
                            noWindowInsetsAnimation.ComponentActivity.RemoteActionCompatParcelizer(ConstantKt.DEFAULT_REQUEST_TIMEOUT);
                            return;
                        }
                        return;
                    }
                    getMeasuredWidth getmeasuredwidthWrite = getMeasuredWidth.write(100, bundle);
                    sb.append("&gcs=");
                    sb.append(getmeasuredwidthWrite.serializer());
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(100, bundle);
                    str = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.RemoteActionCompatParcelizer;
                    sb.append("&dma=");
                    sb.append(!Objects.equals(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write.serializer, Boolean.FALSE) ? 1 : 0);
                    if (!TextUtils.isEmpty(str)) {
                        sb.append("&dma_cps=");
                        sb.append(str);
                    }
                    boolean zEquals = Objects.equals(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer(bundle), Boolean.TRUE);
                    sb.append("&npa=");
                    sb.append(!zEquals ? 1 : 0);
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.serializer(sb, "Consent query parameters to Bow");
                }
                zzaoVarMediaMetadataCompat = null;
                if (zzaoVarMediaMetadataCompat != null) {
                    bundle = zzaoVarMediaMetadataCompat.serializer;
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    i = lookaheadScopeKtLookaheadScope222.write;
                    lookaheadScopeKtLookaheadScope222.write = i + 1;
                    if (i < 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    if (i < 10) {
                        str2 = "Retrying.";
                    } else {
                        str2 = "Skipping.";
                    }
                    getlookaheaddelegate.MediaSessionCompatToken.serializer(Integer.valueOf(lookaheadScopeKtLookaheadScope222.write), d$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                    if (z) {
                        noWindowInsetsAnimation.ComponentActivity.RemoteActionCompatParcelizer(ConstantKt.DEFAULT_REQUEST_TIMEOUT);
                        return;
                    }
                    return;
                }
                getMeasuredWidth getmeasuredwidthWrite2 = getMeasuredWidth.write(100, bundle);
                sb.append("&gcs=");
                sb.append(getmeasuredwidthWrite2.serializer());
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write2 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(100, bundle);
                str = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write2.RemoteActionCompatParcelizer;
                sb.append("&dma=");
                sb.append(!Objects.equals(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write2.serializer, Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(str)) {
                    sb.append("&dma_cps=");
                    sb.append(str);
                }
                boolean zEquals2 = Objects.equals(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer(bundle), Boolean.TRUE);
                sb.append("&npa=");
                sb.append(!zEquals2 ? 1 : 0);
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.serializer(sb, "Consent query parameters to Bow");
            } else {
                lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope221;
            }
        } else {
            lookaheadScopeKtLookaheadScope222 = lookaheadScopeKtLookaheadScope221;
            NoWindowInsetsAnimation noWindowInsetsAnimation4 = lookaheadScopeKtLookaheadScope222.ComponentActivity;
            LookaheadScopeKtLookaheadScope221.serializer(noWindowInsetsAnimation4);
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope228 = (LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            noWindowInsetsAnimation4.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat = lookaheadScopeKtLookaheadScope228.MediaDescriptionCompat();
            lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
            setviewportboundsMediaDescriptionCompat.serializer();
            iscomplete = setviewportboundsMediaDescriptionCompat.write;
            if (iscomplete == null) {
                setviewportboundsMediaDescriptionCompat.MediaSessionCompatQueueItem();
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.MediaSessionCompatToken.RemoteActionCompatParcelizer("Failed to get consents; not connected to service yet.");
            } else {
                try {
                    zzaoVarMediaMetadataCompat = iscomplete.MediaMetadataCompat(setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer(false));
                    setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                } catch (RemoteException e2) {
                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                    getlookaheaddelegate5.serializer.serializer(e2, "Failed to get consents; remote exception");
                    zzaoVarMediaMetadataCompat = null;
                }
                if (zzaoVarMediaMetadataCompat != null) {
                    bundle = zzaoVarMediaMetadataCompat.serializer;
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    i = lookaheadScopeKtLookaheadScope222.write;
                    lookaheadScopeKtLookaheadScope222.write = i + 1;
                    if (i < 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    if (i < 10) {
                        str2 = "Retrying.";
                    } else {
                        str2 = "Skipping.";
                    }
                    getlookaheaddelegate.MediaSessionCompatToken.serializer(Integer.valueOf(lookaheadScopeKtLookaheadScope222.write), d$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                    if (z) {
                        noWindowInsetsAnimation.ComponentActivity.RemoteActionCompatParcelizer(ConstantKt.DEFAULT_REQUEST_TIMEOUT);
                        return;
                    }
                    return;
                }
                getMeasuredWidth getmeasuredwidthWrite3 = getMeasuredWidth.write(100, bundle);
                sb.append("&gcs=");
                sb.append(getmeasuredwidthWrite3.serializer());
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write3 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(100, bundle);
                str = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write3.RemoteActionCompatParcelizer;
                sb.append("&dma=");
                sb.append(!Objects.equals(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write3.serializer, Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(str)) {
                    sb.append("&dma_cps=");
                    sb.append(str);
                }
                boolean zEquals3 = Objects.equals(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer(bundle), Boolean.TRUE);
                sb.append("&npa=");
                sb.append(!zEquals3 ? 1 : 0);
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.serializer(sb, "Consent query parameters to Bow");
            }
            zzaoVarMediaMetadataCompat = null;
            if (zzaoVarMediaMetadataCompat != null) {
                bundle = zzaoVarMediaMetadataCompat.serializer;
            } else {
                bundle = null;
            }
            if (bundle == null) {
                i = lookaheadScopeKtLookaheadScope222.write;
                lookaheadScopeKtLookaheadScope222.write = i + 1;
                if (i < 10) {
                    z = true;
                } else {
                    z = false;
                }
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                if (i < 10) {
                    str2 = "Retrying.";
                } else {
                    str2 = "Skipping.";
                }
                getlookaheaddelegate.MediaSessionCompatToken.serializer(Integer.valueOf(lookaheadScopeKtLookaheadScope222.write), d$$ExternalSyntheticOutline0.m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                if (z) {
                    noWindowInsetsAnimation.ComponentActivity.RemoteActionCompatParcelizer(ConstantKt.DEFAULT_REQUEST_TIMEOUT);
                    return;
                }
                return;
            }
            getMeasuredWidth getmeasuredwidthWrite4 = getMeasuredWidth.write(100, bundle);
            sb.append("&gcs=");
            sb.append(getmeasuredwidthWrite4.serializer());
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write4 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.write(100, bundle);
            str = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write4.RemoteActionCompatParcelizer;
            sb.append("&dma=");
            sb.append(!Objects.equals(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1Write4.serializer, Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(str)) {
                sb.append("&dma_cps=");
                sb.append(str);
            }
            boolean zEquals4 = Objects.equals(LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.RemoteActionCompatParcelizer(bundle), Boolean.TRUE);
            sb.append("&npa=");
            sb.append(!zEquals4 ? 1 : 0);
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(sb, "Consent query parameters to Bow");
        }
        onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope222.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
        ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKtLookaheadScope222.MediaMetadataCompat().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.read();
        String str4 = (String) pair.first;
        long jRemoteActionCompatParcelizer = lookaheadScopeKt.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
        String string = sb.toString();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope229 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        try {
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str4);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(strMediaSessionCompatResultReceiverWrapper);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + onlayoutrectchangeddefault2.MediaSessionCompatResultReceiverWrapper()) + "&rdid=" + str4 + "&bundleid=" + strMediaSessionCompatResultReceiverWrapper + "&retry=" + (jRemoteActionCompatParcelizer - 1);
            if (strMediaSessionCompatResultReceiverWrapper.equals(lookaheadScopeKtLookaheadScope229.PlaybackStateCompat.read("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!string.isEmpty()) {
                if (string.charAt(0) != '&') {
                    strConcat = strConcat.concat(ContainerUtils.FIELD_DELIMITER);
                }
                strConcat = strConcat.concat(string);
            }
            url = new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e3) {
            getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope229.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
            getlookaheaddelegate6.serializer.serializer(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
            url = null;
        }
        if (url != null) {
            LookaheadScopeKtLookaheadScope221.write(noOpSubcomposeSlotReusePolicy);
            localLookaheadPositionOfFgt4K4Q locallookaheadpositionoffgt4k4q = new localLookaheadPositionOfFgt4K4Q(lookaheadScopeKtLookaheadScope222);
            noOpSubcomposeSlotReusePolicy.ComponentActivity();
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope225.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
            lookaheadScopeKtLookaheadScope5.serializer((Runnable) new LookaheadScope(noOpSubcomposeSlotReusePolicy, strMediaSessionCompatResultReceiverWrapper, url, (byte[]) null, (HashMap) null, locallookaheadpositionoffgt4k4q));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maxHeight(NoWindowInsetsAnimation noWindowInsetsAnimation, layoutdefault layoutdefaultVar, int i) {
        super(layoutdefaultVar);
        this.write = i;
        if (i == 1) {
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.RatingCompat = noWindowInsetsAnimation;
            super(layoutdefaultVar);
        } else if (i == 2) {
            this.RatingCompat = noWindowInsetsAnimation;
            super(layoutdefaultVar);
        } else {
            Objects.requireNonNull(noWindowInsetsAnimation);
            this.RatingCompat = noWindowInsetsAnimation;
        }
    }
}
