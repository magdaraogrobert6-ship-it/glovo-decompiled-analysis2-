package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU extends AndroidCanvas_androidKt {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU(Bundle bundle, getTransparent0d7_KjU gettransparent0d7_kju, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(gettransparent0d7_kju, bundle);
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.AndroidCanvas_androidKt
    public final androidx.lifecycle.ViewModel IconCompatParcelizer(String str, Class cls, getBitmapui_graphics getbitmapui_graphics) {
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(getbitmapui_graphics);
        objInvoke.getClass();
        return (androidx.lifecycle.ViewModel) objInvoke;
    }
}
