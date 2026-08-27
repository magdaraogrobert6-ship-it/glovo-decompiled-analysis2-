package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ DragGestureNode MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public int read;
    public createInAppMessageEventSubscriber serializer;
    public createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, DragGestureNode dragGestureNode, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = createinappmessageeventsubscriber;
        this.MediaSessionCompatQueueItem = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        DragGestureNode dragGestureNode = this.MediaSessionCompatQueueItem;
        if (i != 0) {
            DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.write, dragGestureNode, shortNewsContentCardView);
            dragGestureNode$startListeningForEvents$1.IconCompatParcelizer = obj;
            return dragGestureNode$startListeningForEvents$1;
        }
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$2 = new DragGestureNode$startListeningForEvents$1(dragGestureNode, shortNewsContentCardView);
        dragGestureNode$startListeningForEvents$2.IconCompatParcelizer = obj;
        return dragGestureNode$startListeningForEvents$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        return i != 0 ? ((DragGestureNode$startListeningForEvents$1) create((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((DragGestureNode$startListeningForEvents$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c A[PHI: r3 r6
  0x008c: PHI (r3v11 o.createInAppMessageEventSubscriber) = (r3v3 o.createInAppMessageEventSubscriber), (r3v15 o.createInAppMessageEventSubscriber) binds: [B:40:0x0089, B:62:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r6v7 o.getContentViewGroupParentLayout) = (r6v5 o.getContentViewGroupParentLayout), (r6v8 o.getContentViewGroupParentLayout) binds: [B:40:0x0089, B:62:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[PHI: r7
  0x00ad: PHI (r7v7 o.getContentViewGroupParentLayout) = 
  (r7v0 o.getContentViewGroupParentLayout)
  (r7v3 o.getContentViewGroupParentLayout)
  (r7v3 o.getContentViewGroupParentLayout)
  (r7v3 o.getContentViewGroupParentLayout)
  (r7v5 o.getContentViewGroupParentLayout)
  (r7v8 o.getContentViewGroupParentLayout)
 binds: [B:44:0x00a5, B:70:0x0119, B:72:0x0126, B:67:0x0114, B:56:0x00d8, B:34:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117 A[Catch: CancellationException -> 0x0129, TryCatch #2 {CancellationException -> 0x0129, blocks: (B:64:0x0101, B:66:0x0107, B:69:0x0117, B:71:0x011b), top: B:85:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x011b A[Catch: CancellationException -> 0x0129, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0129, blocks: (B:64:0x0101, B:66:0x0107, B:69:0x0117, B:71:0x011b), top: B:85:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0056 -> B:26:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x005a -> B:28:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d8 -> B:45:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0114 -> B:45:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0119 -> B:45:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0126 -> B:45:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:34:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = dragGestureNode;
    }
}
