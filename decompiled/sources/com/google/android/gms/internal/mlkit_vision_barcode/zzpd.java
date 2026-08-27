package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.view.PendingValue;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.NavArgsLazy;
import com.google.android.gms.net.zza;
import com.sentiance.core.model.thrift.k$c;
import java.io.IOException;
import o.DrawModifierNodeKt;
import o.InlineChildren;
import o.StretchedVideoResolutionQuirk;
import o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import o.VideoQualityQuirk;
import o.getCurrentContentInsetRight;
import o.getTrackDrawable;
import o.getViewportSizeYbymL2g;
import o.minIntrinsicWidth;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpd {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static StretchedVideoResolutionQuirk write(Context context) {
        DrawModifierNodeKt drawModifierNodeKtWrite;
        context.getClass();
        k$c k_c = minIntrinsicWidth.IconCompatParcelizer.read;
        synchronized (k_c.RemoteActionCompatParcelizer) {
            drawModifierNodeKtWrite = (VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk) k_c.write;
            if (drawModifierNodeKtWrite == null) {
                getCurrentContentInsetRight getcurrentcontentinsetright = new getCurrentContentInsetRight(context, null);
                int i = 10;
                StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer((DrawModifierNodeKt) k_c.IconCompatParcelizer), new StreamSharing$$ExternalSyntheticLambda0(i, new InlineChildren(2, getcurrentcontentinsetright)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                k_c.write = stretchedVideoResolutionQuirkSerializer;
                NavArgsLazy navArgsLazy = new NavArgsLazy(k_c, getcurrentcontentinsetright, context, i);
                stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new zza(stretchedVideoResolutionQuirkSerializer, 1, navArgsLazy), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) stretchedVideoResolutionQuirkSerializer);
            }
        }
        getTrackDrawable gettrackdrawable = new getTrackDrawable(26, new getViewportSizeYbymL2g(3));
        return VideoQualityQuirk.serializer(drawModifierNodeKtWrite, new PendingValue(5, gettrackdrawable), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public static final boolean read(Throwable th) {
        int i;
        int i2 = 2 % 2;
        if (th instanceof IOException) {
            int i3 = RemoteActionCompatParcelizer + 105;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
        if (th instanceof HttpException) {
            int i5 = write + 83;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i = ((HttpException) th).read;
                if (i >= 27576) {
                    return true;
                }
            } else {
                i = ((HttpException) th).read;
                if (i >= 500) {
                    return true;
                }
            }
            if (i == 429 || i == 408) {
                return true;
            }
        }
        int i6 = RemoteActionCompatParcelizer + 65;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
