package o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambda2VX7w3NqocckTJShR9pmH9v5PwI {
    public static final String[] IconCompatParcelizer = {"_data"};
    public static final String[] RemoteActionCompatParcelizer = {"_data"};
    public final /* synthetic */ int serializer;
    public final ContentResolver write;

    public /* synthetic */ r8lambda2VX7w3NqocckTJShR9pmH9v5PwI(ContentResolver contentResolver, int i) {
        this.serializer = i;
        this.write = contentResolver;
    }

    public final Cursor write(Uri uri) {
        if (this.serializer != 0) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.write.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, RemoteActionCompatParcelizer, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
        String lastPathSegment2 = uri.getLastPathSegment();
        return this.write.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, IconCompatParcelizer, "kind = 1 AND image_id = ?", new String[]{lastPathSegment2}, null);
    }
}
