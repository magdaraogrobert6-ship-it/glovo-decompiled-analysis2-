package androidx.datastore.preferences.core;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNoActiveChildannotations;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKt$edit$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = 1;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, 0);
            preferencesKt$edit$2.IconCompatParcelizer = obj;
            return preferencesKt$edit$2;
        }
        if (i == 1) {
            return new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, this.IconCompatParcelizer, shortNewsContentCardView);
        }
        int i2 = 2;
        if (i != 2) {
            PreferencesKt$edit$2 preferencesKt$edit$3 = new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, 3);
            preferencesKt$edit$3.IconCompatParcelizer = obj;
            return preferencesKt$edit$3;
        }
        PreferencesKt$edit$2 preferencesKt$edit$4 = new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, shortNewsContentCardView, i2);
        preferencesKt$edit$4.IconCompatParcelizer = obj;
        return preferencesKt$edit$4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            return ((PreferencesKt$edit$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((PreferencesKt$edit$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((PreferencesKt$edit$2) create((getNoActiveChildannotations) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        return ((PreferencesKt$edit$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardFocusSearch backwardfocussearchIconCompatParcelizer = ((getNoActiveChildannotations) this.IconCompatParcelizer).IconCompatParcelizer();
                this.IconCompatParcelizer = backwardfocussearchIconCompatParcelizer;
                this.write = 1;
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(backwardfocussearchIconCompatParcelizer, this) == coroutineSingletons ? coroutineSingletons : backwardfocussearchIconCompatParcelizer;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return backwardfocussearch;
        }
        if (i == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = this.IconCompatParcelizer;
            this.write = 1;
            Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj2, this);
            return objInvoke == coroutineSingletons2 ? coroutineSingletons2 : objInvoke;
        }
        if (i != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
                this.write = 1;
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getcontentviewgroupparentlayout, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) this.IconCompatParcelizer;
            this.write = 1;
            obj = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getnoactivechildannotations, this);
            if (obj == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        getNoActiveChildannotations getnoactivechildannotations2 = (getNoActiveChildannotations) obj;
        ((backwardFocusSearch) getnoactivechildannotations2).serializer.set(true);
        return getnoactivechildannotations2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreferencesKt$edit$2(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
