package o;

import android.app.Application;
import coil3.ComponentRegistry$Builder;
import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.domain.PhoneValidationUseCase;
import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.roadrunner.twofa.data.repo.TwoFaRepository;
import com.roadrunner.web.performance.WebViewInitializer;
import com.sentiance.core.model.events.C$b;
import dagger.Lazy;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.network.NetworkBody;
import okhttp3.FormBody;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class requestGeofencesInitializationlambda1 implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final /* synthetic */ int write;

    public requestGeofencesInitializationlambda1(publishErrorlambda1 publisherrorlambda1, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 15;
        requestgeofencesinitializationlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.serializer = requestgeofencesinitializationlambda1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public /* synthetic */ requestGeofencesInitializationlambda1(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.serializer = mergejsonobjects;
        this.IconCompatParcelizer = getcolorintegerornulllambda0;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
    }

    public requestGeofencesInitializationlambda1(invokeqtAw6s invokeqtaw6s, publishErrorlambda1 publisherrorlambda1, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me) {
        this.write = 1;
        invokeqtaw6s.getClass();
        publisherrorlambda1.getClass();
        this.IconCompatParcelizer = invokeqtaw6s;
        this.serializer = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = r8lambdazvx83uidsl68vmn7rpqxcy0me;
    }

    public /* synthetic */ requestGeofencesInitializationlambda1(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects, int i) {
        this.write = i;
        this.IconCompatParcelizer = getcolorintegerornulllambda0;
        this.serializer = getcolorintegerornulllambda1;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
    }

    public requestGeofencesInitializationlambda1(requestBannersRefreshlambda1 requestbannersrefreshlambda1, requestGeofencesInitializationlambda1 requestgeofencesinitializationlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 16;
        requestgeofencesinitializationlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = requestbannersrefreshlambda1;
        this.serializer = requestgeofencesinitializationlambda1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public requestGeofencesInitializationlambda1(hasNestedScrollingParent hasnestedscrollingparent, backgroundTimerFiredI backgroundtimerfiredi, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.write = 12;
        hasnestedscrollingparent.getClass();
        requestbannersrefreshlambda1.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = backgroundtimerfiredi;
        this.RemoteActionCompatParcelizer = requestbannersrefreshlambda1;
    }

    public requestGeofencesInitializationlambda1(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, AbsSavedState absSavedState, SingleProcessDataStore singleProcessDataStore) {
        this.write = 6;
        absSavedState.getClass();
        singleProcessDataStore.getClass();
        this.IconCompatParcelizer = transactionwithresultsuspendimpl;
        this.serializer = absSavedState;
        this.RemoteActionCompatParcelizer = singleProcessDataStore;
    }

    public requestGeofencesInitializationlambda1(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, setPresentationView setpresentationview, publishErrorlambda1 publisherrorlambda1) {
        this.write = 7;
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.serializer = setpresentationview;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
    }

    public requestGeofencesInitializationlambda1(publishErrorlambda1 publisherrorlambda1, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 10;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public requestGeofencesInitializationlambda1(publishErrorlambda1 publisherrorlambda1, AbsSavedState absSavedState, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.write = 5;
        absSavedState.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = publisherrorlambda1;
        this.serializer = absSavedState;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public requestGeofencesInitializationlambda1(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, setPresentationView setpresentationview) {
        this.write = 9;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public requestGeofencesInitializationlambda1(requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda2, postAnimationRunner postanimationrunner) {
        this.write = 8;
        requestsinglelocationupdatelambda1.getClass();
        requestsinglelocationupdatelambda2.getClass();
        this.IconCompatParcelizer = requestsinglelocationupdatelambda1;
        this.serializer = requestsinglelocationupdatelambda2;
        this.RemoteActionCompatParcelizer = postanimationrunner;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r3 r4 r5
  0x002c: PHI (r3v43 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r4v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r5v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x004c A[PHI: r3 r4 r5
  0x004c: PHI (r3v40 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r5v29 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x006a A[PHI: r3 r4 r5
  0x006a: PHI (r3v37 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r4v29 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r5v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0088 A[PHI: r3 r4 r5
  0x0088: PHI (r3v35 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r4v25 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r5v25 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bd A[PHI: r3 r4 r5
  0x00bd: PHI (r3v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r4v23 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r5v23 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x00f1 A[PHI: r3 r4 r5
  0x00f1: PHI (r3v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r4v20 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r5v22 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0113 A[PHI: r3 r4 r5
  0x0113: PHI (r3v29 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r4v18 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0113: PHI (r5v21 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0131 A[PHI: r3 r4 r5
  0x0131: PHI (r3v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r4v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r5v20 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x014b A[PHI: r3 r4 r5
  0x014b: PHI (r3v24 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r4v16 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x014b: PHI (r5v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x016b A[PHI: r3 r4 r5
  0x016b: PHI (r3v22 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r4v15 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x016b: PHI (r5v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x018b A[PHI: r3 r4 r5
  0x018b: PHI (r3v20 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x018b: PHI (r4v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x018b: PHI (r5v15 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x01ab A[PHI: r3 r4 r5
  0x01ab: PHI (r3v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r4v12 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01ab: PHI (r5v13 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01c9 A[PHI: r3 r4 r5
  0x01c9: PHI (r3v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r4v10 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r5v11 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x01e7 A[PHI: r3 r4 r5
  0x01e7: PHI (r3v11 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r4v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r5v9 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0205 A[PHI: r3 r4 r5
  0x0205: PHI (r3v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0205: PHI (r4v7 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0205: PHI (r5v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0225 A[PHI: r3 r4 r5
  0x0225: PHI (r3v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0225: PHI (r4v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0225: PHI (r5v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0255  */
    /* JADX WARN: Code duplicated, block: B:47:0x0259 A[PHI: r3 r4 r5
  0x0259: PHI (r3v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v45 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0259: PHI (r4v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0259: PHI (r5v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r5v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r5v33 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        int i;
        CallTracer callTracer;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 55;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = this.write;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.IconCompatParcelizer;
            switch (i5) {
                case 0:
                    TwoFaRepository twoFaRepository = new TwoFaRepository((requestGeofenceRefreshlambda2) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (lottieComposition) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (BrazeExternalSyntheticLambda5) requestGeofencesInitializationlambda0.IconCompatParcelizer.write());
                    i = MediaBrowserCompatMediaItem + 65;
                    read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i6 = 35 / 0;
                    }
                    return twoFaRepository;
                case 1:
                    Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                    objWrite.getClass();
                    Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite2.getClass();
                    return new launchDeeplinkMain((GetUserAuthStateImpl) objWrite, (GetRiderStatusImpl) objWrite2, (GetAppStateImpl) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 2:
                    return new PhoneValidationUseCase((PhoneValidationRepository) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AccountCreationLogger) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 3:
                    return new setPlayStoreKidsComplianceInDelay((RectManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AddRiderHiringQueryParamsImpl) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (accessgetOldDependencyp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 4:
                    return new C$b((NetworkBody) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AccountCreationLogger) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getOrNull) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 5:
                    GetRiderStateImpl getRiderStateImpl = (GetRiderStateImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite3.getClass();
                    Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite4.getClass();
                    return new setOnEventTrackingSucceededListener(getRiderStateImpl, (GetShiftInfoImpl) objWrite3, (getContentViewGroupParentLayout) objWrite4);
                case 6:
                    FormBody.Builder builder = (FormBody.Builder) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite5.getClass();
                    Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite6.getClass();
                    return new GetCashBlockUiState(builder, (GetShiftInfoImpl) objWrite5, (CachedDeliveryRepository) objWrite6);
                case 7:
                    Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                    objWrite7.getClass();
                    Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite8.getClass();
                    return new GetRiderStateImpl((GetCourierShiftInfoImpl) objWrite7, (isOpenInternalroom_runtime) objWrite8, (GetRiderStatusImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 8:
                    Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite9.getClass();
                    getPageSize getpagesize = (getPageSize) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
                    return new incrementSequenceForEvent(r8lambdaktwlyipskq3tfa9ey3gatonixfq3, (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite9, getpagesize);
                case 9:
                    Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                    lazySerializer.getClass();
                    accessisMainThread accessismainthread = (accessisMainThread) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite10.getClass();
                    return new onThirdPartySharingSettingsRead(lazySerializer, accessismainthread, (isOpenInternalroom_runtime) objWrite10);
                case 10:
                    Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                    objWrite11.getClass();
                    r8lambda0tFkXN0c4UQsJxVxyejUo1BomY r8lambda0tfkxn0c4uqsjxvxyejuo1bomy = (r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite12.getClass();
                    return new CombinedScopeView((GetRiderStatusImpl) objWrite11, r8lambda0tfkxn0c4uqsjxvxyejuo1bomy, (dispatchChildDetached) objWrite12, 20);
                case 11:
                    return new ComponentRegistry$Builder((accesssetShouldRequestFrameworkListenToNetworkUpdatescp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getActionViewIntentlambda0) ((setPresentationView) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AndroidUiDispatcherCompanioncurrentThread1) applyPendingRuntimeConfigurationlambda01.RemoteActionCompatParcelizer.write(), (isMainThread) areCachedContentCardsStalelambda0.serializer.write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 12:
                    Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                    objWrite13.getClass();
                    BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206 = (BrazeExternalSyntheticLambda206) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    JsonObjectSerializer jsonObjectSerializer = new JsonObjectSerializer((byte) 0, 2);
                    Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite14.getClass();
                    callTracer = new CallTracer((Application) objWrite13, brazeExternalSyntheticLambda206, jsonObjectSerializer, (subscribeToNetworkFailureslambda0) objWrite14);
                    i2 = read + 33;
                    MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return callTracer;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                case 13:
                    return new BrazeExternalSyntheticLambda45((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (BrazeExternalSyntheticLambda36) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 14:
                    return new WebViewInitializer((OkHttpCall$1) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 15:
                    SharedResourcePool sharedResourcePool = (SharedResourcePool) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite15.getClass();
                    Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite16.getClass();
                    return new r8lambda93S_WWydVO4tgS0mQqqSoxDXifE(sharedResourcePool, (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) objWrite15, (setTransactionSuccessful) objWrite16);
                default:
                    JsonObjectSerializer jsonObjectSerializer2 = (JsonObjectSerializer) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                    Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite17.getClass();
                    Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite18.getClass();
                    return new CombinedScopeView(jsonObjectSerializer2, (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) objWrite17, (setTransactionSuccessful) objWrite18, 23);
            }
        }
        int i7 = this.write;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.IconCompatParcelizer;
        int i8 = 79 / 0;
        switch (i7) {
            case 0:
                TwoFaRepository twoFaRepository2 = new TwoFaRepository((requestGeofenceRefreshlambda2) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (lottieComposition) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (BrazeExternalSyntheticLambda5) requestGeofencesInitializationlambda0.IconCompatParcelizer.write());
                i = MediaBrowserCompatMediaItem + 65;
                read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i9 = 35 / 0;
                }
                return twoFaRepository2;
            case 1:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite20.getClass();
                return new launchDeeplinkMain((GetUserAuthStateImpl) objWrite19, (GetRiderStatusImpl) objWrite20, (GetAppStateImpl) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 2:
                return new PhoneValidationUseCase((PhoneValidationRepository) ((q0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (boundingRectInRoot) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AccountCreationLogger) ((r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                return new setPlayStoreKidsComplianceInDelay((RectManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AddRiderHiringQueryParamsImpl) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (accessgetOldDependencyp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 4:
                return new C$b((NetworkBody) ((newTransaction) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AccountCreationLogger) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getOrNull) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 5:
                GetRiderStateImpl getRiderStateImpl2 = (GetRiderStateImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new setOnEventTrackingSucceededListener(getRiderStateImpl2, (GetShiftInfoImpl) objWrite21, (getContentViewGroupParentLayout) objWrite22);
            case 6:
                FormBody.Builder builder2 = (FormBody.Builder) ((transactionWithResultsuspendImpl) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new GetCashBlockUiState(builder2, (GetShiftInfoImpl) objWrite23, (CachedDeliveryRepository) objWrite24);
            case 7:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                return new GetRiderStateImpl((GetCourierShiftInfoImpl) objWrite25, (isOpenInternalroom_runtime) objWrite26, (GetRiderStatusImpl) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                getPageSize getpagesize2 = (getPageSize) ((postAnimationRunner) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
                return new incrementSequenceForEvent(r8lambdaktwlyipskq3tfa9ey3gatonixfq3, (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) objWrite27, getpagesize2);
            case 9:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer2.getClass();
                accessisMainThread accessismainthread2 = (accessisMainThread) ((r8lambdazvX83UIDsL68vmN7rPQXcY0mE) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite110 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite110.getClass();
                return new onThirdPartySharingSettingsRead(lazySerializer2, accessismainthread2, (isOpenInternalroom_runtime) objWrite110);
            case 10:
                Object objWrite111 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite111.getClass();
                r8lambda0tFkXN0c4UQsJxVxyejUo1BomY r8lambda0tfkxn0c4uqsjxvxyejuo1bomy2 = (r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite112 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite112.getClass();
                return new CombinedScopeView((GetRiderStatusImpl) objWrite111, r8lambda0tfkxn0c4uqsjxvxyejuo1bomy2, (dispatchChildDetached) objWrite112, 20);
            case 11:
                return new ComponentRegistry$Builder((accesssetShouldRequestFrameworkListenToNetworkUpdatescp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getActionViewIntentlambda0) ((setPresentationView) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (AndroidUiDispatcherCompanioncurrentThread1) applyPendingRuntimeConfigurationlambda01.RemoteActionCompatParcelizer.write(), (isMainThread) areCachedContentCardsStalelambda0.serializer.write(), (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 12:
                Object objWrite113 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite113.getClass();
                BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda207 = (BrazeExternalSyntheticLambda206) ((backgroundTimerFiredI) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                JsonObjectSerializer jsonObjectSerializer3 = new JsonObjectSerializer((byte) 0, 2);
                Object objWrite114 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite114.getClass();
                callTracer = new CallTracer((Application) objWrite113, brazeExternalSyntheticLambda207, jsonObjectSerializer3, (subscribeToNetworkFailureslambda0) objWrite114);
                i2 = read + 33;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return callTracer;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            case 13:
                return new BrazeExternalSyntheticLambda45((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (BrazeExternalSyntheticLambda36) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 14:
                return new WebViewInitializer((OkHttpCall$1) ((elambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (getAllSemanticsNodesToMap) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 15:
                SharedResourcePool sharedResourcePool2 = (SharedResourcePool) ((publishErrorlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite115 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite115.getClass();
                Object objWrite116 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite116.getClass();
                return new r8lambda93S_WWydVO4tgS0mQqqSoxDXifE(sharedResourcePool2, (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) objWrite115, (setTransactionSuccessful) objWrite116);
            default:
                JsonObjectSerializer jsonObjectSerializer4 = (JsonObjectSerializer) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
                Object objWrite117 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite117.getClass();
                Object objWrite118 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite118.getClass();
                return new CombinedScopeView(jsonObjectSerializer4, (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) objWrite117, (setTransactionSuccessful) objWrite118, 23);
        }
    }
}
