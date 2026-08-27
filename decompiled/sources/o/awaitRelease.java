package o;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class awaitRelease extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Arrangement serializer;
    public final /* synthetic */ DragAndDropTargetModifierNode write;

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.CrossfadeKt.serializer(this.MediaMetadataCompat, this.MediaSessionCompatQueueItem, this.serializer, this.RemoteActionCompatParcelizer, this.write, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer | 1), this.read);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awaitRelease(Object obj, androidx.compose.ui.Modifier modifier, Arrangement arrangement, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        super(2);
        this.MediaMetadataCompat = obj;
        this.MediaSessionCompatQueueItem = modifier;
        this.serializer = arrangement;
        this.RemoteActionCompatParcelizer = str;
        this.write = dragAndDropTargetModifierNode;
        this.IconCompatParcelizer = i;
        this.read = i2;
    }
}
