package o;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRectZAM2FJodefault extends isEllipse implements focusModifier, moveFocus3ESFkO8, toFocusDirection, toFocusDirectionZmokQxo, asFrameworkPaint, fullyDrawnReporter_delegatelambda0, onMultiWindowModeChanged, getTransparent0d7_KjU, getCenteruvyYCjkannotations, setOnExit {
    public final /* synthetic */ androidx.fragment.app.FragmentActivity write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundRectZAM2FJodefault(androidx.fragment.app.FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.write = fragmentActivity;
    }

    @Override // o.getSafeInnerRect
    public final View IconCompatParcelizer(int i) {
        return this.write.findViewById(i);
    }

    @Override // o.setOnExit
    public final void addMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        this.write.addMenuProvider(getunsetfocusrect);
    }

    @Override // o.focusModifier
    public final void addOnConfigurationChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.addOnConfigurationChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirection
    public final void addOnMultiWindowModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.addOnMultiWindowModeChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirectionZmokQxo
    public final void addOnPictureInPictureModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.addOnPictureInPictureModeChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.moveFocus3ESFkO8
    public final void addOnTrimMemoryListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.addOnTrimMemoryListener(focusOwnerImplmodifier1);
    }

    @Override // o.onMultiWindowModeChanged
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
        return this.write.getActivityResultRegistry();
    }

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return this.write.serializer;
    }

    @Override // o.fullyDrawnReporter_delegatelambda0
    public final defaultViewModelProviderFactory_delegatelambda0 getOnBackPressedDispatcher() {
        return this.write.getOnBackPressedDispatcher();
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        return this.write.getSavedStateRegistry();
    }

    @Override // o.asFrameworkPaint
    public final getFilterQualityfv9h1I getViewModelStore() {
        return this.write.getViewModelStore();
    }

    @Override // o.getCenteruvyYCjkannotations
    public final void read(div7Ah8Wj8 div7ah8wj8, androidx.fragment.app.Fragment fragment) {
        this.write.onAttachFragment(fragment);
    }

    @Override // o.setOnExit
    public final void removeMenuProvider(getUnsetFocusRect getunsetfocusrect) {
        this.write.removeMenuProvider(getunsetfocusrect);
    }

    @Override // o.focusModifier
    public final void removeOnConfigurationChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.removeOnConfigurationChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirection
    public final void removeOnMultiWindowModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.removeOnMultiWindowModeChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.toFocusDirectionZmokQxo
    public final void removeOnPictureInPictureModeChangedListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.removeOnPictureInPictureModeChangedListener(focusOwnerImplmodifier1);
    }

    @Override // o.moveFocus3ESFkO8
    public final void removeOnTrimMemoryListener(FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        this.write.removeOnTrimMemoryListener(focusOwnerImplmodifier1);
    }

    @Override // o.getSafeInnerRect
    public final boolean write() {
        Window window = this.write.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
