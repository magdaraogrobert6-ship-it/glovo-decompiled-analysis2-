package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ View IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(int i, View view) {
        super(1);
        this.serializer = i;
        this.IconCompatParcelizer = view;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        View view = this.IconCompatParcelizer;
        if (i != 0) {
            WeakReference weakReference = (WeakReference) obj;
            weakReference.getClass();
            Object[] objArr = {weakReference.get(), view};
            return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue());
        }
        WeakReference weakReference2 = (WeakReference) obj;
        weakReference2.getClass();
        Object[] objArr2 = {weakReference2.get(), view};
        return Boolean.valueOf(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue());
    }
}
