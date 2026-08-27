package o;

import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.InstructionsListContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CursorAnchorInfoBuilder_androidKt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ IconCompatParcelizer;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.ui.Modifier RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final /* synthetic */ r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ write;

    public /* synthetic */ CursorAnchorInfoBuilder_androidKt(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ r8lambdakgjqwjlmus58_kprh__ggunrqtq, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = r8lambdakgjqwjlmus58_kprh__ggunrqtq;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RatingCompat = modifier;
        this.MediaSessionCompatQueueItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaSessionCompatQueueItem;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            InstructionsListContentKt.InstructionsListContent(this.write, this.read, this.IconCompatParcelizer, this.serializer, this.RatingCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.InstructionsListContentKt.InstructionsListContent(this.write, this.read, this.IconCompatParcelizer, this.serializer, this.RatingCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaDescriptionCompat + 41;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
        return createfromparcel;
    }
}
