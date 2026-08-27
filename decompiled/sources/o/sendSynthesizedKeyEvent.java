package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class sendSynthesizedKeyEvent implements accessgetCharacterscp {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final getQueryContext IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final SignInDataStore MediaMetadataCompat;
    public final GetCrowdSourcingEntryPointScreenImpl RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i3 + 63;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return stateFlow;
    }

    public sendSynthesizedKeyEvent(transferSessionPackageI transfersessionpackagei, ContextScope contextScope, getQueryContext getquerycontext, SignInDataStore signInDataStore, GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl) {
        transfersessionpackagei.getClass();
        getquerycontext.getClass();
        signInDataStore.getClass();
        getCrowdSourcingEntryPointScreenImpl.getClass();
        this.serializer = contextScope;
        this.IconCompatParcelizer = getquerycontext;
        this.MediaMetadataCompat = signInDataStore;
        this.RemoteActionCompatParcelizer = getCrowdSourcingEntryPointScreenImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getNoneIUNYP9kannotations.write);
        this.write = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.read = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        Object[] objArr = {(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_CROWD_SOURCING_ENABLED};
        int iSerializer = com.mapbox.navigator.R.serializer();
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), iSerializer, objArr)).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new SwitcherUiModelImpl$1(this, (ShortNewsContentCardView) null, 5), 3);
            int i = RatingCompat + 43;
            MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 4 % 2;
            } else {
                int i3 = 2 % 2;
            }
        }
        int i4 = RatingCompat + 29;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        getSentencesIUNYP9kannotations getsentencesiunyp9kannotations;
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = this.write.read();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (obj instanceof getSentencesIUNYP9kannotations) {
            int i4 = RatingCompat + 11;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getsentencesiunyp9kannotations = (getSentencesIUNYP9kannotations) obj;
        } else {
            int i6 = MediaSessionCompatQueueItem + 99;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getsentencesiunyp9kannotations = null;
        }
        if (getsentencesiunyp9kannotations != null) {
            BuildersKt.RemoteActionCompatParcelizer(this.serializer, null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(this, getsentencesiunyp9kannotations, shortNewsContentCardView, 4), 3);
        } else {
            int i8 = RatingCompat + 85;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
    }
}
