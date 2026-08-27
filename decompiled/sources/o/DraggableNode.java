package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableNode {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final LinkedHashMap serializer;

    public DraggableNode(int i) {
        if (i == 1) {
            this.serializer = new LinkedHashMap();
        } else if (i != 3) {
            this.serializer = new LinkedHashMap(0, 0.75f, true);
        } else {
            this.serializer = new LinkedHashMap(18);
        }
    }

    public void read(Class cls, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        int i2 = read + 55;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            setNativeShader.RemoteActionCompatParcelizer(mergejsonobjects, "provider");
            this.serializer.put(cls, mergejsonobjects);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setNativeShader.RemoteActionCompatParcelizer(mergejsonobjects, "provider");
        this.serializer.put(cls, mergejsonobjects);
        int i3 = read + 69;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public DraggableNode(qf qfVar) {
        this.serializer = new LinkedHashMap();
    }

    public _get_messageWebView_lambda1 IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) throws EOFException {
        int i = 2 % 2;
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        ArrayList arrayList = new ArrayList(20);
        int i2 = _get_messagewebview_lambda1.code;
        String str = _get_messagewebview_lambda1.message;
        str.getClass();
        r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = _get_messagewebview_lambda1.protocol;
        r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        _get_messageWebView_lambda4 _get_messagewebview_lambda5 = _get_messagewebview_lambda1.read(Long.MAX_VALUE);
        if (i2 >= 0) {
            return new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, str, i2, null, new resetMessageMarginslambda00((String[]) arrayList.toArray(new String[0])), _get_messagewebview_lambda5, null, null, null, 0L, 0L, null, getMessageWebView.EMPTY);
        }
        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(i2, "code < 0: "));
        int i3 = read + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return null;
    }
}
