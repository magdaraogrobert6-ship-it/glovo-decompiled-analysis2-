package com.roadrunner.rider.state.searchshifts.presentation.timepicker;

import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ View read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1(View view, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1 dualColumnTimePickerKt$disallowParentTouchInterception$1$1$1 = new DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1(this.read, shortNewsContentCardView);
        dualColumnTimePickerKt$disallowParentTouchInterception$1$1$1.RemoteActionCompatParcelizer = obj;
        int i2 = IconCompatParcelizer + 59;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return dualColumnTimePickerKt$disallowParentTouchInterception$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        Object objInvokeSuspend = ((DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1) create((AwaitPointerEventScope) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = 80 / 0;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b0 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:23:0x0048, B:35:0x006a, B:38:0x0077, B:42:0x008f, B:46:0x009c, B:49:0x00a6, B:50:0x00aa, B:52:0x00b0, B:13:0x002f), top: B:80:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:0: B:50:0x00aa->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ba -> B:35:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
