package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.delivery.accept.autoaccept.preferences.nest.AutoAcceptPreferencesNestUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class hasSameNonLayoutAttributesui_text implements decryptAndGetPasswordBWLJW6A {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final ContextScope IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final getDEFAULT_TEXT_DIRECTION_HEURISTICui_text MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final SignInDataStore MediaSessionCompatQueueItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final getSecondaryUpstream write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 5;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i2 + 103;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public hasSameNonLayoutAttributesui_text(ContextScope contextScope, getSecondaryUpstream getsecondaryupstream, getDEFAULT_TEXT_DIRECTION_HEURISTICui_text getdefault_text_direction_heuristicui_text, SignInDataStore signInDataStore) {
        getsecondaryupstream.getClass();
        getdefault_text_direction_heuristicui_text.getClass();
        signInDataStore.getClass();
        this.IconCompatParcelizer = contextScope;
        this.write = getsecondaryupstream;
        this.MediaDescriptionCompat = getdefault_text_direction_heuristicui_text;
        this.MediaSessionCompatQueueItem = signInDataStore;
        this.read = StateFlowKt.read(new loadAsync(false, false, false));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(copyGSF8kmgdefault.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AutoAcceptPreferencesNestUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new ClearDataUseCaseImpl$invoke$2(this, shortNewsContentCardView, 12), 3);
    }
}
