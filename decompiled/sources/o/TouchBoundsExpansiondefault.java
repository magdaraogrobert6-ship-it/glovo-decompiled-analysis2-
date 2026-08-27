package o;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TouchBoundsExpansiondefault implements Consumer, Predicate {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ TouchBoundsExpansionKt serializer;

    public /* synthetic */ TouchBoundsExpansiondefault(TouchBoundsExpansionKt touchBoundsExpansionKt, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = touchBoundsExpansionKt;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        TouchBoundsExpansionKt touchBoundsExpansionKt = this.serializer;
        touchBoundsExpansionKt.getClass();
        long expirationEpochTimestampMillis = ((FetchEligibleCampaignsResponse) obj).getExpirationEpochTimestampMillis();
        touchBoundsExpansionKt.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file = new File(touchBoundsExpansionKt.IconCompatParcelizer.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (expirationEpochTimestampMillis != 0) {
            return jCurrentTimeMillis < expirationEpochTimestampMillis;
        }
        return !file.exists() || jCurrentTimeMillis < file.lastModified() + CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        if (this.RemoteActionCompatParcelizer != 0) {
            this.serializer.write = null;
        } else {
            this.serializer.write = (FetchEligibleCampaignsResponse) obj;
        }
    }
}
