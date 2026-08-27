package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class skippedEntity {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static String RemoteActionCompatParcelizer(collectRangeTransitions collectrangetransitions, String str) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            collectrangetransitions.getClass();
            str.getClass();
            collectRangeTransitions collectrangetransitions2 = collectRangeTransitions.PRODUCTION;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        collectrangetransitions.getClass();
        str.getClass();
        if (collectrangetransitions != collectRangeTransitions.PRODUCTION) {
            return "https://helpcenter-stg.usehurrier.com";
        }
        int i3 = serializer + 111;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return ff$$ExternalSyntheticOutline0.m("https://helpcenter-", str, ".usehurrier.com");
    }

    public static String read(collectRangeTransitions collectrangetransitions, String str, String str2) {
        String strM;
        int i = 2 % 2;
        collectrangetransitions.getClass();
        str.getClass();
        if (collectrangetransitions == collectRangeTransitions.PRODUCTION) {
            int i2 = serializer + 19;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            strM = ff$$ExternalSyntheticOutline0.m("https://helpcenter-webclient-", str, ".usehurrier.com");
        } else {
            strM = "https://helpcenter-webclient-stg.usehurrier.com";
        }
        String strConcat = strM.concat(str2);
        int i4 = serializer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strConcat;
        }
        throw null;
    }
}
