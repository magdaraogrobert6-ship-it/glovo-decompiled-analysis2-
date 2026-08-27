package com.google.firebase.installations;

import android.text.TextUtils;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.Iterator;
import o.following;
import o.getInstance;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FirebaseInstallations$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ FirebaseInstallations RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ FirebaseInstallations$$ExternalSyntheticLambda1(FirebaseInstallations firebaseInstallations, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = firebaseInstallations;
    }

    @Override // java.lang.Runnable
    public final void run() {
        following followingVarIconCompatParcelizer;
        following followingVarWrite;
        int i = this.serializer;
        FirebaseInstallations firebaseInstallations = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            firebaseInstallations.IconCompatParcelizer();
            return;
        }
        if (i == 1) {
            firebaseInstallations.IconCompatParcelizer();
            return;
        }
        Object obj = FirebaseInstallations.RemoteActionCompatParcelizer;
        synchronized (obj) {
            FirebaseApp firebaseApp = firebaseInstallations.MediaDescriptionCompat;
            firebaseApp.IconCompatParcelizer();
            zzbv zzbvVarRemoteActionCompatParcelizer = zzbv.RemoteActionCompatParcelizer(firebaseApp.read);
            try {
                followingVarIconCompatParcelizer = firebaseInstallations.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
                if (zzbvVarRemoteActionCompatParcelizer != null) {
                    zzbvVarRemoteActionCompatParcelizer.MediaMetadataCompat();
                }
            } catch (Throwable th) {
                if (zzbvVarRemoteActionCompatParcelizer != null) {
                    zzbvVarRemoteActionCompatParcelizer.MediaMetadataCompat();
                }
                throw th;
            }
        }
        try {
            getInstance getinstance = followingVarIconCompatParcelizer.RatingCompat;
            getInstance getinstance2 = getInstance.REGISTER_ERROR;
            if (getinstance == getinstance2 || getinstance == getInstance.UNREGISTERED) {
                followingVarWrite = firebaseInstallations.write(followingVarIconCompatParcelizer);
            } else if (!firebaseInstallations.MediaSessionCompatToken.serializer(followingVarIconCompatParcelizer)) {
                return;
            } else {
                followingVarWrite = firebaseInstallations.read(followingVarIconCompatParcelizer);
            }
            synchronized (obj) {
                FirebaseApp firebaseApp2 = firebaseInstallations.MediaDescriptionCompat;
                firebaseApp2.IconCompatParcelizer();
                zzbv zzbvVarRemoteActionCompatParcelizer2 = zzbv.RemoteActionCompatParcelizer(firebaseApp2.read);
                try {
                    firebaseInstallations.MediaSessionCompatResultReceiverWrapper.write(followingVarWrite);
                    if (zzbvVarRemoteActionCompatParcelizer2 != null) {
                        zzbvVarRemoteActionCompatParcelizer2.MediaMetadataCompat();
                    }
                } catch (Throwable th2) {
                    if (zzbvVarRemoteActionCompatParcelizer2 != null) {
                        zzbvVarRemoteActionCompatParcelizer2.MediaMetadataCompat();
                    }
                    throw th2;
                }
            }
            synchronized (firebaseInstallations) {
                if (firebaseInstallations.read.size() != 0 && !TextUtils.equals(followingVarIconCompatParcelizer.read, followingVarWrite.read)) {
                    Iterator it = firebaseInstallations.read.iterator();
                    if (it.hasNext()) {
                        m1$$ExternalSyntheticOutline0.m(it.next());
                        throw null;
                    }
                }
            }
            if (followingVarWrite.RatingCompat == getInstance.REGISTERED) {
                String str = followingVarWrite.read;
                synchronized (firebaseInstallations) {
                    firebaseInstallations.IconCompatParcelizer = str;
                }
            }
            getInstance getinstance3 = followingVarWrite.RatingCompat;
            if (getinstance3 == getinstance2) {
                FirebaseInstallationsException.serializer serializerVar = FirebaseInstallationsException.serializer.BAD_CONFIG;
                firebaseInstallations.IconCompatParcelizer(new FirebaseInstallationsException());
            } else if (getinstance3 == getInstance.NOT_GENERATED || getinstance3 == getInstance.ATTEMPT_MIGRATION) {
                firebaseInstallations.IconCompatParcelizer(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                firebaseInstallations.RemoteActionCompatParcelizer(followingVarWrite);
            }
        } catch (FirebaseInstallationsException e) {
            firebaseInstallations.IconCompatParcelizer(e);
        }
    }
}
