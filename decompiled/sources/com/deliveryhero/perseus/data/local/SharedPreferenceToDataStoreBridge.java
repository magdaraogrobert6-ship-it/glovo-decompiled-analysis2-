package com.deliveryhero.perseus.data.local;

import android.content.Context;
import androidx.cardview.widget.CardView$1;
import androidx.compose.material3.TooltipStateImpl;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.data.network.HistoryApiRequest$getHistory$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.arcToRelative;
import o.generateImageVectorIdui;
import o.pathR_LF3Idefault;
import o.peek;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferenceToDataStoreBridge implements generateImageVectorIdui {
    public final CardView$1 RemoteActionCompatParcelizer;
    public final UnencryptedSharedPreferencesLocalStorage read;

    @Override // o.generateImageVectorIdui
    public final Object RemoteActionCompatParcelizer(long j, String str, ContinuationImpl continuationImpl) {
        return this.read.RemoteActionCompatParcelizer(j, str, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.generateImageVectorIdui
    public final Object getLong(long j, String str, ContinuationImpl continuationImpl) {
        pathR_LF3Idefault pathr_lf3idefault;
        long j2;
        boolean zContains;
        String str2 = str;
        if (continuationImpl instanceof pathR_LF3Idefault) {
            pathr_lf3idefault = (pathR_LF3Idefault) continuationImpl;
            int i = pathr_lf3idefault.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                pathr_lf3idefault.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                pathr_lf3idefault = new pathR_LF3Idefault(this, continuationImpl);
            }
        } else {
            pathr_lf3idefault = new pathR_LF3Idefault(this, continuationImpl);
        }
        pathR_LF3Idefault pathr_lf3idefault2 = pathr_lf3idefault;
        Object longOrNull = pathr_lf3idefault2.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pathr_lf3idefault2.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(longOrNull);
            UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage = this.read;
            pathr_lf3idefault2.write = str2;
            pathr_lf3idefault2.read = j;
            pathr_lf3idefault2.IconCompatParcelizer = 1;
            longOrNull = unencryptedSharedPreferencesLocalStorage.getLongOrNull(str2, pathr_lf3idefault2);
            if (longOrNull != obj) {
                j2 = j;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(longOrNull);
                return longOrNull;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = pathr_lf3idefault2.read;
        str2 = pathr_lf3idefault2.write;
        ExtrasKt.RemoteActionCompatParcelizer(longOrNull);
        j2 = j3;
        Long l = (Long) longOrNull;
        if (l != null) {
            return new Long(l.longValue());
        }
        CardView$1 cardView$1 = this.RemoteActionCompatParcelizer;
        synchronized (cardView$1) {
            str2.getClass();
            zContains = cardView$1.read().contains(str2);
        }
        if (!zContains) {
            return new Long(j2);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM historyApiRequest$getHistory$2 = new HistoryApiRequest$getHistory$2(this, str2, j2, (ShortNewsContentCardView) null, 1);
        pathr_lf3idefault2.write = null;
        pathr_lf3idefault2.read = j2;
        pathr_lf3idefault2.IconCompatParcelizer = 2;
        Object objMigrate = migrate(str2, historyApiRequest$getHistory$2, pathr_lf3idefault2);
        return objMigrate == obj ? obj : objMigrate;
    }

    @Override // o.generateImageVectorIdui
    public final Object serializer(String str, String str2, ContinuationImpl continuationImpl) {
        return this.read.serializer(str, str2, continuationImpl);
    }

    public SharedPreferenceToDataStoreBridge(Context context) {
        context.getClass();
        this.RemoteActionCompatParcelizer = new CardView$1(context, 18);
        this.read = new UnencryptedSharedPreferencesLocalStorage(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.generateImageVectorIdui
    public final Object getString(String str, ContinuationImpl continuationImpl) {
        peek peekVar;
        String string;
        if (continuationImpl instanceof peek) {
            peekVar = (peek) continuationImpl;
            int i = peekVar.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                peekVar.serializer = i - Integer.MIN_VALUE;
            } else {
                peekVar = new peek(this, continuationImpl);
            }
        } else {
            peekVar = new peek(this, continuationImpl);
        }
        Object string2 = peekVar.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = peekVar.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(string2);
            UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage = this.read;
            peekVar.write = str;
            peekVar.serializer = 1;
            string2 = unencryptedSharedPreferencesLocalStorage.getString(str, peekVar);
            if (string2 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(string2);
                return string2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = peekVar.write;
        ExtrasKt.RemoteActionCompatParcelizer(string2);
        String str2 = (String) string2;
        if (str2 != null) {
            return str2;
        }
        CardView$1 cardView$1 = this.RemoteActionCompatParcelizer;
        synchronized (cardView$1) {
            str.getClass();
            string = cardView$1.read().getString(str, null);
        }
        if (string == null) {
            return null;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, str, string, null, 3);
        peekVar.write = null;
        peekVar.serializer = 2;
        Object objMigrate = migrate(str, anonymousClass2, peekVar);
        return objMigrate == obj ? obj : objMigrate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object migrate(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        arcToRelative arctorelative;
        if (continuationImpl instanceof arcToRelative) {
            arctorelative = (arcToRelative) continuationImpl;
            int i = arctorelative.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                arctorelative.write = i - Integer.MIN_VALUE;
            } else {
                arctorelative = new arcToRelative(this, continuationImpl);
            }
        } else {
            arctorelative = new arcToRelative(this, continuationImpl);
        }
        Object objInvoke = arctorelative.IconCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = arctorelative.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            arctorelative.RemoteActionCompatParcelizer = str;
            arctorelative.write = 1;
            objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(arctorelative);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = arctorelative.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        CardView$1 cardView$1 = this.RemoteActionCompatParcelizer;
        synchronized (cardView$1) {
            str.getClass();
            cardView$1.read().edit().remove(str).apply();
        }
        return objInvoke;
    }
}
