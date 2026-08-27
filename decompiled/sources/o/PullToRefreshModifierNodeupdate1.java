package o;

import android.view.View;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import coil3.disk.DiskLruCache$Editor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgz;

/* JADX INFO: loaded from: classes.dex */
public abstract class PullToRefreshModifierNodeupdate1 {
    public static final void write(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final androidx.compose.ui.Modifier modifier, final RadioButtonTokens radioButtonTokens, final CheckboxTokens checkboxTokens, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1055276397);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(radioButtonTokens) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0 ? getpostalcode.read(checkboxTokens) : getpostalcode.IconCompatParcelizer(checkboxTokens) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = androidx.compose.runtime.CompositionKt.serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode);
            zzgz.serializer(coil3.ExtrasKt.write(-933153643, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.DividerTokens
                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.ui.Modifier modifierThen;
                    AlphaKt alphaKt = (AlphaKt) obj;
                    ((Integer) obj3).getClass();
                    getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj2);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new animateToHidden(alphaKt, new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7Serializer, 0));
                        getpostalcode2.write(objComponentActivity);
                    }
                    final animateToHidden animatetohidden = (animateToHidden) objComponentActivity;
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState = new androidx.compose.ui.layout.SubcomposeLayoutState(new androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy(animatetohidden));
                        getpostalcode2.write(subcomposeLayoutState);
                        objComponentActivity2 = subcomposeLayoutState;
                    }
                    final androidx.compose.ui.layout.SubcomposeLayoutState subcomposeLayoutState2 = (androidx.compose.ui.layout.SubcomposeLayoutState) objComponentActivity2;
                    final RadioButtonTokens radioButtonTokens2 = radioButtonTokens;
                    if (radioButtonTokens2 != null) {
                        getpostalcode2.serializer(1743490539);
                        getpostalcode2.serializer(887527095);
                        final withFrameNanos withframenanos = ComposePausableCompositionException.write;
                        if (withframenanos != null) {
                            getpostalcode2.serializer(1345554384);
                        } else {
                            getpostalcode2.serializer(1345603457);
                            View view = (View) getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                            boolean z = getpostalcode2.read(view);
                            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                            if (z || objComponentActivity3 == androidContentCaptureManager) {
                                Object tag = view.getTag(com.logistics.rider.glovo.R.id.compose_prefetch_scheduler);
                                objComponentActivity3 = tag instanceof withFrameNanos ? (withFrameNanos) tag : null;
                                if (objComponentActivity3 == null) {
                                    objComponentActivity3 = new androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler(view);
                                    view.setTag(com.logistics.rider.glovo.R.id.compose_prefetch_scheduler, objComponentActivity3);
                                }
                                getpostalcode2.write(objComponentActivity3);
                            }
                            withframenanos = (withFrameNanos) objComponentActivity3;
                        }
                        getpostalcode2.IconCompatParcelizer(false);
                        getpostalcode2.IconCompatParcelizer(false);
                        Object[] objArr = {radioButtonTokens2, animatetohidden, subcomposeLayoutState2, withframenanos};
                        boolean z2 = getpostalcode2.read(radioButtonTokens2);
                        boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(animatetohidden);
                        boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(subcomposeLayoutState2);
                        boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(withframenanos);
                        Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                        if ((z2 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ButtonSmallTokens
                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj4) {
                                    DiskLruCache$Editor diskLruCache$Editor = new DiskLruCache$Editor(animatetohidden, subcomposeLayoutState2, withframenanos, 1);
                                    RadioButtonTokens radioButtonTokens3 = radioButtonTokens2;
                                    radioButtonTokens3.IconCompatParcelizer = diskLruCache$Editor;
                                    return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(4, radioButtonTokens3);
                                }
                            };
                            getpostalcode2.write(objComponentActivity4);
                        }
                        getPhoneNumberNational.RemoteActionCompatParcelizer(objArr, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode2);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        getpostalcode2.serializer(1744076749);
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    int i3 = FilledCardTokens.IconCompatParcelizer;
                    androidx.compose.ui.Modifier modifier2 = modifier;
                    if (radioButtonTokens2 == null || (modifierThen = modifier2.then(new GapComposerExternalSyntheticLambda3(radioButtonTokens2))) == null) {
                        modifierThen = modifier2;
                    }
                    boolean z3 = getpostalcode2.read(animatetohidden);
                    CheckboxTokens checkboxTokens2 = checkboxTokens;
                    boolean z4 = getpostalcode2.read(checkboxTokens2);
                    Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if ((z3 | z4) || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new GapComposerKt$$ExternalSyntheticLambda0(animatetohidden, 4, checkboxTokens2);
                        getpostalcode2.write(objComponentActivity5);
                    }
                    androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState2, modifierThen, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5, getpostalcode2, androidx.compose.ui.layout.SubcomposeLayoutState.$stable, 0);
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 6);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(i, 1, modifier, radioButtonTokens, checkboxTokens, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
