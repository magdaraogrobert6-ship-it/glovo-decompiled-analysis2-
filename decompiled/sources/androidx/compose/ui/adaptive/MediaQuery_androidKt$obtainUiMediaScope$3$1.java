package androidx.compose.ui.adaptive;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Lambda;
import o.FocusPropertiesNode;
import o.findFocusTargetui;
import o.getPersonMiddleInitial;
import o.getPersonNamePrefix;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class MediaQuery_androidKt$obtainUiMediaScope$3$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ UiMediaScopeImpl $scope;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$3$1(View view, UiMediaScopeImpl uiMediaScopeImpl) {
        super(1);
        this.$view = view;
        this.$scope = uiMediaScopeImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(UiMediaScopeImpl uiMediaScopeImpl, View view) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        uiMediaScopeImpl.setImeVisible(MediaQuery_androidKt.isImeVisible(findFocusTargetui.read(view)));
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
        final UiMediaScopeImpl uiMediaScopeImpl = this.$scope;
        final View view = this.$view;
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$3$1$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MediaQuery_androidKt$obtainUiMediaScope$3$1.invoke$lambda$0(uiMediaScopeImpl, view);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        final View view2 = this.$view;
        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$3$1$invoke$$inlined$onDispose$1
            @Override // o.getPersonMiddleInitial
            public void dispose() {
                view2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        };
    }
}
