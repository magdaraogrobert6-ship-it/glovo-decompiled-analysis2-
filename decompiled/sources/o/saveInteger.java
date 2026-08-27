package o;

import com.roadrunner.freelancing.domain.StopWorkingImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.rider.state.onpause.domain.EndBreakUseCaseImpl;
import com.roadrunner.rider.state.summary.nest.NestRiderStateSummaryUiModelImpl$1;
import com.roadrunner.startworking.domain.stopworking.StopWorkingUseCaseImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class saveInteger implements decryptAndGetPasswordBWLJW6A {
    private static int ComponentActivity = 1;
    private static int ResultReceiver;
    public final MutableStateFlow IconCompatParcelizer;
    public final EndBreakUseCaseImpl MediaBrowserCompatMediaItem;
    public final MutableStateFlow MediaDescriptionCompat;
    public final NetworkErrorMapperImpl MediaMetadataCompat;
    public final FormBody.Builder MediaSessionCompatQueueItem;
    public final StopWorkingUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final getQueryContext MediaSessionCompatToken;
    public final getDeeplinkClickTime ParcelableVolumeInfo;
    public final MutableStateFlow PlaybackStateCompat;
    public final SendBreakRequestUseCaseImpl PlaybackStateCompatCustomAction;
    public final StopWorkingImpl RatingCompat;
    public final WindowInsetsCompatImpl28 RemoteActionCompatParcelizer;
    public final restoreChildFragmentState r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final PlatformStringDelegate read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = ResultReceiver + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ComponentActivity = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        MutableStateFlow mutableStateFlow = this.MediaDescriptionCompat;
        int i4 = i3 + 47;
        ResultReceiver = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return mutableStateFlow;
    }

    public saveInteger(ContextScope contextScope, getDeeplinkClickTime getdeeplinkclicktime, getQueryContext getquerycontext, EndBreakUseCaseImpl endBreakUseCaseImpl, restoreChildFragmentState restorechildfragmentstate, NetworkErrorMapperImpl networkErrorMapperImpl, PlatformStringDelegate platformStringDelegate, StopWorkingImpl stopWorkingImpl, StopWorkingUseCaseImpl stopWorkingUseCaseImpl, SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl, WindowInsetsCompatImpl35 windowInsetsCompatImpl35, FormBody.Builder builder) {
        this.serializer = contextScope;
        this.ParcelableVolumeInfo = getdeeplinkclicktime;
        this.MediaSessionCompatToken = getquerycontext;
        this.MediaBrowserCompatMediaItem = endBreakUseCaseImpl;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = restorechildfragmentstate;
        this.MediaMetadataCompat = networkErrorMapperImpl;
        this.read = platformStringDelegate;
        this.RatingCompat = stopWorkingImpl;
        this.MediaSessionCompatResultReceiverWrapper = stopWorkingUseCaseImpl;
        this.PlaybackStateCompatCustomAction = sendBreakRequestUseCaseImpl;
        this.MediaSessionCompatQueueItem = builder;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SdkClickResponseData.read);
        this.write = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        r8lambda6cOFqnFCSVnq6uI5jphSUi9HNJU r8lambda6cofqnfcsvnq6ui5jphsui9hnju = windowInsetsCompatImpl35.write;
        Object objWrite = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.read.write();
        objWrite.getClass();
        Object objWrite2 = r8lambda6cofqnfcsvnq6ui5jphsui9hnju.RemoteActionCompatParcelizer.write();
        objWrite2.getClass();
        this.RemoteActionCompatParcelizer = new WindowInsetsCompatImpl28((setTransactionSuccessful) objWrite, (CoreComponentFactory) objWrite2, new getQueryContext());
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NestRiderStateSummaryUiModelImpl$1(this, null, 0), 3);
    }

    public static final void read(saveInteger saveinteger, boolean z) {
        int i = 2 % 2;
        int i2 = ComponentActivity + 47;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        SessionResponseData sessionResponseData = null;
        if (i2 % 2 != 0) {
            boolean z2 = saveinteger.write.read() instanceof SessionResponseData;
            throw null;
        }
        MutableStateFlow mutableStateFlow = saveinteger.write;
        Object obj = mutableStateFlow.read();
        if (obj instanceof SessionResponseData) {
            int i3 = ComponentActivity + 35;
            ResultReceiver = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            sessionResponseData = (SessionResponseData) obj;
        }
        if (sessionResponseData == null) {
            return;
        }
        mutableStateFlow.IconCompatParcelizer(SessionResponseData.read(sessionResponseData, z));
    }
}
