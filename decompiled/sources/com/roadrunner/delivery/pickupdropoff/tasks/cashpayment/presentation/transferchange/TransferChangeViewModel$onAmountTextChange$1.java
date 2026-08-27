package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeViewModel$onAmountTextChange$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ TransferChangeViewModel MediaDescriptionCompat;
    public TransferChangeViewModel RemoteActionCompatParcelizer;
    public SignInDataStore read;
    public final /* synthetic */ String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferChangeViewModel$onAmountTextChange$1(TransferChangeViewModel transferChangeViewModel, String str, double d, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaDescriptionCompat = transferChangeViewModel;
        this.serializer = str;
        this.IconCompatParcelizer = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        TransferChangeViewModel$onAmountTextChange$1 transferChangeViewModel$onAmountTextChange$1 = new TransferChangeViewModel$onAmountTextChange$1(this.MediaDescriptionCompat, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaMetadataCompat + 117;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return transferChangeViewModel$onAmountTextChange$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((TransferChangeViewModel$onAmountTextChange$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaMetadataCompat + 47;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r0 == r10) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewModel$onAmountTextChange$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
