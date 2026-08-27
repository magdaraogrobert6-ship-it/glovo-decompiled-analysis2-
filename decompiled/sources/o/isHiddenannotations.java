package o;

import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.domain.ContactRiderEventsLogger;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderViewModel;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.instant.shifts.presentation.confirmation.BookShiftConfirmationDialogViewModel;
import com.roadrunner.liveness.domain.CreateEmptyCameraImageUseCaseImpl;
import com.roadrunner.liveness.presentation.LivenessDetectionViewModel;
import com.roadrunner.login.domain.auth.DoPostLoginOperations;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import com.roadrunner.settings.subscreens.appearance.AppearanceViewModel;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class isHiddenannotations implements getColorIntegerOrNulllambda0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final mergeJsonObjects serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public isHiddenannotations(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, getInvisibleToUserannotations getinvisibletouserannotations, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        this.IconCompatParcelizer = 0;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.serializer = getinvisibletouserannotations;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public static final isHiddenannotations serializer(getInvisibleToUserannotations getinvisibletouserannotations, PreferenceGroupAdapter preferenceGroupAdapter, getInvisibleToUserannotations getinvisibletouserannotations2, setPresentationView setpresentationview) {
        int i = 2 % 2;
        getinvisibletouserannotations.getClass();
        preferenceGroupAdapter.getClass();
        setpresentationview.getClass();
        isHiddenannotations ishiddenannotations = new isHiddenannotations(getinvisibletouserannotations, preferenceGroupAdapter, getinvisibletouserannotations2, setpresentationview);
        int i2 = MediaSessionCompatQueueItem + 87;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ishiddenannotations;
        }
        throw null;
    }

    public static isHiddenannotations RemoteActionCompatParcelizer(applyLayoutFeatures applylayoutfeatures, r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, PreferenceGroupAdapter preferenceGroupAdapter) {
        int i = 2 % 2;
        isHiddenannotations ishiddenannotations = new isHiddenannotations(applylayoutfeatures, r8lambdapkx6kfybgp4leowkebovjpb0ug, lambdaprocessandresolvedeeplink15, preferenceGroupAdapter, 11);
        int i2 = MediaSessionCompatQueueItem + 37;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return ishiddenannotations;
    }

    public static isHiddenannotations RemoteActionCompatParcelizer(lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink16) {
        int i = 2 % 2;
        isHiddenannotations ishiddenannotations = new isHiddenannotations(lambdaprocessandresolvedeeplink15, r8lambda6uovp7lvejigbq5knkop8a0veiw, requestsinglelocationupdatelambda1, lambdaprocessandresolvedeeplink16, 10);
        int i2 = MediaMetadataCompat + 45;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ishiddenannotations;
        }
        throw null;
    }

    public /* synthetic */ isHiddenannotations(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.IconCompatParcelizer = i;
        this.read = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.serializer = mergejsonobjects4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[PHI: r4 r5 r6 r7
  0x0032: PHI (r4v41 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r5v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r6v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r7v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0058 A[PHI: r4 r5 r6 r7
  0x0058: PHI (r4v38 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r5v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r6v32 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0058: PHI (r7v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x007e A[PHI: r4 r5 r6 r7
  0x007e: PHI (r4v36 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r5v32 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r6v30 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r7v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00ae A[PHI: r4 r5 r6 r7
  0x00ae: PHI (r4v34 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r5v30 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r6v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r7v29 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x00e6 A[PHI: r4 r5 r6 r7
  0x00e6: PHI (r4v30 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r5v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r6v26 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r7v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0115 A[PHI: r4 r5 r6 r7
  0x0115: PHI (r4v28 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r5v25 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r6v24 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r7v24 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0149 A[PHI: r4 r5 r6 r7
  0x0149: PHI (r4v25 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r5v21 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r6v21 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r7v22 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x018b  */
    /* JADX WARN: Code duplicated, block: B:26:0x018f A[PHI: r4 r5 r6 r7
  0x018f: PHI (r4v22 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r5v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r6v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r7v20 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x01c9 A[PHI: r4 r5 r6 r7
  0x01c9: PHI (r4v19 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r5v16 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r6v16 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v18 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0215 A[PHI: r4 r5 r6 r7
  0x0215: PHI (r4v16 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r5v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r6v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0215: PHI (r7v16 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x023b A[PHI: r4 r5 r6 r7
  0x023b: PHI (r4v15 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x023b: PHI (r5v12 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x023b: PHI (r6v12 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x023b: PHI (r7v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0267 A[PHI: r4 r5 r6 r7
  0x0267: PHI (r4v14 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0267: PHI (r5v10 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0267: PHI (r6v10 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0267: PHI (r7v11 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x029a A[PHI: r4 r5 r6 r7
  0x029a: PHI (r4v12 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x029a: PHI (r5v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x029a: PHI (r6v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x029a: PHI (r7v9 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x02d2 A[PHI: r4 r5 r6 r7
  0x02d2: PHI (r4v10 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r5v6 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r6v6 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x02d2: PHI (r7v7 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0302 A[PHI: r4 r5 r6 r7
  0x0302: PHI (r4v8 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0302: PHI (r5v4 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0302: PHI (r6v4 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0302: PHI (r7v4 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0332 A[PHI: r4 r5 r6 r7
  0x0332: PHI (r4v3 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0332: PHI (r5v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0332: PHI (r6v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0332: PHI (r7v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0368 A[PHI: r4 r5 r6 r7
  0x0368: PHI (r4v1 o.mergeJsonObjects) = (r4v0 o.mergeJsonObjects), (r4v44 o.mergeJsonObjects) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r5v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r6v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r6v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r6v36 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0368: PHI (r7v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r7v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r7v38 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x002d, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        mergeJsonObjects mergejsonobjects;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 63;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = this.IconCompatParcelizer;
            mergejsonobjects = this.serializer;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.write;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.read;
            switch (i4) {
                case 0:
                    Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                    objWrite.getClass();
                    Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite2.getClass();
                    OtpLogger otpLogger = (OtpLogger) ((getInvisibleToUserannotations) mergejsonobjects).write();
                    Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite3.getClass();
                    N$b n$b = new N$b();
                    n$b.read = (getIsContainerannotations) objWrite;
                    n$b.write = (SemanticsProperties) objWrite2;
                    n$b.IconCompatParcelizer = otpLogger;
                    n$b.serializer = new AtomicBoolean(false);
                    return n$b;
                case 1:
                    return new SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new getQueryContext(), (AnalyticsServiceImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTextCompositionRangepsREZIo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (setShowingTextSubstitution) ((setStateDescription) mergejsonobjects).write());
                case 2:
                    return new ContactRiderViewModel(new SharedResourcePool(24), (UnifiedPhoneCallerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (android.content.ClipboardManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ContactRiderEventsLogger) ((AndroidIndirectPointerEvent_androidKt) mergejsonobjects).write());
                case 3:
                    a9 a9Var = (a9) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    resetOutlineParams resetoutlineparams = (resetOutlineParams) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                    a9Var.getClass();
                    isopeninternalroom_runtime.getClass();
                    resetoutlineparams.getClass();
                    settransactionsuccessful.getClass();
                    N$b n$b2 = new N$b();
                    n$b2.read = a9Var;
                    n$b2.write = isopeninternalroom_runtime;
                    n$b2.IconCompatParcelizer = resetoutlineparams;
                    n$b2.serializer = settransactionsuccessful;
                    return n$b2;
                case 4:
                    return new BookShiftConfirmationDialogViewModel((SendTestPushUseCase) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new com.huawei.wisesecurity.ucs_credential.n0(0), (getUnmodifiedPayloads) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NetworkErrorMapperImpl) mergejsonobjects.write(), new SharedResourcePool(24));
                case 5:
                    return new LivenessDetectionViewModel(new getQueryContext(), (OtpLogger) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (CreateEmptyCameraImageUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (onOpen) ((getDoubleOrNull) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write, (SystemLifecycleSystemLifecycleCallback) mergejsonobjects.write());
                case 6:
                    return new DoPostLoginOperations((SemanticsProperties_androidKt) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (RouterLogger) ((ShouldShowHeatmap_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AuthStateMachine) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (SharedResourcePool) ((SimpleExecutableQuery) mergejsonobjects).write());
                case 7:
                    SignInDataStore signInDataStore = (SignInDataStore) ((applyLayoutFeatures) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    boundingRectInRoot boundingrectinroot = (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5 = (BrazeExternalSyntheticLambda5) QueryResult.serializer.write();
                    OtpLogger otpLogger2 = (OtpLogger) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    Path$Companion path$Companion = new Path$Companion();
                    QueryResultCompanion queryResultCompanion = (QueryResultCompanion) mergejsonobjects.write();
                    signInDataStore.getClass();
                    boundingrectinroot.getClass();
                    brazeExternalSyntheticLambda5.getClass();
                    otpLogger2.getClass();
                    queryResultCompanion.getClass();
                    androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
                    blockRunner.read = signInDataStore;
                    blockRunner.serializer = boundingrectinroot;
                    blockRunner.RatingCompat = brazeExternalSyntheticLambda5;
                    blockRunner.write = otpLogger2;
                    blockRunner.RemoteActionCompatParcelizer = path$Companion;
                    blockRunner.IconCompatParcelizer = queryResultCompanion;
                    return blockRunner;
                case 8:
                    launchThirdPartySharingResponseTasksI launchthirdpartysharingresponsetasksi = (launchThirdPartySharingResponseTasksI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    C$b c$b = (C$b) ((PreferenceGroupAdapter) mergejsonobjects).write();
                    launchthirdpartysharingresponsetasksi.getClass();
                    executeApiRequest.getClass();
                    r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
                    c$b.getClass();
                    N$b n$b3 = new N$b();
                    n$b3.read = launchthirdpartysharingresponsetasksi;
                    n$b3.write = executeApiRequest;
                    n$b3.IconCompatParcelizer = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
                    n$b3.serializer = c$b;
                    return n$b3;
                case 9:
                    GetAppStateImpl getAppStateImpl = (GetAppStateImpl) ((readInstallReferrerHuaweiAppGallery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    GetAppStateImpl getAppStateImpl2 = (GetAppStateImpl) ((lambdaprocessAndResolveDeeplink15) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    GetAppStateImpl getAppStateImpl3 = (GetAppStateImpl) ((readInstallReferrerHuaweiAppGallery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    setTransactionSuccessful settransactionsuccessful2 = (setTransactionSuccessful) mergejsonobjects.write();
                    getAppStateImpl.getClass();
                    getAppStateImpl2.getClass();
                    getAppStateImpl3.getClass();
                    settransactionsuccessful2.getClass();
                    N$b n$b4 = new N$b();
                    n$b4.read = getAppStateImpl;
                    n$b4.write = getAppStateImpl2;
                    n$b4.IconCompatParcelizer = getAppStateImpl3;
                    n$b4.serializer = settransactionsuccessful2;
                    i = MediaSessionCompatQueueItem + 61;
                    MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i5 = 43 / 0;
                    }
                    return n$b4;
                case 10:
                    return new setInstallBeginTimeServerInSeconds((getInstallBeginTimeServerInSeconds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isDeviceIdsReadingOnceEnabled) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects).write(), (increaseRetries) setClickTimeServerInSeconds.read.write());
                case 11:
                    enableCoppaComplianceInDelay enablecoppacomplianceindelay = new enableCoppaComplianceInDelay((getPurchaseVerificationCallback) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (disableCoppaComplianceInDelay) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setEventDeduplicationIdsMaxSize) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (enablePlayStoreKidsComplianceInDelay) ((PreferenceGroupAdapter) mergejsonobjects).write());
                    int i6 = MediaMetadataCompat + 123;
                    MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return enablecoppacomplianceindelay;
                case 12:
                    IOParser$Decoder iOParser$Decoder = (IOParser$Decoder) ((setSdkAuthenticationSignature) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY r8lambdagjdzxd7jqzobcnznhpvrngz6jxy = (r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    SettingsCacheImpl settingsCacheImpl = (SettingsCacheImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    isOpenInternalroom_runtime isopeninternalroom_runtime2 = (isOpenInternalroom_runtime) mergejsonobjects.write();
                    iOParser$Decoder.getClass();
                    r8lambdagjdzxd7jqzobcnznhpvrngz6jxy.getClass();
                    settingsCacheImpl.getClass();
                    isopeninternalroom_runtime2.getClass();
                    N$b n$b5 = new N$b();
                    n$b5.read = iOParser$Decoder;
                    n$b5.write = r8lambdagjdzxd7jqzobcnznhpvrngz6jxy;
                    n$b5.IconCompatParcelizer = settingsCacheImpl;
                    n$b5.serializer = isopeninternalroom_runtime2;
                    return n$b5;
                case 13:
                    return new AppearanceViewModel((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (setFirstVerticalBias) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setFirstHorizontalBias) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), new getQueryContext(), (OtpLogger) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects).write());
                case 14:
                    return new r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (unpackInt2) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (OtpLogger) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects).write());
                case 15:
                    return new r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessgetOldDependencyp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NetworkBody) ((setSdkAuthenticationSignature) mergejsonobjects).write());
                default:
                    logPushDeliverylambda1 logpushdeliverylambda1 = (logPushDeliverylambda1) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    lambda39 lambda39Var = (lambda39) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    isOpenInternalroom_runtime isopeninternalroom_runtime3 = (isOpenInternalroom_runtime) mergejsonobjects.write();
                    logpushdeliverylambda1.getClass();
                    lambda39Var.getClass();
                    sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
                    isopeninternalroom_runtime3.getClass();
                    N$b n$b6 = new N$b();
                    n$b6.read = logpushdeliverylambda1;
                    n$b6.write = lambda39Var;
                    n$b6.IconCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
                    n$b6.serializer = isopeninternalroom_runtime3;
                    return n$b6;
            }
        }
        int i8 = this.IconCompatParcelizer;
        mergejsonobjects = this.serializer;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.write;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.read;
        int i9 = 50 / 0;
        switch (i8) {
            case 0:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite4.getClass();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                OtpLogger otpLogger3 = (OtpLogger) ((getInvisibleToUserannotations) mergejsonobjects).write();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                N$b n$b7 = new N$b();
                n$b7.read = (getIsContainerannotations) objWrite4;
                n$b7.write = (SemanticsProperties) objWrite5;
                n$b7.IconCompatParcelizer = otpLogger3;
                n$b7.serializer = new AtomicBoolean(false);
                return n$b7;
            case 1:
                return new SemanticsSortKtgeometryDepthFirstSearchisTraversalGroup1((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new getQueryContext(), (AnalyticsServiceImpl) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTextCompositionRangepsREZIo) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (setShowingTextSubstitution) ((setStateDescription) mergejsonobjects).write());
            case 2:
                return new ContactRiderViewModel(new SharedResourcePool(24), (UnifiedPhoneCallerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (android.content.ClipboardManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ContactRiderEventsLogger) ((AndroidIndirectPointerEvent_androidKt) mergejsonobjects).write());
            case 3:
                a9 a9Var2 = (a9) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime4 = (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                resetOutlineParams resetoutlineparams2 = (resetOutlineParams) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                setTransactionSuccessful settransactionsuccessful3 = (setTransactionSuccessful) mergejsonobjects.write();
                a9Var2.getClass();
                isopeninternalroom_runtime4.getClass();
                resetoutlineparams2.getClass();
                settransactionsuccessful3.getClass();
                N$b n$b8 = new N$b();
                n$b8.read = a9Var2;
                n$b8.write = isopeninternalroom_runtime4;
                n$b8.IconCompatParcelizer = resetoutlineparams2;
                n$b8.serializer = settransactionsuccessful3;
                return n$b8;
            case 4:
                return new BookShiftConfirmationDialogViewModel((SendTestPushUseCase) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), new com.huawei.wisesecurity.ucs_credential.n0(0), (getUnmodifiedPayloads) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NetworkErrorMapperImpl) mergejsonobjects.write(), new SharedResourcePool(24));
            case 5:
                return new LivenessDetectionViewModel(new getQueryContext(), (OtpLogger) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (CreateEmptyCameraImageUseCaseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (onOpen) ((getDoubleOrNull) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write, (SystemLifecycleSystemLifecycleCallback) mergejsonobjects.write());
            case 6:
                return new DoPostLoginOperations((SemanticsProperties_androidKt) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (RouterLogger) ((ShouldShowHeatmap_Factory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AuthStateMachine) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (SharedResourcePool) ((SimpleExecutableQuery) mergejsonobjects).write());
            case 7:
                SignInDataStore signInDataStore2 = (SignInDataStore) ((applyLayoutFeatures) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                boundingRectInRoot boundingrectinroot2 = (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda6 = (BrazeExternalSyntheticLambda5) QueryResult.serializer.write();
                OtpLogger otpLogger4 = (OtpLogger) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                Path$Companion path$Companion2 = new Path$Companion();
                QueryResultCompanion queryResultCompanion2 = (QueryResultCompanion) mergejsonobjects.write();
                signInDataStore2.getClass();
                boundingrectinroot2.getClass();
                brazeExternalSyntheticLambda6.getClass();
                otpLogger4.getClass();
                queryResultCompanion2.getClass();
                androidx.lifecycle.BlockRunner blockRunner2 = new androidx.lifecycle.BlockRunner();
                blockRunner2.read = signInDataStore2;
                blockRunner2.serializer = boundingrectinroot2;
                blockRunner2.RatingCompat = brazeExternalSyntheticLambda6;
                blockRunner2.write = otpLogger4;
                blockRunner2.RemoteActionCompatParcelizer = path$Companion2;
                blockRunner2.IconCompatParcelizer = queryResultCompanion2;
                return blockRunner2;
            case 8:
                launchThirdPartySharingResponseTasksI launchthirdpartysharingresponsetasksi2 = (launchThirdPartySharingResponseTasksI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                ExecuteApiRequest executeApiRequest2 = (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli9 = (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                C$b c$b2 = (C$b) ((PreferenceGroupAdapter) mergejsonobjects).write();
                launchthirdpartysharingresponsetasksi2.getClass();
                executeApiRequest2.getClass();
                r8lambda4txk7kovp_j84hgvzl3zo6mzli9.getClass();
                c$b2.getClass();
                N$b n$b9 = new N$b();
                n$b9.read = launchthirdpartysharingresponsetasksi2;
                n$b9.write = executeApiRequest2;
                n$b9.IconCompatParcelizer = r8lambda4txk7kovp_j84hgvzl3zo6mzli9;
                n$b9.serializer = c$b2;
                return n$b9;
            case 9:
                GetAppStateImpl getAppStateImpl4 = (GetAppStateImpl) ((readInstallReferrerHuaweiAppGallery) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                GetAppStateImpl getAppStateImpl5 = (GetAppStateImpl) ((lambdaprocessAndResolveDeeplink15) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                GetAppStateImpl getAppStateImpl6 = (GetAppStateImpl) ((readInstallReferrerHuaweiAppGallery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                setTransactionSuccessful settransactionsuccessful4 = (setTransactionSuccessful) mergejsonobjects.write();
                getAppStateImpl4.getClass();
                getAppStateImpl5.getClass();
                getAppStateImpl6.getClass();
                settransactionsuccessful4.getClass();
                N$b n$b10 = new N$b();
                n$b10.read = getAppStateImpl4;
                n$b10.write = getAppStateImpl5;
                n$b10.IconCompatParcelizer = getAppStateImpl6;
                n$b10.serializer = settransactionsuccessful4;
                i = MediaSessionCompatQueueItem + 61;
                MediaMetadataCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i10 = 43 / 0;
                }
                return n$b10;
            case 10:
                return new setInstallBeginTimeServerInSeconds((getInstallBeginTimeServerInSeconds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isDeviceIdsReadingOnceEnabled) ((lambdaprocessAndResolveDeeplink15) mergejsonobjects).write(), (increaseRetries) setClickTimeServerInSeconds.read.write());
            case 11:
                enableCoppaComplianceInDelay enablecoppacomplianceindelay2 = new enableCoppaComplianceInDelay((getPurchaseVerificationCallback) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (disableCoppaComplianceInDelay) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setEventDeduplicationIdsMaxSize) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (enablePlayStoreKidsComplianceInDelay) ((PreferenceGroupAdapter) mergejsonobjects).write());
                int i11 = MediaMetadataCompat + 123;
                MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return enablecoppacomplianceindelay2;
            case 12:
                IOParser$Decoder iOParser$Decoder2 = (IOParser$Decoder) ((setSdkAuthenticationSignature) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY r8lambdagjdzxd7jqzobcnznhpvrngz6jxy2 = (r8lambdaGjDZxd7jQZoBcNzNhpVRngZ6jXY) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                SettingsCacheImpl settingsCacheImpl2 = (SettingsCacheImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime5 = (isOpenInternalroom_runtime) mergejsonobjects.write();
                iOParser$Decoder2.getClass();
                r8lambdagjdzxd7jqzobcnznhpvrngz6jxy2.getClass();
                settingsCacheImpl2.getClass();
                isopeninternalroom_runtime5.getClass();
                N$b n$b11 = new N$b();
                n$b11.read = iOParser$Decoder2;
                n$b11.write = r8lambdagjdzxd7jqzobcnznhpvrngz6jxy2;
                n$b11.IconCompatParcelizer = settingsCacheImpl2;
                n$b11.serializer = isopeninternalroom_runtime5;
                return n$b11;
            case 13:
                return new AppearanceViewModel((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (setFirstVerticalBias) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (setFirstHorizontalBias) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), new getQueryContext(), (OtpLogger) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects).write());
            case 14:
                return new r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (unpackInt2) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (OtpLogger) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) mergejsonobjects).write());
            case 15:
                return new r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessgetOldDependencyp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NetworkBody) ((setSdkAuthenticationSignature) mergejsonobjects).write());
            default:
                logPushDeliverylambda1 logpushdeliverylambda2 = (logPushDeliverylambda1) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                lambda39 lambda39Var2 = (lambda39) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2 = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((r8lambdans7BYwA6Reyjg6IiZz7pAk0ee8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                isOpenInternalroom_runtime isopeninternalroom_runtime6 = (isOpenInternalroom_runtime) mergejsonobjects.write();
                logpushdeliverylambda2.getClass();
                lambda39Var2.getClass();
                sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2.getClass();
                isopeninternalroom_runtime6.getClass();
                N$b n$b12 = new N$b();
                n$b12.read = logpushdeliverylambda2;
                n$b12.write = lambda39Var2;
                n$b12.IconCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release2;
                n$b12.serializer = isopeninternalroom_runtime6;
                return n$b12;
        }
    }
}
