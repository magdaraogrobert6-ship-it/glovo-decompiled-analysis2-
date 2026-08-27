package o;

import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.sentiance.core.model.events.H$b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class onAnimation implements decryptAndGetPasswordBWLJW6A {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final StateFlow IconCompatParcelizer;
    public final StateFlow MediaMetadataCompat;
    public final H$b RemoteActionCompatParcelizer;
    public final internalPathIteratorSize read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public onAnimation(H$b h$b, ContextScope contextScope, internalPathIteratorSize internalpathiteratorsize) {
        h$b.getClass();
        internalpathiteratorsize.getClass();
        this.RemoteActionCompatParcelizer = h$b;
        this.read = internalpathiteratorsize;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow;
        this.IconCompatParcelizer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(PreferenceFragmentDividerDecoration.write);
        this.write = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 14), 3);
    }
}
