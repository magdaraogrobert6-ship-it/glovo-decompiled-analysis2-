package com.roadrunner.secure.certificate;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.lottieComposition;
import o.onRoutesChanged;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthSessionTokenShaImpl$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    final /* synthetic */ onRoutesChanged RemoteActionCompatParcelizer;
    int read;
    final /* synthetic */ String serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAuthSessionTokenShaImpl$invoke$2(onRoutesChanged onrouteschanged, String str, ShortNewsContentCardView<? super GetAuthSessionTokenShaImpl$invoke$2> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = onrouteschanged;
        this.serializer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        int i = 2 % 2;
        GetAuthSessionTokenShaImpl$invoke$2 getAuthSessionTokenShaImpl$invoke$2 = new GetAuthSessionTokenShaImpl$invoke$2(this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView);
        int i2 = write + 19;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getAuthSessionTokenShaImpl$invoke$2;
    }

    public final Object IconCompatParcelizer(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super String> shortNewsContentCardView) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 23;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((GetAuthSessionTokenShaImpl$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = write + 119;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objIconCompatParcelizer = IconCompatParcelizer((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        int i4 = write + 35;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objIconCompatParcelizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.read != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i2 = write + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return null;
            }
            obj2.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String strIconCompatParcelizer = lottieComposition.IconCompatParcelizer(onRoutesChanged.serializer(this.RemoteActionCompatParcelizer), this.serializer + "+" + onRoutesChanged.write(this.RemoteActionCompatParcelizer).IconCompatParcelizer(), null, 2, null);
        int i3 = IconCompatParcelizer + 39;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return strIconCompatParcelizer;
    }
}
