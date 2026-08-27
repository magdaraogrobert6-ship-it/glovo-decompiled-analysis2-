package o;

import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setLargeNotificationIconNameandroid_sdk_base_release {
    public static final setPushHtmlRenderingEnabledandroid_sdk_base_release Companion = new setPushHtmlRenderingEnabledandroid_sdk_base_release();
    public final double a;
    public final double b;

    public setLargeNotificationIconNameandroid_sdk_base_release(double d, double d2, int i) {
        if (3 == (i & 3)) {
            this.a = d;
            this.b = d2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setPushDeepLinkBackStackActivityEnabledandroid_sdk_base_release.write);
            throw null;
        }
    }

    public setLargeNotificationIconNameandroid_sdk_base_release(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
