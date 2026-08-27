package androidx.compose.ui.tooling;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ah$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import java.util.Arrays;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.SwitchKt;
import o.addOnNewIntentListener;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onHideTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable = 8;
    private final String TAG = "PreviewActivity";

    private final void setComposableContent(String str) {
        String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, '.');
        String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', str, str);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            setParameterizedContent(strRemoteActionCompatParcelizer, strIconCompatParcelizer, stringExtra);
        } else {
            addOnNewIntentListener.RemoteActionCompatParcelizer(this, new DragAndDropTargetModifierNode(new GapComposerKt$$ExternalSyntheticLambda0(strRemoteActionCompatParcelizer, 11, strIconCompatParcelizer), true, -840626948));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setParameterizedContent$lambda$0$1$0$0(getPlatformAndroidManager getplatformandroidmanager, Object[] objArr) {
        onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
        onhidetranslationui.serializer((onhidetranslationui.serializer() + 1) % objArr.length);
        return createFromParcel.INSTANCE;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        setComposableContent(stringExtra);
    }

    private final void setParameterizedContent(String str, String str2, String str3) {
        Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (previewProviderParameters.length > 1) {
            addOnNewIntentListener.RemoteActionCompatParcelizer(this, new DragAndDropTargetModifierNode(new PreviewActivity$$ExternalSyntheticLambda4(previewProviderParameters, str, str2), true, -861939235));
        } else {
            addOnNewIntentListener.RemoteActionCompatParcelizer(this, new DragAndDropTargetModifierNode(new PreviewActivity$$ExternalSyntheticLambda4(str, str2, previewProviderParameters), true, -1901447514));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setParameterizedContent$lambda$0$2(String str, String str2, Object[] objArr, getPlatformAndroidManager getplatformandroidmanager, SwitchKt switchKt, getBirthDateFull getbirthdatefull, int i) {
        if ((i & 6) == 0) {
            i |= ((getPostalCode) getbirthdatefull).read(switchKt) ? 4 : 2;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 19) != 18)) {
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                ComposableInvoker.INSTANCE.invokeComposable(str, str2, getpostalcode, objArr[((onHideTranslationui) getplatformandroidmanager).serializer()]);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setParameterizedContent$lambda$1(String str, String str2, Object[] objArr, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            ComposableInvoker.INSTANCE.invokeComposable(str, str2, getpostalcode, Arrays.copyOf(objArr, objArr.length));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setComposableContent$lambda$1(String str, String str2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            ComposableInvoker.INSTANCE.invokeComposable(str, str2, getpostalcode, new Object[0]);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setParameterizedContent$lambda$0$1(Object[] objArr, getPlatformAndroidManager getplatformandroidmanager, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(objArr);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new ah$$ExternalSyntheticLambda0(getplatformandroidmanager, 17, objArr);
                getpostalcode.write(objComponentActivity);
            }
            FloatingActionButtonKt.IconCompatParcelizer((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, null, 0L, 0L, null, ComposableSingletons$PreviewActivity_androidKt.INSTANCE.getLambda$558638247$ui_tooling(), getpostalcode, 12582912);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel setParameterizedContent$lambda$0(Object[] objArr, String str, String str2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = CompositionKt.read(0);
                getpostalcode.write(objComponentActivity);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity;
            ScaffoldKt.serializer(null, null, null, null, ExtrasKt.write(-531963740, new GapComposerKt$$ExternalSyntheticLambda0(objArr, 10, getplatformandroidmanager), getpostalcode), 0, 0L, 0L, null, ExtrasKt.write(993072492, new PreviewActivity$$ExternalSyntheticLambda2(str, str2, objArr, getplatformandroidmanager, 0), getpostalcode), getpostalcode, 805330944, 495);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
