package o;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createRefs {
    public static String[] write(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static FocusOwnerKt serializer(View view, FocusOwnerKt focusOwnerKt) {
        ContentInfo contentInfoBL_ = focusOwnerKt.IconCompatParcelizer.bL_();
        Objects.requireNonNull(contentInfoBL_);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoBL_);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoBL_ ? focusOwnerKt : new FocusOwnerKt(new FocusProperties(contentInfoPerformReceiveContent));
    }
}
