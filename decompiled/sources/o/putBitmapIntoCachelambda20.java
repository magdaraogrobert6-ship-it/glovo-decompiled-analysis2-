package o;

import com.sentiance.sdk.Sentiance;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class putBitmapIntoCachelambda20 implements r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk {
    public final /* synthetic */ Sentiance IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ putBitmapIntoCachelambda20(Sentiance sentiance, Object obj, int i) {
        this.write = i;
        this.IconCompatParcelizer = sentiance;
        this.read = obj;
    }

    @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
    public final Object IconCompatParcelizer() {
        int i = this.write;
        Object obj = this.read;
        Sentiance sentiance = this.IconCompatParcelizer;
        return i != 0 ? sentiance.lambda$submitDetections$16((BrazeNotificationUtilsExternalSyntheticLambda14) obj) : sentiance.lambda$addTripMetadata$32((Map) obj);
    }
}
