package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class accessanyjd {
    public final int IconCompatParcelizer;
    public final int read;
    public final androidx.compose.ui.text.TextLayoutResult serializer;
    public final int write;

    public final accessfoldInjd IconCompatParcelizer(int i) {
        return new accessfoldInjd(DataStoreUtilsc.write(this.serializer, i), i, 1L);
    }

    public accessanyjd(int i, int i2, int i3, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.write = i3;
        this.serializer = textLayoutResult;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
        int i = this.read;
        sb.append(i);
        sb.append('-');
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.serializer;
        sb.append(DataStoreUtilsc.write(textLayoutResult, i));
        sb.append(',');
        int i2 = this.IconCompatParcelizer;
        sb.append(i2);
        sb.append('-');
        sb.append(DataStoreUtilsc.write(textLayoutResult, i2));
        sb.append("), prevOffset=");
        return af$$ExternalSyntheticOutline0.m(sb, this.write, ')');
    }
}
