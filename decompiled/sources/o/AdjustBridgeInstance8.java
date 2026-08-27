package o;

import android.net.Uri;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.rrds.compose.component.pin.PinDigitDisplayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeInstance8 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ AdjustBridgeInstance8(setNavigationOnClickListener setnavigationonclicklistener, boolean z, Uri uri, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, boolean z3, boolean z4, int i) {
        this.RemoteActionCompatParcelizer = setnavigationonclicklistener;
        this.IconCompatParcelizer = z;
        this.MediaDescriptionCompat = uri;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = z2;
        this.serializer = z3;
        this.MediaSessionCompatQueueItem = z4;
        this.RatingCompat = i;
    }

    public /* synthetic */ AdjustBridgeInstance8(Character ch, boolean z, boolean z2, boolean z3, boolean z4, androidx.compose.ui.Modifier modifier, String str, int i) {
        this.RemoteActionCompatParcelizer = ch;
        this.IconCompatParcelizer = z;
        this.write = z2;
        this.serializer = z3;
        this.MediaSessionCompatQueueItem = z4;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = str;
        this.RatingCompat = i;
    }

    public /* synthetic */ AdjustBridgeInstance8(boolean z, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, boolean z3, boolean z4, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = setnavigationonclicklistener;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = z2;
        this.serializer = z3;
        this.MediaSessionCompatQueueItem = z4;
        this.MediaDescriptionCompat = modifier;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RatingCompat;
        Object obj3 = this.MediaMetadataCompat;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            PinDigitDisplayKt.PinDigitDisplay((Character) obj5, this.IconCompatParcelizer, this.write, this.serializer, this.MediaSessionCompatQueueItem, (androidx.compose.ui.Modifier) obj4, (String) obj3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            InAppCameraWithTagsKt.CameraView(this.IconCompatParcelizer, (setNavigationOnClickListener) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.write, this.serializer, this.MediaSessionCompatQueueItem, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        InAppCameraWithTagsKt.write((setNavigationOnClickListener) obj5, this.IconCompatParcelizer, (Uri) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, this.write, this.serializer, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
        int i6 = MediaBrowserCompatMediaItem + 59;
        MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
