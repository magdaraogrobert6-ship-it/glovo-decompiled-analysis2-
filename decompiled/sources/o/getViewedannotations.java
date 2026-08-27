package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class getViewedannotations<T> extends getLatitudeannotations<T> {
    final /* synthetic */ getOpenUriInWebViewannotations read;

    public abstract List<getImageStyle> serializer(getLongitudeannotations<T> getlongitudeannotations);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getViewedannotations(getOpenUriInWebViewannotations getopenuriinwebviewannotations, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "TimelineCreator");
        this.read = getopenuriinwebviewannotations;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<T> getlongitudeannotations) {
        long jWrite = getlongitudeannotations.write();
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        String name = getlongitudeannotations.read().getClass().getName();
        getOpenUriInWebViewannotations getopenuriinwebviewannotations = this.read;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) getopenuriinwebviewannotations.RatingCompat.serializer(InAppMessageFull.read());
        getopenuriinwebviewannotations.IconCompatParcelizer.IconCompatParcelizer("Current transportChange: %s, new event: %s, at eventTime: %s", r8lambdali8uu9krigfjg6en6xj7af4cwaq != null ? r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().name() : null, name, com.sentiance.sdk.util.x.c(jWrite));
        getopenuriinwebviewannotations.serializer(serializer(getlongitudeannotations), jWrite, Long.valueOf(jMediaMetadataCompat));
    }
}
