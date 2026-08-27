package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class makeFlag implements decryptAndGetPasswordBWLJW6A {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final SignInDataStore write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 9;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public makeFlag(SignInDataStore signInDataStore, ContextScope contextScope) {
        signInDataStore.getClass();
        this.write = signInDataStore;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(EditTextPreference.write);
        this.serializer = mutableStateFlow2;
        this.read = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 11), 3);
    }
}
