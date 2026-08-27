package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class NonTouchScrollingLogic extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ ScrollingLogicdoFlingAnimation2reverseScope1 IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ boolean MediaMetadataCompat;
    public final /* synthetic */ String RatingCompat;
    public final /* synthetic */ DragAndDropTargetModifierNode RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ TapGestureDetectorKt write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NonTouchScrollingLogic(boolean z, androidx.compose.ui.Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2, int i3) {
        super(2);
        this.MediaDescriptionCompat = i3;
        this.MediaMetadataCompat = z;
        this.MediaBrowserCompatMediaItem = modifier;
        this.IconCompatParcelizer = scrollingLogicdoFlingAnimation2reverseScope1;
        this.write = tapGestureDetectorKt;
        this.RatingCompat = str;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.read = i;
        this.serializer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.MediaDescriptionCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.read;
        if (i != 0) {
            ((Number) obj2).intValue();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
            int i3 = this.serializer;
            androidx.compose.animation.AnimatedVisibilityKt.serializer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.write, this.RatingCompat, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, i3);
            return createfromparcel;
        }
        ((Number) obj2).intValue();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
        int i4 = this.serializer;
        androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.IconCompatParcelizer, this.write, this.RatingCompat, this.RemoteActionCompatParcelizer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, i4);
        return createfromparcel;
    }
}
