package o;

import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.compose.QrCodeComposableKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeInstance17 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ float IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ isInvalidIndex read;
    public final /* synthetic */ isInvalidIndex serializer;
    public final /* synthetic */ int write = 0;

    public /* synthetic */ AdjustBridgeInstance17(float f, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = dragAndDropTargetModifierNode;
        this.serializer = dragAndDropTargetModifierNode2;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ AdjustBridgeInstance17(String str, float f, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = f;
        this.MediaBrowserCompatMediaItem = modifier;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        isInvalidIndex isinvalidindex = this.serializer;
        isInvalidIndex isinvalidindex2 = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            QrCodeComposableKt.m4947QrCodeComposableEUb7tLY((String) obj3, this.IconCompatParcelizer, this.MediaBrowserCompatMediaItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        HeaderKt.HeaderLayout(this.IconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3, (DragAndDropTargetModifierNode) isinvalidindex2, (DragAndDropTargetModifierNode) isinvalidindex, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = MediaSessionCompatQueueItem + 119;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
