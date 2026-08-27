package o;

import android.view.textclassifier.TextClassification;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getFactory extends getInnerui {
    public final TextClassification IconCompatParcelizer;
    public final int read;

    public getFactory(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.IconCompatParcelizer = textClassification;
        this.read = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.serializer);
        sb.append(", textClassification=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", index=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
