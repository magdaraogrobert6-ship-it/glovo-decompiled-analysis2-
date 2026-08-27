package o;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class removeSingleSubscription {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    public static final void IconCompatParcelizer(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        logpushdeliveryandroid_sdk_base_release.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(563832832);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 90 / 0;
                if (getpostalcode.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release)) {
                    i3 = IconCompatParcelizer + 41;
                    RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        i4 = 3;
                    } else {
                        i4 = 4;
                    }
                } else {
                    int i10 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i4 = 2;
                }
            } else if (getpostalcode.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release)) {
                i3 = IconCompatParcelizer + 41;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    i4 = 3;
                } else {
                    i4 = 4;
                }
            } else {
                int i12 = RemoteActionCompatParcelizer + 71;
                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        int i14 = i2 | 384;
        if ((i14 & 147) != 146) {
            int i15 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(companion, 1.0f);
            io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem;
            float f = Dimensions.setSplitBackground;
            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
            androidx.compose.foundation.layout.FlowLayoutKt.serializer(modifierWrite, androidx.compose.foundation.layout.Arrangement.serializer(f, companion2.getCenterHorizontally()), new snapElevation(f, false, new StreamSharing$$ExternalSyntheticLambda0(15, companion2.getCenterVertically())), null, 0, 0, coil3.ExtrasKt.write(296569915, new PagerDefaults$$ExternalSyntheticLambda0(logpushdeliveryandroid_sdk_base_release, 24, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode), getpostalcode, 1572864, 56);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i17 = RemoteActionCompatParcelizer + 95;
        IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i18 = i17 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new refreshFeatureFlags(logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 0);
        }
    }
}
