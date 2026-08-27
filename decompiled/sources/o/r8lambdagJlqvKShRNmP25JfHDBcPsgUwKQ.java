package o;

import android.content.SharedPreferences;
import com.google.android.play.core.appupdate.zzz;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.roadrunner.sidemenu.data.SideMenuApiRequest;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.socket.parser.IOParser$Decoder;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.read = 9;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = dataModule_ProvideSchedulerFactory;
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public /* synthetic */ r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.read = i;
        this.write = mergejsonobjects;
        this.serializer = getcolorintegerornulllambda0;
    }

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.read = 2;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.write = requestbannersrefreshlambda1;
    }

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, BrazeExternalSyntheticLambda102 brazeExternalSyntheticLambda102) {
        this.read = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = brazeExternalSyntheticLambda102;
    }

    public /* synthetic */ r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, int i) {
        this.read = i;
        this.serializer = getcolorintegerornulllambda0;
        this.write = mergejsonobjects;
    }

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.read = 11;
        convertstringjsonarraytolistlambda0.getClass();
        this.serializer = convertstringjsonarraytolistlambda0;
        this.write = requestbannersrefreshlambda1;
    }

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(AbsSavedState absSavedState, setPresentationView setpresentationview) {
        this.read = 1;
        setpresentationview.getClass();
        this.serializer = absSavedState;
        this.write = setpresentationview;
    }

    public r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda1I3YS3_7pQ_FD_2NPTSrgkvgkj8 r8lambda1i3ys3_7pq_fd_2nptsrgkvgkj8) {
        this.read = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambda1i3ys3_7pq_fd_2nptsrgkvgkj8;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r3 r4
  0x0028: PHI (r3v32 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v26 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003e A[PHI: r3 r4
  0x003e: PHI (r3v30 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r4v25 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[PHI: r3 r4
  0x0055: PHI (r3v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r4v23 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x006a A[PHI: r3 r4
  0x006a: PHI (r3v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r4v21 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0081 A[PHI: r3 r4
  0x0081: PHI (r3v24 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r4v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1 A[PHI: r3 r4
  0x00a1: PHI (r3v22 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00a1: PHI (r4v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x00b7 A[PHI: r3 r4
  0x00b7: PHI (r3v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r4v15 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d7 A[PHI: r3 r4
  0x00d7: PHI (r3v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00d7: PHI (r4v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6 A[PHI: r3 r4
  0x00f6: PHI (r3v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x00f6: PHI (r4v10 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0118 A[PHI: r3 r4
  0x0118: PHI (r3v12 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r4v9 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x012f A[PHI: r3 r4
  0x012f: PHI (r3v9 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x012f: PHI (r4v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0148 A[PHI: r3 r4
  0x0148: PHI (r3v6 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0148: PHI (r4v5 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x016d A[PHI: r3 r4
  0x016d: PHI (r3v4 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x016d: PHI (r4v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0183 A[PHI: r3 r4
  0x0183: PHI (r3v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r3v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r3v34 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0183: PHI (r4v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        BrazeExternalSyntheticLambda26 brazeExternalSyntheticLambda26;
        int i;
        SharedPreferences sharedPreferences;
        ColorFilter colorFilterIconCompatParcelizer;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.read;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
            switch (i4) {
                case 0:
                    return new SideMenuApiRequest((r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 1:
                    GetShiftInfoImpl getShiftInfoImpl = (GetShiftInfoImpl) ((AbsSavedState) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    AndroidUiFrameClock androidUiFrameClock = new AndroidUiFrameClock();
                    Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite.getClass();
                    GetCourierShiftInfoImpl getCourierShiftInfoImpl = new GetCourierShiftInfoImpl(getShiftInfoImpl, androidUiFrameClock, (isOpenInternalroom_runtime) objWrite);
                    int i5 = IconCompatParcelizer + 123;
                    RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return getCourierShiftInfoImpl;
                case 2:
                    Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite2.getClass();
                    return new H$b((ExecuteApiRequest) objWrite2, 27, (getPlayAdId) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 3:
                    Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite3.getClass();
                    return new getDeeplinkClickTime((NestComponentRepositoryImpl) objWrite3, (IOParser$Decoder) ((BrazeExternalSyntheticLambda102) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 4:
                    return new getStoreIdFromSystem(new ImageHeaderParserImageType(), (hasSameLayoutAffectingAttributesui_text) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (zzz) ((r8lambdawMZ4b3qLWvwGdmRM_auBcG267s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), new isMainThread(23));
                case 5:
                    Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite4.getClass();
                    sharedPreferences = (SharedPreferences) objWrite4;
                    colorFilterIconCompatParcelizer = r8lambda1q5riADFSy6QpAecZLRUmwRBfhY.IconCompatParcelizer((r8lambda1q5riADFSy6QpAecZLRUmwRBfhY) ((r8lambda1I3YS3_7pQ_FD_2NPTSrgkvgkj8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                    if (colorFilterIconCompatParcelizer == null) {
                        return sharedPreferences;
                    }
                    return new distanceRemainingFormatter(sharedPreferences, colorFilterIconCompatParcelizer);
                case 6:
                    SideMenuRepository sideMenuRepository = (SideMenuRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    sideMenuRepository.getClass();
                    saveHeatmapUrlImpl.getClass();
                    OkHttpCall$1 okHttpCall$1 = new OkHttpCall$1(0);
                    okHttpCall$1.write = sideMenuRepository;
                    okHttpCall$1.serializer = saveHeatmapUrlImpl;
                    return okHttpCall$1;
                case 7:
                    return new addSerializedCardJsonToStoragelambda10((CombinedScopeView) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (removeRearDisplayPresentationStatusListener) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 8:
                    handleInternalBannerRefreshlambda0 handleinternalbannerrefreshlambda0 = (handleInternalBannerRefreshlambda0) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                    handleinternalbannerrefreshlambda0.getClass();
                    executeApiRequest.getClass();
                    OkHttpCall$1 okHttpCall$2 = new OkHttpCall$1(0);
                    okHttpCall$2.write = handleinternalbannerrefreshlambda0;
                    okHttpCall$2.serializer = executeApiRequest;
                    return okHttpCall$2;
                case 9:
                    unpackMetaLastChildOffset unpackmetalastchildoffset = (unpackMetaLastChildOffset) ((com.data.injection.DataModule_ProvideSchedulerFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                    Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite5.getClass();
                    return new openSessionlambda1(unpackmetalastchildoffset, (transferSessionPackageI) objWrite5);
                case 10:
                    return retryInAppMessagelambda0.RemoteActionCompatParcelizer((RectListDebuggerModifierNodeonAttach1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (RectListDebugger) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
                case 11:
                    Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                    objWrite6.getClass();
                    return new OkHttpCall$1((subscribeToBannersUpdateslambda2) objWrite6, (SharedResourcePool) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                case 12:
                    return new setPackageHandlerBackoffStrategy((waitForUserDependencyThreadlambda1) ((convertStringJsonArrayToListlambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                default:
                    brazeExternalSyntheticLambda26 = new BrazeExternalSyntheticLambda26((BrazeExternalSyntheticLambda206) ((convertStringJsonArrayToListlambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                    i = IconCompatParcelizer + 105;
                    RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return brazeExternalSyntheticLambda26;
                    }
                    throw null;
            }
        }
        int i7 = this.read;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        int i8 = 9 / 0;
        switch (i7) {
            case 0:
                return new SideMenuApiRequest((r8lambdagpLBn0UAaZB2mYgQ2Phh4H1kOk) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 1:
                GetShiftInfoImpl getShiftInfoImpl2 = (GetShiftInfoImpl) ((AbsSavedState) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                AndroidUiFrameClock androidUiFrameClock2 = new AndroidUiFrameClock();
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                GetCourierShiftInfoImpl getCourierShiftInfoImpl2 = new GetCourierShiftInfoImpl(getShiftInfoImpl2, androidUiFrameClock2, (isOpenInternalroom_runtime) objWrite7);
                int i9 = IconCompatParcelizer + 123;
                RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return getCourierShiftInfoImpl2;
            case 2:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite8.getClass();
                return new H$b((ExecuteApiRequest) objWrite8, 27, (getPlayAdId) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                return new getDeeplinkClickTime((NestComponentRepositoryImpl) objWrite9, (IOParser$Decoder) ((BrazeExternalSyntheticLambda102) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 4:
                return new getStoreIdFromSystem(new ImageHeaderParserImageType(), (hasSameLayoutAffectingAttributesui_text) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (zzz) ((r8lambdawMZ4b3qLWvwGdmRM_auBcG267s) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), new isMainThread(23));
            case 5:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite10.getClass();
                sharedPreferences = (SharedPreferences) objWrite10;
                colorFilterIconCompatParcelizer = r8lambda1q5riADFSy6QpAecZLRUmwRBfhY.IconCompatParcelizer((r8lambda1q5riADFSy6QpAecZLRUmwRBfhY) ((r8lambda1I3YS3_7pQ_FD_2NPTSrgkvgkj8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                if (colorFilterIconCompatParcelizer == null) {
                    return sharedPreferences;
                }
                return new distanceRemainingFormatter(sharedPreferences, colorFilterIconCompatParcelizer);
            case 6:
                SideMenuRepository sideMenuRepository2 = (SideMenuRepository) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                SaveHeatmapUrlImpl saveHeatmapUrlImpl2 = (SaveHeatmapUrlImpl) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                sideMenuRepository2.getClass();
                saveHeatmapUrlImpl2.getClass();
                OkHttpCall$1 okHttpCall$3 = new OkHttpCall$1(0);
                okHttpCall$3.write = sideMenuRepository2;
                okHttpCall$3.serializer = saveHeatmapUrlImpl2;
                return okHttpCall$3;
            case 7:
                return new addSerializedCardJsonToStoragelambda10((CombinedScopeView) ((SharedPreferencesMigration) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (removeRearDisplayPresentationStatusListener) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 8:
                handleInternalBannerRefreshlambda0 handleinternalbannerrefreshlambda1 = (handleInternalBannerRefreshlambda0) ((requestSingleLocationUpdatelambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                ExecuteApiRequest executeApiRequest2 = (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                handleinternalbannerrefreshlambda1.getClass();
                executeApiRequest2.getClass();
                OkHttpCall$1 okHttpCall$4 = new OkHttpCall$1(0);
                okHttpCall$4.write = handleinternalbannerrefreshlambda1;
                okHttpCall$4.serializer = executeApiRequest2;
                return okHttpCall$4;
            case 9:
                unpackMetaLastChildOffset unpackmetalastchildoffset2 = (unpackMetaLastChildOffset) ((com.data.injection.DataModule_ProvideSchedulerFactory) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new openSessionlambda1(unpackmetalastchildoffset2, (transferSessionPackageI) objWrite11);
            case 10:
                return retryInAppMessagelambda0.RemoteActionCompatParcelizer((RectListDebuggerModifierNodeonAttach1) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (RectListDebugger) ((setStateDescription) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 11:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite12.getClass();
                return new OkHttpCall$1((subscribeToBannersUpdateslambda2) objWrite12, (SharedResourcePool) ((requestBannersRefreshlambda1) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 12:
                return new setPackageHandlerBackoffStrategy((waitForUserDependencyThreadlambda1) ((convertStringJsonArrayToListlambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (ExecuteApiRequest) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            default:
                brazeExternalSyntheticLambda26 = new BrazeExternalSyntheticLambda26((BrazeExternalSyntheticLambda206) ((convertStringJsonArrayToListlambda0) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                i = IconCompatParcelizer + 105;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return brazeExternalSyntheticLambda26;
                }
                throw null;
        }
    }
}
