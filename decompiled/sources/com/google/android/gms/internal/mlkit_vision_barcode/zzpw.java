package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.settings.subscreens.appearance.AppearanceFragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpw {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static AppearanceFragment RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        AppearanceFragment appearanceFragment = new AppearanceFragment();
        int i2 = write + 109;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return appearanceFragment;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:25:0x0079->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0054 -> B:22:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r11 instanceof o.ComposedModifier
            if (r1 == 0) goto L2c
            int r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzpw.IconCompatParcelizer
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.google.android.gms.internal.mlkit_vision_barcode.zzpw.write = r2
            int r1 = r1 % r0
            r1 = r11
            o.ComposedModifier r1 = (o.ComposedModifier) r1
            int r2 = r1.write
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L2c
            int r11 = com.google.android.gms.internal.mlkit_vision_barcode.zzpw.IconCompatParcelizer
            int r11 = r11 + 109
            int r4 = r11 % 128
            com.google.android.gms.internal.mlkit_vision_barcode.zzpw.write = r4
            int r11 = r11 % r0
            if (r11 == 0) goto L28
            int r2 = r2 / r3
            goto L29
        L28:
            int r2 = r2 + r3
        L29:
            r1.write = r2
            goto L31
        L2c:
            o.ComposedModifier r1 = new o.ComposedModifier
            r1.<init>(r11)
        L31:
            java.lang.Object r11 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.write
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L49
            if (r3 != r4) goto L43
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r1.serializer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L57
        L43:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r5
        L49:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
        L4c:
            r1.serializer = r10
            r1.write = r4
            java.lang.Object r11 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r10, r5, r1, r4, r5)
            if (r11 != r2) goto L57
            return r2
        L57:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
            int r3 = r11.m2002getButtonsry648PA()
            boolean r3 = androidx.compose.ui.input.pointer.PointerEvent_androidKt.m2043isSecondaryPressedaHzCxE(r3)
            if (r3 == 0) goto L4c
            int r3 = com.google.android.gms.internal.mlkit_vision_barcode.zzpw.write
            int r3 = r3 + 125
            int r6 = r3 % 128
            com.google.android.gms.internal.mlkit_vision_barcode.zzpw.IconCompatParcelizer = r6
            int r3 = r3 % r0
            java.util.List r3 = r11.getChanges()
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            r7 = 0
            r8 = r7
        L79:
            if (r8 >= r6) goto L9a
            java.lang.Object r9 = r3.get(r8)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r9)
            if (r9 != 0) goto L97
            int r11 = com.google.android.gms.internal.mlkit_vision_barcode.zzpw.IconCompatParcelizer
            int r11 = r11 + 99
            int r3 = r11 % 128
            com.google.android.gms.internal.mlkit_vision_barcode.zzpw.write = r3
            int r11 = r11 % r0
            if (r11 != 0) goto L93
            goto L4c
        L93:
            r5.hashCode()
            throw r5
        L97:
            int r8 = r8 + 1
            goto L79
        L9a:
            java.util.List r10 = r11.getChanges()
            java.lang.Object r10 = r10.get(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzpw.access$awaitFirstRightClickDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
