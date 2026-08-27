package androidx.compose.material3;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import com.mapbox.navigation.core.MapboxNavigation;
import o.AndroidAutofillManager_androidKt;
import o.AndroidAutofillManagerrequestAutofill1;
import o.AutofillTree;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.getBirthDateFull;
import o.getChildren;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPointerInputFilterannotations;
import o.getPostalCode;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.onViewAttachedToWindow;
import o.position;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.resolvePointerPrecision;
import o.runDetachLifecycleui;
import o.setChildui;
import o.setText;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final OutlinedTextFieldDefaults IconCompatParcelizer = new OutlinedTextFieldDefaults();
    public static final float serializer = Dp.m3673constructorimpl(56.0f);
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(280.0f);
    public static final float write = Dp.m3673constructorimpl(1.0f);
    public static final float read = Dp.m3673constructorimpl(2.0f);

    public static TextFieldColors RemoteActionCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, getBirthDateFull getbirthdatefull, int i) {
        Color.Companion companion = Color.Companion;
        long jM758getUnspecified0d7_KjU = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU2 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU3 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU4 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU5 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU6 = (i & Fields.RotationX) != 0 ? companion.m758getUnspecified0d7_KjU() : j4;
        long jM758getUnspecified0d7_KjU7 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU8 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU9 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU10 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU11 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU12 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU13 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU14 = (4194304 & i) != 0 ? companion.m758getUnspecified0d7_KjU() : j10;
        long jM758getUnspecified0d7_KjU15 = (8388608 & i) != 0 ? companion.m758getUnspecified0d7_KjU() : j11;
        long jM758getUnspecified0d7_KjU16 = (16777216 & i) != 0 ? companion.m758getUnspecified0d7_KjU() : j12;
        long jM758getUnspecified0d7_KjU17 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU18 = (i & 134217728) != 0 ? companion.m758getUnspecified0d7_KjU() : j14;
        long jM758getUnspecified0d7_KjU19 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU20 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU21 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU22 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU23 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU24 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU25 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU26 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU27 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU28 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU29 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU30 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU31 = companion.m758getUnspecified0d7_KjU();
        long jM758getUnspecified0d7_KjU32 = companion.m758getUnspecified0d7_KjU();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
        TextFieldColors textFieldColorsM128copyejIjP34 = getviewingdistancetkromq.RatingCompat;
        if (textFieldColorsM128copyejIjP34 == null) {
            getpostalcode.serializer(390452338);
            getpostalcode.IconCompatParcelizer(false);
            textFieldColorsM128copyejIjP34 = null;
        } else {
            getpostalcode.serializer(390452339);
            setChildui setchildui = (setChildui) getpostalcode.write((getNewPassword) runDetachLifecycleui.read);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textFieldColorsM128copyejIjP34._init_lambda1, setchildui}, getCieXyz.write())).booleanValue()) {
                textFieldColorsM128copyejIjP34 = textFieldColorsM128copyejIjP34.m128copyejIjP34(textFieldColorsM128copyejIjP34._init_lambda3, textFieldColorsM128copyejIjP34.fullyDrawnReporter_delegatelambda00, textFieldColorsM128copyejIjP34.RatingCompat, textFieldColorsM128copyejIjP34.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, textFieldColorsM128copyejIjP34.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, textFieldColorsM128copyejIjP34.accessensureViewModelStore, textFieldColorsM128copyejIjP34.write, textFieldColorsM128copyejIjP34.MediaSessionCompatResultReceiverWrapper, textFieldColorsM128copyejIjP34.RemoteActionCompatParcelizer, textFieldColorsM128copyejIjP34.ParcelableVolumeInfo, setchildui, textFieldColorsM128copyejIjP34.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, textFieldColorsM128copyejIjP34._init_lambda2, textFieldColorsM128copyejIjP34.IconCompatParcelizer, textFieldColorsM128copyejIjP34.PlaybackStateCompat, textFieldColorsM128copyejIjP34.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, textFieldColorsM128copyejIjP34.createFullyDrawnExecutor, textFieldColorsM128copyejIjP34.read, textFieldColorsM128copyejIjP34.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, textFieldColorsM128copyejIjP34._init_lambda4, textFieldColorsM128copyejIjP34.getSavedStateRegistryControllerannotations, textFieldColorsM128copyejIjP34.MediaSessionCompatToken, textFieldColorsM128copyejIjP34.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, textFieldColorsM128copyejIjP34.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, textFieldColorsM128copyejIjP34.addObserverForBackInvokerlambda0, textFieldColorsM128copyejIjP34.serializer, textFieldColorsM128copyejIjP34.PlaybackStateCompatCustomAction, textFieldColorsM128copyejIjP34.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, textFieldColorsM128copyejIjP34.ensureViewModelStore, textFieldColorsM128copyejIjP34.MediaBrowserCompatMediaItem, textFieldColorsM128copyejIjP34.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, textFieldColorsM128copyejIjP34.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, textFieldColorsM128copyejIjP34.menuHostHelperlambda0, textFieldColorsM128copyejIjP34.MediaSessionCompatQueueItem, textFieldColorsM128copyejIjP34.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, textFieldColorsM128copyejIjP34.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, textFieldColorsM128copyejIjP34.addObserverForBackInvoker, textFieldColorsM128copyejIjP34.MediaMetadataCompat, textFieldColorsM128copyejIjP34.ComponentActivity, textFieldColorsM128copyejIjP34.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, textFieldColorsM128copyejIjP34.defaultViewModelProviderFactory_delegatelambda0, textFieldColorsM128copyejIjP34.MediaDescriptionCompat, textFieldColorsM128copyejIjP34.ResultReceiver);
                getviewingdistancetkromq.RatingCompat = textFieldColorsM128copyejIjP34;
            }
            getpostalcode.IconCompatParcelizer(false);
        }
        if (textFieldColorsM128copyejIjP34 == null) {
            getpostalcode.serializer(-1788321191);
            long jSerializer = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.PlaybackStateCompatCustomAction);
            long jSerializer2 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            getChildren getchildren = OutlinedTextFieldTokens.serializer;
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer3 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaSessionCompatQueueItem);
            Color.Companion companion2 = Color.Companion;
            long jM757getTransparent0d7_KjU = companion2.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU2 = companion2.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU3 = companion2.m757getTransparent0d7_KjU();
            long jM757getTransparent0d7_KjU4 = companion2.m757getTransparent0d7_KjU();
            long jSerializer4 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.RemoteActionCompatParcelizer);
            long jSerializer5 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaBrowserCompatMediaItem);
            setChildui setchildui2 = (setChildui) getpostalcode.write((getNewPassword) runDetachLifecycleui.read);
            long jSerializer6 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.ResultReceiver);
            long jSerializer7 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            long jM721copywmQWz5c$default2 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.IconCompatParcelizer), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer8 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.PlaybackStateCompat);
            long jSerializer9 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            long jSerializer10 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            long jM721copywmQWz5c$default3 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.read), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer11 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.ParcelableVolumeInfo);
            long jSerializer12 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            long jSerializer13 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
            long jM721copywmQWz5c$default4 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.RatingCompat), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer14 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaSessionCompatResultReceiverWrapper);
            long jSerializer15 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
            long jSerializer16 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            long jM721copywmQWz5c$default5 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.write), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer17 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaMetadataCompat);
            getChildren getchildren2 = OutlinedTextFieldTokens.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            long jSerializer18 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2);
            long jSerializer19 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2);
            long jM721copywmQWz5c$default6 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer20 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren2);
            long jSerializer21 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.ComponentActivity);
            long jSerializer22 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            long jM721copywmQWz5c$default7 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaDescriptionCompat), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer23 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, OutlinedTextFieldTokens.MediaSessionCompatToken);
            getChildren getchildren3 = OutlinedTextFieldTokens.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            long jSerializer24 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren3);
            long jSerializer25 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren3);
            long jM721copywmQWz5c$default8 = Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren3), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jSerializer26 = getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren3);
            getChildren getchildren4 = OutlinedTextFieldTokens.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            textFieldColorsM128copyejIjP34 = new TextFieldColors(jSerializer, jSerializer2, jM721copywmQWz5c$default, jSerializer3, jM757getTransparent0d7_KjU, jM757getTransparent0d7_KjU2, jM757getTransparent0d7_KjU3, jM757getTransparent0d7_KjU4, jSerializer4, jSerializer5, setchildui2, jSerializer6, jSerializer7, jM721copywmQWz5c$default2, jSerializer8, jSerializer9, jSerializer10, jM721copywmQWz5c$default3, jSerializer11, jSerializer12, jSerializer13, jM721copywmQWz5c$default4, jSerializer14, jSerializer15, jSerializer16, jM721copywmQWz5c$default5, jSerializer17, jSerializer18, jSerializer19, jM721copywmQWz5c$default6, jSerializer20, jSerializer21, jSerializer22, jM721copywmQWz5c$default7, jSerializer23, jSerializer24, jSerializer25, jM721copywmQWz5c$default8, jSerializer26, getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren4), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren4), Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren4), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getchildren4));
            getviewingdistancetkromq.RatingCompat = textFieldColorsM128copyejIjP34;
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(-1788515437);
            getpostalcode.IconCompatParcelizer(false);
        }
        return textFieldColorsM128copyejIjP34.m128copyejIjP34(j, j2, jM758getUnspecified0d7_KjU, j3, jM758getUnspecified0d7_KjU2, jM758getUnspecified0d7_KjU3, jM758getUnspecified0d7_KjU4, jM758getUnspecified0d7_KjU5, jM758getUnspecified0d7_KjU6, j5, null, j6, j7, j8, j9, jM758getUnspecified0d7_KjU7, jM758getUnspecified0d7_KjU8, jM758getUnspecified0d7_KjU9, jM758getUnspecified0d7_KjU10, jM758getUnspecified0d7_KjU11, jM758getUnspecified0d7_KjU12, jM758getUnspecified0d7_KjU13, jM758getUnspecified0d7_KjU14, jM758getUnspecified0d7_KjU15, jM758getUnspecified0d7_KjU16, jM758getUnspecified0d7_KjU17, j13, jM758getUnspecified0d7_KjU18, jM758getUnspecified0d7_KjU19, jM758getUnspecified0d7_KjU20, j15, jM758getUnspecified0d7_KjU21, jM758getUnspecified0d7_KjU22, jM758getUnspecified0d7_KjU23, jM758getUnspecified0d7_KjU24, jM758getUnspecified0d7_KjU25, jM758getUnspecified0d7_KjU26, jM758getUnspecified0d7_KjU27, jM758getUnspecified0d7_KjU28, jM758getUnspecified0d7_KjU29, jM758getUnspecified0d7_KjU30, jM758getUnspecified0d7_KjU31, jM758getUnspecified0d7_KjU32);
    }

    public final void IconCompatParcelizer(final String str, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final boolean z3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, final TextFieldColors textFieldColors, o.SwitchKt switchKt, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        o.SwitchKt switchKt2;
        o.SwitchKt switchDefaults;
        int i5;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1732281618);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i & 3072;
        int i7 = Fields.CameraDistance;
        if (i6 == 0) {
            i3 |= getpostalcode.write(z2) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.read(visualTransformation) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= getpostalcode.read(mutableInteractionSourceImpl) ? Fields.RenderEffect : 65536;
        }
        int i8 = i & 1572864;
        int i9 = Fields.BlendMode;
        if (i8 == 0) {
            i3 |= getpostalcode.write(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer((Object) null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde5) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer((Object) null)) {
                i7 = Fields.RotationZ;
            }
            i4 |= i7;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode.read(textFieldColors) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= 65536;
        }
        if ((i2 & 1572864) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = 1048576;
            }
            i4 |= i9;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= getpostalcode.read(this) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i5 = i4 & (-458753);
                switchDefaults = switchKt;
            } else {
                float f = TextFieldImplKt.MediaSessionCompatQueueItem;
                switchDefaults = new o.SwitchDefaults(f, f, f, f);
                i5 = i4 & (-458753);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            boolean z4 = (i3 & 14) == 4;
            boolean z5 = (57344 & i3) == 16384;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z4 | z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = visualTransformation.filter(new AnnotatedString(str, null, 2, null));
                getpostalcode.write(objComponentActivity);
            }
            String text = ((TransformedText) objComponentActivity).getText().getText();
            setText settext = setText.Outlined;
            AndroidAutofillManager_androidKt androidAutofillManager_androidKt = new AndroidAutofillManager_androidKt();
            getpostalcode.serializer(1927058812);
            getpostalcode.IconCompatParcelizer(false);
            int i10 = i3 >> 9;
            int i11 = i5 << 21;
            TextFieldImplKt.CommonDecorationBox(settext, text, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidAutofillManager_androidKt, null, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, z2, z, z3, mutableInteractionSourceImpl, switchDefaults, textFieldColors, dragAndDropTargetModifierNode, getpostalcode, ((i3 << 3) & 896) | 6 | (i10 & 458752) | (i10 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), ((i3 >> 3) & 57344) | (i10 & 7168) | ((i5 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | ((i5 << 6) & 3670016) | ((i5 << 3) & 29360128));
            switchKt2 = switchDefaults;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            switchKt2 = switchKt;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final o.SwitchKt switchKt3 = switchKt2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.resolvePosture
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    this.IconCompatParcelizer.IconCompatParcelizer(str, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, z, z2, visualTransformation, mutableInteractionSourceImpl, z3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde5, textFieldColors, switchKt3, dragAndDropTargetModifierNode, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0121 A[PHI: r1 r5 r8
  0x0121: PHI (r1v29 int) = (r1v14 int), (r1v31 int) binds: [B:104:0x011b, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r5v9 androidx.compose.ui.Modifier) = (r5v6 androidx.compose.ui.Modifier), (r5v12 androidx.compose.ui.Modifier) binds: [B:104:0x011b, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]
  0x0121: PHI (r8v14 float) = (r8v7 float), (r8v15 float) binds: [B:104:0x011b, B:95:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:118:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0190  */
    /* JADX WARN: Code duplicated, block: B:123:0x0198  */
    /* JADX WARN: Code duplicated, block: B:124:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x01de  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:136:0x022d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0239  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX INFO: renamed from: Container-4EFweAY, reason: not valid java name */
    public final void m119Container4EFweAY(final boolean z, final boolean z2, final MutableInteractionSourceImpl mutableInteractionSourceImpl, Modifier modifier, final TextFieldColors textFieldColors, final Shape shape, float f, float f2, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        float f3;
        float f4;
        boolean z3;
        final Modifier modifier3;
        final float f5;
        final float f6;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        float f7;
        boolean zBooleanValue;
        long j;
        width widthVarSerializer;
        ?? r8;
        onViewAttachedToWindow onviewattachedtowindowSerializer;
        width widthVarSerializer2;
        onViewAttachedToWindow onviewattachedtowindowSerializer2;
        long j2;
        float f8;
        int i4;
        int i5;
        int i6;
        int i7;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1035477640);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.write(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(mutableInteractionSourceImpl) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i & 24576) == 0) {
                if (getpostalcode.read(textFieldColors)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if (getpostalcode.read(shape)) {
                    i6 = Fields.RenderEffect;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (getpostalcode.serializer(f3)) {
                        i5 = 1048576;
                    }
                    i3 |= i5;
                } else {
                    f3 = f;
                }
                i5 = Fields.BlendMode;
                i3 |= i5;
            } else {
                f3 = f;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & Fields.SpotShadowColor) == 0) {
                    f4 = f2;
                    int i9 = getpostalcode.serializer(f4) ? 8388608 : 4194304;
                    i3 |= i9;
                } else {
                    f4 = f2;
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            if ((100663296 & i) == 0) {
                if (getpostalcode.read(this)) {
                    i4 = 67108864;
                } else {
                    i4 = 33554432;
                }
                i3 |= i4;
            }
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i3 &= -29360129;
                    }
                    modifier3 = modifier2;
                    f7 = f3;
                } else {
                    if (i8 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f7 = read;
                    } else {
                        f7 = f3;
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                        i3 &= -29360129;
                        f6 = write;
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    zBooleanValue = ((Boolean) getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode, (i3 >> 6) & 14).getValue()).booleanValue();
                    float f9 = TextFieldImplKt.MediaSessionCompatQueueItem;
                    if (!z) {
                        j = textFieldColors.IconCompatParcelizer;
                    } else if (z2) {
                        j = textFieldColors.PlaybackStateCompat;
                    } else if (zBooleanValue) {
                        j = textFieldColors.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    } else {
                        j = textFieldColors._init_lambda2;
                    }
                    AutofillTree autofillTree = AutofillTree.FastEffects;
                    widthVarSerializer = resolvePointerPrecision.serializer(autofillTree, getpostalcode);
                    if (z) {
                        getpostalcode.serializer(-1674507999);
                        r8 = 0;
                        onviewattachedtowindowSerializer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, widthVarSerializer, null, null, getpostalcode, 0, 12);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        r8 = 0;
                        getpostalcode.serializer(-1674427244);
                        onviewattachedtowindowSerializer = CompositionKt.serializer(Color.m712boximpl(j), getpostalcode);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    onViewAttachedToWindow onviewattachedtowindow = onviewattachedtowindowSerializer;
                    widthVarSerializer2 = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode);
                    if (z) {
                        getpostalcode.serializer(-1674245832);
                        if (zBooleanValue) {
                            f8 = f7;
                        } else {
                            f8 = f6;
                        }
                        onviewattachedtowindowSerializer2 = TapGestureDetectorKtprocessTapGestureresetJob1.write(f8, widthVarSerializer2, null, getpostalcode, 0, 12);
                        getpostalcode.IconCompatParcelizer((boolean) r8);
                    } else {
                        getpostalcode.serializer(-1674063769);
                        onviewattachedtowindowSerializer2 = CompositionKt.serializer(Dp.m3671boximpl(f6), getpostalcode);
                        getpostalcode.IconCompatParcelizer((boolean) r8);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(DefaultPagerNestedScrollConnection.serializer(((Dp) onviewattachedtowindowSerializer2.getValue()).m3687unboximpl(), ((Color) onviewattachedtowindow.getValue()).m732unboximpl()), getpostalcode);
                    if (!z) {
                        j2 = textFieldColors.write;
                    } else if (z2) {
                        j2 = textFieldColors.MediaSessionCompatResultReceiverWrapper;
                    } else if (zBooleanValue) {
                        j2 = textFieldColors.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    } else {
                        j2 = textFieldColors.accessensureViewModelStore;
                    }
                    onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j2, resolvePointerPrecision.serializer(autofillTree, getpostalcode), null, null, getpostalcode, 0, 12);
                    position positionVar = (position) populateViewStructure_androidKtpopulate7Serializer.getValue();
                    BoxKt.Box(DrawModifierKt.drawWithCache(BorderKt.write(modifier3, positionVar.read, positionVar.IconCompatParcelizer, shape), new Navigator$$ExternalSyntheticLambda1(shape, 7, new AndroidAutofillManagerrequestAutofill1(new MapboxNavigation.AnonymousClass10(0, 3, onViewAttachedToWindow.class, onviewattachedtowindowIconCompatParcelizer, "value", "getValue()Ljava/lang/Object;")))), getpostalcode, r8);
                    f5 = f7;
                }
                f6 = f4;
                getpostalcode.RemoteActionCompatParcelizer();
                zBooleanValue = ((Boolean) getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode, (i3 >> 6) & 14).getValue()).booleanValue();
                float f10 = TextFieldImplKt.MediaSessionCompatQueueItem;
                if (!z) {
                    j = textFieldColors.IconCompatParcelizer;
                } else if (z2) {
                    j = textFieldColors.PlaybackStateCompat;
                } else if (zBooleanValue) {
                    j = textFieldColors.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                } else {
                    j = textFieldColors._init_lambda2;
                }
                AutofillTree autofillTree2 = AutofillTree.FastEffects;
                widthVarSerializer = resolvePointerPrecision.serializer(autofillTree2, getpostalcode);
                if (z) {
                    getpostalcode.serializer(-1674507999);
                    r8 = 0;
                    onviewattachedtowindowSerializer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, widthVarSerializer, null, null, getpostalcode, 0, 12);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    r8 = 0;
                    getpostalcode.serializer(-1674427244);
                    onviewattachedtowindowSerializer = CompositionKt.serializer(Color.m712boximpl(j), getpostalcode);
                    getpostalcode.IconCompatParcelizer(false);
                }
                onViewAttachedToWindow onviewattachedtowindow2 = onviewattachedtowindowSerializer;
                widthVarSerializer2 = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode);
                if (z) {
                    getpostalcode.serializer(-1674245832);
                    if (zBooleanValue) {
                        f8 = f7;
                    } else {
                        f8 = f6;
                    }
                    onviewattachedtowindowSerializer2 = TapGestureDetectorKtprocessTapGestureresetJob1.write(f8, widthVarSerializer2, null, getpostalcode, 0, 12);
                    getpostalcode.IconCompatParcelizer((boolean) r8);
                } else {
                    getpostalcode.serializer(-1674063769);
                    onviewattachedtowindowSerializer2 = CompositionKt.serializer(Dp.m3671boximpl(f6), getpostalcode);
                    getpostalcode.IconCompatParcelizer((boolean) r8);
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer2 = CompositionKt.serializer(DefaultPagerNestedScrollConnection.serializer(((Dp) onviewattachedtowindowSerializer2.getValue()).m3687unboximpl(), ((Color) onviewattachedtowindow2.getValue()).m732unboximpl()), getpostalcode);
                if (!z) {
                    j2 = textFieldColors.write;
                } else if (z2) {
                    j2 = textFieldColors.MediaSessionCompatResultReceiverWrapper;
                } else if (zBooleanValue) {
                    j2 = textFieldColors.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                } else {
                    j2 = textFieldColors.accessensureViewModelStore;
                }
                onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j2, resolvePointerPrecision.serializer(autofillTree2, getpostalcode), null, null, getpostalcode, 0, 12);
                position positionVar2 = (position) populateViewStructure_androidKtpopulate7Serializer2.getValue();
                BoxKt.Box(DrawModifierKt.drawWithCache(BorderKt.write(modifier3, positionVar2.read, positionVar2.IconCompatParcelizer, shape), new Navigator$$ExternalSyntheticLambda1(shape, 7, new AndroidAutofillManagerrequestAutofill1(new MapboxNavigation.AnonymousClass10(0, 3, onViewAttachedToWindow.class, onviewattachedtowindowIconCompatParcelizer2, "value", "getValue()Ljava/lang/Object;")))), getpostalcode, r8);
                f5 = f7;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                f5 = f3;
                f6 = f4;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isMicAvailable
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        this.read.m119Container4EFweAY(z, z2, mutableInteractionSourceImpl, modifier3, textFieldColors, shape, f5, f6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) == 0) {
            if (getpostalcode.read(textFieldColors)) {
                i7 = Fields.Clip;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.read(shape)) {
                i6 = Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f3 = f;
                if (getpostalcode.serializer(f3)) {
                    i5 = 1048576;
                }
                i3 |= i5;
            } else {
                f3 = f;
            }
            i5 = Fields.BlendMode;
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & Fields.SpotShadowColor) == 0) {
                f4 = f2;
                if (getpostalcode.serializer(f4)) {
                }
                i3 |= i9;
            } else {
                f4 = f2;
            }
            i3 |= i9;
        } else {
            f4 = f2;
        }
        if ((100663296 & i) == 0) {
            if (getpostalcode.read(this)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        if ((38347923 & i3) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i3 & 1, z3)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i8 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f7 = read;
                } else {
                    f7 = f3;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 &= -29360129;
                    f6 = write;
                } else {
                    f6 = f4;
                }
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    f7 = read;
                } else {
                    f7 = f3;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 &= -29360129;
                    f6 = write;
                } else {
                    f6 = f4;
                }
            }
            getpostalcode.RemoteActionCompatParcelizer();
            zBooleanValue = ((Boolean) getPointerInputFilterannotations.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode, (i3 >> 6) & 14).getValue()).booleanValue();
            float f11 = TextFieldImplKt.MediaSessionCompatQueueItem;
            if (!z) {
                j = textFieldColors.IconCompatParcelizer;
            } else if (z2) {
                j = textFieldColors.PlaybackStateCompat;
            } else if (zBooleanValue) {
                j = textFieldColors.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            } else {
                j = textFieldColors._init_lambda2;
            }
            AutofillTree autofillTree3 = AutofillTree.FastEffects;
            widthVarSerializer = resolvePointerPrecision.serializer(autofillTree3, getpostalcode);
            if (z) {
                getpostalcode.serializer(-1674507999);
                r8 = 0;
                onviewattachedtowindowSerializer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, widthVarSerializer, null, null, getpostalcode, 0, 12);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                r8 = 0;
                getpostalcode.serializer(-1674427244);
                onviewattachedtowindowSerializer = CompositionKt.serializer(Color.m712boximpl(j), getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindow3 = onviewattachedtowindowSerializer;
            widthVarSerializer2 = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode);
            if (z) {
                getpostalcode.serializer(-1674245832);
                if (zBooleanValue) {
                    f8 = f7;
                } else {
                    f8 = f6;
                }
                onviewattachedtowindowSerializer2 = TapGestureDetectorKtprocessTapGestureresetJob1.write(f8, widthVarSerializer2, null, getpostalcode, 0, 12);
                getpostalcode.IconCompatParcelizer((boolean) r8);
            } else {
                getpostalcode.serializer(-1674063769);
                onviewattachedtowindowSerializer2 = CompositionKt.serializer(Dp.m3671boximpl(f6), getpostalcode);
                getpostalcode.IconCompatParcelizer((boolean) r8);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer3 = CompositionKt.serializer(DefaultPagerNestedScrollConnection.serializer(((Dp) onviewattachedtowindowSerializer2.getValue()).m3687unboximpl(), ((Color) onviewattachedtowindow3.getValue()).m732unboximpl()), getpostalcode);
            if (!z) {
                j2 = textFieldColors.write;
            } else if (z2) {
                j2 = textFieldColors.MediaSessionCompatResultReceiverWrapper;
            } else if (zBooleanValue) {
                j2 = textFieldColors.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            } else {
                j2 = textFieldColors.accessensureViewModelStore;
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer3 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j2, resolvePointerPrecision.serializer(autofillTree3, getpostalcode), null, null, getpostalcode, 0, 12);
            position positionVar3 = (position) populateViewStructure_androidKtpopulate7Serializer3.getValue();
            BoxKt.Box(DrawModifierKt.drawWithCache(BorderKt.write(modifier3, positionVar3.read, positionVar3.IconCompatParcelizer, shape), new Navigator$$ExternalSyntheticLambda1(shape, 7, new AndroidAutofillManagerrequestAutofill1(new MapboxNavigation.AnonymousClass10(0, 3, onViewAttachedToWindow.class, onviewattachedtowindowIconCompatParcelizer3, "value", "getValue()Ljava/lang/Object;")))), getpostalcode, r8);
            f5 = f7;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            f5 = f3;
            f6 = f4;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isMicAvailable
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.read.m119Container4EFweAY(z, z2, mutableInteractionSourceImpl, modifier3, textFieldColors, shape, f5, f6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
