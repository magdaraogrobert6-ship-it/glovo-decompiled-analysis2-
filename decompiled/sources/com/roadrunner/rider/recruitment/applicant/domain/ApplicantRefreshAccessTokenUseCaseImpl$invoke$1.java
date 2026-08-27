package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler50;
import o.onItemDismiss;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantRefreshAccessTokenUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ ApplicantRefreshAccessTokenUseCaseImpl RatingCompat;
    public setCustomInAppMessageAnimationFactorylambda0 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public ActivityHandler50 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicantRefreshAccessTokenUseCaseImpl$invoke$1(ApplicantRefreshAccessTokenUseCaseImpl applicantRefreshAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = applicantRefreshAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 123;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5021invokeIoAF18A = this.RatingCompat.m5021invokeIoAF18A(this);
        if (objM5021invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5021invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5021invokeIoAF18A);
        int i4 = MediaMetadataCompat + 91;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return onitemdismiss;
    }
}
