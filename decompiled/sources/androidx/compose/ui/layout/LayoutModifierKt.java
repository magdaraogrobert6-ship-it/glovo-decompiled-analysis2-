package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutModifierKt {
    public static final Modifier layout(Modifier modifier, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        return modifier.then(new LayoutElement(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry));
    }
}
