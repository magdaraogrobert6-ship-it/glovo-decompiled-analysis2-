package androidx.compose.foundation.gestures;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda0;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public long read;
    public final /* synthetic */ Object serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(long j, createBrazeUserChangeEventSubscriberlambda0 createbrazeuserchangeeventsubscriberlambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 2;
        this.read = j;
        this.serializer = createbrazeuserchangeeventsubscriberlambda0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = pointerInputChange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 119;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        int i5 = 0;
        if (i4 == 0) {
            TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2((PointerInputChange) obj2, shortNewsContentCardView, i5);
            tapGestureDetectorKt$awaitSecondDown$2.write = obj;
            return tapGestureDetectorKt$awaitSecondDown$2;
        }
        int i6 = 1;
        if (i4 != 1) {
            TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$3 = new TapGestureDetectorKt$awaitSecondDown$2(this.read, (createBrazeUserChangeEventSubscriberlambda0) obj2, shortNewsContentCardView);
            tapGestureDetectorKt$awaitSecondDown$3.write = obj;
            return tapGestureDetectorKt$awaitSecondDown$3;
        }
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$4 = new TapGestureDetectorKt$awaitSecondDown$2((PointerInputChange) obj2, shortNewsContentCardView, i6);
        tapGestureDetectorKt$awaitSecondDown$4.write = obj;
        int i7 = MediaSessionCompatQueueItem + 71;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 89 / 0;
        }
        return tapGestureDetectorKt$awaitSecondDown$4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 45;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return i4 != 1 ? ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cd A[PHI: r8
  0x00cd: PHI (r8v4 long) = (r8v3 long), (r8v5 long) binds: [B:35:0x00ba, B:40:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[PHI: r8 r13
  0x00e3: PHI (r8v5 long) = (r8v4 long), (r8v6 long) binds: [B:37:0x00d7, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r13v14 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:37:0x00d7, B:31:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d7 -> B:39:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013c -> B:56:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
