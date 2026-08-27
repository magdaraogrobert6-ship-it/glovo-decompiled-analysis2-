package com.roadrunner.settings.data.cache;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.buildSessionPackage;
import o.createFromParcel;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0;
import o.r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c;
import o.r8lambdaKmdawKcjUWWHthk2KpePFaPHZk;
import o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsCacheImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final isRoot IconCompatParcelizer = new isRoot("settings_deeplinks");
    public final buildSessionPackage RemoteActionCompatParcelizer;

    public SettingsCacheImpl(buildSessionPackage buildsessionpackage) {
        this.RemoteActionCompatParcelizer = buildsessionpackage;
    }

    public final performCustomExitMxy_nc0 serializer() {
        performCustomExitMxy_nc0 performcustomexitmxy_nc0;
        int i = 2 % 2;
        int i2 = serializer + 123;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object objWrite = this.RemoteActionCompatParcelizer.write();
            objWrite.getClass();
            performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) objWrite;
            int i3 = 86 / 0;
        } else {
            Object objWrite2 = this.RemoteActionCompatParcelizer.write();
            objWrite2.getClass();
            performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) objWrite2;
        }
        int i4 = read + 113;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    public final Object shouldClearCache(ContinuationImpl continuationImpl) {
        r8lambdaKmdawKcjUWWHthk2KpePFaPHZk r8lambdakmdawkcjuwwhthk2kpepfaphzk;
        int i = 2 % 2;
        if (continuationImpl instanceof r8lambdaKmdawKcjUWWHthk2KpePFaPHZk) {
            r8lambdakmdawkcjuwwhthk2kpepfaphzk = (r8lambdaKmdawKcjUWWHthk2KpePFaPHZk) continuationImpl;
            int i2 = r8lambdakmdawkcjuwwhthk2kpepfaphzk.serializer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = read + 7;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    r8lambdakmdawkcjuwwhthk2kpepfaphzk.serializer = i2 >> Integer.MIN_VALUE;
                } else {
                    r8lambdakmdawkcjuwwhthk2kpepfaphzk.serializer = i2 - Integer.MIN_VALUE;
                }
                int i4 = read + 81;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                r8lambdakmdawkcjuwwhthk2kpepfaphzk = new r8lambdaKmdawKcjUWWHthk2KpePFaPHZk(this, continuationImpl);
            }
        } else {
            r8lambdakmdawkcjuwwhthk2kpepfaphzk = new r8lambdaKmdawKcjUWWHthk2KpePFaPHZk(this, continuationImpl);
        }
        Object objFirstOrNull = r8lambdakmdawkcjuwwhthk2kpepfaphzk.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = r8lambdakmdawkcjuwwhthk2kpepfaphzk.serializer;
        boolean z = true;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            GetAppStateImpl$invoke$$inlined$map$1 getAppStateImpl$invoke$$inlined$map$1 = new GetAppStateImpl$invoke$$inlined$map$1(serializer().serializer(), 8);
            r8lambdakmdawkcjuwwhthk2kpepfaphzk.serializer = 1;
            objFirstOrNull = FlowKt.firstOrNull(getAppStateImpl$invoke$$inlined$map$1, r8lambdakmdawkcjuwwhthk2kpepfaphzk);
            if (objFirstOrNull == coroutineSingletons) {
                int i7 = read + 91;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        Set set = (Set) objFirstOrNull;
        if (set != null) {
            int i9 = read + 119;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 1 / 0;
                if (!set.isEmpty()) {
                    if (set.contains(this.IconCompatParcelizer)) {
                    }
                }
            } else if (!set.isEmpty()) {
                if (set.contains(this.IconCompatParcelizer)) {
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public static final Object access$fromJson(SettingsCacheImpl settingsCacheImpl, String str, ContinuationImpl continuationImpl) {
        r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0 r8lambdajcyq9hdmmd1ary7swiiuljtmbm0;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 89;
        serializer = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 == 0) {
            settingsCacheImpl.getClass();
            boolean z = continuationImpl instanceof r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        settingsCacheImpl.getClass();
        if (continuationImpl instanceof r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0) {
            r8lambdajcyq9hdmmd1ary7swiiuljtmbm0 = (r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0) continuationImpl;
            int i4 = r8lambdajcyq9hdmmd1ary7swiiuljtmbm0.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 25;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambdajcyq9hdmmd1ary7swiiuljtmbm0.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                r8lambdajcyq9hdmmd1ary7swiiuljtmbm0 = new r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0(settingsCacheImpl, continuationImpl);
            }
        } else {
            r8lambdajcyq9hdmmd1ary7swiiuljtmbm0 = new r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0(settingsCacheImpl, continuationImpl);
        }
        Object obj = r8lambdajcyq9hdmmd1ary7swiiuljtmbm0.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = r8lambdajcyq9hdmmd1ary7swiiuljtmbm0.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            int i8 = read + 29;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i10 = read + 77;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao.Companion.serializer());
            return (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (SerializationException unused) {
            r8lambdajcyq9hdmmd1ary7swiiuljtmbm0.RemoteActionCompatParcelizer = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(settingsCacheImpl.serializer(), new SignInDataStore$clear$2(i, 21, shortNewsContentCardView), r8lambdajcyq9hdmmd1ary7swiiuljtmbm0);
            if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objSerializer = createFromParcel.INSTANCE;
            }
            if (objSerializer != obj2) {
                return null;
            }
            int i12 = read + 13;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return obj2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[PHI: r11
  0x00b8: PHI (r11v2 o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) = 
  (r11v4 o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao)
  (r11v4 o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao)
  (r11v6 o.r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao)
 binds: [B:32:0x0093, B:37:0x00b5, B:26:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object set(r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao, ContinuationImpl continuationImpl) {
        r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c r8lambdakeiwe9uagm3tetmhhkwznuc1c;
        performCustomExitMxy_nc0 performcustomexitmxy_nc0Serializer;
        NafathTimerDataStore$set$2 nafathTimerDataStore$set$2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 99;
        read = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c) {
            r8lambdakeiwe9uagm3tetmhhkwznuc1c = (r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c) continuationImpl;
            int i4 = r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 77;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                r8lambdakeiwe9uagm3tetmhhkwznuc1c = new r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c(this, continuationImpl);
            }
        } else {
            r8lambdakeiwe9uagm3tetmhhkwznuc1c = new r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c(this, continuationImpl);
        }
        Object objShouldClearCache = r8lambdakeiwe9uagm3tetmhhkwznuc1c.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objShouldClearCache);
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.read = r8lambdanyj3ixzjgs1drw4t7o1og6tkao;
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = 1;
            objShouldClearCache = shouldClearCache(r8lambdakeiwe9uagm3tetmhhkwznuc1c);
            if (objShouldClearCache != obj) {
            }
            return obj;
        }
        int i8 = read;
        int i9 = i8 + 11;
        serializer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0 ? i7 == 1 : i7 == 0) {
            r8lambdanyj3ixzjgs1drw4t7o1og6tkao = r8lambdakeiwe9uagm3tetmhhkwznuc1c.read;
            ExtrasKt.RemoteActionCompatParcelizer(objShouldClearCache);
        } else if (i7 == 2) {
            r8lambdanyj3ixzjgs1drw4t7o1og6tkao = r8lambdakeiwe9uagm3tetmhhkwznuc1c.read;
            ExtrasKt.RemoteActionCompatParcelizer(objShouldClearCache);
            performcustomexitmxy_nc0Serializer = serializer();
            nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(this, r8lambdanyj3ixzjgs1drw4t7o1og6tkao, shortNewsContentCardView, 18);
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.read = null;
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = 3;
            if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0Serializer, nafathTimerDataStore$set$2, r8lambdakeiwe9uagm3tetmhhkwznuc1c) == obj) {
                return obj;
            }
        } else {
            if (i7 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i8 + 65;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objShouldClearCache);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objShouldClearCache);
            int i11 = read + 119;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return obj2;
        if (((Boolean) objShouldClearCache).booleanValue()) {
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.read = r8lambdanyj3ixzjgs1drw4t7o1og6tkao;
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = 2;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(serializer(), new SignInDataStore$clear$2(i, 21, shortNewsContentCardView), r8lambdakeiwe9uagm3tetmhhkwznuc1c);
            if (objSerializer != obj) {
                int i13 = read + 57;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                objSerializer = obj2;
            }
            if (objSerializer != obj) {
                performcustomexitmxy_nc0Serializer = serializer();
                nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(this, r8lambdanyj3ixzjgs1drw4t7o1og6tkao, shortNewsContentCardView, 18);
                r8lambdakeiwe9uagm3tetmhhkwznuc1c.read = null;
                r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = 3;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0Serializer, nafathTimerDataStore$set$2, r8lambdakeiwe9uagm3tetmhhkwznuc1c) == obj) {
                    return obj2;
                }
            }
        } else {
            performcustomexitmxy_nc0Serializer = serializer();
            nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(this, r8lambdanyj3ixzjgs1drw4t7o1og6tkao, shortNewsContentCardView, 18);
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.read = null;
            r8lambdakeiwe9uagm3tetmhhkwznuc1c.IconCompatParcelizer = 3;
            if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0Serializer, nafathTimerDataStore$set$2, r8lambdakeiwe9uagm3tetmhhkwznuc1c) == obj) {
                return obj2;
            }
        }
        return obj;
    }
}
