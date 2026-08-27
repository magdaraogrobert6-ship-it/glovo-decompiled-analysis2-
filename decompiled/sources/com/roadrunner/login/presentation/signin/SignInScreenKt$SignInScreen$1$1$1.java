package com.roadrunner.login.presentation.signin;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.d0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SignInScreenKt$SignInScreen$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ d0 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInScreenKt$SignInScreen$1$1$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, d0 d0Var, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 69;
        read = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.write;
        if (i4 != 0) {
            int i5 = 1;
            if (i4 != 1) {
                return new SignInScreenKt$SignInScreen$1$1$1(this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, i);
            }
            return new SignInScreenKt$SignInScreen$1$1$1(this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, i5);
        }
        SignInScreenKt$SignInScreen$1$1$1 signInScreenKt$SignInScreen$1$1$1 = new SignInScreenKt$SignInScreen$1$1$1(this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 0);
        int i6 = IconCompatParcelizer + 99;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return signInScreenKt$SignInScreen$1$1$1;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        ((com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        ((com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.read
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L20
            int r1 = r5.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 58
            int r4 = r4 / 0
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            goto L2c
        L20:
            int r1 = r5.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
        L2c:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1 r6 = (com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1) r6
            r6.invokeSuspend(r3)
            return r3
        L36:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1 r6 = (com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1) r6
            r6.invokeSuspend(r3)
            return r3
        L40:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1 r6 = (com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1) r6
            r6.invokeSuspend(r3)
            int r6 = com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.read
            int r6 = r6 + 31
            int r7 = r6 % 128
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.IconCompatParcelizer = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L55
            return r3
        L55:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
        r5.invoke(((o.d4) r4).RemoteActionCompatParcelizer);
        r8 = com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.read + 9;
        com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r8);
        r5.invoke(((o.d0ExternalSyntheticLambda4) r4).serializer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.IconCompatParcelizer
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.read = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L20
            int r1 = r7.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.d0 r4 = r7.RemoteActionCompatParcelizer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = r7.serializer
            r6 = 56
            int r6 = r6 / 0
            if (r1 == 0) goto L4f
            if (r1 == r2) goto L42
            goto L2c
        L20:
            int r1 = r7.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.d0 r4 = r7.RemoteActionCompatParcelizer
            o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r5 = r7.serializer
            if (r1 == 0) goto L4f
            if (r1 == r2) goto L42
        L2c:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.d4 r4 = (o.d4) r4
            o.bExternalSyntheticLambda3 r8 = r4.RemoteActionCompatParcelizer
            r5.invoke(r8)
            int r8 = com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.read
            int r8 = r8 + 9
            int r1 = r8 % 128
            com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.IconCompatParcelizer = r1
            int r8 = r8 % r0
            return r3
        L42:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.d0ExternalSyntheticLambda4 r4 = (o.d0ExternalSyntheticLambda4) r4
            java.lang.String r8 = r4.serializer
            r5.invoke(r8)
            return r3
        L4f:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.d3 r4 = (o.d3) r4
            java.lang.String r8 = r4.write
            r5.invoke(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.signin.SignInScreenKt$SignInScreen$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
