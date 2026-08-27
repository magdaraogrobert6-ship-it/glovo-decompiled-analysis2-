package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusProperties implements FocusOwnerImpltakeFocus1, getEnter {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final Object read;

    public FocusProperties(ClipData clipData, int i) {
        this.read = FocusOwnerImplresetFocussuccessfulReset1.bI_(clipData, i);
    }

    @Override // o.getEnter
    public ClipData IconCompatParcelizer() {
        return ((ContentInfo) this.read).getClip();
    }

    @Override // o.getEnter
    public int RemoteActionCompatParcelizer() {
        return ((ContentInfo) this.read).getFlags();
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void RemoteActionCompatParcelizer(Bundle bundle) {
        ((ContentInfo.Builder) this.read).setExtras(bundle);
    }

    @Override // o.getEnter
    public ContentInfo bL_() {
        return (ContentInfo) this.read;
    }

    @Override // o.getEnter
    public int read() {
        return ((ContentInfo) this.read).getSource();
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void serializer(Uri uri) {
        ((ContentInfo.Builder) this.read).setLinkUri(uri);
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public void write(int i) {
        ((ContentInfo.Builder) this.read).setFlags(i);
    }

    @Override // o.FocusOwnerImpltakeFocus1
    public FocusOwnerKt write() {
        return new FocusOwnerKt(new FocusProperties(((ContentInfo.Builder) this.read).build()));
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return super.toString();
        }
        return "ContentInfoCompat{" + ((ContentInfo) this.read) + "}";
    }

    public FocusProperties(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.read = contentInfo;
    }
}
