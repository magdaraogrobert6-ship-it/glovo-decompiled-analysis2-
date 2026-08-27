package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.CancellationException;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetNumPadMoveEndcp;

/* JADX INFO: loaded from: classes4.dex */
public final class zabw extends zap {
    public ParentDataModifierDefaultImpls RemoteActionCompatParcelizer;

    @Override // com.google.android.gms.common.api.internal.zap
    public final void MediaBrowserCompatMediaItem() {
        Activity activityMediaBrowserCompatMediaItem = this.read.MediaBrowserCompatMediaItem();
        if (activityMediaBrowserCompatMediaItem == null) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer((Exception) new ApiException(new Status(8, null, null, null)));
            return;
        }
        int iIsGooglePlayServicesAvailable = this.MediaDescriptionCompat.isGooglePlayServicesAvailable(activityMediaBrowserCompatMediaItem);
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.RemoteActionCompatParcelizer;
        if (iIsGooglePlayServicesAvailable == 0) {
            parentDataModifierDefaultImpls.write(null);
        } else {
            if (parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.isComplete()) {
                return;
            }
            serializer(new ConnectionResult(iIsGooglePlayServicesAvailable, null, null), 0);
        }
    }

    public final zzw MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void read(ConnectionResult connectionResult, int i) {
        String str = connectionResult.read;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new ApiException(new Status(connectionResult.IconCompatParcelizer, str, connectionResult.serializer, connectionResult)));
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer((Exception) new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public static zabw serializer(Activity activity) {
        accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp = accessgetNumPadMoveEndcp.read(activity);
        zabw zabwVar = (zabw) accessgetnumpadleftparenthesiscp.serializer("GmsAvailabilityHelper", zabw.class);
        if (zabwVar != null) {
            if (zabwVar.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.isComplete()) {
                zabwVar.RemoteActionCompatParcelizer = new ParentDataModifierDefaultImpls();
            }
            return zabwVar;
        }
        zabw zabwVar2 = new zabw(accessgetnumpadleftparenthesiscp, GoogleApiAvailability.getInstance());
        zabwVar2.RemoteActionCompatParcelizer = new ParentDataModifierDefaultImpls();
        accessgetnumpadleftparenthesiscp.serializer("GmsAvailabilityHelper", zabwVar2);
        return zabwVar2;
    }

    public zabw(accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp, GoogleApiAvailability googleApiAvailability) {
        super(accessgetnumpadleftparenthesiscp, googleApiAvailability);
    }
}
