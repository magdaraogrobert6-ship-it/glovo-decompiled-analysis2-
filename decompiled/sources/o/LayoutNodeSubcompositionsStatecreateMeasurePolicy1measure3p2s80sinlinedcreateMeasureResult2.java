package o;

import android.os.Bundle;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 {
    public final String IconCompatParcelizer;
    public final zzbe MediaDescriptionCompat;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final long write;

    public final LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 RemoteActionCompatParcelizer(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221, long j) {
        return new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2(lookaheadScopeKtLookaheadScope221, this.read, this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer, j, this.MediaDescriptionCompat);
    }

    public final String toString() {
        String string = this.MediaDescriptionCompat.toString();
        String str = this.IconCompatParcelizer;
        int length = String.valueOf(str).length();
        String str2 = this.serializer;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        c8$$ExternalSyntheticOutline0.m(sb, "Event{appId='", str, "', name='", str2);
        return d$$ExternalSyntheticOutline0.m(sb, "', params=", string, "}");
    }

    public LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.read = true == TextUtils.isEmpty(str) ? null : str;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        if (j2 != 0 && j2 > j) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("Param name can't be null");
                    it.remove();
                } else {
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    Object obj = onlayoutrectchangeddefault.read(bundle2.get(next), next);
                    if (obj == null) {
                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.MediaSessionCompatQueueItem.serializer(lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.IconCompatParcelizer(next), "Param value can't be null");
                        it.remove();
                    } else {
                        onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                        onlayoutrectchangeddefault2.write(next, bundle2, obj);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.MediaDescriptionCompat = zzbeVar;
    }

    public LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbeVar);
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
        this.read = true == TextUtils.isEmpty(str) ? null : str;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        if (j2 != 0 && j2 > j) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Event created with reverse previous/current timestamps. appId, name", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), getLookaheadDelegate.RemoteActionCompatParcelizer(str3));
        }
        this.MediaDescriptionCompat = zzbeVar;
    }
}
