package androidx.compose.foundation.relocation;

import o.SnapshotIdSetiterator1;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewRequesterImpl {
    public final onCreateVirtualViewTranslationRequests RemoteActionCompatParcelizer = new onCreateVirtualViewTranslationRequests(new SnapshotIdSetiterator1[16]);

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:19:0x0065). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object bringIntoView(androidx.compose.ui.geometry.Rect r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof o.ImmutableListSubList
            if (r0 == 0) goto L13
            r0 = r12
            o.ImmutableListSubList r0 = (o.ImmutableListSubList) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.write = r1
            goto L18
        L13:
            o.ImmutableListSubList r0 = new o.ImmutableListSubList
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.MediaBrowserCompatMediaItem
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L30
            int r11 = r0.serializer
            int r2 = r0.RemoteActionCompatParcelizer
            java.lang.Object[] r4 = r0.IconCompatParcelizer
            androidx.compose.ui.geometry.Rect r5 = r0.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r12 = r5
            goto L65
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            r11 = 0
            return r11
        L37:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            o.onCreateVirtualViewTranslationRequests r12 = r10.RemoteActionCompatParcelizer
            java.lang.Object[] r2 = r12.write
            int r12 = r12.read
            r4 = 0
            r8 = r12
            r12 = r11
            r11 = r8
            r9 = r4
            r4 = r2
            r2 = r9
        L47:
            if (r2 >= r11) goto L67
            r5 = r4[r2]
            o.SnapshotIdSetiterator1 r5 = (o.SnapshotIdSetiterator1) r5
            androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0 r6 = new androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0
            r7 = 8
            r6.<init>(r7, r12)
            r0.read = r12
            r0.IconCompatParcelizer = r4
            r0.RemoteActionCompatParcelizer = r2
            r0.serializer = r11
            r0.write = r3
            java.lang.Object r5 = androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(r5, r6, r0)
            if (r5 != r1) goto L65
            return r1
        L65:
            int r2 = r2 + r3
            goto L47
        L67:
            o.createFromParcel r11 = o.createFromParcel.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
