package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class createCharSequence {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final decode serializer;
    public final FontEj4NQ78default write;

    public createCharSequence(FontEj4NQ78default fontEj4NQ78default, decode decodeVar) {
        decodeVar.getClass();
        fontEj4NQ78default.getClass();
        this.serializer = decodeVar;
        this.write = fontEj4NQ78default;
    }

    public final LinkedHashMap write() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            FontEj4NQ78default fontEj4NQ78default = this.write;
            fontEj4NQ78default.write();
            boolean z = ((getStrictnessusljTpc) fontEj4NQ78default.IconCompatParcelizer.read.read()) instanceof getHeadingrAG3T2kannotations;
            throw null;
        }
        FontEj4NQ78default fontEj4NQ78default2 = this.write;
        safeSetClipToOutline safesetcliptooutlineWrite = fontEj4NQ78default2.write();
        if (!(((getStrictnessusljTpc) fontEj4NQ78default2.IconCompatParcelizer.read.read()) instanceof getHeadingrAG3T2kannotations)) {
            str = "false";
            int i3 = RemoteActionCompatParcelizer + 95;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            str = "true";
        }
        Map mapSingletonMap = Collections.singletonMap("is_navigation", str);
        mapSingletonMap.getClass();
        return onMove.RemoteActionCompatParcelizer(safesetcliptooutlineWrite, mapSingletonMap);
    }
}
