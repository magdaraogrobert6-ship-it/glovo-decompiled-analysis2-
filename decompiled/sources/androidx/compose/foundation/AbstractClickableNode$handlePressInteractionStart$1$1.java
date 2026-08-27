package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Button;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionStart$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ MutableInteractionSourceImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ AbstractClickableNode serializer;
    public final /* synthetic */ Button write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$handlePressInteractionStart$1$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, Button button, AbstractClickableNode abstractClickableNode, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = mutableInteractionSourceImpl;
        this.write = button;
        this.serializer = abstractClickableNode;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((AbstractClickableNode$handlePressInteractionStart$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AbstractClickableNode$handlePressInteractionStart$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r3.emit(r4, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r3.emit(r4, r10) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.read
            o.createFromParcel r1 = o.createFromParcel.INSTANCE
            androidx.compose.foundation.AbstractClickableNode r2 = r10.serializer
            androidx.compose.foundation.interaction.MutableInteractionSourceImpl r3 = r10.IconCompatParcelizer
            o.Button r4 = r10.write
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L43
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r9 = r10.RemoteActionCompatParcelizer
            if (r9 == 0) goto L28
            if (r9 == r8) goto L24
            if (r9 != r7) goto L1f
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L40
        L1f:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            r1 = r5
            goto L42
        L24:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L36
        L28:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            long r5 = o.ItemFoundInScroll.RemoteActionCompatParcelizer
            r10.RemoteActionCompatParcelizer = r8
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r5, r10)
            if (r11 != r0) goto L36
            goto L3e
        L36:
            r10.RemoteActionCompatParcelizer = r7
            java.lang.Object r11 = r3.emit(r4, r10)
            if (r11 != r0) goto L40
        L3e:
            r1 = r0
            goto L42
        L40:
            r2.ResultReceiver = r4
        L42:
            return r1
        L43:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r9 = r10.RemoteActionCompatParcelizer
            if (r9 == 0) goto L5a
            if (r9 == r8) goto L56
            if (r9 != r7) goto L51
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L72
        L51:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            r1 = r5
            goto L74
        L56:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L68
        L5a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            long r5 = o.ItemFoundInScroll.RemoteActionCompatParcelizer
            r10.RemoteActionCompatParcelizer = r8
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r5, r10)
            if (r11 != r0) goto L68
            goto L70
        L68:
            r10.RemoteActionCompatParcelizer = r7
            java.lang.Object r11 = r3.emit(r4, r10)
            if (r11 != r0) goto L72
        L70:
            r1 = r0
            goto L74
        L72:
            r2.MediaSessionCompatToken = r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.read != 0) {
            return new AbstractClickableNode$handlePressInteractionStart$1$1(this.IconCompatParcelizer, this.write, this.serializer, shortNewsContentCardView, 1);
        }
        return new AbstractClickableNode$handlePressInteractionStart$1$1(this.IconCompatParcelizer, this.write, this.serializer, shortNewsContentCardView, 0);
    }
}
