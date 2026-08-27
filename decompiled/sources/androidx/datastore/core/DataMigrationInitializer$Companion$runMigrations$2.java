package androidx.datastore.core;

import androidx.datastore.migrations.SharedPreferencesMigration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Iterator IconCompatParcelizer;
    public Object MediaMetadataCompat;
    public int RatingCompat;
    public final /* synthetic */ List RemoteActionCompatParcelizer;
    public final /* synthetic */ ArrayList read;
    public /* synthetic */ Object serializer;
    public SharedPreferencesMigration write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2(List list, ArrayList arrayList, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = list;
        this.read = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView);
        dataMigrationInitializer$Companion$runMigrations$2.serializer = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.RatingCompat
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L17
            java.util.Iterator r1 = r11.IconCompatParcelizer
            java.lang.Object r5 = r11.serializer
            java.util.List r5 = (java.util.List) r5
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L3a
        L17:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r4
        L1d:
            java.lang.Object r1 = r11.MediaMetadataCompat
            androidx.datastore.migrations.SharedPreferencesMigration r5 = r11.write
            java.util.Iterator r6 = r11.IconCompatParcelizer
            java.lang.Object r7 = r11.serializer
            java.util.List r7 = (java.util.List) r7
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L5d
        L2b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            java.lang.Object r12 = r11.serializer
            java.util.List r1 = r11.RemoteActionCompatParcelizer
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r5 = r11.read
        L3a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r1.next()
            androidx.datastore.migrations.SharedPreferencesMigration r6 = (androidx.datastore.migrations.SharedPreferencesMigration) r6
            r11.serializer = r5
            r11.IconCompatParcelizer = r1
            r11.write = r6
            r11.MediaMetadataCompat = r12
            r11.RatingCompat = r3
            java.lang.Object r7 = r6.shouldMigrate(r12, r11)
            if (r7 != r0) goto L57
            goto L8f
        L57:
            r10 = r1
            r1 = r12
            r12 = r7
            r7 = r5
            r5 = r6
            r6 = r10
        L5d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L90
            com.mapbox.navigation.core.MapboxNavigation$parsing$2 r12 = new com.mapbox.navigation.core.MapboxNavigation$parsing$2
            r8 = 3
            r12.<init>(r5, r4, r8)
            r7.add(r12)
            r11.serializer = r7
            r11.IconCompatParcelizer = r6
            r11.write = r4
            r11.MediaMetadataCompat = r4
            r11.RatingCompat = r2
            o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r12 = r5.IconCompatParcelizer
            o.isAdapterPositionOnScreen r8 = r5.read
            java.lang.Object r8 = r8.MediaSessionCompatResultReceiverWrapper()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.util.Set r5 = r5.serializer
            o.getSystemDefinedLCbbffg r9 = new o.getSystemDefinedLCbbffg
            r9.<init>(r8, r5)
            java.lang.Object r12 = r12.invoke(r9, r1, r11)
            if (r12 != r0) goto L91
        L8f:
            return r0
        L90:
            r12 = r1
        L91:
            r1 = r6
            r5 = r7
            goto L3a
        L94:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
