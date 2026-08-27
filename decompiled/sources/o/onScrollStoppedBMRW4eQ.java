package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class onScrollStoppedBMRW4eQ extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onScrollStoppedBMRW4eQ(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(1);
        this.write = z;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        ((androidx.compose.ui.graphics.GraphicsLayerScope) obj).setClip(!this.write && ((Boolean) this.IconCompatParcelizer.invoke()).booleanValue());
        return createFromParcel.INSTANCE;
    }
}
