package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.Task;
import o.PinnableContainer;
import o.accessgetNumPadDividecp;
import o.accessgetNumbercp;
import o.accessgetScp;
import o.accessgetSpacebarcp;
import o.accessgetTvInputComponent1cp;
import o.getBackEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zabx implements PinnableContainer {
    public final long IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final accessgetNumPadDividecp read;
    public final long serializer;
    public final GoogleApiManager write;

    @Override // o.PinnableContainer
    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int iElapsedRealtime;
        long j;
        long j2;
        GoogleApiManager googleApiManager = this.write;
        if (googleApiManager.write()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) accessgetSpacebarcp.IconCompatParcelizer().read;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.IconCompatParcelizer) {
                zabk zabkVar = (zabk) googleApiManager.ParcelableVolumeInfo.get(this.read);
                if (zabkVar != null) {
                    accessgetScp accessgetscp = zabkVar.RemoteActionCompatParcelizer;
                    if (accessgetscp instanceof BaseGmsClient) {
                        accessgetScp accessgetscp2 = accessgetscp;
                        long j3 = this.serializer;
                        int i5 = 0;
                        boolean z = j3 > 0;
                        int i6 = accessgetscp2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.RemoteActionCompatParcelizer;
                            i = rootTelemetryConfiguration.serializer;
                            i3 = rootTelemetryConfiguration.read;
                            i2 = rootTelemetryConfiguration.write;
                            if (accessgetscp2.MediaSessionCompatQueueItem != null && !accessgetscp2.PlaybackStateCompatCustomAction()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationIconCompatParcelizer = IconCompatParcelizer(zabkVar, accessgetscp2, this.RemoteActionCompatParcelizer);
                                if (connectionTelemetryConfigurationIconCompatParcelizer == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationIconCompatParcelizer.write && j3 > 0;
                                i3 = connectionTelemetryConfigurationIconCompatParcelizer.serializer;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i7 = i;
                        if (task.isSuccessful()) {
                            i4 = 0;
                        } else if (task.isCanceled()) {
                            i4 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status status = ((ApiException) exception).getStatus();
                                i5 = status.MediaBrowserCompatMediaItem;
                                ConnectionResult connectionResult = status.MediaMetadataCompat;
                                if (connectionResult != null) {
                                    i4 = connectionResult.IconCompatParcelizer;
                                }
                            } else {
                                i5 = 101;
                            }
                            i4 = -1;
                        }
                        if (z) {
                            long j4 = this.IconCompatParcelizer;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            j = j3;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                        } else {
                            iElapsedRealtime = -1;
                            j = 0;
                            j2 = 0;
                        }
                        accessgetNumbercp accessgetnumbercp = new accessgetNumbercp(new MethodInvocation(this.RemoteActionCompatParcelizer, i5, i4, j, j2, null, null, i6, iElapsedRealtime), i2, i7, i3);
                        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
                        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(18, accessgetnumbercp));
                    }
                }
            }
        }
    }

    public zabx(GoogleApiManager googleApiManager, int i, accessgetNumPadDividecp accessgetnumpaddividecp, long j, long j2) {
        this.write = googleApiManager;
        this.RemoteActionCompatParcelizer = i;
        this.read = accessgetnumpaddividecp;
        this.serializer = j;
        this.IconCompatParcelizer = j2;
    }

    public static ConnectionTelemetryConfiguration IconCompatParcelizer(zabk zabkVar, BaseGmsClient baseGmsClient, int i) {
        int[] iArr;
        int[] iArr2;
        zzj zzjVar = baseGmsClient.MediaSessionCompatQueueItem;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.serializer;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.RemoteActionCompatParcelizer || ((iArr = connectionTelemetryConfiguration.read) != null ? !accessgetTvInputComponent1cp.IconCompatParcelizer(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.MediaBrowserCompatMediaItem) == null || !accessgetTvInputComponent1cp.IconCompatParcelizer(iArr2, i))) || zabkVar.MediaSessionCompatResultReceiverWrapper >= connectionTelemetryConfiguration.serializer) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }
}
