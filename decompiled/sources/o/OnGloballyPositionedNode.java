package o;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzpg;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OnGloballyPositionedNode implements onLayoutRectChanged, LookaheadLayoutCoordinatesKt {
    public final /* synthetic */ zzpg IconCompatParcelizer;

    public /* synthetic */ OnGloballyPositionedNode(zzpg zzpgVar) {
        this.IconCompatParcelizer = zzpgVar;
    }

    @Override // o.onLayoutRectChanged
    public void RemoteActionCompatParcelizer(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.IconCompatParcelizer;
        if (!zIsEmpty) {
            zzpgVar.PlaybackStateCompat().write((Runnable) new ImageVectorCacheImageVectorEntry(this, str, str2, bundle, 15));
            return;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (lookaheadScopeKtLookaheadScope221 != null) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(str2, "AppId not known when logging event");
        }
    }

    @Override // o.LookaheadLayoutCoordinatesKt
    public /* synthetic */ void IconCompatParcelizer(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.IconCompatParcelizer.write(str, i, th, bArr, map);
    }
}
