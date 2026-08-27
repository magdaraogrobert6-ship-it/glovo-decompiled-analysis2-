package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.camera.video.Recorder$3;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIterators;
import o.OwnerCompanion;
import o.accessgetNinecp;
import o.accessgetNumPad0cp;
import o.accessgetNumPad1cp;
import o.accesssetInstancecp;
import o.getNativeClipboard;
import o.onSemanticsChange;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.requestFocusCurrent;
import o.setShowLayoutBounds;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes2.dex */
public final class GmsRpc {
    public final accesssetInstancecp IconCompatParcelizer;
    public final AbstractComposeViewExternalSyntheticLambda0 RatingCompat;
    public final FirebaseApp RemoteActionCompatParcelizer;
    public final AbstractComposeViewExternalSyntheticLambda0 read;
    public final Rpc serializer;
    public final Metadata write;

    public GmsRpc(FirebaseApp firebaseApp, Metadata metadata, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1, accesssetInstancecp accesssetinstancecp) {
        firebaseApp.IconCompatParcelizer();
        Rpc rpc = new Rpc(firebaseApp.read);
        this.RemoteActionCompatParcelizer = firebaseApp;
        this.write = metadata;
        this.serializer = rpc;
        this.RatingCompat = abstractComposeViewExternalSyntheticLambda0;
        this.read = abstractComposeViewExternalSyntheticLambda1;
        this.IconCompatParcelizer = accesssetinstancecp;
    }

    public final Task serializer(Task task) {
        return task.continueWith(new getNativeClipboard(), new FieldType$$ExternalSyntheticBUOutline0(this));
    }

    public final Task read(String str, String str2, Bundle bundle) {
        int i;
        try {
            serializer(str, str2, bundle);
            Rpc rpc = this.serializer;
            accessgetNumPad1cp accessgetnumpad1cp = accessgetNumPad1cp.read;
            Huffman$Node huffman$Node = rpc.MediaMetadataCompat;
            if (huffman$Node.read() >= 12000000) {
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcekWrite = r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.write(rpc.IconCompatParcelizer);
                synchronized (r8lambdau31fnmctqqics3i75jr9dkzcekWrite) {
                    i = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem;
                    r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem = i + 1;
                }
                return r8lambdau31fnmctqqics3i75jr9dkzcekWrite.RemoteActionCompatParcelizer(new accessgetNinecp(i, 1, bundle, 1)).continueWith(accessgetnumpad1cp, accessgetNumPad0cp.RemoteActionCompatParcelizer);
            }
            if (huffman$Node.write() != 0) {
                return rpc.RemoteActionCompatParcelizer(bundle).continueWithTask(accessgetnumpad1cp, new Recorder$3(rpc, bundle, false, 25));
            }
            Object[] objArr = {new IOException("MISSING_INSTANCEID_SERVICE")};
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        } catch (InterruptedException | ExecutionException e) {
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{e});
        }
    }

    public final void serializer(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        OwnerCompanion ownerCompanionIconCompatParcelizer;
        PackageInfo packageInfoWrite;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        FirebaseApp firebaseApp = this.RemoteActionCompatParcelizer;
        firebaseApp.IconCompatParcelizer();
        bundle.putString("gmp_app_id", firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer);
        Metadata metadata = this.write;
        synchronized (metadata) {
            if (metadata.serializer == 0 && (packageInfoWrite = metadata.write("com.google.android.gms")) != null) {
                metadata.serializer = packageInfoWrite.versionCode;
            }
            i = metadata.serializer;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.write.IconCompatParcelizer());
        Metadata metadata2 = this.write;
        synchronized (metadata2) {
            if (metadata2.IconCompatParcelizer == null) {
                metadata2.serializer();
            }
            str3 = metadata2.IconCompatParcelizer;
        }
        bundle.putString("app_ver_name", str3);
        FirebaseApp firebaseApp2 = this.RemoteActionCompatParcelizer;
        firebaseApp2.IconCompatParcelizer();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp2.ParcelableVolumeInfo.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((AccessibilityIterators) LazyKt__LazyJVMKt.read(((FirebaseInstallations) this.IconCompatParcelizer).read())).IconCompatParcelizer;
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            } else {
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            SentryLogcatAdapter.read("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) LazyKt__LazyJVMKt.read(((FirebaseInstallations) this.IconCompatParcelizer).write()));
        bundle.putString("cliv", "fcm-25.0.1");
        setShowLayoutBounds setshowlayoutbounds = (setShowLayoutBounds) this.read.write();
        requestFocusCurrent requestfocuscurrent = (requestFocusCurrent) this.RatingCompat.write();
        if (setshowlayoutbounds == null || requestfocuscurrent == null || (ownerCompanionIconCompatParcelizer = ((onSemanticsChange) setshowlayoutbounds).IconCompatParcelizer()) == OwnerCompanion.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(ownerCompanionIconCompatParcelizer.getCode()));
        bundle.putString("Firebase-Client", requestfocuscurrent.read());
    }
}
