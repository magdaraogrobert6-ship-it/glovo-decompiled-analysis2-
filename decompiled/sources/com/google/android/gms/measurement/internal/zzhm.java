package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import androidx.room.coroutines.ConnectionWithLock;
import com.google.android.gms.internal.measurement.zzc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.LayoutNodeSubcompositionsStatecreateMeasurePolicy1;
import o.LookaheadScopeKtLookaheadScope221;
import o.UncheckedColordefault;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvTeletextcp;
import o.getLookaheadDelegate;
import o.lookaheadScopeCoordinates;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhm extends LruCache {
    public final /* synthetic */ int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(lookaheadScopeCoordinates lookaheadscopecoordinates) {
        super(20);
        this.RatingCompat = lookaheadscopecoordinates;
    }

    @Override // androidx.collection.LruCache
    public final Object create(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        if (this.MediaDescriptionCompat != 0) {
            String str = (String) obj;
            str.getClass();
            return ((ConnectionWithLock) this.RatingCompat).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str);
        }
        String str2 = (String) obj;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        lookaheadScopeCoordinates lookaheadscopecoordinates = (lookaheadScopeCoordinates) this.RatingCompat;
        lookaheadscopecoordinates.ComponentActivity();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = lookaheadscopecoordinates.MediaSessionCompatToken.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
        accessgetTvTeletextcp accessgettvteletextcpMediaBrowserCompatMediaItem = layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaBrowserCompatMediaItem(str2);
        if (accessgettvteletextcpMediaBrowserCompatMediaItem == null) {
            return null;
        }
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer(str2, "Populate EES config from database on cache miss. appId");
        lookaheadscopecoordinates.RemoteActionCompatParcelizer(str2, lookaheadscopecoordinates.IconCompatParcelizer(str2, (byte[]) accessgettvteletextcpMediaBrowserCompatMediaItem.serializer));
        zzhm zzhmVar = lookaheadscopecoordinates.IconCompatParcelizer;
        synchronized (zzhmVar.IconCompatParcelizer) {
            Set setEntrySet = zzhmVar.serializer.serializer.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = zzhmVar.serializer.serializer.entrySet();
            setEntrySet2.getClass();
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (zzc) linkedHashMap.get(str2);
    }

    @Override // androidx.collection.LruCache
    public void entryRemoved(Object obj, Object obj2, Object obj3) throws Exception {
        if (this.MediaDescriptionCompat != 1) {
            super.entryRemoved(obj, obj2, obj3);
            return;
        }
        UncheckedColordefault uncheckedColordefault = (UncheckedColordefault) obj2;
        ((String) obj).getClass();
        uncheckedColordefault.getClass();
        uncheckedColordefault.close();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(ConnectionWithLock connectionWithLock) {
        super(25);
        this.RatingCompat = connectionWithLock;
    }
}
