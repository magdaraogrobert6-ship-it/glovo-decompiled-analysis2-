package o;

import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsIcons;
import com.roadrunner.delivery.state.StateV3$AcceptData$PromoBonusIcon;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class StaticLayoutFactory_androidKt {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int serializer = 1;

    static {
        int[] iArr = new int[StateV3$AcceptData$BoostedEarningsIcons.values().length];
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BOOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BIG_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BAD_WEATHER.ordinal()] = 4;
            int i = serializer + 1;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[StateV3$AcceptData$PromoBonusIcon.values().length];
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.HOLIDAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.NIGHT.ordinal()] = 2;
            int i3 = serializer + 63;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.RAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.RUSH_HOUR.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[StateV3$AcceptData$PromoBonusIcon.SNOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        read = iArr2;
    }
}
