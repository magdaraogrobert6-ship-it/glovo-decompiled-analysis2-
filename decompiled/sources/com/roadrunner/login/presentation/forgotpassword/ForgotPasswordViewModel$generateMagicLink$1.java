package com.roadrunner.login.presentation.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C0180k;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ForgotPasswordViewModel$generateMagicLink$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public String IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ C0180k write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ForgotPasswordViewModel$generateMagicLink$1(C0180k c0180k, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.write = c0180k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.read == 0) {
            return new ForgotPasswordViewModel$generateMagicLink$1(this.write, shortNewsContentCardView, 0);
        }
        ForgotPasswordViewModel$generateMagicLink$1 forgotPasswordViewModel$generateMagicLink$1 = new ForgotPasswordViewModel$generateMagicLink$1(this.write, shortNewsContentCardView, 1);
        int i3 = MediaSessionCompatQueueItem + 41;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return forgotPasswordViewModel$generateMagicLink$1;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i2 != 0) {
            Object objInvokeSuspend = ((ForgotPasswordViewModel$generateMagicLink$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = serializer + 33;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((ForgotPasswordViewModel$generateMagicLink$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 111;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return objInvokeSuspend2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0212  */
    /* JADX WARN: Code duplicated, block: B:67:0x021b  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
    
        if (r14 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c0, code lost:
    
        if (r14 == r1) goto L58;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.forgotpassword.ForgotPasswordViewModel$generateMagicLink$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
