package o;

import android.content.Context;
import androidx.loader.content.ModernAsyncTask$1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.firebase.Timestamp;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class clearPreviouslyHitModifierNodeCache {
    public static final addHitPathQJqDSyo write = addHitPathQJqDSyo.read(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String read;

    public clearPreviouslyHitModifierNodeCache(Context context, AndroidViewConfigurationApi34 androidViewConfigurationApi34) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        getHandwritingGestureLineMargin.write(context);
        synchronized (Timestamp.Companion.class) {
            if (Timestamp.Companion.IconCompatParcelizer == null) {
                Timestamp.Companion.IconCompatParcelizer = new Timestamp.Companion(0);
            }
        }
        this.read = "common";
        openUri openuri = openUri.read();
        ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(3, this);
        openuri.getClass();
        openUri.IconCompatParcelizer(modernAsyncTask$1);
        openUri openuri2 = openUri.read();
        Objects.requireNonNull(androidViewConfigurationApi34);
        getRootui getrootui = new getRootui(androidViewConfigurationApi34, 0);
        openuri2.getClass();
        openUri.IconCompatParcelizer(getrootui);
        addHitPathQJqDSyo addhitpathqjqdsyo = write;
        if (addhitpathqjqdsyo.containsKey("common")) {
            DynamiteModule.zza(context, (String) addhitpathqjqdsyo.get("common"), false);
        }
    }
}
