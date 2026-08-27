package o;

import androidx.compose.ui.platform.UriHandler;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class canReadNonPlayIds implements androidx.compose.ui.text.LinkInteractionListener {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ UriHandler RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ canReadNonPlayIds(UriHandler uriHandler, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = uriHandler;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(androidx.compose.ui.text.LinkAnnotation linkAnnotation) {
        int i = 2 % 2;
        int i2 = this.serializer;
        UriHandler uriHandler = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            linkAnnotation.getClass();
            if (!(!(linkAnnotation instanceof androidx.compose.ui.text.LinkAnnotation.Url))) {
                uriHandler.openUri(((androidx.compose.ui.text.LinkAnnotation.Url) linkAnnotation).getUrl());
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Annotation should be LinkAnnotation.Url.");
            int i3 = read + 37;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        linkAnnotation.getClass();
        if (!(linkAnnotation instanceof androidx.compose.ui.text.LinkAnnotation.Url)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Annotation should be LinkAnnotation.Url.");
            return;
        }
        uriHandler.openUri(((androidx.compose.ui.text.LinkAnnotation.Url) linkAnnotation).getUrl());
        int i5 = IconCompatParcelizer + 95;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
