package o;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadScopeKtLookaheadScope11 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ LookaheadScopeKtdefaultPlacementApproachInProgress1 serializer;
    public final /* synthetic */ zzr write;

    public /* synthetic */ LookaheadScopeKtLookaheadScope11(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, zzr zzrVar, int i) {
        this.IconCompatParcelizer = i;
        this.write = zzrVar;
        this.serializer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzpg zzpgVar;
        zzr zzrVar;
        String str;
        zzr zzrVar2;
        int i = this.IconCompatParcelizer;
        zzr zzrVar3 = this.write;
        LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = this.serializer;
        if (i == 0) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.write(zzrVar3);
            return;
        }
        if (i == 1) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            zzpg zzpgVar2 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
            zzpgVar2.PlaybackStateCompat().MediaSessionCompatToken();
            zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(zzrVar3);
            String str2 = zzrVar3.RatingCompat;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
            int i2 = 0;
            if (zzpgVar2.MediaDescriptionCompat().write(null, premeasure0kLqBqw.onMultiWindowModeChanged)) {
                ((accessgetTvInputComposite1cp) zzpgVar2.ParcelableVolumeInfo()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iSerializer = zzpgVar2.MediaDescriptionCompat().serializer(null, premeasure0kLqBqw.getActivityResultRegistry);
                zzpgVar2.MediaDescriptionCompat();
                long jLongValue = ((Long) premeasure0kLqBqw.peekAvailableContext.IconCompatParcelizer(null)).longValue();
                while (i2 < iSerializer && zzpgVar2.read(jCurrentTimeMillis - jLongValue, (String) null)) {
                    i2++;
                }
            } else {
                zzpgVar2.MediaDescriptionCompat();
                long jIntValue = ((Integer) premeasure0kLqBqw.removeOnTrimMemoryListener.IconCompatParcelizer(null)).intValue();
                while (i2 < jIntValue && zzpgVar2.read(0L, str2)) {
                    i2++;
                }
            }
            if (zzpgVar2.MediaDescriptionCompat().write(null, premeasure0kLqBqw.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw)) {
                zzpgVar2.PlaybackStateCompat().MediaSessionCompatToken();
                zzpgVar2.write();
            }
            OnGloballyPositionedModifierKt onGloballyPositionedModifierKt = zzpgVar2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            getWindowEK5gGoQ getwindowek5ggoqZzb = getWindowEK5gGoQ.zzb(zzrVar3.IconCompatParcelizer);
            onGloballyPositionedModifierKt.MediaSessionCompatToken();
            if (getwindowek5ggoqZzb != getWindowEK5gGoQ.CLIENT_UPLOAD_ELIGIBLE || OnGloballyPositionedModifierKt.IconCompatParcelizer(str2)) {
                return;
            }
            lookaheadScopeCoordinates lookaheadscopecoordinates = onGloballyPositionedModifierKt.MediaSessionCompatToken.PlaybackStateCompat;
            zzpg.serializer(lookaheadscopecoordinates);
            getTvAudioDescriptionMixingVolumeUpEK5gGoQ gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer = lookaheadscopecoordinates.IconCompatParcelizer(str2);
            if (gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer == null || !gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer.ComponentActivity() || gettvaudiodescriptionmixingvolumeupek5ggoqIconCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().serializer().isEmpty()) {
                return;
            }
            zzpgVar2.RatingCompat().PlaybackStateCompat.serializer(str2, "[sgtm] Going background, trigger client side upload. appId");
            ((accessgetTvInputComposite1cp) zzpgVar2.ParcelableVolumeInfo()).getClass();
            zzpgVar2.IconCompatParcelizer(System.currentTimeMillis(), str2);
            return;
        }
        if (i == 2) {
            lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
            zzpg zzpgVar3 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
            zzpgVar3.PlaybackStateCompat().MediaSessionCompatToken();
            zzpgVar3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzrVar3.RatingCompat);
            zzpgVar3.read(zzrVar3);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
                zzpg zzpgVar4 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                zzpgVar4.PlaybackStateCompat().MediaSessionCompatToken();
                zzpgVar4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(zzrVar3.RatingCompat);
                zzpgVar4.serializer(zzrVar3);
                zzpgVar4.MediaSessionCompatQueueItem(zzrVar3);
                return;
            }
            if (i != 5) {
                zzpg zzpgVar5 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                zzpgVar5.serializer();
                zzpgVar5.serializer(zzrVar3);
                return;
            } else {
                zzpg zzpgVar6 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                zzpgVar6.serializer();
                zzpgVar6.MediaSessionCompatQueueItem(zzrVar3);
                return;
            }
        }
        lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
        zzpg zzpgVar7 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
        if (zzpgVar7.ensureViewModelStore != null) {
            ArrayList arrayList = new ArrayList();
            zzpgVar7.serializer = arrayList;
            arrayList.addAll(zzpgVar7.ensureViewModelStore);
        }
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        String str3 = zzrVar3.RatingCompat;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str3);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
        layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken();
        layoutNodeSubcompositionsStatecreateMeasurePolicy1.ComponentActivity();
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = layoutNodeSubcompositionsStatecreateMeasurePolicy1.ResultReceiver();
            String[] strArr = {str3};
            int iDelete = sQLiteDatabaseResultReceiver.delete("apps", "app_id=?", strArr);
            int iDelete2 = sQLiteDatabaseResultReceiver.delete("events", "app_id=?", strArr);
            int iDelete3 = sQLiteDatabaseResultReceiver.delete("events_snapshot", "app_id=?", strArr);
            int iDelete4 = sQLiteDatabaseResultReceiver.delete("user_attributes", "app_id=?", strArr);
            int iDelete5 = sQLiteDatabaseResultReceiver.delete("conditional_properties", "app_id=?", strArr);
            int iDelete6 = sQLiteDatabaseResultReceiver.delete("raw_events", "app_id=?", strArr);
            int iDelete7 = sQLiteDatabaseResultReceiver.delete("raw_events_metadata", "app_id=?", strArr);
            int iDelete8 = sQLiteDatabaseResultReceiver.delete("queue", "app_id=?", strArr);
            int iDelete9 = sQLiteDatabaseResultReceiver.delete("audience_filter_values", "app_id=?", strArr);
            zzpgVar = zzpgVar7;
            try {
                int iDelete10 = sQLiteDatabaseResultReceiver.delete("main_event_params", "app_id=?", strArr);
                zzrVar = zzrVar3;
                try {
                    try {
                        try {
                            int iDelete11 = iDelete + iDelete2 + iDelete3 + iDelete4 + iDelete5 + iDelete6 + iDelete7 + iDelete8 + iDelete9 + iDelete10 + sQLiteDatabaseResultReceiver.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseResultReceiver.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseResultReceiver.delete("upload_queue", "app_id=?", strArr);
                            lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope221;
                            if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onSaveInstanceState)) {
                                iDelete11 += sQLiteDatabaseResultReceiver.delete("no_data_mode_events", "app_id=?", strArr);
                            }
                            if (iDelete11 > 0) {
                                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                str = str3;
                                try {
                                    getlookaheaddelegate.PlaybackStateCompat.serializer("Reset analytics data. app, records", str, Integer.valueOf(iDelete11));
                                } catch (SQLiteException e) {
                                    e = e;
                                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                    getlookaheaddelegate2.serializer.serializer("Error resetting analytics data. appId, error", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                                }
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            str = str3;
                            lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope221;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        str = str3;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str = str3;
                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.serializer.serializer("Error resetting analytics data. appId, error", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                    zzrVar2 = zzrVar;
                    if (zzrVar2.ParcelableVolumeInfo) {
                        zzpgVar.write(zzrVar2);
                    }
                }
            } catch (SQLiteException e5) {
                e = e5;
                zzrVar = zzrVar3;
                str = str3;
                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                getlookaheaddelegate4.serializer.serializer("Error resetting analytics data. appId, error", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                zzrVar2 = zzrVar;
                if (zzrVar2.ParcelableVolumeInfo) {
                    zzpgVar.write(zzrVar2);
                }
            }
        } catch (SQLiteException e6) {
            e = e6;
            zzpgVar = zzpgVar7;
        }
        zzrVar2 = zzrVar;
        if (zzrVar2.ParcelableVolumeInfo) {
            zzpgVar.write(zzrVar2);
        }
    }
}
