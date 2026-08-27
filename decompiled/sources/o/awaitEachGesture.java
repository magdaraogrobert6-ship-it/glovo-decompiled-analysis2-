package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class awaitEachGesture extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaDescriptionCompat;
    public final /* synthetic */ String MediaMetadataCompat;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ DragAndDropTargetModifierNode serializer;
    public final /* synthetic */ androidx.compose.ui.Alignment write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.AnimatedContentKt.write(this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat, this.RatingCompat, this.write, this.MediaMetadataCompat, this.read, this.serializer, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer | 1), this.IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awaitEachGesture(Object obj, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Alignment alignment, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        super(2);
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaDescriptionCompat = modifier;
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = alignment;
        this.MediaMetadataCompat = str;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.serializer = dragAndDropTargetModifierNode;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }
}
