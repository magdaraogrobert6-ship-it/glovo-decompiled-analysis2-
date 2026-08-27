package o;

import com.roadrunner.login.logging.OtpLogger;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA {
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaMetadataCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final OtpLogger read;
    public final setTransactionSuccessful serializer;
    public final isAdapterPositionOnScreen write;

    public r8lambdaRdO_uN7XDjHQOVIqToN9xCXIqPA(setTransactionSuccessful settransactionsuccessful, OtpLogger otpLogger, getQueryContext getquerycontext) {
        settransactionsuccessful.getClass();
        otpLogger.getClass();
        getquerycontext.getClass();
        this.serializer = settransactionsuccessful;
        this.read = otpLogger;
        this.RemoteActionCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(r8lambdaSd2B2zGV4hWbX0Yk0cWfi5x2wt8.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaMetadataCompat = mutableStateFlow;
        this.write = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(4, this));
    }
}
