package o;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorFilterCompanion {
    public static final Object RemoteActionCompatParcelizer;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(androidx.compose.ui.graphics.Fields.RotationX).build();
        RemoteActionCompatParcelizer = new Object();
    }
}
