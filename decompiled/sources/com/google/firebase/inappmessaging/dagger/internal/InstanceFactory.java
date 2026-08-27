package com.google.firebase.inappmessaging.dagger.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import o.ReflectionUtils;
import o.forceAccessibilityForTesting;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.r8lambdazzuqe02XBR43ox0o_9r6taqg;
import o.setNativeShader;
import o.subscribeToBannersErrorslambda0;
import o.updateAutoCreatedComposeViewContext;

/* JADX INFO: loaded from: classes4.dex */
public final class InstanceFactory implements forceAccessibilityForTesting {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object serializer;

    public InstanceFactory(ProtobufEncoder protobufEncoder, updateAutoCreatedComposeViewContext updateautocreatedcomposeviewcontext) {
        this.IconCompatParcelizer = 1;
        this.serializer = updateautocreatedcomposeviewcontext;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        String strSerializer;
        Signature[] signatureArr;
        Signature signature;
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            return obj;
        }
        if (i == 1) {
            return new zzgs((SharedPreferencesUtils) ((updateAutoCreatedComposeViewContext) obj).write());
        }
        if (i == 2) {
            Application application = ((subscribeToBannersErrorslambda0) obj).IconCompatParcelizer;
            setNativeShader.RemoteActionCompatParcelizer((Object) application);
            return application;
        }
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        ReflectionUtils reflectionUtils = new ReflectionUtils("X-Goog-Api-Key", r8lambdakctilwmporjfcawe8asdqv1ks);
        ReflectionUtils reflectionUtils2 = new ReflectionUtils("X-Android-Package", r8lambdakctilwmporjfcawe8asdqv1ks);
        ReflectionUtils reflectionUtils3 = new ReflectionUtils("X-Android-Cert", r8lambdakctilwmporjfcawe8asdqv1ks);
        r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa = new r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA();
        FirebaseApp firebaseApp = ((SharedPreferencesUtils) obj).serializer;
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        String packageName = context.getPackageName();
        firebaseApp.IconCompatParcelizer();
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(reflectionUtils, firebaseApp.PlaybackStateCompatCustomAction.write);
        r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(reflectionUtils2, packageName);
        firebaseApp.IconCompatParcelizer();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            strSerializer = (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0 || (signature = signatureArr[0]) == null) ? null : BaseEncoding$StandardBaseEncoding.read.read().serializer(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        if (strSerializer != null) {
            r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(reflectionUtils3, strSerializer);
        }
        return r8lambdaqn1du6uas6agx4srbugfttxtpwa;
    }

    public /* synthetic */ InstanceFactory(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }
}
