package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class MouseWheelScrollingLogicdispatchMouseWheelScroll3 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.core.Transition MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaSessionCompatQueueItem;
    public final /* synthetic */ TapGestureDetectorKt RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ DragAndDropTargetModifierNode serializer;
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.read, this.write, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, this.serializer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogicdispatchMouseWheelScroll3(androidx.compose.animation.core.Transition transition, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        super(2);
        this.MediaBrowserCompatMediaItem = transition;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = modifier;
        this.write = scrollingLogicdoFlingAnimation2reverseScope1;
        this.RemoteActionCompatParcelizer = tapGestureDetectorKt;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = dragAndDropTargetModifierNode;
        this.IconCompatParcelizer = i;
    }
}
