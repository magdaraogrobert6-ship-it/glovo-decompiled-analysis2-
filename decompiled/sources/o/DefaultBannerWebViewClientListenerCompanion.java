package o;

import io.sentry.SentryBaseEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultBannerWebViewClientListenerCompanion implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public DefaultBannerWebViewClientListenerCompanion() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.write = property;
        this.RemoteActionCompatParcelizer = property2;
    }

    public final void serializer(SentryBaseEvent sentryBaseEvent) {
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = sentryBaseEvent.read;
        if (iconCompatParcelizer.RatingCompat() == null) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(new io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs());
        }
        io.sentry.protocol.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat = iconCompatParcelizer.RatingCompat();
        if (r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat != null && r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat.RemoteActionCompatParcelizer == null && r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat.serializer == null) {
            r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
            r8lambdag6d1iybxwil5aesazxszmvuycqsRatingCompat.serializer = this.write;
        }
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        serializer(accessensureviewmodelstore);
        return accessensureviewmodelstore;
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        serializer(bannerViewExternalSyntheticLambda2);
        return bannerViewExternalSyntheticLambda2;
    }
}
