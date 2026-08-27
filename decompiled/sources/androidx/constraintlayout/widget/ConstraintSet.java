package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.mapbox.common.logger.LogPriority;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o.BeyondBoundsLayoutKt;
import o.ShadowScope;
import o.ShadowScopeDefaultImpls;
import o.SimpleDropShadowElement;
import o.SimpleDropShadowNode;
import o.SimpleInnerShadowElement;
import o.accessresetShadow;
import o.accesstoDpGaN1DYAjd;
import o.dropShadow;
import o.getShadow;
import o.getSpotColor0d7_KjU;
import o.isCanceled;
import o.r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.searchBeyondBoundsOMvw8;
import o.shadows4CzXIIdefault;
import o.shadowziNgDLEdefault;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintSet {
    public static final int[] IconCompatParcelizer = {0, 4, 8};
    public static final SparseIntArray read;
    public static final SparseIntArray serializer;
    public final HashMap MediaSessionCompatQueueItem = new HashMap();
    public final boolean write = true;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    public static ShadowScope IconCompatParcelizer(Context context, AttributeSet attributeSet, boolean z) {
        String str;
        String[] strArr;
        String str2;
        ShadowScope shadowScope = new ShadowScope();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? BeyondBoundsLayoutKt.ConstraintOverride : BeyondBoundsLayoutKt.Constraint);
        ShadowScopeDefaultImpls shadowScopeDefaultImpls = shadowScope.write;
        SimpleDropShadowNode simpleDropShadowNode = shadowScope.RatingCompat;
        shadowziNgDLEdefault shadowzingdledefault = shadowScope.RemoteActionCompatParcelizer;
        SimpleDropShadowElement simpleDropShadowElement = shadowScope.IconCompatParcelizer;
        int[] iArr = IconCompatParcelizer;
        String[] strArr2 = accesstoDpGaN1DYAjd.RemoteActionCompatParcelizer;
        SparseIntArray sparseIntArray = read;
        String str3 = "unused attribute 0x";
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            getShadow getshadow = new getShadow();
            shadowzingdledefault.getClass();
            simpleDropShadowElement.getClass();
            simpleDropShadowNode.getClass();
            int i = 0;
            while (i < indexCount) {
                int i2 = indexCount;
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i3 = i;
                switch (serializer.get(index)) {
                    case 2:
                        strArr = strArr2;
                        getshadow.read(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.MediaMetadataCompat));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", str2 + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        continue;
                        i = i3 + 1;
                        indexCount = i2;
                        getshadow = getshadow;
                        str4 = str2;
                        strArr2 = strArr;
                        break;
                    case 5:
                        strArr = strArr2;
                        getshadow.IconCompatParcelizer(5, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        strArr = strArr2;
                        getshadow.read(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, simpleDropShadowElement.PlaybackStateCompat));
                        break;
                    case 7:
                        strArr = strArr2;
                        getshadow.read(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, simpleDropShadowElement.ResultReceiver));
                        break;
                    case 8:
                        strArr = strArr2;
                        getshadow.read(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
                        break;
                    case 11:
                        strArr = strArr2;
                        getshadow.read(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                        break;
                    case 12:
                        strArr = strArr2;
                        getshadow.read(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8));
                        break;
                    case 13:
                        strArr = strArr2;
                        getshadow.read(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM));
                        break;
                    case 14:
                        strArr = strArr2;
                        getshadow.read(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4));
                        break;
                    case 15:
                        strArr = strArr2;
                        getshadow.read(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg));
                        break;
                    case 16:
                        strArr = strArr2;
                        getshadow.read(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28));
                        break;
                    case 17:
                        strArr = strArr2;
                        getshadow.read(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, simpleDropShadowElement.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs));
                        break;
                    case 18:
                        strArr = strArr2;
                        getshadow.read(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, simpleDropShadowElement.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ));
                        break;
                    case 19:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw), 19);
                        break;
                    case 20:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement._init_lambda3), 20);
                        break;
                    case 21:
                        strArr = strArr2;
                        getshadow.read(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, simpleDropShadowElement.getOnBackPressedInput));
                        break;
                    case 22:
                        strArr = strArr2;
                        getshadow.read(22, iArr[typedArrayObtainStyledAttributes.getInt(index, shadowScopeDefaultImpls.serializer)]);
                        break;
                    case 23:
                        strArr = strArr2;
                        getshadow.read(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, simpleDropShadowElement.onBackPressedInput_delegatelambda0));
                        break;
                    case 24:
                        strArr = strArr2;
                        getshadow.read(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.addObserverForBackInvoker));
                        break;
                    case 27:
                        strArr = strArr2;
                        getshadow.read(27, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.addOnMultiWindowModeChangedListener));
                        break;
                    case 28:
                        strArr = strArr2;
                        getshadow.read(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.addOnNewIntentListener));
                        break;
                    case 31:
                        strArr = strArr2;
                        getshadow.read(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.enterPictureInPictureMode));
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        strArr = strArr2;
                        getshadow.read(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.addOnPictureInPictureUiStateChangedListener));
                        break;
                    case 37:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement.getLastCustomNonConfigurationInstance), 37);
                        break;
                    case 38:
                        strArr = strArr2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, shadowScope.read);
                        shadowScope.read = resourceId;
                        getshadow.read(38, resourceId);
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement.defaultViewModelProviderFactory_delegatelambda0), 39);
                        break;
                    case 40:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement.getActivityResultRegistry), 40);
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        strArr = strArr2;
                        getshadow.read(41, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.addObserverForBackInvokerlambda0));
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        strArr = strArr2;
                        getshadow.read(42, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.getDefaultViewModelProviderFactory));
                        break;
                    case 43:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, shadowScopeDefaultImpls.read), 43);
                        break;
                    case 44:
                        strArr = strArr2;
                        getshadow.read(44, true);
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.IconCompatParcelizer), 44);
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowNode.serializer), 45);
                        break;
                    case 46:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowNode.RatingCompat), 46);
                        break;
                    case 47:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowNode.MediaSessionCompatQueueItem), 47);
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowNode.MediaDescriptionCompat), 48);
                        break;
                    case 49:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.MediaMetadataCompat), 49);
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.PlaybackStateCompatCustomAction), 50);
                        break;
                    case 51:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.PlaybackStateCompat), 51);
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.MediaSessionCompatToken), 52);
                        break;
                    case 53:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getDimension(index, simpleDropShadowNode.MediaSessionCompatResultReceiverWrapper), 53);
                        break;
                    case 54:
                        strArr = strArr2;
                        getshadow.read(54, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.getDefaultViewModelCreationExtras));
                        break;
                    case 55:
                        strArr = strArr2;
                        getshadow.read(55, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement._init_lambda2));
                        break;
                    case 56:
                        strArr = strArr2;
                        getshadow.read(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.getLifecycle));
                        break;
                    case 57:
                        strArr = strArr2;
                        getshadow.read(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.accessensureViewModelStore));
                        break;
                    case 58:
                        strArr = strArr2;
                        getshadow.read(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.getNavigationEventDispatcher));
                        break;
                    case 59:
                        strArr = strArr2;
                        getshadow.read(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement._init_lambda1));
                        break;
                    case 60:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowNode.RemoteActionCompatParcelizer), 60);
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        strArr = strArr2;
                        getshadow.read(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.PlaybackStateCompatCustomAction));
                        break;
                    case 63:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, simpleDropShadowElement.MediaBrowserCompatMediaItem), 63);
                        break;
                    case 64:
                        strArr = strArr2;
                        getshadow.read(64, read(typedArrayObtainStyledAttributes, index, shadowzingdledefault.read));
                        break;
                    case 65:
                        strArr = strArr2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            getshadow.IconCompatParcelizer(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        } else {
                            getshadow.IconCompatParcelizer(65, typedArrayObtainStyledAttributes.getString(index));
                        }
                        break;
                    case 66:
                        strArr = strArr2;
                        getshadow.read(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, shadowzingdledefault.RatingCompat), 67);
                        break;
                    case 68:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, shadowScopeDefaultImpls.IconCompatParcelizer), 68);
                        break;
                    case 69:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        strArr = strArr2;
                        SentryLogcatAdapter.serializer("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        getshadow.read(72, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.getSavedStateRegistryControllerannotations));
                        break;
                    case 73:
                        strArr = strArr2;
                        getshadow.read(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.menuHostHelperlambda0));
                        break;
                    case 74:
                        strArr = strArr2;
                        getshadow.IconCompatParcelizer(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        strArr = strArr2;
                        getshadow.read(75, typedArrayObtainStyledAttributes.getBoolean(index, simpleDropShadowElement.fullyDrawnReporter_delegatelambda0));
                        break;
                    case 76:
                        strArr = strArr2;
                        getshadow.read(76, typedArrayObtainStyledAttributes.getInt(index, shadowzingdledefault.IconCompatParcelizer));
                        break;
                    case 77:
                        strArr = strArr2;
                        getshadow.IconCompatParcelizer(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        strArr = strArr2;
                        getshadow.read(78, typedArrayObtainStyledAttributes.getInt(index, shadowScopeDefaultImpls.write));
                        break;
                    case 79:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, shadowzingdledefault.serializer), 79);
                        break;
                    case 80:
                        strArr = strArr2;
                        getshadow.read(80, typedArrayObtainStyledAttributes.getBoolean(index, simpleDropShadowElement.MediaSessionCompatToken));
                        break;
                    case 81:
                        strArr = strArr2;
                        getshadow.read(81, typedArrayObtainStyledAttributes.getBoolean(index, simpleDropShadowElement.ParcelableVolumeInfo));
                        break;
                    case 82:
                        strArr = strArr2;
                        getshadow.read(82, typedArrayObtainStyledAttributes.getInteger(index, shadowzingdledefault.write));
                        break;
                    case 83:
                        strArr = strArr2;
                        getshadow.read(83, read(typedArrayObtainStyledAttributes, index, simpleDropShadowNode.MediaBrowserCompatMediaItem));
                        break;
                    case 84:
                        strArr = strArr2;
                        getshadow.read(84, typedArrayObtainStyledAttributes.getInteger(index, shadowzingdledefault.MediaBrowserCompatMediaItem));
                        break;
                    case 85:
                        strArr = strArr2;
                        getshadow.write(typedArrayObtainStyledAttributes.getFloat(index, shadowzingdledefault.MediaDescriptionCompat), 85);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            shadowzingdledefault.MediaSessionCompatQueueItem = resourceId2;
                            getshadow.read(89, resourceId2);
                            if (shadowzingdledefault.MediaSessionCompatQueueItem != -1) {
                                getshadow.read(88, -2);
                            }
                        } else if (i4 != 3) {
                            getshadow.read(88, typedArrayObtainStyledAttributes.getInteger(index, shadowzingdledefault.MediaSessionCompatQueueItem));
                        } else {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            shadowzingdledefault.MediaMetadataCompat = string;
                            getshadow.IconCompatParcelizer(90, string);
                            if (shadowzingdledefault.MediaMetadataCompat.indexOf("/") <= 0) {
                                getshadow.read(88, -1);
                            } else {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                shadowzingdledefault.MediaSessionCompatQueueItem = resourceId3;
                                getshadow.read(89, resourceId3);
                                getshadow.read(88, -2);
                            }
                        }
                        break;
                    case 87:
                        strArr = strArr2;
                        SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        getshadow.read(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.IconCompatParcelizer));
                        break;
                    case 94:
                        strArr = strArr2;
                        getshadow.read(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, simpleDropShadowElement.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
                        break;
                    case 95:
                        strArr = strArr2;
                        read(getshadow, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        strArr = strArr2;
                        read(getshadow, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        strArr = strArr2;
                        getshadow.read(97, typedArrayObtainStyledAttributes.getInt(index, simpleDropShadowElement.addOnConfigurationChangedListener));
                        break;
                    case 98:
                        int i5 = accessresetShadow.RemoteActionCompatParcelizer;
                        strArr = strArr2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            shadowScope.read = typedArrayObtainStyledAttributes.getResourceId(index, shadowScope.read);
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                        }
                        break;
                    case LogPriority.NONE /* 99 */:
                        getshadow.read(99, typedArrayObtainStyledAttributes.getBoolean(index, simpleDropShadowElement.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0));
                        strArr = strArr2;
                        break;
                }
                str2 = str4;
                i = i3 + 1;
                indexCount = i2;
                getshadow = getshadow;
                str4 = str2;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i6 = 0;
            while (i6 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i6);
                int i7 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        shadowzingdledefault.getClass();
                        simpleDropShadowElement.getClass();
                        simpleDropShadowNode.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        simpleDropShadowElement.RemoteActionCompatParcelizer = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.RemoteActionCompatParcelizer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 2:
                        str = str3;
                        simpleDropShadowElement.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.MediaMetadataCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 3:
                        str = str3;
                        simpleDropShadowElement.MediaDescriptionCompat = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.MediaDescriptionCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 4:
                        str = str3;
                        simpleDropShadowElement.RatingCompat = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.RatingCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 5:
                        str = str3;
                        simpleDropShadowElement.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 6:
                        str = str3;
                        simpleDropShadowElement.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, simpleDropShadowElement.PlaybackStateCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 7:
                        str = str3;
                        simpleDropShadowElement.ResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, simpleDropShadowElement.ResultReceiver);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 8:
                        str = str3;
                        simpleDropShadowElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 9:
                        str = str3;
                        simpleDropShadowElement.ComponentActivity = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.ComponentActivity);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 10:
                        str = str3;
                        simpleDropShadowElement.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 11:
                        str = str3;
                        simpleDropShadowElement.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 12:
                        str = str3;
                        simpleDropShadowElement.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 13:
                        str = str3;
                        simpleDropShadowElement.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 14:
                        str = str3;
                        simpleDropShadowElement.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 15:
                        str = str3;
                        simpleDropShadowElement.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 16:
                        str = str3;
                        simpleDropShadowElement.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 17:
                        str = str3;
                        simpleDropShadowElement.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, simpleDropShadowElement.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 18:
                        str = str3;
                        simpleDropShadowElement.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, simpleDropShadowElement.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 19:
                        str = str3;
                        simpleDropShadowElement.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 20:
                        str = str3;
                        simpleDropShadowElement._init_lambda3 = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement._init_lambda3);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 21:
                        str = str3;
                        simpleDropShadowElement.getOnBackPressedInput = typedArrayObtainStyledAttributes.getLayoutDimension(index2, simpleDropShadowElement.getOnBackPressedInput);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 22:
                        str = str3;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, shadowScopeDefaultImpls.serializer);
                        shadowScopeDefaultImpls.serializer = i8;
                        shadowScopeDefaultImpls.serializer = iArr[i8];
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 23:
                        str = str3;
                        simpleDropShadowElement.onBackPressedInput_delegatelambda0 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, simpleDropShadowElement.onBackPressedInput_delegatelambda0);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 24:
                        str = str3;
                        simpleDropShadowElement.addObserverForBackInvoker = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.addObserverForBackInvoker);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 25:
                        str = str3;
                        simpleDropShadowElement.ensureViewModelStore = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.ensureViewModelStore);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 26:
                        str = str3;
                        simpleDropShadowElement.createFullyDrawnExecutor = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.createFullyDrawnExecutor);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 27:
                        str = str3;
                        simpleDropShadowElement.addOnMultiWindowModeChangedListener = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.addOnMultiWindowModeChangedListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 28:
                        str = str3;
                        simpleDropShadowElement.addOnNewIntentListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.addOnNewIntentListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 29:
                        str = str3;
                        simpleDropShadowElement.addMenuProvider = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.addMenuProvider);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 30:
                        str = str3;
                        simpleDropShadowElement.addOnContextAvailableListener = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.addOnContextAvailableListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 31:
                        str = str3;
                        simpleDropShadowElement.enterPictureInPictureMode = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.enterPictureInPictureMode);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 32:
                        str = str3;
                        simpleDropShadowElement.addOnTrimMemoryListener = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.addOnTrimMemoryListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 33:
                        str = str3;
                        simpleDropShadowElement.addOnPictureInPictureModeChangedListener = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.addOnPictureInPictureModeChangedListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        str = str3;
                        simpleDropShadowElement.addOnPictureInPictureUiStateChangedListener = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.addOnPictureInPictureUiStateChangedListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 35:
                        str = str3;
                        simpleDropShadowElement.addOnUserLeaveHintListener = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.addOnUserLeaveHintListener);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        str = str3;
                        simpleDropShadowElement.getFullyDrawnReporter = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.getFullyDrawnReporter);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 37:
                        str = str3;
                        simpleDropShadowElement.getLastCustomNonConfigurationInstance = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement.getLastCustomNonConfigurationInstance);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 38:
                        str = str3;
                        shadowScope.read = typedArrayObtainStyledAttributes.getResourceId(index2, shadowScope.read);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        str = str3;
                        simpleDropShadowElement.defaultViewModelProviderFactory_delegatelambda0 = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement.defaultViewModelProviderFactory_delegatelambda0);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 40:
                        str = str3;
                        simpleDropShadowElement.getActivityResultRegistry = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement.getActivityResultRegistry);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        str = str3;
                        simpleDropShadowElement.addObserverForBackInvokerlambda0 = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.addObserverForBackInvokerlambda0);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        str = str3;
                        simpleDropShadowElement.getDefaultViewModelProviderFactory = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.getDefaultViewModelProviderFactory);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 43:
                        str = str3;
                        shadowScopeDefaultImpls.read = typedArrayObtainStyledAttributes.getFloat(index2, shadowScopeDefaultImpls.read);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 44:
                        str = str3;
                        simpleDropShadowNode.write = true;
                        simpleDropShadowNode.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.IconCompatParcelizer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        str = str3;
                        simpleDropShadowNode.serializer = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowNode.serializer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 46:
                        str = str3;
                        simpleDropShadowNode.RatingCompat = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowNode.RatingCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 47:
                        str = str3;
                        simpleDropShadowNode.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowNode.MediaSessionCompatQueueItem);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                        str = str3;
                        simpleDropShadowNode.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowNode.MediaDescriptionCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 49:
                        str = str3;
                        simpleDropShadowNode.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.MediaMetadataCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case RectListKt.BitOffsetForLastChildOffset /* 50 */:
                        str = str3;
                        simpleDropShadowNode.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.PlaybackStateCompatCustomAction);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 51:
                        str = str3;
                        simpleDropShadowNode.PlaybackStateCompat = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.PlaybackStateCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                        str = str3;
                        simpleDropShadowNode.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.MediaSessionCompatToken);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 53:
                        str = str3;
                        simpleDropShadowNode.MediaSessionCompatResultReceiverWrapper = typedArrayObtainStyledAttributes.getDimension(index2, simpleDropShadowNode.MediaSessionCompatResultReceiverWrapper);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 54:
                        str = str3;
                        simpleDropShadowElement.getDefaultViewModelCreationExtras = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.getDefaultViewModelCreationExtras);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 55:
                        str = str3;
                        simpleDropShadowElement._init_lambda2 = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement._init_lambda2);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 56:
                        str = str3;
                        simpleDropShadowElement.getLifecycle = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.getLifecycle);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 57:
                        str = str3;
                        simpleDropShadowElement.accessensureViewModelStore = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.accessensureViewModelStore);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 58:
                        str = str3;
                        simpleDropShadowElement.getNavigationEventDispatcher = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.getNavigationEventDispatcher);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 59:
                        str = str3;
                        simpleDropShadowElement._init_lambda1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement._init_lambda1);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 60:
                        str = str3;
                        simpleDropShadowNode.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowNode.RemoteActionCompatParcelizer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case RectListKt.BitOffsetForFocusable /* 61 */:
                        str = str3;
                        simpleDropShadowElement.MediaSessionCompatQueueItem = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.MediaSessionCompatQueueItem);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                        str = str3;
                        simpleDropShadowElement.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.PlaybackStateCompatCustomAction);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 63:
                        str = str3;
                        simpleDropShadowElement.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getFloat(index2, simpleDropShadowElement.MediaBrowserCompatMediaItem);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 64:
                        str = str3;
                        shadowzingdledefault.read = read(typedArrayObtainStyledAttributes, index2, shadowzingdledefault.read);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 65:
                        str = str3;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            shadowzingdledefault.getClass();
                            continue;
                        } else {
                            String str5 = strArr2[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            shadowzingdledefault.getClass();
                        }
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 66:
                        str = str3;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        shadowzingdledefault.getClass();
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 67:
                        str = str3;
                        shadowzingdledefault.RatingCompat = typedArrayObtainStyledAttributes.getFloat(index2, shadowzingdledefault.RatingCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 68:
                        str = str3;
                        shadowScopeDefaultImpls.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(index2, shadowScopeDefaultImpls.IconCompatParcelizer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 69:
                        str = str3;
                        simpleDropShadowElement.getSavedStateRegistry = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 70:
                        str = str3;
                        simpleDropShadowElement._init_lambda4 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 71:
                        str = str3;
                        SentryLogcatAdapter.serializer("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 72:
                        str = str3;
                        simpleDropShadowElement.getSavedStateRegistryControllerannotations = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.getSavedStateRegistryControllerannotations);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 73:
                        str = str3;
                        simpleDropShadowElement.menuHostHelperlambda0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.menuHostHelperlambda0);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 74:
                        str = str3;
                        simpleDropShadowElement.addContentView = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 75:
                        str = str3;
                        simpleDropShadowElement.fullyDrawnReporter_delegatelambda0 = typedArrayObtainStyledAttributes.getBoolean(index2, simpleDropShadowElement.fullyDrawnReporter_delegatelambda0);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 76:
                        str = str3;
                        shadowzingdledefault.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index2, shadowzingdledefault.IconCompatParcelizer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 77:
                        str = str3;
                        simpleDropShadowElement.fullyDrawnReporter_delegatelambda00 = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 78:
                        str = str3;
                        shadowScopeDefaultImpls.write = typedArrayObtainStyledAttributes.getInt(index2, shadowScopeDefaultImpls.write);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 79:
                        str = str3;
                        shadowzingdledefault.serializer = typedArrayObtainStyledAttributes.getFloat(index2, shadowzingdledefault.serializer);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 80:
                        str = str3;
                        simpleDropShadowElement.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getBoolean(index2, simpleDropShadowElement.MediaSessionCompatToken);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 81:
                        str = str3;
                        simpleDropShadowElement.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(index2, simpleDropShadowElement.ParcelableVolumeInfo);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 82:
                        str = str3;
                        shadowzingdledefault.write = typedArrayObtainStyledAttributes.getInteger(index2, shadowzingdledefault.write);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 83:
                        str = str3;
                        simpleDropShadowNode.MediaBrowserCompatMediaItem = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowNode.MediaBrowserCompatMediaItem);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 84:
                        str = str3;
                        shadowzingdledefault.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getInteger(index2, shadowzingdledefault.MediaBrowserCompatMediaItem);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 85:
                        str = str3;
                        shadowzingdledefault.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(index2, shadowzingdledefault.MediaDescriptionCompat);
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 86:
                        str = str3;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            shadowzingdledefault.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            continue;
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            shadowzingdledefault.MediaMetadataCompat = string2;
                            if (string2.indexOf("/") > 0) {
                                shadowzingdledefault.MediaSessionCompatQueueItem = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, shadowzingdledefault.MediaSessionCompatQueueItem);
                        }
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 87:
                        StringBuilder sb = new StringBuilder(str3);
                        str = str3;
                        sb.append(Integer.toHexString(index2));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index2));
                        SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", sb.toString());
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 91:
                        simpleDropShadowElement.serializer = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.serializer);
                        break;
                    case 92:
                        simpleDropShadowElement.write = read(typedArrayObtainStyledAttributes, index2, simpleDropShadowElement.write);
                        break;
                    case 93:
                        simpleDropShadowElement.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.IconCompatParcelizer);
                        break;
                    case 94:
                        simpleDropShadowElement.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, simpleDropShadowElement.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                        break;
                    case 95:
                        read(simpleDropShadowElement, typedArrayObtainStyledAttributes, index2, 0);
                        str = str3;
                        continue;
                        i6++;
                        indexCount2 = i7;
                        str3 = str;
                        break;
                    case 96:
                        read(simpleDropShadowElement, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        simpleDropShadowElement.addOnConfigurationChangedListener = typedArrayObtainStyledAttributes.getInt(index2, simpleDropShadowElement.addOnConfigurationChangedListener);
                        break;
                }
                str = str3;
                i6++;
                indexCount2 = i7;
                str3 = str;
            }
            if (simpleDropShadowElement.addContentView != null) {
                simpleDropShadowElement.onBackPressedDispatcher_delegatelambda010 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return shadowScope;
    }

    public static int[] convertReferenceString(dropShadow dropshadow, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = dropshadow.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = searchBeyondBoundsOMvw8.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && dropshadow.isInEditMode() && (dropshadow.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) dropshadow.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.MediaMetadataCompat;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.MediaMetadataCompat.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static void serializer(shadows4CzXIIdefault shadows4czxiidefault, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b = -1;
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (b == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        shadows4czxiidefault.MediaSessionCompatResultReceiverWrapper = str;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        read = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        serializer = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(ActivityIdentificationData.RUNNING, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(GwiErrorCode.ALG_LIBRARY_NOT_EXIST, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    /* JADX WARN: Code duplicated, block: B:38:0x005c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0065  */
    public static void read(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        getShadow getshadow;
        SimpleDropShadowElement simpleDropShadowElement;
        shadows4CzXIIdefault shadows4czxiidefault;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof shadows4CzXIIdefault) {
                    shadows4czxiidefault = (shadows4CzXIIdefault) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).width = i4;
                        shadows4czxiidefault.MediaSessionCompatToken = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).height = i4;
                        shadows4czxiidefault.MediaSessionCompatQueueItem = z;
                        return;
                    }
                }
                if (obj instanceof SimpleDropShadowElement) {
                    simpleDropShadowElement = (SimpleDropShadowElement) obj;
                    if (i2 == 0) {
                        simpleDropShadowElement.onBackPressedInput_delegatelambda0 = i4;
                        simpleDropShadowElement.MediaSessionCompatToken = z;
                        return;
                    } else {
                        simpleDropShadowElement.getOnBackPressedInput = i4;
                        simpleDropShadowElement.ParcelableVolumeInfo = z;
                        return;
                    }
                }
                if (obj instanceof getShadow) {
                    getshadow = (getShadow) obj;
                    if (i2 == 0) {
                        getshadow.read(23, i4);
                        getshadow.read(80, z);
                        return;
                    } else {
                        getshadow.read(21, i4);
                        getshadow.read(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof shadows4CzXIIdefault) {
                shadows4czxiidefault = (shadows4CzXIIdefault) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).width = i4;
                    shadows4czxiidefault.MediaSessionCompatToken = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) shadows4czxiidefault).height = i4;
                    shadows4czxiidefault.MediaSessionCompatQueueItem = z;
                    return;
                }
            }
            if (obj instanceof SimpleDropShadowElement) {
                simpleDropShadowElement = (SimpleDropShadowElement) obj;
                if (i2 == 0) {
                    simpleDropShadowElement.onBackPressedInput_delegatelambda0 = i4;
                    simpleDropShadowElement.MediaSessionCompatToken = z;
                    return;
                } else {
                    simpleDropShadowElement.getOnBackPressedInput = i4;
                    simpleDropShadowElement.ParcelableVolumeInfo = z;
                    return;
                }
            }
            if (obj instanceof getShadow) {
                getshadow = (getShadow) obj;
                if (i2 == 0) {
                    getshadow.read(23, i4);
                    getshadow.read(80, z);
                    return;
                } else {
                    getshadow.read(21, i4);
                    getshadow.read(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof shadows4CzXIIdefault) {
                    shadows4CzXIIdefault shadows4czxiidefault2 = (shadows4CzXIIdefault) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) shadows4czxiidefault2).height = 0;
                    }
                    serializer(shadows4czxiidefault2, strTrim2);
                    return;
                }
                if (obj instanceof SimpleDropShadowElement) {
                    ((SimpleDropShadowElement) obj).MediaSessionCompatResultReceiverWrapper = strTrim2;
                    return;
                } else {
                    if (obj instanceof getShadow) {
                        ((getShadow) obj).IconCompatParcelizer(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof shadows4CzXIIdefault) {
                        shadows4CzXIIdefault shadows4czxiidefault3 = (shadows4CzXIIdefault) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault3).width = 0;
                            shadows4czxiidefault3._init_lambda3 = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault3).height = 0;
                            shadows4czxiidefault3.getSavedStateRegistry = f;
                            return;
                        }
                    }
                    if (obj instanceof SimpleDropShadowElement) {
                        SimpleDropShadowElement simpleDropShadowElement2 = (SimpleDropShadowElement) obj;
                        if (i2 == 0) {
                            simpleDropShadowElement2.onBackPressedInput_delegatelambda0 = 0;
                            simpleDropShadowElement2.defaultViewModelProviderFactory_delegatelambda0 = f;
                            return;
                        } else {
                            simpleDropShadowElement2.getOnBackPressedInput = 0;
                            simpleDropShadowElement2.getActivityResultRegistry = f;
                            return;
                        }
                    }
                    if (obj instanceof getShadow) {
                        getShadow getshadow2 = (getShadow) obj;
                        if (i2 == 0) {
                            getshadow2.read(23, 0);
                            getshadow2.write(f, 39);
                            return;
                        } else {
                            getshadow2.read(21, 0);
                            getshadow2.write(f, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof shadows4CzXIIdefault) {
                        shadows4CzXIIdefault shadows4czxiidefault4 = (shadows4CzXIIdefault) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault4).width = 0;
                            shadows4czxiidefault4.addOnTrimMemoryListener = fMax;
                            shadows4czxiidefault4.addOnMultiWindowModeChangedListener = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) shadows4czxiidefault4).height = 0;
                            shadows4czxiidefault4.addOnPictureInPictureUiStateChangedListener = fMax;
                            shadows4czxiidefault4.onBackPressedDispatcher_delegatelambda010 = 2;
                            return;
                        }
                    }
                    if (obj instanceof SimpleDropShadowElement) {
                        SimpleDropShadowElement simpleDropShadowElement3 = (SimpleDropShadowElement) obj;
                        if (i2 == 0) {
                            simpleDropShadowElement3.onBackPressedInput_delegatelambda0 = 0;
                            simpleDropShadowElement3.getSavedStateRegistry = fMax;
                            simpleDropShadowElement3.getDefaultViewModelCreationExtras = 2;
                            return;
                        } else {
                            simpleDropShadowElement3.getOnBackPressedInput = 0;
                            simpleDropShadowElement3._init_lambda4 = fMax;
                            simpleDropShadowElement3._init_lambda2 = 2;
                            return;
                        }
                    }
                    if (obj instanceof getShadow) {
                        getShadow getshadow3 = (getShadow) obj;
                        if (i2 == 0) {
                            getshadow3.read(23, 0);
                            getshadow3.read(54, 2);
                        } else {
                            getshadow3.read(21, 0);
                            getshadow3.read(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public final void RemoteActionCompatParcelizer(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ShadowScope shadowScopeIconCompatParcelizer = IconCompatParcelizer(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        shadowScopeIconCompatParcelizer.IconCompatParcelizer.onBackPressedDispatcher_delegatelambda00 = true;
                    }
                    this.RemoteActionCompatParcelizer.put(Integer.valueOf(shadowScopeIconCompatParcelizer.read), shadowScopeIconCompatParcelizer);
                }
            }
        } catch (IOException e) {
            SentryLogcatAdapter.read("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            SentryLogcatAdapter.read("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    public final void read(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.RemoteActionCompatParcelizer;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.write && id == -1) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new ShadowScope());
            }
            ShadowScope shadowScope = (ShadowScope) map.get(Integer.valueOf(id));
            if (shadowScope != null) {
                ShadowScopeDefaultImpls shadowScopeDefaultImpls = shadowScope.write;
                SimpleDropShadowElement simpleDropShadowElement = shadowScope.IconCompatParcelizer;
                SimpleDropShadowNode simpleDropShadowNode = shadowScope.RatingCompat;
                shadowScope.serializer = getSpotColor0d7_KjU.read(childAt, this.MediaSessionCompatQueueItem);
                ShadowScope.IconCompatParcelizer(shadowScope, id, shadows4czxiidefault);
                shadowScopeDefaultImpls.serializer = childAt.getVisibility();
                shadowScopeDefaultImpls.read = childAt.getAlpha();
                simpleDropShadowNode.RemoteActionCompatParcelizer = childAt.getRotation();
                simpleDropShadowNode.serializer = childAt.getRotationX();
                simpleDropShadowNode.RatingCompat = childAt.getRotationY();
                simpleDropShadowNode.MediaSessionCompatQueueItem = childAt.getScaleX();
                simpleDropShadowNode.MediaDescriptionCompat = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    simpleDropShadowNode.MediaMetadataCompat = pivotX;
                    simpleDropShadowNode.PlaybackStateCompatCustomAction = pivotY;
                }
                simpleDropShadowNode.PlaybackStateCompat = childAt.getTranslationX();
                simpleDropShadowNode.MediaSessionCompatToken = childAt.getTranslationY();
                simpleDropShadowNode.MediaSessionCompatResultReceiverWrapper = childAt.getTranslationZ();
                if (simpleDropShadowNode.write) {
                    simpleDropShadowNode.IconCompatParcelizer = childAt.getElevation();
                }
                if (childAt instanceof dropShadow) {
                    dropShadow dropshadow = (dropShadow) childAt;
                    simpleDropShadowElement.fullyDrawnReporter_delegatelambda0 = dropshadow.getAllowsGoneWidget();
                    simpleDropShadowElement.onBackPressedDispatcher_delegatelambda010 = dropshadow.getReferencedIds();
                    simpleDropShadowElement.getSavedStateRegistryControllerannotations = dropshadow.getType();
                    simpleDropShadowElement.menuHostHelperlambda0 = dropshadow.getMargin();
                }
            }
        }
    }

    public final void write(int i, int i2, int i3, int i4, int i5) {
        HashMap map = this.RemoteActionCompatParcelizer;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new ShadowScope());
        }
        ShadowScope shadowScope = (ShadowScope) map.get(Integer.valueOf(i));
        if (shadowScope == null) {
            return;
        }
        SimpleDropShadowElement simpleDropShadowElement = shadowScope.IconCompatParcelizer;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    simpleDropShadowElement.ensureViewModelStore = i3;
                    simpleDropShadowElement.createFullyDrawnExecutor = -1;
                } else if (i4 == 2) {
                    simpleDropShadowElement.createFullyDrawnExecutor = i3;
                    simpleDropShadowElement.ensureViewModelStore = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Left to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.addObserverForBackInvoker = i5;
                return;
            case 2:
                if (i4 == 1) {
                    simpleDropShadowElement.addMenuProvider = i3;
                    simpleDropShadowElement.addOnContextAvailableListener = -1;
                } else if (i4 == 2) {
                    simpleDropShadowElement.addOnContextAvailableListener = i3;
                    simpleDropShadowElement.addMenuProvider = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.addOnNewIntentListener = i5;
                return;
            case 3:
                if (i4 == 3) {
                    simpleDropShadowElement.getFullyDrawnReporter = i3;
                    simpleDropShadowElement.addOnUserLeaveHintListener = -1;
                    simpleDropShadowElement.RemoteActionCompatParcelizer = -1;
                    simpleDropShadowElement.serializer = -1;
                    simpleDropShadowElement.write = -1;
                } else if (i4 == 4) {
                    simpleDropShadowElement.addOnUserLeaveHintListener = i3;
                    simpleDropShadowElement.getFullyDrawnReporter = -1;
                    simpleDropShadowElement.RemoteActionCompatParcelizer = -1;
                    simpleDropShadowElement.serializer = -1;
                    simpleDropShadowElement.write = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.addOnPictureInPictureUiStateChangedListener = i5;
                return;
            case 4:
                if (i4 == 4) {
                    simpleDropShadowElement.MediaDescriptionCompat = i3;
                    simpleDropShadowElement.RatingCompat = -1;
                    simpleDropShadowElement.RemoteActionCompatParcelizer = -1;
                    simpleDropShadowElement.serializer = -1;
                    simpleDropShadowElement.write = -1;
                } else if (i4 == 3) {
                    simpleDropShadowElement.RatingCompat = i3;
                    simpleDropShadowElement.MediaDescriptionCompat = -1;
                    simpleDropShadowElement.RemoteActionCompatParcelizer = -1;
                    simpleDropShadowElement.serializer = -1;
                    simpleDropShadowElement.write = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.MediaMetadataCompat = i5;
                return;
            case 5:
                if (i4 == 5) {
                    simpleDropShadowElement.RemoteActionCompatParcelizer = i3;
                    simpleDropShadowElement.MediaDescriptionCompat = -1;
                    simpleDropShadowElement.RatingCompat = -1;
                    simpleDropShadowElement.getFullyDrawnReporter = -1;
                    simpleDropShadowElement.addOnUserLeaveHintListener = -1;
                    return;
                }
                if (i4 == 3) {
                    simpleDropShadowElement.serializer = i3;
                    simpleDropShadowElement.MediaDescriptionCompat = -1;
                    simpleDropShadowElement.RatingCompat = -1;
                    simpleDropShadowElement.getFullyDrawnReporter = -1;
                    simpleDropShadowElement.addOnUserLeaveHintListener = -1;
                    return;
                }
                if (i4 == 4) {
                    simpleDropShadowElement.write = i3;
                    simpleDropShadowElement.MediaDescriptionCompat = -1;
                    simpleDropShadowElement.RatingCompat = -1;
                    simpleDropShadowElement.getFullyDrawnReporter = -1;
                    simpleDropShadowElement.addOnUserLeaveHintListener = -1;
                    return;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                return;
            case 6:
                if (i4 == 6) {
                    simpleDropShadowElement.addOnPictureInPictureModeChangedListener = i3;
                    simpleDropShadowElement.addOnTrimMemoryListener = -1;
                } else if (i4 == 7) {
                    simpleDropShadowElement.addOnTrimMemoryListener = i3;
                    simpleDropShadowElement.addOnPictureInPictureModeChangedListener = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.enterPictureInPictureMode = i5;
                return;
            case 7:
                if (i4 == 7) {
                    simpleDropShadowElement.ComponentActivity = i3;
                    simpleDropShadowElement.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -1;
                } else if (i4 == 6) {
                    simpleDropShadowElement.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
                    simpleDropShadowElement.ComponentActivity = -1;
                } else {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("right to ", IconCompatParcelizer(i4), " undefined");
                    return;
                }
                simpleDropShadowElement.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5;
                return;
            default:
                throw new IllegalArgumentException(IconCompatParcelizer(i2) + " to " + IconCompatParcelizer(i4) + " unknown");
        }
    }

    public static String IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void applyToInternal(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.RemoteActionCompatParcelizer;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                SentryLogcatAdapter.IconCompatParcelizer("ConstraintSet", "id unknown " + r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.write(childAt));
            } else {
                if (this.write && id == -1) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    ShadowScope shadowScope = (ShadowScope) map.get(Integer.valueOf(id));
                    if (shadowScope != null) {
                        ShadowScopeDefaultImpls shadowScopeDefaultImpls = shadowScope.write;
                        SimpleDropShadowElement simpleDropShadowElement = shadowScope.IconCompatParcelizer;
                        SimpleDropShadowNode simpleDropShadowNode = shadowScope.RatingCompat;
                        if (childAt instanceof dropShadow) {
                            simpleDropShadowElement.onBackPressedDispatcher_delegatelambda0 = 1;
                            dropShadow dropshadow = (dropShadow) childAt;
                            dropshadow.setId(id);
                            dropshadow.setType(simpleDropShadowElement.getSavedStateRegistryControllerannotations);
                            dropshadow.setMargin(simpleDropShadowElement.menuHostHelperlambda0);
                            dropshadow.setAllowsGoneWidget(simpleDropShadowElement.fullyDrawnReporter_delegatelambda0);
                            int[] iArr = simpleDropShadowElement.onBackPressedDispatcher_delegatelambda010;
                            if (iArr != null) {
                                dropshadow.setReferencedIds(iArr);
                            } else {
                                String str = simpleDropShadowElement.addContentView;
                                if (str != null) {
                                    int[] iArrConvertReferenceString = convertReferenceString(dropshadow, str);
                                    simpleDropShadowElement.onBackPressedDispatcher_delegatelambda010 = iArrConvertReferenceString;
                                    dropshadow.setReferencedIds(iArrConvertReferenceString);
                                }
                            }
                        }
                        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) childAt.getLayoutParams();
                        shadows4czxiidefault.RemoteActionCompatParcelizer();
                        shadowScope.RemoteActionCompatParcelizer(shadows4czxiidefault);
                        getSpotColor0d7_KjU.RemoteActionCompatParcelizer(childAt, shadowScope.serializer);
                        childAt.setLayoutParams(shadows4czxiidefault);
                        if (shadowScopeDefaultImpls.write == 0) {
                            childAt.setVisibility(shadowScopeDefaultImpls.serializer);
                        }
                        childAt.setAlpha(shadowScopeDefaultImpls.read);
                        childAt.setRotation(simpleDropShadowNode.RemoteActionCompatParcelizer);
                        childAt.setRotationX(simpleDropShadowNode.serializer);
                        childAt.setRotationY(simpleDropShadowNode.RatingCompat);
                        childAt.setScaleX(simpleDropShadowNode.MediaSessionCompatQueueItem);
                        childAt.setScaleY(simpleDropShadowNode.MediaDescriptionCompat);
                        if (simpleDropShadowNode.MediaBrowserCompatMediaItem != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(simpleDropShadowNode.MediaBrowserCompatMediaItem);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = childAt.getLeft();
                                    float top = childAt.getTop();
                                    childAt.setPivotX(right - left);
                                    childAt.setPivotY(bottom - top);
                                }
                            }
                        } else {
                            if (!Float.isNaN(simpleDropShadowNode.MediaMetadataCompat)) {
                                childAt.setPivotX(simpleDropShadowNode.MediaMetadataCompat);
                            }
                            if (!Float.isNaN(simpleDropShadowNode.PlaybackStateCompatCustomAction)) {
                                childAt.setPivotY(simpleDropShadowNode.PlaybackStateCompatCustomAction);
                            }
                        }
                        childAt.setTranslationX(simpleDropShadowNode.PlaybackStateCompat);
                        childAt.setTranslationY(simpleDropShadowNode.MediaSessionCompatToken);
                        childAt.setTranslationZ(simpleDropShadowNode.MediaSessionCompatResultReceiverWrapper);
                        if (simpleDropShadowNode.write) {
                            childAt.setElevation(simpleDropShadowNode.IconCompatParcelizer);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            ShadowScope shadowScope2 = (ShadowScope) map.get(num);
            if (shadowScope2 != null) {
                SimpleDropShadowElement simpleDropShadowElement2 = shadowScope2.IconCompatParcelizer;
                if (simpleDropShadowElement2.onBackPressedDispatcher_delegatelambda0 == 1) {
                    dropShadow dropshadow2 = new dropShadow(constraintLayout.getContext());
                    dropshadow2.setId(num.intValue());
                    int[] iArr2 = simpleDropShadowElement2.onBackPressedDispatcher_delegatelambda010;
                    if (iArr2 != null) {
                        dropshadow2.setReferencedIds(iArr2);
                    } else {
                        String str2 = simpleDropShadowElement2.addContentView;
                        if (str2 != null) {
                            int[] iArrConvertReferenceString2 = convertReferenceString(dropshadow2, str2);
                            simpleDropShadowElement2.onBackPressedDispatcher_delegatelambda010 = iArrConvertReferenceString2;
                            dropshadow2.setReferencedIds(iArrConvertReferenceString2);
                        }
                    }
                    dropshadow2.setType(simpleDropShadowElement2.getSavedStateRegistryControllerannotations);
                    dropshadow2.setMargin(simpleDropShadowElement2.menuHostHelperlambda0);
                    isCanceled iscanceled = ConstraintLayout.write;
                    shadows4CzXIIdefault shadows4czxiidefault2 = new shadows4CzXIIdefault(-2);
                    dropshadow2.RemoteActionCompatParcelizer();
                    shadowScope2.RemoteActionCompatParcelizer(shadows4czxiidefault2);
                    constraintLayout.addView(dropshadow2, shadows4czxiidefault2);
                }
                if (simpleDropShadowElement2.onBackPressedDispatcher_delegatelambda00) {
                    View simpleInnerShadowElement = new SimpleInnerShadowElement(constraintLayout.getContext());
                    simpleInnerShadowElement.setId(num.intValue());
                    isCanceled iscanceled2 = ConstraintLayout.write;
                    shadows4CzXIIdefault shadows4czxiidefault3 = new shadows4CzXIIdefault(-2);
                    shadowScope2.RemoteActionCompatParcelizer(shadows4czxiidefault3);
                    constraintLayout.addView(simpleInnerShadowElement, shadows4czxiidefault3);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).RemoteActionCompatParcelizer(constraintLayout);
            }
        }
    }

    public static int read(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }
}
