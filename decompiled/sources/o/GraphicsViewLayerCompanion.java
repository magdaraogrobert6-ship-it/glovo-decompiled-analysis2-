package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public enum GraphicsViewLayerCompanion {
    PANDA_PINK_WHITE,
    FOODORA_PINK,
    YEMEK_PINK_GRAY,
    HUNGERSTATION_MIXED_DARK,
    PEYA_PINK,
    TALABAT_ORANGE,
    GLOVO_YELLOW;

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    public static final GraphicsViewLayerCompanionPlaceholderCanvas1 Companion = new GraphicsViewLayerCompanionPlaceholderCanvas1();

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final int getTheme() {
        switch (getCanvasHolder.IconCompatParcelizer[ordinal()]) {
            case 1:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_FoodpandaPink;
            case 2:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_FoodoraPink;
            case 3:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_YemekPinkGrey;
            case 4:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_HungerstationMixedDark;
            case 5:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_PeyaPink;
            case 6:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_TalabatOrange;
            case 7:
                return com.logistics.rider.glovo.R.style.BaseChatTheme_GlovoYellow;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return 0;
        }
    }
}
