package com.roadrunner.secure.certificate;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.runlambda4notifyCallbackIfNeeded;

/* JADX INFO: loaded from: classes3.dex */
public final class PrewarmCertificateHash$invoke$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    final /* synthetic */ runlambda4notifyCallbackIfNeeded RemoteActionCompatParcelizer;
    int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrewarmCertificateHash$invoke$1(runlambda4notifyCallbackIfNeeded runlambda4notifycallbackifneeded, ShortNewsContentCardView<? super PrewarmCertificateHash$invoke$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = runlambda4notifycallbackifneeded;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        int i = 2 % 2;
        PrewarmCertificateHash$invoke$1 prewarmCertificateHash$invoke$1 = new PrewarmCertificateHash$invoke$1(this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = read + 11;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return prewarmCertificateHash$invoke$1;
    }

    public final Object serializer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        read = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((PrewarmCertificateHash$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((PrewarmCertificateHash$invoke$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = IconCompatParcelizer + 99;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objInvokeSuspend;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objSerializer = serializer((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        int i4 = read + 31;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objSerializer;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.serializer != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = IconCompatParcelizer + 15;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        runlambda4notifyCallbackIfNeeded.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).IconCompatParcelizer();
        return createFromParcel.INSTANCE;
    }
}
