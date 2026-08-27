package com.roadrunner.secure.certificate;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accesspreviewRoutesInternal;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.lottieComposition;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRefreshSessionTokenShaImpl$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    final /* synthetic */ accesspreviewRoutesInternal RemoteActionCompatParcelizer;
    final /* synthetic */ String serializer;
    int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRefreshSessionTokenShaImpl$invoke$2(accesspreviewRoutesInternal accesspreviewroutesinternal, String str, ShortNewsContentCardView<? super GetRefreshSessionTokenShaImpl$invoke$2> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = accesspreviewroutesinternal;
        this.serializer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        int i = 2 % 2;
        GetRefreshSessionTokenShaImpl$invoke$2 getRefreshSessionTokenShaImpl$invoke$2 = new GetRefreshSessionTokenShaImpl$invoke$2(this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView);
        int i2 = IconCompatParcelizer + 17;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getRefreshSessionTokenShaImpl$invoke$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Object RemoteActionCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super String> shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((GetRefreshSessionTokenShaImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((GetRefreshSessionTokenShaImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        int i4 = read + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objRemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.write != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String strIconCompatParcelizer = lottieComposition.IconCompatParcelizer(accesspreviewRoutesInternal.IconCompatParcelizer(this.RemoteActionCompatParcelizer), new StringBuilder((CharSequence) (accesspreviewRoutesInternal.write(this.RemoteActionCompatParcelizer).IconCompatParcelizer() + "-" + this.serializer)).reverse().toString(), null, 2, null);
        int i3 = IconCompatParcelizer + 17;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return strIconCompatParcelizer;
    }
}
