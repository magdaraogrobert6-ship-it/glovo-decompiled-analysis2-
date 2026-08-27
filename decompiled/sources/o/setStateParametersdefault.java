package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class setStateParametersdefault {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final LinkedHashMap IconCompatParcelizer;
    public final resetOutlineParams serializer;

    public setStateParametersdefault(resetOutlineParams resetoutlineparams) {
        resetoutlineparams.getClass();
        this.serializer = resetoutlineparams;
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    public final setParameterizedContent serializer(long j, String str) {
        int i = 2 % 2;
        str.getClass();
        setParameterizedContent setparameterizedcontent = (setParameterizedContent) this.IconCompatParcelizer.get(new setParameterizedContentlambda0(j, str));
        if (setparameterizedcontent == null) {
            StringBuilder sb = getBitmapFromCache.read("Image does not exist for delivery id : ", ", taskId : ", j, str);
            sb.append(" and, sequence : 0");
            throw new IllegalStateException(sb.toString().toString());
        }
        int i2 = RemoteActionCompatParcelizer + 79;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return setparameterizedcontent;
    }
}
