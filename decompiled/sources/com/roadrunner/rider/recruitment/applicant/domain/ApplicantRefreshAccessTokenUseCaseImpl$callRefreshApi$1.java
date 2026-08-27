package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler45;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ ApplicantRefreshAccessTokenUseCaseImpl MediaBrowserCompatMediaItem;
    public int RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public ActivityHandler45 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicantRefreshAccessTokenUseCaseImpl$callRefreshApi$1(ApplicantRefreshAccessTokenUseCaseImpl applicantRefreshAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = applicantRefreshAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM5020callRefreshApigIAlus = this.MediaBrowserCompatMediaItem.m5020callRefreshApigIAlus(null, this);
        if (objM5020callRefreshApigIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5020callRefreshApigIAlus);
        }
        int i4 = MediaSessionCompatQueueItem + 23;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM5020callRefreshApigIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
