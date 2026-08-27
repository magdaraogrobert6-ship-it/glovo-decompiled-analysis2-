package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class EnterExitTransitionKt$slideOutHorizontally$2 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnterExitTransitionKt$slideOutHorizontally$2(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        super(1);
        this.serializer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.write;
        if (i == 0) {
            return IntOffset.m3792boximpl(IntOffset.m3795constructorimpl(((long) ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Integer.valueOf((int) (((IntSize) obj).m3848unboximpl() >> 32)))).intValue()) << 32));
        }
        InspectorInfo inspectorInfo = (InspectorInfo) obj;
        inspectorInfo.setName("onConsumedWindowInsetsChanged");
        inspectorInfo.getProperties().set("block", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return createFromParcel.INSTANCE;
    }
}
