package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.logger.MultipleCodeScanEventLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.logger.QrPaymentEventLoggerImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.delivery.repository.StateV3DeliveryProvider;
import com.roadrunner.face.verification.data.SelfieFlowRepository;
import com.roadrunner.face.verification.domain.CheckSelfieStatusUseCaseImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreImpl;
import com.roadrunner.freelancing.data.GoAndStartRepository;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.helpcenter.businessmetrics.repo.BusinessMetricsRepository;
import com.roadrunner.push.tokenregistry.data.api.TokenRegistryApiRequest;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleProcessDataStore implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects write;

    public /* synthetic */ SingleProcessDataStore(mergeJsonObjects mergejsonobjects, int i) {
        this.IconCompatParcelizer = i;
        this.write = mergejsonobjects;
    }

    public /* synthetic */ SingleProcessDataStore(Object obj, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, int i) {
        this.IconCompatParcelizer = i;
        this.write = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[PHI: r5
  0x0027: PHI (r5v30 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[PHI: r5
  0x0036: PHI (r5v29 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[PHI: r5
  0x0045: PHI (r5v28 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[PHI: r5
  0x0054: PHI (r5v27 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r5
  0x0060: PHI (r5v26 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006c A[PHI: r5
  0x006c: PHI (r5v25 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b A[PHI: r5
  0x007b: PHI (r5v24 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x008a A[PHI: r5
  0x008a: PHI (r5v23 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0099 A[PHI: r5
  0x0099: PHI (r5v22 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[PHI: r5
  0x00a8: PHI (r5v21 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4 A[PHI: r5
  0x00b4: PHI (r5v20 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[PHI: r5
  0x00c0: PHI (r5v19 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[PHI: r5
  0x00cc: PHI (r5v18 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00db A[PHI: r5
  0x00db: PHI (r5v17 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[PHI: r5
  0x00e7: PHI (r5v16 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6 A[PHI: r5
  0x00f6: PHI (r5v15 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[PHI: r5
  0x0105: PHI (r5v14 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0119 A[PHI: r5
  0x0119: PHI (r5v13 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0135 A[PHI: r5
  0x0135: PHI (r5v12 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0141 A[PHI: r5
  0x0141: PHI (r5v11 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x014d A[PHI: r5
  0x014d: PHI (r5v10 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0159 A[PHI: r5
  0x0159: PHI (r5v9 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0165 A[PHI: r5
  0x0165: PHI (r5v8 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0171 A[PHI: r5
  0x0171: PHI (r5v7 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0186 A[PHI: r5
  0x0186: PHI (r5v6 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0192 A[PHI: r5
  0x0192: PHI (r5v5 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x019e A[PHI: r5
  0x019e: PHI (r5v4 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa A[PHI: r5
  0x01aa: PHI (r5v3 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6 A[PHI: r5
  0x01b6: PHI (r5v2 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5 A[PHI: r5
  0x01c5: PHI (r5v1 o.mergeJsonObjects) = (r5v0 o.mergeJsonObjects), (r5v31 o.mergeJsonObjects) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        mergeJsonObjects mergejsonobjects;
        int i = 2 % 2;
        int i2 = read + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 != 0) {
            int i4 = this.IconCompatParcelizer;
            mergejsonobjects = this.write;
            switch (i4) {
                case 0:
                    Object objWrite = mergejsonobjects.write();
                    objWrite.getClass();
                    return new SaveHeatmapUrlImpl(i3, (CorruptionException) objWrite);
                case 1:
                    return new accessgetHairlinecp((transferSessionPackageI) mergejsonobjects.write());
                case 2:
                    return new MultipleCodeScanEventLoggerImpl((decode) mergejsonobjects.write());
                case 3:
                    return new getLeftD9Ej5fMannotations((transferSessionPackageI) mergejsonobjects.write());
                case 4:
                    return new getLeftD9Ej5fM((EnumColumnAdapter) mergejsonobjects.write());
                case 5:
                    QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl = new QrPaymentEventLoggerImpl((decode) mergejsonobjects.write());
                    int i5 = serializer + 7;
                    read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return qrPaymentEventLoggerImpl;
                case 6:
                    return new remBjo55l4((DeliveryConfirmationLoggerImpl) mergejsonobjects.write());
                case 7:
                    return new getZeronOccac((transferSessionPackageI) mergejsonobjects.write());
                case 8:
                    return new getCenterozmzZPIannotations((transferSessionPackageI) mergejsonobjects.write());
                case 9:
                    return new roundToIntSizeuvyYCjk((isOpenInternalroom_runtime) mergejsonobjects.write());
                case 10:
                    return new MapSafetyReportResponse((isOpenInternalroom_runtime) mergejsonobjects.write(), 2);
                case 11:
                    return new toIntSizeuvyYCjk(new getTransactionExecutor(), new ImageHeaderParserImageType(), new AndroidUiDispatcherCompanioncurrentThread1(6), (transferSessionPackageI) mergejsonobjects.write());
                case 12:
                    getSpannotations getspannotations = new getSpannotations((getEmannotations) mergejsonobjects.write());
                    int i7 = serializer + 1;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return getspannotations;
                case 13:
                    Object objWrite2 = mergejsonobjects.write();
                    objWrite2.getClass();
                    return new CachedDeliveryRepository((StateV3DeliveryProvider) objWrite2);
                case 14:
                    return (mergelambda1) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", mergelambda1.class);
                case 15:
                    return new setDpMargin((TokenRegistryApiRequest) mergejsonobjects.write());
                case 16:
                    return (getMargin) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", getMargin.class);
                case 17:
                    return new setType((Application) mergejsonobjects.write());
                case 18:
                    return new convertReferenceString((verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
                case 19:
                    return new CheckSelfieStatusUseCaseImpl((SelfieFlowRepository) mergejsonobjects.write());
                case 20:
                    return (ConstraintSet) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", ConstraintSet.class);
                case 21:
                    Object objWrite3 = mergejsonobjects.write();
                    objWrite3.getClass();
                    return new GoAndStartDataStoreImpl((cancelAll) objWrite3);
                case 22:
                    Object objWrite4 = mergejsonobjects.write();
                    objWrite4.getClass();
                    return new GoAndStartRepository((GoAndStartDataStoreImpl) objWrite4);
                case 23:
                    Object objWrite5 = mergejsonobjects.write();
                    objWrite5.getClass();
                    return new IconCompat((GetWorkNowOpportunity) objWrite5);
                case 24:
                    return new dump((BusinessMetricsRepository) mergejsonobjects.write(), 1);
                case 25:
                    return new dump((BusinessMetricsRepository) mergejsonobjects.write(), 0);
                case 26:
                    return (SingleProcessDataStoredata11) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", SingleProcessDataStoredata11.class);
                case 27:
                    return (BackStackState) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", BackStackState.class);
                case 28:
                    return (DialogFragment2) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", DialogFragment2.class);
                default:
                    return new getFragmentManager((BrazeExternalSyntheticLambda36) mergejsonobjects.write());
            }
        }
        int i9 = this.IconCompatParcelizer;
        mergejsonobjects = this.write;
        int i10 = 37 / 0;
        switch (i9) {
            case 0:
                Object objWrite6 = mergejsonobjects.write();
                objWrite6.getClass();
                return new SaveHeatmapUrlImpl(i3, (CorruptionException) objWrite6);
            case 1:
                return new accessgetHairlinecp((transferSessionPackageI) mergejsonobjects.write());
            case 2:
                return new MultipleCodeScanEventLoggerImpl((decode) mergejsonobjects.write());
            case 3:
                return new getLeftD9Ej5fMannotations((transferSessionPackageI) mergejsonobjects.write());
            case 4:
                return new getLeftD9Ej5fM((EnumColumnAdapter) mergejsonobjects.write());
            case 5:
                QrPaymentEventLoggerImpl qrPaymentEventLoggerImpl2 = new QrPaymentEventLoggerImpl((decode) mergejsonobjects.write());
                int i11 = serializer + 7;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return qrPaymentEventLoggerImpl2;
            case 6:
                return new remBjo55l4((DeliveryConfirmationLoggerImpl) mergejsonobjects.write());
            case 7:
                return new getZeronOccac((transferSessionPackageI) mergejsonobjects.write());
            case 8:
                return new getCenterozmzZPIannotations((transferSessionPackageI) mergejsonobjects.write());
            case 9:
                return new roundToIntSizeuvyYCjk((isOpenInternalroom_runtime) mergejsonobjects.write());
            case 10:
                return new MapSafetyReportResponse((isOpenInternalroom_runtime) mergejsonobjects.write(), 2);
            case 11:
                return new toIntSizeuvyYCjk(new getTransactionExecutor(), new ImageHeaderParserImageType(), new AndroidUiDispatcherCompanioncurrentThread1(6), (transferSessionPackageI) mergejsonobjects.write());
            case 12:
                getSpannotations getspannotations2 = new getSpannotations((getEmannotations) mergejsonobjects.write());
                int i13 = serializer + 1;
                read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return getspannotations2;
            case 13:
                Object objWrite7 = mergejsonobjects.write();
                objWrite7.getClass();
                return new CachedDeliveryRepository((StateV3DeliveryProvider) objWrite7);
            case 14:
                return (mergelambda1) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", mergelambda1.class);
            case 15:
                return new setDpMargin((TokenRegistryApiRequest) mergejsonobjects.write());
            case 16:
                return (getMargin) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", getMargin.class);
            case 17:
                return new setType((Application) mergejsonobjects.write());
            case 18:
                return new convertReferenceString((verifyAndTrackPlayStorePurchaseI) mergejsonobjects.write());
            case 19:
                return new CheckSelfieStatusUseCaseImpl((SelfieFlowRepository) mergejsonobjects.write());
            case 20:
                return (ConstraintSet) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", ConstraintSet.class);
            case 21:
                Object objWrite8 = mergejsonobjects.write();
                objWrite8.getClass();
                return new GoAndStartDataStoreImpl((cancelAll) objWrite8);
            case 22:
                Object objWrite9 = mergejsonobjects.write();
                objWrite9.getClass();
                return new GoAndStartRepository((GoAndStartDataStoreImpl) objWrite9);
            case 23:
                Object objWrite10 = mergejsonobjects.write();
                objWrite10.getClass();
                return new IconCompat((GetWorkNowOpportunity) objWrite10);
            case 24:
                return new dump((BusinessMetricsRepository) mergejsonobjects.write(), 1);
            case 25:
                return new dump((BusinessMetricsRepository) mergejsonobjects.write(), 0);
            case 26:
                return (SingleProcessDataStoredata11) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", SingleProcessDataStoredata11.class);
            case 27:
                return (BackStackState) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", BackStackState.class);
            case 28:
                return (DialogFragment2) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", DialogFragment2.class);
            default:
                return new getFragmentManager((BrazeExternalSyntheticLambda36) mergejsonobjects.write());
        }
    }
}
