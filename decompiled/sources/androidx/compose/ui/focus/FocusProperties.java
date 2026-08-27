package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface FocusProperties {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final Rect getUnsetFocusRect() {
            return UnsetFocusRect;
        }
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    default r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getEnter() {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return m378invoke3ESFkO8(((FocusDirection) obj).m352unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m378invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    default r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getExit() {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return m379invoke3ESFkO8(((FocusDirection) obj).m352unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m379invoke3ESFkO8(int i) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    default r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnEnter() {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusProperties$onEnter$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    default r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnExit() {
        return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.focus.FocusProperties$onExit$1
            public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusEnterExitScope) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    void setCanFocus(boolean z);

    default void setDown(FocusRequester focusRequester) {
    }

    default void setEnd(FocusRequester focusRequester) {
    }

    default void setFocusRect(Rect rect) {
    }

    default void setLeft(FocusRequester focusRequester) {
    }

    default void setNext(FocusRequester focusRequester) {
    }

    default void setOnEnter(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
    }

    default void setOnExit(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
    }

    default void setPrevious(FocusRequester focusRequester) {
    }

    default void setRight(FocusRequester focusRequester) {
    }

    default void setStart(FocusRequester focusRequester) {
    }

    default void setUp(FocusRequester focusRequester) {
    }

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    default Rect getFocusRect() {
        return Companion.getUnsetFocusRect();
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    @onItemDismisslambda0
    default void setEnter(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        setOnEnter(FocusPropertiesKt.toUsingEnterExitScope(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    @onItemDismisslambda0
    default void setExit(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        setOnExit(FocusPropertiesKt.toUsingEnterExitScope(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
