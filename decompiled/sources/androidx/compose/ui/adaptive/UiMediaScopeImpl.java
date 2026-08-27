package androidx.compose.ui.adaptive;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.input.InputManager;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.UiMediaScope;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.DpSize;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes.dex */
public final class UiMediaScopeImpl implements UiMediaScope {
    public static final int $stable = 0;
    private final PopulateViewStructure_androidKtpopulate7 _anyPointer$delegate;
    private final PopulateViewStructure_androidKtpopulate7 _windowInfo$delegate;
    private final PopulateViewStructure_androidKtpopulate7 hasPhysicalKeyboard$delegate;
    private final PopulateViewStructure_androidKtpopulate7 isImeVisible$delegate;
    private final PackageManager packageManager;
    private final PopulateViewStructure_androidKtpopulate7 _windowPosture$delegate = CompositionKt.RemoteActionCompatParcelizer(UiMediaScope.Posture.m189boximpl(UiMediaScope.Posture.Companion.m197getFlatm18o9QQ()));
    private final PopulateViewStructure_androidKtpopulate7 isDocked$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getPointerPrecision-fpxItnM */
    public String mo163getPointerPrecisionfpxItnM() {
        return m209get_anyPointerfpxItnM();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getWindowPosture-m18o9QQ */
    public String mo166getWindowPosturem18o9QQ() {
        return m210get_windowPosturem18o9QQ();
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasCamera() {
        return MediaQuery_androidKt.isCameraAvailable(this.packageManager);
    }

    @Override // androidx.compose.ui.UiMediaScope
    public boolean getHasMicrophone() {
        return MediaQuery_androidKt.isMicAvailable(this.packageManager);
    }

    public final boolean getHasPhysicalKeyboard() {
        return ((Boolean) this.hasPhysicalKeyboard$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getViewingDistance-tKro-MQ */
    public String mo164getViewingDistancetKroMQ() {
        if (MediaQuery_androidKt.isTvDevice(this.packageManager)) {
            return UiMediaScope.ViewingDistance.Companion.m206getFartKroMQ();
        }
        return (MediaQuery_androidKt.isAutomotiveDevice(this.packageManager) || isDocked()) ? UiMediaScope.ViewingDistance.Companion.m207getMediumtKroMQ() : UiMediaScope.ViewingDistance.Companion.m208getNeartKroMQ();
    }

    /* JADX INFO: renamed from: get_anyPointer-fpxItnM, reason: not valid java name */
    public final String m209get_anyPointerfpxItnM() {
        return ((UiMediaScope.PointerPrecision) this._anyPointer$delegate.getValue()).m184unboximpl();
    }

    public final WindowInfo get_windowInfo() {
        return (WindowInfo) this._windowInfo$delegate.getValue();
    }

    /* JADX INFO: renamed from: get_windowPosture-m18o9QQ, reason: not valid java name */
    public final String m210get_windowPosturem18o9QQ() {
        return ((UiMediaScope.Posture) this._windowPosture$delegate.getValue()).m195unboximpl();
    }

    public final boolean isDocked() {
        return ((Boolean) this.isDocked$delegate.getValue()).booleanValue();
    }

    public final boolean isImeVisible() {
        return ((Boolean) this.isImeVisible$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: set_anyPointer-ZYK4Wgo, reason: not valid java name */
    public final void m211set_anyPointerZYK4Wgo(String str) {
        this._anyPointer$delegate.setValue(UiMediaScope.PointerPrecision.m178boximpl(str));
    }

    public final void set_windowInfo(WindowInfo windowInfo) {
        this._windowInfo$delegate.setValue(windowInfo);
    }

    /* JADX INFO: renamed from: set_windowPosture-InyEWag, reason: not valid java name */
    public final void m212set_windowPostureInyEWag(String str) {
        this._windowPosture$delegate.setValue(UiMediaScope.Posture.m189boximpl(str));
    }

    public UiMediaScopeImpl(Context context, InputManager inputManager, WindowInfo windowInfo, boolean z) {
        this.packageManager = context.getPackageManager();
        this._windowInfo$delegate = CompositionKt.RemoteActionCompatParcelizer(windowInfo);
        this._anyPointer$delegate = CompositionKt.RemoteActionCompatParcelizer(UiMediaScope.PointerPrecision.m178boximpl(MediaQuery_androidKt.resolvePointerPrecision(inputManager)));
        this.isImeVisible$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.valueOf(z));
        this.hasPhysicalKeyboard$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.valueOf(MediaQuery_androidKt.hasPhysicalKeyboard(inputManager)));
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getWindowHeight-D9Ej5fM */
    public float mo165getWindowHeightD9Ej5fM() {
        return DpSize.m3769getHeightD9Ej5fM(get_windowInfo().mo2752getContainerDpSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getWindowWidth-D9Ej5fM */
    public float mo167getWindowWidthD9Ej5fM() {
        return DpSize.m3771getWidthD9Ej5fM(get_windowInfo().mo2752getContainerDpSizeMYxV2XQ());
    }

    @Override // androidx.compose.ui.UiMediaScope
    /* JADX INFO: renamed from: getKeyboardKind-J9_QTjY */
    public String mo162getKeyboardKindJ9_QTjY() {
        if (getHasPhysicalKeyboard()) {
            return UiMediaScope.KeyboardKind.Companion.m176getPhysicalJ9_QTjY();
        }
        return isImeVisible() ? UiMediaScope.KeyboardKind.Companion.m177getVirtualJ9_QTjY() : UiMediaScope.KeyboardKind.Companion.m175getNoneJ9_QTjY();
    }

    public final void setDocked(boolean z) {
        this.isDocked$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setHasPhysicalKeyboard(boolean z) {
        this.hasPhysicalKeyboard$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setImeVisible(boolean z) {
        this.isImeVisible$delegate.setValue(Boolean.valueOf(z));
    }
}
