package com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.PasswordCreationViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PasswordCreationScreenKt$passwordCreationComposable$9$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ PasswordCreationViewModel read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordCreationScreenKt$passwordCreationComposable$9$1$1(PasswordCreationViewModel passwordCreationViewModel, String str, String str2, String str3, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = passwordCreationViewModel;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            PasswordCreationScreenKt$passwordCreationComposable$9$1$1 passwordCreationScreenKt$passwordCreationComposable$9$1$1 = (PasswordCreationScreenKt$passwordCreationComposable$9$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            passwordCreationScreenKt$passwordCreationComposable$9$1$1.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((PasswordCreationScreenKt$passwordCreationComposable$9$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        PasswordCreationScreenKt$passwordCreationComposable$9$1$1 passwordCreationScreenKt$passwordCreationComposable$9$1$1 = new PasswordCreationScreenKt$passwordCreationComposable$9$1$1(this.read, this.IconCompatParcelizer, this.serializer, this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaBrowserCompatMediaItem + 61;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return passwordCreationScreenKt$passwordCreationComposable$9$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str = this.IconCompatParcelizer;
        PasswordCreationViewModel passwordCreationViewModel = this.read;
        passwordCreationViewModel.write = str;
        passwordCreationViewModel.IconCompatParcelizer = this.serializer;
        passwordCreationViewModel.read = this.write;
        passwordCreationViewModel.serializer = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RatingCompat + 5;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
