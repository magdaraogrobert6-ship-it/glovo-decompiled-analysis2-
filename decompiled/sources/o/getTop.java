package o;

import android.content.res.Resources;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public enum getTop {
    Cut(foldOut.serializer, android.R.string.cut, android.R.attr.actionModeCutDrawable),
    Copy(foldOut.write, android.R.string.copy, android.R.attr.actionModeCopyDrawable),
    Paste(foldOut.read, android.R.string.paste, android.R.attr.actionModePasteDrawable),
    SelectAll(foldOut.IconCompatParcelizer, android.R.string.selectAll, android.R.attr.actionModeSelectAllDrawable),
    Autofill(foldOut.RemoteActionCompatParcelizer, android.R.string.autofill, 0);

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static int IconCompatParcelizer = 1;
    private static int read;
    private static byte write;
    private final int drawableId;
    private final Object key;
    private final int stringId;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getDrawableId-3I4p1mQ, reason: not valid java name */
    public final int m5152getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: getStringId-9Hzcbyc, reason: not valid java name */
    public final int m5153getStringId9Hzcbyc() {
        return this.stringId;
    }

    getTop(Object obj, int i, int i2) {
        this.key = obj;
        this.stringId = i;
        this.drawableId = i2;
    }

    static {
        write();
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    }

    public final String resolvedString(getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 119;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String string = ((Resources) ((getPostalCode) getbirthdatefull).write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources())).getString(this.stringId);
        if (string.startsWith("%('")) {
            int i5 = read + 79;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        int i7 = IconCompatParcelizer + 21;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return string;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    static void write() {
        write = (byte) -112;
    }
}
