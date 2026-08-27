package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetViewp extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.material3.SnackbarHostState IconCompatParcelizer;
    public requestAutofillForNode RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public setCustomInAppMessageAnimationFactorylambda0 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetViewp(androidx.compose.material3.SnackbarHostState snackbarHostState, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.showSnackbar(null, this);
    }
}
