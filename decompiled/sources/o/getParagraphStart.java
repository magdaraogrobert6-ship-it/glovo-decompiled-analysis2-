package o;

import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsIcons;
import com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonusIcon;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getParagraphStart {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;
    private static int write;

    static {
        int[] iArr = new int[StateV3$AcceptData$BoostedEarningsIcons.values().length];
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BOOST.ordinal()] = 2;
            int i = serializer + 43;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BIG_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BAD_WEATHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int[] iArr2 = new int[StateV3$AcceptData$PromoBonusIcon.values().length];
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.HOLIDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.NIGHT.ordinal()] = 2;
            int i4 = write + 105;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.RAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.RUSH_HOUR.ordinal()] = 4;
            int i6 = write + 49;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 % 5;
            } else {
                int i8 = 2 % 2;
            }
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.SNOW.ordinal()] = 5;
            int i9 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        IconCompatParcelizer = iArr2;
    }
}
