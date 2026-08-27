package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsViewModel$1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputServiceAndroidTextInputCommand extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final String IconCompatParcelizer;
    public final getPhonePjHm6EEannotations MediaBrowserCompatMediaItem;
    public final BrazeExternalSyntheticLambda28 MediaDescriptionCompat;
    public final GetCrowdSourcingEntryPointScreenImpl MediaMetadataCompat;
    public final com.huawei.wisesecurity.ucs_credential.p0 MediaSessionCompatQueueItem;
    public final sendInputCommandlambda0 MediaSessionCompatResultReceiverWrapper;
    public final StateFlow PlaybackStateCompat;
    public final SendTestPushUseCase RatingCompat;
    public final getDoneeUduSuo RemoteActionCompatParcelizer;
    public final IsFixableByRetry read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    public TextInputServiceAndroidTextInputCommand(getQueryContext getquerycontext, SendTestPushUseCase sendTestPushUseCase, getPhonePjHm6EEannotations getphonepjhm6eeannotations, GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, sendInputCommandlambda0 sendinputcommandlambda0, IsFixableByRetry isFixableByRetry, getDoneeUduSuo getdoneeudusuo, getBitmapui_graphics getbitmapui_graphics, com.huawei.wisesecurity.ucs_credential.p0 p0Var) {
        getquerycontext.getClass();
        sendTestPushUseCase.getClass();
        getphonepjhm6eeannotations.getClass();
        getCrowdSourcingEntryPointScreenImpl.getClass();
        brazeExternalSyntheticLambda28.getClass();
        sendinputcommandlambda0.getClass();
        isFixableByRetry.getClass();
        getdoneeudusuo.getClass();
        getbitmapui_graphics.getClass();
        p0Var.getClass();
        this.serializer = getquerycontext;
        this.RatingCompat = sendTestPushUseCase;
        this.MediaBrowserCompatMediaItem = getphonepjhm6eeannotations;
        this.MediaMetadataCompat = getCrowdSourcingEntryPointScreenImpl;
        this.MediaDescriptionCompat = brazeExternalSyntheticLambda28;
        this.MediaSessionCompatResultReceiverWrapper = sendinputcommandlambda0;
        this.read = isFixableByRetry;
        this.RemoteActionCompatParcelizer = getdoneeudusuo;
        this.MediaSessionCompatQueueItem = p0Var;
        Object objWrite = getbitmapui_graphics.write("address");
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("TermsAndConditions can't be opened without address");
            throw null;
        }
        this.IconCompatParcelizer = (String) objWrite;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(getWordsIUNYP9k.read);
        this.write = mutableStateFlow;
        this.PlaybackStateCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new TermsAndConditionsViewModel$1(this, shortNewsContentCardView, 0), 3);
        int i = MediaSessionCompatToken + 43;
        PlaybackStateCompatCustomAction = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
