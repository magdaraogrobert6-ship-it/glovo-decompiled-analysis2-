package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setClipPath implements r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM, getRectf {
    public final setupDirectionalNavigationlambda1 write;

    @Override // o.getRectf
    public r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM RemoteActionCompatParcelizer() {
        return this.write;
    }

    public /* synthetic */ setClipPath(setupDirectionalNavigationlambda1 setupdirectionalnavigationlambda1) {
        this.write = setupdirectionalnavigationlambda1;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public getMessageClickableView IconCompatParcelizer() {
        return this.write.write;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public boolean IconCompatParcelizer(InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView) {
        return this.write.IconCompatParcelizer(inAppMessageImmersiveBaseView);
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public setLargerCloseButtonClickArea RatingCompat() {
        return this.write.write();
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public BrazeContentCardsManager read() {
        return this.write.IconCompatParcelizer;
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public boolean serializer() {
        return this.write.read.write();
    }

    @Override // o.getRectf
    public InAppMessageImmersiveBaseView write() throws Throwable {
        IOException iOException = null;
        while (true) {
            setupDirectionalNavigationlambda1 setupdirectionalnavigationlambda1 = this.write;
            if (setupdirectionalnavigationlambda1.read.write()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Canceled");
                return null;
            }
            try {
                setLargerCloseButtonClickArea setlargerclosebuttonclickareaRatingCompat = setupdirectionalnavigationlambda1.RatingCompat();
                if (!setlargerclosebuttonclickareaRatingCompat.MediaDescriptionCompat()) {
                    r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = setlargerclosebuttonclickareaRatingCompat.IconCompatParcelizer();
                    if (r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.IconCompatParcelizer == null && r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.write == null) {
                        r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer = setlargerclosebuttonclickareaRatingCompat.RemoteActionCompatParcelizer();
                    }
                    setLargerCloseButtonClickArea setlargerclosebuttonclickarea = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.IconCompatParcelizer;
                    Throwable th = r8lambdaebq2lc4_6t3arp5xx7b_s4jagiiIconCompatParcelizer.write;
                    if (th != null) {
                        throw th;
                    }
                    if (setlargerclosebuttonclickarea != null) {
                        setupdirectionalnavigationlambda1.IconCompatParcelizer.addFirst(setlargerclosebuttonclickarea);
                    }
                }
                return setlargerclosebuttonclickareaRatingCompat.MediaSessionCompatQueueItem();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    markOnScreenCardsAsReadlambda1.read(iOException, e);
                }
                if (!setupdirectionalnavigationlambda1.IconCompatParcelizer(null)) {
                    throw iOException;
                }
            }
        }
    }

    @Override // o.r8lambdaQVUtIKVyBKq92FAYr7V9hBpsNM
    public boolean read(setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        setinappmessageimageviewattributes.getClass();
        return this.write.read(setinappmessageimageviewattributes);
    }
}
