package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnterExitTransitionKt$slideInVertically$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        super(1);
        this.read = i;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.IconCompatParcelizer;
        return i != 0 ? IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf((int) (((IntSize) obj).m3848unboximpl() & 4294967295L)))).intValue()) & 4294967295L)) : IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf((int) (((IntSize) obj).m3848unboximpl() & 4294967295L)))).intValue()) & 4294967295L));
    }
}
