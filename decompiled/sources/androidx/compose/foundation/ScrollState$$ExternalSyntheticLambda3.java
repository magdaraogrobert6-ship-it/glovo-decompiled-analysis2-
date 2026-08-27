package androidx.compose.foundation;

import android.content.DialogInterface;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt;
import androidx.sqlite.SQLite;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import java.util.Map;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import o.BlockDropShadowNode;
import o.ForgottenCoroutineScopeException;
import o.SelectionHandleIcon;
import o.alpha;
import o.buildMapping;
import o.createFromParcel;
import o.equals;
import o.fractionVisibleInRect;
import o.getBirthDateFull;
import o.getCurrent;
import o.getNewPassword;
import o.getOnFill;
import o.getPostalCode;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY;
import o.onRemeasuredozmzZPI;
import o.onShowTranslationui;
import o.performMeasureDjhGOtQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.relativeMoveTo;
import o.requiredWidthInVpY3zN4default;
import o.setBlock;
import o.textLayoutConstraintsv_w8tDc;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ScrollState$$ExternalSyntheticLambda3 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ScrollState$$ExternalSyntheticLambda3(int i) {
        this.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa A[PHI: r15
  0x01fa: PHI (r15v7 java.lang.Object) = (r15v6 java.lang.Object), (r15v9 java.lang.Object) binds: [B:68:0x01f8, B:65:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe A[PHI: r5 r15
  0x01fe: PHI (r5v14 java.util.Map) = (r5v13 java.util.Map), (r5v19 java.util.Map) binds: [B:68:0x01f8, B:65:0x01e4] A[DONT_GENERATE, DONT_INLINE]
  0x01fe: PHI (r15v8 java.lang.Object) = (r15v6 java.lang.Object), (r15v9 java.lang.Object) binds: [B:68:0x01f8, B:65:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x020a A[LOOP:0: B:56:0x01a3->B:74:0x020a, LOOP_END] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Map mapPerformSave;
        boolean z;
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 0;
        switch (i2) {
            case 0:
                return Integer.valueOf(((ScrollState) obj2).serializer());
            case 1:
                LazyListState lazyListState = (LazyListState) obj2;
                return SQLite.read(Integer.valueOf(lazyListState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaSessionCompatQueueItem()), Integer.valueOf(lazyListState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.MediaDescriptionCompat()));
            case 2:
                Map mapPerformSave2 = ((getCurrent) obj2).performSave();
                if (!mapPerformSave2.isEmpty()) {
                    return mapPerformSave2;
                }
                int i4 = read + 63;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            case 3:
                ForgottenCoroutineScopeException forgottenCoroutineScopeException = (ForgottenCoroutineScopeException) obj2;
                return SQLite.read(Integer.valueOf(forgottenCoroutineScopeException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer()), Float.valueOf(RangesKt.write(forgottenCoroutineScopeException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.IconCompatParcelizer(), -0.5f, 0.5f)), Integer.valueOf(forgottenCoroutineScopeException.read()));
            case 4:
                equals equalsVar = (equals) obj2;
                return SQLite.read(Float.valueOf(equalsVar.serializer()), Boolean.valueOf(((SelectionHandleIcon) ((onShowTranslationui) equalsVar.read).getValue()) == SelectionHandleIcon.Vertical));
            case 5:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            case 9:
                return ((SheetState) obj2).IconCompatParcelizer();
            case 10:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            case 14:
                return (Float) ((getOnFill) obj2).write.write();
            case 15:
                BlockDropShadowNode blockDropShadowNode = (BlockDropShadowNode) obj2;
                Map map = blockDropShadowNode.IconCompatParcelizer;
                onRemeasuredozmzZPI onremeasuredozmzzpi = blockDropShadowNode.RemoteActionCompatParcelizer;
                Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
                Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
                long[] jArr = onremeasuredozmzzpi.write;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = i3; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = RemoteActionCompatParcelizer + 67;
                                    read = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 == 0) {
                                        int i10 = (i6 >>> 5) * i8;
                                        obj3 = objArr[i10];
                                        mapPerformSave = ((alpha) objArr2[i10]).performSave();
                                        if (mapPerformSave.isEmpty()) {
                                            map.remove(obj3);
                                        } else {
                                            map.put(obj3, mapPerformSave);
                                        }
                                    } else {
                                        int i11 = (i6 << 3) + i8;
                                        obj3 = objArr[i11];
                                        mapPerformSave = ((alpha) objArr2[i11]).performSave();
                                        if (mapPerformSave.isEmpty()) {
                                            map.remove(obj3);
                                        } else {
                                            map.put(obj3, mapPerformSave);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                    i3 = 0;
                                }
                            }
                        } else if (i6 != length) {
                            i6++;
                            i3 = 0;
                        }
                    }
                }
                if (!map.isEmpty()) {
                    return map;
                }
                int i12 = RemoteActionCompatParcelizer + 89;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    return null;
                }
                throw null;
            case 16:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$0((setBlock) obj, (PlatformParagraphStyle) obj2);
            case 17:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$0((setBlock) obj, (EmojiSupportMatch) obj2);
            case 18:
                return Savers_androidKt.LineBreakSaver$lambda$0((setBlock) obj, (LineBreak) obj2);
            case 19:
                return Savers_androidKt.TextMotionSaver$lambda$0((setBlock) obj, (TextMotion) obj2);
            case 20:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$0((setBlock) obj, (TextMotion.Linearity) obj2);
            case 21:
                return ComposableSingletons$ComposeViewAdapter_androidKt.lambda__1163195098$lambda$0((getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 22:
                return ComposableSingletons$ComposeViewAdapter_androidKt.lambda_2086912010$lambda$0((getBirthDateFull) obj, ((Integer) obj2).intValue());
            case 23:
                return ((relativeMoveTo) obj2).IconCompatParcelizer();
            case 24:
                ((DialogInterface) obj).getClass();
                ((getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY) obj2).getClass();
                return createfromparcel;
            case 25:
                ((Integer) obj).intValue();
                fractionVisibleInRect fractionvisibleinrect = (fractionVisibleInRect) obj2;
                fractionvisibleinrect.getClass();
                return Long.valueOf(fractionvisibleinrect.read);
            case 26:
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                } else {
                    BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.removeOnContextAvailableListener), RoundedCornerShapeKt.IconCompatParcelizer), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
                }
                return createfromparcel;
            case 27:
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    textLayoutConstraintsv_w8tDc.RemoteActionCompatParcelizer(null, getpostalcode2, 0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            case 28:
                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if ((iIntValue3 & 3) != 2) {
                    int i13 = read + 79;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                if (getpostalcode3.write(iIntValue3 & 1, z)) {
                    int i15 = read + 9;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    BoxKt.Box(SizeKt.m84sizeVpY3zN4(Modifier.Companion, Dimensions.setWindowCallback, Dimensions.getActionBarHideOffset), getpostalcode3, 0);
                } else {
                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i17 = RemoteActionCompatParcelizer + 47;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                }
                return createfromparcel;
            default:
                return (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{50, 0, null, 6});
        }
    }
}
