package o;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class InnerShadowScopeDefaultImpls extends toDpu2uoSUM {
    public String getLifecycle;
    public C0192paint getNavigationEventDispatcher;
    public float getOnBackPressedDispatcher;
    public int getSavedStateRegistry;
    public int getViewModelStore;
    public int initializeViewTreeOwners;
    public int invalidateMenu;
    public int onActivityResult;
    public int onBackPressed;
    public int onConfigurationChanged;
    public String onCreate;
    public String onCreatePanelMenu;
    public int onMenuItemSelected;
    public String onMultiWindowModeChanged;
    public float onNewIntent;

    @Override // o.toDpu2uoSUM, o.accesstoSizeXkaWNTQjd, o.toPx0680j_4, o.InnerShadowScope
    public final void read() {
        MediaDescriptionCompat();
        C0192paint c0192paint = this.getNavigationEventDispatcher;
        int i = this.onActivityResult;
        c0192paint.getClass();
        if ((i == 0 || i == 1) && c0192paint.MediaSessionCompatToken != i) {
            c0192paint.MediaSessionCompatToken = i;
        }
        int i2 = this.onMenuItemSelected;
        if (i2 != 0) {
            C0192paint c0192paint2 = this.getNavigationEventDispatcher;
            if (i2 > 50) {
                c0192paint2.getClass();
            } else if (c0192paint2.PlaybackStateCompat != i2) {
                c0192paint2.PlaybackStateCompat = i2;
                c0192paint2.IconCompatParcelizer();
                c0192paint2.write();
            }
        }
        int i3 = this.getSavedStateRegistry;
        if (i3 != 0) {
            C0192paint c0192paint3 = this.getNavigationEventDispatcher;
            if (i3 > 50) {
                c0192paint3.getClass();
            } else if (c0192paint3.write != i3) {
                c0192paint3.write = i3;
                c0192paint3.IconCompatParcelizer();
                c0192paint3.write();
            }
        }
        float f = this.getOnBackPressedDispatcher;
        if (f != 0.0f) {
            C0192paint c0192paint4 = this.getNavigationEventDispatcher;
            if (f < 0.0f) {
                c0192paint4.getClass();
            } else if (c0192paint4.MediaSessionCompatQueueItem != f) {
                c0192paint4.MediaSessionCompatQueueItem = f;
            }
        }
        float f2 = this.onNewIntent;
        if (f2 != 0.0f) {
            C0192paint c0192paint5 = this.getNavigationEventDispatcher;
            if (f2 < 0.0f) {
                c0192paint5.getClass();
            } else if (c0192paint5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != f2) {
                c0192paint5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = f2;
            }
        }
        String str = this.onCreate;
        if (str != null && !str.isEmpty()) {
            C0192paint c0192paint6 = this.getNavigationEventDispatcher;
            String str2 = this.onCreate;
            String str3 = c0192paint6.MediaSessionCompatResultReceiverWrapper;
            if (str3 == null || !str3.equals(str2)) {
                c0192paint6.MediaSessionCompatResultReceiverWrapper = str2;
            }
        }
        String str4 = this.getLifecycle;
        if (str4 != null && !str4.isEmpty()) {
            C0192paint c0192paint7 = this.getNavigationEventDispatcher;
            String str5 = this.getLifecycle;
            String str6 = c0192paint7.IconCompatParcelizer;
            if (str6 == null || !str6.equals(str5)) {
                c0192paint7.IconCompatParcelizer = str5;
            }
        }
        String str7 = this.onMultiWindowModeChanged;
        if (str7 != null && !str7.isEmpty()) {
            C0192paint c0192paint8 = this.getNavigationEventDispatcher;
            String str8 = this.onMultiWindowModeChanged;
            String str9 = c0192paint8.ResultReceiver;
            if (str9 == null || !str9.equals(str8.toString())) {
                c0192paint8.RatingCompat = false;
                c0192paint8.ResultReceiver = str8.toString();
            }
        }
        String str10 = this.onCreatePanelMenu;
        if (str10 != null && !str10.isEmpty()) {
            C0192paint c0192paint9 = this.getNavigationEventDispatcher;
            String str11 = this.onCreatePanelMenu;
            String str12 = c0192paint9.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (str12 == null || !str12.equals(str11)) {
                c0192paint9.RatingCompat = false;
                c0192paint9.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str11;
            }
        }
        C0192paint c0192paint10 = this.getNavigationEventDispatcher;
        c0192paint10.MediaDescriptionCompat = this.getViewModelStore;
        int i4 = this.invalidateMenu;
        c0192paint10.startActivityForResult = i4;
        c0192paint10.getLifecycleRegistry1 = i4;
        c0192paint10.startIntentSenderForResult = i4;
        c0192paint10.setPictureInPictureParams = this.onBackPressed;
        c0192paint10.setContentView = this.onConfigurationChanged;
        c0192paint10.reportFullyDrawn = this.initializeViewTreeOwners;
        MediaMetadataCompat();
    }

    public InnerShadowScopeDefaultImpls(drawBehind drawbehind, toRect torect) {
        super(drawbehind, torect);
        this.invalidateMenu = 0;
        this.onBackPressed = 0;
        this.onConfigurationChanged = 0;
        this.initializeViewTreeOwners = 0;
        if (torect == toRect.ROW) {
            this.onMenuItemSelected = 1;
        } else if (torect == toRect.COLUMN) {
            this.getSavedStateRegistry = 1;
        }
    }

    @Override // o.toDpu2uoSUM
    public final setPainter MediaDescriptionCompat() {
        int[][] iArrWrite;
        int[][] iArrWrite2;
        boolean[][] zArr;
        if (this.getNavigationEventDispatcher == null) {
            C0192paint c0192paint = new C0192paint();
            c0192paint.RatingCompat = false;
            c0192paint.MediaBrowserCompatMediaItem = 0;
            c0192paint.ComponentActivity = new HashSet();
            c0192paint.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
            c0192paint.IconCompatParcelizer();
            int[][] iArr = c0192paint.serializer;
            boolean z = iArr != null && iArr.length == c0192paint.removeOnMultiWindowModeChangedListener && (zArr = c0192paint.ParcelableVolumeInfo) != null && zArr.length == c0192paint.PlaybackStateCompatCustomAction && zArr[0].length == c0192paint.RemoteActionCompatParcelizer;
            if (!z) {
                c0192paint.write();
            }
            if (z) {
                for (int i = 0; i < c0192paint.ParcelableVolumeInfo.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = c0192paint.ParcelableVolumeInfo;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < c0192paint.serializer.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = c0192paint.serializer;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            c0192paint.MediaBrowserCompatMediaItem = 0;
            String str = c0192paint.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (str != null && !str.trim().isEmpty() && (iArrWrite2 = c0192paint.write(c0192paint.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, false)) != null) {
                c0192paint.write(iArrWrite2);
            }
            String str2 = c0192paint.ResultReceiver;
            if (str2 != null && !str2.trim().isEmpty() && (iArrWrite = c0192paint.write(c0192paint.ResultReceiver, true)) != null) {
                c0192paint.IconCompatParcelizer(iArrWrite);
            }
            this.getNavigationEventDispatcher = c0192paint;
        }
        return this.getNavigationEventDispatcher;
    }
}
