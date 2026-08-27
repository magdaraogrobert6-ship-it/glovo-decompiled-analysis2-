package o;

import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class dispatchInterceptedSoftKeyboardEventZmokQxo {
    public static void read(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static Icon serializer(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }
}
