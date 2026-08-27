package com.google.android.gms.common.internal;

import androidx.cardview.widget.CardView$1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadCommacp;
import o.accessgetNumPadDirectionDowncp;
import o.accessgetSystemNavigationDowncp;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.toContentCaptureSession;
import okhttp3.internal.platform.AndroidPlatform$Companion;

/* JADX INFO: loaded from: classes2.dex */
public final class zau {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ accessgetNumPadDirectionDowncp serializer;

    public zau(CardView$1 cardView$1, BasePendingResult basePendingResult) {
        this.serializer = basePendingResult;
        Objects.requireNonNull(cardView$1);
        this.RemoteActionCompatParcelizer = cardView$1;
    }

    public final void serializer(Status status) {
        accessgetNumPadCommacp accessgetnumpadcommacp;
        if (this.read != 0) {
            ((Map) ((CardView$1) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer).remove((BasePendingResult) this.serializer);
            return;
        }
        if (!status.write()) {
            ((ParentDataModifierDefaultImpls) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(AndroidPlatform$Companion.read(status));
            return;
        }
        accessgetNumPadDirectionDowncp accessgetnumpaddirectiondowncp = this.serializer;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) accessgetnumpaddirectiondowncp;
        accessgetSystemNavigationDowncp.serializer("Result has already been consumed.", !basePendingResult.MediaMetadataCompat);
        try {
            if (!basePendingResult.read.await(0L, timeUnit)) {
                basePendingResult.IconCompatParcelizer(Status.write);
            }
        } catch (InterruptedException unused) {
            basePendingResult.IconCompatParcelizer(Status.RemoteActionCompatParcelizer);
        }
        accessgetSystemNavigationDowncp.serializer("Result is not ready.", basePendingResult.RemoteActionCompatParcelizer());
        synchronized (basePendingResult.serializer) {
            accessgetSystemNavigationDowncp.serializer("Result has already been consumed.", !basePendingResult.MediaMetadataCompat);
            accessgetSystemNavigationDowncp.serializer("Result is not ready.", basePendingResult.RemoteActionCompatParcelizer());
            accessgetnumpadcommacp = basePendingResult.MediaSessionCompatQueueItem;
            basePendingResult.MediaSessionCompatQueueItem = null;
            basePendingResult.MediaMetadataCompat = true;
        }
        if (basePendingResult.MediaDescriptionCompat.getAndSet(null) == null) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgetnumpadcommacp);
            ((ParentDataModifierDefaultImpls) this.RemoteActionCompatParcelizer).IconCompatParcelizer((Object) null);
        } else {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
        }
    }

    public zau(accessgetNumPadDirectionDowncp accessgetnumpaddirectiondowncp, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls, toContentCaptureSession tocontentcapturesession) {
        this.serializer = accessgetnumpaddirectiondowncp;
        this.RemoteActionCompatParcelizer = parentDataModifierDefaultImpls;
    }
}
