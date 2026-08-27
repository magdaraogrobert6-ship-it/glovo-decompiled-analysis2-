package androidx.compose.material3;

import androidx.compose.runtime.CompositionKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.getAutofillManager;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.requestAutofillForNode;

/* JADX INFO: loaded from: classes.dex */
public final class SnackbarHostState {
    public final MutexImpl write = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final PopulateViewStructure_androidKtpopulate7 read = CompositionKt.RemoteActionCompatParcelizer(null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.requestAutofillForNode] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.requestAutofillForNode] */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(o.requestAutofillForNode r8, o.ShortNewsContentCardView r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof o.accessgetViewp
            if (r0 == 0) goto L13
            r0 = r9
            o.accessgetViewp r0 = (o.accessgetViewp) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            o.accessgetViewp r0 = new o.accessgetViewp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            o.PopulateViewStructure_androidKtpopulate7 r3 = r7.read
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            o.setCustomInAppMessageAnimationFactorylambda0 r8 = r0.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)     // Catch: java.lang.Throwable -> L7e
            goto L75
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r6
        L35:
            o.setCustomInAppMessageAnimationFactorylambda0 r8 = r0.serializer
            o.requestAutofillForNode r2 = r0.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L51
        L3d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r0.RemoteActionCompatParcelizer = r8
            kotlinx.coroutines.sync.MutexImpl r9 = r7.write
            r0.serializer = r9
            r0.write = r5
            java.lang.Object r2 = r9.lock(r0)
            if (r2 != r1) goto L4f
            goto L74
        L4f:
            r2 = r8
            r8 = r9
        L51:
            r0.RemoteActionCompatParcelizer = r2     // Catch: java.lang.Throwable -> L7e
            r0.serializer = r8     // Catch: java.lang.Throwable -> L7e
            r0.write = r4     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.CancellableContinuationImpl r9 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L7e
            o.ShortNewsContentCardView r0 = io.grpc.LoadBalancer$Helper.intercepted(r0)     // Catch: java.lang.Throwable -> L7e
            r9.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7e
            r9.read()     // Catch: java.lang.Throwable -> L7e
            o.setRootAutofillId r0 = new o.setRootAutofillId     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r2, r9)     // Catch: java.lang.Throwable -> L7e
            r2 = r3
            o.onShowTranslationui r2 = (o.onShowTranslationui) r2     // Catch: java.lang.Throwable -> L7e
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.getResult()     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            o.onShowTranslationui r3 = (o.onShowTranslationui) r3     // Catch: java.lang.Throwable -> L85
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L85
            r8.write(r6)
            return r9
        L7e:
            r9 = move-exception
            o.onShowTranslationui r3 = (o.onShowTranslationui) r3     // Catch: java.lang.Throwable -> L85
            r3.setValue(r6)     // Catch: java.lang.Throwable -> L85
            throw r9     // Catch: java.lang.Throwable -> L85
        L85:
            r9 = move-exception
            r8.write(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(o.requestAutofillForNode, o.ShortNewsContentCardView):java.lang.Object");
    }

    public static Object RemoteActionCompatParcelizer(SnackbarHostState snackbarHostState, String str, String str2, getAutofillManager getautofillmanager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            if (str2 == null) {
                getautofillmanager = getAutofillManager.Short;
            } else {
                getautofillmanager = getAutofillManager.Indefinite;
            }
        }
        snackbarHostState.getClass();
        return snackbarHostState.showSnackbar(new requestAutofillForNode(str, str2, getautofillmanager), shortNewsContentCardView);
    }
}
