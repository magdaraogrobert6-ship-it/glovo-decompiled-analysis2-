package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComposePausableCompositionException {
    public static final setCurrent write;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        setCurrent setcurrent;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                setcurrent = new setCurrent();
            } else {
                setcurrent = null;
            }
        } else {
            setcurrent = null;
        }
        write = setcurrent;
    }
}
