package o;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusTargetModifierNodePYyLHbc extends InputConnectionWrapper {
    public final /* synthetic */ StreamSharing$$ExternalSyntheticLambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetModifierNodePYyLHbc(InputConnection inputConnection, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) {
        super(inputConnection, false);
        this.write = streamSharing$$ExternalSyntheticLambda0;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        androidx.camera.view.PendingValue pendingValue;
        Bundle bundle2;
        FocusOwnerImpltakeFocus1 focusProperties;
        if (inputContentInfo == null) {
            pendingValue = null;
        } else {
            pendingValue = new androidx.camera.view.PendingValue(26, new androidx.camera.view.PendingValue(25, inputContentInfo));
        }
        AppCompatDialogFragment appCompatDialogFragment = (AppCompatDialogFragment) this.write.serializer;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((androidx.camera.view.PendingValue) pendingValue.serializer).serializer).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((androidx.camera.view.PendingValue) pendingValue.serializer).serializer;
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                SentryLogcatAdapter.write("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((androidx.camera.view.PendingValue) pendingValue.serializer).serializer;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            focusProperties = new FocusProperties(clipData, 2);
        } else {
            getExitannotations getexitannotations = new getExitannotations();
            getexitannotations.serializer = clipData;
            getexitannotations.RatingCompat = 2;
            focusProperties = getexitannotations;
        }
        focusProperties.serializer(inputContentInfo3.getLinkUri());
        focusProperties.RemoteActionCompatParcelizer(bundle2);
        if (FocusPropertiesNode.write(appCompatDialogFragment, focusProperties.write()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
