package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusOrderModifierKt {
    @onItemDismisslambda0
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.2
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }

    @onItemDismisslambda0
    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @onItemDismisslambda0
    public static final Modifier focusOrder(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        final FocusOrderToProperties focusOrderToProperties = new FocusOrderToProperties(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return FocusPropertiesKt.focusProperties(modifier, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusOrderModifierKt.focusOrder.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusProperties) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(FocusProperties focusProperties) {
                focusOrderToProperties.apply(focusProperties);
            }
        });
    }
}
