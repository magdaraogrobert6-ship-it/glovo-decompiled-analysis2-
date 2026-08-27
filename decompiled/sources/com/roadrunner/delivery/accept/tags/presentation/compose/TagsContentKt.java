package com.roadrunner.delivery.accept.tags.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.ArrayList;
import kotlinx.coroutines.flow.StateFlow;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFileDescriptorFont;
import o.AndroidFontKt;
import o.AndroidFontTypefaceLoader;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PagerWrapperFlingBehavior;
import o.TextFieldDefaults;
import o.getAssetManager;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getTypeface;
import o.getVariationSettings;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagsContentKt {
    private static int read = 1;
    private static int write;

    public static final void IconCompatParcelizer(StateFlow stateFlow, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        stateFlow.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1369492916);
        if ((i & 6) == 0) {
            int i4 = write + 57;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(stateFlow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            int i7 = write + 97;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            modifier = Modifier.Companion;
            AndroidFileDescriptorFont androidFileDescriptorFont = (AndroidFileDescriptorFont) ExtrasKt.write(stateFlow, getpostalcode, i6 & 14).getValue();
            if (androidFileDescriptorFont instanceof getAssetManager) {
                getpostalcode.serializer(-668912180);
                Tags((getAssetManager) androidFileDescriptorFont, modifier, getpostalcode, i6 & 112);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-668835114);
                getpostalcode.IconCompatParcelizer(false);
                int i9 = read + 95;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 4;
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(stateFlow, modifier, i, 29);
        }
    }

    public static final void write(getTypeface gettypeface, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        String str;
        Modifier modifier;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2030895427);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i9 = write + 101;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode.read(gettypeface);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettypeface);
            }
            if (zIconCompatParcelizer) {
                i7 = 4;
            } else {
                int i11 = write + 31;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 3) == 2))) {
            int i13 = AndroidFontKt.IconCompatParcelizer[gettypeface.IconCompatParcelizer.ordinal()];
            if (i13 == 1) {
                getpostalcode.serializer(-1775350147);
                TagsKt.RemoteActionCompatParcelizer(gettypeface.RemoteActionCompatParcelizer, null, 0, 0, getpostalcode, 0, 30);
                getpostalcode.IconCompatParcelizer(false);
            } else if (i13 == 2) {
                getpostalcode.serializer(-1775348069);
                TagsKt.MediaBrowserCompatMediaItem(gettypeface.RemoteActionCompatParcelizer, null, 0, 0, getpostalcode, 0, 30);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (i13 != 3) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1775351661, false);
                }
                int i14 = write + 79;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode.serializer(-1775346211);
                    str = gettypeface.RemoteActionCompatParcelizer;
                    modifier = null;
                    i3 = 0;
                    i4 = 1;
                    i5 = 0;
                    i6 = 111;
                } else {
                    getpostalcode.serializer(-1775346211);
                    str = gettypeface.RemoteActionCompatParcelizer;
                    modifier = null;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    i6 = 30;
                }
                TagsKt.write(str, modifier, i3, i4, getpostalcode, i5, i6);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getVariationSettings(gettypeface, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r1 r3
  0x0048: PHI (r1v36 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v37 java.util.ArrayList) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r3v19 o.getPostalCode) = (r3v1 o.getPostalCode), (r3v21 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1 r3
  0x0032: PHI (r1v5 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v37 java.util.ArrayList) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r3v2 o.getPostalCode) = (r3v1 o.getPostalCode), (r3v21 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Tags(getAssetManager getassetmanager, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        ArrayList arrayList;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        ArrayList arrayList2;
        getPostalCode getpostalcode2;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 63;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            arrayList = getassetmanager.RemoteActionCompatParcelizer;
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1256579539);
            if ((i & 119) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getassetmanager);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getassetmanager);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                arrayList2 = arrayList;
                getpostalcode2 = getpostalcode;
            } else {
                i4 = read + 25;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i7 = 4 / 5;
                }
                arrayList2 = arrayList;
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            arrayList = getassetmanager.RemoteActionCompatParcelizer;
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1256579539);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getassetmanager);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getassetmanager);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                arrayList2 = arrayList;
                getpostalcode2 = getpostalcode;
            } else {
                i4 = read + 25;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i8 = 4 / 5;
                }
                arrayList2 = arrayList;
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i9 = 0;
        if ((i3 & 19) != 18) {
            int i10 = write + 65;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i3 & 1, z))) {
            int i12 = read + 81;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier.getClass();
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierSerializer = PagerWrapperFlingBehavior.serializer(PaddingKt.m74paddingqDBjuR0$default(modifier, f, f, 0.0f, 0.0f, 12), PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), true, false);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierSerializer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 5;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                Object obj = null;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(1712709045);
            int i15 = 0;
            for (Object obj2 : arrayList2) {
                if (i15 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                write((getTypeface) obj2, getpostalcode2, 0);
                if (i15 == arrayList2.size() - 1) {
                    getpostalcode2.serializer(-2083718184);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(Modifier.Companion, Dimensions.getActionBarHideOffset)});
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-2083645148);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                i15++;
            }
            getpostalcode2.IconCompatParcelizer(false);
            getpostalcode2.IconCompatParcelizer(true);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i16 = read + 97;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, i9, getassetmanager, modifier);
        }
    }
}
