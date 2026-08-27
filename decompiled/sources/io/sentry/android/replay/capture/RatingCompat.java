package io.sentry.android.replay.capture;

import o.AddToCustomAttributeArrayStep;
import o.BannerDismissSnapshot;
import o.executelambda4;
import o.onCustomEventAction;

/* JADX INFO: loaded from: classes4.dex */
public final class RatingCompat extends MediaSessionCompatQueueItem {
    public final BannerDismissSnapshot RemoteActionCompatParcelizer;
    public final onCustomEventAction read;

    public final void RemoteActionCompatParcelizer(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, executelambda4 executelambda4Var) {
        if (addToCustomAttributeArrayStep != null) {
            executelambda4Var.read = this.RemoteActionCompatParcelizer;
            addToCustomAttributeArrayStep.read(this.read, executelambda4Var);
        }
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public RatingCompat(onCustomEventAction oncustomeventaction, BannerDismissSnapshot bannerDismissSnapshot) {
        this.read = oncustomeventaction;
        this.RemoteActionCompatParcelizer = bannerDismissSnapshot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingCompat)) {
            return false;
        }
        RatingCompat ratingCompat = (RatingCompat) obj;
        return this.read.equals(ratingCompat.read) && this.RemoteActionCompatParcelizer.equals(ratingCompat.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "Created(replay=" + this.read + ", recording=" + this.RemoteActionCompatParcelizer + ')';
    }
}
