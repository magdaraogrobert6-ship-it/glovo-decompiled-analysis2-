package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.cardview.widget.CardView$1;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zai {
    public final int MediaSessionCompatQueueItem;

    public abstract void RemoteActionCompatParcelizer(Status status);

    public abstract void RemoteActionCompatParcelizer(Exception exc);

    public abstract void serializer(CardView$1 cardView$1, boolean z);

    public abstract void serializer(zabk zabkVar);

    public static Status serializer(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public zai(int i) {
        this.MediaSessionCompatQueueItem = i;
    }
}
