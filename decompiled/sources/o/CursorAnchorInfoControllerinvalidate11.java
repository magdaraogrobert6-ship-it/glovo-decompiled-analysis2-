package o;

import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.TagsListContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CursorAnchorInfoControllerinvalidate11 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ write;

    public /* synthetic */ CursorAnchorInfoControllerinvalidate11(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.read;
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            TagsListContentKt.TagsList(r8lambdaiidsddyirtymdul5lt6pmt2zysq, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.TagsListContentKt.TagsList(r8lambdaiidsddyirtymdul5lt6pmt2zysq, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaSessionCompatQueueItem + 69;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
