package o;

import android.os.Build;
import com.sentiance.sdk.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
final class getBigImageUrl extends getLatitudeannotations<addBannerViewMonitor> {
    final /* synthetic */ getBigSummaryText write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBigImageUrl(getBigSummaryText getbigsummarytext, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "ANRTracker");
        this.write = getbigsummarytext;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<addBannerViewMonitor> getlongitudeannotations) {
        if (Build.VERSION.SDK_INT >= 30) {
            long jWrite = getlongitudeannotations.write();
            getBigSummaryText getbigsummarytext = this.write;
            Optional optional = getbigsummarytext.read.read(addBannerViewMonitor.class, Long.valueOf(jWrite));
            if (optional.IconCompatParcelizer()) {
                getbigsummarytext.RemoteActionCompatParcelizer(jWrite, ((getCooldownEnterSeconds.read) optional.write()).serializer());
            }
        }
    }
}
