package o;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.camera.core.ImageCapture$1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.logic.zp;
import com.huawei.location.tiles.utils.LW;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageVectorCacheImageVectorEntry implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public ImageVectorCacheImageVectorEntry(NoWindowInsetsAnimation noWindowInsetsAnimation, AtomicReference atomicReference, String str, String str2) {
        this.IconCompatParcelizer = 10;
        this.read = atomicReference;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        Objects.requireNonNull(noWindowInsetsAnimation);
        this.serializer = noWindowInsetsAnimation;
    }

    private final void RemoteActionCompatParcelizer() {
        setViewportBounds setviewportbounds = (setViewportBounds) this.write;
        AtomicReference atomicReference = (AtomicReference) this.RemoteActionCompatParcelizer;
        zzr zzrVar = (zzr) this.read;
        zzoo zzooVar = (zzoo) this.serializer;
        synchronized (atomicReference) {
            try {
                isComplete iscomplete = setviewportbounds.write;
                if (iscomplete != null) {
                    iscomplete.write(zzrVar, zzooVar, new checkVisibility(setviewportbounds, atomicReference));
                    setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                } else {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("[sgtm] Failed to get upload batches; not connected to service");
                }
            } catch (RemoteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
        }
    }

    private final void read() {
        setViewportBounds setviewportbounds = (setViewportBounds) this.write;
        AtomicReference atomicReference = (AtomicReference) this.RemoteActionCompatParcelizer;
        zzr zzrVar = (zzr) this.read;
        Bundle bundle = (Bundle) this.serializer;
        synchronized (atomicReference) {
            try {
                isComplete iscomplete = setviewportbounds.write;
                if (iscomplete != null) {
                    iscomplete.serializer(zzrVar, bundle, new onFirstVisibledefault(setviewportbounds, atomicReference));
                    setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                } else {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Failed to request trigger URIs; not connected to service");
                }
            } catch (RemoteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x044d A[Catch: zzmr -> 0x0462, TRY_LEAVE, TryCatch #4 {zzmr -> 0x0462, blocks: (B:96:0x03e4, B:97:0x03f1, B:99:0x03fb, B:100:0x0433, B:102:0x044d), top: B:286:0x03e4 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:160:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0396  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ab A[LOOP:1: B:92:0x03a5->B:94:0x03ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x03fb A[Catch: zzmr -> 0x0462, LOOP:2: B:97:0x03f1->B:99:0x03fb, LOOP_END, TryCatch #4 {zzmr -> 0x0462, blocks: (B:96:0x03e4, B:97:0x03f1, B:99:0x03fb, B:100:0x0433, B:102:0x044d), top: B:286:0x03e4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        MatrixPositionCalculator matrixPositionCalculatorWrite;
        String str2;
        getHasMoreContent gethasmorecontent;
        String str3;
        getFillWidth getfillwidth;
        Bundle bundle;
        zzom zzomVar;
        getVEK5gGoQ getvek5ggoq;
        int i;
        byte[] bArrSerializer = null;
        try {
            switch (this.IconCompatParcelizer) {
                case 0:
                    Thread.currentThread().setName("SDM-TileStoreManager-" + hashCode());
                    if (LW.serializer((String) this.write, (String) this.RemoteActionCompatParcelizer, (String) this.read, (String) this.serializer)) {
                        return;
                    }
                    integerResource.RemoteActionCompatParcelizer(new File(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), getTheme.write, "DailyDownloads")), (String) String.class.getMethod("valueOf", Integer.TYPE).invoke(null, Integer.valueOf(painterResource.read.decrementAndGet())));
                    return;
                case 1:
                    r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 r8lambdatwvtypfkihdx0rbtwvlevvlt0 = (r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) ((ImageCapture$1) this.serializer).MediaSessionCompatQueueItem;
                    Keep keep = (Keep) this.RemoteActionCompatParcelizer;
                    dispatchResult dispatchresult = (dispatchResult) this.write;
                    if (dispatchresult != null) {
                        r8lambdatwvtypfkihdx0rbtwvlevvlt0.ComponentActivity = true;
                        dispatchresult.serializer.RemoteActionCompatParcelizer(false);
                        r8lambdatwvtypfkihdx0rbtwvlevvlt0.ComponentActivity = false;
                    }
                    if (keep.isEnabled() && keep.hasSubMenu()) {
                        ((AlertControllerButtonHandler) this.read).RemoteActionCompatParcelizer(keep, null, 4);
                        return;
                    }
                    return;
                case 2:
                    component11.RemoteActionCompatParcelizer((View) this.write, (component14) this.RemoteActionCompatParcelizer, (component15) this.read);
                    ((ValueAnimator) this.serializer).start();
                    return;
                case 3:
                    androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) this.serializer;
                    String str4 = (String) this.write;
                    String str5 = (String) this.RemoteActionCompatParcelizer;
                    getF4EK5gGoQ getf4ek5ggoq = (getF4EK5gGoQ) this.read;
                    emojiProcessor.getClass();
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    if (str5 == null) {
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        getf4ek5ggoq.serializer(0, 2);
                        return;
                    }
                    try {
                        try {
                            Object[] objArr = {((getFocusEK5gGoQ) emojiProcessor.IconCompatParcelizer).write.getAssets(), str5};
                            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (26245 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 37 - View.MeasureSpec.getSize(0), 12 - ExpandableListView.getPackedPositionChild(0L), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                            }
                            InputStream inputStream = (InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                            if (inputStream != null) {
                                getf4ek5ggoq.read(androidx.emoji2.text.EmojiProcessor.read(inputStream));
                                return;
                            } else {
                                getf4ek5ggoq.serializer(0, 2);
                                return;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (IOException unused) {
                        getButtonThumbLeftEK5gGoQ.write("Default asset file not found. " + str4 + ". Filename: " + str5);
                        getf4ek5ggoq.serializer(0, 2);
                        return;
                    }
                case 4:
                    toMotionEventScoped4ec7I tomotioneventscoped4ec7i = (toMotionEventScoped4ec7I) this.RemoteActionCompatParcelizer;
                    zp zpVar = (zp) this.read;
                    PointerInteropFilterpointerInputFilter1dispatchToView2 pointerInteropFilterpointerInputFilter1dispatchToView2 = (PointerInteropFilterpointerInputFilter1dispatchToView2) this.serializer;
                    String str6 = (String) this.write;
                    androidx.lifecycle.BlockRunner blockRunner = (androidx.lifecycle.BlockRunner) zpVar.serializer;
                    blockRunner.serializer = pointerInteropFilterpointerInputFilter1dispatchToView2;
                    PointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1 pointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1 = (PointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1) blockRunner.read;
                    if (pointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1 == null || (str = pointerInteropFilter_androidKtpointerInteropFilterinlineddebugInspectorInfo1.read) == null || ((Boolean) String.class.getMethod("isEmpty", null).invoke(str, null)).booleanValue()) {
                        str = "NA";
                    } else {
                        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
                    }
                    setCountrylambda1 setcountrylambda1 = new setCountrylambda1();
                    setcountrylambda1.MediaSessionCompatQueueItem = tomotioneventscoped4ec7i.RemoteActionCompatParcelizer;
                    setcountrylambda1.MediaMetadataCompat = tomotioneventscoped4ec7i.IconCompatParcelizer;
                    synchronized (toMotionEventScoped4ec7I.class) {
                        matrixPositionCalculatorWrite = toMotionEventScoped4ec7I.serializer;
                        if (matrixPositionCalculatorWrite == null) {
                            hasNonInteropFocusableContent hasnoninteropfocusablecontent = new hasNonInteropFocusableContent(new moveFocusaToIllA(Resources.getSystem().getConfiguration().getLocales()));
                            InternalPointerEvent internalPointerEvent = new InternalPointerEvent(0);
                            for (int i2 = 0; i2 < hasnoninteropfocusablecontent.read(); i2++) {
                                java.util.Locale locale = hasnoninteropfocusablecontent.read(i2);
                                toZui_graphics tozui_graphics = getHandwritingGestureLineMargin.read;
                                internalPointerEvent.read(locale.toLanguageTag());
                            }
                            matrixPositionCalculatorWrite = internalPointerEvent.write();
                            toMotionEventScoped4ec7I.serializer = matrixPositionCalculatorWrite;
                        }
                    }
                    setcountrylambda1.IconCompatParcelizer = matrixPositionCalculatorWrite;
                    setcountrylambda1.read = Boolean.TRUE;
                    setcountrylambda1.PlaybackStateCompatCustomAction = str;
                    setcountrylambda1.RatingCompat = str6;
                    setcountrylambda1.serializer = tomotioneventscoped4ec7i.RatingCompat.isSuccessful() ? (String) tomotioneventscoped4ec7i.RatingCompat.getResult() : tomotioneventscoped4ec7i.MediaDescriptionCompat.serializer();
                    setcountrylambda1.MediaBrowserCompatMediaItem = 10;
                    setcountrylambda1.MediaDescriptionCompat = Integer.valueOf(tomotioneventscoped4ec7i.MediaSessionCompatQueueItem);
                    zpVar.IconCompatParcelizer = setcountrylambda1;
                    tomotioneventscoped4ec7i.write.serializer(zpVar);
                    return;
                case 5:
                    setApproachNode setapproachnode = (setApproachNode) this.RemoteActionCompatParcelizer;
                    colorResource colorresource = (colorResource) this.read;
                    ApproachLayoutModifierNodemaxApproachIntrinsicWidth1 approachLayoutModifierNodemaxApproachIntrinsicWidth1 = (ApproachLayoutModifierNodemaxApproachIntrinsicWidth1) this.serializer;
                    String str7 = (String) this.write;
                    accessgetTvTeletextcp accessgettvteletextcp = (accessgetTvTeletextcp) colorresource.IconCompatParcelizer;
                    accessgettvteletextcp.serializer = approachLayoutModifierNodemaxApproachIntrinsicWidth1;
                    setMeasureBlock setmeasureblock = (setMeasureBlock) accessgettvteletextcp.RemoteActionCompatParcelizer;
                    if (setmeasureblock != null) {
                        str2 = setmeasureblock.serializer;
                        int i3 = setCurrentPointerPositionAccumulatork4lQ0Mui.write;
                        if (str2 == null || ((Boolean) String.class.getMethod("isEmpty", null).invoke(str2, null)).booleanValue()) {
                            str2 = "NA";
                        }
                    } else {
                        str2 = "NA";
                    }
                    setCountrylambda1 setcountrylambda2 = new setCountrylambda1();
                    setcountrylambda2.MediaSessionCompatQueueItem = setapproachnode.IconCompatParcelizer;
                    setcountrylambda2.MediaMetadataCompat = setapproachnode.write;
                    synchronized (setApproachNode.class) {
                        gethasmorecontent = setApproachNode.serializer;
                        if (gethasmorecontent == null) {
                            hasNonInteropFocusableContent hasnoninteropfocusablecontent2 = new hasNonInteropFocusableContent(new moveFocusaToIllA(Resources.getSystem().getConfiguration().getLocales()));
                            Object[] objArrCopyOf = new Object[4];
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < hasnoninteropfocusablecontent2.read()) {
                                java.util.Locale locale2 = hasnoninteropfocusablecontent2.read(i4);
                                toZui_graphics tozui_graphics2 = getHandwritingGestureLineMargin.read;
                                String languageTag = locale2.toLanguageTag();
                                languageTag.getClass();
                                int i6 = i5 + 1;
                                int length = objArrCopyOf.length;
                                if (length < i6) {
                                    int i7 = length + (length >> 1) + 1;
                                    if (i7 < i6) {
                                        int iHighestOneBit = Integer.highestOneBit(i5);
                                        i7 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i7 < 0) {
                                        i7 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                                }
                                objArrCopyOf[i5] = languageTag;
                                i4++;
                                i5 = i6;
                            }
                            toLookaheadCoordinates tolookaheadcoordinates = BeyondBoundsLayout.read;
                            gethasmorecontent = i5 == 0 ? getHasMoreContent.RemoteActionCompatParcelizer : new getHasMoreContent(i5, objArrCopyOf);
                            setApproachNode.serializer = gethasmorecontent;
                        }
                    }
                    setcountrylambda2.IconCompatParcelizer = gethasmorecontent;
                    setcountrylambda2.read = Boolean.TRUE;
                    setcountrylambda2.PlaybackStateCompatCustomAction = str2;
                    setcountrylambda2.RatingCompat = str7;
                    setcountrylambda2.serializer = setapproachnode.MediaSessionCompatQueueItem.isSuccessful() ? (String) setapproachnode.MediaSessionCompatQueueItem.getResult() : setapproachnode.RatingCompat.serializer();
                    setcountrylambda2.MediaBrowserCompatMediaItem = 10;
                    setcountrylambda2.MediaDescriptionCompat = Integer.valueOf(setapproachnode.MediaDescriptionCompat);
                    colorresource.write = setcountrylambda2;
                    setapproachnode.read.read(colorresource);
                    return;
                case 6:
                    resetLayoutState resetlayoutstate = (resetLayoutState) this.RemoteActionCompatParcelizer;
                    zp zpVar2 = (zp) this.read;
                    accessgetRootp accessgetrootp = (accessgetRootp) this.serializer;
                    String str8 = (String) this.write;
                    androidx.lifecycle.BlockRunner blockRunner2 = (androidx.lifecycle.BlockRunner) zpVar2.serializer;
                    blockRunner2.serializer = accessgetrootp;
                    disposePrecomposedSlot disposeprecomposedslot = (disposePrecomposedSlot) blockRunner2.read;
                    if (disposeprecomposedslot != null) {
                        str3 = disposeprecomposedslot.IconCompatParcelizer;
                        int i8 = accessgetBelowcp.read;
                        if (str3 == null || ((Boolean) String.class.getMethod("isEmpty", null).invoke(str3, null)).booleanValue()) {
                            str3 = "NA";
                        }
                    } else {
                        str3 = "NA";
                    }
                    setCountrylambda1 setcountrylambda3 = new setCountrylambda1();
                    setcountrylambda3.MediaSessionCompatQueueItem = resetlayoutstate.read;
                    setcountrylambda3.MediaMetadataCompat = resetlayoutstate.serializer;
                    synchronized (resetLayoutState.class) {
                        getfillwidth = resetLayoutState.IconCompatParcelizer;
                        if (getfillwidth == null) {
                            hasNonInteropFocusableContent hasnoninteropfocusablecontent3 = new hasNonInteropFocusableContent(new moveFocusaToIllA(Resources.getSystem().getConfiguration().getLocales()));
                            Object[] objArrCopyOf2 = new Object[4];
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < hasnoninteropfocusablecontent3.read()) {
                                java.util.Locale locale3 = hasnoninteropfocusablecontent3.read(i9);
                                toZui_graphics tozui_graphics3 = getHandwritingGestureLineMargin.read;
                                String languageTag2 = locale3.toLanguageTag();
                                languageTag2.getClass();
                                int i11 = i10 + 1;
                                int length2 = objArrCopyOf2.length;
                                if (length2 < i11) {
                                    int i12 = length2 + (length2 >> 1) + 1;
                                    if (i12 < i11) {
                                        int iHighestOneBit2 = Integer.highestOneBit(i10);
                                        i12 = iHighestOneBit2 + iHighestOneBit2;
                                    }
                                    if (i12 < 0) {
                                        i12 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i12);
                                }
                                objArrCopyOf2[i10] = languageTag2;
                                i9++;
                                i10 = i11;
                            }
                            getFitannotations getfitannotations = getCrop.RemoteActionCompatParcelizer;
                            getfillwidth = i10 == 0 ? getFillWidth.read : new getFillWidth(i10, objArrCopyOf2);
                            resetLayoutState.IconCompatParcelizer = getfillwidth;
                        }
                    }
                    setcountrylambda3.IconCompatParcelizer = getfillwidth;
                    setcountrylambda3.read = Boolean.TRUE;
                    setcountrylambda3.PlaybackStateCompatCustomAction = str3;
                    setcountrylambda3.RatingCompat = str8;
                    setcountrylambda3.serializer = resetlayoutstate.MediaMetadataCompat.isSuccessful() ? (String) resetlayoutstate.MediaMetadataCompat.getResult() : resetlayoutstate.MediaBrowserCompatMediaItem.serializer();
                    setcountrylambda3.MediaBrowserCompatMediaItem = 10;
                    setcountrylambda3.MediaDescriptionCompat = Integer.valueOf(resetlayoutstate.RatingCompat);
                    zpVar2.IconCompatParcelizer = setcountrylambda3;
                    resetlayoutstate.write.write(zpVar2);
                    return;
                case 7:
                    LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) this.RemoteActionCompatParcelizer;
                    String str9 = (String) this.write;
                    zzoo zzooVar = (zzoo) this.read;
                    LayoutNodeSubcompositionsStatesubcompose41composable1 layoutNodeSubcompositionsStatesubcompose41composable1 = (LayoutNodeSubcompositionsStatesubcompose41composable1) this.serializer;
                    zzpg zzpgVar = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer;
                    zzpgVar.serializer();
                    zzpgVar.PlaybackStateCompat().MediaSessionCompatToken();
                    zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = zzpgVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
                    List<OnLayoutRectChangedModifierKt> listIconCompatParcelizer = layoutNodeSubcompositionsStatecreateMeasurePolicy1.IconCompatParcelizer(str9, zzooVar, ((Integer) premeasure0kLqBqw.read.IconCompatParcelizer(null)).intValue());
                    ArrayList arrayList = new ArrayList();
                    for (OnLayoutRectChangedModifierKt onLayoutRectChangedModifierKt : listIconCompatParcelizer) {
                        String str10 = onLayoutRectChangedModifierKt.serializer;
                        long j = onLayoutRectChangedModifierKt.RatingCompat;
                        long j2 = onLayoutRectChangedModifierKt.RemoteActionCompatParcelizer;
                        if (zzpgVar.write(str9, str10)) {
                            int i13 = onLayoutRectChangedModifierKt.MediaDescriptionCompat;
                            if (i13 > 0) {
                                if (i13 <= ((Integer) premeasure0kLqBqw.EdgeToEdgeExternalSyntheticLambda0.IconCompatParcelizer(bArrSerializer)).intValue()) {
                                    long jMin = Math.min((1 << (i13 - 1)) * ((Long) premeasure0kLqBqw.onStart.IconCompatParcelizer(bArrSerializer)).longValue(), ((Long) premeasure0kLqBqw.ComponentDialogExternalSyntheticLambda0.IconCompatParcelizer(bArrSerializer)).longValue());
                                    ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
                                    if (System.currentTimeMillis() >= jMin + j) {
                                        bundle = new Bundle();
                                        for (Map.Entry entry : onLayoutRectChangedModifierKt.IconCompatParcelizer.entrySet()) {
                                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                        }
                                        zzomVar = new zzom(onLayoutRectChangedModifierKt.RemoteActionCompatParcelizer, onLayoutRectChangedModifierKt.write.removeOnUserLeaveHintListener(), onLayoutRectChangedModifierKt.serializer, bundle, onLayoutRectChangedModifierKt.read.zza(), onLayoutRectChangedModifierKt.MediaBrowserCompatMediaItem, "");
                                        try {
                                            getvek5ggoq = (getVEK5gGoQ) zzgz.write(getUEK5gGoQ.serializer(), zzomVar.RemoteActionCompatParcelizer);
                                            for (i = 0; i < ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer(); i++) {
                                                getTwoEK5gGoQ gettwoek5ggoq = (getTwoEK5gGoQ) ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).serializer(i).getOnBackPressedDispatcherannotations();
                                                ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
                                                long jCurrentTimeMillis = System.currentTimeMillis();
                                                gettwoek5ggoq.ParcelableVolumeInfo();
                                                ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).IconCompatParcelizer(jCurrentTimeMillis);
                                                getvek5ggoq.ParcelableVolumeInfo();
                                                ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).IconCompatParcelizer(i, (getTvZoomModeEK5gGoQ) gettwoek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                            }
                                            zzomVar.RemoteActionCompatParcelizer = ((getUEK5gGoQ) getvek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()).removeOnUserLeaveHintListener();
                                            if (Log.isLoggable(zzpgVar.RatingCompat().ResultReceiver(), 2)) {
                                                zzgz zzgzVar = zzpgVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                                zzpg.serializer(zzgzVar);
                                                zzomVar.RatingCompat = zzgzVar.serializer((getUEK5gGoQ) getvek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                            }
                                            arrayList.add(zzomVar);
                                        } catch (zzmr unused2) {
                                            zzpgVar.RatingCompat().MediaSessionCompatQueueItem.serializer(str9, "Failed to parse queued batch. appId");
                                        }
                                    }
                                }
                                zzpgVar.RatingCompat().PlaybackStateCompat.IconCompatParcelizer("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str9, Long.valueOf(j2), Long.valueOf(j));
                            } else {
                                bundle = new Bundle();
                                while (r9.hasNext()) {
                                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                }
                                zzomVar = new zzom(onLayoutRectChangedModifierKt.RemoteActionCompatParcelizer, onLayoutRectChangedModifierKt.write.removeOnUserLeaveHintListener(), onLayoutRectChangedModifierKt.serializer, bundle, onLayoutRectChangedModifierKt.read.zza(), onLayoutRectChangedModifierKt.MediaBrowserCompatMediaItem, "");
                                getvek5ggoq = (getVEK5gGoQ) zzgz.write(getUEK5gGoQ.serializer(), zzomVar.RemoteActionCompatParcelizer);
                                while (i < ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).RemoteActionCompatParcelizer()) {
                                    getTwoEK5gGoQ gettwoek5ggoq2 = (getTwoEK5gGoQ) ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).serializer(i).getOnBackPressedDispatcherannotations();
                                    ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    gettwoek5ggoq2.ParcelableVolumeInfo();
                                    ((getTvZoomModeEK5gGoQ) gettwoek5ggoq2.IconCompatParcelizer).IconCompatParcelizer(jCurrentTimeMillis2);
                                    getvek5ggoq.ParcelableVolumeInfo();
                                    ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).IconCompatParcelizer(i, (getTvZoomModeEK5gGoQ) gettwoek5ggoq2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                }
                                zzomVar.RemoteActionCompatParcelizer = ((getUEK5gGoQ) getvek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()).removeOnUserLeaveHintListener();
                                if (Log.isLoggable(zzpgVar.RatingCompat().ResultReceiver(), 2)) {
                                    zzgz zzgzVar2 = zzpgVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                    zzpg.serializer(zzgzVar2);
                                    zzomVar.RatingCompat = zzgzVar2.serializer((getUEK5gGoQ) getvek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                                }
                                arrayList.add(zzomVar);
                            }
                            bArrSerializer = null;
                        } else {
                            zzpgVar.RatingCompat().PlaybackStateCompat.IconCompatParcelizer("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str9, Long.valueOf(j2), onLayoutRectChangedModifierKt.serializer);
                        }
                    }
                    try {
                        layoutNodeSubcompositionsStatesubcompose41composable1.RemoteActionCompatParcelizer(new zzoq(arrayList));
                        zzpgVar.RatingCompat().PlaybackStateCompat.serializer("[sgtm] Sending queued upload batches to client. appId, count", str9, Integer.valueOf(arrayList.size()));
                        return;
                    } catch (RemoteException e) {
                        zzpgVar.RatingCompat().serializer.serializer("[sgtm] Failed to return upload batches for app", str9, e);
                        return;
                    }
                case 8:
                    setViewportBounds setviewportboundsMediaDescriptionCompat = ((AppMeasurementDynamiteService) this.serializer).zza.MediaDescriptionCompat();
                    getQEK5gGoQ getqek5ggoq = (getQEK5gGoQ) this.RemoteActionCompatParcelizer;
                    zzbg zzbgVar = (zzbg) this.read;
                    String str11 = (String) this.write;
                    setviewportboundsMediaDescriptionCompat.MediaSessionCompatToken();
                    setviewportboundsMediaDescriptionCompat.serializer();
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setviewportboundsMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                    if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((LookaheadScopeKtLookaheadScope221) onlayoutrectchangeddefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat, 12451000) == 0) {
                        setviewportboundsMediaDescriptionCompat.RemoteActionCompatParcelizer((Runnable) new ImageVectorCacheImageVectorEntry(setviewportboundsMediaDescriptionCompat, zzbgVar, str11, getqek5ggoq));
                        return;
                    }
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Not bundling data. Service unavailable or out of date");
                    onLayoutRectChangeddefault onlayoutrectchangeddefault2 = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault2);
                    onlayoutrectchangeddefault2.IconCompatParcelizer(getqek5ggoq, new byte[0]);
                    return;
                case 9:
                    LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress2 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) this.RemoteActionCompatParcelizer;
                    Bundle bundle2 = (Bundle) this.read;
                    String str12 = (String) this.write;
                    zzr zzrVar = (zzr) this.serializer;
                    zzpg zzpgVar2 = lookaheadScopeKtdefaultPlacementApproachInProgress2.serializer;
                    boolean zWrite = zzpgVar2.MediaDescriptionCompat().write(null, premeasure0kLqBqw.onBackPressedInput_delegatelambda0);
                    if (bundle2.isEmpty() && zWrite) {
                        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy2 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy2);
                        layoutNodeSubcompositionsStatecreateMeasurePolicy2.MediaSessionCompatToken();
                        layoutNodeSubcompositionsStatecreateMeasurePolicy2.ComponentActivity();
                        try {
                            layoutNodeSubcompositionsStatecreateMeasurePolicy2.ResultReceiver().execSQL("delete from default_event_params where app_id=?", new String[]{str12});
                            return;
                        } catch (SQLiteException e2) {
                            getLookaheadDelegate getlookaheaddelegate2 = ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.serializer.serializer(e2, "Error clearing default event params");
                            return;
                        }
                    }
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy3 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy3);
                    LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    layoutNodeSubcompositionsStatecreateMeasurePolicy3.MediaSessionCompatToken();
                    layoutNodeSubcompositionsStatecreateMeasurePolicy3.ComponentActivity();
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 = new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy3.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, "", str12, "dep", 0L, 0L, bundle2);
                    zzgz zzgzVar3 = layoutNodeSubcompositionsStatecreateMeasurePolicy3.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    zzpg.serializer(zzgzVar3);
                    byte[] bArrRemoveOnUserLeaveHintListener = zzgzVar3.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2).removeOnUserLeaveHintListener();
                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                    getlookaheaddelegate3.PlaybackStateCompat.serializer("Saving default event parameters, appId, data size", str12, Integer.valueOf(bArrRemoveOnUserLeaveHintListener.length));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str12);
                    contentValues.put("parameters", bArrRemoveOnUserLeaveHintListener);
                    try {
                        if (layoutNodeSubcompositionsStatecreateMeasurePolicy3.ResultReceiver().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                            getlookaheaddelegate3.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str12), "Failed to insert default event parameters (got -1). appId");
                        }
                    } catch (SQLiteException e3) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                        getlookaheaddelegate3.serializer.serializer("Error storing default event parameters. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str12), e3);
                    }
                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy4 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy4);
                    long j3 = zzrVar.read;
                    try {
                        String[] strArr = new String[2];
                        strArr[0] = str12;
                        try {
                            strArr[1] = String.class.getMethod("valueOf", Long.TYPE).invoke(null, Long.valueOf(j3));
                            if (layoutNodeSubcompositionsStatecreateMeasurePolicy4.write("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", strArr, 0L) > 0) {
                                return;
                            }
                            String[] strArr2 = new String[2];
                            strArr2[0] = str12;
                            try {
                                strArr2[1] = String.class.getMethod("valueOf", Long.TYPE).invoke(null, Long.valueOf(j3));
                                if (layoutNodeSubcompositionsStatecreateMeasurePolicy4.write("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", strArr2, 0L) > 0) {
                                    LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy5 = zzpgVar2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy5);
                                    layoutNodeSubcompositionsStatecreateMeasurePolicy5.serializer(str12, Long.valueOf(j3), (String) null, bundle2);
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    } catch (SQLiteException e4) {
                        getLookaheadDelegate getlookaheaddelegate4 = ((LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.serializer.serializer(e4, "Error checking backfill conditions");
                        return;
                    }
                    break;
                case 10:
                    String str13 = (String) this.write;
                    String str14 = (String) this.RemoteActionCompatParcelizer;
                    setViewportBounds setviewportboundsMediaDescriptionCompat2 = ((LookaheadScopeKtLookaheadScope221) ((NoWindowInsetsAnimation) this.serializer).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat();
                    AtomicReference atomicReference = (AtomicReference) this.read;
                    setviewportboundsMediaDescriptionCompat2.MediaSessionCompatToken();
                    setviewportboundsMediaDescriptionCompat2.serializer();
                    setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer((Runnable) new getLayoutNodeToHolder(setviewportboundsMediaDescriptionCompat2, (Serializable) atomicReference, str13, (Object) str14, (Object) setviewportboundsMediaDescriptionCompat2.RemoteActionCompatParcelizer(false), 2));
                    return;
                case 11:
                    setViewportBounds setviewportboundsMediaDescriptionCompat3 = ((AppMeasurementDynamiteService) this.serializer).zza.MediaDescriptionCompat();
                    getQEK5gGoQ getqek5ggoq2 = (getQEK5gGoQ) this.read;
                    String str15 = (String) this.write;
                    String str16 = (String) this.RemoteActionCompatParcelizer;
                    setviewportboundsMediaDescriptionCompat3.MediaSessionCompatToken();
                    setviewportboundsMediaDescriptionCompat3.serializer();
                    setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer((Runnable) new getLayoutNodeToHolder(setviewportboundsMediaDescriptionCompat3, (Serializable) str15, str16, (Object) setviewportboundsMediaDescriptionCompat3.RemoteActionCompatParcelizer(false), (Object) getqek5ggoq2, 3));
                    return;
                case 12:
                    getQEK5gGoQ getqek5ggoq3 = (getQEK5gGoQ) this.read;
                    setViewportBounds setviewportbounds = (setViewportBounds) this.serializer;
                    try {
                        try {
                            isComplete iscomplete = setviewportbounds.write;
                            if (iscomplete != null) {
                                bArrSerializer = iscomplete.serializer((zzbg) this.RemoteActionCompatParcelizer, (String) this.write);
                                setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                                onLayoutRectChangeddefault onlayoutrectchangeddefault3 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault3);
                                onlayoutrectchangeddefault3.IconCompatParcelizer(getqek5ggoq3, bArrSerializer);
                                return;
                            }
                            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope223 = (LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope223.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                            getlookaheaddelegate5.serializer.RemoteActionCompatParcelizer("Discarding data. Failed to send event to service to bundle");
                            onLayoutRectChangeddefault onlayoutrectchangeddefault4 = lookaheadScopeKtLookaheadScope223.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault4);
                            onlayoutrectchangeddefault4.IconCompatParcelizer(getqek5ggoq3, (byte[]) null);
                            return;
                        } catch (RemoteException e5) {
                            getLookaheadDelegate getlookaheaddelegate6 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                            getlookaheaddelegate6.serializer.serializer(e5, "Failed to send event to the service to bundle");
                        }
                    } catch (Throwable th4) {
                        onLayoutRectChangeddefault onlayoutrectchangeddefault5 = ((LookaheadScopeKtLookaheadScope221) setviewportbounds.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault5);
                        onlayoutrectchangeddefault5.IconCompatParcelizer(getqek5ggoq3, (byte[]) null);
                        throw th4;
                    }
                    break;
                case 13:
                    read();
                    return;
                case 14:
                    RemoteActionCompatParcelizer();
                    return;
                case 15:
                    zzpg zzpgVar3 = ((OnGloballyPositionedNode) this.serializer).IconCompatParcelizer;
                    onLayoutRectChangeddefault onlayoutrectchangeddefaultResultReceiver = zzpgVar3.ResultReceiver();
                    ((accessgetTvInputComposite1cp) zzpgVar3.ParcelableVolumeInfo()).getClass();
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    String str17 = (String) this.write;
                    zzbg zzbgVarRemoteActionCompatParcelizer = onlayoutrectchangeddefaultResultReceiver.RemoteActionCompatParcelizer((String) this.RemoteActionCompatParcelizer, (Bundle) this.read, "auto", jCurrentTimeMillis3, false);
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbgVarRemoteActionCompatParcelizer);
                    zzpgVar3.serializer(zzbgVarRemoteActionCompatParcelizer, str17);
                    return;
                default:
                    synchronized (((JavascriptInterfaceBase) this.serializer)) {
                        if (((BrazeWebViewClientsetWebViewClientStateListener1) this.write).read == 0) {
                            try {
                                ((BrazeWebViewClientsetWebViewClientStateListener11) this.RemoteActionCompatParcelizer).IconCompatParcelizer(this.read);
                                ((JavascriptInterfaceBase) this.serializer).RemoteActionCompatParcelizer.remove((BrazeWebViewClientsetWebViewClientStateListener11) this.RemoteActionCompatParcelizer);
                                if (((JavascriptInterfaceBase) this.serializer).RemoteActionCompatParcelizer.isEmpty()) {
                                    ((JavascriptInterfaceBase) this.serializer).read.shutdown();
                                    ((JavascriptInterfaceBase) this.serializer).read = null;
                                }
                            } catch (Throwable th5) {
                                ((JavascriptInterfaceBase) this.serializer).RemoteActionCompatParcelizer.remove((BrazeWebViewClientsetWebViewClientStateListener11) this.RemoteActionCompatParcelizer);
                                if (((JavascriptInterfaceBase) this.serializer).RemoteActionCompatParcelizer.isEmpty()) {
                                    ((JavascriptInterfaceBase) this.serializer).read.shutdown();
                                    ((JavascriptInterfaceBase) this.serializer).read = null;
                                }
                                throw th5;
                            }
                        }
                    }
                    return;
            }
        } catch (Throwable th6) {
            Throwable cause4 = th6.getCause();
            if (cause4 == null) {
                throw th6;
            }
            throw cause4;
        }
    }

    public /* synthetic */ ImageVectorCacheImageVectorEntry(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, Bundle bundle, String str, zzr zzrVar) {
        this.IconCompatParcelizer = 9;
        this.RemoteActionCompatParcelizer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
        this.read = bundle;
        this.write = str;
        this.serializer = zzrVar;
    }

    public /* synthetic */ ImageVectorCacheImageVectorEntry(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, String str, zzoo zzooVar, LayoutNodeSubcompositionsStatesubcompose41composable1 layoutNodeSubcompositionsStatesubcompose41composable1) {
        this.IconCompatParcelizer = 7;
        this.RemoteActionCompatParcelizer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
        this.write = str;
        this.read = zzooVar;
        this.serializer = layoutNodeSubcompositionsStatesubcompose41composable1;
    }

    public /* synthetic */ ImageVectorCacheImageVectorEntry(Object obj, Object obj2, Enum r3, String str, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.serializer = r3;
        this.write = str;
    }

    public /* synthetic */ ImageVectorCacheImageVectorEntry(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.read = obj4;
    }

    public ImageVectorCacheImageVectorEntry(AppMeasurementDynamiteService appMeasurementDynamiteService, getQEK5gGoQ getqek5ggoq, zzbg zzbgVar, String str) {
        this.IconCompatParcelizer = 8;
        this.RemoteActionCompatParcelizer = getqek5ggoq;
        this.read = zzbgVar;
        this.write = str;
        this.serializer = appMeasurementDynamiteService;
    }

    public ImageVectorCacheImageVectorEntry(AppMeasurementDynamiteService appMeasurementDynamiteService, getQEK5gGoQ getqek5ggoq, String str, String str2) {
        this.IconCompatParcelizer = 11;
        this.read = getqek5ggoq;
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = appMeasurementDynamiteService;
    }

    public /* synthetic */ ImageVectorCacheImageVectorEntry(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
    }

    public ImageVectorCacheImageVectorEntry(setViewportBounds setviewportbounds, zzbg zzbgVar, String str, getQEK5gGoQ getqek5ggoq) {
        this.IconCompatParcelizer = 12;
        this.RemoteActionCompatParcelizer = zzbgVar;
        this.write = str;
        this.read = getqek5ggoq;
        this.serializer = setviewportbounds;
    }
}
