package o;

import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldProcessEventI extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final MutableStateFlow IconCompatParcelizer;
    public final NetworkErrorMapperImpl MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final setTransactionSuccessful MediaMetadataCompat;
    public final FormBody.Builder MediaSessionCompatQueueItem;
    public final MutableStateFlow MediaSessionCompatToken;
    public final UnifiedPhoneCallerImpl ParcelableVolumeInfo;
    public final MutableStateFlow RatingCompat;
    public final GetAppStateImpl RemoteActionCompatParcelizer;
    public final stopInstancelambda11 read;
    public final a9 serializer;
    public final MutableStateFlow write;

    public shouldProcessEventI(GetAppStateImpl getAppStateImpl, NetworkErrorMapperImpl networkErrorMapperImpl, a9 a9Var, stopInstancelambda11 stopinstancelambda11, setTransactionSuccessful settransactionsuccessful, getQueryContext getquerycontext, FormBody.Builder builder, UnifiedPhoneCallerImpl unifiedPhoneCallerImpl) {
        getAppStateImpl.getClass();
        networkErrorMapperImpl.getClass();
        a9Var.getClass();
        stopinstancelambda11.getClass();
        settransactionsuccessful.getClass();
        getquerycontext.getClass();
        builder.getClass();
        unifiedPhoneCallerImpl.getClass();
        this.RemoteActionCompatParcelizer = getAppStateImpl;
        this.MediaBrowserCompatMediaItem = networkErrorMapperImpl;
        this.serializer = a9Var;
        this.read = stopinstancelambda11;
        this.MediaMetadataCompat = settransactionsuccessful;
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaSessionCompatQueueItem = builder;
        this.ParcelableVolumeInfo = unifiedPhoneCallerImpl;
        setEnabledI setenabledi = setEnabledI.serializer;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setenabledi);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        mutableStateFlow.IconCompatParcelizer(setenabledi);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NafathModalUiModelImpl$1(this, null, 8), 3);
        ((decode) builder.serializer).IconCompatParcelizer("Recent Deliveries", null);
    }

    public final sendLicenseVerificationDataI read(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 15;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        sendLicenseVerificationDataI sendlicenseverificationdatai = (sendLicenseVerificationDataI) this.IconCompatParcelizer.read();
        if (!(sendlicenseverificationdatai instanceof sendInstallReferrerI)) {
            return sendlicenseverificationdatai;
        }
        trackNewSessionI tracknewsessioni = ((sendInstallReferrerI) sendlicenseverificationdatai).read;
        List list = tracknewsessioni.write;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i4 = PlaybackStateCompatCustomAction + 31;
            MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                ((teardownAllGlobalParametersS) it.next()).read.equals(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) it.next();
            if (teardownallglobalparameterss.read.equals(str)) {
                teardownallglobalparameterss = (teardownAllGlobalParametersS) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(teardownallglobalparameterss);
            }
            arrayList.add(teardownallglobalparameterss);
        }
        sendInstallReferrerI sendinstallreferreri = new sendInstallReferrerI(new trackNewSessionI(arrayList, tracknewsessioni.IconCompatParcelizer));
        int i5 = MediaSessionCompatResultReceiverWrapper + 81;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sendinstallreferreri;
    }
}
