package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class DrawWithContentModifier {
    public int IconCompatParcelizer;
    public float read;
    public String serializer;
    public int write;

    public final String write() {
        return this.serializer;
    }

    public final DrawWithContentModifier RemoteActionCompatParcelizer() {
        DrawWithContentModifier drawWithContentModifier = new DrawWithContentModifier();
        drawWithContentModifier.write = Integer.MIN_VALUE;
        drawWithContentModifier.read = Float.NaN;
        drawWithContentModifier.serializer = this.serializer;
        drawWithContentModifier.IconCompatParcelizer = this.IconCompatParcelizer;
        drawWithContentModifier.write = this.write;
        drawWithContentModifier.read = this.read;
        return drawWithContentModifier;
    }

    public final String toString() {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.serializer, ':');
        switch (this.IconCompatParcelizer) {
            case 900:
                StringBuilder sbM = d$$ExternalSyntheticOutline0.m(strM);
                sbM.append(this.write);
                return sbM.toString();
            case 901:
                StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m(strM);
                sbM2.append(this.read);
                return sbM2.toString();
            case 902:
                return strM.concat(RemoteActionCompatParcelizer(this.write));
            case 903:
                return strM.concat("null");
            default:
                return strM.concat("????");
        }
    }

    public static String RemoteActionCompatParcelizer(int i) {
        String str = "00000000" + Integer.toHexString(i);
        return "#".concat(str.substring(str.length() - 8));
    }
}
