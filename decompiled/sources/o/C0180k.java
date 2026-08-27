package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: renamed from: o.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0180k extends androidx.lifecycle.ViewModel {
    private static int ComponentActivity = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final stopInstancelambda11 MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final QueryResultCompanion MediaSessionCompatQueueItem;
    public final GetAppStateImpl MediaSessionCompatResultReceiverWrapper;
    public final androidx.lifecycle.BlockRunner MediaSessionCompatToken;
    public final BrazeExternalSyntheticLambda5 ParcelableVolumeInfo;
    public final setTransactionSuccessful PlaybackStateCompat;
    public final BrazeLogger PlaybackStateCompatCustomAction;
    public final ag RatingCompat;
    public endStream RemoteActionCompatParcelizer;
    public final OtpLogger read;
    public final ForgotPasswordPersistedTimerManager serializer;
    public final N$b write;

    public C0180k(ag agVar, OtpLogger otpLogger, N$b n$b, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, GetAppStateImpl getAppStateImpl, androidx.lifecycle.BlockRunner blockRunner, stopInstancelambda11 stopinstancelambda11, transferSessionPackageI transfersessionpackagei, setTransactionSuccessful settransactionsuccessful, QueryResultCompanion queryResultCompanion, ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager, unpackInt2 unpackint2, getQueryContext getquerycontext) {
        agVar.getClass();
        otpLogger.getClass();
        n$b.getClass();
        brazeExternalSyntheticLambda5.getClass();
        getAppStateImpl.getClass();
        blockRunner.getClass();
        stopinstancelambda11.getClass();
        transfersessionpackagei.getClass();
        settransactionsuccessful.getClass();
        queryResultCompanion.getClass();
        forgotPasswordPersistedTimerManager.getClass();
        unpackint2.getClass();
        getquerycontext.getClass();
        this.RatingCompat = agVar;
        this.read = otpLogger;
        this.write = n$b;
        this.ParcelableVolumeInfo = brazeExternalSyntheticLambda5;
        this.MediaSessionCompatResultReceiverWrapper = getAppStateImpl;
        this.MediaSessionCompatToken = blockRunner;
        this.MediaBrowserCompatMediaItem = stopinstancelambda11;
        this.MediaMetadataCompat = transfersessionpackagei;
        this.PlaybackStateCompat = settransactionsuccessful;
        this.MediaSessionCompatQueueItem = queryResultCompanion;
        this.serializer = forgotPasswordPersistedTimerManager;
        this.MediaDescriptionCompat = getquerycontext;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(5, this));
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) unpackint2.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
        endStream endstream = C0166g.read;
        if (!zIconCompatParcelizer) {
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_BY_MAGIC_LINK_ENABLED)) {
                int i = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 7;
                ComponentActivity = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i2 = i % 2;
            } else {
                endstream = C0175h.read;
                int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 59;
                ComponentActivity = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                }
            }
            int i4 = 2 % 2;
        }
        this.RemoteActionCompatParcelizer = endstream;
        this.PlaybackStateCompatCustomAction = new BrazeLogger(agVar.write(endstream, ""));
    }

    public static final void RemoteActionCompatParcelizer(C0180k c0180k) {
        AndroidGraphicsContext2 androidGraphicsContext2;
        C0179j c0179j;
        boolean z;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 25;
        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            BrazeLogger brazeLogger = c0180k.PlaybackStateCompatCustomAction;
            brazeLogger.getClass();
            androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
            c0179j = (C0179j) brazeLogger.write();
            z = false;
        } else {
            BrazeLogger brazeLogger2 = c0180k.PlaybackStateCompatCustomAction;
            brazeLogger2.getClass();
            androidGraphicsContext2 = brazeLogger2.IconCompatParcelizer;
            c0179j = (C0179j) brazeLogger2.write();
            z = true;
        }
        androidGraphicsContext2.RemoteActionCompatParcelizer(C0179j.write(c0179j, z));
        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 97;
        ComponentActivity = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void read() {
        AndroidGraphicsContext2 androidGraphicsContext2;
        C0179j c0179j;
        boolean z;
        int i = 2 % 2;
        int i2 = ComponentActivity + 73;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            BrazeLogger brazeLogger = this.PlaybackStateCompatCustomAction;
            brazeLogger.getClass();
            androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
            c0179j = (C0179j) brazeLogger.write();
            z = true;
        } else {
            BrazeLogger brazeLogger2 = this.PlaybackStateCompatCustomAction;
            brazeLogger2.getClass();
            androidGraphicsContext2 = brazeLogger2.IconCompatParcelizer;
            c0179j = (C0179j) brazeLogger2.write();
            z = false;
        }
        androidGraphicsContext2.RemoteActionCompatParcelizer(C0179j.write(c0179j, z));
        int i3 = ComponentActivity + 115;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
