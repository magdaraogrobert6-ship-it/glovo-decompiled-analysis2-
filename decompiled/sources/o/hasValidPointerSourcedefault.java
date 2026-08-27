package o;

import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.CaptchaWebViewKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hasValidPointerSourcedefault implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ isInvalidIndex MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 1;

    public /* synthetic */ hasValidPointerSourcedefault(String str, androidx.compose.ui.Modifier modifier, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i) {
        this.serializer = str;
        this.read = modifier;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaMetadataCompat = i;
    }

    public /* synthetic */ hasValidPointerSourcedefault(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, long j, hasPhysicalKeyboard hasphysicalkeyboard, androidx.compose.animation.core.Animatable animatable, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = j;
        this.read = hasphysicalkeyboard;
        this.RemoteActionCompatParcelizer = animatable;
        this.MediaBrowserCompatMediaItem = dragAndDropTargetModifierNode;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        isInvalidIndex isinvalidindex = this.MediaBrowserCompatMediaItem;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.read;
        Object obj5 = this.serializer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            isAutomotiveDevice.m5154ModalBottomSheetDialogsW7UJKQ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, this.IconCompatParcelizer, (hasPhysicalKeyboard) obj4, (androidx.compose.animation.core.Animatable) obj3, (DragAndDropTargetModifierNode) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        CaptchaWebViewKt.CaptchaWebView((String) obj5, (androidx.compose.ui.Modifier) obj4, this.IconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = RatingCompat + 21;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
