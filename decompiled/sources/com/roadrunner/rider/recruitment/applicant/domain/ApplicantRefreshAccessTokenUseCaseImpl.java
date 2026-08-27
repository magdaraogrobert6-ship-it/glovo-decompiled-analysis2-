package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.WebRefreshAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler45;
import o.ActivityHandler49;
import o.ActivityHandler50;
import o.ActivityHandler7;
import o.SemanticsPropertiesContentDataType1;
import o.createFromParcel;
import o.getTraversalIndex;
import o.isItemDismissable;
import o.onItemDismiss;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantRefreshAccessTokenUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final ApplicantRepository IconCompatParcelizer;
    public final WebRefreshAccessTokenUseCaseImpl serializer;

    public ApplicantRefreshAccessTokenUseCaseImpl(WebRefreshAccessTokenUseCaseImpl webRefreshAccessTokenUseCaseImpl, ApplicantRepository applicantRepository) {
        this.serializer = webRefreshAccessTokenUseCaseImpl;
        this.IconCompatParcelizer = applicantRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[PHI: r1 r4
  0x0032: PHI (r1v13 com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl$invoke$1) = 
  (r1v12 com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl$invoke$1)
  (r1v15 com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl$invoke$1)
 binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v10 int) = (r4v9 int), (r4v12 int) binds: [B:10:0x0030, B:7:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m5021invokeIoAF18A(ContinuationImpl continuationImpl) {
        ApplicantRefreshAccessTokenUseCaseImpl$invoke$1 applicantRefreshAccessTokenUseCaseImpl$invoke$1;
        Object obj;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        Object objM5020callRefreshApigIAlus;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        Object obj2;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 63;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 0;
        if (continuationImpl instanceof ApplicantRefreshAccessTokenUseCaseImpl$invoke$1) {
            int i7 = i3 + 63;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                applicantRefreshAccessTokenUseCaseImpl$invoke$1 = (ApplicantRefreshAccessTokenUseCaseImpl$invoke$1) continuationImpl;
                i = applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer;
                int i8 = 54 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = i - Integer.MIN_VALUE;
                } else {
                    applicantRefreshAccessTokenUseCaseImpl$invoke$1 = new ApplicantRefreshAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
                }
            } else {
                applicantRefreshAccessTokenUseCaseImpl$invoke$1 = (ApplicantRefreshAccessTokenUseCaseImpl$invoke$1) continuationImpl;
                i = applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = i - Integer.MIN_VALUE;
                } else {
                    applicantRefreshAccessTokenUseCaseImpl$invoke$1 = new ApplicantRefreshAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
                }
            }
        } else {
            applicantRefreshAccessTokenUseCaseImpl$invoke$1 = new ApplicantRefreshAccessTokenUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object objIconCompatParcelizer = applicantRefreshAccessTokenUseCaseImpl$invoke$1.read;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = 1;
            objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(applicantRefreshAccessTokenUseCaseImpl$invoke$1);
            if (objIconCompatParcelizer != obj3) {
            }
            return obj3;
        }
        if (i9 != 1) {
            int i10 = RemoteActionCompatParcelizer + 87;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i9 != 2) {
                if (i9 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                setcustominappmessageanimationfactorylambda1 = applicantRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
                    obj2 = ((onItemDismiss) objIconCompatParcelizer).IconCompatParcelizer;
                    int i12 = read + 63;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    if (!(obj2 instanceof isItemDismissable)) {
                        int i14 = read + 111;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        obj2 = createFromParcel.INSTANCE;
                    }
                    setcustominappmessageanimationfactorylambda1.write(null);
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
                    setcustominappmessageanimationfactorylambda0.write(null);
                    throw th;
                }
            }
            i6 = applicantRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer;
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = applicantRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            obj = applicantRefreshAccessTokenUseCaseImpl$invoke$1.write;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
            try {
                ActivityHandler45 activityHandler45 = ((ActivityHandler50) obj).IconCompatParcelizer;
                applicantRefreshAccessTokenUseCaseImpl$invoke$1.write = null;
                applicantRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
                applicantRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer = i6;
                applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = 3;
                objM5020callRefreshApigIAlus = m5020callRefreshApigIAlus(activityHandler45, applicantRefreshAccessTokenUseCaseImpl$invoke$1);
                if (objM5020callRefreshApigIAlus != obj3) {
                    setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                    obj2 = objM5020callRefreshApigIAlus;
                    if (!(obj2 instanceof isItemDismissable)) {
                        int i16 = read + 111;
                        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        obj2 = createFromParcel.INSTANCE;
                    }
                    setcustominappmessageanimationfactorylambda1.write(null);
                    return obj2;
                }
                return obj3;
            } catch (Throwable th2) {
                th = th2;
                setcustominappmessageanimationfactorylambda0.write(null);
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        int i18 = read + 59;
        RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        obj = (ActivityHandler49) objIconCompatParcelizer;
        if (!(obj instanceof ActivityHandler50)) {
            return new isItemDismissable(new NoApplicantDataException());
        }
        setcustominappmessageanimationfactorylambda0 = ActivityHandler7.read;
        applicantRefreshAccessTokenUseCaseImpl$invoke$1.write = (ActivityHandler50) obj;
        applicantRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
        applicantRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer = 0;
        applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = 2;
        if (setcustominappmessageanimationfactorylambda0.lock(applicantRefreshAccessTokenUseCaseImpl$invoke$1) != obj3) {
            ActivityHandler45 activityHandler46 = ((ActivityHandler50) obj).IconCompatParcelizer;
            applicantRefreshAccessTokenUseCaseImpl$invoke$1.write = null;
            applicantRefreshAccessTokenUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = setcustominappmessageanimationfactorylambda0;
            applicantRefreshAccessTokenUseCaseImpl$invoke$1.IconCompatParcelizer = i6;
            applicantRefreshAccessTokenUseCaseImpl$invoke$1.serializer = 3;
            objM5020callRefreshApigIAlus = m5020callRefreshApigIAlus(activityHandler46, applicantRefreshAccessTokenUseCaseImpl$invoke$1);
            if (objM5020callRefreshApigIAlus != obj3) {
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                obj2 = objM5020callRefreshApigIAlus;
                if (!(obj2 instanceof isItemDismissable)) {
                    int i110 = read + 111;
                    RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    obj2 = createFromParcel.INSTANCE;
                }
                setcustominappmessageanimationfactorylambda1.write(null);
                return obj2;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX INFO: renamed from: callRefreshApi-gIAlu-s, reason: not valid java name */
    public final Object m5020callRefreshApigIAlus(ActivityHandler45 activityHandler45, ContinuationImpl continuationImpl) {
        ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1 applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1;
        int i;
        Object objM4871invokegIAlus;
        ActivityHandler45 activityHandler46 = activityHandler45;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 75;
        int i4 = i3 % Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        if (continuationImpl instanceof ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1) {
            int i6 = i4 + 33;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1 = (ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1) continuationImpl;
            int i8 = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.RemoteActionCompatParcelizer;
            if ((i8 & Integer.MIN_VALUE) == 0) {
                applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1 = new ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1(this, continuationImpl);
            } else {
                int i9 = read + 75;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.RemoteActionCompatParcelizer = i9 % 2 == 0 ? i8 % Integer.MIN_VALUE : i8 - Integer.MIN_VALUE;
            }
        } else {
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1 = new ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1(this, continuationImpl);
        }
        Object obj = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            String str = activityHandler46.userId;
            if (str != null) {
                getTraversalIndex gettraversalindex = new getTraversalIndex(activityHandler46.accessToken, activityHandler46.refreshToken, activityHandler46.deviceToken, activityHandler46.countryCode, str);
                applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.write = activityHandler46;
                i = 0;
                applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.read = 0;
                applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.RemoteActionCompatParcelizer = 1;
                objM4871invokegIAlus = this.serializer.m4871invokegIAlus(gettraversalindex, applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1);
                if (objM4871invokegIAlus != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("user id should not be empty");
            return null;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Object obj3 = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i11 = RemoteActionCompatParcelizer + 55;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    return obj3;
                }
                obj2.hashCode();
                throw null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i12 = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.read;
        ActivityHandler45 activityHandler47 = applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.write;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        objM4871invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        i = i12;
        activityHandler46 = activityHandler47;
        if (!(objM4871invokegIAlus instanceof isItemDismissable)) {
            SemanticsPropertiesContentDataType1 semanticsPropertiesContentDataType1 = (SemanticsPropertiesContentDataType1) objM4871invokegIAlus;
            String str2 = semanticsPropertiesContentDataType1.RemoteActionCompatParcelizer;
            String str3 = semanticsPropertiesContentDataType1.read;
            long j = semanticsPropertiesContentDataType1.write;
            String str4 = activityHandler46.deviceToken;
            String str5 = activityHandler46.countryCode;
            String str6 = activityHandler46.userId;
            str2.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ActivityHandler45 activityHandler48 = new ActivityHandler45(j, str2, str3, str4, str5, str6);
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.write = null;
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.serializer = objM4871invokegIAlus;
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.read = i;
            applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1.RemoteActionCompatParcelizer = 2;
            if (this.IconCompatParcelizer.storeApplicantData(activityHandler48, applicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return objM4871invokegIAlus;
    }
}
