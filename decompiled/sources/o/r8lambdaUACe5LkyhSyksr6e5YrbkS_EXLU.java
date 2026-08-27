package o;

import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaUACe5LkyhSyksr6e5YrbkS_EXLU {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static NavigationSettingsFragment serializer() {
        int i = 2 % 2;
        NavigationSettingsFragment navigationSettingsFragment = new NavigationSettingsFragment();
        int i2 = serializer + 35;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return navigationSettingsFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
