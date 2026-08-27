package o;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class setAdapter {
    public static CharSequence ab_(BiometricManager.Strings strings) {
        return strings.getPromptMessage();
    }

    public static CharSequence ac_(BiometricManager.Strings strings) {
        return strings.getSettingName();
    }

    public static BiometricManager.Strings ad_(BiometricManager biometricManager, int i) {
        return biometricManager.getStrings(i);
    }
}
