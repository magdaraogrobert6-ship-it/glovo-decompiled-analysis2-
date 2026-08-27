package com.google.firebase.firestore.remote;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.grpc.internal.MetadataApplierImpl;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.Executor;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import o.ReflectionUtils;
import o.getSUFFIX_CACHE_USER_ID_KEYannotations;
import o.getShouldAttachOnInsert;
import o.onLayoutNodeDeactivated;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.r8lambdazzuqe02XBR43ox0o_9r6taqg;
import o.setAfter;

/* JADX INFO: loaded from: classes2.dex */
public final class FirestoreCallCredentials extends TuplesKt {
    public static final ReflectionUtils read;
    public static final ReflectionUtils serializer;
    public final setAfter IconCompatParcelizer;
    public final getShouldAttachOnInsert RemoteActionCompatParcelizer;

    static {
        r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
        BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
        read = new ReflectionUtils("Authorization", r8lambdakctilwmporjfcawe8asdqv1ks);
        serializer = new ReflectionUtils("x-firebase-appcheck", r8lambdakctilwmporjfcawe8asdqv1ks);
    }

    @Override // kotlin.TuplesKt
    public final void IconCompatParcelizer(getSUFFIX_CACHE_USER_ID_KEYannotations getsuffix_cache_user_id_keyannotations, Executor executor, MetadataApplierImpl metadataApplierImpl) {
        zzw zzwVar;
        zzw zzwVar2;
        synchronized (this.IconCompatParcelizer) {
            zzwVar = (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseApiNotAvailableException("auth is not available")});
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            zzwVar2 = (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseApiNotAvailableException("AppCheck is not available")});
        }
        LazyKt__LazyJVMKt.write(Arrays.asList(zzwVar, zzwVar2)).addOnCompleteListener(onLayoutNodeDeactivated.read, new PreviewView$1$$ExternalSyntheticLambda2(zzwVar, metadataApplierImpl, zzwVar2, 13));
    }

    public FirestoreCallCredentials(setAfter setafter, getShouldAttachOnInsert getshouldattachoninsert) {
        this.IconCompatParcelizer = setafter;
        this.RemoteActionCompatParcelizer = getshouldattachoninsert;
    }
}
