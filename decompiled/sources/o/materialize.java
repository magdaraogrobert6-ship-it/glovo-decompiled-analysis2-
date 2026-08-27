package o;

import android.content.Context;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import bo.app.ah$$ExternalSyntheticLambda0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.mapbox.search.utils.file.InternalFileSystem;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class materialize {
    public static final androidx.compose.ui.window.PopupProperties write = new androidx.compose.ui.window.PopupProperties(true, false, false, false, false, 30, (DefaultConstructorMarker) null);

    public static final void RemoteActionCompatParcelizer(ComposedModifierKt composedModifierKt, hashCodeimpl hashcodeimpl, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(composedModifierKt) : getpostalcode.IconCompatParcelizer(composedModifierKt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? getpostalcode.read(hashcodeimpl) : getpostalcode.IconCompatParcelizer(hashcodeimpl) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        boolean z = false;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && getpostalcode.read(hashcodeimpl));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                materializeModifier materializemodifier = new materializeModifier(new InternalFileSystem(new ah$$ExternalSyntheticLambda0(hashcodeimpl, 9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0)));
                getpostalcode.write(materializemodifier);
                objComponentActivity = materializemodifier;
            }
            materializeModifier materializemodifier2 = (materializeModifier) objComponentActivity;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && getpostalcode.IconCompatParcelizer(composedModifierKt))) {
                z = true;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new CoroutineLiveData$$ExternalSyntheticLambda0(15, composedModifierKt);
                getpostalcode.write(objComponentActivity2);
            }
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(materializemodifier2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, write, coil3.ExtrasKt.write(1315155414, new GapComposerKt$$ExternalSyntheticLambda0(hashcodeimpl, 7, composedModifierKt), getpostalcode), getpostalcode, 3456, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 5, composedModifierKt, hashcodeimpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void serializer(ComposedModifierKt composedModifierKt, any anyVar, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1904307118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(composedModifierKt) : getpostalcode.IconCompatParcelizer(composedModifierKt) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(anyVar) ? 32 : 16;
        }
        boolean z = true;
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getpostalcode.serializer(-1009482584);
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            getpostalcode.IconCompatParcelizer(false);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(anyVar);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !getpostalcode.IconCompatParcelizer(composedModifierKt))) {
                z = false;
            }
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(context);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | zIconCompatParcelizer | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(anyVar, context, composedModifierKt, 9);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.foundation.contextmenu.ContextMenuUiKt.write(null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0, 3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(i, 3, composedModifierKt, anyVar);
        }
    }

    public static final void write(final int i, final long j, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i2 | (getpostalcode.read(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.serializer(j) ? 32 : 16;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z = getpostalcode.read(context);
            boolean z2 = (i3 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | z) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                getpostalcode.write(objComponentActivity);
            }
            int iIntValue = ((Number) objComponentActivity).intValue();
            if (iIntValue == -1) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i4 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.composeddefault
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i6 = i2;
                        long j2 = j;
                        int i7 = i;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).intValue();
                        if (i5 != 0) {
                            materialize.write(i7, j2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                            return createfromparcel;
                        }
                        materialize.write(i7, j2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i6 | 1));
                        return createfromparcel;
                    }
                };
            } else {
                androidx.compose.ui.graphics.painter.Painter painterPainterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(iIntValue, getpostalcode, 0);
                boolean z3 = (i3 & 112) == 32;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = j == 16 ? null : androidx.compose.ui.graphics.ColorFilter.Companion.m763tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion, j, 0, 2, null);
                    getpostalcode.write(objComponentActivity2);
                }
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.draw.PainterModifierKt.paint$default(androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.foundation.contextmenu.ContextMenuSpec.MediaSessionCompatQueueItem), painterPainterResource, false, null, androidx.compose.ui.layout.ContentScale.Companion.getFit(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) objComponentActivity2, 22, null), getpostalcode, 0);
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i5 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.composeddefault
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i7 = i2;
                    long j2 = j;
                    int i8 = i;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).intValue();
                    if (i6 != 0) {
                        materialize.write(i8, j2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i7 | 1));
                        return createfromparcel;
                    }
                    materialize.write(i8, j2, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i7 | 1));
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void IconCompatParcelizer(androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1392105195);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getDefaultNSsRyOo.write(modifier, unboximpl.write, dragAndDropTargetModifierNode, getpostalcode, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKindSetui(modifier, dragAndDropTargetModifierNode, i, 3);
        }
    }
}
