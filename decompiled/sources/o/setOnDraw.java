package o;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class setOnDraw extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ DrawBackgroundModifier IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setOnDraw(DrawBackgroundModifier drawBackgroundModifier, int i) {
        super(1);
        this.read = i;
        this.IconCompatParcelizer = drawBackgroundModifier;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DrawBackgroundModifier drawBackgroundModifier = this.IconCompatParcelizer;
        if (i != 0) {
            drawBackgroundModifier.write = true;
            return createfromparcel;
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj;
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            Handler handler = drawBackgroundModifier.IconCompatParcelizer;
            if (handler == null) {
                Handler handler2 = new Handler(Looper.getMainLooper());
                drawBackgroundModifier.IconCompatParcelizer = handler2;
                handler = handler2;
            }
            handler.post(new Q(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
        }
        return createfromparcel;
    }
}
