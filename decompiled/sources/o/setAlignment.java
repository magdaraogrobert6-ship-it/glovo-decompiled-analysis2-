package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class setAlignment {
    public float _init_lambda1;
    public final paintdefault _init_lambda2;
    public Object _init_lambda3;
    public final paintdefault _init_lambda4;
    public String accessensureViewModelStore;
    public final boolean[] addContentView;
    public int addMenuProvider;
    public int addObserverForBackInvoker;
    public boolean addObserverForBackInvokerlambda0;
    public int addOnConfigurationChangedListener;
    public final setAlignment[] addOnContextAvailableListener;
    public final paintdefault[] addOnMultiWindowModeChangedListener;
    public final hasSpecifiedAndFiniteHeightuvyYCjk[] addOnNewIntentListener;
    public int addOnPictureInPictureModeChangedListener;
    public int addOnPictureInPictureUiStateChangedListener;
    public int addOnTrimMemoryListener;
    public float addOnUserLeaveHintListener;
    public float createFullyDrawnExecutor;
    public int defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public int enterPictureInPictureMode;
    public float fullyDrawnReporter_delegatelambda0;
    public boolean fullyDrawnReporter_delegatelambda00;
    public final int[] getActivityResultRegistry;
    public int getDefaultViewModelCreationExtras;
    public boolean getDefaultViewModelProviderFactory;
    public int getFullyDrawnReporter;
    public float getLastCustomNonConfigurationInstance;
    public int getLifecycle;
    public float getNavigationEventDispatcher;
    public boolean getOnBackPressedDispatcher;
    public component40d7_KjU getOnBackPressedInput;
    public final setAlignment[] getSavedStateRegistry;
    public int getSavedStateRegistryControllerannotations;
    public getUseIntrinsicSize getViewModelStore;
    public final int[] initializeViewTreeOwners;
    public final paintdefault invalidateMenu;
    public int menuHostHelperlambda0;
    public final paintdefault onActivityResult;
    public float onBackPressed;
    public boolean onBackPressedDispatcher_delegatelambda0;
    public int onBackPressedDispatcher_delegatelambda00;
    public final paintdefault onBackPressedDispatcher_delegatelambda010;
    public int onBackPressedInput_delegatelambda0;
    public boolean onConfigurationChanged;
    public int onCreate;
    public copygNMxBKI onCreatePanelMenu;
    public boolean onMenuItemSelected;
    public int onMultiWindowModeChanged;
    public int onNewIntent;
    public int onPanelClosed;
    public int onPictureInPictureModeChanged;
    public int onPictureInPictureUiStateChanged;
    public int onPreparePanel;
    public final float[] onRequestPermissionsResult;
    public int onRetainCustomNonConfigurationInstance;
    public int onRetainNonConfigurationInstance;
    public String onSaveInstanceState;
    public ScaleKt onTrimMemory;
    public boolean onUserLeaveHint;
    public final toSpkPz2Gy4 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final boolean[] r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public ScaleKt r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final paintdefault r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final paintdefault r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final paintdefault r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final ArrayList r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        this.getOnBackPressedDispatcher = false;
        this.onConfigurationChanged = false;
        this.fullyDrawnReporter_delegatelambda00 = false;
        this.onMenuItemSelected = false;
        ArrayList arrayList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            paintdefault paintdefaultVar = (paintdefault) arrayList.get(i);
            paintdefaultVar.read = false;
            paintdefaultVar.serializer = 0;
        }
    }

    public boolean read() {
        return this.onMultiWindowModeChanged != 8;
    }

    public final void MediaBrowserCompatMediaItem() {
        paintdefault paintdefaultVar = this.onBackPressedDispatcher_delegatelambda010;
        ArrayList arrayList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        arrayList.add(paintdefaultVar);
        arrayList.add(this.onActivityResult);
        arrayList.add(this.invalidateMenu);
        arrayList.add(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        arrayList.add(this._init_lambda4);
        arrayList.add(this._init_lambda2);
        arrayList.add(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        arrayList.add(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
    }

    public final boolean MediaDescriptionCompat(int i) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        int i2 = i * 2;
        paintdefault[] paintdefaultVarArr = this.addOnMultiWindowModeChangedListener;
        paintdefault paintdefaultVar3 = paintdefaultVarArr[i2];
        paintdefault paintdefaultVar4 = paintdefaultVar3.MediaSessionCompatQueueItem;
        return (paintdefaultVar4 == null || paintdefaultVar4.MediaSessionCompatQueueItem == paintdefaultVar3 || (paintdefaultVar2 = (paintdefaultVar = paintdefaultVarArr[i2 + 1]).MediaSessionCompatQueueItem) == null || paintdefaultVar2.MediaSessionCompatQueueItem != paintdefaultVar) ? false : true;
    }

    public final void MediaMetadataCompat(int i) {
        this.addObserverForBackInvoker = i;
        int i2 = this.getDefaultViewModelCreationExtras;
        if (i < i2) {
            this.addObserverForBackInvoker = i2;
        }
    }

    public final void MediaSessionCompatQueueItem(int i) {
        this.onPanelClosed = i;
        int i2 = this.getFullyDrawnReporter;
        if (i < i2) {
            this.onPanelClosed = i2;
        }
    }

    public void MediaSessionCompatResultReceiverWrapper() {
        this.onBackPressedDispatcher_delegatelambda010.RatingCompat();
        this.onActivityResult.RatingCompat();
        this.invalidateMenu.RatingCompat();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RatingCompat();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RatingCompat();
        this._init_lambda4.RatingCompat();
        this._init_lambda2.RatingCompat();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RatingCompat();
        this.getViewModelStore = null;
        this._init_lambda1 = Float.NaN;
        this.onPanelClosed = 0;
        this.addObserverForBackInvoker = 0;
        this.createFullyDrawnExecutor = 0.0f;
        this.defaultViewModelProviderFactory_delegatelambda0 = -1;
        this.onPictureInPictureModeChanged = 0;
        this.onRetainNonConfigurationInstance = 0;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
        this.getFullyDrawnReporter = 0;
        this.getDefaultViewModelCreationExtras = 0;
        this.fullyDrawnReporter_delegatelambda0 = 0.5f;
        this.onBackPressed = 0.5f;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
        hasspecifiedandfiniteheightuvyycjkArr[0] = hasspecifiedandfiniteheightuvyycjk;
        hasspecifiedandfiniteheightuvyycjkArr[1] = hasspecifiedandfiniteheightuvyycjk;
        this._init_lambda3 = null;
        this.onMultiWindowModeChanged = 0;
        this.menuHostHelperlambda0 = 0;
        this.onCreate = 0;
        float[] fArr = this.onRequestPermissionsResult;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.getSavedStateRegistryControllerannotations = -1;
        this.onNewIntent = -1;
        int[] iArr = this.getActivityResultRegistry;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.addOnConfigurationChangedListener = 0;
        this.addMenuProvider = 0;
        this.getLastCustomNonConfigurationInstance = 1.0f;
        this.addOnUserLeaveHintListener = 1.0f;
        this.addOnPictureInPictureUiStateChangedListener = Integer.MAX_VALUE;
        this.addOnPictureInPictureModeChangedListener = Integer.MAX_VALUE;
        this.addOnTrimMemoryListener = 0;
        this.enterPictureInPictureMode = 0;
        this.getLifecycle = -1;
        this.getNavigationEventDispatcher = 1.0f;
        boolean[] zArr = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        zArr[0] = true;
        zArr[1] = true;
        this.onBackPressedDispatcher_delegatelambda0 = false;
        boolean[] zArr2 = this.addContentView;
        zArr2[0] = false;
        zArr2[1] = false;
        this.getDefaultViewModelProviderFactory = true;
        int[] iArr2 = this.initializeViewTreeOwners;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.onPreparePanel = -1;
        this.ensureViewModelStore = -1;
    }

    public final boolean ParcelableVolumeInfo() {
        paintdefault paintdefaultVar = this.onBackPressedDispatcher_delegatelambda010;
        paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
        if (paintdefaultVar2 != null && paintdefaultVar2.MediaSessionCompatQueueItem == paintdefaultVar) {
            return true;
        }
        paintdefault paintdefaultVar3 = this.invalidateMenu;
        paintdefault paintdefaultVar4 = paintdefaultVar3.MediaSessionCompatQueueItem;
        return paintdefaultVar4 != null && paintdefaultVar4.MediaSessionCompatQueueItem == paintdefaultVar3;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        paintdefault paintdefaultVar = this.onActivityResult;
        paintdefault paintdefaultVar2 = paintdefaultVar.MediaSessionCompatQueueItem;
        if (paintdefaultVar2 != null && paintdefaultVar2.MediaSessionCompatQueueItem == paintdefaultVar) {
            return true;
        }
        paintdefault paintdefaultVar3 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        paintdefault paintdefaultVar4 = paintdefaultVar3.MediaSessionCompatQueueItem;
        return paintdefaultVar4 != null && paintdefaultVar4.MediaSessionCompatQueueItem == paintdefaultVar3;
    }

    public paintdefault RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu) {
        switch (modifyConstraintsZezNO4M.write[calculatescaledsizee7kxvpu.ordinal()]) {
            case 1:
                return this.onBackPressedDispatcher_delegatelambda010;
            case 2:
                return this.onActivityResult;
            case 3:
                return this.invalidateMenu;
            case 4:
                return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            case 5:
                return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            case 6:
                return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            case 7:
                return this._init_lambda4;
            case 8:
                return this._init_lambda2;
            case 9:
                return null;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) calculatescaledsizee7kxvpu.name());
                return null;
        }
    }

    public final void RemoteActionCompatParcelizer(float f, int i, int i2, int i3) {
        this.addMenuProvider = i;
        this.enterPictureInPictureMode = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.addOnPictureInPictureModeChangedListener = i3;
        this.addOnUserLeaveHintListener = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.addMenuProvider = 2;
    }

    public final void ResultReceiver() {
        ArrayList arrayList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((paintdefault) arrayList.get(i)).RatingCompat();
        }
    }

    public void read(boolean z, boolean z2) {
        int i;
        int i2;
        component40d7_KjU component40d7_kju = this.getOnBackPressedInput;
        boolean z3 = z & component40d7_kju.MediaMetadataCompat;
        copygNMxBKI copygnmxbki = this.onCreatePanelMenu;
        boolean z4 = z2 & copygnmxbki.MediaMetadataCompat;
        int i3 = component40d7_kju.PlaybackStateCompatCustomAction.PlaybackStateCompat;
        int i4 = copygnmxbki.PlaybackStateCompatCustomAction.PlaybackStateCompat;
        int i5 = component40d7_kju.RemoteActionCompatParcelizer.PlaybackStateCompat;
        int i6 = copygnmxbki.RemoteActionCompatParcelizer.PlaybackStateCompat;
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (z3) {
            this.onPictureInPictureModeChanged = i3;
        }
        if (z4) {
            this.onRetainNonConfigurationInstance = i4;
        }
        if (this.onMultiWindowModeChanged == 8) {
            this.onPanelClosed = 0;
            this.addObserverForBackInvoker = 0;
            return;
        }
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
        if (z3) {
            if (hasspecifiedandfiniteheightuvyycjkArr[0] == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED && i7 < (i2 = this.onPanelClosed)) {
                i7 = i2;
            }
            this.onPanelClosed = i7;
            int i9 = this.getFullyDrawnReporter;
            if (i7 < i9) {
                this.onPanelClosed = i9;
            }
        }
        if (z4) {
            if (hasspecifiedandfiniteheightuvyycjkArr[1] == hasSpecifiedAndFiniteHeightuvyYCjk.FIXED && i8 < (i = this.addObserverForBackInvoker)) {
                i8 = i;
            }
            this.addObserverForBackInvoker = i8;
            int i10 = this.getDefaultViewModelCreationExtras;
            if (i8 < i10) {
                this.addObserverForBackInvoker = i10;
            }
        }
    }

    public final boolean read(int i, int i2) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        paintdefault paintdefaultVar3;
        paintdefault paintdefaultVar4;
        if (i == 0) {
            paintdefault paintdefaultVar5 = this.onBackPressedDispatcher_delegatelambda010;
            paintdefault paintdefaultVar6 = paintdefaultVar5.MediaSessionCompatQueueItem;
            if (paintdefaultVar6 == null || !paintdefaultVar6.read || (paintdefaultVar4 = (paintdefaultVar3 = this.invalidateMenu).MediaSessionCompatQueueItem) == null || !paintdefaultVar4.read) {
                return false;
            }
            return (paintdefaultVar4.RemoteActionCompatParcelizer() - paintdefaultVar3.serializer()) - (paintdefaultVar5.serializer() + paintdefaultVar5.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) >= i2;
        }
        paintdefault paintdefaultVar7 = this.onActivityResult;
        paintdefault paintdefaultVar8 = paintdefaultVar7.MediaSessionCompatQueueItem;
        if (paintdefaultVar8 == null || !paintdefaultVar8.read || (paintdefaultVar2 = (paintdefaultVar = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).MediaSessionCompatQueueItem) == null || !paintdefaultVar2.read) {
            return false;
        }
        return (paintdefaultVar2.RemoteActionCompatParcelizer() - paintdefaultVar.serializer()) - (paintdefaultVar7.serializer() + paintdefaultVar7.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) >= i2;
    }

    public final setAlignment serializer(int i) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        if (i != 0) {
            if (i == 1 && (paintdefaultVar2 = (paintdefaultVar = this.onActivityResult).MediaSessionCompatQueueItem) != null && paintdefaultVar2.MediaSessionCompatQueueItem == paintdefaultVar) {
                return paintdefaultVar2.RatingCompat;
            }
            return null;
        }
        paintdefault paintdefaultVar3 = this.onBackPressedDispatcher_delegatelambda010;
        paintdefault paintdefaultVar4 = paintdefaultVar3.MediaSessionCompatQueueItem;
        if (paintdefaultVar4 == null || paintdefaultVar4.MediaSessionCompatQueueItem != paintdefaultVar3) {
            return null;
        }
        return paintdefaultVar4.RatingCompat;
    }

    public final void serializer(float f, int i, int i2, int i3) {
        this.addOnConfigurationChangedListener = i;
        this.addOnTrimMemoryListener = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.addOnPictureInPictureUiStateChangedListener = i3;
        this.getLastCustomNonConfigurationInstance = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.addOnConfigurationChangedListener = 2;
    }

    public void serializer(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.onBackPressedDispatcher_delegatelambda010.MediaBrowserCompatMediaItem();
        this.onActivityResult.MediaBrowserCompatMediaItem();
        this.invalidateMenu.MediaBrowserCompatMediaItem();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaBrowserCompatMediaItem();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaBrowserCompatMediaItem();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaBrowserCompatMediaItem();
        this._init_lambda4.MediaBrowserCompatMediaItem();
        this._init_lambda2.MediaBrowserCompatMediaItem();
    }

    public final void serializer(getUseIntrinsicSize getuseintrinsicsize, DrawWithContentElement drawWithContentElement, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            PainterNodemeasure1.serializer(getuseintrinsicsize, drawWithContentElement, this);
            hashSet.remove(this);
            write(drawWithContentElement, getuseintrinsicsize.RemoteActionCompatParcelizer(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.onBackPressedDispatcher_delegatelambda010.write;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((paintdefault) it.next()).RatingCompat.serializer(getuseintrinsicsize, drawWithContentElement, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.invalidateMenu.write;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((paintdefault) it2.next()).RatingCompat.serializer(getuseintrinsicsize, drawWithContentElement, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.onActivityResult.write;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((paintdefault) it3.next()).RatingCompat.serializer(getuseintrinsicsize, drawWithContentElement, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((paintdefault) it4.next()).RatingCompat.serializer(getuseintrinsicsize, drawWithContentElement, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((paintdefault) it5.next()).RatingCompat.serializer(getuseintrinsicsize, drawWithContentElement, hashSet, i, true);
            }
        }
    }

    public String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("");
        sbM.append(this.accessensureViewModelStore != null ? ff$$ExternalSyntheticOutline0.m(new StringBuilder("id: "), this.accessensureViewModelStore, " ") : "");
        sbM.append("(");
        sbM.append(this.onPictureInPictureModeChanged);
        sbM.append(", ");
        sbM.append(this.onRetainNonConfigurationInstance);
        sbM.append(") - (");
        sbM.append(this.onPanelClosed);
        sbM.append(" x ");
        return af$$ExternalSyntheticOutline0.m(this.addObserverForBackInvoker, ")", sbM);
    }

    public final setAlignment write(int i) {
        paintdefault paintdefaultVar;
        paintdefault paintdefaultVar2;
        if (i != 0) {
            if (i == 1 && (paintdefaultVar2 = (paintdefaultVar = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).MediaSessionCompatQueueItem) != null && paintdefaultVar2.MediaSessionCompatQueueItem == paintdefaultVar) {
                return paintdefaultVar2.RatingCompat;
            }
            return null;
        }
        paintdefault paintdefaultVar3 = this.invalidateMenu;
        paintdefault paintdefaultVar4 = paintdefaultVar3.MediaSessionCompatQueueItem;
        if (paintdefaultVar4 == null || paintdefaultVar4.MediaSessionCompatQueueItem != paintdefaultVar3) {
            return null;
        }
        return paintdefaultVar4.RatingCompat;
    }

    public final void write(DrawWithContentElement drawWithContentElement) {
        drawWithContentElement.write(this.onBackPressedDispatcher_delegatelambda010);
        drawWithContentElement.write(this.onActivityResult);
        drawWithContentElement.write(this.invalidateMenu);
        drawWithContentElement.write(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ > 0) {
            drawWithContentElement.write(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        }
    }

    public void IconCompatParcelizer(DrawWithContentElement drawWithContentElement, boolean z) {
        int i;
        int i2;
        copygNMxBKI copygnmxbki;
        component40d7_KjU component40d7_kju;
        drawWithContentElement.getClass();
        int iSerializer = DrawWithContentElement.serializer(this.onBackPressedDispatcher_delegatelambda010);
        int iSerializer2 = DrawWithContentElement.serializer(this.onActivityResult);
        int iSerializer3 = DrawWithContentElement.serializer(this.invalidateMenu);
        int iSerializer4 = DrawWithContentElement.serializer(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        if (z && (component40d7_kju = this.getOnBackPressedInput) != null) {
            releaseGraphicsLayer releasegraphicslayer = component40d7_kju.PlaybackStateCompatCustomAction;
            if (releasegraphicslayer.MediaBrowserCompatMediaItem) {
                releaseGraphicsLayer releasegraphicslayer2 = component40d7_kju.RemoteActionCompatParcelizer;
                if (releasegraphicslayer2.MediaBrowserCompatMediaItem) {
                    iSerializer = releasegraphicslayer.PlaybackStateCompat;
                    iSerializer3 = releasegraphicslayer2.PlaybackStateCompat;
                }
            }
        }
        if (z && (copygnmxbki = this.onCreatePanelMenu) != null) {
            releaseGraphicsLayer releasegraphicslayer3 = copygnmxbki.PlaybackStateCompatCustomAction;
            if (releasegraphicslayer3.MediaBrowserCompatMediaItem) {
                releaseGraphicsLayer releasegraphicslayer4 = copygnmxbki.RemoteActionCompatParcelizer;
                if (releasegraphicslayer4.MediaBrowserCompatMediaItem) {
                    iSerializer2 = releasegraphicslayer3.PlaybackStateCompat;
                    iSerializer4 = releasegraphicslayer4.PlaybackStateCompat;
                }
            }
        }
        if (iSerializer3 - iSerializer < 0 || iSerializer4 - iSerializer2 < 0 || iSerializer == Integer.MIN_VALUE || iSerializer == Integer.MAX_VALUE || iSerializer2 == Integer.MIN_VALUE || iSerializer2 == Integer.MAX_VALUE || iSerializer3 == Integer.MIN_VALUE || iSerializer3 == Integer.MAX_VALUE || iSerializer4 == Integer.MIN_VALUE || iSerializer4 == Integer.MAX_VALUE) {
            iSerializer = 0;
            iSerializer2 = 0;
            iSerializer3 = 0;
            iSerializer4 = 0;
        }
        int i3 = iSerializer3 - iSerializer;
        int i4 = iSerializer4 - iSerializer2;
        this.onPictureInPictureModeChanged = iSerializer;
        this.onRetainNonConfigurationInstance = iSerializer2;
        if (this.onMultiWindowModeChanged == 8) {
            this.onPanelClosed = 0;
            this.addObserverForBackInvoker = 0;
            return;
        }
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr[0];
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        if (hasspecifiedandfiniteheightuvyycjk == hasspecifiedandfiniteheightuvyycjk2 && i3 < (i2 = this.onPanelClosed)) {
            i3 = i2;
        }
        if (hasspecifiedandfiniteheightuvyycjkArr[1] == hasspecifiedandfiniteheightuvyycjk2 && i4 < (i = this.addObserverForBackInvoker)) {
            i4 = i;
        }
        this.onPanelClosed = i3;
        this.addObserverForBackInvoker = i4;
        int i5 = this.getDefaultViewModelCreationExtras;
        if (i4 < i5) {
            this.addObserverForBackInvoker = i5;
        }
        int i6 = this.getFullyDrawnReporter;
        if (i3 < i6) {
            this.onPanelClosed = i6;
        }
        int i7 = this.addOnPictureInPictureUiStateChangedListener;
        if (i7 > 0 && hasspecifiedandfiniteheightuvyycjk == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            this.onPanelClosed = Math.min(this.onPanelClosed, i7);
        }
        int i8 = this.addOnPictureInPictureModeChangedListener;
        if (i8 > 0 && hasspecifiedandfiniteheightuvyycjkArr[1] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT) {
            this.addObserverForBackInvoker = Math.min(this.addObserverForBackInvoker, i8);
        }
        int i9 = this.onPanelClosed;
        if (i3 != i9) {
            this.onPreparePanel = i9;
        }
        int i10 = this.addObserverForBackInvoker;
        if (i4 != i10) {
            this.ensureViewModelStore = i10;
        }
    }

    public final void RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk) {
        this.addOnNewIntentListener[1] = hasspecifiedandfiniteheightuvyycjk;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public final void serializer(String str) {
        float fAbs;
        int i = 0;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = -1;
            int i3 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                    String strSubstring2 = str.substring(i3, iIndexOf2);
                    String strSubstring3 = str.substring(iIndexOf2 + 1);
                    if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                        fAbs = i;
                    } else {
                        float f = Float.parseFloat(strSubstring2);
                        float f2 = Float.parseFloat(strSubstring3);
                        if (f <= 0.0f || f2 <= 0.0f) {
                            fAbs = i;
                        } else if (i2 == 1) {
                            fAbs = Math.abs(f2 / f);
                        } else {
                            fAbs = Math.abs(f / f2);
                        }
                    }
                } else {
                    String strSubstring4 = str.substring(i3);
                    if (strSubstring4.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring4);
                    } else {
                        fAbs = i;
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
            if (i > 0) {
                this.createFullyDrawnExecutor = fAbs;
                this.defaultViewModelProviderFactory_delegatelambda0 = i2;
                return;
            }
            return;
        }
        this.createFullyDrawnExecutor = 0.0f;
    }

    public final void write(hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk) {
        this.addOnNewIntentListener[0] = hasspecifiedandfiniteheightuvyycjk;
    }

    public setAlignment() {
        this.onUserLeaveHint = false;
        this.getOnBackPressedInput = null;
        this.onCreatePanelMenu = null;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new boolean[]{true, true};
        this.getDefaultViewModelProviderFactory = true;
        this.onPreparePanel = -1;
        this.ensureViewModelStore = -1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new toSpkPz2Gy4(this);
        this.getOnBackPressedDispatcher = false;
        this.onConfigurationChanged = false;
        this.fullyDrawnReporter_delegatelambda00 = false;
        this.onMenuItemSelected = false;
        this.getSavedStateRegistryControllerannotations = -1;
        this.onNewIntent = -1;
        this.onPictureInPictureUiStateChanged = 0;
        this.addOnConfigurationChangedListener = 0;
        this.addMenuProvider = 0;
        this.initializeViewTreeOwners = new int[2];
        this.addOnTrimMemoryListener = 0;
        this.addOnPictureInPictureUiStateChangedListener = 0;
        this.getLastCustomNonConfigurationInstance = 1.0f;
        this.enterPictureInPictureMode = 0;
        this.addOnPictureInPictureModeChangedListener = 0;
        this.addOnUserLeaveHintListener = 1.0f;
        this.getLifecycle = -1;
        this.getNavigationEventDispatcher = 1.0f;
        this.getActivityResultRegistry = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this._init_lambda1 = Float.NaN;
        this.addObserverForBackInvokerlambda0 = false;
        this.onBackPressedDispatcher_delegatelambda0 = false;
        this.onBackPressedInput_delegatelambda0 = 0;
        this.onBackPressedDispatcher_delegatelambda00 = 0;
        paintdefault paintdefaultVar = new paintdefault(this, calculateScaledSizeE7KxVPU.LEFT);
        this.onBackPressedDispatcher_delegatelambda010 = paintdefaultVar;
        paintdefault paintdefaultVar2 = new paintdefault(this, calculateScaledSizeE7KxVPU.TOP);
        this.onActivityResult = paintdefaultVar2;
        paintdefault paintdefaultVar3 = new paintdefault(this, calculateScaledSizeE7KxVPU.RIGHT);
        this.invalidateMenu = paintdefaultVar3;
        paintdefault paintdefaultVar4 = new paintdefault(this, calculateScaledSizeE7KxVPU.BOTTOM);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = paintdefaultVar4;
        paintdefault paintdefaultVar5 = new paintdefault(this, calculateScaledSizeE7KxVPU.BASELINE);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = paintdefaultVar5;
        this._init_lambda4 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER_X);
        this._init_lambda2 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER_Y);
        paintdefault paintdefaultVar6 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = paintdefaultVar6;
        this.addOnMultiWindowModeChangedListener = new paintdefault[]{paintdefaultVar, paintdefaultVar3, paintdefaultVar2, paintdefaultVar4, paintdefaultVar5, paintdefaultVar6};
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new ArrayList();
        this.addContentView = new boolean[2];
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        this.addOnNewIntentListener = new hasSpecifiedAndFiniteHeightuvyYCjk[]{hasspecifiedandfiniteheightuvyycjk, hasspecifiedandfiniteheightuvyycjk};
        this.getViewModelStore = null;
        this.onPanelClosed = 0;
        this.addObserverForBackInvoker = 0;
        this.createFullyDrawnExecutor = 0.0f;
        this.defaultViewModelProviderFactory_delegatelambda0 = -1;
        this.onPictureInPictureModeChanged = 0;
        this.onRetainNonConfigurationInstance = 0;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
        this.fullyDrawnReporter_delegatelambda0 = 0.5f;
        this.onBackPressed = 0.5f;
        this.onMultiWindowModeChanged = 0;
        this.accessensureViewModelStore = null;
        this.menuHostHelperlambda0 = 0;
        this.onCreate = 0;
        this.onRequestPermissionsResult = new float[]{-1.0f, -1.0f};
        this.addOnContextAvailableListener = new setAlignment[]{null, null};
        this.getSavedStateRegistry = new setAlignment[]{null, null};
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.onRetainCustomNonConfigurationInstance = -1;
        MediaBrowserCompatMediaItem();
    }

    public final int MediaSessionCompatToken() {
        getUseIntrinsicSize getuseintrinsicsize = this.getViewModelStore;
        return getuseintrinsicsize != null ? getuseintrinsicsize.PlaybackStateCompat + this.onRetainNonConfigurationInstance : this.onRetainNonConfigurationInstance;
    }

    public final boolean PlaybackStateCompat() {
        return this.getDefaultViewModelProviderFactory && this.onMultiWindowModeChanged != 8;
    }

    public final int RatingCompat() {
        getUseIntrinsicSize getuseintrinsicsize = this.getViewModelStore;
        return getuseintrinsicsize != null ? getuseintrinsicsize.ParcelableVolumeInfo + this.onPictureInPictureModeChanged : this.onPictureInPictureModeChanged;
    }

    public boolean RemoteActionCompatParcelizer() {
        if (this.onConfigurationChanged) {
            return true;
        }
        return this.onActivityResult.read && this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read;
    }

    public boolean j_() {
        if (this.getOnBackPressedDispatcher) {
            return true;
        }
        return this.onBackPressedDispatcher_delegatelambda010.read && this.invalidateMenu.read;
    }

    public void serializer(StringBuilder sb) {
        sb.append("  " + this.onSaveInstanceState + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.onPanelClosed);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.addObserverForBackInvoker);
        sb.append("\n");
        sb.append("    actualLeft:" + this.onPictureInPictureModeChanged);
        sb.append("\n");
        sb.append("    actualTop:" + this.onRetainNonConfigurationInstance);
        sb.append("\n");
        write(sb, "left", this.onBackPressedDispatcher_delegatelambda010);
        write(sb, "top", this.onActivityResult);
        write(sb, "right", this.invalidateMenu);
        write(sb, "bottom", this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        write(sb, "baseline", this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        write(sb, "centerX", this._init_lambda4);
        write(sb, "centerY", this._init_lambda2);
        int i = this.onPanelClosed;
        int i2 = this.getFullyDrawnReporter;
        int[] iArr = this.getActivityResultRegistry;
        int i3 = iArr[0];
        int i4 = this.addOnTrimMemoryListener;
        int i5 = this.addOnConfigurationChangedListener;
        float f = this.getLastCustomNonConfigurationInstance;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr[0];
        float[] fArr = this.onRequestPermissionsResult;
        float f2 = fArr[0];
        RemoteActionCompatParcelizer(sb, "    width", i, i2, i3, i4, i5, f, hasspecifiedandfiniteheightuvyycjk);
        int i6 = this.addObserverForBackInvoker;
        int i7 = this.getDefaultViewModelCreationExtras;
        int i8 = iArr[1];
        int i9 = this.enterPictureInPictureMode;
        int i10 = this.addMenuProvider;
        float f3 = this.addOnUserLeaveHintListener;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjkArr[1];
        float f4 = fArr[1];
        RemoteActionCompatParcelizer(sb, "    height", i6, i7, i8, i9, i10, f3, hasspecifiedandfiniteheightuvyycjk2);
        float f5 = this.createFullyDrawnExecutor;
        int i11 = this.defaultViewModelProviderFactory_delegatelambda0;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        write(sb, "    horizontalBias", this.fullyDrawnReporter_delegatelambda0, 0.5f);
        write(sb, "    verticalBias", this.onBackPressed, 0.5f);
        IconCompatParcelizer(this.menuHostHelperlambda0, 0, "    horizontalChainStyle", sb);
        IconCompatParcelizer(this.onCreate, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void write(o.DrawWithContentElement r63, boolean r64) {
        /*
            Method dump skipped, instruction units count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAlignment.write(o.DrawWithContentElement, boolean):void");
    }

    public final void write(calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu, setAlignment setalignment, calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2, int i, int i2) {
        RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu).IconCompatParcelizer(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2), i, i2, true);
    }

    public static void write(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public final hasSpecifiedAndFiniteHeightuvyYCjk IconCompatParcelizer(int i) {
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = this.addOnNewIntentListener;
        if (i == 0) {
            return hasspecifiedandfiniteheightuvyycjkArr[0];
        }
        if (i == 1) {
            return hasspecifiedandfiniteheightuvyycjkArr[1];
        }
        return null;
    }

    public final void IconCompatParcelizer(int i, int i2) {
        if (this.getOnBackPressedDispatcher) {
            return;
        }
        this.onBackPressedDispatcher_delegatelambda010.RemoteActionCompatParcelizer(i);
        this.invalidateMenu.RemoteActionCompatParcelizer(i2);
        this.onPictureInPictureModeChanged = i;
        this.onPanelClosed = i2 - i;
        this.getOnBackPressedDispatcher = true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean MediaBrowserCompatMediaItem(int i) {
        if (i == 0) {
            if ((this.onBackPressedDispatcher_delegatelambda010.MediaSessionCompatQueueItem != null ? 1 : 0) + (this.invalidateMenu.MediaSessionCompatQueueItem != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.onActivityResult.MediaSessionCompatQueueItem != null ? 1 : 0) + (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem != null ? 1 : 0) + (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaSessionCompatQueueItem != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final void write(int i, int i2) {
        if (this.onConfigurationChanged) {
            return;
        }
        this.onActivityResult.RemoteActionCompatParcelizer(i);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(i2);
        this.onRetainNonConfigurationInstance = i;
        this.addObserverForBackInvoker = i2 - i;
        if (this.addObserverForBackInvokerlambda0) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RemoteActionCompatParcelizer(i + this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        }
        this.onConfigurationChanged = true;
    }

    public final void MediaMetadataCompat() {
        if (this.getOnBackPressedInput == null) {
            component40d7_KjU component40d7_kju = new component40d7_KjU(this);
            component40d7_kju.PlaybackStateCompatCustomAction.RatingCompat = setGraphicsContext.LEFT;
            component40d7_kju.RemoteActionCompatParcelizer.RatingCompat = setGraphicsContext.RIGHT;
            component40d7_kju.ParcelableVolumeInfo = 0;
            this.getOnBackPressedInput = component40d7_kju;
        }
        if (this.onCreatePanelMenu == null) {
            copygNMxBKI copygnmxbki = new copygNMxBKI(this);
            releaseGraphicsLayer releasegraphicslayer = new releaseGraphicsLayer(copygnmxbki);
            copygnmxbki.IconCompatParcelizer = releasegraphicslayer;
            copygnmxbki.serializer = null;
            copygnmxbki.PlaybackStateCompatCustomAction.RatingCompat = setGraphicsContext.TOP;
            copygnmxbki.RemoteActionCompatParcelizer.RatingCompat = setGraphicsContext.BOTTOM;
            releasegraphicslayer.RatingCompat = setGraphicsContext.BASELINE;
            copygnmxbki.ParcelableVolumeInfo = 1;
            this.onCreatePanelMenu = copygnmxbki;
        }
    }

    public final void RatingCompat(int i) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i;
        this.addObserverForBackInvokerlambda0 = i > 0;
    }

    public final void write(calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu, setAlignment setalignment, calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2, int i) {
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu3;
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu4;
        boolean z;
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu5 = calculateScaledSizeE7KxVPU.CENTER;
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu5) {
            if (calculatescaledsizee7kxvpu2 != calculatescaledsizee7kxvpu5) {
                calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu6 = calculateScaledSizeE7KxVPU.LEFT;
                if (calculatescaledsizee7kxvpu2 == calculatescaledsizee7kxvpu6 || calculatescaledsizee7kxvpu2 == calculateScaledSizeE7KxVPU.RIGHT) {
                    write(calculatescaledsizee7kxvpu6, setalignment, calculatescaledsizee7kxvpu2, 0);
                    write(calculateScaledSizeE7KxVPU.RIGHT, setalignment, calculatescaledsizee7kxvpu2, 0);
                    RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2), 0);
                    return;
                }
                calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu7 = calculateScaledSizeE7KxVPU.TOP;
                if (calculatescaledsizee7kxvpu2 == calculatescaledsizee7kxvpu7 || calculatescaledsizee7kxvpu2 == calculateScaledSizeE7KxVPU.BOTTOM) {
                    write(calculatescaledsizee7kxvpu7, setalignment, calculatescaledsizee7kxvpu2, 0);
                    write(calculateScaledSizeE7KxVPU.BOTTOM, setalignment, calculatescaledsizee7kxvpu2, 0);
                    RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2), 0);
                    return;
                }
                return;
            }
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu8 = calculateScaledSizeE7KxVPU.LEFT;
            paintdefault paintdefaultVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu8);
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu9 = calculateScaledSizeE7KxVPU.RIGHT;
            paintdefault paintdefaultVarRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu9);
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu10 = calculateScaledSizeE7KxVPU.TOP;
            paintdefault paintdefaultVarRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu10);
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu11 = calculateScaledSizeE7KxVPU.BOTTOM;
            paintdefault paintdefaultVarRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu11);
            boolean z2 = true;
            if ((paintdefaultVarRemoteActionCompatParcelizer == null || !paintdefaultVarRemoteActionCompatParcelizer.IconCompatParcelizer()) && (paintdefaultVarRemoteActionCompatParcelizer2 == null || !paintdefaultVarRemoteActionCompatParcelizer2.IconCompatParcelizer())) {
                write(calculatescaledsizee7kxvpu8, setalignment, calculatescaledsizee7kxvpu8, 0);
                write(calculatescaledsizee7kxvpu9, setalignment, calculatescaledsizee7kxvpu9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((paintdefaultVarRemoteActionCompatParcelizer3 == null || !paintdefaultVarRemoteActionCompatParcelizer3.IconCompatParcelizer()) && (paintdefaultVarRemoteActionCompatParcelizer4 == null || !paintdefaultVarRemoteActionCompatParcelizer4.IconCompatParcelizer())) {
                write(calculatescaledsizee7kxvpu10, setalignment, calculatescaledsizee7kxvpu10, 0);
                write(calculatescaledsizee7kxvpu11, setalignment, calculatescaledsizee7kxvpu11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5), 0);
                return;
            }
            if (z) {
                calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu12 = calculateScaledSizeE7KxVPU.CENTER_X;
                RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu12).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu12), 0);
                return;
            } else {
                if (z2) {
                    calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu13 = calculateScaledSizeE7KxVPU.CENTER_Y;
                    RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu13).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu13), 0);
                    return;
                }
                return;
            }
        }
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu14 = calculateScaledSizeE7KxVPU.CENTER_X;
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu14 && (calculatescaledsizee7kxvpu2 == (calculatescaledsizee7kxvpu4 = calculateScaledSizeE7KxVPU.LEFT) || calculatescaledsizee7kxvpu2 == calculateScaledSizeE7KxVPU.RIGHT)) {
            paintdefault paintdefaultVarRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu4);
            paintdefault paintdefaultVarRemoteActionCompatParcelizer6 = setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2);
            paintdefault paintdefaultVarRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT);
            paintdefaultVarRemoteActionCompatParcelizer5.write(paintdefaultVarRemoteActionCompatParcelizer6, 0);
            paintdefaultVarRemoteActionCompatParcelizer7.write(paintdefaultVarRemoteActionCompatParcelizer6, 0);
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu14).write(paintdefaultVarRemoteActionCompatParcelizer6, 0);
            return;
        }
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu15 = calculateScaledSizeE7KxVPU.CENTER_Y;
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu15 && (calculatescaledsizee7kxvpu2 == (calculatescaledsizee7kxvpu3 = calculateScaledSizeE7KxVPU.TOP) || calculatescaledsizee7kxvpu2 == calculateScaledSizeE7KxVPU.BOTTOM)) {
            paintdefault paintdefaultVarRemoteActionCompatParcelizer8 = setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2);
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu3).write(paintdefaultVarRemoteActionCompatParcelizer8, 0);
            RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).write(paintdefaultVarRemoteActionCompatParcelizer8, 0);
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu15).write(paintdefaultVarRemoteActionCompatParcelizer8, 0);
            return;
        }
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu14 && calculatescaledsizee7kxvpu2 == calculatescaledsizee7kxvpu14) {
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu16 = calculateScaledSizeE7KxVPU.LEFT;
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu16).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu16), 0);
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu17 = calculateScaledSizeE7KxVPU.RIGHT;
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu17).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu17), 0);
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu14).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2), 0);
            return;
        }
        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu15 && calculatescaledsizee7kxvpu2 == calculatescaledsizee7kxvpu15) {
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu18 = calculateScaledSizeE7KxVPU.TOP;
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu18).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu18), 0);
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu19 = calculateScaledSizeE7KxVPU.BOTTOM;
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu19).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu19), 0);
            RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu15).write(setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2), 0);
            return;
        }
        paintdefault paintdefaultVarRemoteActionCompatParcelizer9 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu);
        paintdefault paintdefaultVarRemoteActionCompatParcelizer10 = setalignment.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2);
        if (paintdefaultVarRemoteActionCompatParcelizer9.serializer(paintdefaultVarRemoteActionCompatParcelizer10)) {
            calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu20 = calculateScaledSizeE7KxVPU.BASELINE;
            if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu20) {
                paintdefault paintdefaultVarRemoteActionCompatParcelizer11 = RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP);
                paintdefault paintdefaultVarRemoteActionCompatParcelizer12 = RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM);
                if (paintdefaultVarRemoteActionCompatParcelizer11 != null) {
                    paintdefaultVarRemoteActionCompatParcelizer11.RatingCompat();
                }
                if (paintdefaultVarRemoteActionCompatParcelizer12 != null) {
                    paintdefaultVarRemoteActionCompatParcelizer12.RatingCompat();
                }
            } else if (calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.TOP || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.BOTTOM) {
                paintdefault paintdefaultVarRemoteActionCompatParcelizer13 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu20);
                if (paintdefaultVarRemoteActionCompatParcelizer13 != null) {
                    paintdefaultVarRemoteActionCompatParcelizer13.RatingCompat();
                }
                paintdefault paintdefaultVarRemoteActionCompatParcelizer14 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5);
                if (paintdefaultVarRemoteActionCompatParcelizer14.MediaSessionCompatQueueItem != paintdefaultVarRemoteActionCompatParcelizer10) {
                    paintdefaultVarRemoteActionCompatParcelizer14.RatingCompat();
                }
                paintdefault paintdefaultVar = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu).read();
                paintdefault paintdefaultVarRemoteActionCompatParcelizer15 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu15);
                if (paintdefaultVarRemoteActionCompatParcelizer15.IconCompatParcelizer()) {
                    paintdefaultVar.RatingCompat();
                    paintdefaultVarRemoteActionCompatParcelizer15.RatingCompat();
                }
            } else if (calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.LEFT || calculatescaledsizee7kxvpu == calculateScaledSizeE7KxVPU.RIGHT) {
                paintdefault paintdefaultVarRemoteActionCompatParcelizer16 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu5);
                if (paintdefaultVarRemoteActionCompatParcelizer16.MediaSessionCompatQueueItem != paintdefaultVarRemoteActionCompatParcelizer10) {
                    paintdefaultVarRemoteActionCompatParcelizer16.RatingCompat();
                }
                paintdefault paintdefaultVar2 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu).read();
                paintdefault paintdefaultVarRemoteActionCompatParcelizer17 = RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu14);
                if (paintdefaultVarRemoteActionCompatParcelizer17.IconCompatParcelizer()) {
                    paintdefaultVar2.RatingCompat();
                    paintdefaultVarRemoteActionCompatParcelizer17.RatingCompat();
                }
            }
            paintdefaultVarRemoteActionCompatParcelizer9.write(paintdefaultVarRemoteActionCompatParcelizer10, i);
        }
    }

    public final int MediaDescriptionCompat() {
        if (this.onMultiWindowModeChanged == 8) {
            return 0;
        }
        return this.addObserverForBackInvoker;
    }

    public final int MediaSessionCompatQueueItem() {
        if (this.onMultiWindowModeChanged == 8) {
            return 0;
        }
        return this.onPanelClosed;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0162  */
    /* JADX WARN: Code duplicated, block: B:103:0x019e  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x020a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x036b  */
    /* JADX WARN: Code duplicated, block: B:225:0x036f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0371 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x0382  */
    /* JADX WARN: Code duplicated, block: B:233:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:236:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:244:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:252:0x0406  */
    /* JADX WARN: Code duplicated, block: B:254:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x041e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0424  */
    /* JADX WARN: Code duplicated, block: B:266:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x042c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x0435  */
    /* JADX WARN: Code duplicated, block: B:276:0x0439  */
    /* JADX WARN: Code duplicated, block: B:279:0x043f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0443  */
    /* JADX WARN: Code duplicated, block: B:283:0x0447  */
    /* JADX WARN: Code duplicated, block: B:284:0x0449  */
    /* JADX WARN: Code duplicated, block: B:288:0x0452  */
    /* JADX WARN: Code duplicated, block: B:290:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x0471  */
    /* JADX WARN: Code duplicated, block: B:298:0x0476  */
    /* JADX WARN: Code duplicated, block: B:299:0x047b  */
    /* JADX WARN: Code duplicated, block: B:301:0x047e  */
    /* JADX WARN: Code duplicated, block: B:303:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x049e  */
    /* JADX WARN: Code duplicated, block: B:317:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:325:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:327:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0112  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x013b  */
    /* JADX WARN: Code duplicated, block: B:94:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0144  */
    public final void serializer(DrawWithContentElement drawWithContentElement, boolean z, boolean z2, boolean z3, boolean z4, setBlockui setblockui, setBlockui setblockui2, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk, boolean z5, paintdefault paintdefaultVar, paintdefault paintdefaultVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        int i9;
        int iMin;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        boolean z15;
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu;
        calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu2;
        setBlockui setblockuiWrite;
        setBlockui setblockuiWrite2;
        char c;
        char c2;
        paintdefault paintdefaultVar3;
        setBlockui setblockui3;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i12;
        int i13;
        boolean z21;
        boolean z22;
        setBlockui setblockui4;
        boolean z23;
        int i14;
        boolean z24;
        boolean z25;
        setBlockui setblockui5;
        getUseIntrinsicSize getuseintrinsicsize;
        int iMax;
        int i15;
        int iSerializer;
        int iMin2;
        int i16;
        HashSet hashSet;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z26;
        int i29;
        int i30;
        int i31 = i7;
        int i32 = i8;
        setBlockui setblockuiWrite3 = drawWithContentElement.write(paintdefaultVar);
        setBlockui setblockuiWrite4 = drawWithContentElement.write(paintdefaultVar2);
        setBlockui setblockuiWrite5 = drawWithContentElement.write(paintdefaultVar.MediaSessionCompatQueueItem);
        setBlockui setblockuiWrite6 = drawWithContentElement.write(paintdefaultVar2.MediaSessionCompatQueueItem);
        boolean zIconCompatParcelizer = paintdefaultVar.IconCompatParcelizer();
        boolean zIconCompatParcelizer2 = paintdefaultVar2.IconCompatParcelizer();
        boolean zIconCompatParcelizer3 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.IconCompatParcelizer();
        int i33 = zIconCompatParcelizer2 ? (zIconCompatParcelizer ? 1 : 0) + 1 : zIconCompatParcelizer ? 1 : 0;
        if (zIconCompatParcelizer3) {
            i33++;
        }
        int i34 = i33;
        int i35 = z6 ? 3 : i5;
        int iOrdinal = hasspecifiedandfiniteheightuvyycjk.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal == 2) {
            z12 = i35 != 4;
            i9 = this.onPreparePanel;
            if (i9 != -1 && z) {
                this.onPreparePanel = -1;
                i2 = i9;
                z12 = false;
            }
            iMin = this.ensureViewModelStore;
            if (iMin != -1 || z) {
                iMin = i2;
            } else {
                this.ensureViewModelStore = -1;
                z12 = false;
            }
            z13 = z12;
            if (this.onMultiWindowModeChanged == 8) {
                z14 = false;
                iMin = 0;
            } else {
                z14 = z13;
            }
            if (!z11) {
                if (zIconCompatParcelizer && !zIconCompatParcelizer2 && !zIconCompatParcelizer3) {
                    drawWithContentElement.read(setblockuiWrite3, i);
                } else if (zIconCompatParcelizer && !zIconCompatParcelizer2) {
                    i10 = 8;
                    drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), 8);
                }
                i10 = 8;
            } else {
                i10 = 8;
            }
            if (!z14) {
                if (i34 == 2 && !z6 && (i35 == 1 || i35 == 0)) {
                    int iMax2 = Math.max(i31, iMin);
                    if (i32 > 0) {
                        iMax2 = Math.min(i32, iMax2);
                    }
                    drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMax2, 8);
                    z4 = z4;
                    i34 = i34 == true ? 1 : 0;
                    z15 = false;
                    i11 = i31;
                } else {
                    if (i31 == -2) {
                        i31 = iMin;
                    }
                    if (i32 == -2) {
                        i32 = iMin;
                    }
                    if (iMin > 0 && i35 != 1) {
                        iMin = 0;
                    }
                    if (i31 > 0) {
                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, i31, 8);
                        iMin = Math.max(iMin, i31);
                    }
                    if (i32 > 0) {
                        if (z2 || i35 != 1) {
                            drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i32, 8);
                        }
                        iMin = Math.min(iMin, i32);
                    }
                    if (i35 == 1) {
                        if (z2) {
                            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                        } else if (z8) {
                            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                            drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                        } else {
                            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                            drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                        }
                    } else if (i35 == 2) {
                        calculatescaledsizee7kxvpu = paintdefaultVar.MediaBrowserCompatMediaItem;
                        calculatescaledsizee7kxvpu2 = calculateScaledSizeE7KxVPU.TOP;
                        if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu2 && calculatescaledsizee7kxvpu != calculateScaledSizeE7KxVPU.BOTTOM) {
                            setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT));
                            setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT));
                        } else {
                            setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2));
                            setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM));
                        }
                        drawWithContent drawwithcontentSerializer = drawWithContentElement.serializer();
                        drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite4, -1.0f);
                        drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite3, 1.0f);
                        drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite2, f2);
                        drawwithcontentSerializer.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite, -f2);
                        drawWithContentElement.write(drawwithcontentSerializer);
                        if (z2) {
                            z14 = false;
                        }
                        i11 = i31;
                        z15 = z14;
                    } else {
                        i34 = i34 == true ? 1 : 0;
                        i11 = i31;
                        z15 = z14;
                        z4 = true;
                    }
                }
                if (z11) {
                    c = 1;
                    c2 = 2;
                } else {
                    if (z8) {
                        if (!zIconCompatParcelizer || zIconCompatParcelizer2 || zIconCompatParcelizer3) {
                            if (zIconCompatParcelizer || zIconCompatParcelizer2) {
                                if (zIconCompatParcelizer && zIconCompatParcelizer2) {
                                    drawWithContentElement.serializer(setblockuiWrite4, setblockui3, -paintdefaultVar2.serializer(), 8);
                                    if (z2) {
                                        setblockui3 = setblockuiWrite6;
                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, 0, 5);
                                        paintdefaultVar2 = paintdefaultVar2;
                                        i15 = 5;
                                        setblockui5 = setblockui3;
                                        setblockuiWrite4 = setblockuiWrite4;
                                        z4 = z4;
                                    }
                                    z24 = z2;
                                    i30 = i15;
                                } else {
                                    setblockui3 = setblockuiWrite6;
                                    if (!zIconCompatParcelizer && zIconCompatParcelizer2) {
                                        setAlignment setalignment = paintdefaultVar.MediaSessionCompatQueueItem.RatingCompat;
                                        paintdefaultVar2 = paintdefaultVar2;
                                        setAlignment setalignment2 = paintdefaultVar2.MediaSessionCompatQueueItem.RatingCompat;
                                        getUseIntrinsicSize getuseintrinsicsize2 = this.getViewModelStore;
                                        int i36 = 6;
                                        if (!z15) {
                                            z16 = true;
                                            if (setblockuiWrite5.read && setblockui3.read) {
                                                drawWithContentElement.IconCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), f, setblockui3, setblockuiWrite4, paintdefaultVar2.serializer(), 8);
                                                if (z2 && z4) {
                                                    int iSerializer2 = paintdefaultVar2.MediaSessionCompatQueueItem != null ? paintdefaultVar2.serializer() : 0;
                                                    if (setblockui3 != setblockui2) {
                                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockui2, setblockuiWrite4, iSerializer2, 5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i35 == 0) {
                                                if (i32 != 0 || i11 != 0) {
                                                    i29 = 5;
                                                    i27 = 5;
                                                    z26 = false;
                                                    z20 = true;
                                                    z19 = true;
                                                } else if (setblockuiWrite5.read && setblockui3.read) {
                                                    drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), 8);
                                                    drawWithContentElement.serializer(setblockuiWrite4, setblockui3, -paintdefaultVar2.serializer(), 8);
                                                    return;
                                                } else {
                                                    i29 = 8;
                                                    i27 = 8;
                                                    z26 = true;
                                                    z20 = false;
                                                    z19 = false;
                                                }
                                                if ((setalignment instanceof PainterModifierKt) || (setalignment2 instanceof PainterModifierKt)) {
                                                    i12 = i27;
                                                    z21 = z26;
                                                    z16 = true;
                                                    i13 = 4;
                                                } else {
                                                    i28 = i29;
                                                }
                                                i35 = i35;
                                                setblockui2 = setblockui2;
                                                if (z19 || setblockuiWrite5 != setblockui3 || setalignment == getuseintrinsicsize2) {
                                                    z22 = z16;
                                                } else {
                                                    z19 = false;
                                                    z22 = false;
                                                }
                                                if (z20) {
                                                    if (z15 && !z7 && !z9 && setblockuiWrite5 == setblockui && setblockui3 == setblockui2) {
                                                        z24 = false;
                                                        i18 = 8;
                                                        z22 = false;
                                                        i17 = 8;
                                                    } else {
                                                        z24 = z2;
                                                        i17 = i36;
                                                        i18 = i12;
                                                    }
                                                    i14 = 4;
                                                    z23 = true;
                                                    setblockui4 = setblockuiWrite4;
                                                    drawWithContentElement.IconCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), f, setblockui3, setblockuiWrite4, paintdefaultVar2.serializer(), i17);
                                                    i12 = i18;
                                                } else {
                                                    setblockui4 = setblockuiWrite4;
                                                    z23 = z16;
                                                    i14 = 4;
                                                    z24 = z2;
                                                }
                                                z25 = z22;
                                                if (this.onMultiWindowModeChanged != 8 && ((hashSet = paintdefaultVar2.write) == null || hashSet.size() <= 0)) {
                                                    return;
                                                }
                                                setblockui5 = setblockui3;
                                                if (z19) {
                                                    if (z24 && setblockuiWrite5 != setblockui5 && !z15 && ((setalignment instanceof PainterModifierKt) || (setalignment2 instanceof PainterModifierKt))) {
                                                        i12 = 6;
                                                    }
                                                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), i12);
                                                    setblockuiWrite4 = setblockui4;
                                                    drawWithContentElement.write(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), i12);
                                                } else {
                                                    setblockuiWrite4 = setblockui4;
                                                }
                                                if (z24 || !z10 || (setalignment instanceof PainterModifierKt) || (setalignment2 instanceof PainterModifierKt)) {
                                                    getuseintrinsicsize = getuseintrinsicsize2;
                                                } else {
                                                    getuseintrinsicsize = getuseintrinsicsize2;
                                                    if (setalignment2 != getuseintrinsicsize) {
                                                        i12 = 6;
                                                        iMax = 6;
                                                        z25 = z23;
                                                    }
                                                    if (z25) {
                                                        if (z21 && (!z9 || z3)) {
                                                            if (setalignment != getuseintrinsicsize && setalignment2 != getuseintrinsicsize) {
                                                                i36 = iMax;
                                                            }
                                                            if ((setalignment instanceof setSizeToIntrinsics) || (setalignment2 instanceof setSizeToIntrinsics)) {
                                                                i36 = 5;
                                                            }
                                                            if ((setalignment instanceof PainterModifierKt) || (setalignment2 instanceof PainterModifierKt)) {
                                                                i36 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i36;
                                                            }
                                                            iMax = Math.max(i16, iMax);
                                                        }
                                                        iMin2 = iMax;
                                                        if (z24) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6 && !z9 && (setalignment == getuseintrinsicsize || setalignment2 == getuseintrinsicsize)) {
                                                                iMin2 = i14;
                                                            }
                                                        }
                                                        drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), iMin2);
                                                        drawWithContentElement.serializer(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), iMin2);
                                                    }
                                                    if (z24) {
                                                        if (setblockui == setblockuiWrite5) {
                                                            iSerializer = paintdefaultVar.serializer();
                                                        } else {
                                                            iSerializer = 0;
                                                        }
                                                        if (setblockuiWrite5 != setblockui) {
                                                            drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, iSerializer, 5);
                                                        }
                                                    }
                                                    if (z24 || !z15 || i3 != 0 || i11 != 0) {
                                                        i15 = 5;
                                                    } else if (z15 && i35 == 3) {
                                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, 0, 8);
                                                        i15 = 5;
                                                    } else {
                                                        i15 = 5;
                                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, 0, 5);
                                                    }
                                                }
                                                iMax = i13;
                                                if (z25) {
                                                    if (z21) {
                                                        if (setalignment != getuseintrinsicsize) {
                                                            i36 = iMax;
                                                        }
                                                        if (setalignment instanceof setSizeToIntrinsics) {
                                                            i36 = 5;
                                                        } else {
                                                            i36 = 5;
                                                        }
                                                        if (setalignment instanceof PainterModifierKt) {
                                                            i36 = 5;
                                                        } else {
                                                            i36 = 5;
                                                        }
                                                        if (z9) {
                                                            i16 = 5;
                                                        } else {
                                                            i16 = i36;
                                                        }
                                                        iMax = Math.max(i16, iMax);
                                                    }
                                                    iMin2 = iMax;
                                                    if (z24) {
                                                        iMin2 = Math.min(i12, iMin2);
                                                        if (z6) {
                                                            iMin2 = i14;
                                                        }
                                                    }
                                                    drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), iMin2);
                                                    drawWithContentElement.serializer(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), iMin2);
                                                }
                                                if (z24) {
                                                    if (setblockui == setblockuiWrite5) {
                                                        iSerializer = paintdefaultVar.serializer();
                                                    } else {
                                                        iSerializer = 0;
                                                    }
                                                    if (setblockuiWrite5 != setblockui) {
                                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, iSerializer, 5);
                                                    }
                                                }
                                                if (z24) {
                                                    i15 = 5;
                                                } else {
                                                    i15 = 5;
                                                }
                                            } else {
                                                if (i35 == 2) {
                                                    if ((setalignment instanceof PainterModifierKt) || (setalignment2 instanceof PainterModifierKt)) {
                                                        i25 = 5;
                                                    } else {
                                                        i25 = 5;
                                                        i26 = 5;
                                                    }
                                                    i27 = i25;
                                                    i28 = i26;
                                                    z26 = false;
                                                    z20 = true;
                                                    z19 = true;
                                                } else {
                                                    if (i35 == 1) {
                                                        i25 = 8;
                                                    } else if (i35 == 3) {
                                                        i35 = i35;
                                                        if (this.getLifecycle == -1) {
                                                            if (z9) {
                                                                i24 = z2 ? 5 : 4;
                                                            } else {
                                                                i24 = 8;
                                                            }
                                                            i23 = i24;
                                                            i12 = 8;
                                                            z16 = true;
                                                        } else {
                                                            if (z6) {
                                                                if (i6 != 2) {
                                                                    z16 = true;
                                                                    if (i6 != 1) {
                                                                        i22 = 5;
                                                                        i21 = 8;
                                                                    }
                                                                } else {
                                                                    z16 = true;
                                                                }
                                                                i22 = 4;
                                                                i21 = 5;
                                                            } else {
                                                                z16 = true;
                                                                if (i32 > 0) {
                                                                    i23 = 6;
                                                                    i12 = 5;
                                                                } else if (i32 != 0 || i11 != 0) {
                                                                    i19 = 6;
                                                                    i12 = 5;
                                                                    i20 = 4;
                                                                } else if (z9) {
                                                                    i21 = (setalignment == getuseintrinsicsize2 || setalignment2 == getuseintrinsicsize2) ? 5 : 4;
                                                                    i22 = 4;
                                                                } else {
                                                                    i19 = 6;
                                                                    i12 = 5;
                                                                    i20 = 8;
                                                                }
                                                                z21 = z16;
                                                                z20 = z21;
                                                                z19 = z20;
                                                                i36 = i19;
                                                                i13 = i20;
                                                            }
                                                            i13 = i22;
                                                            i12 = i21;
                                                            z21 = z16;
                                                            z20 = z21;
                                                            z19 = z20;
                                                            i36 = 6;
                                                        }
                                                        i19 = i23;
                                                        i20 = 5;
                                                        z21 = z16;
                                                        z20 = z21;
                                                        z19 = z20;
                                                        i36 = i19;
                                                        i13 = i20;
                                                    } else {
                                                        z16 = true;
                                                        z17 = false;
                                                        z18 = false;
                                                    }
                                                    setblockui2 = setblockui2;
                                                    if (z19) {
                                                        z22 = z16;
                                                    } else {
                                                        z22 = z16;
                                                    }
                                                    if (z20) {
                                                        if (z15) {
                                                            z24 = z2;
                                                            i17 = i36;
                                                            i18 = i12;
                                                        } else {
                                                            z24 = z2;
                                                            i17 = i36;
                                                            i18 = i12;
                                                        }
                                                        i14 = 4;
                                                        z23 = true;
                                                        setblockui4 = setblockuiWrite4;
                                                        drawWithContentElement.IconCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), f, setblockui3, setblockuiWrite4, paintdefaultVar2.serializer(), i17);
                                                        i12 = i18;
                                                    } else {
                                                        setblockui4 = setblockuiWrite4;
                                                        z23 = z16;
                                                        i14 = 4;
                                                        z24 = z2;
                                                    }
                                                    z25 = z22;
                                                    if (this.onMultiWindowModeChanged != 8) {
                                                    }
                                                    setblockui5 = setblockui3;
                                                    if (z19) {
                                                        if (z24) {
                                                            i12 = 6;
                                                        }
                                                        drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), i12);
                                                        setblockuiWrite4 = setblockui4;
                                                        drawWithContentElement.write(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), i12);
                                                    } else {
                                                        setblockuiWrite4 = setblockui4;
                                                    }
                                                    if (z24) {
                                                        getuseintrinsicsize = getuseintrinsicsize2;
                                                        iMax = i13;
                                                    } else {
                                                        getuseintrinsicsize = getuseintrinsicsize2;
                                                        iMax = i13;
                                                    }
                                                    if (z25) {
                                                        if (z21) {
                                                            if (setalignment != getuseintrinsicsize) {
                                                                i36 = iMax;
                                                            }
                                                            if (setalignment instanceof setSizeToIntrinsics) {
                                                                i36 = 5;
                                                            } else {
                                                                i36 = 5;
                                                            }
                                                            if (setalignment instanceof PainterModifierKt) {
                                                                i36 = 5;
                                                            } else {
                                                                i36 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i36;
                                                            }
                                                            iMax = Math.max(i16, iMax);
                                                        }
                                                        iMin2 = iMax;
                                                        if (z24) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6) {
                                                                iMin2 = i14;
                                                            }
                                                        }
                                                        drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), iMin2);
                                                        drawWithContentElement.serializer(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), iMin2);
                                                    }
                                                    if (z24) {
                                                        if (setblockui == setblockuiWrite5) {
                                                            iSerializer = paintdefaultVar.serializer();
                                                        } else {
                                                            iSerializer = 0;
                                                        }
                                                        if (setblockuiWrite5 != setblockui) {
                                                            drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, iSerializer, 5);
                                                        }
                                                    }
                                                    if (z24) {
                                                        i15 = 5;
                                                    } else {
                                                        i15 = 5;
                                                    }
                                                }
                                                i26 = 4;
                                                i27 = i25;
                                                i28 = i26;
                                                z26 = false;
                                                z20 = true;
                                                z19 = true;
                                            }
                                            z21 = z26;
                                            z16 = true;
                                            i13 = i28;
                                            i12 = i27;
                                            i35 = i35;
                                            setblockui2 = setblockui2;
                                            if (z19) {
                                                z22 = z16;
                                            } else {
                                                z22 = z16;
                                            }
                                            if (z20) {
                                                if (z15) {
                                                    z24 = z2;
                                                    i17 = i36;
                                                    i18 = i12;
                                                } else {
                                                    z24 = z2;
                                                    i17 = i36;
                                                    i18 = i12;
                                                }
                                                i14 = 4;
                                                z23 = true;
                                                setblockui4 = setblockuiWrite4;
                                                drawWithContentElement.IconCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), f, setblockui3, setblockuiWrite4, paintdefaultVar2.serializer(), i17);
                                                i12 = i18;
                                            } else {
                                                setblockui4 = setblockuiWrite4;
                                                z23 = z16;
                                                i14 = 4;
                                                z24 = z2;
                                            }
                                            z25 = z22;
                                            if (this.onMultiWindowModeChanged != 8) {
                                            }
                                            setblockui5 = setblockui3;
                                            if (z19) {
                                                if (z24) {
                                                    i12 = 6;
                                                }
                                                drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), i12);
                                                setblockuiWrite4 = setblockui4;
                                                drawWithContentElement.write(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), i12);
                                            } else {
                                                setblockuiWrite4 = setblockui4;
                                            }
                                            if (z24) {
                                                getuseintrinsicsize = getuseintrinsicsize2;
                                                iMax = i13;
                                            } else {
                                                getuseintrinsicsize = getuseintrinsicsize2;
                                                iMax = i13;
                                            }
                                            if (z25) {
                                                if (z21) {
                                                    if (setalignment != getuseintrinsicsize) {
                                                        i36 = iMax;
                                                    }
                                                    if (setalignment instanceof setSizeToIntrinsics) {
                                                        i36 = 5;
                                                    } else {
                                                        i36 = 5;
                                                    }
                                                    if (setalignment instanceof PainterModifierKt) {
                                                        i36 = 5;
                                                    } else {
                                                        i36 = 5;
                                                    }
                                                    if (z9) {
                                                        i16 = 5;
                                                    } else {
                                                        i16 = i36;
                                                    }
                                                    iMax = Math.max(i16, iMax);
                                                }
                                                iMin2 = iMax;
                                                if (z24) {
                                                    iMin2 = Math.min(i12, iMin2);
                                                    if (z6) {
                                                        iMin2 = i14;
                                                    }
                                                }
                                                drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), iMin2);
                                                drawWithContentElement.serializer(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), iMin2);
                                            }
                                            if (z24) {
                                                if (setblockui == setblockuiWrite5) {
                                                    iSerializer = paintdefaultVar.serializer();
                                                } else {
                                                    iSerializer = 0;
                                                }
                                                if (setblockuiWrite5 != setblockui) {
                                                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, iSerializer, 5);
                                                }
                                            }
                                            if (z24) {
                                                i15 = 5;
                                            } else {
                                                i15 = 5;
                                            }
                                        }
                                        z19 = z17;
                                        i36 = 6;
                                        z20 = z18;
                                        i12 = 5;
                                        i13 = 4;
                                        z21 = false;
                                        if (z19) {
                                            z22 = z16;
                                        } else {
                                            z22 = z16;
                                        }
                                        if (z20) {
                                            if (z15) {
                                                z24 = z2;
                                                i17 = i36;
                                                i18 = i12;
                                            } else {
                                                z24 = z2;
                                                i17 = i36;
                                                i18 = i12;
                                            }
                                            i14 = 4;
                                            z23 = true;
                                            setblockui4 = setblockuiWrite4;
                                            drawWithContentElement.IconCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), f, setblockui3, setblockuiWrite4, paintdefaultVar2.serializer(), i17);
                                            i12 = i18;
                                        } else {
                                            setblockui4 = setblockuiWrite4;
                                            z23 = z16;
                                            i14 = 4;
                                            z24 = z2;
                                        }
                                        z25 = z22;
                                        if (this.onMultiWindowModeChanged != 8) {
                                        }
                                        setblockui5 = setblockui3;
                                        if (z19) {
                                            if (z24) {
                                                i12 = 6;
                                            }
                                            drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), i12);
                                            setblockuiWrite4 = setblockui4;
                                            drawWithContentElement.write(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), i12);
                                        } else {
                                            setblockuiWrite4 = setblockui4;
                                        }
                                        if (z24) {
                                            getuseintrinsicsize = getuseintrinsicsize2;
                                            iMax = i13;
                                        } else {
                                            getuseintrinsicsize = getuseintrinsicsize2;
                                            iMax = i13;
                                        }
                                        if (z25) {
                                            if (z21) {
                                                if (setalignment != getuseintrinsicsize) {
                                                    i36 = iMax;
                                                }
                                                if (setalignment instanceof setSizeToIntrinsics) {
                                                    i36 = 5;
                                                } else {
                                                    i36 = 5;
                                                }
                                                if (setalignment instanceof PainterModifierKt) {
                                                    i36 = 5;
                                                } else {
                                                    i36 = 5;
                                                }
                                                if (z9) {
                                                    i16 = 5;
                                                } else {
                                                    i16 = i36;
                                                }
                                                iMax = Math.max(i16, iMax);
                                            }
                                            iMin2 = iMax;
                                            if (z24) {
                                                iMin2 = Math.min(i12, iMin2);
                                                if (z6) {
                                                    iMin2 = i14;
                                                }
                                            }
                                            drawWithContentElement.serializer(setblockuiWrite3, setblockuiWrite5, paintdefaultVar.serializer(), iMin2);
                                            drawWithContentElement.serializer(setblockuiWrite4, setblockui5, -paintdefaultVar2.serializer(), iMin2);
                                        }
                                        if (z24) {
                                            if (setblockui == setblockuiWrite5) {
                                                iSerializer = paintdefaultVar.serializer();
                                            } else {
                                                iSerializer = 0;
                                            }
                                            if (setblockuiWrite5 != setblockui) {
                                                drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, iSerializer, 5);
                                            }
                                        }
                                        if (z24) {
                                            i15 = 5;
                                        } else {
                                            i15 = 5;
                                        }
                                    }
                                    i30 = i15;
                                }
                                setblockui3 = setblockuiWrite6;
                                setblockui5 = setblockui3;
                            } else {
                                z24 = z2;
                                paintdefaultVar2 = paintdefaultVar2;
                                setblockuiWrite4 = setblockuiWrite4;
                                z4 = z4;
                                i30 = (z2 && (paintdefaultVar.MediaSessionCompatQueueItem.RatingCompat instanceof PainterModifierKt)) ? 8 : 5;
                                setblockui5 = setblockuiWrite6;
                            }
                            if (z24 || !z4) {
                                return;
                            }
                            int iSerializer3 = paintdefaultVar2.MediaSessionCompatQueueItem != null ? paintdefaultVar2.serializer() : 0;
                            if (setblockui5 != setblockui2) {
                                drawWithContentElement.RemoteActionCompatParcelizer(setblockui2, setblockuiWrite4, iSerializer3, i30);
                                return;
                            }
                            return;
                        }
                        setblockui5 = setblockuiWrite6;
                        i15 = 5;
                        z24 = z2;
                        i30 = i15;
                        if (z24) {
                            return;
                        } else {
                            return;
                        }
                    }
                    c2 = 2;
                    c = 1;
                }
                if (i34 >= c2 && z2 && z4) {
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite3, setblockui, 0, 8);
                    paintdefault paintdefaultVar4 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    char c3 = (z || paintdefaultVar4.MediaSessionCompatQueueItem == null) ? c : (char) 0;
                    if (!z && (paintdefaultVar3 = paintdefaultVar4.MediaSessionCompatQueueItem) != null) {
                        setAlignment setalignment3 = paintdefaultVar3.RatingCompat;
                        if (setalignment3.createFullyDrawnExecutor == 0.0f) {
                            return;
                        }
                        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment3.addOnNewIntentListener;
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjkArr[0];
                        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
                        if (hasspecifiedandfiniteheightuvyycjk2 != hasspecifiedandfiniteheightuvyycjk3 || hasspecifiedandfiniteheightuvyycjkArr[c] != hasspecifiedandfiniteheightuvyycjk3) {
                            return;
                        }
                    } else if (c3 == 0) {
                        return;
                    }
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockui2, setblockuiWrite4, 0, 8);
                    return;
                }
                return;
            }
            if (z5) {
                drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, 0, 3);
                if (i3 > 0) {
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i4, 8);
                }
            } else {
                drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, i10);
            }
            i11 = i31;
            z15 = z14;
            if (z11) {
                c = 1;
                c2 = 2;
            } else {
                if (z8) {
                    if (zIconCompatParcelizer) {
                        if (zIconCompatParcelizer) {
                        }
                        if (zIconCompatParcelizer) {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        } else {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        }
                        i30 = i15;
                    } else {
                        if (zIconCompatParcelizer) {
                        }
                        if (zIconCompatParcelizer) {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        } else {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        }
                        i30 = i15;
                    }
                    if (z24) {
                        return;
                    } else {
                        return;
                    }
                }
                c2 = 2;
                c = 1;
            }
            if (i34 >= c2) {
            }
        }
        i9 = this.onPreparePanel;
        if (i9 != -1) {
            this.onPreparePanel = -1;
            i2 = i9;
            z12 = false;
        }
        iMin = this.ensureViewModelStore;
        if (iMin != -1) {
            iMin = i2;
        } else {
            iMin = i2;
        }
        z13 = z12;
        if (this.onMultiWindowModeChanged == 8) {
            z14 = false;
            iMin = 0;
        } else {
            z14 = z13;
        }
        if (!z11) {
            i10 = 8;
        } else if (zIconCompatParcelizer) {
            if (zIconCompatParcelizer) {
                i10 = 8;
            } else {
                i10 = 8;
            }
        } else if (zIconCompatParcelizer) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (!z14) {
            if (i34 == 2) {
                if (i31 == -2) {
                    i31 = iMin;
                }
                if (i32 == -2) {
                    i32 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i31 > 0) {
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, i31, 8);
                    iMin = Math.max(iMin, i31);
                }
                if (i32 > 0) {
                    if (z2) {
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i32, 8);
                    } else {
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i32, 8);
                    }
                    iMin = Math.min(iMin, i32);
                }
                if (i35 == 1) {
                    if (z2) {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    } else if (z8) {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    } else {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    }
                } else if (i35 == 2) {
                    calculatescaledsizee7kxvpu = paintdefaultVar.MediaBrowserCompatMediaItem;
                    calculatescaledsizee7kxvpu2 = calculateScaledSizeE7KxVPU.TOP;
                    if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu2) {
                        setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2));
                        setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM));
                    } else {
                        setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2));
                        setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM));
                    }
                    drawWithContent drawwithcontentSerializer2 = drawWithContentElement.serializer();
                    drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite4, -1.0f);
                    drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite3, 1.0f);
                    drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite2, f2);
                    drawwithcontentSerializer2.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite, -f2);
                    drawWithContentElement.write(drawwithcontentSerializer2);
                    if (z2) {
                        z14 = false;
                    }
                    i11 = i31;
                    z15 = z14;
                } else {
                    i34 = i34 == true ? 1 : 0;
                    i11 = i31;
                    z15 = z14;
                    z4 = true;
                }
            } else {
                if (i31 == -2) {
                    i31 = iMin;
                }
                if (i32 == -2) {
                    i32 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i31 > 0) {
                    drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, i31, 8);
                    iMin = Math.max(iMin, i31);
                }
                if (i32 > 0) {
                    if (z2) {
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i32, 8);
                    } else {
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i32, 8);
                    }
                    iMin = Math.min(iMin, i32);
                }
                if (i35 == 1) {
                    if (z2) {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    } else if (z8) {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    } else {
                        drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, 5);
                        drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, iMin, 8);
                    }
                } else if (i35 == 2) {
                    calculatescaledsizee7kxvpu = paintdefaultVar.MediaBrowserCompatMediaItem;
                    calculatescaledsizee7kxvpu2 = calculateScaledSizeE7KxVPU.TOP;
                    if (calculatescaledsizee7kxvpu == calculatescaledsizee7kxvpu2) {
                        setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2));
                        setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM));
                    } else {
                        setblockuiWrite = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu2));
                        setblockuiWrite2 = drawWithContentElement.write(this.getViewModelStore.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM));
                    }
                    drawWithContent drawwithcontentSerializer3 = drawWithContentElement.serializer();
                    drawwithcontentSerializer3.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite4, -1.0f);
                    drawwithcontentSerializer3.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite3, 1.0f);
                    drawwithcontentSerializer3.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite2, f2);
                    drawwithcontentSerializer3.RemoteActionCompatParcelizer.IconCompatParcelizer(setblockuiWrite, -f2);
                    drawWithContentElement.write(drawwithcontentSerializer3);
                    if (z2) {
                        z14 = false;
                    }
                    i11 = i31;
                    z15 = z14;
                } else {
                    i34 = i34 == true ? 1 : 0;
                    i11 = i31;
                    z15 = z14;
                    z4 = true;
                }
            }
            if (z11) {
                c = 1;
                c2 = 2;
            } else {
                if (z8) {
                    if (zIconCompatParcelizer) {
                        if (zIconCompatParcelizer) {
                        }
                        if (zIconCompatParcelizer) {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        } else {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        }
                        i30 = i15;
                    } else {
                        if (zIconCompatParcelizer) {
                        }
                        if (zIconCompatParcelizer) {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        } else {
                            setblockui3 = setblockuiWrite6;
                            if (!zIconCompatParcelizer) {
                            }
                            setblockui3 = setblockuiWrite6;
                            setblockui5 = setblockui3;
                            i15 = 5;
                            z24 = z2;
                        }
                        i30 = i15;
                    }
                    if (z24) {
                        return;
                    } else {
                        return;
                    }
                }
                c2 = 2;
                c = 1;
            }
            if (i34 >= c2) {
            }
        }
        if (z5) {
            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, 0, 3);
            if (i3 > 0) {
                drawWithContentElement.RemoteActionCompatParcelizer(setblockuiWrite4, setblockuiWrite3, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                drawWithContentElement.write(setblockuiWrite4, setblockuiWrite3, i4, 8);
            }
        } else {
            drawWithContentElement.serializer(setblockuiWrite4, setblockuiWrite3, iMin, i10);
        }
        i11 = i31;
        z15 = z14;
        if (z11) {
            c = 1;
            c2 = 2;
        } else {
            if (z8) {
                if (zIconCompatParcelizer) {
                    if (zIconCompatParcelizer) {
                    }
                    if (zIconCompatParcelizer) {
                        setblockui3 = setblockuiWrite6;
                        if (!zIconCompatParcelizer) {
                        }
                        setblockui3 = setblockuiWrite6;
                        setblockui5 = setblockui3;
                        i15 = 5;
                        z24 = z2;
                    } else {
                        setblockui3 = setblockuiWrite6;
                        if (!zIconCompatParcelizer) {
                        }
                        setblockui3 = setblockuiWrite6;
                        setblockui5 = setblockui3;
                        i15 = 5;
                        z24 = z2;
                    }
                    i30 = i15;
                } else {
                    if (zIconCompatParcelizer) {
                    }
                    if (zIconCompatParcelizer) {
                        setblockui3 = setblockuiWrite6;
                        if (!zIconCompatParcelizer) {
                        }
                        setblockui3 = setblockuiWrite6;
                        setblockui5 = setblockui3;
                        i15 = 5;
                        z24 = z2;
                    } else {
                        setblockui3 = setblockuiWrite6;
                        if (!zIconCompatParcelizer) {
                        }
                        setblockui3 = setblockuiWrite6;
                        setblockui5 = setblockui3;
                        i15 = 5;
                        z24 = z2;
                    }
                    i30 = i15;
                }
                if (z24) {
                    return;
                } else {
                    return;
                }
            }
            c2 = 2;
            c = 1;
        }
        if (i34 >= c2) {
        }
    }

    public static void IconCompatParcelizer(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public setAlignment(int i, int i2) {
        this.onUserLeaveHint = false;
        this.getOnBackPressedInput = null;
        this.onCreatePanelMenu = null;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new boolean[]{true, true};
        this.getDefaultViewModelProviderFactory = true;
        this.onPreparePanel = -1;
        this.ensureViewModelStore = -1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new toSpkPz2Gy4(this);
        this.getOnBackPressedDispatcher = false;
        this.onConfigurationChanged = false;
        this.fullyDrawnReporter_delegatelambda00 = false;
        this.onMenuItemSelected = false;
        this.getSavedStateRegistryControllerannotations = -1;
        this.onNewIntent = -1;
        this.onPictureInPictureUiStateChanged = 0;
        this.addOnConfigurationChangedListener = 0;
        this.addMenuProvider = 0;
        this.initializeViewTreeOwners = new int[2];
        this.addOnTrimMemoryListener = 0;
        this.addOnPictureInPictureUiStateChangedListener = 0;
        this.getLastCustomNonConfigurationInstance = 1.0f;
        this.enterPictureInPictureMode = 0;
        this.addOnPictureInPictureModeChangedListener = 0;
        this.addOnUserLeaveHintListener = 1.0f;
        this.getLifecycle = -1;
        this.getNavigationEventDispatcher = 1.0f;
        this.getActivityResultRegistry = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this._init_lambda1 = Float.NaN;
        this.addObserverForBackInvokerlambda0 = false;
        this.onBackPressedDispatcher_delegatelambda0 = false;
        this.onBackPressedInput_delegatelambda0 = 0;
        this.onBackPressedDispatcher_delegatelambda00 = 0;
        paintdefault paintdefaultVar = new paintdefault(this, calculateScaledSizeE7KxVPU.LEFT);
        this.onBackPressedDispatcher_delegatelambda010 = paintdefaultVar;
        paintdefault paintdefaultVar2 = new paintdefault(this, calculateScaledSizeE7KxVPU.TOP);
        this.onActivityResult = paintdefaultVar2;
        paintdefault paintdefaultVar3 = new paintdefault(this, calculateScaledSizeE7KxVPU.RIGHT);
        this.invalidateMenu = paintdefaultVar3;
        paintdefault paintdefaultVar4 = new paintdefault(this, calculateScaledSizeE7KxVPU.BOTTOM);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = paintdefaultVar4;
        paintdefault paintdefaultVar5 = new paintdefault(this, calculateScaledSizeE7KxVPU.BASELINE);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = paintdefaultVar5;
        this._init_lambda4 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER_X);
        this._init_lambda2 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER_Y);
        paintdefault paintdefaultVar6 = new paintdefault(this, calculateScaledSizeE7KxVPU.CENTER);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = paintdefaultVar6;
        this.addOnMultiWindowModeChangedListener = new paintdefault[]{paintdefaultVar, paintdefaultVar3, paintdefaultVar2, paintdefaultVar4, paintdefaultVar5, paintdefaultVar6};
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new ArrayList();
        this.addContentView = new boolean[2];
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        this.addOnNewIntentListener = new hasSpecifiedAndFiniteHeightuvyYCjk[]{hasspecifiedandfiniteheightuvyycjk, hasspecifiedandfiniteheightuvyycjk};
        this.getViewModelStore = null;
        this.createFullyDrawnExecutor = 0.0f;
        this.defaultViewModelProviderFactory_delegatelambda0 = -1;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
        this.fullyDrawnReporter_delegatelambda0 = 0.5f;
        this.onBackPressed = 0.5f;
        this.onMultiWindowModeChanged = 0;
        this.accessensureViewModelStore = null;
        this.menuHostHelperlambda0 = 0;
        this.onCreate = 0;
        this.onRequestPermissionsResult = new float[]{-1.0f, -1.0f};
        this.addOnContextAvailableListener = new setAlignment[]{null, null};
        this.getSavedStateRegistry = new setAlignment[]{null, null};
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1;
        this.onRetainCustomNonConfigurationInstance = -1;
        this.onPictureInPictureModeChanged = 0;
        this.onRetainNonConfigurationInstance = 0;
        this.onPanelClosed = i;
        this.addObserverForBackInvoker = i2;
        MediaBrowserCompatMediaItem();
    }

    public static void RemoteActionCompatParcelizer(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = hasspecifiedandfiniteheightuvyycjk.toString();
        if (!hasSpecifiedAndFiniteHeightuvyYCjk.FIXED.toString().equals(string)) {
            c8$$ExternalSyntheticOutline0.m(sb, "      behavior", " :   ", string, ",\n");
        }
        IconCompatParcelizer(i, 0, "      size", sb);
        IconCompatParcelizer(i2, 0, "      min", sb);
        IconCompatParcelizer(i3, Integer.MAX_VALUE, "      max", sb);
        IconCompatParcelizer(i4, 0, "      matchMin", sb);
        IconCompatParcelizer(i5, 0, "      matchDef", sb);
        write(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void write(StringBuilder sb, String str, paintdefault paintdefaultVar) {
        if (paintdefaultVar.MediaSessionCompatQueueItem == null) {
            return;
        }
        af$$ExternalSyntheticOutline0.m(sb, "    ", str, " : [ '");
        sb.append(paintdefaultVar.MediaSessionCompatQueueItem);
        sb.append("'");
        if (paintdefaultVar.RemoteActionCompatParcelizer != Integer.MIN_VALUE || paintdefaultVar.IconCompatParcelizer != 0) {
            sb.append(",");
            sb.append(paintdefaultVar.IconCompatParcelizer);
            if (paintdefaultVar.RemoteActionCompatParcelizer != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(paintdefaultVar.RemoteActionCompatParcelizer);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final void IconCompatParcelizer(paintdefault paintdefaultVar, paintdefault paintdefaultVar2, int i) {
        if (paintdefaultVar.RatingCompat == this) {
            write(paintdefaultVar.MediaBrowserCompatMediaItem, paintdefaultVar2.RatingCompat, paintdefaultVar2.MediaBrowserCompatMediaItem, i);
        }
    }
}
