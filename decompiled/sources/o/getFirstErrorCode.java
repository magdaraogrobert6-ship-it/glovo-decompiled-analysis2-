package o;

import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class getFirstErrorCode {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final isOpenInternalroom_runtime IconCompatParcelizer;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final decode serializer;
    public final transferSessionPackageI write;

    public getFirstErrorCode(decode decodeVar, isOpenInternalroom_runtime isopeninternalroom_runtime, transferSessionPackageI transfersessionpackagei, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        decodeVar.getClass();
        isopeninternalroom_runtime.getClass();
        transfersessionpackagei.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.serializer = decodeVar;
        this.IconCompatParcelizer = isopeninternalroom_runtime;
        this.write = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        this.read = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(27, this));
    }

    public final void read(String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 71;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer("rider_safety_try_".concat(str), null);
            int i3 = 56 / 0;
        } else {
            RemoteActionCompatParcelizer("rider_safety_try_".concat(str), null);
        }
        int i4 = MediaDescriptionCompat + 115;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(String str, Map map) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 123;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((Boolean) this.read.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
            int i4 = RatingCompat + 31;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                write(str, map);
            } else {
                write(str, map);
                int i5 = 41 / 0;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        RemoteActionCompatParcelizer("rider_safety_try_" + str + "_ok", null);
        int i2 = MediaDescriptionCompat + 45;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        RemoteActionCompatParcelizer("rider_safety_try_" + str + "_err", null);
        int i2 = MediaDescriptionCompat + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void write(String str, Map map) {
        int i = 2 % 2;
        ((inCompatibilityMode) this.IconCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathTimerDataStore$set$2(this, str, map, null, 14), 2);
        int i2 = RatingCompat + 65;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}
