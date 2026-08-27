package com.roadrunner.opportunities.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import o.w4ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class OpportunitiesRepository$set$1 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public w4ExternalSyntheticLambda0 IconCompatParcelizer;
    public final /* synthetic */ OpportunitiesRepository RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpportunitiesRepository$set$1(OpportunitiesRepository opportunitiesRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = opportunitiesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4994setgIAlus = this.RemoteActionCompatParcelizer.m4994setgIAlus(null, this);
        if (objM4994setgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = MediaDescriptionCompat + 77;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4994setgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4994setgIAlus);
        int i6 = MediaMetadataCompat + 73;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
