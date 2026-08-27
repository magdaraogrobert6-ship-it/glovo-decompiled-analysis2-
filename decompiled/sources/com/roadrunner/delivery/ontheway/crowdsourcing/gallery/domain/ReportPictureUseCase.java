package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.face.verification.data.SelfieFlowRepository$uploadSelfie$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.OffsetMappingCompanionIdentity1;
import o.ShortNewsContentCardView;
import o.getDefaulteUduSuo;
import o.onItemDismiss;
import o.setComposingText;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportPictureUseCase {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final getDefaulteUduSuo RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final setComposingText serializer;

    public ReportPictureUseCase(setComposingText setcomposingtext, ExecuteApiRequest executeApiRequest, getDefaulteUduSuo getdefaulteudusuo, int i) {
        setcomposingtext.getClass();
        executeApiRequest.getClass();
        getdefaulteudusuo.getClass();
        if (i != 1) {
            this.serializer = setcomposingtext;
            this.read = executeApiRequest;
            this.RemoteActionCompatParcelizer = getdefaulteudusuo;
        } else {
            this.serializer = setcomposingtext;
            this.read = executeApiRequest;
            this.RemoteActionCompatParcelizer = getdefaulteudusuo;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4916invokegIAlus(OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity1, ContinuationImpl continuationImpl) {
        PostPictureVoteUseCase$invoke$1 postPictureVoteUseCase$invoke$1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof PostPictureVoteUseCase$invoke$1) {
            postPictureVoteUseCase$invoke$1 = (PostPictureVoteUseCase$invoke$1) continuationImpl;
            int i4 = postPictureVoteUseCase$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                postPictureVoteUseCase$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                postPictureVoteUseCase$invoke$1 = new PostPictureVoteUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            postPictureVoteUseCase$invoke$1 = new PostPictureVoteUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = postPictureVoteUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = postPictureVoteUseCase$invoke$1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, this.RemoteActionCompatParcelizer, getDefaulteUduSuo.class, "logVotingFailed", "logVotingFailed(Ljava/lang/Exception;)V", 0, 10);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, offsetMappingCompanionIdentity1, shortNewsContentCardView, 13);
            postPictureVoteUseCase$invoke$1.RemoteActionCompatParcelizer = 1;
            Object objM4874invoke0E7RQCE = this.read.m4874invoke0E7RQCE(reportPictureUseCase$invoke$2, authRepository$logoutUser$2, postPictureVoteUseCase$invoke$1);
            return objM4874invoke0E7RQCE == coroutineSingletons ? coroutineSingletons : objM4874invoke0E7RQCE;
        }
        int i6 = IconCompatParcelizer;
        int i7 = i6 + 93;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = i6 + 71;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f A[PHI: r2 r4
  0x002f: PHI (r2v13 com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$1) = 
  (r2v12 com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$1)
  (r2v15 com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$1)
 binds: [B:10:0x002d, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r4v4 int) = (r4v3 int), (r4v6 int) binds: [B:10:0x002d, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX INFO: renamed from: invoke-BWLJW6A, reason: not valid java name */
    public Object m4915invokeBWLJW6A(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        ReportPictureUseCase$invoke$1 reportPictureUseCase$invoke$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof ReportPictureUseCase$invoke$1) {
            int i3 = IconCompatParcelizer + 73;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                reportPictureUseCase$invoke$1 = (ReportPictureUseCase$invoke$1) continuationImpl;
                i = reportPictureUseCase$invoke$1.RemoteActionCompatParcelizer;
                int i4 = 82 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    reportPictureUseCase$invoke$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    reportPictureUseCase$invoke$1 = new ReportPictureUseCase$invoke$1(this, continuationImpl);
                }
            } else {
                reportPictureUseCase$invoke$1 = (ReportPictureUseCase$invoke$1) continuationImpl;
                i = reportPictureUseCase$invoke$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    reportPictureUseCase$invoke$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    reportPictureUseCase$invoke$1 = new ReportPictureUseCase$invoke$1(this, continuationImpl);
                }
            }
        } else {
            reportPictureUseCase$invoke$1 = new ReportPictureUseCase$invoke$1(this, continuationImpl);
        }
        ReportPictureUseCase$invoke$1 reportPictureUseCase$invoke$2 = reportPictureUseCase$invoke$1;
        int i5 = IconCompatParcelizer + 61;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object obj = reportPictureUseCase$invoke$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = reportPictureUseCase$invoke$2.RemoteActionCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$3 = new ReportPictureUseCase$invoke$2(1, this.RemoteActionCompatParcelizer, getDefaulteUduSuo.class, "logReportingFailed", "logReportingFailed(Ljava/lang/Exception;)V", 0, 0);
            SelfieFlowRepository$uploadSelfie$2 selfieFlowRepository$uploadSelfie$2 = new SelfieFlowRepository$uploadSelfie$2(this, str, str2, z, null, 2);
            reportPictureUseCase$invoke$2.RemoteActionCompatParcelizer = 1;
            Object objM4874invoke0E7RQCE = this.read.m4874invoke0E7RQCE(reportPictureUseCase$invoke$3, selfieFlowRepository$uploadSelfie$2, reportPictureUseCase$invoke$2);
            return objM4874invoke0E7RQCE == coroutineSingletons ? coroutineSingletons : objM4874invoke0E7RQCE;
        }
        int i8 = write;
        int i9 = i8 + 33;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i11 = i8 + 29;
        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return ((onItemDismiss) obj).IconCompatParcelizer;
    }
}
