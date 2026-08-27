package o;

import kotlinx.datetime.DatePeriod$Companion;
import kotlinx.datetime.serializers.DatePeriodIso8601Serializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable(write = DatePeriodIso8601Serializer.class)
public final class setClickOutsideModalViewDismissInAppMessageView extends setBackButtonDismissesInAppMessageView {
    public static final DatePeriod$Companion Companion = new Object() { // from class: kotlinx.datetime.DatePeriod$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return DatePeriodIso8601Serializer.IconCompatParcelizer;
        }
    };
    public final int days;
    public final int totalMonths;

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int IconCompatParcelizer() {
        return this.days;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int MediaBrowserCompatMediaItem() {
        return this.totalMonths;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final long MediaSessionCompatQueueItem() {
        return 0L;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int RemoteActionCompatParcelizer() {
        return 0;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int read() {
        return 0;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int serializer() {
        return 0;
    }

    @Override // o.setBackButtonDismissesInAppMessageView
    public final int write() {
        return 0;
    }

    public setClickOutsideModalViewDismissInAppMessageView(int i, int i2) {
        this.totalMonths = i;
        this.days = i2;
    }
}
