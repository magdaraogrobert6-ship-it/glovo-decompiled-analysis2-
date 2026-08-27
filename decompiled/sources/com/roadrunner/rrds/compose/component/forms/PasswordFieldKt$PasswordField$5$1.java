package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PasswordFieldKt$PasswordField$5$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasswordFieldKt$PasswordField$5$1(String str, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 51;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = 0;
        if (this.serializer == 0) {
            return new PasswordFieldKt$PasswordField$5$1(this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView, i3);
        }
        PasswordFieldKt$PasswordField$5$1 passwordFieldKt$PasswordField$5$1 = new PasswordFieldKt$PasswordField$5$1(this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 1);
        int i4 = IconCompatParcelizer + 23;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return passwordFieldKt$PasswordField$5$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            ((PasswordFieldKt$PasswordField$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        ((PasswordFieldKt$PasswordField$5$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 43;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r7 = com.roadrunner.rrds.compose.component.forms.PasswordFieldKt.write;
        r4.setValue(r3);
        r7 = com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.IconCompatParcelizer + 45;
        com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.read = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r7 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r4.setValue(r3);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.IconCompatParcelizer
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1d
            int r1 = r6.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            java.lang.String r3 = r6.write
            o.PopulateViewStructure_androidKtpopulate7 r4 = r6.RemoteActionCompatParcelizer
            r5 = 64
            int r5 = r5 / 0
            if (r1 == 0) goto L30
            goto L27
        L1d:
            int r1 = r6.serializer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            java.lang.String r3 = r6.write
            o.PopulateViewStructure_androidKtpopulate7 r4 = r6.RemoteActionCompatParcelizer
            if (r1 == 0) goto L30
        L27:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            r4.setValue(r3)
            return r2
        L30:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            o.getTopLeftannotations r7 = com.roadrunner.rrds.compose.component.forms.PasswordFieldKt.write
            r4.setValue(r3)
            int r7 = com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.IconCompatParcelizer
            int r7 = r7 + 45
            int r1 = r7 % 128
            com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.read = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L46
            return r2
        L46:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
