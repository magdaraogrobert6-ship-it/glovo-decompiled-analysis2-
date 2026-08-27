package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;
import o.SweepGradientShader9KIMszodefault;
import o.accessgetNumPadLeftParenthesiscp;
import o.accessgetNumPadMoveEndcp;
import o.accessgetProgramBluecp;
import o.getBackEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zap extends accessgetNumPadMoveEndcp implements DialogInterface.OnCancelListener {
    public final AtomicReference MediaBrowserCompatMediaItem;
    public final GoogleApiAvailability MediaDescriptionCompat;
    public final getBackEK5gGoQ RatingCompat;
    public volatile boolean write;

    public abstract void MediaBrowserCompatMediaItem();

    @Override // o.accessgetNumPadMoveEndcp
    public void read() {
        this.write = false;
    }

    public abstract void read(ConnectionResult connectionResult, int i);

    @Override // o.accessgetNumPadMoveEndcp
    public void serializer() {
        this.write = true;
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        accessgetProgramBluecp accessgetprogrambluecp = (accessgetProgramBluecp) this.MediaBrowserCompatMediaItem.get();
        if (accessgetprogrambluecp == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", accessgetprogrambluecp.read());
        bundle.putInt("failed_status", accessgetprogrambluecp.IconCompatParcelizer().IconCompatParcelizer);
        bundle.putParcelable("failed_resolution", accessgetprogrambluecp.IconCompatParcelizer().serializer);
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void read(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.MediaBrowserCompatMediaItem;
        accessgetProgramBluecp accessgetprogrambluecp = (accessgetProgramBluecp) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int iIsGooglePlayServicesAvailable = this.MediaDescriptionCompat.isGooglePlayServicesAvailable(write());
                if (iIsGooglePlayServicesAvailable == 0) {
                    atomicReference.set(null);
                    MediaBrowserCompatMediaItem();
                    return;
                } else {
                    if (accessgetprogrambluecp == null) {
                        return;
                    }
                    if (accessgetprogrambluecp.IconCompatParcelizer().IconCompatParcelizer == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            MediaBrowserCompatMediaItem();
            return;
        } else if (i2 == 0) {
            if (accessgetprogrambluecp != null) {
                RemoteActionCompatParcelizer(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, accessgetprogrambluecp.IconCompatParcelizer().toString()), accessgetprogrambluecp.read());
                return;
            }
            return;
        }
        if (accessgetprogrambluecp != null) {
            RemoteActionCompatParcelizer(accessgetprogrambluecp.IconCompatParcelizer(), accessgetprogrambluecp.read());
        }
    }

    public final void serializer(ConnectionResult connectionResult, int i) {
        accessgetProgramBluecp accessgetprogrambluecp = new accessgetProgramBluecp(connectionResult, i);
        if (SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, accessgetprogrambluecp)) {
            this.RatingCompat.post(new com.google.android.gms.net.zza(this, accessgetprogrambluecp, false, 11));
        }
    }

    public final void RemoteActionCompatParcelizer(ConnectionResult connectionResult, int i) {
        this.MediaBrowserCompatMediaItem.set(null);
        read(connectionResult, i);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ConnectionResult connectionResult = new ConnectionResult(13, null, null);
        accessgetProgramBluecp accessgetprogrambluecp = (accessgetProgramBluecp) this.MediaBrowserCompatMediaItem.get();
        RemoteActionCompatParcelizer(connectionResult, accessgetprogrambluecp == null ? -1 : accessgetprogrambluecp.read());
    }

    public zap(accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp, GoogleApiAvailability googleApiAvailability) {
        super(accessgetnumpadleftparenthesiscp);
        this.MediaBrowserCompatMediaItem = new AtomicReference(null);
        this.RatingCompat = new getBackEK5gGoQ(Looper.getMainLooper(), 0);
        this.MediaDescriptionCompat = googleApiAvailability;
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void write(Bundle bundle) {
        if (bundle != null) {
            this.MediaBrowserCompatMediaItem.set(bundle.getBoolean("resolving_error", false) ? new accessgetProgramBluecp(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }
}
