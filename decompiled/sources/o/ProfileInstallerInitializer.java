package o;

import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.home.nest.divider.ObserveDivider;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileInstallerInitializer implements decryptAndGetPasswordBWLJW6A {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final ObserveDivider read;
    public final MutableStateFlow serializer;
    public final StateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write;
        }
        int i3 = 84 / 0;
        return this.write;
    }

    public ProfileInstallerInitializer(ObserveDivider observeDivider, ContextScope contextScope) {
        observeDivider.getClass();
        this.read = observeDivider;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.write = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 0), 3);
    }
}
