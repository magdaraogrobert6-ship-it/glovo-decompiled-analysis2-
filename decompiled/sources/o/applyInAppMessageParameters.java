package o;

import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.Cookie$Companion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class applyInAppMessageParameters implements ItemSingleChoiceBinding {
    public final setInAppMessageImageViewAttributes IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ getInAppMessageImageView serializer;
    public final GlideException write;

    @Override // o.ItemSingleChoiceBinding
    public final ApiErrorResponseCompanion RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // o.ItemSingleChoiceBinding
    public long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        getInAppMessageImageView getinappmessageimageview = this.serializer;
        registryMissingComponentException.getClass();
        try {
            return getinappmessageimageview.RatingCompat.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        } catch (IOException e) {
            getinappmessageimageview.RemoteActionCompatParcelizer.RatingCompat();
            write(getInAppMessageImageView.read);
            throw e;
        }
    }

    public applyInAppMessageParameters(getInAppMessageImageView getinappmessageimageview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        setinappmessageimageviewattributes.getClass();
        this.serializer = getinappmessageimageview;
        this.IconCompatParcelizer = setinappmessageimageviewattributes;
        this.write = new GlideException(getinappmessageimageview.RatingCompat.RemoteActionCompatParcelizer());
    }

    public final void write(resetMessageMarginslambda00 resetmessagemarginslambda00) {
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        getLongEdge getlongedge;
        resetmessagemarginslambda00.getClass();
        getInAppMessageImageView getinappmessageimageview = this.serializer;
        int i = getinappmessageimageview.MediaBrowserCompatMediaItem;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read(getinappmessageimageview.MediaBrowserCompatMediaItem, "state: ");
            return;
        }
        GlideException glideException = this.write;
        ApiErrorResponseCompanion apiErrorResponseCompanion = glideException.IconCompatParcelizer;
        glideException.IconCompatParcelizer = ApiErrorResponseCompanion.PlaybackStateCompat;
        apiErrorResponseCompanion.N_();
        apiErrorResponseCompanion.O_();
        getinappmessageimageview.MediaBrowserCompatMediaItem = 6;
        if (resetmessagemarginslambda00.RemoteActionCompatParcelizer() <= 0 || (r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = getinappmessageimageview.IconCompatParcelizer) == null || (getlongedge = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.cookieJar) == null) {
            return;
        }
        int i2 = r8lambdap5NIwcfORIsaQELQLeY6t8PSkNM.IconCompatParcelizer;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = this.IconCompatParcelizer;
        setinappmessageimageviewattributes.getClass();
        if (getlongedge == getLongEdge.NO_COOKIES) {
            return;
        }
        Pattern pattern = r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo.IconCompatParcelizer;
        Cookie$Companion.IconCompatParcelizer(setinappmessageimageviewattributes, resetmessagemarginslambda00).isEmpty();
    }
}
