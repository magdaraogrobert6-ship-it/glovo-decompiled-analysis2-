package o;

import android.content.SharedPreferences;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1 extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final AnalyticsServiceImpl IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final setTextCompositionRangepsREZIo MediaMetadataCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final setShowingTextSubstitution serializer;
    public final getQueryContext write;

    public final StateFlow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 71;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaBrowserCompatMediaItem;
        int i5 = i2 + 87;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getQueryContext read() {
        getQueryContext getquerycontext;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        if (i2 % 2 != 0) {
            getquerycontext = this.write;
            int i4 = 81 / 0;
        } else {
            getquerycontext = this.write;
        }
        int i5 = i3 + 13;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getquerycontext;
    }

    public SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1(setTransactionSuccessful settransactionsuccessful, getQueryContext getquerycontext, AnalyticsServiceImpl analyticsServiceImpl, setTextCompositionRangepsREZIo settextcompositionrangepsrezio, setShowingTextSubstitution setshowingtextsubstitution) {
        settransactionsuccessful.getClass();
        getquerycontext.getClass();
        analyticsServiceImpl.getClass();
        settextcompositionrangepsrezio.getClass();
        setshowingtextsubstitution.getClass();
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.write = getquerycontext;
        this.IconCompatParcelizer = analyticsServiceImpl;
        this.MediaMetadataCompat = settextcompositionrangepsrezio;
        this.serializer = setshowingtextsubstitution;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(19, this));
        this.read = isadapterpositiononscreen;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SemanticsSortKtUnmergedConfigComparator11.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        int i = EmptyFillMeasurePolicy.read[((setToggleableState) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).ordinal()];
        Object obj = null;
        if (i == 1) {
            serializer(com.logistics.rider.glovo.R.drawable.ic_biometric_face, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.biometrics_face));
            int i2 = RatingCompat + 121;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            serializer(com.logistics.rider.glovo.R.drawable.ic_biometric_fingerprint, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.biometrics_prompt_biometrics_text));
        } else {
            serializer(com.logistics.rider.glovo.R.drawable.ic_biometric_fingerprint, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.biometrics_fingerprint));
            int i3 = RatingCompat + 79;
            MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String type = ((setToggleableState) this.read.MediaSessionCompatResultReceiverWrapper()).getType();
        setShowingTextSubstitution setshowingtextsubstitution = this.serializer;
        setshowingtextsubstitution.getClass();
        type.getClass();
        ff$$ExternalSyntheticOutline0.m("biometric_type", type, setshowingtextsubstitution.write, "biometrics_login_maybelater");
        SharedPreferences.Editor editorEdit = this.MediaMetadataCompat.RemoteActionCompatParcelizer().edit();
        editorEdit.putBoolean("SHARED_PREF_BIOMETRIC_SHOULD_LAUNCH_FLAG", false);
        editorEdit.apply();
        int i4 = MediaSessionCompatQueueItem + 87;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void serializer(int i, String str) {
        int i2 = 2 % 2;
        setTransactionSuccessful settransactionsuccessful = this.MediaDescriptionCompat;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(new SemanticsSortKtUnmergedConfigComparator1(settransactionsuccessful.read(com.logistics.rider.glovo.R.string.biometrics_title, str), i, settransactionsuccessful.read(com.logistics.rider.glovo.R.string.biometrics_description, str), settransactionsuccessful.read(com.logistics.rider.glovo.R.string.biometrics_enable_btn, str), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.biometrics_cancel_btn)));
        int i3 = MediaSessionCompatQueueItem + 45;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
