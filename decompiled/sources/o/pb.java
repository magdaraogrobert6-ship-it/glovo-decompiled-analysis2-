package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.sentiance.core.model.events.H$b;
import java.util.Arrays;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class pb {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final H$b MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final transferSessionPackageI MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final String serializer;
    public final FormBody.Builder write;

    /* JADX WARN: Multi-variable type inference failed */
    public pb(asComposePaint ascomposepaint, transferSessionPackageI transfersessionpackagei, FormBody.Builder builder, getQueryContext getquerycontext, setTransactionSuccessful settransactionsuccessful, H$b h$b) {
        transfersessionpackagei.getClass();
        builder.getClass();
        getquerycontext.getClass();
        settransactionsuccessful.getClass();
        h$b.getClass();
        this.MediaMetadataCompat = transfersessionpackagei;
        this.write = builder;
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaBrowserCompatMediaItem = h$b;
        this.RemoteActionCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_expires_label);
        this.serializer = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_time_format);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new pf("", 0L, false, false, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_instruction), "", settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_select_number_label), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_open_app_button), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_confirm_button), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_restriction_title), new androidx.compose.ui.text.AnnotatedString(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.nafath_verification_warning_body), null, 2, null == true ? 1 : 0)));
        this.read = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        this.IconCompatParcelizer = StateFlowKt.read(0L);
        BuildersKt.RemoteActionCompatParcelizer(ascomposepaint, null, null, new NafathModalUiModelImpl$1(this, null, 0), 3);
    }

    public final String serializer(long j) {
        int i = 2 % 2;
        int i2 = ParcelableVolumeInfo + 23;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, " ", String.format(java.util.Locale.ROOT, this.serializer, Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2)));
        int i4 = PlaybackStateCompat + 41;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }
}
