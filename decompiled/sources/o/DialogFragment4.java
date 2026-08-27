package o;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogFragment4 implements accessgetPositiveInfinitycp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final FrameLayout IconCompatParcelizer;
    public final WebView write;

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        FrameLayout frameLayout;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 45;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            frameLayout = this.IconCompatParcelizer;
            int i4 = 88 / 0;
        } else {
            frameLayout = this.IconCompatParcelizer;
        }
        int i5 = i2 + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return frameLayout;
    }

    public DialogFragment4(FrameLayout frameLayout, WebView webView) {
        this.IconCompatParcelizer = frameLayout;
        this.write = webView;
    }

    public final FrameLayout write() {
        int i = 2 % 2;
        int i2 = read + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(r6.getResources().getResourceName(com.logistics.rider.glovo.R.id.webView)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r2 = new o.DialogFragment4((android.widget.FrameLayout) r6, r1);
        r6 = o.DialogFragment4.RemoteActionCompatParcelizer + 69;
        o.DialogFragment4.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.DialogFragment4 RemoteActionCompatParcelizer(android.view.LayoutInflater r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.DialogFragment4.read
            int r1 = r1 + 45
            int r2 = r1 % 128
            o.DialogFragment4.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 2131558431(0x7f0d001f, float:1.8742178E38)
            r4 = 2131362880(0x7f0a0440, float:1.8345553E38)
            r5 = 0
            if (r1 == 0) goto L23
            android.view.View r6 = r6.inflate(r3, r5, r2)
            android.view.View r1 = coil3.ExtrasKt.RemoteActionCompatParcelizer(r4, r6)
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            if (r1 == 0) goto L40
            goto L2f
        L23:
            android.view.View r6 = r6.inflate(r3, r5, r2)
            android.view.View r1 = coil3.ExtrasKt.RemoteActionCompatParcelizer(r4, r6)
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            if (r1 == 0) goto L40
        L2f:
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            o.DialogFragment4 r2 = new o.DialogFragment4
            r2.<init>(r6, r1)
            int r6 = o.DialogFragment4.RemoteActionCompatParcelizer
            int r6 = r6 + 69
            int r1 = r6 % 128
            o.DialogFragment4.read = r1
            int r6 = r6 % r0
            return r2
        L40:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r4)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r6 = r0.concat(r6)
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DialogFragment4.RemoteActionCompatParcelizer(android.view.LayoutInflater):o.DialogFragment4");
    }
}
