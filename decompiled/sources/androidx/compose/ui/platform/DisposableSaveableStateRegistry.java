package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import o.BlockDropShadowElement;
import o.alpha;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements alpha {
    public static final int $stable = 8;
    private final /* synthetic */ alpha $$delegate_0;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onDispose;

    @Override // o.alpha
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // o.alpha
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    public final void dispose() {
        this.onDispose.invoke();
    }

    @Override // o.alpha
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // o.alpha
    public BlockDropShadowElement registerProvider(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return this.$$delegate_0.registerProvider(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public DisposableSaveableStateRegistry(alpha alphaVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.$$delegate_0 = alphaVar;
        this.onDispose = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
