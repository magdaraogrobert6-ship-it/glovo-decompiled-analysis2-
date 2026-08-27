package com.roadrunner.secure.certificate;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.LottieAnimatableImplanimate21;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCertificateHashPropertyImpl$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    final /* synthetic */ LottieAnimatableImplanimate21 serializer;
    int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCertificateHashPropertyImpl$invoke$1(LottieAnimatableImplanimate21 lottieAnimatableImplanimate21, ShortNewsContentCardView<? super GetCertificateHashPropertyImpl$invoke$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = lottieAnimatableImplanimate21;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        int i = 2 % 2;
        GetCertificateHashPropertyImpl$invoke$1 getCertificateHashPropertyImpl$invoke$1 = new GetCertificateHashPropertyImpl$invoke$1(this.serializer, shortNewsContentCardView);
        int i2 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
        return getCertificateHashPropertyImpl$invoke$1;
    }

    public final Object write(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((GetCertificateHashPropertyImpl$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((GetCertificateHashPropertyImpl$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objWrite = write((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        int i4 = IconCompatParcelizer + 109;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return objWrite;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.write == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            LottieAnimatableImplanimate21.read(this.serializer).write();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i4 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }
}
