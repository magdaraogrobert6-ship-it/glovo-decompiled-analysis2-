package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getTypeZmokQxo {
    public static final ImageKt IconCompatParcelizer = new ImageKt(0);

    public static Uri serializer() {
        synchronized (getTypeZmokQxo.class) {
            ImageKt imageKt = IconCompatParcelizer;
            Uri uri = (Uri) imageKt.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            imageKt.put("com.google.android.gms.measurement", uri2);
            return uri2;
        }
    }
}
