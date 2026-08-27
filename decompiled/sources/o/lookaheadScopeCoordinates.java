package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzhm;
import com.google.android.gms.measurement.internal.zzpg;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class lookaheadScopeCoordinates extends getOnGloballyPositioned implements setActiveState {
    public final zzhm IconCompatParcelizer;
    public final ImageKt MediaBrowserCompatMediaItem;
    public final ImageKt MediaDescriptionCompat;
    public final ImageKt MediaMetadataCompat;
    public final ImageKt MediaSessionCompatQueueItem;
    public final ImageKt PlaybackStateCompatCustomAction;
    public final ImageKt RatingCompat;
    public final ImageKt RemoteActionCompatParcelizer;
    public final ImageKt read;
    public final ImageKt serializer;
    public final PinnableContainerKtLocalPinnableContainer1 write;

    @Override // o.getOnGloballyPositioned
    public final void read() {
    }

    public final getTvAudioDescriptionMixingVolumeUpEK5gGoQ IconCompatParcelizer(String str, byte[] bArr) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (bArr == null) {
            return getTvAudioDescriptionMixingVolumeUpEK5gGoQ.write();
        }
        try {
            getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoq = (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) ((getTvAntennaCableEK5gGoQ) zzgz.write(getTvAudioDescriptionMixingVolumeUpEK5gGoQ.RemoteActionCompatParcelizer(), bArr)).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer("Parsed config. version, gmp_app_id", gettvaudiodescriptionmixingvolumeupek5ggoq.IconCompatParcelizer() ? Long.valueOf(gettvaudiodescriptionmixingvolumeupek5ggoq.read()) : null, gettvaudiodescriptionmixingvolumeupek5ggoq.serializer() ? gettvaudiodescriptionmixingvolumeupek5ggoq.MediaSessionCompatQueueItem() : null);
            return gettvaudiodescriptionmixingvolumeupek5ggoq;
        } catch (zzmr e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer("Unable to merge remote config. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            return getTvAudioDescriptionMixingVolumeUpEK5gGoQ.write();
        } catch (RuntimeException e2) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.MediaSessionCompatQueueItem.serializer("Unable to merge remote config. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e2);
            return getTvAudioDescriptionMixingVolumeUpEK5gGoQ.write();
        }
    }

    public final void RemoteActionCompatParcelizer(String str, getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        HashSet hashSet = new HashSet();
        ImageKt imageKt = new ImageKt(0);
        ImageKt imageKt2 = new ImageKt(0);
        ImageKt imageKt3 = new ImageKt(0);
        Iterator it = Collections.unmodifiableList(((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).MediaSessionCompatToken()).iterator();
        while (it.hasNext()) {
            hashSet.add(((getThreeEK5gGoQ) it.next()).serializer());
        }
        for (int i = 0; i < ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).RatingCompat(); i++) {
            getTabEK5gGoQ gettabek5ggoq = (getTabEK5gGoQ) ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).write(i).getOnBackPressedDispatcherannotations();
            if (gettabek5ggoq.serializer().isEmpty()) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("EventConfig contained null event name");
            } else {
                String strSerializer = gettabek5ggoq.serializer();
                Object[] objArr = {gettabek5ggoq.serializer(), Measured.IconCompatParcelizer, Measured.RemoteActionCompatParcelizer};
                String str2 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                if (!TextUtils.isEmpty(str2)) {
                    gettabek5ggoq.ParcelableVolumeInfo();
                    ((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).read(str2);
                    gettvantennacableek5ggoq.ParcelableVolumeInfo();
                    ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).write(i, (getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                }
                if (((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).serializer() && ((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).read()) {
                    imageKt.put(strSerializer, Boolean.TRUE);
                }
                if (((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer() && ((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).write()) {
                    imageKt2.put(gettabek5ggoq.serializer(), Boolean.TRUE);
                }
                if (((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).MediaSessionCompatQueueItem()) {
                    if (((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).MediaMetadataCompat() < 2 || ((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).MediaMetadataCompat() > 65535) {
                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer("Invalid sampling rate. Event name, sample rate", gettabek5ggoq.serializer(), Integer.valueOf(((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).MediaMetadataCompat()));
                    } else {
                        imageKt3.put(gettabek5ggoq.serializer(), Integer.valueOf(((getTvAudioDescriptionMixingVolumeDownEK5gGoQ) gettabek5ggoq.IconCompatParcelizer).MediaMetadataCompat()));
                    }
                }
            }
        }
        this.read.put(str, hashSet);
        this.serializer.put(str, imageKt);
        this.RemoteActionCompatParcelizer.put(str, imageKt2);
        this.MediaDescriptionCompat.put(str, imageKt3);
    }

    public final void RemoteActionCompatParcelizer(String str, getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoq) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int iMediaSessionCompatResultReceiverWrapper = gettvaudiodescriptionmixingvolumeupek5ggoq.MediaSessionCompatResultReceiverWrapper();
        zzhm zzhmVar = this.IconCompatParcelizer;
        if (iMediaSessionCompatResultReceiverWrapper == 0) {
            zzhmVar.remove(str);
            return;
        }
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(gettvaudiodescriptionmixingvolumeupek5ggoq.MediaSessionCompatResultReceiverWrapper()), "EES programs found");
        int i = 0;
        getZoomOutEK5gGoQ getzoomoutek5ggoq = (getZoomOutEK5gGoQ) gettvaudiodescriptionmixingvolumeupek5ggoq.MediaMetadataCompat().get(0);
        try {
            zzc zzcVar = new zzc();
            androidx.transition.TransitionValuesMaps transitionValuesMaps = zzcVar.IconCompatParcelizer;
            ((HashMap) ((getZenkakuHankaruEK5gGoQ) transitionValuesMaps.RatingCompat).write).put("internal.remoteConfig", new approachLayout(this, str, 2));
            ((HashMap) ((getZenkakuHankaruEK5gGoQ) transitionValuesMaps.RatingCompat).write).put("internal.appMetadata", new approachLayout(this, str, i));
            ((HashMap) ((getZenkakuHankaruEK5gGoQ) transitionValuesMaps.RatingCompat).write).put("internal.logger", new ModernAsyncTask$1(7, this));
            zzcVar.RemoteActionCompatParcelizer(getzoomoutek5ggoq);
            zzhmVar.put(str, zzcVar);
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgs zzgsVar = getlookaheaddelegate.PlaybackStateCompat;
            zzgsVar.serializer("EES program loaded for appId, activities", str, Integer.valueOf(getzoomoutek5ggoq.RemoteActionCompatParcelizer().write()));
            for (getZoomInEK5gGoQ getzoominek5ggoq : getzoomoutek5ggoq.RemoteActionCompatParcelizer().IconCompatParcelizer()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                zzgsVar.serializer(getzoominek5ggoq.RemoteActionCompatParcelizer(), "EES program activity");
            }
        } catch (zzd unused) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(str, "Failed to load EES program. appId");
        }
    }

    public static final ImageKt RemoteActionCompatParcelizer(getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoq) {
        ImageKt imageKt = new ImageKt(0);
        for (getTvContentsMenuEK5gGoQ gettvcontentsmenuek5ggoq : gettvaudiodescriptionmixingvolumeupek5ggoq.MediaBrowserCompatMediaItem()) {
            imageKt.put(gettvcontentsmenuek5ggoq.IconCompatParcelizer(), gettvcontentsmenuek5ggoq.RemoteActionCompatParcelizer());
        }
        return imageKt;
    }

    public final MeasureScopeDefaultImpls IconCompatParcelizer(String str, MeasureScope measureScope) {
        MediaSessionCompatToken();
        serializer(str);
        getThumbsUpEK5gGoQ getthumbsupek5ggoqRatingCompat = RatingCompat(str);
        if (getthumbsupek5ggoqRatingCompat == null) {
            return MeasureScopeDefaultImpls.UNINITIALIZED;
        }
        for (getSystemNavigationDownEK5gGoQ getsystemnavigationdownek5ggoq : getthumbsupek5ggoqRatingCompat.MediaDescriptionCompat()) {
            if (read(getsystemnavigationdownek5ggoq.IconCompatParcelizer()) == measureScope) {
                int iSerializer = getsystemnavigationdownek5ggoq.serializer() - 1;
                if (iSerializer != 1) {
                    return iSerializer != 2 ? MeasureScopeDefaultImpls.UNINITIALIZED : MeasureScopeDefaultImpls.DENIED;
                }
                return MeasureScopeDefaultImpls.GRANTED;
            }
        }
        return MeasureScopeDefaultImpls.UNINITIALIZED;
    }

    public final getTvAudioDescriptionMixingVolumeUpEK5gGoQ IconCompatParcelizer(String str) {
        ComponentActivity();
        MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        serializer(str);
        return (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) this.MediaSessionCompatQueueItem.get(str);
    }

    public final boolean MediaBrowserCompatMediaItem(String str) {
        MediaSessionCompatToken();
        serializer(str);
        ImageKt imageKt = this.read;
        return imageKt.get(str) != null && ((Set) imageKt.get(str)).contains("app_instance_id");
    }

    public final getThumbsUpEK5gGoQ RatingCompat(String str) {
        MediaSessionCompatToken();
        serializer(str);
        getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer = IconCompatParcelizer(str);
        if (gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer == null || !gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer.PlaybackStateCompat()) {
            return null;
        }
        return gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer.PlaybackStateCompatCustomAction();
    }

    public final String RemoteActionCompatParcelizer(String str) {
        MediaSessionCompatToken();
        serializer(str);
        return (String) this.MediaBrowserCompatMediaItem.get(str);
    }

    public final boolean RemoteActionCompatParcelizer(String str, String str2) {
        Boolean bool;
        MediaSessionCompatToken();
        serializer(str);
        if ("1".equals(serializer(str, "measurement.upload.blacklist_internal")) && onLayoutRectChangeddefault.RemoteActionCompatParcelizer(str2)) {
            return true;
        }
        if ("1".equals(serializer(str, "measurement.upload.blacklist_public")) && onLayoutRectChangeddefault.serializer(str2)) {
            return true;
        }
        Map map = (Map) this.serializer.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int read(String str, String str2) {
        Integer num;
        MediaSessionCompatToken();
        serializer(str);
        Map map = (Map) this.MediaDescriptionCompat.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean read(String str) {
        MediaSessionCompatToken();
        serializer(str);
        getThumbsUpEK5gGoQ getthumbsupek5ggoqRatingCompat = RatingCompat(str);
        if (getthumbsupek5ggoqRatingCompat == null) {
            return false;
        }
        for (getSystemNavigationDownEK5gGoQ getsystemnavigationdownek5ggoq : getthumbsupek5ggoqRatingCompat.read()) {
            if (getsystemnavigationdownek5ggoq.IconCompatParcelizer() == 3 && getsystemnavigationdownek5ggoq.write() == 3) {
                return true;
            }
        }
        return false;
    }

    public final boolean read(String str, MeasureScope measureScope) {
        MediaSessionCompatToken();
        serializer(str);
        getThumbsUpEK5gGoQ getthumbsupek5ggoqRatingCompat = RatingCompat(str);
        if (getthumbsupek5ggoqRatingCompat == null) {
            return false;
        }
        for (getSystemNavigationDownEK5gGoQ getsystemnavigationdownek5ggoq : getthumbsupek5ggoqRatingCompat.read()) {
            if (measureScope == read(getsystemnavigationdownek5ggoq.IconCompatParcelizer())) {
                if (getsystemnavigationdownek5ggoq.serializer() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.setActiveState
    public final String serializer(String str, String str2) {
        MediaSessionCompatToken();
        serializer(str);
        Map map = (Map) this.MediaMetadataCompat.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final void serializer(String str) {
        ComponentActivity();
        MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        ImageKt imageKt = this.MediaSessionCompatQueueItem;
        if (imageKt.get(str) == null) {
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = this.MediaSessionCompatToken.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
            accessgetTvTeletextcp accessgettvteletextcpMediaBrowserCompatMediaItem = layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaBrowserCompatMediaItem(str);
            ImageKt imageKt2 = this.PlaybackStateCompatCustomAction;
            ImageKt imageKt3 = this.RatingCompat;
            ImageKt imageKt4 = this.MediaBrowserCompatMediaItem;
            ImageKt imageKt5 = this.MediaMetadataCompat;
            if (accessgettvteletextcpMediaBrowserCompatMediaItem != null) {
                getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq = (getTvAntennaCableEK5gGoQ) IconCompatParcelizer(str, (byte[]) accessgettvteletextcpMediaBrowserCompatMediaItem.serializer).getOnBackPressedDispatcherannotations();
                RemoteActionCompatParcelizer(str, gettvantennacableek5ggoq);
                imageKt5.put(str, RemoteActionCompatParcelizer((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                imageKt.put(str, (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                RemoteActionCompatParcelizer(str, (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                imageKt4.put(str, ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).ParcelableVolumeInfo());
                imageKt3.put(str, (String) accessgettvteletextcpMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer);
                imageKt2.put(str, (String) accessgettvteletextcpMediaBrowserCompatMediaItem.write);
                return;
            }
            imageKt5.put(str, null);
            this.serializer.put(str, null);
            this.read.put(str, null);
            this.RemoteActionCompatParcelizer.put(str, null);
            imageKt.put(str, null);
            imageKt4.put(str, null);
            imageKt3.put(str, null);
            imageKt2.put(str, null);
            this.MediaDescriptionCompat.put(str, null);
        }
    }

    public final boolean write(String str) {
        MediaSessionCompatToken();
        serializer(str);
        ImageKt imageKt = this.read;
        if (imageKt.get(str) != null) {
            return ((Set) imageKt.get(str)).contains("os_version") || ((Set) imageKt.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean write(String str, String str2) {
        Boolean bool;
        MediaSessionCompatToken();
        serializer(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.RemoteActionCompatParcelizer.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public lookaheadScopeCoordinates(zzpg zzpgVar) {
        super(zzpgVar);
        this.MediaMetadataCompat = new ImageKt(0);
        this.read = new ImageKt(0);
        this.serializer = new ImageKt(0);
        this.RemoteActionCompatParcelizer = new ImageKt(0);
        this.MediaSessionCompatQueueItem = new ImageKt(0);
        this.MediaBrowserCompatMediaItem = new ImageKt(0);
        this.RatingCompat = new ImageKt(0);
        this.PlaybackStateCompatCustomAction = new ImageKt(0);
        this.MediaDescriptionCompat = new ImageKt(0);
        this.IconCompatParcelizer = new zzhm(this);
        this.write = new PinnableContainerKtLocalPinnableContainer1(11, this);
    }

    public final void IconCompatParcelizer(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq;
        byte[] bArrRemoveOnUserLeaveHintListener;
        Iterator it;
        String str4;
        String str5;
        boolean z;
        String str6 = "app_id=? and audience_id=?";
        ComponentActivity();
        MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq2 = (getTvAntennaCableEK5gGoQ) IconCompatParcelizer(str, bArr).getOnBackPressedDispatcherannotations();
        RemoteActionCompatParcelizer(str, gettvantennacableek5ggoq2);
        RemoteActionCompatParcelizer(str, (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoq = (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        ImageKt imageKt = this.MediaSessionCompatQueueItem;
        imageKt.put(str, gettvaudiodescriptionmixingvolumeupek5ggoq);
        this.MediaBrowserCompatMediaItem.put(str, ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq2.IconCompatParcelizer).ParcelableVolumeInfo());
        this.RatingCompat.put(str, str2);
        this.PlaybackStateCompatCustomAction.put(str, str3);
        this.MediaMetadataCompat.put(str, RemoteActionCompatParcelizer((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
        zzpg zzpgVar = this.MediaSessionCompatToken;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
        ArrayList<getStem2EK5gGoQ> arrayList = new ArrayList(Collections.unmodifiableList(((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq2.IconCompatParcelizer).MediaDescriptionCompat()));
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i = 0;
        while (i < arrayList.size()) {
            getStem1EK5gGoQ getstem1ek5ggoq = (getStem1EK5gGoQ) ((getStem2EK5gGoQ) arrayList.get(i)).getOnBackPressedDispatcherannotations();
            ImageKt imageKt2 = imageKt;
            if (((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).MediaMetadataCompat() != 0) {
                int i2 = 0;
                while (i2 < ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).MediaMetadataCompat()) {
                    getSoftSleepEK5gGoQ getsoftsleepek5ggoq = (getSoftSleepEK5gGoQ) ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).serializer(i2).getOnBackPressedDispatcherannotations();
                    getSoftSleepEK5gGoQ getsoftsleepek5ggoq2 = (getSoftSleepEK5gGoQ) getsoftsleepek5ggoq.clone();
                    zzpg zzpgVar2 = zzpgVar;
                    getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq3 = gettvantennacableek5ggoq2;
                    String str7 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{((getSpacebarEK5gGoQ) getsoftsleepek5ggoq.IconCompatParcelizer).read(), Measured.IconCompatParcelizer, Measured.RemoteActionCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                    if (str7 != null) {
                        getsoftsleepek5ggoq2.ParcelableVolumeInfo();
                        ((getSpacebarEK5gGoQ) getsoftsleepek5ggoq2.IconCompatParcelizer).read(str7);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < ((getSpacebarEK5gGoQ) getsoftsleepek5ggoq.IconCompatParcelizer).MediaBrowserCompatMediaItem()) {
                        getSystemHomeEK5gGoQ getsystemhomeek5ggoqIconCompatParcelizer = ((getSpacebarEK5gGoQ) getsoftsleepek5ggoq.IconCompatParcelizer).IconCompatParcelizer(i3);
                        getSoftSleepEK5gGoQ getsoftsleepek5ggoq3 = getsoftsleepek5ggoq;
                        String str8 = str6;
                        String str9 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{getsystemhomeek5ggoqIconCompatParcelizer.MediaSessionCompatQueueItem(), getMeasuredHeight.serializer, getMeasuredHeight.RemoteActionCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                        if (str9 != null) {
                            getStemPrimaryEK5gGoQ getstemprimaryek5ggoq = (getStemPrimaryEK5gGoQ) getsystemhomeek5ggoqIconCompatParcelizer.getOnBackPressedDispatcherannotations();
                            getstemprimaryek5ggoq.ParcelableVolumeInfo();
                            ((getSystemHomeEK5gGoQ) getstemprimaryek5ggoq.IconCompatParcelizer).write(str9);
                            getSystemHomeEK5gGoQ getsystemhomeek5ggoq = (getSystemHomeEK5gGoQ) getstemprimaryek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            getsoftsleepek5ggoq2.ParcelableVolumeInfo();
                            ((getSpacebarEK5gGoQ) getsoftsleepek5ggoq2.IconCompatParcelizer).serializer(i3, getsystemhomeek5ggoq);
                            z = true;
                        }
                        i3++;
                        getsoftsleepek5ggoq = getsoftsleepek5ggoq3;
                        str6 = str8;
                    }
                    String str10 = str6;
                    if (z) {
                        getstem1ek5ggoq.ParcelableVolumeInfo();
                        ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer(i2, (getSpacebarEK5gGoQ) getsoftsleepek5ggoq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                        arrayList.set(i, (getStem2EK5gGoQ) getstem1ek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    }
                    i2++;
                    zzpgVar = zzpgVar2;
                    gettvantennacableek5ggoq2 = gettvantennacableek5ggoq3;
                    str6 = str10;
                }
            }
            String str11 = str6;
            getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq4 = gettvantennacableek5ggoq2;
            zzpg zzpgVar3 = zzpgVar;
            if (((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer() != 0) {
                for (int i4 = 0; i4 < ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer(); i4++) {
                    getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoqWrite = ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).write(i4);
                    String str12 = (String) TuplesKt.RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{getsystemnavigationupek5ggoqWrite.IconCompatParcelizer(), MeasureScopelayout1.write, MeasureScopelayout1.RemoteActionCompatParcelizer}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
                    if (str12 != null) {
                        getSystemNavigationLeftEK5gGoQ getsystemnavigationleftek5ggoq = (getSystemNavigationLeftEK5gGoQ) getsystemnavigationupek5ggoqWrite.getOnBackPressedDispatcherannotations();
                        getsystemnavigationleftek5ggoq.ParcelableVolumeInfo();
                        ((getSystemNavigationUpEK5gGoQ) getsystemnavigationleftek5ggoq.IconCompatParcelizer).write(str12);
                        getstem1ek5ggoq.ParcelableVolumeInfo();
                        ((getStem2EK5gGoQ) getstem1ek5ggoq.IconCompatParcelizer).read(i4, (getSystemNavigationUpEK5gGoQ) getsystemnavigationleftek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                        arrayList.set(i, (getStem2EK5gGoQ) getstem1ek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                    }
                }
            }
            i++;
            imageKt = imageKt2;
            zzpgVar = zzpgVar3;
            gettvantennacableek5ggoq2 = gettvantennacableek5ggoq4;
            str6 = str11;
        }
        String str13 = str6;
        getTvAntennaCableEK5gGoQ gettvantennacableek5ggoq5 = gettvantennacableek5ggoq2;
        zzpg zzpgVar4 = zzpgVar;
        ImageKt imageKt3 = imageKt;
        layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
        layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        SQLiteDatabase sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
        sQLiteDatabaseResultReceiver.beginTransaction();
        try {
            layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
            SQLiteDatabase sQLiteDatabaseResultReceiver2 = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
            sQLiteDatabaseResultReceiver2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseResultReceiver2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    getStem2EK5gGoQ getstem2ek5ggoq = (getStem2EK5gGoQ) it2.next();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(getstem2ek5ggoq);
                    if (getstem2ek5ggoq.IconCompatParcelizer()) {
                        int iWrite = getstem2ek5ggoq.write();
                        Iterator it3 = getstem2ek5ggoq.serializer().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!((getSpacebarEK5gGoQ) it3.next()).IconCompatParcelizer()) {
                                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Event filter with no ID. Audience definition ignored. appId, audienceId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), Integer.valueOf(iWrite));
                                    break;
                                }
                            } else {
                                Iterator it4 = getstem2ek5ggoq.read().iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        Iterator it5 = getstem2ek5ggoq.serializer().iterator();
                                        while (true) {
                                            boolean zHasNext = it5.hasNext();
                                            String str14 = HiAnalyticsConstant.BI_KEY_APP_ID;
                                            try {
                                                if (!zHasNext) {
                                                    sQLiteDatabase = sQLiteDatabaseResultReceiver;
                                                    it = it2;
                                                    str4 = str;
                                                    Iterator it6 = getstem2ek5ggoq.read().iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            getSystemNavigationUpEK5gGoQ getsystemnavigationupek5ggoq = (getSystemNavigationUpEK5gGoQ) it6.next();
                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                                                            layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                                                            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                                                            accessgetSystemNavigationDowncp.IconCompatParcelizer(getsystemnavigationupek5ggoq);
                                                            if (getsystemnavigationupek5ggoq.IconCompatParcelizer().isEmpty()) {
                                                                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                                                getlookaheaddelegate2.MediaSessionCompatQueueItem.IconCompatParcelizer("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), Integer.valueOf(iWrite), String.valueOf(getsystemnavigationupek5ggoq.serializer() ? Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer()) : null));
                                                            } else {
                                                                byte[] bArrRemoveOnUserLeaveHintListener2 = getsystemnavigationupek5ggoq.removeOnUserLeaveHintListener();
                                                                ContentValues contentValues = new ContentValues();
                                                                contentValues.put(str14, str4);
                                                                Iterator it7 = it6;
                                                                contentValues.put("audience_id", Integer.valueOf(iWrite));
                                                                contentValues.put("filter_id", getsystemnavigationupek5ggoq.serializer() ? Integer.valueOf(getsystemnavigationupek5ggoq.RemoteActionCompatParcelizer()) : null);
                                                                String str15 = str14;
                                                                contentValues.put("property_name", getsystemnavigationupek5ggoq.IconCompatParcelizer());
                                                                contentValues.put("session_scoped", getsystemnavigationupek5ggoq.MediaDescriptionCompat() ? Boolean.valueOf(getsystemnavigationupek5ggoq.MediaBrowserCompatMediaItem()) : null);
                                                                contentValues.put(RemoteMessageConst.DATA, bArrRemoveOnUserLeaveHintListener2);
                                                                try {
                                                                    if (layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                                                        getlookaheaddelegate3.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to insert property filter (got -1). appId");
                                                                    } else {
                                                                        it6 = it7;
                                                                        str14 = str15;
                                                                    }
                                                                } catch (SQLiteException e) {
                                                                    getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                                                    getlookaheaddelegate4.serializer.serializer("Error storing property filter. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                                                                }
                                                            }
                                                        } else {
                                                            str5 = str13;
                                                        }
                                                        str13 = str5;
                                                        it2 = it;
                                                        sQLiteDatabaseResultReceiver = sQLiteDatabase;
                                                        break;
                                                    }
                                                }
                                                getSpacebarEK5gGoQ getspacebarek5ggoq = (getSpacebarEK5gGoQ) it5.next();
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                                                accessgetSystemNavigationDowncp.IconCompatParcelizer(getspacebarek5ggoq);
                                                if (!getspacebarek5ggoq.read().isEmpty()) {
                                                    it = it2;
                                                    byte[] bArrRemoveOnUserLeaveHintListener3 = getspacebarek5ggoq.removeOnUserLeaveHintListener();
                                                    Iterator it8 = it5;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    sQLiteDatabase = sQLiteDatabaseResultReceiver;
                                                    str4 = str;
                                                    contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str4);
                                                    contentValues2.put("audience_id", Integer.valueOf(iWrite));
                                                    contentValues2.put("filter_id", getspacebarek5ggoq.IconCompatParcelizer() ? Integer.valueOf(getspacebarek5ggoq.write()) : null);
                                                    contentValues2.put("event_name", getspacebarek5ggoq.read());
                                                    contentValues2.put("session_scoped", getspacebarek5ggoq.ParcelableVolumeInfo() ? Boolean.valueOf(getspacebarek5ggoq.MediaSessionCompatResultReceiverWrapper()) : null);
                                                    contentValues2.put(RemoteMessageConst.DATA, bArrRemoveOnUserLeaveHintListener3);
                                                    try {
                                                        if (layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                                            getlookaheaddelegate5.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it2 = it;
                                                        it5 = it8;
                                                        sQLiteDatabaseResultReceiver = sQLiteDatabase;
                                                    } catch (SQLiteException e2) {
                                                        getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                                        getlookaheaddelegate6.serializer.serializer("Error storing event filter. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e2);
                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                                                        layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                                                        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                                                        SQLiteDatabase sQLiteDatabaseResultReceiver3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
                                                        str5 = str13;
                                                        sQLiteDatabaseResultReceiver3.delete("property_filters", str5, new String[]{str4, String.valueOf(iWrite)});
                                                        sQLiteDatabaseResultReceiver3.delete("event_filters", str5, new String[]{str4, String.valueOf(iWrite)});
                                                        str13 = str5;
                                                        it2 = it;
                                                        sQLiteDatabaseResultReceiver = sQLiteDatabase;
                                                        break;
                                                    }
                                                } else {
                                                    getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                                                    getlookaheaddelegate7.MediaSessionCompatQueueItem.IconCompatParcelizer("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), Integer.valueOf(iWrite), String.valueOf(getspacebarek5ggoq.IconCompatParcelizer() ? Integer.valueOf(getspacebarek5ggoq.write()) : null));
                                                    sQLiteDatabase = sQLiteDatabaseResultReceiver;
                                                    it = it2;
                                                    str4 = str;
                                                }
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
                                                layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
                                                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                                                SQLiteDatabase sQLiteDatabaseResultReceiver4 = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
                                                str5 = str13;
                                                sQLiteDatabaseResultReceiver4.delete("property_filters", str5, new String[]{str4, String.valueOf(iWrite)});
                                                sQLiteDatabaseResultReceiver4.delete("event_filters", str5, new String[]{str4, String.valueOf(iWrite)});
                                                str13 = str5;
                                                it2 = it;
                                                sQLiteDatabaseResultReceiver = sQLiteDatabase;
                                                break;
                                                break;
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteDatabase.endTransaction();
                                                throw th;
                                            }
                                        }
                                    }
                                    if (!((getSystemNavigationUpEK5gGoQ) it4.next()).serializer()) {
                                        getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                                        getlookaheaddelegate8.MediaSessionCompatQueueItem.serializer("Property filter with no ID. Audience definition ignored. appId, audienceId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), Integer.valueOf(iWrite));
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                        getlookaheaddelegate9.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Audience with no ID. appId");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseResultReceiver;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase = sQLiteDatabaseResultReceiver;
            ArrayList arrayList2 = new ArrayList();
            for (getStem2EK5gGoQ getstem2ek5ggoq2 : arrayList) {
                arrayList2.add(getstem2ek5ggoq2.IconCompatParcelizer() ? Integer.valueOf(getstem2ek5ggoq2.write()) : null);
            }
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
            layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
            SQLiteDatabase sQLiteDatabaseResultReceiver5 = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
            try {
                long jWrite = layoutNodeSubcompositionsStatecreateMeasurePolicy1.write("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer(str, premeasure0kLqBqw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)));
                if (jWrite > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseResultReceiver5.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e3) {
                getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                getlookaheaddelegate10.serializer.serializer("Database error querying filters. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                gettvantennacableek5ggoq5.ParcelableVolumeInfo();
                gettvantennacableek5ggoq = gettvantennacableek5ggoq5;
                try {
                    ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    bArrRemoveOnUserLeaveHintListener = ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()).removeOnUserLeaveHintListener();
                } catch (RuntimeException e4) {
                    e = e4;
                    getLookaheadDelegate getlookaheaddelegate11 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                    getlookaheaddelegate11.MediaSessionCompatQueueItem.serializer("Unable to serialize reduced-size config. Storing full config instead. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                    bArrRemoveOnUserLeaveHintListener = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                gettvantennacableek5ggoq = gettvantennacableek5ggoq5;
            }
            LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
            layoutNodeSubcompositionsStatecreateMeasurePolicy2.MediaSessionCompatToken();
            layoutNodeSubcompositionsStatecreateMeasurePolicy2.ComponentActivity();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrRemoveOnUserLeaveHintListener);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (layoutNodeSubcompositionsStatecreateMeasurePolicy2.ResultReceiver().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    getLookaheadDelegate getlookaheaddelegate12 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate12);
                    getlookaheaddelegate12.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                getLookaheadDelegate getlookaheaddelegate13 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate13);
                getlookaheaddelegate13.serializer.serializer("Error storing remote config. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e6);
            }
            gettvantennacableek5ggoq.ParcelableVolumeInfo();
            ((getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.IconCompatParcelizer).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            imageKt3.put(str, (getTvAudioDescriptionMixingVolumeUpEK5gGoQ) gettvantennacableek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseResultReceiver;
        }
    }

    public static final MeasureScope read(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return MeasureScope.AD_STORAGE;
        }
        if (i2 == 2) {
            return MeasureScope.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return MeasureScope.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return MeasureScope.AD_PERSONALIZATION;
    }
}
