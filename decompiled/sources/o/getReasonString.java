package o;

import io.sentry.util.UrlUtils;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getReasonString implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ long MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSourceImpl RatingCompat;
    public final /* synthetic */ extractAuthorizationHeader RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getReasonString(int i, int i2, long j, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, androidx.compose.ui.Modifier modifier, extractAuthorizationHeader extractauthorizationheader, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = extractauthorizationheader;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = modifier;
        this.IconCompatParcelizer = z;
        this.RatingCompat = mutableInteractionSourceImpl;
        this.MediaSessionCompatQueueItem = i;
        this.MediaBrowserCompatMediaItem = j;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z2 = false;
        if (i2 != 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i3 = MediaMetadataCompat + 63;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                this.RemoteActionCompatParcelizer.getClass();
                getpostalcode.serializer(114772490);
                SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer = UrlUtils.IconCompatParcelizer(500L, getpostalcode, 0).IconCompatParcelizer(this.read);
                getpostalcode.IconCompatParcelizer(false);
                androidx.compose.material3.IconButtonKt.IconCompatParcelizer(sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer, this.serializer, this.IconCompatParcelizer, null, this.RatingCompat, null, coil3.ExtrasKt.write(383420521, new getWaitingTime(this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem), getpostalcode), getpostalcode, 1572864, 40);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if ((iIntValue2 & 3) != 2) {
            int i5 = MediaMetadataCompat + 59;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaDescriptionCompat = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 99;
            MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z2 = true;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(1 & iIntValue2, z2)) {
            AndroidContentCaptureManagerCompanion.read(getFartKroMQ.RemoteActionCompatParcelizer.write(Boolean.FALSE), coil3.ExtrasKt.write(-266278069, new getReasonString(this.MediaSessionCompatQueueItem, 1, this.MediaBrowserCompatMediaItem, this.RatingCompat, this.serializer, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer), getpostalcode2), getpostalcode2, 56);
            int i10 = MediaDescriptionCompat + 125;
            MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 3 / 4;
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
