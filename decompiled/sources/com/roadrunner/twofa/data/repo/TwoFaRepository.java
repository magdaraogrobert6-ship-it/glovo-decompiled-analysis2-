package com.roadrunner.twofa.data.repo;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BrazeExternalSyntheticLambda5;
import o.getCieXyz;
import o.isItemDismissable;
import o.lottieComposition;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.requestGeofenceRefreshlambda2;
import o.requestImmediateDataFlushlambda0;
import o.setGoogleAdvertisingIdlambda1;
import o.setSdkAuthenticationSignaturelambda0;
import o.setSdkAuthenticationSignaturelambda10;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class TwoFaRepository {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public final BrazeExternalSyntheticLambda5 RemoteActionCompatParcelizer;
    public final requestGeofenceRefreshlambda2 read;
    public final ExecuteApiRequest serializer;
    public final lottieComposition write;

    public TwoFaRepository(requestGeofenceRefreshlambda2 requestgeofencerefreshlambda2, ExecuteApiRequest executeApiRequest, lottieComposition lottiecomposition, BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5) {
        requestgeofencerefreshlambda2.getClass();
        executeApiRequest.getClass();
        lottiecomposition.getClass();
        brazeExternalSyntheticLambda5.getClass();
        this.read = requestgeofencerefreshlambda2;
        this.serializer = executeApiRequest;
        this.write = lottiecomposition;
        this.RemoteActionCompatParcelizer = brazeExternalSyntheticLambda5;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v19 com.roadrunner.twofa.data.repo.TwoFaRepository$triggerFaCode$1) = 
  (r1v18 com.roadrunner.twofa.data.repo.TwoFaRepository$triggerFaCode$1)
  (r1v21 com.roadrunner.twofa.data.repo.TwoFaRepository$triggerFaCode$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v6 int) = (r4v5 int), (r4v8 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: triggerFaCode-0E7RQCE$implementation, reason: not valid java name */
    public final Object m5072triggerFaCode0E7RQCE$implementation(String str, String str2, ContinuationImpl continuationImpl) {
        TwoFaRepository$triggerFaCode$1 twoFaRepository$triggerFaCode$1;
        Object objM4875invokegIAlus;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof TwoFaRepository$triggerFaCode$1) {
            int i3 = IconCompatParcelizer + 3;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                twoFaRepository$triggerFaCode$1 = (TwoFaRepository$triggerFaCode$1) continuationImpl;
                i = twoFaRepository$triggerFaCode$1.write;
                int i4 = 86 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    twoFaRepository$triggerFaCode$1.write = i - Integer.MIN_VALUE;
                } else {
                    twoFaRepository$triggerFaCode$1 = new TwoFaRepository$triggerFaCode$1(this, continuationImpl);
                }
            } else {
                twoFaRepository$triggerFaCode$1 = (TwoFaRepository$triggerFaCode$1) continuationImpl;
                i = twoFaRepository$triggerFaCode$1.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    twoFaRepository$triggerFaCode$1.write = i - Integer.MIN_VALUE;
                } else {
                    twoFaRepository$triggerFaCode$1 = new TwoFaRepository$triggerFaCode$1(this, continuationImpl);
                }
            }
        } else {
            twoFaRepository$triggerFaCode$1 = new TwoFaRepository$triggerFaCode$1(this, continuationImpl);
        }
        Object obj = twoFaRepository$triggerFaCode$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = twoFaRepository$triggerFaCode$1.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.getClass();
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, str2, str, null, 20);
            twoFaRepository$triggerFaCode$1.RemoteActionCompatParcelizer = str;
            twoFaRepository$triggerFaCode$1.write = 1;
            objM4875invokegIAlus = this.serializer.m4875invokegIAlus(anonymousClass2, twoFaRepository$triggerFaCode$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                int i6 = MediaMetadataCompat + 85;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = MediaMetadataCompat + 55;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            str = twoFaRepository$triggerFaCode$1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        boolean z = objM4875invokegIAlus instanceof isItemDismissable;
        if (!z) {
            requestImmediateDataFlushlambda0 requestimmediatedataflushlambda0 = (requestImmediateDataFlushlambda0) objM4875invokegIAlus;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m("triggerFaCode: API request succeed for flowId=", requestimmediatedataflushlambda0.flowId, " - status=", requestimmediatedataflushlambda0.status), new Object[0]);
            int i10 = MediaMetadataCompat + 105;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            int i12 = MediaMetadataCompat + 123;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("triggerFaCode: API request failed for flowId=", str), new Object[0]);
        }
        if (!z) {
            try {
                requestImmediateDataFlushlambda0 requestimmediatedataflushlambda1 = (requestImmediateDataFlushlambda0) objM4875invokegIAlus;
                this.RemoteActionCompatParcelizer.getClass();
                requestimmediatedataflushlambda1.getClass();
                String str3 = requestimmediatedataflushlambda1.status;
                objM4875invokegIAlus = new setSdkAuthenticationSignaturelambda10(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "otp_code_required"}, getCieXyz.write())).booleanValue() ? setGoogleAdvertisingIdlambda1.read : new setSdkAuthenticationSignaturelambda0(str3), requestimmediatedataflushlambda1.flowId, requestimmediatedataflushlambda1.expiresAt);
            } catch (Throwable th) {
                objM4875invokegIAlus = new isItemDismissable(th);
            }
        }
        Throwable thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer2 != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer2, "triggerFaCode: failed to map api response to domain model", new Object[0]);
        }
        return objM4875invokegIAlus;
    }
}
