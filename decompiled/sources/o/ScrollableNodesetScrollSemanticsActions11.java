package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableNodesetScrollSemanticsActions11 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ TapGestureDetectorKt write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollableNodesetScrollSemanticsActions11(ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, int i) {
        super(1);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.write = tapGestureDetectorKt;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        float f;
        int i = this.serializer;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1 = this.RemoteActionCompatParcelizer;
        TapGestureDetectorKt tapGestureDetectorKt = this.write;
        if (i == 0) {
            paddingqDBjuR0default paddingqdbjur0default = (paddingqDBjuR0default) obj;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.PreEnter;
            accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i2 = accesssemanticsScrollByd4ec7I.Visible;
            if (paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i, accesssemanticsscrollbyd4ec7i2)) {
                waitForUpOrCancellation waitforuporcancellation = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read;
                return waitforuporcancellation != null ? waitforuporcancellation.serializer : onKeyEventZmokQxo.IconCompatParcelizer;
            }
            if (!paddingqdbjur0default.RemoteActionCompatParcelizer(accesssemanticsscrollbyd4ec7i2, accesssemanticsScrollByd4ec7I.PostExit)) {
                return onKeyEventZmokQxo.IconCompatParcelizer;
            }
            waitForUpOrCancellation waitforuporcancellation2 = tapGestureDetectorKt.serializer.read;
            return waitforuporcancellation2 != null ? waitforuporcancellation2.serializer : onKeyEventZmokQxo.IconCompatParcelizer;
        }
        if (i == 1) {
            androidx.compose.ui.platform.InspectorInfo inspectorInfo = (androidx.compose.ui.platform.InspectorInfo) obj;
            inspectorInfo.setName("animateEnterExit");
            inspectorInfo.getProperties().set("enter", scrollingLogicdoFlingAnimation2reverseScope1);
            inspectorInfo.getProperties().set("exit", tapGestureDetectorKt);
            inspectorInfo.getProperties().set("label", "animateEnterExit");
            return createFromParcel.INSTANCE;
        }
        int i2 = ScrollableNodeonKeyEvent1.write[((accesssemanticsScrollByd4ec7I) obj).ordinal()];
        if (i2 == 1) {
            f = 1.0f;
        } else if (i2 == 2) {
            waitForUpOrCancellation waitforuporcancellation3 = scrollingLogicdoFlingAnimation2reverseScope1.serializer.read;
            if (waitforuporcancellation3 != null) {
                f = waitforuporcancellation3.write;
            } else {
                f = 1.0f;
            }
        } else {
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            waitForUpOrCancellation waitforuporcancellation4 = tapGestureDetectorKt.serializer.read;
            if (waitforuporcancellation4 != null) {
                f = waitforuporcancellation4.write;
            } else {
                f = 1.0f;
            }
        }
        return Float.valueOf(f);
    }
}
