package com.roadrunner.customerchat.selfservice.data.cache;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.addBullet;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.mapAnnotations;
import o.onContentCardDismissed;
import o.withBulletListo2QH7mIdefault;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatIdCacheHelper {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final LinkedHashMap read = new LinkedHashMap();
    public final MutexImpl serializer = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    public final int RemoteActionCompatParcelizer = 10;

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public final Object clear(ContinuationImpl continuationImpl) {
        mapAnnotations mapannotations;
        MutexImpl mutexImpl;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof mapAnnotations) {
            int i5 = i3 + 25;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            mapannotations = (mapAnnotations) continuationImpl;
            int i7 = mapannotations.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = IconCompatParcelizer + 99;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                mapannotations.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                mapannotations = new mapAnnotations(this, continuationImpl);
            }
        } else {
            mapannotations = new mapAnnotations(this, continuationImpl);
        }
        Object obj = mapannotations.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = mapannotations.RemoteActionCompatParcelizer;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutexImpl mutexImpl2 = this.serializer;
            mapannotations.read = mutexImpl2;
            mapannotations.RemoteActionCompatParcelizer = 1;
            if (mutexImpl2.lock(mapannotations) == coroutineSingletons) {
                int i11 = IconCompatParcelizer + 63;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
            mutexImpl = mutexImpl2;
        } else {
            if (i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i13 = IconCompatParcelizer + 19;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return null;
            }
            int i15 = IconCompatParcelizer + 39;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            mutexImpl = mapannotations.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            this.read.clear();
            return createFromParcel.INSTANCE;
        } finally {
            mutexImpl.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object get(String str, ContinuationImpl continuationImpl) {
        addBullet addbullet;
        MutexImpl mutexImpl;
        int i = 2 % 2;
        if (continuationImpl instanceof addBullet) {
            int i2 = write + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            addbullet = (addBullet) continuationImpl;
            int i4 = addbullet.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 43;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                addbullet.serializer = i4 - Integer.MIN_VALUE;
            } else {
                addbullet = new addBullet(this, continuationImpl);
            }
        } else {
            addbullet = new addBullet(this, continuationImpl);
        }
        Object obj = addbullet.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = addbullet.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            addbullet.RemoteActionCompatParcelizer = str;
            mutexImpl = this.serializer;
            addbullet.read = mutexImpl;
            addbullet.serializer = 1;
            if (mutexImpl.lock(addbullet) == coroutineSingletons) {
                int i8 = write + 37;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutexImpl mutexImpl2 = addbullet.read;
            String str2 = addbullet.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutexImpl = mutexImpl2;
            str = str2;
        }
        try {
            return (String) this.read.get(str);
        } finally {
            mutexImpl.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    public final Object put(String str, String str2, ContinuationImpl continuationImpl) {
        withBulletListo2QH7mIdefault withbulletlisto2qh7midefault;
        MutexImpl mutexImpl;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        LinkedHashMap linkedHashMap = this.read;
        if (continuationImpl instanceof withBulletListo2QH7mIdefault) {
            int i5 = i3 + 105;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            withbulletlisto2qh7midefault = (withBulletListo2QH7mIdefault) continuationImpl;
            int i7 = withbulletlisto2qh7midefault.write;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = IconCompatParcelizer + 21;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                withbulletlisto2qh7midefault.write = i7 - Integer.MIN_VALUE;
            } else {
                withbulletlisto2qh7midefault = new withBulletListo2QH7mIdefault(this, continuationImpl);
            }
        } else {
            withbulletlisto2qh7midefault = new withBulletListo2QH7mIdefault(this, continuationImpl);
        }
        Object obj = withbulletlisto2qh7midefault.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = withbulletlisto2qh7midefault.write;
        if (i10 != 0) {
            int i11 = IconCompatParcelizer + 27;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0 ? i10 != 1 : i10 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            MutexImpl mutexImpl2 = withbulletlisto2qh7midefault.read;
            str2 = withbulletlisto2qh7midefault.serializer;
            String str3 = withbulletlisto2qh7midefault.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            mutexImpl = mutexImpl2;
            str = str3;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            withbulletlisto2qh7midefault.RemoteActionCompatParcelizer = str;
            withbulletlisto2qh7midefault.serializer = str2;
            mutexImpl = this.serializer;
            withbulletlisto2qh7midefault.read = mutexImpl;
            withbulletlisto2qh7midefault.write = 1;
            if (mutexImpl.lock(withbulletlisto2qh7midefault) == coroutineSingletons) {
                int i12 = write;
                int i13 = i12 + 121;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 0 / 0;
                }
                int i15 = i12 + 23;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return coroutineSingletons;
            }
        }
        try {
            linkedHashMap.remove(str);
            linkedHashMap.put(str, str2);
            while (linkedHashMap.size() > this.RemoteActionCompatParcelizer) {
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                Object objIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Iterable) setKeySet);
                objIconCompatParcelizer.getClass();
                linkedHashMap.remove((String) objIconCompatParcelizer);
            }
            return createFromParcel.INSTANCE;
        } finally {
            mutexImpl.write(null);
        }
    }
}
