package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.FocusabilityCompanion;
import o.FocusableChildrenComparator;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import org.koin.core.instance.SingleInstanceFactory$get$1;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigration {
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY IconCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 MediaBrowserCompatMediaItem;
    public final String RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final Set serializer;
    public final Context write;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int serializer = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
            super(i, shortNewsContentCardView);
            this.IconCompatParcelizer = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = write + 57;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i4 = this.IconCompatParcelizer;
            if (i4 == 0) {
                return new AnonymousClass3(i, 0, shortNewsContentCardView);
            }
            int i5 = 1;
            if (i4 != 1) {
                return new AnonymousClass3(i, i, shortNewsContentCardView);
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(i, i5, shortNewsContentCardView);
            int i6 = serializer + 41;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return anonymousClass3;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        
            if (r1 != 1) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        
            r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            return new com.mapbox.navigation.tripdata.speedlimit.api.MapboxSpeedInfoApi();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        
            return new com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowApi();
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r1 != 1) goto L11;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3.serializer
                int r1 = r1 + 65
                int r2 = r1 % 128
                androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3.write = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1a
                int r1 = r4.IconCompatParcelizer
                r3 = 22
                int r3 = r3 / 0
                if (r1 == 0) goto L36
                if (r1 == r2) goto L2b
                goto L20
            L1a:
                int r1 = r4.IconCompatParcelizer
                if (r1 == 0) goto L36
                if (r1 == r2) goto L2b
            L20:
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                com.mapbox.navigation.tripdata.speedlimit.api.MapboxSpeedInfoApi r5 = new com.mapbox.navigation.tripdata.speedlimit.api.MapboxSpeedInfoApi
                r5.<init>()
                return r5
            L2b:
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowApi r5 = new com.mapbox.navigation.ui.maps.route.arrow.api.MapboxRouteArrowApi
                r5.<init>()
                return r5
            L36:
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                coil3.ExtrasKt.RemoteActionCompatParcelizer(r5)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                int r1 = androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3.write
                int r1 = r1 + 95
                int r2 = r1 % 128
                androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3.serializer = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L4c
                r0 = 70
                int r0 = r0 / 0
            L4c:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = serializer + 77;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i4 == 0) {
                ((AnonymousClass3) create(obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return Boolean.TRUE;
            }
            if (i4 != 1) {
                return ((AnonymousClass3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = serializer + 121;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    public SharedPreferencesMigration(Context context, String str, Set set, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        context.getClass();
        set.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        SingleInstanceFactory$get$1 singleInstanceFactory$get$1 = new SingleInstanceFactory$get$1(context, 2, str);
        this.MediaBrowserCompatMediaItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.write = context;
        this.RemoteActionCompatParcelizer = str;
        this.read = new isAdapterPositionOnScreen(singleInstanceFactory$get$1);
        this.serializer = set == FocusableChildrenComparator.serializer ? null : onContentCardDismissed.ParcelableVolumeInfo(set);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object shouldMigrate(Object obj, ContinuationImpl continuationImpl) {
        FocusabilityCompanion focusabilityCompanion;
        SharedPreferencesMigration sharedPreferencesMigration;
        if (continuationImpl instanceof FocusabilityCompanion) {
            focusabilityCompanion = (FocusabilityCompanion) continuationImpl;
            int i = focusabilityCompanion.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                focusabilityCompanion.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                focusabilityCompanion = new FocusabilityCompanion(this, continuationImpl);
            }
        } else {
            focusabilityCompanion = new FocusabilityCompanion(this, continuationImpl);
        }
        Object objInvoke = focusabilityCompanion.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = focusabilityCompanion.IconCompatParcelizer;
        boolean z = true;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            focusabilityCompanion.write = this;
            focusabilityCompanion.IconCompatParcelizer = 1;
            objInvoke = this.MediaBrowserCompatMediaItem.invoke(obj, focusabilityCompanion);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sharedPreferencesMigration = focusabilityCompanion.write;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = sharedPreferencesMigration.serializer;
        isAdapterPositionOnScreen isadapterpositiononscreen = sharedPreferencesMigration.read;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public SharedPreferencesMigration(Context context, String str, SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        LinkedHashSet linkedHashSet = FocusableChildrenComparator.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 anonymousClass3 = sharedPreferencesMigrationKt$getShouldRunMigration$1;
        if ((i & 8) != 0) {
            anonymousClass3 = new AnonymousClass3(2, 0, null);
        }
        this(context, str, linkedHashSet, anonymousClass3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
    }
}
