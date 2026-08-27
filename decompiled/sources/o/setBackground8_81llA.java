package o;

import coil3.disk.DiskLruCache$Editor;

/* JADX INFO: loaded from: classes2.dex */
public final class setBackground8_81llA {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final /* synthetic */ com.huawei.wisesecurity.ucs_credential.x serializer;
    public final getFontSynthesisZQGJjVo write;

    public final int serializer() {
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo = this.write;
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2 = getFontSynthesisZQGJjVo.BYTE;
        int i = this.RemoteActionCompatParcelizer;
        if (getfontsynthesiszqgjjvo != getfontsynthesiszqgjjvo2) {
            return i;
        }
        DiskLruCache$Editor diskLruCache$Editor = (DiskLruCache$Editor) this.serializer.IconCompatParcelizer;
        getFontFamily getfontfamily = (getFontFamily) diskLruCache$Editor.RemoteActionCompatParcelizer;
        String str = (String) diskLruCache$Editor.write;
        int i2 = this.read;
        return str.substring(i2, i + i2).getBytes(getfontfamily.RemoteActionCompatParcelizer[this.IconCompatParcelizer].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo = this.write;
        sb.append(getfontsynthesiszqgjjvo);
        sb.append('(');
        getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo2 = getFontSynthesisZQGJjVo.ECI;
        DiskLruCache$Editor diskLruCache$Editor = (DiskLruCache$Editor) this.serializer.IconCompatParcelizer;
        if (getfontsynthesiszqgjjvo == getfontsynthesiszqgjjvo2) {
            getFontFamily getfontfamily = (getFontFamily) diskLruCache$Editor.RemoteActionCompatParcelizer;
            sb.append(getfontfamily.RemoteActionCompatParcelizer[this.IconCompatParcelizer].charset().displayName());
        } else {
            String str = (String) diskLruCache$Editor.write;
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.read;
            String strSubstring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) < ' ' || strSubstring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }

    public setBackground8_81llA(com.huawei.wisesecurity.ucs_credential.x xVar, getFontSynthesisZQGJjVo getfontsynthesiszqgjjvo, int i, int i2, int i3) {
        this.serializer = xVar;
        this.write = getfontsynthesiszqgjjvo;
        this.read = i;
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = i3;
    }
}
