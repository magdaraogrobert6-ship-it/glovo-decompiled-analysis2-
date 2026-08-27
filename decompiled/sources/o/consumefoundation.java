package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class consumefoundation extends Lambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ androidx.compose.animation.AnimatedVisibilityScope RemoteActionCompatParcelizer;
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 serializer;
    public final /* synthetic */ TapGestureDetectorKt write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public consumefoundation(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt) {
        super(3);
        this.RemoteActionCompatParcelizer = animatedVisibilityScope;
        this.serializer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.write = tapGestureDetectorKt;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        getPostalCode getpostalcode = (getPostalCode) ((getBirthDateFull) obj2);
        getpostalcode.serializer(1840112047);
        androidx.compose.ui.Modifier modifierThen = ((androidx.compose.ui.Modifier) obj).then(onKeyEventZmokQxo.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.serializer(), this.serializer, this.write, "animateEnterExit", getpostalcode, 0, 12));
        getpostalcode.IconCompatParcelizer(false);
        return modifierThen;
    }
}
