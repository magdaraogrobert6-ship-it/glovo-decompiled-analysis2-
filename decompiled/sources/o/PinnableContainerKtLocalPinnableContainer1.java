package o;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.DeviceOrientationListener;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.huawei.hmf.tasks.a.i$d;
import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.i$c;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class PinnableContainerKtLocalPinnableContainer1 implements accessgetNumPadRightParenthesiscp, accessgetNumPadInsertcp, PinnableContainer, OnSuccessListener, FocusPropertiesImpl, isCaptured, RectRulers, PausedPrecompositionImpl {
    public final /* synthetic */ int read;
    public Object serializer;

    public void write(androidx.navigation.NavArgsLazy navArgsLazy) {
        this.serializer = navArgsLazy;
    }

    public void write(accessdispatchKeyEvents408734394 accessdispatchkeyevents408734394) {
        this.serializer = accessdispatchkeyevents408734394;
    }

    public setInteropViewFactoryHolderui IconCompatParcelizer(setOnAttachui setonattachui) {
        LayoutModifierNodemaxIntrinsicHeight1 layoutModifierNodemaxIntrinsicHeight1 = (LayoutModifierNodemaxIntrinsicHeight1) this.serializer;
        setInteropViewFactoryHolderui setinteropviewfactoryholderui = layoutModifierNodemaxIntrinsicHeight1.read(setonattachui);
        layoutModifierNodemaxIntrinsicHeight1.RemoteActionCompatParcelizer(setinteropviewfactoryholderui);
        return layoutModifierNodemaxIntrinsicHeight1.write(setinteropviewfactoryholderui);
    }

    public void IconCompatParcelizer(int i, String str, List list, boolean z, boolean z2) {
        zzgs zzgsVar;
        lookaheadScopeCoordinates lookaheadscopecoordinates = (lookaheadScopeCoordinates) this.serializer;
        int i2 = i - 1;
        if (i2 == 0) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            zzgsVar = getlookaheaddelegate.MediaSessionCompatToken;
        } else if (i2 != 1) {
            if (i2 == 3) {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                zzgsVar = getlookaheaddelegate2.PlaybackStateCompat;
            } else if (i2 != 4) {
                getLookaheadDelegate getlookaheaddelegate3 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                zzgsVar = getlookaheaddelegate3.MediaMetadataCompat;
            } else if (z) {
                getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                zzgsVar = getlookaheaddelegate4.MediaBrowserCompatMediaItem;
            } else if (z2) {
                getLookaheadDelegate getlookaheaddelegate5 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                zzgsVar = getlookaheaddelegate5.MediaSessionCompatQueueItem;
            } else {
                getLookaheadDelegate getlookaheaddelegate6 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                zzgsVar = getlookaheaddelegate6.RatingCompat;
            }
        } else if (z) {
            getLookaheadDelegate getlookaheaddelegate7 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
            zzgsVar = getlookaheaddelegate7.write;
        } else if (z2) {
            getLookaheadDelegate getlookaheaddelegate8 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
            zzgsVar = getlookaheaddelegate8.serializer;
        } else {
            getLookaheadDelegate getlookaheaddelegate9 = ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
            zzgsVar = getlookaheaddelegate9.MediaDescriptionCompat;
        }
        int size = list.size();
        if (size == 1) {
            zzgsVar.serializer(list.get(0), str);
            return;
        }
        if (size == 2) {
            zzgsVar.serializer(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgsVar.RemoteActionCompatParcelizer(str);
        } else {
            zzgsVar.IconCompatParcelizer(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void IconCompatParcelizer(Boolean bool) {
        ((getDiagonalSizeimpl) this.serializer).read = bool;
    }

    public void IconCompatParcelizer(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).RemoteActionCompatParcelizer = num;
    }

    public void MediaMetadataCompat(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).MediaSessionCompatToken = num;
    }

    public void RemoteActionCompatParcelizer(Float f) {
        ((getDiagonalSizeimpl) this.serializer).MediaSessionCompatQueueItem = f;
    }

    public void RemoteActionCompatParcelizer(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).MediaBrowserCompatMediaItem = num;
    }

    public void RemoteActionCompatParcelizer(MeasureScope measureScope, setFontScale setfontscale) {
        ((EnumMap) this.serializer).put(measureScope, setfontscale);
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        forceRecomposeChildren forcerecomposechildren = (forceRecomposeChildren) this.serializer;
        if (task.isCanceled()) {
            forcerecomposechildren.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            Object result = task.getResult();
            if (result == null) {
                result = LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.read;
            }
            if (LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer.write(forcerecomposechildren, null, result)) {
                forceRecomposeChildren.serializer(forcerecomposechildren);
                return;
            }
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        if (LayoutNodeSubcompositionsStateApproachMeasureScopeImpl.IconCompatParcelizer.write(forcerecomposechildren, null, new onReuse(exception))) {
            forceRecomposeChildren.serializer(forcerecomposechildren);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((pin) this.serializer).onCanceled();
    }

    public void read(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).MediaDescriptionCompat = num;
    }

    @Override // o.isCaptured
    public boolean read(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.serializer;
        if (!swipeDismissBehavior.write(view)) {
            return false;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.MediaMetadataCompat;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        SubcomposeLayoutStatePausedPrecomposition subcomposeLayoutStatePausedPrecomposition = swipeDismissBehavior.RemoteActionCompatParcelizer;
        if (subcomposeLayoutStatePausedPrecomposition != null) {
            subcomposeLayoutStatePausedPrecomposition.write(view);
        }
        return true;
    }

    public boolean read(CharSequence charSequence, AndroidCompositionLocals_androidKtLocalView1 androidCompositionLocals_androidKtLocalView1) {
        String str = androidCompositionLocals_androidKtLocalView1.serializer;
        if (str.length() != 0) {
            Matcher matcher = ((i$d.a) this.serializer).RemoteActionCompatParcelizer(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    public E$b serializer() {
        androidx.navigation.NavArgsLazy navArgsLazy = (androidx.navigation.NavArgsLazy) this.serializer;
        if (navArgsLazy == null) {
            throw new IllegalStateException(androidx.navigation.NavArgsLazy.class.getCanonicalName() + " must be set");
        }
        E$b e$b = new E$b(6);
        int i = 1;
        e$b.read = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new getEndimpl(navArgsLazy, i));
        int i2 = 2;
        onUncaughtException onuncaughtexceptionIconCompatParcelizer = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new getEndimpl(navArgsLazy, i2));
        e$b.RemoteActionCompatParcelizer = onuncaughtexceptionIconCompatParcelizer;
        int i3 = 0;
        getEndimpl getendimpl = new getEndimpl(navArgsLazy, i3);
        e$b.IconCompatParcelizer = getendimpl;
        e$b.MediaDescriptionCompat = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new TailModifierNode((onUncaughtException) e$b.read, onuncaughtexceptionIconCompatParcelizer, getendimpl, 3));
        e$b.MediaBrowserCompatMediaItem = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new TailModifierNode((onUncaughtException) e$b.read, (onUncaughtException) e$b.RemoteActionCompatParcelizer, (getEndimpl) e$b.IconCompatParcelizer, i2));
        e$b.write = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new TailModifierNode((onUncaughtException) e$b.read, (onUncaughtException) e$b.RemoteActionCompatParcelizer, (getEndimpl) e$b.IconCompatParcelizer, i));
        e$b.MediaMetadataCompat = setAccessibilityEventBatchIntervalMillis.IconCompatParcelizer(new TailModifierNode((onUncaughtException) e$b.read, (onUncaughtException) e$b.RemoteActionCompatParcelizer, (getEndimpl) e$b.IconCompatParcelizer, i3));
        return e$b;
    }

    public void serializer(Boolean bool) {
        ((getDiagonalSizeimpl) this.serializer).IconCompatParcelizer = bool;
    }

    public void serializer(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).MediaMetadataCompat = num;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        zzdz zzdzVar = (zzdz) obj;
        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) this.serializer;
        accessgetSystemNavigationDowncp.write("locationSettingsRequest can't be null", locationSettingsRequest != null);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) zzdzVar.MediaSessionCompatResultReceiverWrapper();
        getMoveHomeEK5gGoQ getmovehomeek5ggoq = new getMoveHomeEK5gGoQ(0, parentDataModifierDefaultImpls);
        Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, locationSettingsRequest);
        parcelZza.writeStrongBinder(getmovehomeek5ggoq.asBinder());
        parcelZza.writeString(null);
        getnumpaddeleteek5ggoq.zzc(63, parcelZza);
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        getAdapters getadapters = (getAdapters) obj;
        checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = ((clearPlaceOrder) this.serializer).RemoteActionCompatParcelizer;
        if (getadapters != null) {
            return LazyKt__LazyJVMKt.write(Arrays.asList(checkChildrenPlaceOrderForUpdates.write(checkchildrenplaceorderforupdates), checkchildrenplaceorderforupdates.ParcelableVolumeInfo.serializer(null, checkchildrenplaceorderforupdates.MediaDescriptionCompat.read)));
        }
        SentryLogcatAdapter.write("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
    }

    public asList write(int i) {
        ancestorToLocalS_NoaFU ancestortolocals_noafuSerializer = ((i$c) this.serializer).serializer();
        HashMap map = ancestortolocals_noafuSerializer.RatingCompat;
        HashMap map2 = ancestortolocals_noafuSerializer.MediaBrowserCompatMediaItem;
        drawContainedDrawModifiers drawcontaineddrawmodifiers = (drawContainedDrawModifiers) ancestortolocals_noafuSerializer.serializer.get(Integer.valueOf(i));
        if (drawcontaineddrawmodifiers != null && drawcontaineddrawmodifiers.write) {
            return visitNodes.IconCompatParcelizer.IconCompatParcelizer(drawcontaineddrawmodifiers.RemoteActionCompatParcelizer);
        }
        asList aslist = visitNodes.IconCompatParcelizer;
        if (map2.containsKey(Integer.valueOf(i))) {
            for (accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp : (List) map2.get(Integer.valueOf(i))) {
                if (map.containsKey(accesssetlastlayerdrawingwasskippedp)) {
                    asList aslistIconCompatParcelizer = ((fromParentPosition8S9VItkdefault) map.get(accesssetlastlayerdrawingwasskippedp)).write.MediaDescriptionCompat;
                    if (aslist.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() >= aslistIconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
                        aslistIconCompatParcelizer = aslist;
                        aslist = aslistIconCompatParcelizer;
                    }
                    Iterator it = aslist.iterator();
                    while (true) {
                        zzkh zzkhVar = (zzkh) it;
                        if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                            break;
                        }
                        aslistIconCompatParcelizer = aslistIconCompatParcelizer.IconCompatParcelizer(zzkhVar.next());
                    }
                    aslist = aslistIconCompatParcelizer;
                }
            }
        }
        return aslist;
    }

    public void write(Boolean bool) {
        ((getDiagonalSizeimpl) this.serializer).write = bool;
    }

    public void write(Float f) {
        ((getDiagonalSizeimpl) this.serializer).RatingCompat = f;
    }

    public void write(Integer num) {
        ((getDiagonalSizeimpl) this.serializer).serializer = num;
    }

    public PinnableContainerKtLocalPinnableContainer1(int i) {
        this.read = i;
        if (i == 25) {
            this.serializer = new getDiagonalSizeimpl();
        } else if (i != 29) {
            this.serializer = new EnumMap(MeasureScope.class);
        } else {
            this.serializer = new i$d.a(2);
        }
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        if (this.read == 13) {
            AppBarLayout appBarLayout = (AppBarLayout) this.serializer;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            FocusRequesterModifierKt focusRequesterModifierKt2 = appBarLayout.getFitsSystemWindows() ? focusRequesterModifierKt : null;
            if (!Objects.equals(appBarLayout.RatingCompat, focusRequesterModifierKt2)) {
                appBarLayout.RatingCompat = focusRequesterModifierKt2;
                appBarLayout.setWillNotDraw(!(appBarLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null && appBarLayout.getTopInset() > 0));
                appBarLayout.requestLayout();
            }
            return focusRequesterModifierKt;
        }
        PlaceableKt placeableKt = (PlaceableKt) this.serializer;
        PlacementScopeMarker placementScopeMarker = placeableKt.ParcelableVolumeInfo;
        if (placementScopeMarker != null) {
            placeableKt.read.removeBottomSheetCallback(placementScopeMarker);
        }
        PlacementScopeMarker placementScopeMarker2 = new PlacementScopeMarker(placeableKt.write, focusRequesterModifierKt);
        placeableKt.ParcelableVolumeInfo = placementScopeMarker2;
        placementScopeMarker2.IconCompatParcelizer(placeableKt.getWindow());
        placeableKt.read.addBottomSheetCallback(placeableKt.ParcelableVolumeInfo);
        return focusRequesterModifierKt;
    }

    public String toString() {
        if (this.read != 9) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("1");
        for (MeasureScope measureScope : MeasureScope.values()) {
            setFontScale setfontscale = (setFontScale) ((EnumMap) this.serializer).get(measureScope);
            if (setfontscale == null) {
                setfontscale = setFontScale.UNSET;
            }
            sb.append(setfontscale.zzb());
        }
        return sb.toString();
    }

    @Override // o.accessgetNumPadInsertcp
    public /* synthetic */ void write(Object obj) {
        int i = this.read;
        if (i == 2) {
            ((DeviceOrientationListener) obj).onDeviceOrientationChanged((DeviceOrientation) this.serializer);
            return;
        }
        if (i == 3) {
            ((LocationCallback) obj).onLocationAvailability((LocationAvailability) this.serializer);
        } else if (i != 4) {
            ((getNumPad2EK5gGoQ) this.serializer).read.IconCompatParcelizer();
        } else {
            ((getNumPad1EK5gGoQ) this.serializer).write.IconCompatParcelizer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void IconCompatParcelizer(MeasureScope measureScope, int i) {
        setFontScale setfontscale = setFontScale.UNSET;
        if (i == -30) {
            setfontscale = setFontScale.TCF;
        } else if (i == -20) {
            setfontscale = setFontScale.API;
        } else if (i == -10) {
            setfontscale = setFontScale.MANIFEST;
        } else if (i == 0) {
            setfontscale = setFontScale.API;
        } else if (i == 30) {
            setfontscale = setFontScale.INITIALIZATION;
        }
        ((EnumMap) this.serializer).put(measureScope, setfontscale);
    }

    public /* synthetic */ PinnableContainerKtLocalPinnableContainer1(int i, boolean z) {
        this.read = i;
    }

    public /* synthetic */ PinnableContainerKtLocalPinnableContainer1(int i, Object obj) {
        this.read = i;
        this.serializer = obj;
    }

    public PinnableContainerKtLocalPinnableContainer1(getMeasuredSizeYbymL2g getmeasuredsizeybyml2g, pin pinVar) {
        this.read = 0;
        this.serializer = pinVar;
    }

    public PinnableContainerKtLocalPinnableContainer1(EnumMap enumMap) {
        this.read = 9;
        EnumMap enumMap2 = new EnumMap(MeasureScope.class);
        this.serializer = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public PinnableContainerKtLocalPinnableContainer1(clearPlaceOrder clearplaceorder, String str) {
        this.read = 21;
        this.serializer = clearplaceorder;
    }

    public accessgetAddChangeCallbackMethodcp IconCompatParcelizer() {
        return new accessgetAddChangeCallbackMethodcp((accessdispatchKeyEvents408734394) this.serializer);
    }

    public getDiagonalSizeimpl read() {
        return (getDiagonalSizeimpl) this.serializer;
    }
}
