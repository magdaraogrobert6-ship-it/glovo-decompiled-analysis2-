package com.roadrunner.heatmap.domain;

import android.location.Location;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.data.util.sharedPreferences.SharedPreferencesManagerImpl;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowKt;
import o.AsyncFontListLoaderloadWithTimeoutOrNull2;
import o.CoordinatorLayoutSavedState;
import o.ExtensionWindowAreaStatusRequirements;
import o.FrameworkServiceWorkerClient;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.SystemLifecycleContentProvider;
import o.accessgetGocp;
import o.accessisMainThread;
import o.createFromParcel;
import o.endRearDisplayPresentationSession;
import o.getActionViewIntentlambda0;
import o.getCallbackId;
import o.getLifecycleRegistryannotations;
import o.getNeedsLetterSpacingSpan;
import o.getProductId;
import o.getRearDisplayMetrics;
import o.getRearDisplayPresentation;
import o.getTextSelectionRange;
import o.isItemDismissable;
import o.isMainThread;
import o.isTrackingEnabled;
import o.onItemDismiss;
import o.putdefault;
import o.r8lambdaI0rwLnY7SWJ2zbMkkgoBaCvlVM;
import o.r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY;
import o.r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk;
import o.removeRearDisplayPresentationStatusListener;
import o.startDifferentialMotionFling;
import o.toFontFamily;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveHeatmapUrlImpl implements FrameworkServiceWorkerClient, SystemLifecycleContentProvider {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object serializer;

    @Override // o.FrameworkServiceWorkerClient
    public void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public SaveHeatmapUrlImpl(accessisMainThread accessismainthread) {
        this.IconCompatParcelizer = 16;
        accessismainthread.getClass();
        this.serializer = accessismainthread;
    }

    public /* synthetic */ SaveHeatmapUrlImpl(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    public SaveHeatmapUrlImpl(Set set) {
        this.IconCompatParcelizer = 6;
        set.getClass();
        this.serializer = set;
    }

    public /* synthetic */ SaveHeatmapUrlImpl(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    public SaveHeatmapUrlImpl(SideMenuRepository sideMenuRepository) {
        this.IconCompatParcelizer = 28;
        sideMenuRepository.getClass();
        this.serializer = sideMenuRepository;
    }

    public static void serializer(String str, String str2) {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.write(new Exception(af$$ExternalSyntheticOutline0.m("Could not map geometry: ", str, ". Exception: ", str2)));
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
    }

    public SaveHeatmapUrlImpl(getActionViewIntentlambda0 getactionviewintentlambda0, getRearDisplayMetrics getreardisplaymetrics) {
        this.IconCompatParcelizer = 2;
        this.serializer = getreardisplaymetrics;
    }

    public SaveHeatmapUrlImpl(SharedPreferencesManagerImpl sharedPreferencesManagerImpl) {
        this.IconCompatParcelizer = 29;
        sharedPreferencesManagerImpl.getClass();
        this.serializer = sharedPreferencesManagerImpl;
    }

    public SaveHeatmapUrlImpl(r8lambdacj1MEPsdBAzy84SfpNJAlW40JlY r8lambdacj1mepsdbazy84sfpnjalw40jly, isMainThread ismainthread) {
        this.IconCompatParcelizer = 20;
        r8lambdacj1mepsdbazy84sfpnjalw40jly.getClass();
        this.serializer = r8lambdacj1mepsdbazy84sfpnjalw40jly;
    }

    public SaveHeatmapUrlImpl(GetCourierStatusUseCaseImpl getCourierStatusUseCaseImpl) {
        this.IconCompatParcelizer = 14;
        getCourierStatusUseCaseImpl.getClass();
        this.serializer = getCourierStatusUseCaseImpl;
    }

    public SaveHeatmapUrlImpl(r8lambdaI0rwLnY7SWJ2zbMkkgoBaCvlVM r8lambdai0rwlny7swj2zbmkkgobacvlvm) {
        this.IconCompatParcelizer = 4;
        r8lambdai0rwlny7swj2zbmkkgobacvlvm.getClass();
        this.serializer = r8lambdai0rwlny7swj2zbmkkgobacvlvm;
    }

    public SaveHeatmapUrlImpl(getProductId getproductid) {
        this.IconCompatParcelizer = 22;
        getproductid.getClass();
        this.serializer = getproductid;
    }

    public SaveHeatmapUrlImpl(removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener) {
        this.IconCompatParcelizer = 17;
        removereardisplaypresentationstatuslistener.getClass();
        this.serializer = removereardisplaypresentationstatuslistener;
    }

    public static toFontFamily read(AsyncFontListLoaderloadWithTimeoutOrNull2 asyncFontListLoaderloadWithTimeoutOrNull2) {
        List list;
        Iterator it;
        int i = 2 % 2;
        putdefault putdefaultVarRemoteActionCompatParcelizer = asyncFontListLoaderloadWithTimeoutOrNull2.RemoteActionCompatParcelizer();
        Object obj = null;
        if (putdefaultVarRemoteActionCompatParcelizer == null || (list = putdefaultVarRemoteActionCompatParcelizer.read()) == null) {
            return null;
        }
        int i2 = write + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            it = list.iterator();
            int i3 = 80 / 0;
        } else {
            it = list.iterator();
        }
        int i4 = RemoteActionCompatParcelizer + 33;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            Object next = it.next();
            if (!(!(next instanceof toFontFamily))) {
                obj = next;
                break;
            }
        }
        return (toFontFamily) obj;
    }

    @Override // o.FrameworkServiceWorkerClient
    public void RemoteActionCompatParcelizer(Location location) {
        Object endreardisplaypresentationsession;
        int i = 2 % 2;
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.serializer;
        ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = new ExtensionWindowAreaStatusRequirements(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getBearing(), location.getSpeed(), location.getTime());
        if (location.isFromMockProvider()) {
            endreardisplaypresentationsession = new getRearDisplayPresentation(extensionWindowAreaStatusRequirements);
            int i2 = RemoteActionCompatParcelizer + 95;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            endreardisplaypresentationsession = new endRearDisplayPresentationSession(extensionWindowAreaStatusRequirements);
        }
        ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).b_(endreardisplaypresentationsession);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object getUser(ContinuationImpl continuationImpl) {
        CoordinatorLayoutSavedState coordinatorLayoutSavedState;
        int i = 2 % 2;
        int i2 = write + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof CoordinatorLayoutSavedState) {
            coordinatorLayoutSavedState = (CoordinatorLayoutSavedState) continuationImpl;
            int i4 = coordinatorLayoutSavedState.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                coordinatorLayoutSavedState.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                coordinatorLayoutSavedState = new CoordinatorLayoutSavedState(this, continuationImpl);
            }
        } else {
            coordinatorLayoutSavedState = new CoordinatorLayoutSavedState(this, continuationImpl);
        }
        Object objInvoke = coordinatorLayoutSavedState.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = coordinatorLayoutSavedState.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = write + 43;
            int i7 = i6 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i7;
            int i8 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i7 + 3;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            int i11 = RemoteActionCompatParcelizer + 55;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            GetUserDataUseCaseImpl getUserDataUseCaseImpl = (GetUserDataUseCaseImpl) this.serializer;
            coordinatorLayoutSavedState.IconCompatParcelizer = 1;
            objInvoke = getUserDataUseCaseImpl.invoke(coordinatorLayoutSavedState);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        getTextSelectionRange gettextselectionrange = (getTextSelectionRange) objInvoke;
        getLifecycleRegistryannotations getlifecycleregistryannotations = new getLifecycleRegistryannotations(gettextselectionrange.ParcelableVolumeInfo, gettextselectionrange.MediaSessionCompatQueueItem, gettextselectionrange.PlaybackStateCompat, gettextselectionrange.RemoteActionCompatParcelizer);
        int i13 = write + 3;
        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            int i14 = 16 / 0;
        }
        return getlifecycleregistryannotations;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public Object invoke(ContinuationImpl continuationImpl) {
        startDifferentialMotionFling startdifferentialmotionfling;
        r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk r8lambdaobiif3xbqoao3g1eh830fbs4wgk;
        Object objM5068fetchSideMenuIoAF18A;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i2 != 14) {
            if (continuationImpl instanceof r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk) {
                r8lambdaobiif3xbqoao3g1eh830fbs4wgk = (r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk) continuationImpl;
                int i3 = r8lambdaobiif3xbqoao3g1eh830fbs4wgk.serializer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i4 = RemoteActionCompatParcelizer + 95;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    r8lambdaobiif3xbqoao3g1eh830fbs4wgk.serializer = i3 - Integer.MIN_VALUE;
                } else {
                    r8lambdaobiif3xbqoao3g1eh830fbs4wgk = new r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk(this, continuationImpl);
                }
            } else {
                r8lambdaobiif3xbqoao3g1eh830fbs4wgk = new r8lambdaobiiF3xbQoaO3g1Eh830fbs4wgk(this, continuationImpl);
            }
            Object obj2 = r8lambdaobiif3xbqoao3g1eh830fbs4wgk.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = r8lambdaobiif3xbqoao3g1eh830fbs4wgk.serializer;
            if (i6 != 0) {
                int i7 = write;
                int i8 = i7 + 101;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = i7 + 79;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                objM5068fetchSideMenuIoAF18A = ((onItemDismiss) obj2).IconCompatParcelizer;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                r8lambdaobiif3xbqoao3g1eh830fbs4wgk.serializer = 1;
                objM5068fetchSideMenuIoAF18A = ((SideMenuRepository) obj).m5068fetchSideMenuIoAF18A(r8lambdaobiif3xbqoao3g1eh830fbs4wgk);
                if (objM5068fetchSideMenuIoAF18A == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (!(objM5068fetchSideMenuIoAF18A instanceof isItemDismissable)) {
            }
            Throwable thSerializer = onItemDismiss.serializer(objM5068fetchSideMenuIoAF18A);
            if (thSerializer != null) {
                int i12 = write + 19;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Side menu update failed", new Object[0]);
            }
            return createFromParcel.INSTANCE;
        }
        if (continuationImpl instanceof startDifferentialMotionFling) {
            int i14 = write + 115;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            startdifferentialmotionfling = (startDifferentialMotionFling) continuationImpl;
            int i16 = startdifferentialmotionfling.IconCompatParcelizer;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                startdifferentialmotionfling.IconCompatParcelizer = i16 - Integer.MIN_VALUE;
            } else {
                startdifferentialmotionfling = new startDifferentialMotionFling(this, continuationImpl);
            }
        } else {
            startdifferentialmotionfling = new startDifferentialMotionFling(this, continuationImpl);
        }
        Object objFirstOrNull = startdifferentialmotionfling.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = startdifferentialmotionfling.IconCompatParcelizer;
        if (i17 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1Write = ((GetCourierStatusUseCaseImpl) obj).write();
            startdifferentialmotionfling.IconCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(getMapScope$invoke$$inlined$map$1Write, startdifferentialmotionfling);
            if (objFirstOrNull == coroutineSingletons2) {
                int i18 = write + 97;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    int i19 = 13 / 0;
                }
                return coroutineSingletons2;
            }
        } else {
            if (i17 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        getCallbackId getcallbackid = (getCallbackId) objFirstOrNull;
        if (getcallbackid != null) {
            isTrackingEnabled istrackingenabled = getcallbackid.IconCompatParcelizer;
            return Boolean.valueOf(istrackingenabled == isTrackingEnabled.NOT_WORKING || istrackingenabled == isTrackingEnabled.SUSPENDED);
        }
        int i20 = write + 3;
        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        Boolean bool = Boolean.FALSE;
        int i22 = write + 41;
        RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
        int i23 = i22 % 2;
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object invoke(accessgetGocp accessgetgocp, ContinuationImpl continuationImpl) {
        getNeedsLetterSpacingSpan getneedsletterspacingspan;
        int i = 2 % 2;
        if (continuationImpl instanceof getNeedsLetterSpacingSpan) {
            int i2 = write + 33;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getneedsletterspacingspan = (getNeedsLetterSpacingSpan) continuationImpl;
            int i4 = getneedsletterspacingspan.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 47;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getneedsletterspacingspan.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                getneedsletterspacingspan = new getNeedsLetterSpacingSpan(this, continuationImpl);
            }
        } else {
            getneedsletterspacingspan = new getNeedsLetterSpacingSpan(this, continuationImpl);
        }
        Object objRemoteActionCompatParcelizer = getneedsletterspacingspan.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getneedsletterspacingspan.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            int i8 = RemoteActionCompatParcelizer + 59;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            accessgetgocp = getneedsletterspacingspan.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
            getRearDisplayMetrics getreardisplaymetrics = (getRearDisplayMetrics) this.serializer;
            getneedsletterspacingspan.IconCompatParcelizer = accessgetgocp;
            getneedsletterspacingspan.RemoteActionCompatParcelizer = 1;
            objRemoteActionCompatParcelizer = getreardisplaymetrics.RemoteActionCompatParcelizer(getneedsletterspacingspan);
            if (objRemoteActionCompatParcelizer == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Location location = (Location) objRemoteActionCompatParcelizer;
        if (location == null) {
            return Boolean.FALSE;
        }
        Float fIconCompatParcelizer = getActionViewIntentlambda0.IconCompatParcelizer(location.getLatitude(), location.getLongitude(), accessgetgocp.serializer, accessgetgocp.IconCompatParcelizer);
        return Boolean.valueOf(fIconCompatParcelizer != null && fIconCompatParcelizer.floatValue() <= 100.0f);
    }
}
