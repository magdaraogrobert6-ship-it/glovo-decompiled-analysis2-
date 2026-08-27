package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zabk;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import o.accessgetMetaLeftcp;
import o.accessgetNavigateIncp;
import o.accessgetScp;
import o.getAltRightEK5gGoQ;

/* JADX INFO: loaded from: classes4.dex */
public final class zbe extends accessgetScp {
    public final GoogleSignInOptions write;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (iInterfaceQueryLocalInterface instanceof accessgetNavigateIncp) {
            return (accessgetNavigateIncp) iInterfaceQueryLocalInterface;
        }
        return new accessgetNavigateIncp(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public zbe(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, GoogleSignInOptions googleSignInOptions, zabk zabkVar, zabk zabkVar2) {
        accessgetMetaLeftcp accessgetmetaleftcp;
        super(context, looper, 91, metricsBatchProcessor, zabkVar, zabkVar2, 0);
        Set<Scope> set = (Set) metricsBatchProcessor.serializer;
        if (googleSignInOptions != null) {
            accessgetmetaleftcp = new accessgetMetaLeftcp();
            accessgetmetaleftcp.write = new HashSet();
            accessgetmetaleftcp.MediaBrowserCompatMediaItem = new HashMap();
            accessgetmetaleftcp.write = new HashSet(googleSignInOptions.MediaDescriptionCompat);
            accessgetmetaleftcp.read = googleSignInOptions.MediaSessionCompatQueueItem;
            accessgetmetaleftcp.RemoteActionCompatParcelizer = googleSignInOptions.ParcelableVolumeInfo;
            accessgetmetaleftcp.serializer = googleSignInOptions.MediaBrowserCompatMediaItem;
            accessgetmetaleftcp.IconCompatParcelizer = googleSignInOptions.MediaSessionCompatToken;
            accessgetmetaleftcp.RatingCompat = googleSignInOptions.RatingCompat;
            accessgetmetaleftcp.MediaSessionCompatQueueItem = googleSignInOptions.MediaSessionCompatResultReceiverWrapper;
            accessgetmetaleftcp.MediaBrowserCompatMediaItem = GoogleSignInOptions.read(googleSignInOptions.PlaybackStateCompatCustomAction);
            accessgetmetaleftcp.MediaDescriptionCompat = googleSignInOptions.PlaybackStateCompat;
        } else {
            accessgetmetaleftcp = new accessgetMetaLeftcp();
            accessgetmetaleftcp.write = new HashSet();
            accessgetmetaleftcp.MediaBrowserCompatMediaItem = new HashMap();
        }
        byte[] bArr = new byte[16];
        getAltRightEK5gGoQ.read.nextBytes(bArr);
        accessgetmetaleftcp.MediaDescriptionCompat = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = accessgetmetaleftcp.write;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = accessgetmetaleftcp.write;
        if (hashSet2.contains(GoogleSignInOptions.write)) {
            Scope scope2 = GoogleSignInOptions.serializer;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (accessgetmetaleftcp.serializer && (accessgetmetaleftcp.RatingCompat == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.RemoteActionCompatParcelizer);
        }
        this.write = new GoogleSignInOptions(3, new ArrayList(hashSet2), accessgetmetaleftcp.RatingCompat, accessgetmetaleftcp.serializer, accessgetmetaleftcp.read, accessgetmetaleftcp.RemoteActionCompatParcelizer, accessgetmetaleftcp.IconCompatParcelizer, accessgetmetaleftcp.MediaSessionCompatQueueItem, accessgetmetaleftcp.MediaBrowserCompatMediaItem, accessgetmetaleftcp.MediaDescriptionCompat);
    }
}
