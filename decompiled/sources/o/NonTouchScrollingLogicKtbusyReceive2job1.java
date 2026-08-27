package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class NonTouchScrollingLogicKtbusyReceive2job1 extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ DragAndDropTargetModifierNode IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ TapGestureDetectorKt read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.AnimatedVisibilityKt.IconCompatParcelizer(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.write, this.read, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.serializer);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKtbusyReceive2job1(boolean z, androidx.compose.ui.Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        super(2);
        this.MediaDescriptionCompat = z;
        this.MediaBrowserCompatMediaItem = modifier;
        this.write = scrollingLogicdoFlingAnimation2reverseScope1;
        this.read = tapGestureDetectorKt;
        this.MediaSessionCompatQueueItem = str;
        this.IconCompatParcelizer = dragAndDropTargetModifierNode;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }
}
