package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class getOpenUriInWebView extends getViewedannotations<retryInAppMessage> {
    final /* synthetic */ getOpenUriInWebViewannotations IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOpenUriInWebView(getOpenUriInWebViewannotations getopenuriinwebviewannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(getopenuriinwebviewannotations, readandroid_sdk_base_releaseVar);
        this.IconCompatParcelizer = getopenuriinwebviewannotations;
    }

    @Override // o.getViewedannotations
    public final List<getImageStyle> serializer(getLongitudeannotations<retryInAppMessage> getlongitudeannotations) {
        return this.IconCompatParcelizer.MediaDescriptionCompat.IconCompatParcelizer(getlongitudeannotations);
    }
}
