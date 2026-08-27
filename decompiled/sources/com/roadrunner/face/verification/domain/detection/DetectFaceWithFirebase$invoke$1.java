package com.roadrunner.face.verification.domain.detection;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class DetectFaceWithFirebase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ DetectFaceWithFirebase serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectFaceWithFirebase$invoke$1(DetectFaceWithFirebase detectFaceWithFirebase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = detectFaceWithFirebase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4961invokegIAlus = this.serializer.m4961invokegIAlus(null, this);
        if (objM4961invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4961invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4961invokegIAlus);
        int i4 = IconCompatParcelizer + 75;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
