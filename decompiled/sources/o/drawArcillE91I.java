package o;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class drawArcillE91I implements drawImage9jGpkUE {
    public final Context RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            return computeVerticalBoundsdefault.IconCompatParcelizer((Uri) obj);
        }
        if (i != 1) {
            Uri uri = (Uri) obj;
            return computeVerticalBoundsdefault.IconCompatParcelizer(uri) && uri.getPathSegments().contains("video");
        }
        Uri uri2 = (Uri) obj;
        return computeVerticalBoundsdefault.IconCompatParcelizer(uri2) && !uri2.getPathSegments().contains("video");
    }

    public drawArcillE91I(Context context, int i) {
        this.serializer = i;
        if (i == 1) {
            this.RemoteActionCompatParcelizer = context.getApplicationContext();
        } else if (i != 2) {
            this.RemoteActionCompatParcelizer = context;
        } else {
            this.RemoteActionCompatParcelizer = context.getApplicationContext();
        }
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        Long l;
        int i3 = this.serializer;
        Context context = this.RemoteActionCompatParcelizer;
        int i4 = 1;
        if (i3 == 0) {
            Uri uri = (Uri) obj;
            return new drawLine1RTmtNc(new translatedefault(uri), new configurePaintswdJneE(context, i4, uri));
        }
        if (i3 == 1) {
            Uri uri2 = (Uri) obj;
            if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                return null;
            }
            return new drawLine1RTmtNc(new translatedefault(uri2), com.bumptech.glide.load.data.mediastore.ThumbFetcher.read(context, uri2, new r8lambda2VX7w3NqocckTJShR9pmH9v5PwI(context.getContentResolver(), 0)));
        }
        Uri uri3 = (Uri) obj;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) geteotffuncui_graphics.serializer(com.bumptech.glide.load.resource.bitmap.VideoDecoder.RemoteActionCompatParcelizer)) == null || l.longValue() != -1) {
            return null;
        }
        return new drawLine1RTmtNc(new translatedefault(uri3), com.bumptech.glide.load.data.mediastore.ThumbFetcher.read(context, uri3, new r8lambda2VX7w3NqocckTJShR9pmH9v5PwI(context.getContentResolver(), 1)));
    }
}
