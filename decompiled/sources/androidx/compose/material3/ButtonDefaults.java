package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import o.SensitiveContentNode;
import o.getBirthDateFull;
import o.getNewPassword;
import o.getPostalCode;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.plusAssign;

/* JADX INFO: loaded from: classes.dex */
public abstract class ButtonDefaults {
    public static final float RemoteActionCompatParcelizer;
    public static final float read;
    public static final o.SwitchDefaults serializer;

    static {
        float f = BaselineButtonTokens.serializer;
        float f2 = BaselineButtonTokens.RemoteActionCompatParcelizer;
        float fM3673constructorimpl = Dp.m3673constructorimpl(16.0f);
        float f3 = ButtonSmallTokens.read;
        float fM3673constructorimpl2 = Dp.m3673constructorimpl(8.0f);
        new o.SwitchDefaults(f, fM3673constructorimpl2, f2, fM3673constructorimpl2);
        PaddingKt.IconCompatParcelizer(fM3673constructorimpl, fM3673constructorimpl2, f2, fM3673constructorimpl2);
        float fM3673constructorimpl3 = Dp.m3673constructorimpl(12.0f);
        serializer = new o.SwitchDefaults(fM3673constructorimpl3, fM3673constructorimpl2, fM3673constructorimpl3, fM3673constructorimpl2);
        PaddingKt.IconCompatParcelizer(fM3673constructorimpl3, fM3673constructorimpl2, Dp.m3673constructorimpl(16.0f), fM3673constructorimpl2);
        read = Dp.m3673constructorimpl(58.0f);
        RemoteActionCompatParcelizer = ButtonSmallTokens.read;
        Dp.m3673constructorimpl(18.0f);
    }

    public static SensitiveContentNode IconCompatParcelizer(float f, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            f = plusAssign.read;
        }
        float f6 = f;
        if ((i & 2) != 0) {
            f2 = plusAssign.ParcelableVolumeInfo;
        }
        float f7 = f2;
        if ((i & 4) != 0) {
            f3 = plusAssign.MediaBrowserCompatMediaItem;
        }
        float f8 = f3;
        if ((i & 8) != 0) {
            f4 = plusAssign.MediaSessionCompatQueueItem;
        }
        float f9 = f4;
        if ((i & 16) != 0) {
            f5 = plusAssign.RemoteActionCompatParcelizer;
        }
        return new SensitiveContentNode(f6, f7, f8, f9, f5);
    }

    public static ButtonColors RemoteActionCompatParcelizer(long j, long j2, long j3, long j4, getBirthDateFull getbirthdatefull, int i) {
        long jM758getUnspecified0d7_KjU = (i & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j2;
        long jM758getUnspecified0d7_KjU2 = (i & 4) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j3;
        long jM758getUnspecified0d7_KjU3 = (i & 8) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j4;
        getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) ((getPostalCode) getbirthdatefull).write((getNewPassword) getWindowPosturem18o9QQ.serializer);
        ButtonColors buttonColors = getviewingdistancetkromq.write;
        if (buttonColors == null) {
            buttonColors = new ButtonColors(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, plusAssign.IconCompatParcelizer), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, plusAssign.RatingCompat), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, plusAssign.serializer), plusAssign.write, 0.0f, 0.0f, 0.0f, 14, null), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, plusAssign.MediaMetadataCompat), plusAssign.MediaDescriptionCompat, 0.0f, 0.0f, 0.0f, 14, null));
            getviewingdistancetkromq.write = buttonColors;
        }
        return buttonColors.m113copyjRlVdoo(j, jM758getUnspecified0d7_KjU, jM758getUnspecified0d7_KjU2, jM758getUnspecified0d7_KjU3);
    }
}
