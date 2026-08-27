package o;

import com.roadrunner.bubble.presentation.BubbleContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class findNearestNeighbor implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ findNearestNeighbor(r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc r8lambdaomj_unyzprj1upaauufsp7i4jfc, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, int i) {
        this.serializer = 2;
        this.write = r8lambdaomj_unyzprj1upaauufsp7i4jfc;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.RemoteActionCompatParcelizer = modifier;
        this.MediaDescriptionCompat = i;
    }

    public /* synthetic */ findNearestNeighbor(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.serializer = i2;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.RemoteActionCompatParcelizer = obj4;
        this.RatingCompat = obj5;
        this.MediaDescriptionCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 91;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.RatingCompat;
        Object obj5 = this.read;
        Object obj6 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaDescriptionCompat;
        Object obj7 = this.write;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            BubbleContentKt.write((String) obj7, (String) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (androidx.compose.ui.Modifier) obj3, (extractAuthorizationHeader) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        if (i4 != 1) {
            ((Integer) obj2).getClass();
            r8lambdamozw6ZoaAoZNw1t4cWNRQL95S0U.RemoteActionCompatParcelizer((r8lambdaomj_unyZPrJ1UpAaUuFSp7i4jfc) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (androidx.compose.ui.Modifier) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            int i6 = MediaMetadataCompat + 35;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 61 / 0;
            }
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5);
        ((DragAndDropTargetModifierNode) obj7).RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, this.RatingCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer | 1);
        return createfromparcel;
    }
}
