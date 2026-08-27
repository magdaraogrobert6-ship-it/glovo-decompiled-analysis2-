package o;

import android.view.View;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onDestroyOptionsMenu {
    private static int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final onGetLayoutInflater ComponentActivity;
    public final androidx.compose.ui.platform.ComposeView IconCompatParcelizer;
    public final isResumed MediaBrowserCompatMediaItem;
    public final e9 MediaDescriptionCompat;
    public final androidx.compose.ui.platform.ComposeView MediaMetadataCompat;
    public final drawWithRotationAndOffsetubNVwUQ MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final onGetLayoutInflater MediaSessionCompatToken;
    public final androidx.fragment.app.FragmentContainerView ParcelableVolumeInfo;
    public final fullyDrawnReporter_delegatelambda00 PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final androidx.compose.ui.platform.ComposeView RatingCompat;
    public final onCreateContextMenu RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public final RoomDatabase$$ExternalSyntheticLambda2 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final transferSessionPackageI r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final HomeFragment.AnonymousClass1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final androidx.compose.ui.platform.ComposeView r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final androidx.constraintlayout.widget.ConstraintLayout read;
    public final androidx.compose.ui.platform.ComposeView serializer;
    public final BottomSheetBehavior write;

    /* JADX WARN: Type inference failed for: r1v5, types: [o.onGetLayoutInflater] */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.onGetLayoutInflater] */
    public onDestroyOptionsMenu(e9 e9Var, isResumed isresumed, transferSessionPackageI transfersessionpackagei, requireHost requirehost, RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, HomeFragment.AnonymousClass1 anonymousClass1) {
        e9Var.getClass();
        isresumed.getClass();
        transfersessionpackagei.getClass();
        requirehost.getClass();
        this.MediaDescriptionCompat = e9Var;
        this.MediaBrowserCompatMediaItem = isresumed;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = transfersessionpackagei;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = roomDatabase$$ExternalSyntheticLambda2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = anonymousClass1;
        this.ParcelableVolumeInfo = requirehost.MediaSessionCompatQueueItem;
        drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq = requirehost.write;
        this.MediaSessionCompatQueueItem = drawwithrotationandoffsetubnvwuq;
        setAllowEnterTransitionOverlap setallowentertransitionoverlap = requirehost.read;
        this.read = setallowentertransitionoverlap.read;
        this.MediaMetadataCompat = requirehost.RatingCompat;
        this.RatingCompat = requirehost.serializer;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = requirehost.ParcelableVolumeInfo;
        this.serializer = setallowentertransitionoverlap.IconCompatParcelizer;
        this.IconCompatParcelizer = setallowentertransitionoverlap.write;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(drawwithrotationandoffsetubnvwuq);
        bottomSheetBehaviorFrom.getClass();
        this.write = bottomSheetBehaviorFrom;
        this.PlaybackStateCompat = new fullyDrawnReporter_delegatelambda00(2, this);
        final int i = 0;
        this.MediaSessionCompatToken = new View.OnLayoutChangeListener(this) { // from class: o.onGetLayoutInflater
            private static int serializer = 0;
            private static int write = 1;
            public final /* synthetic */ onDestroyOptionsMenu read;

            {
                this.read = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = 2 % 2;
                int i11 = i;
                onDestroyOptionsMenu ondestroyoptionsmenu = this.read;
                if (i11 != 0) {
                    ondestroyoptionsmenu.RemoteActionCompatParcelizer();
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = ondestroyoptionsmenu.write;
                if (bottomSheetBehavior.getState() == 4 || bottomSheetBehavior.getState() == 6) {
                    bottomSheetBehavior.setPeekHeight(view.getHeight());
                    ondestroyoptionsmenu.IconCompatParcelizer();
                } else {
                    int i12 = write + 23;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0 ? bottomSheetBehavior.getState() != 3 : bottomSheetBehavior.getState() != 3) {
                        ondestroyoptionsmenu.MediaSessionCompatResultReceiverWrapper = true;
                        ondestroyoptionsmenu.PlaybackStateCompatCustomAction = true;
                    } else {
                        int i13 = serializer + 15;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        bottomSheetBehavior.setPeekHeight(view.getHeight());
                        ondestroyoptionsmenu.IconCompatParcelizer();
                    }
                }
                ondestroyoptionsmenu.RemoteActionCompatParcelizer();
            }
        };
        final int i2 = 1;
        this.ComponentActivity = new View.OnLayoutChangeListener(this) { // from class: o.onGetLayoutInflater
            private static int serializer = 0;
            private static int write = 1;
            public final /* synthetic */ onDestroyOptionsMenu read;

            {
                this.read = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                int i11 = 2 % 2;
                int i12 = i2;
                onDestroyOptionsMenu ondestroyoptionsmenu = this.read;
                if (i12 != 0) {
                    ondestroyoptionsmenu.RemoteActionCompatParcelizer();
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = ondestroyoptionsmenu.write;
                if (bottomSheetBehavior.getState() == 4 || bottomSheetBehavior.getState() == 6) {
                    bottomSheetBehavior.setPeekHeight(view.getHeight());
                    ondestroyoptionsmenu.IconCompatParcelizer();
                } else {
                    int i13 = write + 23;
                    serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 == 0 ? bottomSheetBehavior.getState() != 3 : bottomSheetBehavior.getState() != 3) {
                        ondestroyoptionsmenu.MediaSessionCompatResultReceiverWrapper = true;
                        ondestroyoptionsmenu.PlaybackStateCompatCustomAction = true;
                    } else {
                        int i14 = serializer + 15;
                        write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        bottomSheetBehavior.setPeekHeight(view.getHeight());
                        ondestroyoptionsmenu.IconCompatParcelizer();
                    }
                }
                ondestroyoptionsmenu.RemoteActionCompatParcelizer();
            }
        };
        this.RemoteActionCompatParcelizer = new onCreateContextMenu(this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    public final void serializer(onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged) throws Exception {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 39;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.invoke(onprimarynavigationfragmentchanged);
            int i3 = 93 / 0;
            if (!(!this.MediaSessionCompatResultReceiverWrapper)) {
                this.write.setPeekHeight(this.serializer.getHeight());
                this.MediaSessionCompatResultReceiverWrapper = false;
            }
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.invoke(onprimarynavigationfragmentchanged);
            if (!(!this.MediaSessionCompatResultReceiverWrapper)) {
                this.write.setPeekHeight(this.serializer.getHeight());
                this.MediaSessionCompatResultReceiverWrapper = false;
            }
        }
        if (this.PlaybackStateCompatCustomAction) {
            int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 75;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            IconCompatParcelizer();
            this.PlaybackStateCompatCustomAction = false;
        }
        if (onprimarynavigationfragmentchanged != onPrimaryNavigationFragmentChanged.EXPANDED) {
            RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r6 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void read(o.onPrimaryNavigationFragmentChanged r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r6.getClass()
            int[] r1 = o.onDestroyView.read
            int r6 = r6.ordinal()
            r6 = r1[r6]
            r1 = 1
            r2 = 4
            if (r6 == r1) goto L33
            int r1 = o.onDestroyOptionsMenu.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg
            int r3 = r1 + 83
            int r4 = r3 % 128
            o.onDestroyOptionsMenu.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r4
            int r3 = r3 % r0
            if (r6 == r0) goto L32
            int r1 = r1 + 57
            int r3 = r1 % 128
            o.onDestroyOptionsMenu.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L29
            if (r6 != r0) goto L2e
            goto L33
        L29:
            r0 = 3
            if (r6 != r0) goto L2e
            r2 = r0
            goto L33
        L2e:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            return
        L32:
            r2 = 6
        L33:
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = r5.write
            int r0 = r6.getState()
            if (r2 != r0) goto L3c
            return
        L3c:
            r6.setState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDestroyOptionsMenu.read(o.onPrimaryNavigationFragmentChanged):void");
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 115;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidx.fragment.app.FragmentContainerView fragmentContainerView = this.ParcelableVolumeInfo;
        int iMax = Math.max(fragmentContainerView.getHeight() - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.getTop(), fragmentContainerView.getHeight() - this.RatingCompat.getBottom());
        g6 g6Var = (g6) this.MediaDescriptionCompat.serializer.MediaSessionCompatResultReceiverWrapper();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.invoke(g6.IconCompatParcelizer(g6Var, g6Var.read + this.ResultReceiver, g6Var.write + iMax, 3));
        int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 95;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[PHI: r2
  0x004d: PHI (r2v9 float) = (r2v7 float), (r2v11 float) binds: [B:17:0x0058, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void IconCompatParcelizer() {
        float height;
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 9;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_BOTTOM_SHEET_HEIGHT_DYNAMIC_ENABLED);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        firebaseRemoteConfigImpl2.getClass();
        if (firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_BOTTOM_SHEET_HEIGHT_DYNAMIC_ENABLED)) {
            int height2 = this.IconCompatParcelizer.getHeight() + this.serializer.getHeight();
            if (height2 > 0) {
                androidx.fragment.app.FragmentContainerView fragmentContainerView = this.ParcelableVolumeInfo;
                if (fragmentContainerView.getHeight() > 0) {
                    int i3 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 33;
                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    float f = 0.5f;
                    if (i3 % 2 != 0) {
                        height = height2 % fragmentContainerView.getHeight();
                        if (height <= 0.5f) {
                            f = height;
                        }
                    } else {
                        height = height2 / fragmentContainerView.getHeight();
                        if (height <= 0.5f) {
                            f = height;
                        }
                    }
                    this.write.setHalfExpandedRatio(f);
                    int i4 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 119;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 5;
                    }
                }
            }
        }
        int i6 = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg + 101;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
