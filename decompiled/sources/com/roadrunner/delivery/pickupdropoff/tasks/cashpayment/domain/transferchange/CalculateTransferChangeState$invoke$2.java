package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.transferchange;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageEventMap;
import o.r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q;
import o.r8lambdaEH6JkTefaTFFm8vtM3ckzQ8RLxw;
import o.r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdariYSjVayzlYnf6n5A5_kREM1s;

/* JADX INFO: loaded from: classes3.dex */
public final class CalculateTransferChangeState$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ getInAppMessageEventMap serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateTransferChangeState$invoke$2(String str, getInAppMessageEventMap getinappmessageeventmap, double d, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = str;
        this.serializer = getinappmessageeventmap;
        this.IconCompatParcelizer = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CalculateTransferChangeState$invoke$2 calculateTransferChangeState$invoke$2 = new CalculateTransferChangeState$invoke$2(this.write, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = RemoteActionCompatParcelizer + 27;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return calculateTransferChangeState$invoke$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((CalculateTransferChangeState$invoke$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = RemoteActionCompatParcelizer + 81;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getInAppMessageEventMap getinappmessageeventmap = this.serializer;
        String str = this.write;
        if (!getinappmessageeventmap.read(str) || !r8lambdaKeEM9pspkHnqH2VAI0YnSTHzmEQ.RemoteActionCompatParcelizer.read(str)) {
            return r8lambdaEH6JkTefaTFFm8vtM3ckzQ8RLxw.RemoteActionCompatParcelizer;
        }
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        double d = Double.parseDouble(str);
        double d2 = this.IconCompatParcelizer;
        if (d > d2) {
            r8lambdariYSjVayzlYnf6n5A5_kREM1s r8lambdariysjvayzlynf6n5a5_krem1s = new r8lambdariYSjVayzlYnf6n5A5_kREM1s(d - d2);
            int i4 = read + 75;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdariysjvayzlynf6n5a5_krem1s;
        }
        int i6 = read + 17;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q.RemoteActionCompatParcelizer;
        }
        r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q r8lambda2nqu30qzrcxkrmizfmd0nfoe95q = r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q.RemoteActionCompatParcelizer;
        throw null;
    }
}
