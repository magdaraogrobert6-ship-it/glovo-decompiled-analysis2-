package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDropShadowElement {
    public static final SparseIntArray read;
    public int ComponentActivity;
    public int IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public int _init_lambda1;
    public int _init_lambda2;
    public float _init_lambda3;
    public float _init_lambda4;
    public int accessensureViewModelStore;
    public String addContentView;
    public int addMenuProvider;
    public int addObserverForBackInvoker;
    public int addObserverForBackInvokerlambda0;
    public int addOnConfigurationChangedListener;
    public int addOnContextAvailableListener;
    public int addOnMultiWindowModeChangedListener;
    public int addOnNewIntentListener;
    public int addOnPictureInPictureModeChangedListener;
    public int addOnPictureInPictureUiStateChangedListener;
    public int addOnTrimMemoryListener;
    public int addOnUserLeaveHintListener;
    public int createFullyDrawnExecutor;
    public float defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public int enterPictureInPictureMode;
    public boolean fullyDrawnReporter_delegatelambda0;
    public String fullyDrawnReporter_delegatelambda00;
    public float getActivityResultRegistry;
    public int getDefaultViewModelCreationExtras;
    public int getDefaultViewModelProviderFactory;
    public int getFullyDrawnReporter;
    public float getLastCustomNonConfigurationInstance;
    public int getLifecycle;
    public int getNavigationEventDispatcher;
    public int getOnBackPressedInput;
    public float getSavedStateRegistry;
    public int getSavedStateRegistryControllerannotations;
    public int menuHostHelperlambda0;
    public int onBackPressedDispatcher_delegatelambda0;
    public boolean onBackPressedDispatcher_delegatelambda00;
    public int[] onBackPressedDispatcher_delegatelambda010;
    public int onBackPressedInput_delegatelambda0;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public float r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public int serializer;
    public int write;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        read = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = read;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.RemoteActionCompatParcelizer = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.RemoteActionCompatParcelizer);
                    break;
                case 2:
                    this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.MediaMetadataCompat);
                    break;
                case 3:
                    this.MediaDescriptionCompat = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.MediaDescriptionCompat);
                    break;
                case 4:
                    this.RatingCompat = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.RatingCompat);
                    break;
                case 5:
                    this.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.PlaybackStateCompat);
                    break;
                case 7:
                    this.ResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ResultReceiver);
                    break;
                case 8:
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                    break;
                case 9:
                    this.ComponentActivity = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.ComponentActivity);
                    break;
                case 10:
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    break;
                case 11:
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    break;
                case 12:
                    this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                    break;
                case 13:
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                    break;
                case 14:
                    this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                    break;
                case 15:
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                    break;
                case 16:
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                    break;
                case 17:
                    this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                    break;
                case 18:
                    this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                    break;
                case 19:
                    this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArrayObtainStyledAttributes.getFloat(index, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                    break;
                case 20:
                    this._init_lambda3 = typedArrayObtainStyledAttributes.getFloat(index, this._init_lambda3);
                    break;
                case 21:
                    this.getOnBackPressedInput = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.getOnBackPressedInput);
                    break;
                case 22:
                    this.onBackPressedInput_delegatelambda0 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.onBackPressedInput_delegatelambda0);
                    break;
                case 23:
                    this.addObserverForBackInvoker = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.addObserverForBackInvoker);
                    break;
                case 24:
                    this.ensureViewModelStore = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.ensureViewModelStore);
                    break;
                case 25:
                    this.createFullyDrawnExecutor = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.createFullyDrawnExecutor);
                    break;
                case 26:
                    this.addOnMultiWindowModeChangedListener = typedArrayObtainStyledAttributes.getInt(index, this.addOnMultiWindowModeChangedListener);
                    break;
                case 27:
                    this.addOnNewIntentListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.addOnNewIntentListener);
                    break;
                case 28:
                    this.addMenuProvider = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.addMenuProvider);
                    break;
                case 29:
                    this.addOnContextAvailableListener = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.addOnContextAvailableListener);
                    break;
                case 30:
                    this.enterPictureInPictureMode = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.enterPictureInPictureMode);
                    break;
                case 31:
                    this.addOnTrimMemoryListener = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.addOnTrimMemoryListener);
                    break;
                case 32:
                    this.addOnPictureInPictureModeChangedListener = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.addOnPictureInPictureModeChangedListener);
                    break;
                case 33:
                    this.addOnPictureInPictureUiStateChangedListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.addOnPictureInPictureUiStateChangedListener);
                    break;
                case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.addOnUserLeaveHintListener = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.addOnUserLeaveHintListener);
                    break;
                case 35:
                    this.getFullyDrawnReporter = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.getFullyDrawnReporter);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    this.getLastCustomNonConfigurationInstance = typedArrayObtainStyledAttributes.getFloat(index, this.getLastCustomNonConfigurationInstance);
                    break;
                case 37:
                    this.defaultViewModelProviderFactory_delegatelambda0 = typedArrayObtainStyledAttributes.getFloat(index, this.defaultViewModelProviderFactory_delegatelambda0);
                    break;
                case 38:
                    this.getActivityResultRegistry = typedArrayObtainStyledAttributes.getFloat(index, this.getActivityResultRegistry);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    this.addObserverForBackInvokerlambda0 = typedArrayObtainStyledAttributes.getInt(index, this.addObserverForBackInvokerlambda0);
                    break;
                case 40:
                    this.getDefaultViewModelProviderFactory = typedArrayObtainStyledAttributes.getInt(index, this.getDefaultViewModelProviderFactory);
                    break;
                case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    androidx.constraintlayout.widget.ConstraintSet.read(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    androidx.constraintlayout.widget.ConstraintSet.read(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                            this.MediaSessionCompatQueueItem = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.MediaSessionCompatQueueItem);
                            break;
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                            this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.PlaybackStateCompatCustomAction);
                            break;
                        case 63:
                            this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatMediaItem);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.getSavedStateRegistry = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this._init_lambda4 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    SentryLogcatAdapter.serializer("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.getSavedStateRegistryControllerannotations = typedArrayObtainStyledAttributes.getInt(index, this.getSavedStateRegistryControllerannotations);
                                    break;
                                case 73:
                                    this.menuHostHelperlambda0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.menuHostHelperlambda0);
                                    break;
                                case 74:
                                    this.addContentView = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.fullyDrawnReporter_delegatelambda0 = typedArrayObtainStyledAttributes.getBoolean(index, this.fullyDrawnReporter_delegatelambda0);
                                    break;
                                case 76:
                                    this.addOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getInt(index, this.addOnConfigurationChangedListener);
                                    break;
                                case 77:
                                    this.serializer = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.serializer);
                                    break;
                                case 78:
                                    this.write = androidx.constraintlayout.widget.ConstraintSet.read(typedArrayObtainStyledAttributes, index, this.write);
                                    break;
                                case 79:
                                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                    break;
                                case 80:
                                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.IconCompatParcelizer);
                                    break;
                                case 81:
                                    this.getDefaultViewModelCreationExtras = typedArrayObtainStyledAttributes.getInt(index, this.getDefaultViewModelCreationExtras);
                                    break;
                                case 82:
                                    this._init_lambda2 = typedArrayObtainStyledAttributes.getInt(index, this._init_lambda2);
                                    break;
                                case 83:
                                    this.accessensureViewModelStore = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.accessensureViewModelStore);
                                    break;
                                case 84:
                                    this.getLifecycle = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.getLifecycle);
                                    break;
                                case 85:
                                    this._init_lambda1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this._init_lambda1);
                                    break;
                                case 86:
                                    this.getNavigationEventDispatcher = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.getNavigationEventDispatcher);
                                    break;
                                case 87:
                                    this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaSessionCompatToken);
                                    break;
                                case 88:
                                    this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(index, this.ParcelableVolumeInfo);
                                    break;
                                case 89:
                                    this.fullyDrawnReporter_delegatelambda00 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = typedArrayObtainStyledAttributes.getBoolean(index, this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
                                    break;
                                case 91:
                                    SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
