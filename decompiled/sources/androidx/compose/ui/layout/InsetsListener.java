package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import io.sentry.rrweb.write;
import java.util.List;
import java.util.WeakHashMap;
import o.ContentInViewNode;
import o.DefaultScrollableState;
import o.FocusPropertiesImpl;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.StretchOverscrollNode;
import o.accessgetCancelcp;
import o.component13;
import o.component14;
import o.component15;
import o.getCieXyz;
import o.getOffsetF1C5BW0;
import o.getPlatformAndroidManager;
import o.onHideTranslationui;
import o.onRemeasuredozmzZPI;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.setEnter;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public final class InsetsListener extends WindowInsetsAnimationCompat$Callback implements Runnable, FocusPropertiesImpl, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final AndroidComposeView composeView;
    private final SnapshotStateList<RectRulers> displayCutoutRulers;
    private final ContentInViewNode displayCutouts;
    private final getPlatformAndroidManager generation;
    private final DefaultScrollableState insetsValues;
    private boolean prepared;
    private int runningAnimationMask;
    private FocusRequesterModifierKt savedInsets;

    public InsetsListener(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        onRemeasuredozmzZPI onremeasuredozmzzpi = new onRemeasuredozmzZPI(9);
        WindowInsetsRulers.Companion companion = WindowInsetsRulers.Companion;
        onremeasuredozmzzpi.write(companion.getCaptionBar(), new WindowWindowInsetsAnimationValues("caption bar"));
        onremeasuredozmzzpi.write(companion.getDisplayCutout(), new WindowWindowInsetsAnimationValues("display cutout"));
        onremeasuredozmzzpi.write(companion.getIme(), new WindowWindowInsetsAnimationValues("ime"));
        onremeasuredozmzzpi.write(companion.getMandatorySystemGestures(), new WindowWindowInsetsAnimationValues("mandatory system gestures"));
        onremeasuredozmzzpi.write(companion.getNavigationBars(), new WindowWindowInsetsAnimationValues("navigation bars"));
        onremeasuredozmzzpi.write(companion.getStatusBars(), new WindowWindowInsetsAnimationValues("status bars"));
        onremeasuredozmzzpi.write(companion.getSystemGestures(), new WindowWindowInsetsAnimationValues("system gestures"));
        onremeasuredozmzzpi.write(companion.getTappableElement(), new WindowWindowInsetsAnimationValues("tappable element"));
        onremeasuredozmzzpi.write(companion.getWaterfall(), new WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = onremeasuredozmzzpi;
        this.generation = CompositionKt.read(0);
        this.displayCutouts = new ContentInViewNode(4);
        this.displayCutoutRulers = new SnapshotStateList<>();
    }

    private final void stopAnimationForRuler(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues) {
        windowWindowInsetsAnimationValues.setAnimating(false);
        windowWindowInsetsAnimationValues.m2366setSourceValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
        windowWindowInsetsAnimationValues.m2367setTargetValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
    }

    public final AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public final SnapshotStateList<RectRulers> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    public final ContentInViewNode getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final getPlatformAndroidManager getGeneration() {
        return this.generation;
    }

    public final DefaultScrollableState getInsetsValues() {
        return this.insetsValues;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void onEnd(component14 component14Var) {
        boolean z = false;
        this.prepared = false;
        int iWrite = component14Var.IconCompatParcelizer.write();
        this.runningAnimationMask &= ~iWrite;
        this.savedInsets = null;
        WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.serializer(iWrite);
        if (windowInsetsRulers != null) {
            Object objMediaBrowserCompatMediaItem = this.insetsValues.MediaBrowserCompatMediaItem(windowInsetsRulers);
            objMediaBrowserCompatMediaItem.getClass();
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem;
            windowWindowInsetsAnimationValues.setFraction(0.0f);
            windowWindowInsetsAnimationValues.setAlpha(1.0f);
            windowWindowInsetsAnimationValues.setDurationMillis(0L);
            windowWindowInsetsAnimationValues.setFraction(0.0f);
            stopAnimationForRuler(windowWindowInsetsAnimationValues);
            onHideTranslationui onhidetranslationui = (onHideTranslationui) this.generation;
            onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke = getOffsetF1C5BW0.serializer.read;
                if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
                    z = true;
                }
            }
            if (z) {
                getOffsetF1C5BW0.read();
            }
        }
        super.onEnd(component14Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void onPrepare(component14 component14Var) {
        this.prepared = true;
        super.onPrepare(component14Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List<component14> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            component14 component14Var = list.get(i);
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.serializer(component14Var.IconCompatParcelizer.write());
            if (windowInsetsRulers != null) {
                Object objMediaBrowserCompatMediaItem = this.insetsValues.MediaBrowserCompatMediaItem(windowInsetsRulers);
                objMediaBrowserCompatMediaItem.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem;
                if (windowWindowInsetsAnimationValues.isAnimating()) {
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues, component14Var);
                }
            }
        }
        updateInsets(focusRequesterModifierKt);
        return focusRequesterModifierKt;
    }

    private final void updateInsetAnimationInfo(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues, component14 component14Var) {
        windowWindowInsetsAnimationValues.setFraction(component14Var.IconCompatParcelizer.RemoteActionCompatParcelizer());
        component13 component13Var = component14Var.IconCompatParcelizer;
        windowWindowInsetsAnimationValues.setAlpha(component13Var.serializer());
        windowWindowInsetsAnimationValues.setDurationMillis(component13Var.IconCompatParcelizer());
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public component15 onStart(component14 component14Var, component15 component15Var) {
        FocusRequesterModifierKt focusRequesterModifierKt = this.savedInsets;
        boolean z = false;
        this.prepared = false;
        this.savedInsets = null;
        if (component14Var.IconCompatParcelizer.IconCompatParcelizer() > 0 && focusRequesterModifierKt != null) {
            int iWrite = component14Var.IconCompatParcelizer.write();
            this.runningAnimationMask |= iWrite;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) WindowInsetsRulers_androidKt.WindowInsetsTypeMap.serializer(iWrite);
            if (windowInsetsRulers != null) {
                Object objMediaBrowserCompatMediaItem = this.insetsValues.MediaBrowserCompatMediaItem(windowInsetsRulers);
                objMediaBrowserCompatMediaItem.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem;
                setRight insets = focusRequesterModifierKt.IconCompatParcelizer.getInsets(iWrite);
                long jM2349constructorimpl = ValueInsets.m2349constructorimpl((((long) insets.RemoteActionCompatParcelizer) << 48) | (((long) insets.write) << 32) | (((long) insets.read) << 16) | ((long) insets.serializer));
                long jM2360getCurrenthdzbrEE = windowWindowInsetsAnimationValues.m2360getCurrenthdzbrEE();
                if (!ValueInsets.m2351equalsimpl0(jM2349constructorimpl, jM2360getCurrenthdzbrEE)) {
                    windowWindowInsetsAnimationValues.m2366setSourceValueInsetsYnlvx88(jM2360getCurrenthdzbrEE);
                    windowWindowInsetsAnimationValues.m2367setTargetValueInsetsYnlvx88(jM2349constructorimpl);
                    windowWindowInsetsAnimationValues.setAnimating(true);
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues, component14Var);
                    onHideTranslationui onhidetranslationui = (onHideTranslationui) this.generation;
                    onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
                    synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                        relocationOffsetfbGrOKE relocationoffsetfbgroke = getOffsetF1C5BW0.serializer.read;
                        if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
                            z = true;
                        }
                    }
                    if (z) {
                        getOffsetF1C5BW0.read();
                        return component15Var;
                    }
                }
            }
        }
        return component15Var;
    }

    private final void updateInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
        boolean z;
        boolean z2;
        long jM2349constructorimpl;
        boolean z3;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i;
        int i2;
        StretchOverscrollNode stretchOverscrollNode = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        int[] iArr2 = stretchOverscrollNode.serializer;
        Object[] objArr2 = stretchOverscrollNode.IconCompatParcelizer;
        long[] jArr2 = stretchOverscrollNode.RemoteActionCompatParcelizer;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr2[i6];
                            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) objArr2[i6];
                            setRight insets = focusRequesterModifierKt.IconCompatParcelizer.getInsets(i7);
                            boolean z6 = z4;
                            boolean z7 = z5;
                            long jM2349constructorimpl2 = ValueInsets.m2349constructorimpl((((long) insets.RemoteActionCompatParcelizer) << 48) | (((long) insets.write) << 32) | (((long) insets.read) << 16) | ((long) insets.serializer));
                            Object objMediaBrowserCompatMediaItem = this.insetsValues.MediaBrowserCompatMediaItem(windowInsetsRulers);
                            objMediaBrowserCompatMediaItem.getClass();
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem;
                            if (ValueInsets.m2351equalsimpl0(jM2349constructorimpl2, windowWindowInsetsAnimationValues.m2360getCurrenthdzbrEE())) {
                                i2 = 8;
                            } else {
                                windowWindowInsetsAnimationValues.m2364setCurrentYnlvx88(jM2349constructorimpl2);
                                if (ValueInsets.m2351equalsimpl0(jM2349constructorimpl2, ValueInsets_androidKt.getZeroValueInsets())) {
                                    i2 = 8;
                                } else {
                                    i2 = 8;
                                    z6 = true;
                                }
                                z7 = true;
                            }
                            if (i7 != i2) {
                                setRight insetsIgnoringVisibility = focusRequesterModifierKt.IconCompatParcelizer.getInsetsIgnoringVisibility(i7);
                                i = i5;
                                long jM2349constructorimpl3 = ValueInsets.m2349constructorimpl(((long) insetsIgnoringVisibility.serializer) | (((long) insetsIgnoringVisibility.RemoteActionCompatParcelizer) << 48) | (((long) insetsIgnoringVisibility.write) << 32) | (((long) insetsIgnoringVisibility.read) << 16));
                                if (!ValueInsets.m2351equalsimpl0(windowWindowInsetsAnimationValues.m2361getMaximumhdzbrEE(), jM2349constructorimpl3)) {
                                    windowWindowInsetsAnimationValues.m2365setMaximumYnlvx88(jM2349constructorimpl3);
                                    if (!ValueInsets.m2351equalsimpl0(jM2349constructorimpl3, ValueInsets_androidKt.getZeroValueInsets())) {
                                        z6 = true;
                                    }
                                    z7 = true;
                                }
                            } else {
                                i = i5;
                            }
                            windowWindowInsetsAnimationValues.setVisible(focusRequesterModifierKt.IconCompatParcelizer.isVisible(i7));
                            z4 = z6;
                            z5 = z7;
                        } else {
                            i = i5;
                        }
                        j >>= 8;
                        i5 = i + 1;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                        length = length;
                        i4 = i4;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                    int i8 = length;
                    z = z4;
                    z2 = z5;
                    if (i4 != 8) {
                        break;
                    }
                    z4 = z;
                    z5 = z2;
                    length = i8;
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i3 == length) {
                    z = z4;
                    z2 = z5;
                    break;
                } else {
                    i3++;
                    jArr2 = jArr;
                    iArr2 = iArr;
                    objArr2 = objArr;
                }
            }
        } else {
            z = false;
            z2 = false;
        }
        setEnter displayCutout = focusRequesterModifierKt.IconCompatParcelizer.getDisplayCutout();
        if (displayCutout == null) {
            jM2349constructorimpl = ValueInsets_androidKt.getZeroValueInsets();
        } else {
            setRight setrightRemoteActionCompatParcelizer = displayCutout.RemoteActionCompatParcelizer();
            jM2349constructorimpl = ValueInsets.m2349constructorimpl((((long) setrightRemoteActionCompatParcelizer.RemoteActionCompatParcelizer) << 48) | (((long) setrightRemoteActionCompatParcelizer.write) << 32) | (((long) setrightRemoteActionCompatParcelizer.read) << 16) | ((long) setrightRemoteActionCompatParcelizer.serializer));
        }
        Object objMediaBrowserCompatMediaItem2 = this.insetsValues.MediaBrowserCompatMediaItem(WindowInsetsRulers.Companion.getWaterfall());
        objMediaBrowserCompatMediaItem2.getClass();
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = (WindowWindowInsetsAnimationValues) objMediaBrowserCompatMediaItem2;
        windowWindowInsetsAnimationValues2.setVisible(!ValueInsets.m2351equalsimpl0(jM2349constructorimpl, ValueInsets_androidKt.getZeroValueInsets()));
        if (!ValueInsets.m2351equalsimpl0(windowWindowInsetsAnimationValues2.m2360getCurrenthdzbrEE(), jM2349constructorimpl)) {
            windowWindowInsetsAnimationValues2.m2364setCurrentYnlvx88(jM2349constructorimpl);
            windowWindowInsetsAnimationValues2.m2365setMaximumYnlvx88(jM2349constructorimpl);
            if (!ValueInsets.m2351equalsimpl0(jM2349constructorimpl, ValueInsets_androidKt.getZeroValueInsets())) {
                z = true;
            }
            z2 = true;
        }
        if (displayCutout == null) {
            ContentInViewNode contentInViewNode = this.displayCutouts;
            if (contentInViewNode.IconCompatParcelizer > 0) {
                contentInViewNode.IconCompatParcelizer();
                this.displayCutoutRulers.clear();
                z2 = true;
            }
        } else {
            List listRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(displayCutout.write);
            int size = listRemoteActionCompatParcelizer.size();
            ContentInViewNode contentInViewNode2 = this.displayCutouts;
            if (size < contentInViewNode2.IconCompatParcelizer) {
                contentInViewNode2.read(listRemoteActionCompatParcelizer.size(), this.displayCutouts.IconCompatParcelizer);
                this.displayCutoutRulers.IconCompatParcelizer(listRemoteActionCompatParcelizer.size(), this.displayCutoutRulers.size());
                z2 = true;
            } else {
                int size2 = listRemoteActionCompatParcelizer.size();
                int i9 = this.displayCutouts.IconCompatParcelizer;
                int i10 = 0;
                while (i10 < size2 - i9) {
                    ContentInViewNode contentInViewNode3 = this.displayCutouts;
                    contentInViewNode3.read(CompositionKt.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer.get(contentInViewNode3.IconCompatParcelizer)));
                    this.displayCutoutRulers.add(RectRulersKt.RectRulers("display cutout rect " + this.displayCutouts.IconCompatParcelizer));
                    i10++;
                    z2 = true;
                }
            }
            List list = listRemoteActionCompatParcelizer;
            int size3 = list.size();
            for (int i11 = 0; i11 < size3; i11++) {
                Rect rect = (Rect) listRemoteActionCompatParcelizer.get(i11);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) this.displayCutouts.RemoteActionCompatParcelizer(i11);
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{populateViewStructure_androidKtpopulate7.getValue(), rect}, getCieXyz.write())).booleanValue()) {
                    populateViewStructure_androidKtpopulate7.setValue(rect);
                    z2 = true;
                }
            }
            if (!list.isEmpty()) {
                z = true;
            }
        }
        if ((z || ((onHideTranslationui) this.generation).serializer() != 0) && z2) {
            onHideTranslationui onhidetranslationui = (onHideTranslationui) this.generation;
            onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke = getOffsetF1C5BW0.serializer.read;
                z3 = relocationoffsetfbgroke != null && relocationoffsetfbgroke.read();
            }
            if (z3) {
                getOffsetF1C5BW0.read();
            }
        }
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        if (this.prepared) {
            this.savedInsets = focusRequesterModifierKt;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return focusRequesterModifierKt;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(focusRequesterModifierKt);
        }
        return focusRequesterModifierKt;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(view, this);
        FocusPropertiesNode.read(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(view, null);
        FocusPropertiesNode.read(view, (WindowInsetsAnimationCompat$Callback) null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            FocusRequesterModifierKt focusRequesterModifierKt = this.savedInsets;
            if (focusRequesterModifierKt != null) {
                updateInsets(focusRequesterModifierKt);
                this.savedInsets = null;
            }
        }
    }
}
