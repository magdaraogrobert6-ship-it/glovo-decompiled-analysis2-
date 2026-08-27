package o;

import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearLayoutManager implements decryptAndGetPasswordBWLJW6A {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final StateFlow IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final com.huawei.agconnect.config.impl.m read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 53;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LinearLayoutManager(com.huawei.agconnect.config.impl.m mVar, ContextScope contextScope) {
        mVar.getClass();
        this.read = mVar;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(PreferenceDialogFragment.read);
        this.write = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 13), 3);
    }
}
