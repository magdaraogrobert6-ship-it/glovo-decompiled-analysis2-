package o;

import coil3.network.NetworkHeaders$Builder;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RemoteActionCompatParcelizer implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int serializer;

    public /* synthetic */ RemoteActionCompatParcelizer(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        switch (this.serializer) {
            case 0:
                return new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(DefaultLifecycleObserver.IconCompatParcelizer);
            case 1:
                return new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(write.IconCompatParcelizer);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                getPhoneNumber getphonenumber = addOnTrimMemoryListener.serializer;
                return null;
            case 4:
                getPhoneNumber getphonenumber2 = addOnUserLeaveHintListener.serializer;
                return null;
            case 5:
                getPhoneNumber getphonenumber3 = PagerMeasureResult.RemoteActionCompatParcelizer;
                return onMeasured.read;
            case 6:
                return new PagerStatescrollToPage2();
            case 7:
                float f = androidx.compose.foundation.gestures.DragGestureDetectorKt.serializer;
                return createFromParcel.INSTANCE;
            case 8:
                float f2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.serializer;
                return Boolean.TRUE;
            case 9:
                return new androidx.compose.foundation.lazy.LazyListState(0, 0);
            case 10:
                return new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.ColorKt.Color(1308617531), defaultConstructorMarker);
            case 11:
                return androidx.compose.ui.unit.IntOffset.m3792boximpl(androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac());
            case 12:
                return androidx.compose.ui.unit.IntOffset.m3792boximpl(androidx.compose.ui.unit.IntOffset.Companion.m3812getZeronOccac());
            case 13:
                getPhoneNumber getphonenumber4 = unboximpl.write;
                return null;
            case 14:
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return DefaultIoScheduler.RemoteActionCompatParcelizer;
            case 15:
                return MediaQueryKtderivedMediaQuery11.IconCompatParcelizer;
            case 16:
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getZIndex.IconCompatParcelizer;
                return Boolean.FALSE;
            case 17:
                return isTvDevice.serializer;
            case 18:
                return UUID.randomUUID();
            case 19:
                return new get_windowPosturem18o9QQ();
            case 20:
                return new getOnFill(new androidx.compose.animation.core.Animatable(Float.valueOf(0.0f), requiredWidth3ABfNKs.read, defaultConstructorMarker, 12));
            case 21:
                return new BlockDropShadowNode(new LinkedHashMap());
            case 22:
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = BuildDrawCacheParams.RemoteActionCompatParcelizer;
                return null;
            case 23:
                return createFromParcel.INSTANCE;
            case 24:
                return createFromParcel.INSTANCE;
            case 25:
                return createFromParcel.INSTANCE;
            case 26:
                return Long.valueOf(androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock._init_$lambda$0());
            case 27:
                getPhoneNumber getphonenumber5 = setStrokeJoinWw9F2mQ.serializer;
                return null;
            case 28:
                return new ActualImageBitmapx__hDU();
            default:
                NetworkHeaders$Builder networkHeaders$Builder = new NetworkHeaders$Builder(2);
                networkHeaders$Builder.RemoteActionCompatParcelizer(displayInAppMessagelambda1.serializer(isSupported0vamqd0.class), new accessgetBlendMode0nO6VwUjd(25));
                return networkHeaders$Builder.write();
        }
    }
}
