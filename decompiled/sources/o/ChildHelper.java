package o;

import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class ChildHelper implements decryptAndGetPasswordBWLJW6A {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final StateFlow IconCompatParcelizer;
    public final ProfileInstallerInitializerExternalSyntheticLambda1 RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.read;
        int i5 = i3 + 123;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public ChildHelper(ProfileInstallerInitializerExternalSyntheticLambda1 profileInstallerInitializerExternalSyntheticLambda1, ContextScope contextScope) {
        profileInstallerInitializerExternalSyntheticLambda1.getClass();
        this.RemoteActionCompatParcelizer = profileInstallerInitializerExternalSyntheticLambda1;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(invokeSuspendcomroadrunnerdeliverypickupdropoffbluetoothscanningBleScanningLifecycleObserverImplscan2.serializer);
        this.serializer = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 8), 3);
    }
}
