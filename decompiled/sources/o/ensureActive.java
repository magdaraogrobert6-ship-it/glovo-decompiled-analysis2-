package o;

import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ensureActive implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ ensureActive(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.RemoteActionCompatParcelizer = z;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 73;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj5 = null;
            obj5.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.IconCompatParcelizer;
        if (i3 != 0) {
            int iIntValue = ((Integer) obj2).intValue();
            ((Integer) obj4).getClass();
            ((ParcelableSnapshotMutableLongState) obj).getClass();
            EntrancePictureScreenKt.read(24576, (getBirthDateFull) obj3, androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f), (String) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.get(iIntValue), this.write, this.read, this.RemoteActionCompatParcelizer);
            int i4 = MediaMetadataCompat + 93;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel2;
        }
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj4).intValue();
        ((ParcelableSnapshotMutableLongState) obj).getClass();
        String str = ((InputMethodManager) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.get(iIntValue2)).RemoteActionCompatParcelizer;
        String str2 = ((InputMethodManager) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.get(iIntValue2)).RatingCompat;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = ((InputMethodManager) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.get(iIntValue2)).MediaSessionCompatQueueItem;
        androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f);
        com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt.PictureBox(iIntValue2, str, str2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, this.RemoteActionCompatParcelizer, this.write, this.read, modifierWrite, (getBirthDateFull) obj3, ((iIntValue3 >> 3) & 14) | 12582912);
        return createfromparcel2;
    }
}
