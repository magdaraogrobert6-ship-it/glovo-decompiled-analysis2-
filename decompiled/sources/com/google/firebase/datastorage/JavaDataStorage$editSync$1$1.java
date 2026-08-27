package com.google.firebase.datastorage;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getBlue0d7_KjUannotations;
import o.getIntersectrtfAjoo;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDataStorage$editSync$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$1 = new JavaDataStorage$editSync$1$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, shortNewsContentCardView);
            javaDataStorage$editSync$1$1.write = obj;
            return javaDataStorage$editSync$1$1;
        }
        int i2 = 1;
        if (i != 1) {
            JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$2 = new JavaDataStorage$editSync$1$1(2, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            javaDataStorage$editSync$1$2.write = obj;
            return javaDataStorage$editSync$1$2;
        }
        JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$3 = new JavaDataStorage$editSync$1$1(i2, shortNewsContentCardView, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        javaDataStorage$editSync$1$3.write = obj;
        return javaDataStorage$editSync$1$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            return i != 1 ? ((JavaDataStorage$editSync$1$1) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((JavaDataStorage$editSync$1$1) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        ((JavaDataStorage$editSync$1$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.IconCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((backwardFocusSearch) this.write);
            return createFromParcel.INSTANCE;
        }
        if (i != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getIntersectrtfAjoo getintersectrtfajoo = (getIntersectrtfAjoo) this.write;
            getintersectrtfajoo.getClass();
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((getBlue0d7_KjUannotations) getintersectrtfajoo).IconCompatParcelizer());
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getIntersectrtfAjoo getintersectrtfajoo2 = (getIntersectrtfAjoo) this.write;
        getintersectrtfajoo2.getClass();
        return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((getBlue0d7_KjUannotations) getintersectrtfajoo2).IconCompatParcelizer());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JavaDataStorage$editSync$1$1(int i, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }
}
