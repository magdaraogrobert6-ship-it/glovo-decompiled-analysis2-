package com.roadrunner.face.verification.presentation.selfie;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowViewModel$submitSelfie$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public SelfieFlowViewModel IconCompatParcelizer;
    public final /* synthetic */ SelfieFlowViewModel MediaSessionCompatQueueItem;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieFlowViewModel$submitSelfie$1(SelfieFlowViewModel selfieFlowViewModel, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = selfieFlowViewModel;
        this.write = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        SelfieFlowViewModel$submitSelfie$1 selfieFlowViewModel$submitSelfie$1 = new SelfieFlowViewModel$submitSelfie$1(this.MediaSessionCompatQueueItem, this.write, shortNewsContentCardView);
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return selfieFlowViewModel$submitSelfie$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((SelfieFlowViewModel$submitSelfie$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaMetadataCompat + 65;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x014a A[PHI: r7
  0x014a: PHI (r7v10 java.lang.Object) = (r7v8 java.lang.Object), (r7v9 java.lang.Object), (r7v18 java.lang.Object) binds: [B:24:0x00c0, B:33:0x0146, B:14:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:39:0x0189  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b4  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f8, code lost:
    
        if (r2.emit(r1, r28) == r6) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.face.verification.presentation.selfie.SelfieFlowViewModel$submitSelfie$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
