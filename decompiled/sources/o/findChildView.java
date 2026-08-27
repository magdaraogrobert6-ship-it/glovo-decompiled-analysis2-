package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class findChildView implements decryptAndGetPasswordBWLJW6A {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final SignInDataStore serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow stateFlow = this.read;
        int i4 = i3 + 13;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public findChildView(SignInDataStore signInDataStore, ContextScope contextScope) {
        signInDataStore.getClass();
        this.serializer = signInDataStore;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.read = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(DropDownPreference.serializer);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.write = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 10), 3);
    }
}
