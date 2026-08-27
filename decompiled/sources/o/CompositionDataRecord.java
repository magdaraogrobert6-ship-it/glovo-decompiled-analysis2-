package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CompositionDataRecord {
    private static int serializer = 0;
    private static int write = 1;

    public static final void write(ComposeViewAdapterprocessViewInfos2 composeViewAdapterprocessViewInfos2, androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        pagerState.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(667280352);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(composeViewAdapterprocessViewInfos2);
            } else {
                int i5 = serializer + 9;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                zIconCompatParcelizer = getpostalcode.read(composeViewAdapterprocessViewInfos2);
            }
            if (zIconCompatParcelizer) {
                int i7 = write + 1;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            int i8 = write + 89;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(pagerState) ? 32 : 16;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = write + 13;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.material3.SurfaceKt.m126SurfaceT9BRK9s(null, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaDescriptionCompat(), 0L, 0.0f, Dimensions.getNestedScrollAxes, null, coil3.ExtrasKt.write(2143174565, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(companion, composeViewAdapterprocessViewInfos2.read, pagerState, 9), getpostalcode), getpostalcode, 12582912, 91);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 0, composeViewAdapterprocessViewInfos2, pagerState, modifier2);
        }
    }
}
