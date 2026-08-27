package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class getUnknownCS__XNY {
    public final processDragGesture read;

    public getUnknownCS__XNY(processDragGesture processdraggesture) {
        this.read = processdraggesture;
    }

    public final String serializer(Uri uri, String str) {
        processDragGesture processdraggesture = uri != null ? (processDragGesture) this.read.get(uri.toString()) : null;
        if (processdraggesture == null) {
            return null;
        }
        return (String) processdraggesture.get("".concat(str));
    }
}
