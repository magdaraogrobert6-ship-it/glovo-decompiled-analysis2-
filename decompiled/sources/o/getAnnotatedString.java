package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnnotatedString {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final toAnnotatedStringdefault read;
    public final MultiParagraph serializer;

    public getAnnotatedString(MultiParagraph multiParagraph, toAnnotatedStringdefault toannotatedstringdefault) {
        multiParagraph.getClass();
        toannotatedstringdefault.getClass();
        this.serializer = multiParagraph;
        this.read = toannotatedstringdefault;
    }

    public final boolean read(Map map) {
        int i = 2 % 2;
        int i2 = write + 11;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            String str = (String) map.get(com.braze.Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (str != null) {
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglcRemoteActionCompatParcelizer = r8lambdaTOIgAPaTrSKFODGuDRy70XAidrI.RemoteActionCompatParcelizer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getLineEnddefault.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                getLineEnddefault getlineenddefault = (getLineEnddefault) r8lambda3kmch7yklpui_5smgazrgczhglcRemoteActionCompatParcelizer.serializer(str, setgraphicmodalmaxwidthdpSerializer);
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) getlineenddefault.RemoteActionCompatParcelizer())) {
                    r8lambdaO_YSfdHciHuI0mnw9W9IwvQNxlE r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer = getlineenddefault.serializer();
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.IconCompatParcelizer()) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.RemoteActionCompatParcelizer())) {
                        int i4 = RemoteActionCompatParcelizer + 65;
                        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.serializer())) {
                            int i6 = write + 113;
                            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.read()) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.write()) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) r8lambdao_ysfdhcihui0mnw9w9iwvqnxleSerializer.MediaBrowserCompatMediaItem())) {
                                int i8 = write + 5;
                                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i8 % 2 == 0) {
                                    int i9 = 3 / 0;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            ((addSpans) this.read).serializer("BRAZE_PUSH_PARSING_ERROR", e);
            int i10 = write + 5;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
    }
}
