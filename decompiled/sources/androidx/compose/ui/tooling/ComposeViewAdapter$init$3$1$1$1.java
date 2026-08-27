package androidx.compose.ui.tooling;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ComposeViewAdapter$init$3$1$1$1 extends FunctionReferenceImpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3581invoke() {
        ((ComposeViewAdapter) this.MediaMetadataCompat).requestLayout();
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3581invoke();
        return createFromParcel.INSTANCE;
    }

    public ComposeViewAdapter$init$3$1$1$1(Object obj) {
        super(0, 0, ComposeViewAdapter.class, obj, "requestLayout", "requestLayout()V");
    }
}
