package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;
import androidx.compose.ui.unit.Dp;
import o.UiMediaScopeViewingDistance;

/* JADX INFO: loaded from: classes.dex */
public abstract class AccessibilityUtilKt {
    public static final float IconCompatParcelizer;
    public static final Modifier read;
    public static final Modifier serializer;
    public static final float write;

    static {
        float fM3673constructorimpl = Dp.m3673constructorimpl(10.0f);
        write = fM3673constructorimpl;
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(10.0f);
        IconCompatParcelizer = fM3673constructorimpl2;
        Modifier.Companion companion = Modifier.Companion;
        read = PaddingKt.m73paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(companion, new ComposeViewAdapter$$ExternalSyntheticLambda2(3)), true, new UiMediaScopeViewingDistance(16)), fM3673constructorimpl, 0.0f, 2);
        serializer = PaddingKt.m73paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(companion, new ComposeViewAdapter$$ExternalSyntheticLambda2(4)), true, new UiMediaScopeViewingDistance(16)), 0.0f, fM3673constructorimpl2, 1);
    }
}
