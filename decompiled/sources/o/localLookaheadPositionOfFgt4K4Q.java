package o;

import com.google.android.gms.measurement.internal.zzpg;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class localLookaheadPositionOfFgt4K4Q implements getMeasurePolicy {
    public final LookaheadScopeKtLookaheadScope221 RemoteActionCompatParcelizer;

    public localLookaheadPositionOfFgt4K4Q(zzpg zzpgVar) {
        this.RemoteActionCompatParcelizer = zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public boolean serializer() {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = this.RemoteActionCompatParcelizer;
        try {
            getFocusEK5gGoQ getfocusek5ggoqSerializer = accessgetTvMediaContextMenucp.serializer(lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat);
            if (getfocusek5ggoqSerializer != null) {
                return getfocusek5ggoqSerializer.read(androidx.compose.ui.graphics.Fields.SpotShadowColor, "com.android.vending").versionCode >= 80837300;
            }
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.PlaybackStateCompat.serializer(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public /* synthetic */ localLookaheadPositionOfFgt4K4Q(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        this.RemoteActionCompatParcelizer = lookaheadScopeKtLookaheadScope221;
    }

    @Override // o.getMeasurePolicy, o.LookaheadLayoutCoordinatesKt
    public /* synthetic */ void IconCompatParcelizer(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, th, bArr);
    }
}
