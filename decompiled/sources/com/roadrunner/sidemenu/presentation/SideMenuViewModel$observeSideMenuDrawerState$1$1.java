package com.roadrunner.sidemenu.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SpanStyle;
import o.TextMotionSaverlambda1;
import o.createFromParcel;
import o.emojiSupportMatchSaverlambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuViewModel$observeSideMenuDrawerState$1$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SideMenuViewModel$observeSideMenuDrawerState$1$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this.RemoteActionCompatParcelizer != 0) {
            boolean z2 = this.write;
            boolean z3 = this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return new TextMotionSaverlambda1(new SpanStyle(z2), new emojiSupportMatchSaverlambda0(z3, z2));
        }
        boolean z4 = this.write;
        boolean z5 = this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (z4) {
            int i3 = read + 79;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            z = true;
            if (!z5) {
                int i4 = read + 51;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                z = false;
            }
        } else {
            int i6 = read + 51;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = serializer + 115;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Boolean bool = (Boolean) obj;
        int i5 = 3;
        if (i4 != 0) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            SideMenuViewModel$observeSideMenuDrawerState$1$1 sideMenuViewModel$observeSideMenuDrawerState$1$1 = new SideMenuViewModel$observeSideMenuDrawerState$1$1(i5, 1, (ShortNewsContentCardView) obj3);
            sideMenuViewModel$observeSideMenuDrawerState$1$1.write = zBooleanValue;
            sideMenuViewModel$observeSideMenuDrawerState$1$1.IconCompatParcelizer = zBooleanValue2;
            return sideMenuViewModel$observeSideMenuDrawerState$1$1.invokeSuspend(createfromparcel);
        }
        boolean zBooleanValue3 = bool.booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
        SideMenuViewModel$observeSideMenuDrawerState$1$1 sideMenuViewModel$observeSideMenuDrawerState$1$2 = new SideMenuViewModel$observeSideMenuDrawerState$1$1(i5, 0, (ShortNewsContentCardView) obj3);
        sideMenuViewModel$observeSideMenuDrawerState$1$2.write = zBooleanValue3;
        sideMenuViewModel$observeSideMenuDrawerState$1$2.IconCompatParcelizer = zBooleanValue4;
        Object objInvokeSuspend = sideMenuViewModel$observeSideMenuDrawerState$1$2.invokeSuspend(createfromparcel);
        int i6 = serializer + 67;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return objInvokeSuspend;
    }
}
