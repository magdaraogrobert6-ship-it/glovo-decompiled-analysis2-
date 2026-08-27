package o;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class autoInvalidateUpdatedNode extends AdaptedFunctionReference implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ autoInvalidateUpdatedNode(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.serializer = i3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r14 = (o.onPrimaryNavigationFragmentChanged) r14;
        r15 = (o.ShortNewsContentCardView) r15;
        ((com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture) r13.MediaSessionCompatQueueItem).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r14 != o.onPrimaryNavigationFragmentChanged.HALF_EXPANDED) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r14 = o.autoInvalidateUpdatedNode.read + 63;
        o.autoInvalidateUpdatedNode.write = r14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r14 = r14 % 2;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r14 = o.autoInvalidateUpdatedNode.write + 41;
        o.autoInvalidateUpdatedNode.read = r14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r9 = ((androidx.compose.ui.unit.Velocity) r14).m3920unboximpl();
        r15 = (o.ShortNewsContentCardView) r15;
        r8 = (androidx.compose.foundation.gestures.ScrollableNode) r13.MediaSessionCompatQueueItem;
        kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1(r8, r9, null, 1), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1 != 2) goto L13;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.autoInvalidateUpdatedNode.read
            int r1 = r1 + 29
            int r2 = r1 % 128
            o.autoInvalidateUpdatedNode.write = r2
            int r1 = r1 % r0
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L20
            int r1 = r13.serializer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            r7 = 98
            int r7 = r7 / r3
            if (r1 == 0) goto L90
            if (r1 == r4) goto L71
            if (r1 == r0) goto L52
            goto L2a
        L20:
            int r1 = r13.serializer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            if (r1 == 0) goto L90
            if (r1 == r4) goto L71
            if (r1 == r0) goto L52
        L2a:
            o.onPrimaryNavigationFragmentChanged r14 = (o.onPrimaryNavigationFragmentChanged) r14
            o.ShortNewsContentCardView r15 = (o.ShortNewsContentCardView) r15
            java.lang.Object r15 = r13.MediaSessionCompatQueueItem
            com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture r15 = (com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture) r15
            r15.getClass()
            o.onPrimaryNavigationFragmentChanged r15 = o.onPrimaryNavigationFragmentChanged.HALF_EXPANDED
            if (r14 != r15) goto L44
            int r14 = o.autoInvalidateUpdatedNode.read
            int r14 = r14 + 63
            int r15 = r14 % 128
            o.autoInvalidateUpdatedNode.write = r15
            int r14 = r14 % r0
            r3 = r4
            goto L4d
        L44:
            int r14 = o.autoInvalidateUpdatedNode.write
            int r14 = r14 + 41
            int r15 = r14 % 128
            o.autoInvalidateUpdatedNode.read = r15
            int r14 = r14 % r0
        L4d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L52:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r9 = r14.m3920unboximpl()
            o.ShortNewsContentCardView r15 = (o.ShortNewsContentCardView) r15
            java.lang.Object r14 = r13.MediaSessionCompatQueueItem
            r8 = r14
            androidx.compose.foundation.gestures.ScrollableNode r8 = (androidx.compose.foundation.gestures.ScrollableNode) r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r14 = r8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs
            o.getContentViewGroupParentLayout r14 = r14.getCoroutineScope()
            androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1 r15 = new androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1
            r11 = 0
            r12 = 1
            r7 = r15
            r7.<init>(r8, r9, r11, r12)
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r14, r5, r5, r15, r2)
            return r6
        L71:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r9 = r14.m3920unboximpl()
            o.ShortNewsContentCardView r15 = (o.ShortNewsContentCardView) r15
            java.lang.Object r14 = r13.MediaSessionCompatQueueItem
            r8 = r14
            androidx.compose.foundation.gestures.ScrollableNode r8 = (androidx.compose.foundation.gestures.ScrollableNode) r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r14 = r8.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs
            o.getContentViewGroupParentLayout r14 = r14.getCoroutineScope()
            androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1 r15 = new androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1
            r11 = 0
            r12 = 2
            r7 = r15
            r7.<init>(r8, r9, r11, r12)
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r14, r5, r5, r15, r2)
            return r6
        L90:
            java.lang.String r14 = (java.lang.String) r14
            com.google.firestore.v1.Value r15 = (com.google.firestore.v1.Value) r15
            java.lang.Object r1 = r13.MediaSessionCompatQueueItem
            o.hitTestSemanticsAtui r1 = (o.hitTestSemanticsAtui) r1
            r1.getClass()
            r14.getClass()
            r15.getClass()
            r1.RemoteActionCompatParcelizer()
            com.google.protobuf.GeneratedMessageLite r1 = r1.RemoteActionCompatParcelizer
            com.google.firestore.v1.Function r1 = (com.google.firestore.v1.Function) r1
            java.util.Map r1 = com.google.firestore.v1.Function.access$1000(r1)
            r1.put(r14, r15)
            int r14 = o.autoInvalidateUpdatedNode.write
            int r14 = r14 + 59
            int r15 = r14 % 128
            o.autoInvalidateUpdatedNode.read = r15
            int r14 = r14 % r0
            if (r14 == 0) goto Lbb
            return r6
        Lbb:
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.autoInvalidateUpdatedNode.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
