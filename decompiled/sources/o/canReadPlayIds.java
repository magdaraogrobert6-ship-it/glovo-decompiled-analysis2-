package o;

import io.sentry.util.UrlUtils;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class canReadPlayIds {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final androidx.compose.ui.Modifier read(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, localError localerror, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        int i2 = 2 % 2;
        modifier.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        if ((i & 1) != 0) {
            int i3 = IconCompatParcelizer + 47;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 16 / 0;
            }
            mutableInteractionSourceImpl2 = null;
        } else {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        if ((i & 2) != 0) {
            int i5 = read + 117;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            localerror = UrlUtils.IconCompatParcelizer(500L, getbirthdatefull, 0);
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
        localerror.getClass();
        return modifier.then(androidx.compose.foundation.ClickableKt.serializer(companion, mutableInteractionSourceImpl2, null, z2, null, new SealedClassSerializer$$ExternalSyntheticLambda0(localerror, 14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0)));
    }
}
