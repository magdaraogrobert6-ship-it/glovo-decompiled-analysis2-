package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$fetchHomeResponse$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ HomeRepositoryImpl MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$fetchHomeResponse$1(HomeRepositoryImpl homeRepositoryImpl, String str, boolean z, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaMetadataCompat = homeRepositoryImpl;
        this.serializer = str;
        this.write = z;
        this.read = str2;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            objInvokeSuspend = ((HomeRepositoryImpl$fetchHomeResponse$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 81 / 0;
        } else {
            objInvokeSuspend = ((HomeRepositoryImpl$fetchHomeResponse$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = MediaDescriptionCompat + 5;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        HomeRepositoryImpl$fetchHomeResponse$1 homeRepositoryImpl$fetchHomeResponse$1 = new HomeRepositoryImpl$fetchHomeResponse$1(this.MediaMetadataCompat, this.serializer, this.write, this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = RatingCompat + 29;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return homeRepositoryImpl$fetchHomeResponse$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4971fetchHomeResponseAsyncBWLJW6A;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 69;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.MediaBrowserCompatMediaItem;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.MediaBrowserCompatMediaItem = 1;
            objM4971fetchHomeResponseAsyncBWLJW6A = this.MediaMetadataCompat.m4971fetchHomeResponseAsyncBWLJW6A(this.serializer, this.read, this, this.write);
            if (objM4971fetchHomeResponseAsyncBWLJW6A == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = RatingCompat + 115;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = RatingCompat + 47;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4971fetchHomeResponseAsyncBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4971fetchHomeResponseAsyncBWLJW6A instanceof isItemDismissable)) {
            this.IconCompatParcelizer.invoke();
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4971fetchHomeResponseAsyncBWLJW6A);
        if (thSerializer != null) {
            this.RemoteActionCompatParcelizer.invoke(thSerializer);
            int i8 = RatingCompat + 87;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
