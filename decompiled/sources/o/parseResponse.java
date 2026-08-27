package o;

import android.net.Uri;
import com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose.TripPlannerItemKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose.QrScannerOverlayKt;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.InAppCameraWithTagsKt;
import com.roadrunner.location.toggle.presentation.LocationToggleFloatingContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class parseResponse implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ boolean MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ isInvalidIndex write;

    public /* synthetic */ parseResponse(setNavigationOnClickListener setnavigationonclicklistener, boolean z, Uri uri, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, int i) {
        this.read = 4;
        this.serializer = setnavigationonclicklistener;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = uri;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = z2;
        this.RatingCompat = i;
    }

    public /* synthetic */ parseResponse(int i, int i2, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z, boolean z2) {
        this.read = i2;
        this.RemoteActionCompatParcelizer = z;
        this.MediaSessionCompatQueueItem = z2;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.IconCompatParcelizer = modifier;
        this.RatingCompat = i;
    }

    public /* synthetic */ parseResponse(toAndroidCapBeK7IIE toandroidcapbek7iie, boolean z, boolean z2, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.read = 1;
        this.serializer = toandroidcapbek7iie;
        this.RemoteActionCompatParcelizer = z;
        this.MediaSessionCompatQueueItem = z2;
        this.IconCompatParcelizer = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RatingCompat = i;
    }

    public /* synthetic */ parseResponse(String str, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, boolean z2, int i) {
        this.read = 0;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = z;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = modifier;
        this.MediaSessionCompatQueueItem = z2;
        this.RatingCompat = i;
    }

    public /* synthetic */ parseResponse(boolean z, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z2, androidx.compose.ui.Modifier modifier, int i) {
        this.read = 3;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = setnavigationonclicklistener;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = z2;
        this.IconCompatParcelizer = modifier;
        this.RatingCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 17;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RatingCompat;
        Object obj4 = this.IconCompatParcelizer;
        isInvalidIndex isinvalidindex = this.write;
        Object obj5 = this.serializer;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            com.roadrunner.rrds.compose.component.forms.CheckboxKt.m5038CheckboxBigPIknLig((String) obj5, this.RemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, (androidx.compose.ui.Modifier) obj4, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            TripPlannerItemKt.read((toAndroidCapBeK7IIE) obj5, this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, (androidx.compose.ui.Modifier) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            QrScannerOverlayKt.TopControlBar(this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, (getEllipsisgIe3tQ8) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3);
            return createfromparcel2;
        }
        if (i3 == 3) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            InAppCameraWithTagsKt.serializer(this.RemoteActionCompatParcelizer, (setNavigationOnClickListener) obj5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, this.MediaSessionCompatQueueItem, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer4);
            int i5 = MediaMetadataCompat + 117;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 != 4) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
            LocationToggleFloatingContentKt.serializer(this.RemoteActionCompatParcelizer, this.MediaSessionCompatQueueItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) isinvalidindex, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5);
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer6 = ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1);
        InAppCameraWithTagsKt.read((setNavigationOnClickListener) obj5, this.RemoteActionCompatParcelizer, (Uri) obj4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) isinvalidindex, this.MediaSessionCompatQueueItem, (getBirthDateFull) obj, iRemoteActionCompatParcelizer6);
        int i7 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return createfromparcel2;
        }
        throw null;
    }
}
