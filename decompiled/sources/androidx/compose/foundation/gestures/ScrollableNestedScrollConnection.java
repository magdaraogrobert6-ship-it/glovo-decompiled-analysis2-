package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKt;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    public boolean RemoteActionCompatParcelizer;
    public final ScrollingLogic read;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.read = scrollingLogic;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public final long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.RemoteActionCompatParcelizer) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        ScrollingLogic scrollingLogic = this.read;
        return scrollingLogic.ParcelableVolumeInfo.IconCompatParcelizer() ? Offset.Companion.m493getZeroF1C5BW0() : scrollingLogic.m59toOffsettuRUvjQ(scrollingLogic.RemoteActionCompatParcelizer(scrollingLogic.ParcelableVolumeInfo.write(scrollingLogic.RemoteActionCompatParcelizer(scrollingLogic.m58toFloatk4lQ0M(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public final Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        SimpleLayoutKt simpleLayoutKt;
        long jM3922getZero9UxMQ8M;
        long jM3922getZero9UxMQ8M2;
        if (shortNewsContentCardView instanceof SimpleLayoutKt) {
            simpleLayoutKt = (SimpleLayoutKt) shortNewsContentCardView;
            int i = simpleLayoutKt.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                simpleLayoutKt.write = i - Integer.MIN_VALUE;
            } else {
                simpleLayoutKt = new SimpleLayoutKt(this, shortNewsContentCardView);
            }
        } else {
            simpleLayoutKt = new SimpleLayoutKt(this, shortNewsContentCardView);
        }
        Object objM56doFlingAnimationQWom1Mo = simpleLayoutKt.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = simpleLayoutKt.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objM56doFlingAnimationQWom1Mo);
            if (this.RemoteActionCompatParcelizer) {
                ScrollingLogic scrollingLogic = this.read;
                if (scrollingLogic.RemoteActionCompatParcelizer) {
                    jM3922getZero9UxMQ8M2 = Velocity.Companion.m3922getZero9UxMQ8M();
                } else {
                    simpleLayoutKt.IconCompatParcelizer = j2;
                    simpleLayoutKt.write = 1;
                    objM56doFlingAnimationQWom1Mo = scrollingLogic.m56doFlingAnimationQWom1Mo(j2, simpleLayoutKt);
                    if (objM56doFlingAnimationQWom1Mo == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                jM3922getZero9UxMQ8M = Velocity.m3914minusAH228Gc(j2, jM3922getZero9UxMQ8M2);
            } else {
                jM3922getZero9UxMQ8M = Velocity.Companion.m3922getZero9UxMQ8M();
            }
            return Velocity.m3902boximpl(jM3922getZero9UxMQ8M);
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = simpleLayoutKt.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objM56doFlingAnimationQWom1Mo);
        jM3922getZero9UxMQ8M2 = ((Velocity) objM56doFlingAnimationQWom1Mo).m3920unboximpl();
        jM3922getZero9UxMQ8M = Velocity.m3914minusAH228Gc(j2, jM3922getZero9UxMQ8M2);
        return Velocity.m3902boximpl(jM3922getZero9UxMQ8M);
    }
}
