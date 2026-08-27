package o;

import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.logger.logger.firebase.FirebasePerformanceUserAttributes;
import com.roadrunner.map.container.enabled.usecases.recenter.RecenterMapTriggerImpl;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import dagger.Lazy;
import java.time.Clock;
import kotlin.ranges.RangesKt;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class setPresentationView implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ setPresentationView(int i) {
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ setPresentationView(int i, Object obj) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = 18;
        switch (this.IconCompatParcelizer) {
            case 0:
                return new WebViewBuilderException(new accessisMainThread());
            case 1:
                getBindingAdapterPosition getbindingadapterposition = getBindingAdapterPosition.read;
                int i3 = read + 63;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return getbindingadapterposition;
            case 2:
                return RangesKt.write(hasAnyOfTheFlags.serializer);
            case 3:
                return new accessisMainThread();
            case 4:
                return new AndroidUiFrameClock();
            case 5:
                return new inCompatibilityMode();
            case 6:
                Clock clockSystemDefaultZone = Clock.systemDefaultZone();
                clockSystemDefaultZone.getClass();
                int i5 = read + 105;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return clockSystemDefaultZone;
            case 7:
                Clock clockSystemUTC = Clock.systemUTC();
                clockSystemUTC.getClass();
                return clockSystemUTC;
            case 8:
                return new onUpgrade();
            case 9:
                return new IsFixableByRetry(29);
            case 10:
                return new removeRearDisplayPresentationStatusListener();
            case 11:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) transactiondefault.serializer);
                lazySerializer.getClass();
                return new FirebasePerformanceUserAttributes(lazySerializer);
            case 12:
                return new BrazeExternalSyntheticLambda5(1);
            case 13:
                return new isMainThread(16);
            case 14:
                return new SaveHeatmapUrlImpl(new accessisMainThread());
            case 15:
                return new E();
            case 16:
                return new RecenterMapTriggerImpl();
            case 17:
                return new Path$Companion();
            case 18:
                new isMainThread(17);
                new io.sentry.util.MediaBrowserCompatMediaItem(i2);
                return new k2();
            case 19:
                ld ldVar = new ld();
                ldVar.read = new getNormalusljTpc("", "");
                ldVar.RemoteActionCompatParcelizer = "";
                return ldVar;
            case 20:
                new isMainThread(i2);
                new AndroidUiDispatcherCompanioncurrentThread1(i2);
                return new getActionViewIntentlambda0();
            case 21:
                new io.sentry.util.MediaBrowserCompatMediaItem(19);
                new isMainThread(i2);
                return new IsRiderInsideAreaUseCaseImpl();
            case 22:
                return new r1(new MapApiError());
            case 23:
                return new vg();
            case 24:
                return new AndroidUiFrameClock();
            case 25:
                return RangesKt.write(v6.RemoteActionCompatParcelizer);
            case 26:
                return RangesKt.write(v8.write);
            case 27:
                return RangesKt.write(vc.write);
            case 28:
                return RangesKt.write(v3.IconCompatParcelizer);
            default:
                return new accessisMainThread();
        }
    }
}
