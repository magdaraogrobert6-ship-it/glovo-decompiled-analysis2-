package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM toUsingEnterExitScope(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusPropertiesKt.toUsingEnterExitScope.1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
                FocusRequester focusRequester = (FocusRequester) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(FocusDirection.m346boximpl(focusEnterExitScope.mo345getRequestedFocusDirectiondhqQ8s()));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (focusRequester == companion.getCancel()) {
                    focusEnterExitScope.cancelFocusChange();
                } else if (focusRequester != companion.getDefault()) {
                    FocusRequester.m380requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    public static final Modifier focusProperties(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0(r8lambdaunavo3sxub_pc9xroryotnrlvsm)));
    }
}
