package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class pageRightdefault implements InAppMessageBaseView {
    private static int read = 0;
    private static int write = 1;
    public final onFillDatadefault RemoteActionCompatParcelizer;

    public pageRightdefault(onFillDatadefault onfilldatadefault) {
        onfilldatadefault.getClass();
        this.RemoteActionCompatParcelizer = onfilldatadefault;
    }

    @Override // o.InAppMessageBaseView
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 authenticate(setWebViewContentdefault setwebviewcontentdefault, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        forest.IconCompatParcelizer("Authenticator triggered for " + r8lambday113fdftsr5e4pzj6xssxltpl60.url, new Object[0]);
        onFillDatadefault onfilldatadefault = this.RemoteActionCompatParcelizer;
        onfilldatadefault.getClass();
        setTextdefault settextdefault = onfilldatadefault.IconCompatParcelizer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{settextdefault.read.get(), coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60)}, getCieXyz.write())).booleanValue()) {
            int i2 = write + 73;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            forest.IconCompatParcelizer("Entering lock with owner ".concat(coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60)), new Object[0]);
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = onfilldatadefault.read(_get_messagewebview_lambda1);
            onfilldatadefault.RemoteActionCompatParcelizer(coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60), r8lambday113fdftsr5e4pzj6xssxltpl61);
            return r8lambday113fdftsr5e4pzj6xssxltpl61;
        }
        String strRemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60);
        settextdefault.lock();
        settextdefault.read.set(strRemoteActionCompatParcelizer);
        forest.IconCompatParcelizer("Locking with owner ".concat(coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60)), new Object[0]);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl62 = onfilldatadefault.read(_get_messagewebview_lambda1);
        onfilldatadefault.RemoteActionCompatParcelizer(coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60), r8lambday113fdftsr5e4pzj6xssxltpl62);
        int i4 = write + 27;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambday113fdftsr5e4pzj6xssxltpl62;
    }
}
