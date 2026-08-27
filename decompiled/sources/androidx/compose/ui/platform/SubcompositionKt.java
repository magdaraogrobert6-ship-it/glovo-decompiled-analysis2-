package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import o.clearTranslatedText;
import o.fastForEachIndexedWithFilter;
import o.getBirthDateYear;
import o.getCreditCardSecurityCode;
import o.updateTranslationOnAppeared;

/* JADX INFO: loaded from: classes.dex */
public final class SubcompositionKt {
    public static final clearTranslatedText createPausableSubcomposition(LayoutNode layoutNode, getBirthDateYear getbirthdateyear) {
        return fastForEachIndexedWithFilter.write(Wrapper_androidKt.createApplier(layoutNode), getbirthdateyear);
    }

    public static final updateTranslationOnAppeared createSubcomposition(LayoutNode layoutNode, getBirthDateYear getbirthdateyear) {
        return new getCreditCardSecurityCode(getbirthdateyear, Wrapper_androidKt.createApplier(layoutNode));
    }
}
