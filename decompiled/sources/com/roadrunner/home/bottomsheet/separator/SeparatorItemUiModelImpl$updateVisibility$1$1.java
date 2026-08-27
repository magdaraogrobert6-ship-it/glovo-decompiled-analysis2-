package com.roadrunner.home.bottomsheet.separator;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onPrimaryNavigationFragmentChanged;
import o.performDestroyView;
import o.performPrimaryNavigationFragmentChanged;
import o.performStart;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.requireParentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SeparatorItemUiModelImpl$updateVisibility$1$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RatingCompat = 1;
    private static int read;
    public /* synthetic */ onPrimaryNavigationFragmentChanged IconCompatParcelizer;
    public /* synthetic */ performDestroyView RemoteActionCompatParcelizer;
    public /* synthetic */ requireParentFragment serializer;
    public final /* synthetic */ performStart write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorItemUiModelImpl$updateVisibility$1$1(performStart performstart, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.write = performstart;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        SeparatorItemUiModelImpl$updateVisibility$1$1 separatorItemUiModelImpl$updateVisibility$1$1 = new SeparatorItemUiModelImpl$updateVisibility$1$1(this.write, (ShortNewsContentCardView) obj4);
        separatorItemUiModelImpl$updateVisibility$1$1.serializer = (requireParentFragment) obj;
        separatorItemUiModelImpl$updateVisibility$1$1.IconCompatParcelizer = (onPrimaryNavigationFragmentChanged) obj2;
        separatorItemUiModelImpl$updateVisibility$1$1.RemoteActionCompatParcelizer = (performDestroyView) obj3;
        Object objInvokeSuspend = separatorItemUiModelImpl$updateVisibility$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = read + 97;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requireParentFragment requireparentfragment = this.serializer;
        onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = this.IconCompatParcelizer;
        performDestroyView performdestroyview = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Set set = performStart.read;
        int i4 = performPrimaryNavigationFragmentChanged.write[requireparentfragment.ordinal()];
        boolean zContains = true;
        if (i4 != 1) {
            if (i4 != 2) {
                zContains = set.contains(performdestroyview);
            } else if (onprimarynavigationfragmentchanged == onPrimaryNavigationFragmentChanged.EXPANDED && set.contains(performdestroyview)) {
                int i5 = RatingCompat + 35;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                zContains = false;
            }
        }
        return Boolean.valueOf(zContains);
    }
}
