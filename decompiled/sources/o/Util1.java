package o;

import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Util1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final /* synthetic */ onViewAttachedToWindow MediaBrowserCompatMediaItem;
    public final /* synthetic */ float MediaMetadataCompat;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 MediaSessionCompatQueueItem;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ getContentViewGroupParentLayout read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ androidx.compose.animation.core.Animatable write;

    public /* synthetic */ Util1(float f, float f2, androidx.compose.animation.core.Animatable animatable, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, onViewAttachedToWindow onviewattachedtowindow, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.read = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = animatable;
        this.RemoteActionCompatParcelizer = f;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaMetadataCompat = f2;
        this.MediaBrowserCompatMediaItem = onviewattachedtowindow;
        this.MediaSessionCompatQueueItem = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new SliderButtonContainerKt$SliderCore$2$1$1$2$1(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.serializer, this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, null), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = MediaDescriptionCompat + 83;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }
}
