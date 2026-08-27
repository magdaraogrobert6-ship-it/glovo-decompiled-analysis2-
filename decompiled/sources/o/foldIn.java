package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class foldIn extends getInnerui {
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final String read;
    public final int write;

    public foldIn(Object obj, String str, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(obj);
        this.read = str;
        this.write = i;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.serializer);
        sb.append(", label=\"");
        sb.append(this.read);
        sb.append("\", leadingIcon=");
        return af$$ExternalSyntheticOutline0.m(sb, this.write, ')');
    }
}
