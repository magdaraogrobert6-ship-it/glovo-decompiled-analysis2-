package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class DividerItemDecoration implements decryptAndGetPasswordBWLJW6A {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final internalPathIteratorSize IconCompatParcelizer;
    public final getQueryContext MediaMetadataCompat;
    public final StateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final StateFlow serializer;
    public final SignInDataStore write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 35;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DividerItemDecoration(getQueryContext getquerycontext, SignInDataStore signInDataStore, ContextScope contextScope, internalPathIteratorSize internalpathiteratorsize) {
        getquerycontext.getClass();
        signInDataStore.getClass();
        internalpathiteratorsize.getClass();
        this.MediaMetadataCompat = getquerycontext;
        this.write = signInDataStore;
        this.IconCompatParcelizer = internalpathiteratorsize;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow;
        this.serializer = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(absolutePath.read);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 9), 3);
    }
}
