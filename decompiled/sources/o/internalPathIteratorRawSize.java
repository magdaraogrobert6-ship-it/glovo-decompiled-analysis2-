package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.home.nest.NestLoadingServiceImpl;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.ranges.RangesKt;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class internalPathIteratorRawSize implements getColorIntegerOrNulllambda0 {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int read;

    public internalPathIteratorRawSize(getActionViewIntentlambda0 getactionviewintentlambda0) {
        this.read = 1;
    }

    public /* synthetic */ internalPathIteratorRawSize(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = 9;
        int i3 = 10;
        switch (this.read) {
            case 0:
                return new AndroidUiFrameClock();
            case 1:
                return new q5(displayInAppMessagelambda1.serializer(getWeightGVVA2EU.class), displayInAppMessagelambda1.serializer(grade.class));
            case 2:
                return new setInitialStateToCurrentAnimationValue(new AndroidUiFrameClock());
            case 3:
                return new AndroidUiDispatcherCompanioncurrentThread1(9);
            case 4:
                return new RouterLogger(new getTransactionExecutor(), new isMainThread(i2));
            case 5:
                return new Path$Companion();
            case 6:
                return new RouterLogger(new ImageHeaderParserImageType(), new accessisMainThread());
            case 7:
                return new AndroidUiFrameClock();
            case 8:
                return new ProtobufEncoder(new getTransactionExecutor(), new AndroidUiDispatcherCompanioncurrentThread1(10), new getActionViewIntentlambda0());
            case 9:
                return new isMainThread(i3, new io.sentry.util.MediaBrowserCompatMediaItem(i3));
            case 10:
                io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new io.sentry.util.MediaBrowserCompatMediaItem(11);
                int i4 = serializer + 91;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return mediaBrowserCompatMediaItem;
                }
                throw null;
            case 11:
                return new getEmannotations();
            case 12:
                return new accessisMainThread();
            case 13:
                new AndroidUiDispatcherCompanioncurrentThread1(8);
                return new remadjELrA();
            case 14:
                return new com.huawei.wisesecurity.ucs_credential.p0();
            case 15:
                return RangesKt.write(setInsetOffsetX.RemoteActionCompatParcelizer);
            case 16:
                return new AndroidUiDispatcherCompanioncurrentThread1(12);
            case 17:
                return new io.sentry.util.MediaBrowserCompatMediaItem(13);
            case 18:
                return new getEnterTransitionCallback();
            case 19:
                return new getFocusedView();
            case 20:
                return new getExitAnim((AndroidUiDispatcherCompanioncurrentThread1) findFragmentByWho.serializer.write());
            case 21:
                return new NestLoadingServiceImpl();
            case 22:
                return new com.huawei.wisesecurity.ucs_credential.g0();
            case 23:
                com.huawei.wisesecurity.ucs_credential.n0 n0Var = new com.huawei.wisesecurity.ucs_credential.n0();
                int i5 = write + 21;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return n0Var;
                }
                throw null;
            case 24:
                return new com.huawei.wisesecurity.ucs_credential.p0();
            case 25:
                IsFixableByRetry isFixableByRetry = new IsFixableByRetry(26);
                int i6 = write + 57;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 63 / 0;
                }
                return isFixableByRetry;
            case 26:
                return new com.huawei.wisesecurity.ucs_credential.n0();
            case 27:
                return new com.huawei.wisesecurity.ucs_credential.p0();
            case 28:
                return new IsFixableByRetry(27);
            default:
                return new io.sentry.util.MediaBrowserCompatMediaItem(14);
        }
    }
}
