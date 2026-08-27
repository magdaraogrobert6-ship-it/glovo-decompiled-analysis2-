package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.firebase.FirebaseApp;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import o.isTreeConsistent;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata {
    public String IconCompatParcelizer;
    public final Context RemoteActionCompatParcelizer;
    public String read;
    public int serializer;
    public int write = 0;

    public final String IconCompatParcelizer() {
        String str;
        synchronized (this) {
            if (this.read == null) {
                serializer();
            }
            str = this.read;
        }
        return str;
    }

    public final boolean RemoteActionCompatParcelizer() {
        synchronized (this) {
            int i = this.write;
            if (i == 0) {
                PackageManager packageManager = this.RemoteActionCompatParcelizer.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                        this.write = 2;
                        return true;
                    }
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    this.write = 2;
                    return true;
                }
                SentryLogcatAdapter.serializer("FirebaseMessaging", "Google Play services missing or without correct permission.");
            } else if (i != 0) {
                return true;
            }
            return false;
        }
    }

    public final void serializer() {
        synchronized (this) {
            PackageInfo packageInfoWrite = write(this.RemoteActionCompatParcelizer.getPackageName());
            if (packageInfoWrite != null) {
                this.read = Integer.toString(packageInfoWrite.versionCode);
                this.IconCompatParcelizer = packageInfoWrite.versionName;
            }
        }
    }

    public final PackageInfo write(String str) {
        try {
            return this.RemoteActionCompatParcelizer.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public static String IconCompatParcelizer(FirebaseApp firebaseApp) {
        firebaseApp.IconCompatParcelizer();
        isTreeConsistent istreeconsistent = firebaseApp.PlaybackStateCompatCustomAction;
        String str = istreeconsistent.RemoteActionCompatParcelizer;
        if (str != null) {
            return str;
        }
        firebaseApp.IconCompatParcelizer();
        String str2 = istreeconsistent.IconCompatParcelizer;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public Metadata(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }
}
