package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageDetailsKt;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureCommonKt;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SingleThreadCachedScheduler1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ isInvalidIndex RemoteActionCompatParcelizer;
    public final /* synthetic */ boolean read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write = 3;

    public /* synthetic */ SingleThreadCachedScheduler1(int i, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, getPushAlert getpushalert, int i2, int i3) {
        this.MediaBrowserCompatMediaItem = i;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.read = z;
        this.IconCompatParcelizer = getpushalert;
        this.MediaDescriptionCompat = i2;
        this.RatingCompat = i3;
    }

    public /* synthetic */ SingleThreadCachedScheduler1(int i, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i2, int i3) {
        this.MediaBrowserCompatMediaItem = i;
        this.read = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.IconCompatParcelizer = dragAndDropTargetModifierNode;
        this.MediaDescriptionCompat = i2;
        this.RatingCompat = i3;
    }

    public /* synthetic */ SingleThreadCachedScheduler1(getImm getimm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, boolean z, int i2, int i3) {
        this.IconCompatParcelizer = getimm;
        this.MediaBrowserCompatMediaItem = i;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = modifier;
        this.read = z;
        this.MediaDescriptionCompat = i2;
        this.RatingCompat = i3;
    }

    public /* synthetic */ SingleThreadCachedScheduler1(String str, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.IconCompatParcelizer = str;
        this.read = z;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.MediaBrowserCompatMediaItem = i;
        this.MediaDescriptionCompat = i2;
        this.RatingCompat = i3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaDescriptionCompat;
        Object obj3 = this.IconCompatParcelizer;
        isInvalidIndex isinvalidindex = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            ChipsKt.RemoteActionCompatParcelizer((String) obj3, this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.serializer, this.MediaBrowserCompatMediaItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.RatingCompat);
            int i4 = MediaSessionCompatQueueItem + 51;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcel;
            }
            throw null;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            ImageDetailsKt.read((getImm) obj3, this.MediaBrowserCompatMediaItem, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, this.serializer, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.RatingCompat);
            return createfromparcel;
        }
        if (i2 != 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            HeaderKt.read(this.MediaBrowserCompatMediaItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.serializer, this.read, (getPushAlert) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.RatingCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        EntrancePictureCommonKt.write(this.MediaBrowserCompatMediaItem, this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, this.serializer, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4, this.RatingCompat);
        int i5 = MediaMetadataCompat + 105;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
