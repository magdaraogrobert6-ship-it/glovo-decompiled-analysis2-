package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class getExitannotations implements FocusOwnerImpltakeFocus1, getEnter {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Uri read;
    public ClipData serializer;
    public Bundle write;

    public getExitannotations(getExitannotations getexitannotations) {
        ClipData clipData = getexitannotations.serializer;
        clipData.getClass();
        this.serializer = clipData;
        int i = getexitannotations.RatingCompat;
        coil3.util.UtilsKt.serializer("source", i, 0, 5);
        this.RatingCompat = i;
        int i2 = getexitannotations.RemoteActionCompatParcelizer;
        if ((i2 & 1) != i2) {
            DrawableTransformation.RemoteActionCompatParcelizer("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.RemoteActionCompatParcelizer = i2;
        this.read = getexitannotations.read;
        this.write = getexitannotations.write;
    }

    @Override // o.getEnter
    public ClipData IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.getEnter
    public int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void RemoteActionCompatParcelizer(Bundle bundle) {
        this.write = bundle;
    }

    @Override // o.getEnter
    public ContentInfo bL_() {
        return null;
    }

    @Override // o.getEnter
    public int read() {
        return this.RatingCompat;
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void serializer(Uri uri) {
        this.read = uri;
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void write(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public FocusOwnerKt write() {
        return new FocusOwnerKt(new getExitannotations(this));
    }

    public String toString() {
        String strValueOf;
        String str;
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        Uri uri = this.read;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.serializer.getDescription());
        sb.append(", source=");
        int i = this.RatingCompat;
        if (i == 0) {
            strValueOf = "SOURCE_APP";
        } else if (i == 1) {
            strValueOf = "SOURCE_CLIPBOARD";
        } else if (i == 2) {
            strValueOf = "SOURCE_INPUT_METHOD";
        } else if (i == 3) {
            strValueOf = "SOURCE_DRAG_AND_DROP";
        } else if (i != 4) {
            strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        } else {
            strValueOf = "SOURCE_AUTOFILL";
        }
        sb.append(strValueOf);
        sb.append(", flags=");
        int i2 = this.RemoteActionCompatParcelizer;
        sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        if (uri == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + uri.toString().length() + ")";
        }
        sb.append(str);
        return ff$$ExternalSyntheticOutline0.m(sb, this.write != null ? ", hasExtras" : "", "}");
    }

    public /* synthetic */ getExitannotations() {
    }
}
