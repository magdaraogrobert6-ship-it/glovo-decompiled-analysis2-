package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.measurement.internal.zzr;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class resume extends LayoutNodeSubcompositionsStatedeactivateOutOfFrame1 {
    public String IconCompatParcelizer;
    public List MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public long ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public String read;
    public String serializer;
    public int write;

    @Override // o.LayoutNodeSubcompositionsStatedeactivateOutOfFrame1
    public final boolean MediaMetadataCompat() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    public final zzr serializer(String str) {
        long j;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        int i2;
        long j2;
        int iMediaMetadataCompat;
        long jMediaSessionCompatQueueItem;
        long jSerializer;
        MediaSessionCompatToken();
        String strMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        String strComponentActivity = ComponentActivity();
        serializer();
        String str7 = this.IconCompatParcelizer;
        serializer();
        long j3 = this.write;
        serializer();
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) this.serializer);
        String str8 = this.serializer;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost2 = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        Context context = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        setcomposedwithreusablecontenthost.read();
        serializer();
        MediaSessionCompatToken();
        long j4 = this.RatingCompat;
        long j5 = j4;
        if (j4 == 0) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            String packageName = context.getPackageName();
            onlayoutrectchangeddefault.MediaSessionCompatToken();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(packageName);
            PackageManager packageManager = context.getPackageManager();
            MessageDigest messageDigestSerializer = onLayoutRectChangeddefault.serializer();
            if (messageDigestSerializer == null) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Could not get MD5 instance");
                j = j3;
                str2 = str8;
            } else {
                if (packageManager != null) {
                    try {
                        if (onlayoutrectchangeddefault.serializer(context, packageName)) {
                            j = j3;
                            str2 = str8;
                            jSerializer = 0;
                        } else {
                            str2 = str8;
                            try {
                                j = j3;
                                try {
                                    Signature[] signatureArr = accessgetTvMediaContextMenucp.serializer(context).read(64, lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                        getlookaheaddelegate3.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Could not get signatures");
                                    } else {
                                        jSerializer = onLayoutRectChangeddefault.serializer(messageDigestSerializer.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.serializer.serializer(e, "Package name not found");
                                    jSerializer = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j3;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        j = j3;
                        str2 = str8;
                    }
                } else {
                    j = j3;
                    str2 = str8;
                    jSerializer = 0;
                }
                this.RatingCompat = jSerializer;
                j5 = jSerializer;
            }
            jSerializer = -1;
            this.RatingCompat = jSerializer;
            j5 = jSerializer;
        } else {
            j = j3;
            str2 = str8;
        }
        boolean zWrite = lookaheadScopeKtLookaheadScope221.write();
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        boolean z = !lookaheadScopeKt.MediaSessionCompatToken;
        MediaSessionCompatToken();
        if (lookaheadScopeKtLookaheadScope221.write()) {
            if (setcomposedwithreusablecontenthost2.write(null, premeasure0kLqBqw._init_lambda1)) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                            if (objInvoke != null) {
                                try {
                                    str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                } catch (Exception unused) {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.RatingCompat.RemoteActionCompatParcelizer("Failed to retrieve Firebase Instance Id");
                                    str3 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str3 = null;
        } else {
            str3 = null;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        long jRemoteActionCompatParcelizer = lookaheadScopeKt.write.RemoteActionCompatParcelizer();
        long j6 = lookaheadScopeKtLookaheadScope221.MediaMetadataCompat;
        long jMin = jRemoteActionCompatParcelizer == 0 ? j6 : Math.min(j6, jRemoteActionCompatParcelizer);
        serializer();
        int i3 = this.MediaSessionCompatResultReceiverWrapper;
        Boolean boolRemoteActionCompatParcelizer = setcomposedwithreusablecontenthost2.RemoteActionCompatParcelizer("google_analytics_adid_collection_enabled");
        boolean z2 = boolRemoteActionCompatParcelizer == null || boolRemoteActionCompatParcelizer.booleanValue();
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.MediaSessionCompatToken();
        boolean z3 = lookaheadScopeKt.serializer().getBoolean("deferred_analytics_collection", false);
        boolean z4 = setcomposedwithreusablecontenthost2.read("google_analytics_default_allow_ad_personalization_signals", true) != MeasureScopeDefaultImpls.GRANTED;
        List list = this.MediaBrowserCompatMediaItem;
        String strRemoteActionCompatParcelizer = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().RemoteActionCompatParcelizer();
        if (this.PlaybackStateCompat == null) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            this.PlaybackStateCompat = onlayoutrectchangeddefault.ResultReceiver();
        }
        String str9 = this.PlaybackStateCompat;
        if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
            MediaSessionCompatToken();
            if (this.ParcelableVolumeInfo == 0) {
                str4 = strComponentActivity;
                str5 = str7;
            } else {
                lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                str4 = strComponentActivity;
                str5 = str7;
                long j7 = this.ParcelableVolumeInfo;
                if (this.PlaybackStateCompatCustomAction != null && jCurrentTimeMillis - j7 > CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                    MediaSessionCompatQueueItem();
                }
            }
            if (this.PlaybackStateCompatCustomAction == null) {
                MediaSessionCompatQueueItem();
            }
            str6 = this.PlaybackStateCompatCustomAction;
        } else {
            str4 = strComponentActivity;
            str5 = str7;
            str6 = null;
        }
        Boolean boolRemoteActionCompatParcelizer2 = setcomposedwithreusablecontenthost2.RemoteActionCompatParcelizer("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolRemoteActionCompatParcelizer2 == null ? false : boolRemoteActionCompatParcelizer2.booleanValue();
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        String strMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper();
        if (lookaheadScopeKtLookaheadScope223.MediaDescriptionCompat.getPackageManager() == null) {
            j2 = 0;
            i = 0;
        } else {
            try {
                i = 0;
                try {
                    ApplicationInfo applicationInfoWrite = accessgetTvMediaContextMenucp.serializer(lookaheadScopeKtLookaheadScope223.MediaDescriptionCompat).write(0, strMediaSessionCompatResultReceiverWrapper2);
                    i2 = applicationInfoWrite != null ? applicationInfoWrite.targetSdkVersion : i;
                } catch (PackageManager.NameNotFoundException unused4) {
                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                    getlookaheaddelegate5.MediaMetadataCompat.serializer(strMediaSessionCompatResultReceiverWrapper2, "PackageManager failed to find running app: app_id");
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i = 0;
            }
            j2 = i2;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        int i4 = lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().read;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.MediaSessionCompatToken();
        String str10 = LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult1.IconCompatParcelizer(lookaheadScopeKt.serializer().getString("dma_consent_settings", null)).write;
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00;
        if (setcomposedwithreusablecontenthost2.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            iMediaMetadataCompat = onLayoutRectChangeddefault.MediaMetadataCompat();
        } else {
            iMediaMetadataCompat = i;
        }
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        if (setcomposedwithreusablecontenthost2.write(null, layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1)) {
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            jMediaSessionCompatQueueItem = onlayoutrectchangeddefault.MediaSessionCompatQueueItem();
        } else {
            jMediaSessionCompatQueueItem = 0;
        }
        String str11 = setcomposedwithreusablecontenthost2.serializer;
        char c = getMeasuredWidth.read(setcomposedwithreusablecontenthost2.read("google_analytics_default_allow_ad_personalization_signals", true));
        long j8 = lookaheadScopeKtLookaheadScope221.MediaMetadataCompat;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope221.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        return new zzr(strMediaSessionCompatResultReceiverWrapper, str4, str5, j, str2, 133005L, j5, str, zWrite, z, str3, jMin, i3, z2, z3, Boolean.valueOf(z4), this.MediaDescriptionCompat, list, strRemoteActionCompatParcelizer, str9, str6, zBooleanValue, j2, i4, str10, iMediaMetadataCompat, jMediaSessionCompatQueueItem, str11, String.valueOf(c), j8, lookaheadScopeKtLookaheadScope221.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.MediaSessionCompatQueueItem().zza());
    }

    public final String ComponentActivity() {
        MediaSessionCompatToken();
        serializer();
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) this.MediaSessionCompatToken);
        return this.MediaSessionCompatToken;
    }

    public final void MediaSessionCompatQueueItem() {
        String str;
        MediaSessionCompatToken();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        if (lookaheadScopeKt.MediaSessionCompatResultReceiverWrapper().IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            onlayoutrectchangeddefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().nextBytes(bArr);
            str = String.format(java.util.Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Analytics Storage consent is not granted");
            str = null;
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.PlaybackStateCompatCustomAction = str;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        this.ParcelableVolumeInfo = System.currentTimeMillis();
    }

    public final String MediaSessionCompatResultReceiverWrapper() {
        serializer();
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) this.read);
        return this.read;
    }

    public resume(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221, long j, long j2) {
        super(lookaheadScopeKtLookaheadScope221);
        this.ParcelableVolumeInfo = 0L;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        this.MediaDescriptionCompat = j;
        this.MediaMetadataCompat = j2;
    }
}
