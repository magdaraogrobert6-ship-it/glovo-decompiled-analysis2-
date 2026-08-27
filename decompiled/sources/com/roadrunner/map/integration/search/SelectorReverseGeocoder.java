package com.roadrunner.map.integration.search;

import android.location.Geocoder;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator$$ExternalSyntheticLambda2;
import com.roadrunner.login.presentation.signin.SignInViewModel$onSignInClicked$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import dagger.Lazy;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BrazeExternalSyntheticLambda5;
import o.createFromParcel;
import o.getCieXyz;
import o.getLayoutIntrinsics;
import o.ggExternalSyntheticLambda0;
import o.isOpenInternalroom_runtime;
import o.n9;
import o.nd;
import o.ne;
import o.o2;
import o.o2ExternalSyntheticLambda3;
import o.o3;
import o.o6ExternalSyntheticLambda15;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI;
import o.removeNodeAtDepth;
import o.unpackInt2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectorReverseGeocoder {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final n9 IconCompatParcelizer;
    public final Lazy RemoteActionCompatParcelizer;
    public final Lazy read;
    public final unpackInt2 serializer;
    public final InitialiseMapboxSearch write;

    public SelectorReverseGeocoder(BrazeExternalSyntheticLambda5 brazeExternalSyntheticLambda5, Lazy lazy, Lazy lazy2, InitialiseMapboxSearch initialiseMapboxSearch, n9 n9Var, unpackInt2 unpackint2, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.read = lazy;
        this.RemoteActionCompatParcelizer = lazy2;
        this.write = initialiseMapboxSearch;
        this.IconCompatParcelizer = n9Var;
        this.serializer = unpackint2;
    }

    public final boolean write() {
        boolean zIsPresent;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 21;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                zIsPresent = Geocoder.isPresent();
                int i3 = 47 / 0;
            } else {
                zIsPresent = Geocoder.isPresent();
            }
            return zIsPresent;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.read(e, "AndroidGeocoderWrapper.isPresent() threw, treating native geocoder as absent", new Object[0]);
            return false;
        }
    }

    public final Object invoke(double d, double d2, LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda1, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda2, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda3, getLayoutIntrinsics getlayoutintrinsics) throws Throwable {
        Object next;
        Object objLegacyGeocoder;
        int i = 2 % 2;
        nd ndVar = new nd(d, d2);
        o2 o2Var = o2ExternalSyntheticLambda3.Companion;
        String str = ((FirebaseRemoteConfigImpl) this.serializer.RemoteActionCompatParcelizer).IconCompatParcelizer.read("android_reverse_geocoding_provider");
        o2Var.getClass();
        Iterator<E> it = o2ExternalSyntheticLambda3.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((o2ExternalSyntheticLambda3) next).getValue(), str}, getCieXyz.write())).booleanValue());
        o2ExternalSyntheticLambda3 o2externalsyntheticlambda3 = (o2ExternalSyntheticLambda3) next;
        if (o2externalsyntheticlambda3 == null) {
            o2externalsyntheticlambda3 = o2ExternalSyntheticLambda3.LEGACY;
        }
        int i2 = o3.RemoteActionCompatParcelizer[o2externalsyntheticlambda3.ordinal()];
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                Object objLegacyGeocoder2 = legacyGeocoder(ndVar, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, false, getlayoutintrinsics);
                if (objLegacyGeocoder2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objLegacyGeocoder2;
                }
            } else {
                if (!write()) {
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda2.invoke(null);
                    return createfromparcel;
                }
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInViewModel$onSignInClicked$1(this, ndVar, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, false, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, null), getlayoutintrinsics);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objWithContext != coroutineSingletons) {
                    int i3 = MediaDescriptionCompat + 43;
                    MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    objWithContext = createfromparcel;
                }
                if (objWithContext == coroutineSingletons) {
                    return objWithContext;
                }
            }
        } else if (write()) {
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInViewModel$onSignInClicked$1(this, ndVar, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, true, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, null), getlayoutintrinsics);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext2 != coroutineSingletons2) {
                objWithContext2 = createfromparcel;
            }
            if (objWithContext2 == coroutineSingletons2) {
                int i5 = MediaDescriptionCompat + 13;
                MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return objWithContext2;
                }
                throw null;
            }
        } else {
            int i6 = MediaDescriptionCompat + 83;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? (objLegacyGeocoder = legacyGeocoder(ndVar, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, false, getlayoutintrinsics)) == CoroutineSingletons.COROUTINE_SUSPENDED : (objLegacyGeocoder = legacyGeocoder(ndVar, lastStopSelectionCoordinator$$ExternalSyntheticLambda1, lastStopSelectionCoordinator$$ExternalSyntheticLambda2, lastStopSelectionCoordinator$$ExternalSyntheticLambda3, true, getlayoutintrinsics)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objLegacyGeocoder;
            }
        }
        int i7 = MediaDescriptionCompat + 37;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public final Object legacyGeocoder(nd ndVar, LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda1, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda2, LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda3, boolean z, ContinuationImpl continuationImpl) {
        o6ExternalSyntheticLambda15 o6externalsyntheticlambda15;
        int i;
        LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda4;
        nd ndVar2;
        LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda5;
        LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda6;
        boolean z2;
        LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda7;
        LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda8;
        nd ndVar3;
        ne neVar;
        double d;
        double d2;
        r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI r8lambdaaazn5el4wkw0o5j25k1e0csgpoi;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 11;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (continuationImpl instanceof o6ExternalSyntheticLambda15) {
            o6externalsyntheticlambda15 = (o6ExternalSyntheticLambda15) continuationImpl;
            int i6 = o6externalsyntheticlambda15.MediaDescriptionCompat;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                o6externalsyntheticlambda15.MediaDescriptionCompat = i6 - Integer.MIN_VALUE;
            } else {
                o6externalsyntheticlambda15 = new o6ExternalSyntheticLambda15(this, continuationImpl);
            }
        } else {
            o6externalsyntheticlambda15 = new o6ExternalSyntheticLambda15(this, continuationImpl);
        }
        o6ExternalSyntheticLambda15 o6externalsyntheticlambda16 = o6externalsyntheticlambda15;
        int i7 = MediaBrowserCompatMediaItem + 97;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        Object obj = o6externalsyntheticlambda16.RatingCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = o6externalsyntheticlambda16.MediaDescriptionCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        try {
            if (i9 != 0) {
                int i10 = MediaDescriptionCompat + 21;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (i9 != 1) {
                    if (i9 == 2) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = o6externalsyntheticlambda16.write;
                boolean z3 = o6externalsyntheticlambda16.MediaBrowserCompatMediaItem;
                LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda9 = o6externalsyntheticlambda16.IconCompatParcelizer;
                LastStopSelectionCoordinator$$ExternalSyntheticLambda2 lastStopSelectionCoordinator$$ExternalSyntheticLambda10 = o6externalsyntheticlambda16.RemoteActionCompatParcelizer;
                LastStopSelectionCoordinator$$ExternalSyntheticLambda1 lastStopSelectionCoordinator$$ExternalSyntheticLambda11 = o6externalsyntheticlambda16.read;
                ndVar3 = o6externalsyntheticlambda16.serializer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    z2 = z3;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda8 = lastStopSelectionCoordinator$$ExternalSyntheticLambda9;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda7 = lastStopSelectionCoordinator$$ExternalSyntheticLambda10;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda5 = lastStopSelectionCoordinator$$ExternalSyntheticLambda11;
                    if (i != 0) {
                        Object objWrite = this.RemoteActionCompatParcelizer.write();
                        objWrite.getClass();
                        neVar = (ne) objWrite;
                    } else {
                        Object objWrite2 = this.read.write();
                        objWrite2.getClass();
                        neVar = (ne) objWrite2;
                    }
                    d = ndVar3.read;
                    d2 = ndVar3.IconCompatParcelizer;
                    r8lambdaaazn5el4wkw0o5j25k1e0csgpoi = new r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI(lastStopSelectionCoordinator$$ExternalSyntheticLambda5, z2, 3);
                    o6externalsyntheticlambda16.serializer = null;
                    o6externalsyntheticlambda16.read = null;
                    o6externalsyntheticlambda16.RemoteActionCompatParcelizer = null;
                    o6externalsyntheticlambda16.IconCompatParcelizer = null;
                    o6externalsyntheticlambda16.MediaBrowserCompatMediaItem = z2;
                    o6externalsyntheticlambda16.write = i;
                    o6externalsyntheticlambda16.MediaDescriptionCompat = 2;
                    if (neVar.invoke(d, d2, r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, lastStopSelectionCoordinator$$ExternalSyntheticLambda7, lastStopSelectionCoordinator$$ExternalSyntheticLambda8, o6externalsyntheticlambda16) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = MediaDescriptionCompat + 23;
                    MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return createfromparcel;
                    }
                    obj2.hashCode();
                    throw null;
                } catch (Exception e) {
                    e = e;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda4 = lastStopSelectionCoordinator$$ExternalSyntheticLambda9;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda4.invoke(e);
                    return createfromparcel;
                }
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i = ggExternalSyntheticLambda0.MAPBOX == ggExternalSyntheticLambda0.NAVER ? 1 : 0;
            if (i != 1) {
                try {
                    InitialiseMapboxSearch initialiseMapboxSearch = this.write;
                    ndVar2 = ndVar;
                    o6externalsyntheticlambda16.serializer = ndVar2;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda5 = lastStopSelectionCoordinator$$ExternalSyntheticLambda1;
                    o6externalsyntheticlambda16.read = lastStopSelectionCoordinator$$ExternalSyntheticLambda5;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda6 = lastStopSelectionCoordinator$$ExternalSyntheticLambda2;
                    o6externalsyntheticlambda16.RemoteActionCompatParcelizer = lastStopSelectionCoordinator$$ExternalSyntheticLambda6;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda4 = lastStopSelectionCoordinator$$ExternalSyntheticLambda3;
                    try {
                        o6externalsyntheticlambda16.IconCompatParcelizer = lastStopSelectionCoordinator$$ExternalSyntheticLambda4;
                        z2 = z;
                        o6externalsyntheticlambda16.MediaBrowserCompatMediaItem = z2;
                        o6externalsyntheticlambda16.write = i;
                        o6externalsyntheticlambda16.MediaDescriptionCompat = 1;
                        if (initialiseMapboxSearch.invoke(o6externalsyntheticlambda16) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        lastStopSelectionCoordinator$$ExternalSyntheticLambda4.invoke(e);
                        return createfromparcel;
                    }
                } catch (Exception e3) {
                    e = e3;
                    lastStopSelectionCoordinator$$ExternalSyntheticLambda4 = lastStopSelectionCoordinator$$ExternalSyntheticLambda3;
                }
            } else {
                ndVar2 = ndVar;
                lastStopSelectionCoordinator$$ExternalSyntheticLambda5 = lastStopSelectionCoordinator$$ExternalSyntheticLambda1;
                lastStopSelectionCoordinator$$ExternalSyntheticLambda6 = lastStopSelectionCoordinator$$ExternalSyntheticLambda2;
                lastStopSelectionCoordinator$$ExternalSyntheticLambda4 = lastStopSelectionCoordinator$$ExternalSyntheticLambda3;
                z2 = z;
            }
            lastStopSelectionCoordinator$$ExternalSyntheticLambda7 = lastStopSelectionCoordinator$$ExternalSyntheticLambda6;
            lastStopSelectionCoordinator$$ExternalSyntheticLambda8 = lastStopSelectionCoordinator$$ExternalSyntheticLambda4;
            ndVar3 = ndVar2;
            if (i != 0) {
                Object objWrite3 = this.RemoteActionCompatParcelizer.write();
                objWrite3.getClass();
                neVar = (ne) objWrite3;
            } else {
                Object objWrite4 = this.read.write();
                objWrite4.getClass();
                neVar = (ne) objWrite4;
            }
            d = ndVar3.read;
            d2 = ndVar3.IconCompatParcelizer;
            r8lambdaaazn5el4wkw0o5j25k1e0csgpoi = new r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI(lastStopSelectionCoordinator$$ExternalSyntheticLambda5, z2, 3);
            o6externalsyntheticlambda16.serializer = null;
            o6externalsyntheticlambda16.read = null;
            o6externalsyntheticlambda16.RemoteActionCompatParcelizer = null;
            o6externalsyntheticlambda16.IconCompatParcelizer = null;
            o6externalsyntheticlambda16.MediaBrowserCompatMediaItem = z2;
            o6externalsyntheticlambda16.write = i;
            o6externalsyntheticlambda16.MediaDescriptionCompat = 2;
            if (neVar.invoke(d, d2, r8lambdaaazn5el4wkw0o5j25k1e0csgpoi, lastStopSelectionCoordinator$$ExternalSyntheticLambda7, lastStopSelectionCoordinator$$ExternalSyntheticLambda8, o6externalsyntheticlambda16) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i2 = MediaDescriptionCompat + 23;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return createfromparcel;
            }
            obj2.hashCode();
            throw null;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
